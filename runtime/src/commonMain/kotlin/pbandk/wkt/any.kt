@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

interface Any : pbandk.Message {
    val typeUrl: String
    val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Any
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any>

    companion object : pbandk.Message.Companion<pbandk.wkt.Any> {
        operator fun invoke(
            typeUrl: String = "",
            value: pbandk.ByteArr = pbandk.ByteArr.empty,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Any = Any_Impl(
            typeUrl,
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Any() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Any.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Any> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Any, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_url",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "typeUrl",
                        value = pbandk.wkt.Any::typeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = pbandk.wkt.Any::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Any::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Any?.orDefault() = this ?: Any.defaultInstance

fun Any.copy(
    typeUrl: String = "",
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Any = (this as Any_Impl).copy(
    typeUrl,
    value,
    unknownFields
)

private data class Any_Impl(
    override val typeUrl: String,
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Any {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Any.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Any.protoMergeImpl(plus: pbandk.Message?): Any = (plus as? Any)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Any.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> typeUrl = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return Any(typeUrl, value, unknownFields)
}
