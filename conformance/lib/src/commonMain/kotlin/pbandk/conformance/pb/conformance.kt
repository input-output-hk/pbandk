@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.conformance.pb

sealed class WireFormat(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is pbandk.conformance.pb.WireFormat && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "WireFormat.${name ?: "UNRECOGNIZED"}(value=$value)"

    object UNSPECIFIED : WireFormat(0, "UNSPECIFIED")
    object PROTOBUF : WireFormat(1, "PROTOBUF")
    object JSON : WireFormat(2, "JSON")
    object JSPB : WireFormat(3, "JSPB")
    object TEXT_FORMAT : WireFormat(4, "TEXT_FORMAT")
    class UNRECOGNIZED(value: Int) : pbandk.conformance.pb.WireFormat(value)

    companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.WireFormat> {
        val values: List<pbandk.conformance.pb.WireFormat> by lazy { listOf(UNSPECIFIED, PROTOBUF, JSON, JSPB, TEXT_FORMAT) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No WireFormat with name: $name")
    }
}

sealed class TestCategory(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is pbandk.conformance.pb.TestCategory && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "TestCategory.${name ?: "UNRECOGNIZED"}(value=$value)"

    object UNSPECIFIED_TEST : TestCategory(0, "UNSPECIFIED_TEST")
    object BINARY_TEST : TestCategory(1, "BINARY_TEST")
    object JSON_TEST : TestCategory(2, "JSON_TEST")
    object JSON_IGNORE_UNKNOWN_PARSING_TEST : TestCategory(3, "JSON_IGNORE_UNKNOWN_PARSING_TEST")
    object JSPB_TEST : TestCategory(4, "JSPB_TEST")
    object TEXT_FORMAT_TEST : TestCategory(5, "TEXT_FORMAT_TEST")
    class UNRECOGNIZED(value: Int) : pbandk.conformance.pb.TestCategory(value)

    companion object : pbandk.Message.Enum.Companion<pbandk.conformance.pb.TestCategory> {
        val values: List<pbandk.conformance.pb.TestCategory> by lazy { listOf(UNSPECIFIED_TEST, BINARY_TEST, JSON_TEST, JSON_IGNORE_UNKNOWN_PARSING_TEST, JSPB_TEST, TEXT_FORMAT_TEST) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No TestCategory with name: $name")
    }
}

sealed interface FailureSet : pbandk.Message {
    val failure: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.FailureSet
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet>

    companion object : pbandk.Message.Companion<pbandk.conformance.pb.FailureSet> {
        operator fun invoke(
            failure: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.FailureSet = FailureSet_Impl(
            failure = failure,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.conformance.pb.FailureSet() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.conformance.pb.FailureSet.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.FailureSet> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.FailureSet, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "failure",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "failure",
                        value = pbandk.conformance.pb.FailureSet::failure
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.conformance.pb.FailureSet::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface ConformanceRequest : pbandk.Message {
    val requestedOutputFormat: pbandk.conformance.pb.WireFormat
    val messageType: String
    val testCategory: pbandk.conformance.pb.TestCategory
    val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?
    val printUnknownFields: Boolean
    val payload: Payload<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ConformanceRequest
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceRequest>

    sealed class Payload<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Payload<pbandk.ByteArr>(protobufPayload)
        class JsonPayload(jsonPayload: String = "") : Payload<String>(jsonPayload)
        class JspbPayload(jspbPayload: String = "") : Payload<String>(jspbPayload)
        class TextPayload(textPayload: String = "") : Payload<String>(textPayload)
    }

    val protobufPayload: pbandk.ByteArr?
    val jsonPayload: String?
    val jspbPayload: String?
    val textPayload: String?

    companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceRequest> {
        operator fun invoke(
            requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0),
            messageType: String = "",
            testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0),
            jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null,
            printUnknownFields: Boolean = false,
            payload: Payload<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.ConformanceRequest = ConformanceRequest_Impl(
            requestedOutputFormat = requestedOutputFormat,
            messageType = messageType,
            testCategory = testCategory,
            jspbEncodingOptions = jspbEncodingOptions,
            printUnknownFields = printUnknownFields,
            payload = payload,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.conformance.pb.ConformanceRequest() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.conformance.pb.ConformanceRequest.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceRequest> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceRequest, *>>(9)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "protobuf_payload",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::protobufPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_payload",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jsonPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::jsonPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "requested_output_format",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.WireFormat.Companion),
                        jsonName = "requestedOutputFormat",
                        value = pbandk.conformance.pb.ConformanceRequest::requestedOutputFormat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message_type",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "messageType",
                        value = pbandk.conformance.pb.ConformanceRequest::messageType
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "test_category",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.conformance.pb.TestCategory.Companion),
                        jsonName = "testCategory",
                        value = pbandk.conformance.pb.ConformanceRequest::testCategory
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_encoding_options",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.conformance.pb.JspbEncodingConfig.Companion),
                        jsonName = "jspbEncodingOptions",
                        value = pbandk.conformance.pb.ConformanceRequest::jspbEncodingOptions
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_payload",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jspbPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::jspbPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "text_payload",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "textPayload",
                        value = pbandk.conformance.pb.ConformanceRequest::textPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "print_unknown_fields",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "printUnknownFields",
                        value = pbandk.conformance.pb.ConformanceRequest::printUnknownFields
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.conformance.pb.ConformanceRequest::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface ConformanceResponse : pbandk.Message {
    val result: Result<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.ConformanceResponse
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse>

    sealed class Result<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class ParseError(parseError: String = "") : Result<String>(parseError)
        class SerializeError(serializeError: String = "") : Result<String>(serializeError)
        class RuntimeError(runtimeError: String = "") : Result<String>(runtimeError)
        class ProtobufPayload(protobufPayload: pbandk.ByteArr = pbandk.ByteArr.empty) : Result<pbandk.ByteArr>(protobufPayload)
        class JsonPayload(jsonPayload: String = "") : Result<String>(jsonPayload)
        class Skipped(skipped: String = "") : Result<String>(skipped)
        class JspbPayload(jspbPayload: String = "") : Result<String>(jspbPayload)
        class TextPayload(textPayload: String = "") : Result<String>(textPayload)
    }

    val parseError: String?
    val serializeError: String?
    val runtimeError: String?
    val protobufPayload: pbandk.ByteArr?
    val jsonPayload: String?
    val skipped: String?
    val jspbPayload: String?
    val textPayload: String?

    companion object : pbandk.Message.Companion<pbandk.conformance.pb.ConformanceResponse> {
        operator fun invoke(
            result: Result<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.ConformanceResponse = ConformanceResponse_Impl(
            result = result,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.conformance.pb.ConformanceResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.conformance.pb.ConformanceResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.ConformanceResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.ConformanceResponse, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "parse_error",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "parseError",
                        value = pbandk.conformance.pb.ConformanceResponse::parseError
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "runtime_error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "runtimeError",
                        value = pbandk.conformance.pb.ConformanceResponse::runtimeError
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "protobuf_payload",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "protobufPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::protobufPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "json_payload",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jsonPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::jsonPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skipped",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "skipped",
                        value = pbandk.conformance.pb.ConformanceResponse::skipped
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "serialize_error",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "serializeError",
                        value = pbandk.conformance.pb.ConformanceResponse::serializeError
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "jspb_payload",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "jspbPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::jspbPayload
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "text_payload",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "textPayload",
                        value = pbandk.conformance.pb.ConformanceResponse::textPayload
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.conformance.pb.ConformanceResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface JspbEncodingConfig : pbandk.Message {
    val useJspbArrayAnyFormat: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.conformance.pb.JspbEncodingConfig
    override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig>

    companion object : pbandk.Message.Companion<pbandk.conformance.pb.JspbEncodingConfig> {
        operator fun invoke(
            useJspbArrayAnyFormat: Boolean = false,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.conformance.pb.JspbEncodingConfig = JspbEncodingConfig_Impl(
            useJspbArrayAnyFormat = useJspbArrayAnyFormat,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.conformance.pb.JspbEncodingConfig() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.conformance.pb.JspbEncodingConfig.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.conformance.pb.JspbEncodingConfig> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.conformance.pb.JspbEncodingConfig, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "use_jspb_array_any_format",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "useJspbArrayAnyFormat",
                        value = pbandk.conformance.pb.JspbEncodingConfig::useJspbArrayAnyFormat
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.conformance.pb.JspbEncodingConfig::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun FailureSet?.orDefault() = this ?: FailureSet.defaultInstance

fun FailureSet.copy(
    failure: List<String> = this.failure,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): FailureSet = (this as FailureSet_Impl).copy(
    failure = failure,
    unknownFields = unknownFields
)

private data class FailureSet_Impl(
    override val failure: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FailureSet {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FailureSet.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FailureSet.protoMergeImpl(plus: pbandk.Message?): FailureSet = (plus as? FailureSet)?.let {
    it.copy(
        failure = failure + plus.failure,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FailureSet.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FailureSet {
    var failure: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> failure = (failure ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return FailureSet(pbandk.ListWithSize.Builder.fixed(failure), unknownFields)
}

fun ConformanceRequest?.orDefault() = this ?: ConformanceRequest.defaultInstance

fun ConformanceRequest.copy(
    requestedOutputFormat: pbandk.conformance.pb.WireFormat = this.requestedOutputFormat,
    messageType: String = this.messageType,
    testCategory: pbandk.conformance.pb.TestCategory = this.testCategory,
    jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = this.jspbEncodingOptions,
    printUnknownFields: Boolean = this.printUnknownFields,
    payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>? = this.payload,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): ConformanceRequest = (this as ConformanceRequest_Impl).copy(
    requestedOutputFormat = requestedOutputFormat,
    messageType = messageType,
    testCategory = testCategory,
    jspbEncodingOptions = jspbEncodingOptions,
    printUnknownFields = printUnknownFields,
    payload = payload,
    unknownFields = unknownFields
)

private data class ConformanceRequest_Impl(
    override val requestedOutputFormat: pbandk.conformance.pb.WireFormat,
    override val messageType: String,
    override val testCategory: pbandk.conformance.pb.TestCategory,
    override val jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig?,
    override val printUnknownFields: Boolean,
    override val payload: pbandk.conformance.pb.ConformanceRequest.Payload<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ConformanceRequest {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = ConformanceRequest.descriptor
    override val protoSize by lazy { super.protoSize }
    override val protobufPayload: pbandk.ByteArr?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.ProtobufPayload)?.value
    override val jsonPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JsonPayload)?.value
    override val jspbPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.JspbPayload)?.value
    override val textPayload: String?
        get() = (payload as? pbandk.conformance.pb.ConformanceRequest.Payload.TextPayload)?.value
}

private fun ConformanceRequest.protoMergeImpl(plus: pbandk.Message?): ConformanceRequest = (plus as? ConformanceRequest)?.let {
    it.copy(
        jspbEncodingOptions = jspbEncodingOptions?.plus(plus.jspbEncodingOptions) ?: plus.jspbEncodingOptions,
        payload = plus.payload ?: payload,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ConformanceRequest.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ConformanceRequest {
    var requestedOutputFormat: pbandk.conformance.pb.WireFormat = pbandk.conformance.pb.WireFormat.fromValue(0)
    var messageType = ""
    var testCategory: pbandk.conformance.pb.TestCategory = pbandk.conformance.pb.TestCategory.fromValue(0)
    var jspbEncodingOptions: pbandk.conformance.pb.JspbEncodingConfig? = null
    var printUnknownFields = false
    var payload: ConformanceRequest.Payload<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> payload = ConformanceRequest.Payload.ProtobufPayload(_fieldValue as pbandk.ByteArr)
            2 -> payload = ConformanceRequest.Payload.JsonPayload(_fieldValue as String)
            3 -> requestedOutputFormat = _fieldValue as pbandk.conformance.pb.WireFormat
            4 -> messageType = _fieldValue as String
            5 -> testCategory = _fieldValue as pbandk.conformance.pb.TestCategory
            6 -> jspbEncodingOptions = _fieldValue as pbandk.conformance.pb.JspbEncodingConfig
            7 -> payload = ConformanceRequest.Payload.JspbPayload(_fieldValue as String)
            8 -> payload = ConformanceRequest.Payload.TextPayload(_fieldValue as String)
            9 -> printUnknownFields = _fieldValue as Boolean
        }
    }
    return ConformanceRequest(requestedOutputFormat, messageType, testCategory, jspbEncodingOptions,
        printUnknownFields, payload, unknownFields)
}

fun ConformanceResponse?.orDefault() = this ?: ConformanceResponse.defaultInstance

fun ConformanceResponse.copy(
    result: pbandk.conformance.pb.ConformanceResponse.Result<*>? = this.result,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): ConformanceResponse = (this as ConformanceResponse_Impl).copy(
    result = result,
    unknownFields = unknownFields
)

private data class ConformanceResponse_Impl(
    override val result: pbandk.conformance.pb.ConformanceResponse.Result<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ConformanceResponse {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = ConformanceResponse.descriptor
    override val protoSize by lazy { super.protoSize }
    override val parseError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.ParseError)?.value
    override val serializeError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.SerializeError)?.value
    override val runtimeError: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.RuntimeError)?.value
    override val protobufPayload: pbandk.ByteArr?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.ProtobufPayload)?.value
    override val jsonPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.JsonPayload)?.value
    override val skipped: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.Skipped)?.value
    override val jspbPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.JspbPayload)?.value
    override val textPayload: String?
        get() = (result as? pbandk.conformance.pb.ConformanceResponse.Result.TextPayload)?.value
}

private fun ConformanceResponse.protoMergeImpl(plus: pbandk.Message?): ConformanceResponse = (plus as? ConformanceResponse)?.let {
    it.copy(
        result = plus.result ?: result,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ConformanceResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ConformanceResponse {
    var result: ConformanceResponse.Result<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> result = ConformanceResponse.Result.ParseError(_fieldValue as String)
            2 -> result = ConformanceResponse.Result.RuntimeError(_fieldValue as String)
            3 -> result = ConformanceResponse.Result.ProtobufPayload(_fieldValue as pbandk.ByteArr)
            4 -> result = ConformanceResponse.Result.JsonPayload(_fieldValue as String)
            5 -> result = ConformanceResponse.Result.Skipped(_fieldValue as String)
            6 -> result = ConformanceResponse.Result.SerializeError(_fieldValue as String)
            7 -> result = ConformanceResponse.Result.JspbPayload(_fieldValue as String)
            8 -> result = ConformanceResponse.Result.TextPayload(_fieldValue as String)
        }
    }
    return ConformanceResponse(result, unknownFields)
}

fun JspbEncodingConfig?.orDefault() = this ?: JspbEncodingConfig.defaultInstance

fun JspbEncodingConfig.copy(
    useJspbArrayAnyFormat: Boolean = this.useJspbArrayAnyFormat,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): JspbEncodingConfig = (this as JspbEncodingConfig_Impl).copy(
    useJspbArrayAnyFormat = useJspbArrayAnyFormat,
    unknownFields = unknownFields
)

private data class JspbEncodingConfig_Impl(
    override val useJspbArrayAnyFormat: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : JspbEncodingConfig {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = JspbEncodingConfig.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun JspbEncodingConfig.protoMergeImpl(plus: pbandk.Message?): JspbEncodingConfig = (plus as? JspbEncodingConfig)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun JspbEncodingConfig.Companion.decodeWithImpl(u: pbandk.MessageDecoder): JspbEncodingConfig {
    var useJspbArrayAnyFormat = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> useJspbArrayAnyFormat = _fieldValue as Boolean
        }
    }
    return JspbEncodingConfig(useJspbArrayAnyFormat, unknownFields)
}
