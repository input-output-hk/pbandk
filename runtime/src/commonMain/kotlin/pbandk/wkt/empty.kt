@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed interface Empty : pbandk.Message {

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.Empty
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty>

    companion object : pbandk.Message.Companion<pbandk.wkt.Empty> {
        operator fun invoke(
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.Empty = Empty_Impl(
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.Empty() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.Empty.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.Empty> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.Empty, *>>(0)
            fieldsList.apply {
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.Empty::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Empty?.orDefault() = this ?: Empty.defaultInstance

fun Empty.copy(
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): Empty = (this as Empty_Impl).copy(
    unknownFields = unknownFields
)

private data class Empty_Impl(
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Empty {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Empty.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Empty.protoMergeImpl(plus: pbandk.Message?): Empty = (plus as? Empty)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Empty.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Empty {

    val unknownFields = u.readMessage(this) { _, _ -> }
    return Empty(unknownFields)
}
