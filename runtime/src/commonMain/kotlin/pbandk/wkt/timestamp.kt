@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

interface Timestamp : pbandk.Message {
    val seconds: Long
    val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Timestamp
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp>

    companion object : pbandk.Message.Companion<pbandk.wkt.Timestamp> {
        operator fun invoke(
            seconds: Long = 0L,
            nanos: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Timestamp = Timestamp_Impl(
            seconds,
            nanos,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Timestamp() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Timestamp.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Timestamp> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Timestamp, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seconds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seconds",
                        value = pbandk.wkt.Timestamp::seconds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nanos",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nanos",
                        value = pbandk.wkt.Timestamp::nanos
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Timestamp::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Timestamp?.orDefault() = this ?: Timestamp.defaultInstance

fun Timestamp.copy(
    seconds: Long = 0L,
    nanos: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Timestamp = (this as Timestamp_Impl).copy(
    seconds,
    nanos,
    unknownFields
)

private data class Timestamp_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Timestamp {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Timestamp.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Timestamp.protoMergeImpl(plus: pbandk.Message?): Timestamp = (plus as? Timestamp)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Timestamp.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Timestamp {
    var seconds = 0L
    var nanos = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> seconds = _fieldValue as Long
            2 -> nanos = _fieldValue as Int
        }
    }
    return Timestamp(seconds, nanos, unknownFields)
}
