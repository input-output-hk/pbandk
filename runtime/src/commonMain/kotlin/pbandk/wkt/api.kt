@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed interface Api : pbandk.Message {
    val name: String
    val methods: List<pbandk.wkt.Method>
    val options: List<pbandk.wkt.Option>
    val version: String
    val sourceContext: pbandk.wkt.SourceContext?
    val mixins: List<pbandk.wkt.Mixin>
    val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Api
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api>

    companion object : pbandk.Message.Companion<pbandk.wkt.Api> {
        operator fun invoke(
            name: String = "",
            methods: List<pbandk.wkt.Method> = emptyList(),
            options: List<pbandk.wkt.Option> = emptyList(),
            version: String = "",
            sourceContext: pbandk.wkt.SourceContext? = null,
            mixins: List<pbandk.wkt.Mixin> = emptyList(),
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Api = Api_Impl(
            name,
            methods,
            options,
            version,
            sourceContext,
            mixins,
            syntax,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Api() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Api.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Api> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Api, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Api::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "methods",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Method>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Method.Companion)),
                        jsonName = "methods",
                        value = pbandk.wkt.Api::methods
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Api::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "version",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "version",
                        value = pbandk.wkt.Api::version
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "source_context",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.SourceContext.Companion),
                        jsonName = "sourceContext",
                        value = pbandk.wkt.Api::sourceContext
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "mixins",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Mixin>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Mixin.Companion)),
                        jsonName = "mixins",
                        value = pbandk.wkt.Api::mixins
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Api::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Api::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Method : pbandk.Message {
    val name: String
    val requestTypeUrl: String
    val requestStreaming: Boolean
    val responseTypeUrl: String
    val responseStreaming: Boolean
    val options: List<pbandk.wkt.Option>
    val syntax: pbandk.wkt.Syntax

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Method
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method>

    companion object : pbandk.Message.Companion<pbandk.wkt.Method> {
        operator fun invoke(
            name: String = "",
            requestTypeUrl: String = "",
            requestStreaming: Boolean = false,
            responseTypeUrl: String = "",
            responseStreaming: Boolean = false,
            options: List<pbandk.wkt.Option> = emptyList(),
            syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Method = Method_Impl(
            name,
            requestTypeUrl,
            requestStreaming,
            responseTypeUrl,
            responseStreaming,
            options,
            syntax,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Method() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Method.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Method> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Method, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Method::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_type_url",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "requestTypeUrl",
                        value = pbandk.wkt.Method::requestTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_streaming",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "requestStreaming",
                        value = pbandk.wkt.Method::requestStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_type_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "responseTypeUrl",
                        value = pbandk.wkt.Method::responseTypeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "response_streaming",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "responseStreaming",
                        value = pbandk.wkt.Method::responseStreaming
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Option>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Option.Companion)),
                        jsonName = "options",
                        value = pbandk.wkt.Method::options
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "syntax",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.Syntax.Companion),
                        jsonName = "syntax",
                        value = pbandk.wkt.Method::syntax
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Method::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Mixin : pbandk.Message {
    val name: String
    val root: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Mixin
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin>

    companion object : pbandk.Message.Companion<pbandk.wkt.Mixin> {
        operator fun invoke(
            name: String = "",
            root: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Mixin = Mixin_Impl(
            name,
            root,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Mixin() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Mixin.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Mixin> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Mixin, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = pbandk.wkt.Mixin::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "root",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "root",
                        value = pbandk.wkt.Mixin::root
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Mixin::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Api?.orDefault() = this ?: Api.defaultInstance

fun Api.copy(
    name: String = "",
    methods: List<pbandk.wkt.Method> = emptyList(),
    options: List<pbandk.wkt.Option> = emptyList(),
    version: String = "",
    sourceContext: pbandk.wkt.SourceContext? = null,
    mixins: List<pbandk.wkt.Mixin> = emptyList(),
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Api = (this as Api_Impl).copy(
    name,
    methods,
    options,
    version,
    sourceContext,
    mixins,
    syntax,
    unknownFields
)

private data class Api_Impl(
    override val name: String,
    override val methods: List<pbandk.wkt.Method>,
    override val options: List<pbandk.wkt.Option>,
    override val version: String,
    override val sourceContext: pbandk.wkt.SourceContext?,
    override val mixins: List<pbandk.wkt.Mixin>,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Api {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Api.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Api.protoMergeImpl(plus: pbandk.Message?): Api = (plus as? Api)?.let {
    it.copy(
        methods = methods + plus.methods,
        options = options + plus.options,
        sourceContext = sourceContext?.plus(plus.sourceContext) ?: plus.sourceContext,
        mixins = mixins + plus.mixins,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Api.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Api {
    var name = ""
    var methods: pbandk.ListWithSize.Builder<pbandk.wkt.Method>? = null
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var version = ""
    var sourceContext: pbandk.wkt.SourceContext? = null
    var mixins: pbandk.ListWithSize.Builder<pbandk.wkt.Mixin>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> methods = (methods ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Method> }
            3 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            4 -> version = _fieldValue as String
            5 -> sourceContext = _fieldValue as pbandk.wkt.SourceContext
            6 -> mixins = (mixins ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Mixin> }
            7 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }
    return Api(name, pbandk.ListWithSize.Builder.fixed(methods), pbandk.ListWithSize.Builder.fixed(options), version,
        sourceContext, pbandk.ListWithSize.Builder.fixed(mixins), syntax, unknownFields)
}

fun Method?.orDefault() = this ?: Method.defaultInstance

fun Method.copy(
    name: String = "",
    requestTypeUrl: String = "",
    requestStreaming: Boolean = false,
    responseTypeUrl: String = "",
    responseStreaming: Boolean = false,
    options: List<pbandk.wkt.Option> = emptyList(),
    syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Method = (this as Method_Impl).copy(
    name,
    requestTypeUrl,
    requestStreaming,
    responseTypeUrl,
    responseStreaming,
    options,
    syntax,
    unknownFields
)

private data class Method_Impl(
    override val name: String,
    override val requestTypeUrl: String,
    override val requestStreaming: Boolean,
    override val responseTypeUrl: String,
    override val responseStreaming: Boolean,
    override val options: List<pbandk.wkt.Option>,
    override val syntax: pbandk.wkt.Syntax,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Method {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Method.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Method.protoMergeImpl(plus: pbandk.Message?): Method = (plus as? Method)?.let {
    it.copy(
        options = options + plus.options,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Method.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Method {
    var name = ""
    var requestTypeUrl = ""
    var requestStreaming = false
    var responseTypeUrl = ""
    var responseStreaming = false
    var options: pbandk.ListWithSize.Builder<pbandk.wkt.Option>? = null
    var syntax: pbandk.wkt.Syntax = pbandk.wkt.Syntax.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> requestTypeUrl = _fieldValue as String
            3 -> requestStreaming = _fieldValue as Boolean
            4 -> responseTypeUrl = _fieldValue as String
            5 -> responseStreaming = _fieldValue as Boolean
            6 -> options = (options ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Option> }
            7 -> syntax = _fieldValue as pbandk.wkt.Syntax
        }
    }
    return Method(name, requestTypeUrl, requestStreaming, responseTypeUrl,
        responseStreaming, pbandk.ListWithSize.Builder.fixed(options), syntax, unknownFields)
}

fun Mixin?.orDefault() = this ?: Mixin.defaultInstance

fun Mixin.copy(
    name: String = "",
    root: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Mixin = (this as Mixin_Impl).copy(
    name,
    root,
    unknownFields
)

private data class Mixin_Impl(
    override val name: String,
    override val root: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Mixin {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Mixin.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Mixin.protoMergeImpl(plus: pbandk.Message?): Mixin = (plus as? Mixin)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Mixin.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Mixin {
    var name = ""
    var root = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> name = _fieldValue as String
            2 -> root = _fieldValue as String
        }
    }
    return Mixin(name, root, unknownFields)
}
