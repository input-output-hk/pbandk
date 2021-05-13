@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

interface DoubleValue : pbandk.Message {
    val value: Double

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.DoubleValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue>

    companion object : pbandk.Message.Companion<pbandk.wkt.DoubleValue> {
        operator fun invoke(
            value: Double = 0.0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.DoubleValue = DoubleValue_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.DoubleValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.DoubleValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.DoubleValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.DoubleValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "value",
                        value = pbandk.wkt.DoubleValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.DoubleValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface FloatValue : pbandk.Message {
    val value: Float

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FloatValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue>

    companion object : pbandk.Message.Companion<pbandk.wkt.FloatValue> {
        operator fun invoke(
            value: Float = 0.0F,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.FloatValue = FloatValue_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.FloatValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FloatValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FloatValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FloatValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "value",
                        value = pbandk.wkt.FloatValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FloatValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface Int64Value : pbandk.Message {
    val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value>

    companion object : pbandk.Message.Companion<pbandk.wkt.Int64Value> {
        operator fun invoke(
            value: Long = 0L,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Int64Value = Int64Value_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Int64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Int64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int64Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Int64Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "value",
                        value = pbandk.wkt.Int64Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Int64Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface UInt64Value : pbandk.Message {
    val value: Long

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt64Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value>

    companion object : pbandk.Message.Companion<pbandk.wkt.UInt64Value> {
        operator fun invoke(
            value: Long = 0L,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.UInt64Value = UInt64Value_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.UInt64Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.UInt64Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt64Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UInt64Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "value",
                        value = pbandk.wkt.UInt64Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.UInt64Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface Int32Value : pbandk.Message {
    val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Int32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value>

    companion object : pbandk.Message.Companion<pbandk.wkt.Int32Value> {
        operator fun invoke(
            value: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Int32Value = Int32Value_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Int32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Int32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Int32Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Int32Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "value",
                        value = pbandk.wkt.Int32Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Int32Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface UInt32Value : pbandk.Message {
    val value: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.UInt32Value
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value>

    companion object : pbandk.Message.Companion<pbandk.wkt.UInt32Value> {
        operator fun invoke(
            value: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.UInt32Value = UInt32Value_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.UInt32Value() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.UInt32Value.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.UInt32Value> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.UInt32Value, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "value",
                        value = pbandk.wkt.UInt32Value::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.UInt32Value::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface BoolValue : pbandk.Message {
    val value: Boolean

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BoolValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue>

    companion object : pbandk.Message.Companion<pbandk.wkt.BoolValue> {
        operator fun invoke(
            value: Boolean = false,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.BoolValue = BoolValue_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.BoolValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.BoolValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BoolValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.BoolValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "value",
                        value = pbandk.wkt.BoolValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.BoolValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface StringValue : pbandk.Message {
    val value: String

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.StringValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue>

    companion object : pbandk.Message.Companion<pbandk.wkt.StringValue> {
        operator fun invoke(
            value: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.StringValue = StringValue_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.StringValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.StringValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.StringValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.StringValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = pbandk.wkt.StringValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.StringValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

interface BytesValue : pbandk.Message {
    val value: pbandk.ByteArr

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.BytesValue
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue>

    companion object : pbandk.Message.Companion<pbandk.wkt.BytesValue> {
        operator fun invoke(
            value: pbandk.ByteArr = pbandk.ByteArr.empty,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.BytesValue = BytesValue_Impl(
            value,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.BytesValue() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.BytesValue.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.BytesValue> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.BytesValue, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = pbandk.wkt.BytesValue::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.BytesValue::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun DoubleValue?.orDefault() = this ?: DoubleValue.defaultInstance

fun DoubleValue.copy(
    value: Double = 0.0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): DoubleValue = (this as DoubleValue_Impl).copy(
    value,
    unknownFields
)

private data class DoubleValue_Impl(
    override val value: Double,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : DoubleValue {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = DoubleValue.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun DoubleValue.protoMergeImpl(plus: pbandk.Message?): DoubleValue = (plus as? DoubleValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DoubleValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DoubleValue {
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Double
        }
    }
    return DoubleValue(value, unknownFields)
}

fun FloatValue?.orDefault() = this ?: FloatValue.defaultInstance

fun FloatValue.copy(
    value: Float = 0.0F,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): FloatValue = (this as FloatValue_Impl).copy(
    value,
    unknownFields
)

private data class FloatValue_Impl(
    override val value: Float,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FloatValue {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FloatValue.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FloatValue.protoMergeImpl(plus: pbandk.Message?): FloatValue = (plus as? FloatValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FloatValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FloatValue {
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Float
        }
    }
    return FloatValue(value, unknownFields)
}

fun Int64Value?.orDefault() = this ?: Int64Value.defaultInstance

fun Int64Value.copy(
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Int64Value = (this as Int64Value_Impl).copy(
    value,
    unknownFields
)

private data class Int64Value_Impl(
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int64Value {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Int64Value.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Int64Value.protoMergeImpl(plus: pbandk.Message?): Int64Value = (plus as? Int64Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Int64Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return Int64Value(value, unknownFields)
}

fun UInt64Value?.orDefault() = this ?: UInt64Value.defaultInstance

fun UInt64Value.copy(
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): UInt64Value = (this as UInt64Value_Impl).copy(
    value,
    unknownFields
)

private data class UInt64Value_Impl(
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt64Value {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = UInt64Value.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun UInt64Value.protoMergeImpl(plus: pbandk.Message?): UInt64Value = (plus as? UInt64Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt64Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt64Value {
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Long
        }
    }
    return UInt64Value(value, unknownFields)
}

fun Int32Value?.orDefault() = this ?: Int32Value.defaultInstance

fun Int32Value.copy(
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Int32Value = (this as Int32Value_Impl).copy(
    value,
    unknownFields
)

private data class Int32Value_Impl(
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int32Value {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Int32Value.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Int32Value.protoMergeImpl(plus: pbandk.Message?): Int32Value = (plus as? Int32Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Int32Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return Int32Value(value, unknownFields)
}

fun UInt32Value?.orDefault() = this ?: UInt32Value.defaultInstance

fun UInt32Value.copy(
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): UInt32Value = (this as UInt32Value_Impl).copy(
    value,
    unknownFields
)

private data class UInt32Value_Impl(
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt32Value {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = UInt32Value.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun UInt32Value.protoMergeImpl(plus: pbandk.Message?): UInt32Value = (plus as? UInt32Value)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt32Value.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt32Value {
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Int
        }
    }
    return UInt32Value(value, unknownFields)
}

fun BoolValue?.orDefault() = this ?: BoolValue.defaultInstance

fun BoolValue.copy(
    value: Boolean = false,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): BoolValue = (this as BoolValue_Impl).copy(
    value,
    unknownFields
)

private data class BoolValue_Impl(
    override val value: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BoolValue {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = BoolValue.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun BoolValue.protoMergeImpl(plus: pbandk.Message?): BoolValue = (plus as? BoolValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun BoolValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BoolValue {
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as Boolean
        }
    }
    return BoolValue(value, unknownFields)
}

fun StringValue?.orDefault() = this ?: StringValue.defaultInstance

fun StringValue.copy(
    value: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): StringValue = (this as StringValue_Impl).copy(
    value,
    unknownFields
)

private data class StringValue_Impl(
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : StringValue {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = StringValue.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun StringValue.protoMergeImpl(plus: pbandk.Message?): StringValue = (plus as? StringValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StringValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StringValue {
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as String
        }
    }
    return StringValue(value, unknownFields)
}

fun BytesValue?.orDefault() = this ?: BytesValue.defaultInstance

fun BytesValue.copy(
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): BytesValue = (this as BytesValue_Impl).copy(
    value,
    unknownFields
)

private data class BytesValue_Impl(
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BytesValue {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = BytesValue.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun BytesValue.protoMergeImpl(plus: pbandk.Message?): BytesValue = (plus as? BytesValue)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun BytesValue.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BytesValue {
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return BytesValue(value, unknownFields)
}
