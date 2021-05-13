@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.gen.pb

interface Version : pbandk.Message {
    val major: Int?
    val minor: Int?
    val patch: Int?
    val suffix: String?

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.Version
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version>

    companion object : pbandk.Message.Companion<pbandk.gen.pb.Version> {
        operator fun invoke(
            major: Int? = null,
            minor: Int? = null,
            patch: Int? = null,
            suffix: String? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.Version = Version_Impl(
            major,
            minor,
            patch,
            suffix,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.gen.pb.Version() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.Version.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.Version> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.Version, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "major",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "major",
                        value = pbandk.gen.pb.Version::major
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "minor",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "minor",
                        value = pbandk.gen.pb.Version::minor
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "patch",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "patch",
                        value = pbandk.gen.pb.Version::patch
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.gen.pb.Version::suffix
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.gen.pb.Version::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface CodeGeneratorRequest : pbandk.Message {
    val fileToGenerate: List<String>
    val parameter: String?
    val protoFile: List<pbandk.wkt.FileDescriptorProto>
    val compilerVersion: pbandk.gen.pb.Version?

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorRequest
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest>

    companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorRequest> {
        operator fun invoke(
            fileToGenerate: List<String> = emptyList(),
            parameter: String? = null,
            protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
            compilerVersion: pbandk.gen.pb.Version? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.CodeGeneratorRequest = CodeGeneratorRequest_Impl(
            fileToGenerate,
            parameter,
            protoFile,
            compilerVersion,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.gen.pb.CodeGeneratorRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.CodeGeneratorRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorRequest, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file_to_generate",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "fileToGenerate",
                        value = pbandk.gen.pb.CodeGeneratorRequest::fileToGenerate
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parameter",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "parameter",
                        value = pbandk.gen.pb.CodeGeneratorRequest::parameter
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "compiler_version",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.Version.Companion),
                        jsonName = "compilerVersion",
                        value = pbandk.gen.pb.CodeGeneratorRequest::compilerVersion
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "proto_file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FileDescriptorProto>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FileDescriptorProto.Companion)),
                        jsonName = "protoFile",
                        value = pbandk.gen.pb.CodeGeneratorRequest::protoFile
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.gen.pb.CodeGeneratorRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface CodeGeneratorResponse : pbandk.Message {
    val error: String?
    val supportedFeatures: Long?
    val file: List<pbandk.gen.pb.CodeGeneratorResponse.File>

    override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse
    override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse>

    companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse> {
        operator fun invoke(
            error: String? = null,
            supportedFeatures: Long? = null,
            file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.gen.pb.CodeGeneratorResponse = CodeGeneratorResponse_Impl(
            error,
            supportedFeatures,
            file,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.gen.pb.CodeGeneratorResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.CodeGeneratorResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "error",
                        value = pbandk.gen.pb.CodeGeneratorResponse::error
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "supported_features",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "supportedFeatures",
                        value = pbandk.gen.pb.CodeGeneratorResponse::supportedFeatures
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "file",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.gen.pb.CodeGeneratorResponse.File>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.gen.pb.CodeGeneratorResponse.File.Companion)),
                        jsonName = "file",
                        value = pbandk.gen.pb.CodeGeneratorResponse::file
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.gen.pb.CodeGeneratorResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class Feature(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.gen.pb.CodeGeneratorResponse.Feature && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "CodeGeneratorResponse.Feature.${name ?: "UNRECOGNIZED"}(value=$value)"

        object NONE : Feature(0, "FEATURE_NONE")
        object PROTO3_OPTIONAL : Feature(1, "FEATURE_PROTO3_OPTIONAL")
        class UNRECOGNIZED(value: Int) : pbandk.gen.pb.CodeGeneratorResponse.Feature(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.gen.pb.CodeGeneratorResponse.Feature> {
            val values: List<pbandk.gen.pb.CodeGeneratorResponse.Feature> by lazy { listOf(NONE, PROTO3_OPTIONAL) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No Feature with name: $name")
        }
    }

    interface File : pbandk.Message {
        val name: String?
        val insertionPoint: String?
        val content: String?
        val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?

        override operator fun plus(other: pbandk.Message?): pbandk.gen.pb.CodeGeneratorResponse.File
        override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File>

        companion object : pbandk.Message.Companion<pbandk.gen.pb.CodeGeneratorResponse.File> {
            operator fun invoke(
                name: String? = null,
                insertionPoint: String? = null,
                content: String? = null,
                generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.gen.pb.CodeGeneratorResponse.File = CodeGeneratorResponse_File_Impl(
                name,
                insertionPoint,
                content,
                generatedCodeInfo,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.gen.pb.CodeGeneratorResponse.File() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.gen.pb.CodeGeneratorResponse.File.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.gen.pb.CodeGeneratorResponse.File, *>>(4)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "name",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "name",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::name
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "insertion_point",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "insertionPoint",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::insertionPoint
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "content",
                            number = 15,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                            jsonName = "content",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::content
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "generated_code_info",
                            number = 16,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.GeneratedCodeInfo.Companion),
                            jsonName = "generatedCodeInfo",
                            value = pbandk.gen.pb.CodeGeneratorResponse.File::generatedCodeInfo
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.gen.pb.CodeGeneratorResponse.File::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

fun Version?.orDefault() = this ?: Version.defaultInstance

fun Version.copy(
    major: Int? = null,
    minor: Int? = null,
    patch: Int? = null,
    suffix: String? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Version = (this as Version_Impl).copy(
    major,
    minor,
    patch,
    suffix,
    unknownFields
)

private data class Version_Impl(
    override val major: Int?,
    override val minor: Int?,
    override val patch: Int?,
    override val suffix: String?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Version {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Version.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Version.protoMergeImpl(plus: pbandk.Message?): Version = (plus as? Version)?.let {
    it.copy(
        major = plus.major ?: major,
        minor = plus.minor ?: minor,
        patch = plus.patch ?: patch,
        suffix = plus.suffix ?: suffix,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Version.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Version {
    var major: Int? = null
    var minor: Int? = null
    var patch: Int? = null
    var suffix: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> major = _fieldValue as Int
            2 -> minor = _fieldValue as Int
            3 -> patch = _fieldValue as Int
            4 -> suffix = _fieldValue as String
        }
    }
    return Version(major, minor, patch, suffix, unknownFields)
}

fun CodeGeneratorRequest?.orDefault() = this ?: CodeGeneratorRequest.defaultInstance

fun CodeGeneratorRequest.copy(
    fileToGenerate: List<String> = emptyList(),
    parameter: String? = null,
    protoFile: List<pbandk.wkt.FileDescriptorProto> = emptyList(),
    compilerVersion: pbandk.gen.pb.Version? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): CodeGeneratorRequest = (this as CodeGeneratorRequest_Impl).copy(
    fileToGenerate,
    parameter,
    protoFile,
    compilerVersion,
    unknownFields
)

private data class CodeGeneratorRequest_Impl(
    override val fileToGenerate: List<String>,
    override val parameter: String?,
    override val protoFile: List<pbandk.wkt.FileDescriptorProto>,
    override val compilerVersion: pbandk.gen.pb.Version?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : CodeGeneratorRequest {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = CodeGeneratorRequest.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun CodeGeneratorRequest.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorRequest = (plus as? CodeGeneratorRequest)?.let {
    it.copy(
        fileToGenerate = fileToGenerate + plus.fileToGenerate,
        parameter = plus.parameter ?: parameter,
        protoFile = protoFile + plus.protoFile,
        compilerVersion = compilerVersion?.plus(plus.compilerVersion) ?: plus.compilerVersion,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorRequest {
    var fileToGenerate: pbandk.ListWithSize.Builder<String>? = null
    var parameter: String? = null
    var protoFile: pbandk.ListWithSize.Builder<pbandk.wkt.FileDescriptorProto>? = null
    var compilerVersion: pbandk.gen.pb.Version? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fileToGenerate = (fileToGenerate ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            2 -> parameter = _fieldValue as String
            3 -> compilerVersion = _fieldValue as pbandk.gen.pb.Version
            15 -> protoFile = (protoFile ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FileDescriptorProto> }
        }
    }
    return CodeGeneratorRequest(pbandk.ListWithSize.Builder.fixed(fileToGenerate), parameter, pbandk.ListWithSize.Builder.fixed(protoFile), compilerVersion, unknownFields)
}

fun CodeGeneratorResponse?.orDefault() = this ?: CodeGeneratorResponse.defaultInstance

fun CodeGeneratorResponse.copy(
    error: String? = null,
    supportedFeatures: Long? = null,
    file: List<pbandk.gen.pb.CodeGeneratorResponse.File> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): CodeGeneratorResponse = (this as CodeGeneratorResponse_Impl).copy(
    error,
    supportedFeatures,
    file,
    unknownFields
)

private data class CodeGeneratorResponse_Impl(
    override val error: String?,
    override val supportedFeatures: Long?,
    override val file: List<pbandk.gen.pb.CodeGeneratorResponse.File>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : CodeGeneratorResponse {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = CodeGeneratorResponse.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun CodeGeneratorResponse.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse = (plus as? CodeGeneratorResponse)?.let {
    it.copy(
        error = plus.error ?: error,
        supportedFeatures = plus.supportedFeatures ?: supportedFeatures,
        file = file + plus.file,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse {
    var error: String? = null
    var supportedFeatures: Long? = null
    var file: pbandk.ListWithSize.Builder<pbandk.gen.pb.CodeGeneratorResponse.File>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = _fieldValue as String
            2 -> supportedFeatures = _fieldValue as Long
            15 -> file = (file ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.gen.pb.CodeGeneratorResponse.File> }
        }
    }
    return CodeGeneratorResponse(error, supportedFeatures, pbandk.ListWithSize.Builder.fixed(file), unknownFields)
}

fun CodeGeneratorResponse.File?.orDefault() = this ?: CodeGeneratorResponse.File.defaultInstance

fun CodeGeneratorResponse.File.copy(
    name: String? = null,
    insertionPoint: String? = null,
    content: String? = null,
    generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): CodeGeneratorResponse.File = (this as CodeGeneratorResponse_File_Impl).copy(
    name,
    insertionPoint,
    content,
    generatedCodeInfo,
    unknownFields
)

private data class CodeGeneratorResponse_File_Impl(
    override val name: String?,
    override val insertionPoint: String?,
    override val content: String?,
    override val generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : CodeGeneratorResponse.File {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = CodeGeneratorResponse.File.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun CodeGeneratorResponse.File.protoMergeImpl(plus: pbandk.Message?): CodeGeneratorResponse.File = (plus as? CodeGeneratorResponse.File)?.let {
    it.copy(
        name = plus.name ?: name,
        insertionPoint = plus.insertionPoint ?: insertionPoint,
        content = plus.content ?: content,
        generatedCodeInfo = generatedCodeInfo?.plus(plus.generatedCodeInfo) ?: plus.generatedCodeInfo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CodeGeneratorResponse.File.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CodeGeneratorResponse.File {
    var name: String? = null
    var insertionPoint: String? = null
    var content: String? = null
    var generatedCodeInfo: pbandk.wkt.GeneratedCodeInfo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> insertionPoint = _fieldValue as String
            15 -> content = _fieldValue as String
            16 -> generatedCodeInfo = _fieldValue as pbandk.wkt.GeneratedCodeInfo
        }
    }
    return CodeGeneratorResponse.File(name, insertionPoint, content, generatedCodeInfo, unknownFields)
}
