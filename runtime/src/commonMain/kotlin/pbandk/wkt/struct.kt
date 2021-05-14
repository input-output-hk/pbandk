@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed class NullValue(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is pbandk.wkt.NullValue && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "NullValue.${name ?: "UNRECOGNIZED"}(value=$value)"

    object NULL_VALUE : NullValue(0, "NULL_VALUE")
    class UNRECOGNIZED(value: Int) : pbandk.wkt.NullValue(value)

    companion object : pbandk.Message.Enum.Companion<pbandk.wkt.NullValue> {
        val values: List<pbandk.wkt.NullValue> by lazy { listOf(NULL_VALUE) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NullValue with name: $name")
    }
}

sealed interface Struct : pbandk.Message {
    val fields: Map<String, pbandk.wkt.Value?>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct>

    companion object : pbandk.Message.Companion<pbandk.wkt.Struct> {
        operator fun invoke(
            fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Struct = Struct_Impl(
            fields,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Struct() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Struct.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Struct, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fields",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.wkt.Value?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "fields",
                        value = pbandk.wkt.Struct::fields
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Struct::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed interface FieldsEntry : pbandk.Message, Map.Entry<String, pbandk.wkt.Value?> {
        override val key: String
        override val value: pbandk.wkt.Value?

        override operator fun plus(other: pbandk.Message?): pbandk.wkt.Struct.FieldsEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry>

        companion object : pbandk.Message.Companion<pbandk.wkt.Struct.FieldsEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.wkt.Value? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.wkt.Struct.FieldsEntry = Struct_FieldsEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.wkt.Struct.FieldsEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Struct.FieldsEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Struct.FieldsEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Struct.FieldsEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.wkt.Struct.FieldsEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                            jsonName = "value",
                            value = pbandk.wkt.Struct.FieldsEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.wkt.Struct.FieldsEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

sealed interface Value : pbandk.Message {
    val kind: Kind<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value>

    sealed class Kind<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class NullValue(nullValue: pbandk.wkt.NullValue = pbandk.wkt.NullValue.fromValue(0)) : Kind<pbandk.wkt.NullValue>(nullValue)
        class NumberValue(numberValue: Double = 0.0) : Kind<Double>(numberValue)
        class StringValue(stringValue: String = "") : Kind<String>(stringValue)
        class BoolValue(boolValue: Boolean = false) : Kind<Boolean>(boolValue)
        class StructValue(structValue: pbandk.wkt.Struct) : Kind<pbandk.wkt.Struct>(structValue)
        class ListValue(listValue: pbandk.wkt.ListValue) : Kind<pbandk.wkt.ListValue>(listValue)
    }

    val nullValue: pbandk.wkt.NullValue?
    val numberValue: Double?
    val stringValue: String?
    val boolValue: Boolean?
    val structValue: pbandk.wkt.Struct?
    val listValue: pbandk.wkt.ListValue?

    companion object : pbandk.Message.Companion<pbandk.wkt.Value> {
        operator fun invoke(
            kind: Kind<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Value = Value_Impl(
            kind,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Value, *>>(6)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "null_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.wkt.NullValue.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "nullValue",
                        value = pbandk.wkt.Value::nullValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "number_value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        oneofMember = true,
                        jsonName = "numberValue",
                        value = pbandk.wkt.Value::numberValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "stringValue",
                        value = pbandk.wkt.Value::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bool_value",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "boolValue",
                        value = pbandk.wkt.Value::boolValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "struct_value",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        oneofMember = true,
                        jsonName = "structValue",
                        value = pbandk.wkt.Value::structValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "list_value",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ListValue.Companion),
                        oneofMember = true,
                        jsonName = "listValue",
                        value = pbandk.wkt.Value::listValue
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface ListValue : pbandk.Message {
    val values: List<pbandk.wkt.Value>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.ListValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue>

    companion object : pbandk.Message.Companion<pbandk.wkt.ListValue> {
        operator fun invoke(
            values: List<pbandk.wkt.Value> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.ListValue = ListValue_Impl(
            values,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.ListValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.ListValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.ListValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.ListValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "values",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "values",
                        value = pbandk.wkt.ListValue::values
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.ListValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Struct?.orDefault() = this ?: Struct.defaultInstance

fun Struct.copy(
    fields: Map<String, pbandk.wkt.Value?> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Struct = (this as Struct_Impl).copy(
    fields,
    unknownFields
)

private data class Struct_Impl(
    override val fields: Map<String, pbandk.wkt.Value?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Struct {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Struct.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Struct.protoMergeImpl(plus: pbandk.Message?): Struct = (plus as? Struct)?.let {
    it.copy(
        fields = fields + plus.fields,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct {
    var fields: pbandk.MessageMap.Builder<String, pbandk.wkt.Value?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> fields = (fields ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.wkt.Value?>> }
        }
    }
    return Struct(pbandk.MessageMap.Builder.fixed(fields), unknownFields)
}

fun Struct.FieldsEntry?.orDefault() = this ?: Struct.FieldsEntry.defaultInstance

fun Struct.FieldsEntry.copy(
    key: String = "",
    value: pbandk.wkt.Value? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Struct.FieldsEntry = (this as Struct_FieldsEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class Struct_FieldsEntry_Impl(
    override val key: String,
    override val value: pbandk.wkt.Value?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Struct.FieldsEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Struct.FieldsEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Struct.FieldsEntry.protoMergeImpl(plus: pbandk.Message?): Struct.FieldsEntry = (plus as? Struct.FieldsEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Struct.FieldsEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Struct.FieldsEntry {
    var key = ""
    var value: pbandk.wkt.Value? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.wkt.Value
        }
    }
    return Struct.FieldsEntry(key, value, unknownFields)
}

fun Value?.orDefault() = this ?: Value.defaultInstance

fun Value.copy(
    kind: pbandk.wkt.Value.Kind<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Value = (this as Value_Impl).copy(
    kind,
    unknownFields
)

private data class Value_Impl(
    override val kind: pbandk.wkt.Value.Kind<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Value {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Value.descriptor
    override val protoSize by lazy { super.protoSize }
    override val nullValue: pbandk.wkt.NullValue?
        get() = (kind as? pbandk.wkt.Value.Kind.NullValue)?.value
    override val numberValue: Double?
        get() = (kind as? pbandk.wkt.Value.Kind.NumberValue)?.value
    override val stringValue: String?
        get() = (kind as? pbandk.wkt.Value.Kind.StringValue)?.value
    override val boolValue: Boolean?
        get() = (kind as? pbandk.wkt.Value.Kind.BoolValue)?.value
    override val structValue: pbandk.wkt.Struct?
        get() = (kind as? pbandk.wkt.Value.Kind.StructValue)?.value
    override val listValue: pbandk.wkt.ListValue?
        get() = (kind as? pbandk.wkt.Value.Kind.ListValue)?.value
}

private fun Value.protoMergeImpl(plus: pbandk.Message?): Value = (plus as? Value)?.let {
    it.copy(
        kind = when {
            kind is Value.Kind.StructValue && plus.kind is Value.Kind.StructValue ->
                Value.Kind.StructValue((kind as Value.Kind.StructValue).value + (plus.kind as Value.Kind.StructValue).value)
            kind is Value.Kind.ListValue && plus.kind is Value.Kind.ListValue ->
                Value.Kind.ListValue((kind as Value.Kind.ListValue).value + (plus.kind as Value.Kind.ListValue).value)
            else ->
                plus.kind ?: kind
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Value {
    var kind: Value.Kind<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> kind = Value.Kind.NullValue(_fieldValue as pbandk.wkt.NullValue)
            2 -> kind = Value.Kind.NumberValue(_fieldValue as Double)
            3 -> kind = Value.Kind.StringValue(_fieldValue as String)
            4 -> kind = Value.Kind.BoolValue(_fieldValue as Boolean)
            5 -> kind = Value.Kind.StructValue(_fieldValue as pbandk.wkt.Struct)
            6 -> kind = Value.Kind.ListValue(_fieldValue as pbandk.wkt.ListValue)
        }
    }
    return Value(kind, unknownFields)
}

fun ListValue?.orDefault() = this ?: ListValue.defaultInstance

fun ListValue.copy(
    values: List<pbandk.wkt.Value> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): ListValue = (this as ListValue_Impl).copy(
    values,
    unknownFields
)

private data class ListValue_Impl(
    override val values: List<pbandk.wkt.Value>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ListValue {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = ListValue.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun ListValue.protoMergeImpl(plus: pbandk.Message?): ListValue = (plus as? ListValue)?.let {
    it.copy(
        values = values + plus.values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ListValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ListValue {
    var values: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> values = (values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
        }
    }
    return ListValue(pbandk.ListWithSize.Builder.fixed(values), unknownFields)
}
