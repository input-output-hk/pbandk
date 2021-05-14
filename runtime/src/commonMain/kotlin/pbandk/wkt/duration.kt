@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed interface Duration : pbandk.Message {
    val seconds: Long
    val nanos: Int

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Duration
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration>

    companion object : pbandk.Message.Companion<pbandk.wkt.Duration> {
        operator fun invoke(
            seconds: Long = 0L,
            nanos: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Duration = Duration_Impl(
            seconds = seconds,
            nanos = nanos,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Duration() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Duration.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Duration> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Duration, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "seconds",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "seconds",
                        value = pbandk.wkt.Duration::seconds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "nanos",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "nanos",
                        value = pbandk.wkt.Duration::nanos
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Duration::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Duration?.orDefault() = this ?: Duration.defaultInstance

fun Duration.copy(
    seconds: Long = this.seconds,
    nanos: Int = this.nanos,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): Duration = (this as Duration_Impl).copy(
    seconds = seconds,
    nanos = nanos,
    unknownFields = unknownFields
)

private data class Duration_Impl(
    override val seconds: Long,
    override val nanos: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Duration {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Duration.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Duration.protoMergeImpl(plus: pbandk.Message?): Duration = (plus as? Duration)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Duration.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Duration {
    var seconds = 0L
    var nanos = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> seconds = _fieldValue as Long
            2 -> nanos = _fieldValue as Int
        }
    }
    return Duration(seconds, nanos, unknownFields)
}
