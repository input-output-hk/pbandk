@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

interface Value : pbandk.Message {
    val value: Value<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value>

    sealed class Value<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class StringValue(stringValue: String = "") : Value<String>(stringValue)
        class BooleanValue(booleanValue: Boolean = false) : Value<Boolean>(booleanValue)
        class IntegerValue(integerValue: Int = 0) : Value<Int>(integerValue)
    }

    val stringValue: String?
    val booleanValue: Boolean?
    val integerValue: Int?

    companion object : pbandk.Message.Companion<pbandk.testpb.Value> {
        operator fun invoke(
            value: Value<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Value = Value_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Value, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "stringValue",
                        value = pbandk.testpb.Value::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "boolean_value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "booleanValue",
                        value = pbandk.testpb.Value::booleanValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "integer_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "integerValue",
                        value = pbandk.testpb.Value::integerValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Value?.orDefault() = this ?: Value.defaultInstance

fun Value.copy(
    value: pbandk.testpb.Value.Value<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Value = (this as Value_Impl).copy(
    value,
    unknownFields
)

private data class Value_Impl(
    override val value: pbandk.testpb.Value.Value<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Value {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Value.descriptor
    override val protoSize by lazy { super.protoSize }
    override val stringValue: String?
        get() = (value as? pbandk.testpb.Value.Value.StringValue)?.value
    override val booleanValue: Boolean?
        get() = (value as? pbandk.testpb.Value.Value.BooleanValue)?.value
    override val integerValue: Int?
        get() = (value as? pbandk.testpb.Value.Value.IntegerValue)?.value
}

private fun Value.protoMergeImpl(plus: pbandk.Message?): Value = (plus as? Value)?.let {
    it.copy(
        value = plus.value ?: value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Value {
    var value: Value.Value<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = Value.Value.StringValue(_fieldValue as String)
            2 -> value = Value.Value.BooleanValue(_fieldValue as Boolean)
            3 -> value = Value.Value.IntegerValue(_fieldValue as Int)
        }
    }
    return Value(value, unknownFields)
}
