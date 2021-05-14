@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed interface SingleRequiredCustomOption : pbandk.Message {
    val single: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SingleRequiredCustomOption
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption>

    companion object : pbandk.Message.Companion<pbandk.testpb.SingleRequiredCustomOption> {
        operator fun invoke(
            single: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SingleRequiredCustomOption = SingleRequiredCustomOption_Impl(
            single = single,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.SingleRequiredCustomOption() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.SingleRequiredCustomOption.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SingleRequiredCustomOption> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SingleRequiredCustomOption, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "single",
                        options = pbandk.wkt.FieldOptions(
                            unknownFields = mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(5, -118, 1, 2, 16, 1))
                                    )
                                )
                            )
                        ),
                        value = pbandk.testpb.SingleRequiredCustomOption::single
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.SingleRequiredCustomOption::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface MultipleCustomOptions : pbandk.Message {
    val multiple: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptions
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions>

    companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptions> {
        operator fun invoke(
            multiple: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MultipleCustomOptions = MultipleCustomOptions_Impl(
            multiple = multiple,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.MultipleCustomOptions() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MultipleCustomOptions.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptions> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MultipleCustomOptions, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "multiple",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "multiple",
                        options = pbandk.wkt.FieldOptions(
                            unknownFields = mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(5, -118, 1, 2, 16, 1)),
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 16, 10))
                                    )
                                )
                            )
                        ),
                        value = pbandk.testpb.MultipleCustomOptions::multiple
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.MultipleCustomOptions::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface MultipleCustomOptionsPlusDeprecated : pbandk.Message {
    val multipleDeprecated: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MultipleCustomOptionsPlusDeprecated
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated>

    companion object : pbandk.Message.Companion<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> {
        operator fun invoke(
            multipleDeprecated: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MultipleCustomOptionsPlusDeprecated = MultipleCustomOptionsPlusDeprecated_Impl(
            multipleDeprecated = multipleDeprecated,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.MultipleCustomOptionsPlusDeprecated() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MultipleCustomOptionsPlusDeprecated.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MultipleCustomOptionsPlusDeprecated, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "multiple_deprecated",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "multipleDeprecated",
                        options = pbandk.wkt.FieldOptions(
                            deprecated = true,
                            unknownFields = mapOf(
                                1071 to pbandk.UnknownField(
                                    fieldNum = 1071,
                                    values = listOf(
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 24, 32)),
                                        pbandk.UnknownField.Value(wireType = 2, rawBytes = byteArrayOf(4, 114, 2, 16, 10))
                                    )
                                )
                            )
                        ),
                        value = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::multipleDeprecated
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.MultipleCustomOptionsPlusDeprecated::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun SingleRequiredCustomOption?.orDefault() = this ?: SingleRequiredCustomOption.defaultInstance

fun SingleRequiredCustomOption.copy(
    single: String = this.single,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): SingleRequiredCustomOption = (this as SingleRequiredCustomOption_Impl).copy(
    single = single,
    unknownFields = unknownFields
)

private data class SingleRequiredCustomOption_Impl(
    override val single: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SingleRequiredCustomOption {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = SingleRequiredCustomOption.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun SingleRequiredCustomOption.protoMergeImpl(plus: pbandk.Message?): SingleRequiredCustomOption = (plus as? SingleRequiredCustomOption)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SingleRequiredCustomOption.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SingleRequiredCustomOption {
    var single = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> single = _fieldValue as String
        }
    }
    return SingleRequiredCustomOption(single, unknownFields)
}

fun MultipleCustomOptions?.orDefault() = this ?: MultipleCustomOptions.defaultInstance

fun MultipleCustomOptions.copy(
    multiple: String = this.multiple,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): MultipleCustomOptions = (this as MultipleCustomOptions_Impl).copy(
    multiple = multiple,
    unknownFields = unknownFields
)

private data class MultipleCustomOptions_Impl(
    override val multiple: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MultipleCustomOptions {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = MultipleCustomOptions.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun MultipleCustomOptions.protoMergeImpl(plus: pbandk.Message?): MultipleCustomOptions = (plus as? MultipleCustomOptions)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptions.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultipleCustomOptions {
    var multiple = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multiple = _fieldValue as String
        }
    }
    return MultipleCustomOptions(multiple, unknownFields)
}

fun MultipleCustomOptionsPlusDeprecated?.orDefault() = this ?: MultipleCustomOptionsPlusDeprecated.defaultInstance

fun MultipleCustomOptionsPlusDeprecated.copy(
    multipleDeprecated: String = this.multipleDeprecated,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): MultipleCustomOptionsPlusDeprecated = (this as MultipleCustomOptionsPlusDeprecated_Impl).copy(
    multipleDeprecated = multipleDeprecated,
    unknownFields = unknownFields
)

private data class MultipleCustomOptionsPlusDeprecated_Impl(
    override val multipleDeprecated: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MultipleCustomOptionsPlusDeprecated {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = MultipleCustomOptionsPlusDeprecated.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun MultipleCustomOptionsPlusDeprecated.protoMergeImpl(plus: pbandk.Message?): MultipleCustomOptionsPlusDeprecated = (plus as? MultipleCustomOptionsPlusDeprecated)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MultipleCustomOptionsPlusDeprecated.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MultipleCustomOptionsPlusDeprecated {
    var multipleDeprecated = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> multipleDeprecated = _fieldValue as String
        }
    }
    return MultipleCustomOptionsPlusDeprecated(multipleDeprecated, unknownFields)
}
