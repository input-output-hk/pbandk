@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed interface Foo : pbandk.Message {
    val `val`: String

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Foo
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo>

    companion object : pbandk.Message.Companion<pbandk.testpb.Foo> {
        operator fun invoke(
            `val`: String = "",
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Foo = Foo_Impl(
            `val`,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Foo() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Foo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Foo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Foo, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "val",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "val",
                        value = pbandk.testpb.Foo::`val`
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Foo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Bar : pbandk.Message {
    val foos: List<pbandk.testpb.Foo>
    val singleFoo: pbandk.testpb.Foo?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Bar
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar>

    companion object : pbandk.Message.Companion<pbandk.testpb.Bar> {
        operator fun invoke(
            foos: List<pbandk.testpb.Foo> = emptyList(),
            singleFoo: pbandk.testpb.Foo? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Bar = Bar_Impl(
            foos,
            singleFoo,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Bar() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Bar.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Bar> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Bar, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foos",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.Foo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion)),
                        jsonName = "foos",
                        value = pbandk.testpb.Bar::foos
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single_foo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                        jsonName = "singleFoo",
                        value = pbandk.testpb.Bar::singleFoo
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Bar::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface MessageWithMap : pbandk.Message {
    val map: Map<String, String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap>

    companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap> {
        operator fun invoke(
            map: Map<String, String> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MessageWithMap = MessageWithMap_Impl(
            map,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.MessageWithMap() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MessageWithMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageWithMap, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "map",
                        value = pbandk.testpb.MessageWithMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.MessageWithMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed interface MapEntry : pbandk.Message, Map.Entry<String, String> {
        override val key: String
        override val value: String

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageWithMap.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.MessageWithMap.MapEntry> {
            operator fun invoke(
                key: String = "",
                value: String = "",
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.MessageWithMap.MapEntry = MessageWithMap_MapEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.MessageWithMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MessageWithMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageWithMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageWithMap.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.MessageWithMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = pbandk.testpb.MessageWithMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.MessageWithMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

sealed interface FooMap : pbandk.Message {
    val map: Map<String, pbandk.testpb.Foo?>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap>

    companion object : pbandk.Message.Companion<pbandk.testpb.FooMap> {
        operator fun invoke(
            map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FooMap = FooMap_Impl(
            map,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.FooMap() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.FooMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMap, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.Foo?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion)),
                        jsonName = "map",
                        value = pbandk.testpb.FooMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.FooMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed interface MapEntry : pbandk.Message, Map.Entry<String, pbandk.testpb.Foo?> {
        override val key: String
        override val value: pbandk.testpb.Foo?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMap.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.FooMap.MapEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.testpb.Foo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.FooMap.MapEntry = FooMap_MapEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.FooMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.FooMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMap.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.FooMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.FooMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.FooMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

sealed interface FooMapEntries : pbandk.Message {
    val map: List<pbandk.testpb.FooMapEntries.MapEntry>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries>

    companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries> {
        operator fun invoke(
            map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FooMapEntries = FooMapEntries_Impl(
            map,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.FooMapEntries() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.FooMapEntries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.FooMapEntries.MapEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FooMapEntries.MapEntry.Companion)),
                        jsonName = "map",
                        value = pbandk.testpb.FooMapEntries::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.FooMapEntries::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed interface MapEntry : pbandk.Message {
        val key: String
        val value: pbandk.testpb.Foo?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.FooMapEntries.MapEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.FooMapEntries.MapEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.testpb.Foo? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.FooMapEntries.MapEntry = FooMapEntries_MapEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.FooMapEntries.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.FooMapEntries.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FooMapEntries.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FooMapEntries.MapEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.FooMapEntries.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.FooMapEntries.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.FooMapEntries.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

sealed interface Wrappers : pbandk.Message {
    val stringValue: String?
    val uint64Values: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Wrappers
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers>

    companion object : pbandk.Message.Companion<pbandk.testpb.Wrappers> {
        operator fun invoke(
            stringValue: String? = null,
            uint64Values: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Wrappers = Wrappers_Impl(
            stringValue,
            uint64Values,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Wrappers() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Wrappers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Wrappers> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Wrappers, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "stringValue",
                        value = pbandk.testpb.Wrappers::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64_values",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "uint64Values",
                        value = pbandk.testpb.Wrappers::uint64Values
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Wrappers::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Foo?.orDefault() = this ?: Foo.defaultInstance

fun Foo.copy(
    `val`: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Foo = (this as Foo_Impl).copy(
    `val`,
    unknownFields
)

private data class Foo_Impl(
    override val `val`: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Foo {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Foo.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Foo.protoMergeImpl(plus: pbandk.Message?): Foo = (plus as? Foo)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Foo {
    var `val` = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> `val` = _fieldValue as String
        }
    }
    return Foo(`val`, unknownFields)
}

fun Bar?.orDefault() = this ?: Bar.defaultInstance

fun Bar.copy(
    foos: List<pbandk.testpb.Foo> = emptyList(),
    singleFoo: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Bar = (this as Bar_Impl).copy(
    foos,
    singleFoo,
    unknownFields
)

private data class Bar_Impl(
    override val foos: List<pbandk.testpb.Foo>,
    override val singleFoo: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Bar {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Bar.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Bar.protoMergeImpl(plus: pbandk.Message?): Bar = (plus as? Bar)?.let {
    it.copy(
        foos = foos + plus.foos,
        singleFoo = singleFoo?.plus(plus.singleFoo) ?: plus.singleFoo,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Bar {
    var foos: pbandk.ListWithSize.Builder<pbandk.testpb.Foo>? = null
    var singleFoo: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foos = (foos ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.Foo> }
            2 -> singleFoo = _fieldValue as pbandk.testpb.Foo
        }
    }
    return Bar(pbandk.ListWithSize.Builder.fixed(foos), singleFoo, unknownFields)
}

fun MessageWithMap?.orDefault() = this ?: MessageWithMap.defaultInstance

fun MessageWithMap.copy(
    map: Map<String, String> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MessageWithMap = (this as MessageWithMap_Impl).copy(
    map,
    unknownFields
)

private data class MessageWithMap_Impl(
    override val map: Map<String, String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MessageWithMap {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = MessageWithMap.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun MessageWithMap.protoMergeImpl(plus: pbandk.Message?): MessageWithMap = (plus as? MessageWithMap)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap {
    var map: pbandk.MessageMap.Builder<String, String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
        }
    }
    return MessageWithMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

fun MessageWithMap.MapEntry?.orDefault() = this ?: MessageWithMap.MapEntry.defaultInstance

fun MessageWithMap.MapEntry.copy(
    key: String = "",
    value: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): MessageWithMap.MapEntry = (this as MessageWithMap_MapEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class MessageWithMap_MapEntry_Impl(
    override val key: String,
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MessageWithMap.MapEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = MessageWithMap.MapEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun MessageWithMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): MessageWithMap.MapEntry = (plus as? MessageWithMap.MapEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap.MapEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    return MessageWithMap.MapEntry(key, value, unknownFields)
}

fun FooMap?.orDefault() = this ?: FooMap.defaultInstance

fun FooMap.copy(
    map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): FooMap = (this as FooMap_Impl).copy(
    map,
    unknownFields
)

private data class FooMap_Impl(
    override val map: Map<String, pbandk.testpb.Foo?>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMap {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FooMap.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FooMap.protoMergeImpl(plus: pbandk.Message?): FooMap = (plus as? FooMap)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap {
    var map: pbandk.MessageMap.Builder<String, pbandk.testpb.Foo?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.Foo?>> }
        }
    }
    return FooMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

fun FooMap.MapEntry?.orDefault() = this ?: FooMap.MapEntry.defaultInstance

fun FooMap.MapEntry.copy(
    key: String = "",
    value: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): FooMap.MapEntry = (this as FooMap_MapEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class FooMap_MapEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMap.MapEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FooMap.MapEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FooMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMap.MapEntry = (plus as? FooMap.MapEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }
    return FooMap.MapEntry(key, value, unknownFields)
}

fun FooMapEntries?.orDefault() = this ?: FooMapEntries.defaultInstance

fun FooMapEntries.copy(
    map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): FooMapEntries = (this as FooMapEntries_Impl).copy(
    map,
    unknownFields
)

private data class FooMapEntries_Impl(
    override val map: List<pbandk.testpb.FooMapEntries.MapEntry>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMapEntries {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FooMapEntries.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FooMapEntries.protoMergeImpl(plus: pbandk.Message?): FooMapEntries = (plus as? FooMapEntries)?.let {
    it.copy(
        map = map + plus.map,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries {
    var map: pbandk.ListWithSize.Builder<pbandk.testpb.FooMapEntries.MapEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.FooMapEntries.MapEntry> }
        }
    }
    return FooMapEntries(pbandk.ListWithSize.Builder.fixed(map), unknownFields)
}

fun FooMapEntries.MapEntry?.orDefault() = this ?: FooMapEntries.MapEntry.defaultInstance

fun FooMapEntries.MapEntry.copy(
    key: String = "",
    value: pbandk.testpb.Foo? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): FooMapEntries.MapEntry = (this as FooMapEntries_MapEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class FooMapEntries_MapEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.Foo?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FooMapEntries.MapEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FooMapEntries.MapEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FooMapEntries.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMapEntries.MapEntry = (plus as? FooMapEntries.MapEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }
    return FooMapEntries.MapEntry(key, value, unknownFields)
}

fun Wrappers?.orDefault() = this ?: Wrappers.defaultInstance

fun Wrappers.copy(
    stringValue: String? = null,
    uint64Values: List<Long> = emptyList(),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): Wrappers = (this as Wrappers_Impl).copy(
    stringValue,
    uint64Values,
    unknownFields
)

private data class Wrappers_Impl(
    override val stringValue: String?,
    override val uint64Values: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Wrappers {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Wrappers.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Wrappers.protoMergeImpl(plus: pbandk.Message?): Wrappers = (plus as? Wrappers)?.let {
    it.copy(
        stringValue = plus.stringValue ?: stringValue,
        uint64Values = uint64Values + plus.uint64Values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Wrappers.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Wrappers {
    var stringValue: String? = null
    var uint64Values: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stringValue = _fieldValue as String
            2 -> uint64Values = (uint64Values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return Wrappers(stringValue, pbandk.ListWithSize.Builder.fixed(uint64Values), unknownFields)
}
