package io.iohk.atala.prism.generator

import pbandk.gen.ServiceGenerator
import java.nio.file.Paths

class Generator : ServiceGenerator {
    private fun generateKotlinCoroutineService(service: ServiceGenerator.Service): ServiceGenerator.Result {
        var interfaceMethods = emptyList<String>()
        var clientMethods = emptyList<String>()
        service.methods.forEach { method ->
            // TODO lookup in the service.kotlinTypeMappings has an issue:
            // 1. We have vault_api.proto files
            //    which depends on prism model proto files (HealthCheckRequest and HealthCheckResponse).
            // 2. We have HealthCheck rpc method
            //    where I explicitly specify package of HealthCheckRequest and HealthCheckResponse
            //    rpc HealthCheck(io.iohk.atala.prism.protos.HealthCheckRequest) returns (io.iohk.atala.prism.protos.HealthCheckResponse) {}
            // 3. method.inputType = .io.iohk.atala.prism.protos.HealthCheckRequest looking up in the service.kotlinTypeMappings returns
            //     reqType = io.iohk.atala.prism.vault.protos.HealthCheckRequest
            // I guess it's a bug, a workaround for it is to use the same kotlin_package=io.iohk.atala.prism.protos
            // in the vault during code generation
            val reqType = service.kotlinTypeMappings[method.inputType!!]!!
            val respType = service.kotlinTypeMappings[method.outputType!!]!!
            val serviceNameLit = "\"${service.file.packageName}.${service.name}\""
            val methodNameLit = "\"${method.name}\""
            if (method.outputStreaming) {
                interfaceMethods += "public fun ${method.name}(req: $reqType): Flow<$respType>"
                interfaceMethods += "public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): Flow<$respType>"
                clientMethods += """
                            override fun ${method.name}(req: $reqType): Flow<$respType> {
                                return client.stream(req, $reqType.Companion, $respType.Companion, $serviceNameLit, $methodNameLit)
                            }
                            override fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): Flow<$respType> {
                                return client.streamAuth(req, $reqType.Companion, $respType.Companion, $serviceNameLit, $methodNameLit, metadata)
                            }
                """
            } else {
                interfaceMethods += "public suspend fun ${method.name}(req: $reqType): $respType"
                interfaceMethods += "public suspend fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): $respType"
                clientMethods += """
                            override suspend fun ${method.name}(req: $reqType): $respType {
                                return client.call(req, $reqType.Companion, $respType.Companion, $serviceNameLit, $methodNameLit)
                            }
                            override suspend fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): $respType {
                                return client.callAuth(req, $reqType.Companion, $respType.Companion, $serviceNameLit, $methodNameLit, metadata)
                            }
                """
            }
        }
        return ServiceGenerator.Result(
            otherFilePath = Paths.get(service.filePath).resolveSibling(service.name + "Coroutine.kt").toString(),
            code =
            """
                    package ${service.file.kotlinPackageName}
                    
                    import io.iohk.atala.prism.protos.PrismMetadata
                    import io.ktor.utils.io.core.Closeable
                    import kotlinx.coroutines.flow.Flow
                    
                    @io.iohk.atala.prism.common.PrismSdkInternal
                    public interface ${service.name}Coroutine : Closeable {
                        ${interfaceMethods.joinToString("\n                        ")}
                        @io.iohk.atala.prism.common.PrismSdkInternal
                        public class Client(public val client: io.iohk.atala.prism.protos.GrpcClient) : ${service.name}Coroutine {
                            ${clientMethods.joinToString("")}
                            public override fun close() {
                                client.close()
                            }
                        }
                    }
            """.trimIndent()
        )
    }

    private fun generateKotlinJsPromiseService(service: ServiceGenerator.Service): ServiceGenerator.Result {
        var clientMethodsJs = emptyList<String>()
        service.methods.forEach { method ->
            val reqType = service.kotlinTypeMappings[method.inputType!!]!!
            val respType = service.kotlinTypeMappings[method.outputType!!]!!
            if (method.outputStreaming) {
                clientMethodsJs += """
                        public fun ${method.name}(req: $reqType): Promise<Array<$respType>> =
                            GlobalScope.promise { internalService.${method.name}(req).toList().toTypedArray() }
                        public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): Promise<Array<$respType>> =
                            GlobalScope.promise { internalService.${method.name}Auth(req, metadata).toList().toTypedArray() }
                """
            } else {
                clientMethodsJs += """
                        public fun ${method.name}(req: $reqType): Promise<$respType> =
                            GlobalScope.promise { internalService.${method.name}(req) }
                        public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): Promise<$respType> =
                            GlobalScope.promise { internalService.${method.name}Auth(req, metadata) }
                """
            }
        }
        return ServiceGenerator.Result(
            otherFilePath = "../../jsMain/kotlin/" + Paths.get(service.filePath).resolveSibling(service.name + "JS.kt").toString(),
            code =
            """
                    package ${service.file.kotlinPackageName}
                    
                    import io.iohk.atala.prism.protos.GrpcClient
                    import io.iohk.atala.prism.protos.GrpcOptions
                    import io.iohk.atala.prism.protos.PrismMetadata
                    import kotlinx.coroutines.GlobalScope
                    import kotlinx.coroutines.flow.toList
                    import kotlinx.coroutines.promise
                    import kotlin.js.Promise
                    import kotlin.js.JsExport
                    import kotlin.js.JsName
                    
                    @JsExport
                    @io.iohk.atala.prism.common.PrismSdkInternal
                    public class ${service.name}Promise(options: GrpcOptions) {
                        private val grpcClient = GrpcClient(options)
                        public val internalService: ${service.name}Coroutine = ${service.name}Coroutine.Client(grpcClient)
                        ${clientMethodsJs.joinToString("")}
                    }
            """.trimIndent()
        )
    }

    private fun generateJavaSyncPromiseService(
        service: ServiceGenerator.Service,
        javaPackageName: String,
        javaServiceRootDirectory: String
    ): ServiceGenerator.Result {
        var clientMethods = emptyList<String>()
        service.methods.forEach { method ->
            val reqType = service.kotlinTypeMappings[method.inputType!!]!!
            val respType = service.kotlinTypeMappings[method.outputType!!]!!
            if (method.outputStreaming) {
                clientMethods += """
                        public fun ${method.name}(req: $reqType): List<$respType> =
                            runBlocking { internalService.${method.name}(req).toList() }
                        public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): List<$respType> =
                            runBlocking { internalService.${method.name}Auth(req, metadata).toList() }
                """
            } else {
                clientMethods += """
                        public fun ${method.name}(req: $reqType): $respType =
                            runBlocking { internalService.${method.name}(req) }
                        public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): $respType =
                            runBlocking { internalService.${method.name}Auth(req, metadata) }
                """
            }
        }
        val filePath = Paths.get(javaServiceRootDirectory).resolveSibling("sync").resolve(service.name + "Sync.kt")
        return ServiceGenerator.Result(
            otherFilePath = "../../commonJvmAndroidMain/kotlin/$filePath",
            code =
            """
                    package $javaPackageName.sync
                    
                    import $javaPackageName.${service.name}Coroutine
                    import io.iohk.atala.prism.protos.GrpcClient
                    import io.iohk.atala.prism.protos.GrpcOptions
                    import io.iohk.atala.prism.protos.PrismMetadata
                    import io.ktor.utils.io.core.Closeable
                    import kotlinx.coroutines.flow.toList
                    import kotlinx.coroutines.runBlocking

                    @io.iohk.atala.prism.common.PrismSdkInternal
                    public class ${service.name}Sync(options: GrpcOptions) : Closeable {
                        private val grpcClient = GrpcClient(options)
                        private val internalService = ${service.name}Coroutine.Client(grpcClient)
                        ${clientMethods.joinToString("")}
                        public override fun close() {
                            grpcClient.close()
                        }
                    }
            """.trimIndent()
        )
    }

    private fun generateJavaAsyncPromiseService(
        service: ServiceGenerator.Service,
        javaPackageName: String,
        javaServiceRootDirectory: String
    ): ServiceGenerator.Result {
        var clientMethods = emptyList<String>()
        service.methods.forEach { method ->
            val reqType = service.kotlinTypeMappings[method.inputType!!]!!
            val respType = service.kotlinTypeMappings[method.outputType!!]!!
            if (method.outputStreaming) {
                clientMethods += """
                        public fun ${method.name}(req: $reqType, observer: StreamObserver<$respType>): CompletableFuture<Unit> =
                            GlobalScope.future { internalService.${method.name}(req).collect { observer.onNext(it) } }
                        public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata, observer: StreamObserver<$respType>): CompletableFuture<Unit> =
                            GlobalScope.future { internalService.${method.name}Auth(req, metadata).collect { observer.onNext(it) } }
                """
            } else {
                clientMethods += """
                        public fun ${method.name}(req: $reqType): CompletableFuture<$respType> =
                            GlobalScope.future { internalService.${method.name}(req) }
                        public fun ${method.name}Auth(req: $reqType, metadata: PrismMetadata): CompletableFuture<$respType> =
                            GlobalScope.future { internalService.${method.name}Auth(req, metadata) }
                """
            }
        }
        val filePath = Paths.get(javaServiceRootDirectory).resolveSibling("async").resolve(service.name + "Async.kt")
        return ServiceGenerator.Result(
            otherFilePath = "../../commonJvmAndroidMain/kotlin/$filePath",
            code =
            """
                    package $javaPackageName.async
                    
                    import io.grpc.stub.StreamObserver
                    import $javaPackageName.${service.name}Coroutine
                    import io.iohk.atala.prism.protos.GrpcClient
                    import io.iohk.atala.prism.protos.GrpcOptions
                    import io.iohk.atala.prism.protos.PrismMetadata
                    import io.ktor.utils.io.core.Closeable
                    import kotlinx.coroutines.GlobalScope
                    import kotlinx.coroutines.flow.collect
                    import kotlinx.coroutines.future.future
                    import java.util.concurrent.CompletableFuture
                    
                    @io.iohk.atala.prism.common.PrismSdkInternal
                    public class ${service.name}Async(options: GrpcOptions) : Closeable {
                        private val grpcClient = GrpcClient(options)
                        private val internalService = ${service.name}Coroutine.Client(grpcClient)
                        ${clientMethods.joinToString("")}
                        public override fun close() {
                            grpcClient.close()
                        }
                    }
            """.trimIndent()
        )
    }

    override fun generate(service: ServiceGenerator.Service): List<ServiceGenerator.Result> {
        service.debug { "Generating code for service ${service.name}" }
        // Renames `io.iohk.atala.prism.protos` to `io.iohk.atala.prism.java.protos` to signify that this
        // API is especially useful for Java users.
        val javaPackageName = service.file.kotlinPackageName!!.replace("kotlin", "java")
        val javaServiceRootDirectory = service.filePath.replace("kotlin", "java")
        return listOf(
            generateKotlinCoroutineService(service),
            generateKotlinJsPromiseService(service),
            generateJavaSyncPromiseService(service, javaPackageName, javaServiceRootDirectory),
            generateJavaAsyncPromiseService(service, javaPackageName, javaServiceRootDirectory)
        )
    }
}
