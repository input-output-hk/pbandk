@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

sealed interface FieldMask : pbandk.Message {
    val paths: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.wkt.FieldMask
    override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask>

    companion object : pbandk.Message.Companion<pbandk.wkt.FieldMask> {
        operator fun invoke(
            paths: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.wkt.FieldMask = FieldMask_Impl(
            paths,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.wkt.FieldMask() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.wkt.FieldMask.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.wkt.FieldMask> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.wkt.FieldMask, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "paths",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "paths",
                        value = pbandk.wkt.FieldMask::paths
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.wkt.FieldMask::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun FieldMask?.orDefault() = this ?: FieldMask.defaultInstance

fun FieldMask.copy(
    paths: List<String> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): FieldMask = (this as FieldMask_Impl).copy(
    paths,
    unknownFields
)

private data class FieldMask_Impl(
    override val paths: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FieldMask {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FieldMask.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FieldMask.protoMergeImpl(plus: pbandk.Message?): FieldMask = (plus as? FieldMask)?.let {
    it.copy(
        paths = paths + plus.paths,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldMask.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldMask {
    var paths: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> paths = (paths ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return FieldMask(pbandk.ListWithSize.Builder.fixed(paths), unknownFields)
}
