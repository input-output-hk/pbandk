@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed class KnownRegex(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is pbandk.testpb.KnownRegex && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "KnownRegex.${name ?: "UNRECOGNIZED"}(value=$value)"

    object UNKNOWN : KnownRegex(0, "UNKNOWN")
    object HTTP_HEADER_NAME : KnownRegex(1, "HTTP_HEADER_NAME")
    object HTTP_HEADER_VALUE : KnownRegex(2, "HTTP_HEADER_VALUE")
    class UNRECOGNIZED(value: Int) : pbandk.testpb.KnownRegex(value)

    companion object : pbandk.Message.Enum.Companion<pbandk.testpb.KnownRegex> {
        val values: List<pbandk.testpb.KnownRegex> by lazy { listOf(UNKNOWN, HTTP_HEADER_NAME, HTTP_HEADER_VALUE) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No KnownRegex with name: $name")
    }
}

sealed interface FieldRules : pbandk.Message {
    val message: pbandk.testpb.MessageRules?
    val type: Type<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FieldRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules>

    sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class Float_(float: pbandk.testpb.FloatRules) : Type<pbandk.testpb.FloatRules>(float)
        class Double_(double: pbandk.testpb.DoubleRules) : Type<pbandk.testpb.DoubleRules>(double)
        class Int32(int32: pbandk.testpb.Int32Rules) : Type<pbandk.testpb.Int32Rules>(int32)
        class Int64(int64: pbandk.testpb.Int64Rules) : Type<pbandk.testpb.Int64Rules>(int64)
        class Uint32(uint32: pbandk.testpb.UInt32Rules) : Type<pbandk.testpb.UInt32Rules>(uint32)
        class Uint64(uint64: pbandk.testpb.UInt64Rules) : Type<pbandk.testpb.UInt64Rules>(uint64)
        class Sint32(sint32: pbandk.testpb.SInt32Rules) : Type<pbandk.testpb.SInt32Rules>(sint32)
        class Sint64(sint64: pbandk.testpb.SInt64Rules) : Type<pbandk.testpb.SInt64Rules>(sint64)
        class Fixed32(fixed32: pbandk.testpb.Fixed32Rules) : Type<pbandk.testpb.Fixed32Rules>(fixed32)
        class Fixed64(fixed64: pbandk.testpb.Fixed64Rules) : Type<pbandk.testpb.Fixed64Rules>(fixed64)
        class Sfixed32(sfixed32: pbandk.testpb.SFixed32Rules) : Type<pbandk.testpb.SFixed32Rules>(sfixed32)
        class Sfixed64(sfixed64: pbandk.testpb.SFixed64Rules) : Type<pbandk.testpb.SFixed64Rules>(sfixed64)
        class Bool(bool: pbandk.testpb.BoolRules) : Type<pbandk.testpb.BoolRules>(bool)
        class String_(string: pbandk.testpb.StringRules) : Type<pbandk.testpb.StringRules>(string)
        class Bytes(bytes: pbandk.testpb.BytesRules) : Type<pbandk.testpb.BytesRules>(bytes)
        class Enum(enum: pbandk.testpb.EnumRules) : Type<pbandk.testpb.EnumRules>(enum)
        class Repeated(repeated: pbandk.testpb.RepeatedRules) : Type<pbandk.testpb.RepeatedRules>(repeated)
        class Map_(map: pbandk.testpb.MapRules) : Type<pbandk.testpb.MapRules>(map)
        class Any(any: pbandk.testpb.AnyRules) : Type<pbandk.testpb.AnyRules>(any)
        class Duration(duration: pbandk.testpb.DurationRules) : Type<pbandk.testpb.DurationRules>(duration)
        class Timestamp(timestamp: pbandk.testpb.TimestampRules) : Type<pbandk.testpb.TimestampRules>(timestamp)
    }

    val float: pbandk.testpb.FloatRules?
    val double: pbandk.testpb.DoubleRules?
    val int32: pbandk.testpb.Int32Rules?
    val int64: pbandk.testpb.Int64Rules?
    val uint32: pbandk.testpb.UInt32Rules?
    val uint64: pbandk.testpb.UInt64Rules?
    val sint32: pbandk.testpb.SInt32Rules?
    val sint64: pbandk.testpb.SInt64Rules?
    val fixed32: pbandk.testpb.Fixed32Rules?
    val fixed64: pbandk.testpb.Fixed64Rules?
    val sfixed32: pbandk.testpb.SFixed32Rules?
    val sfixed64: pbandk.testpb.SFixed64Rules?
    val bool: pbandk.testpb.BoolRules?
    val string: pbandk.testpb.StringRules?
    val bytes: pbandk.testpb.BytesRules?
    val enum: pbandk.testpb.EnumRules?
    val repeated: pbandk.testpb.RepeatedRules?
    val map: pbandk.testpb.MapRules?
    val any: pbandk.testpb.AnyRules?
    val duration: pbandk.testpb.DurationRules?
    val timestamp: pbandk.testpb.TimestampRules?

    companion object : pbandk.Message.Companion<pbandk.testpb.FieldRules> {
        operator fun invoke(
            message: pbandk.testpb.MessageRules? = null,
            type: Type<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FieldRules = FieldRules_Impl(
            message = message,
            type = type,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.FieldRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.FieldRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FieldRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FieldRules, *>>(22)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "float",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FloatRules.Companion),
                        oneofMember = true,
                        jsonName = "float",
                        value = pbandk.testpb.FieldRules::float
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "double",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.DoubleRules.Companion),
                        oneofMember = true,
                        jsonName = "double",
                        value = pbandk.testpb.FieldRules::double
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "int32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Int32Rules.Companion),
                        oneofMember = true,
                        jsonName = "int32",
                        value = pbandk.testpb.FieldRules::int32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "int64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Int64Rules.Companion),
                        oneofMember = true,
                        jsonName = "int64",
                        value = pbandk.testpb.FieldRules::int64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.UInt32Rules.Companion),
                        oneofMember = true,
                        jsonName = "uint32",
                        value = pbandk.testpb.FieldRules::uint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.UInt64Rules.Companion),
                        oneofMember = true,
                        jsonName = "uint64",
                        value = pbandk.testpb.FieldRules::uint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sint32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SInt32Rules.Companion),
                        oneofMember = true,
                        jsonName = "sint32",
                        value = pbandk.testpb.FieldRules::sint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sint64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SInt64Rules.Companion),
                        oneofMember = true,
                        jsonName = "sint64",
                        value = pbandk.testpb.FieldRules::sint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Fixed32Rules.Companion),
                        oneofMember = true,
                        jsonName = "fixed32",
                        value = pbandk.testpb.FieldRules::fixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Fixed64Rules.Companion),
                        oneofMember = true,
                        jsonName = "fixed64",
                        value = pbandk.testpb.FieldRules::fixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sfixed32",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SFixed32Rules.Companion),
                        oneofMember = true,
                        jsonName = "sfixed32",
                        value = pbandk.testpb.FieldRules::sfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "sfixed64",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.SFixed64Rules.Companion),
                        oneofMember = true,
                        jsonName = "sfixed64",
                        value = pbandk.testpb.FieldRules::sfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.BoolRules.Companion),
                        oneofMember = true,
                        jsonName = "bool",
                        value = pbandk.testpb.FieldRules::bool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.StringRules.Companion),
                        oneofMember = true,
                        jsonName = "string",
                        value = pbandk.testpb.FieldRules::string
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.BytesRules.Companion),
                        oneofMember = true,
                        jsonName = "bytes",
                        value = pbandk.testpb.FieldRules::bytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "enum",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.EnumRules.Companion),
                        oneofMember = true,
                        jsonName = "enum",
                        value = pbandk.testpb.FieldRules::enum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MessageRules.Companion),
                        jsonName = "message",
                        value = pbandk.testpb.FieldRules::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.RepeatedRules.Companion),
                        oneofMember = true,
                        jsonName = "repeated",
                        value = pbandk.testpb.FieldRules::repeated
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.MapRules.Companion),
                        oneofMember = true,
                        jsonName = "map",
                        value = pbandk.testpb.FieldRules::map
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "any",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.AnyRules.Companion),
                        oneofMember = true,
                        jsonName = "any",
                        value = pbandk.testpb.FieldRules::any
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "duration",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.DurationRules.Companion),
                        oneofMember = true,
                        jsonName = "duration",
                        value = pbandk.testpb.FieldRules::duration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timestamp",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TimestampRules.Companion),
                        oneofMember = true,
                        jsonName = "timestamp",
                        value = pbandk.testpb.FieldRules::timestamp
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.FieldRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface FloatRules : pbandk.Message {
    val const: Float?
    val lt: Float?
    val lte: Float?
    val gt: Float?
    val gte: Float?
    val `in`: List<Float>
    val notIn: List<Float>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.FloatRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FloatRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.FloatRules> {
        operator fun invoke(
            const: Float? = null,
            lt: Float? = null,
            lte: Float? = null,
            gt: Float? = null,
            gte: Float? = null,
            `in`: List<Float> = emptyList(),
            notIn: List<Float> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.FloatRules = FloatRules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.FloatRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.FloatRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.FloatRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.FloatRules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.FloatRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.FloatRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.FloatRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.FloatRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.FloatRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "in",
                        value = pbandk.testpb.FloatRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "notIn",
                        value = pbandk.testpb.FloatRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.FloatRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface DoubleRules : pbandk.Message {
    val const: Double?
    val lt: Double?
    val lte: Double?
    val gt: Double?
    val gte: Double?
    val `in`: List<Double>
    val notIn: List<Double>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.DoubleRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DoubleRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.DoubleRules> {
        operator fun invoke(
            const: Double? = null,
            lt: Double? = null,
            lte: Double? = null,
            gt: Double? = null,
            gte: Double? = null,
            `in`: List<Double> = emptyList(),
            notIn: List<Double> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.DoubleRules = DoubleRules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.DoubleRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.DoubleRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DoubleRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.DoubleRules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.DoubleRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.DoubleRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.DoubleRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.DoubleRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.DoubleRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "in",
                        value = pbandk.testpb.DoubleRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "notIn",
                        value = pbandk.testpb.DoubleRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.DoubleRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Int32Rules : pbandk.Message {
    val const: Int?
    val lt: Int?
    val lte: Int?
    val gt: Int?
    val gte: Int?
    val `in`: List<Int>
    val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Int32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int32Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.Int32Rules> {
        operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Int32Rules = Int32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Int32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Int32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Int32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Int32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Int32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Int32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Int32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Int32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "in",
                        value = pbandk.testpb.Int32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Int32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Int32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Int64Rules : pbandk.Message {
    val const: Long?
    val lt: Long?
    val lte: Long?
    val gt: Long?
    val gte: Long?
    val `in`: List<Long>
    val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Int64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int64Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.Int64Rules> {
        operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Int64Rules = Int64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Int64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Int64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Int64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Int64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Int64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Int64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Int64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Int64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Int64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "in",
                        value = pbandk.testpb.Int64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Int64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Int64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface UInt32Rules : pbandk.Message {
    val const: Int?
    val lt: Int?
    val lte: Int?
    val gt: Int?
    val gte: Int?
    val `in`: List<Int>
    val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.UInt32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt32Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.UInt32Rules> {
        operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.UInt32Rules = UInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.UInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.UInt32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.UInt32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.UInt32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.UInt32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.UInt32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.UInt32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.UInt32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "in",
                        value = pbandk.testpb.UInt32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.UInt32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.UInt32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface UInt64Rules : pbandk.Message {
    val const: Long?
    val lt: Long?
    val lte: Long?
    val gt: Long?
    val gte: Long?
    val `in`: List<Long>
    val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.UInt64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt64Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.UInt64Rules> {
        operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.UInt64Rules = UInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.UInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.UInt64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.UInt64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.UInt64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.UInt64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.UInt64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.UInt64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.UInt64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.UInt64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "in",
                        value = pbandk.testpb.UInt64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.UInt64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.UInt64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface SInt32Rules : pbandk.Message {
    val const: Int?
    val lt: Int?
    val lte: Int?
    val gt: Int?
    val gte: Int?
    val `in`: List<Int>
    val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SInt32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt32Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.SInt32Rules> {
        operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SInt32Rules = SInt32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.SInt32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.SInt32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SInt32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SInt32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SInt32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SInt32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SInt32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SInt32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "in",
                        value = pbandk.testpb.SInt32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SInt32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.SInt32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface SInt64Rules : pbandk.Message {
    val const: Long?
    val lt: Long?
    val lte: Long?
    val gt: Long?
    val gte: Long?
    val `in`: List<Long>
    val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SInt64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt64Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.SInt64Rules> {
        operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SInt64Rules = SInt64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.SInt64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.SInt64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SInt64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SInt64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SInt64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SInt64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SInt64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SInt64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SInt64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "in",
                        value = pbandk.testpb.SInt64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SInt64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.SInt64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Fixed32Rules : pbandk.Message {
    val const: Int?
    val lt: Int?
    val lte: Int?
    val gt: Int?
    val gte: Int?
    val `in`: List<Int>
    val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Fixed32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed32Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.Fixed32Rules> {
        operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Fixed32Rules = Fixed32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Fixed32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Fixed32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Fixed32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Fixed32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Fixed32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Fixed32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Fixed32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Fixed32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "in",
                        value = pbandk.testpb.Fixed32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Fixed32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Fixed32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface Fixed64Rules : pbandk.Message {
    val const: Long?
    val lt: Long?
    val lte: Long?
    val gt: Long?
    val gte: Long?
    val `in`: List<Long>
    val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.Fixed64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed64Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.Fixed64Rules> {
        operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.Fixed64Rules = Fixed64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.Fixed64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.Fixed64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.Fixed64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.Fixed64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.Fixed64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.Fixed64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.Fixed64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.Fixed64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.Fixed64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "in",
                        value = pbandk.testpb.Fixed64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.Fixed64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.Fixed64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface SFixed32Rules : pbandk.Message {
    val const: Int?
    val lt: Int?
    val lte: Int?
    val gt: Int?
    val gte: Int?
    val `in`: List<Int>
    val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SFixed32Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed32Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.SFixed32Rules> {
        operator fun invoke(
            const: Int? = null,
            lt: Int? = null,
            lte: Int? = null,
            gt: Int? = null,
            gte: Int? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SFixed32Rules = SFixed32Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.SFixed32Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.SFixed32Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed32Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SFixed32Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SFixed32Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SFixed32Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SFixed32Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SFixed32Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SFixed32Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "in",
                        value = pbandk.testpb.SFixed32Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SFixed32Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.SFixed32Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface SFixed64Rules : pbandk.Message {
    val const: Long?
    val lt: Long?
    val lte: Long?
    val gt: Long?
    val gte: Long?
    val `in`: List<Long>
    val notIn: List<Long>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.SFixed64Rules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed64Rules>

    companion object : pbandk.Message.Companion<pbandk.testpb.SFixed64Rules> {
        operator fun invoke(
            const: Long? = null,
            lt: Long? = null,
            lte: Long? = null,
            gt: Long? = null,
            gte: Long? = null,
            `in`: List<Long> = emptyList(),
            notIn: List<Long> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.SFixed64Rules = SFixed64Rules_Impl(
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.SFixed64Rules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.SFixed64Rules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.SFixed64Rules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.SFixed64Rules, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.SFixed64Rules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "lt",
                        value = pbandk.testpb.SFixed64Rules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "lte",
                        value = pbandk.testpb.SFixed64Rules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "gt",
                        value = pbandk.testpb.SFixed64Rules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(hasPresence = true),
                        jsonName = "gte",
                        value = pbandk.testpb.SFixed64Rules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "in",
                        value = pbandk.testpb.SFixed64Rules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "notIn",
                        value = pbandk.testpb.SFixed64Rules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.SFixed64Rules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface BoolRules : pbandk.Message {
    val const: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.BoolRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.BoolRules> {
        operator fun invoke(
            const: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.BoolRules = BoolRules_Impl(
            const = const,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.BoolRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.BoolRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BoolRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.BoolRules, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.BoolRules::const
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.BoolRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface StringRules : pbandk.Message {
    val const: String?
    val len: Long?
    val minLen: Long?
    val maxLen: Long?
    val lenBytes: Long?
    val minBytes: Long?
    val maxBytes: Long?
    val pattern: String?
    val prefix: String?
    val suffix: String?
    val contains: String?
    val notContains: String?
    val `in`: List<String>
    val notIn: List<String>
    val strict: Boolean?
    val wellKnown: WellKnown<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.StringRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.StringRules>

    sealed class WellKnown<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class Email(email: Boolean = false) : WellKnown<Boolean>(email)
        class Hostname(hostname: Boolean = false) : WellKnown<Boolean>(hostname)
        class Ip(ip: Boolean = false) : WellKnown<Boolean>(ip)
        class Ipv4(ipv4: Boolean = false) : WellKnown<Boolean>(ipv4)
        class Ipv6(ipv6: Boolean = false) : WellKnown<Boolean>(ipv6)
        class Uri(uri: Boolean = false) : WellKnown<Boolean>(uri)
        class UriRef(uriRef: Boolean = false) : WellKnown<Boolean>(uriRef)
        class Address(address: Boolean = false) : WellKnown<Boolean>(address)
        class Uuid(uuid: Boolean = false) : WellKnown<Boolean>(uuid)
        class WellKnownRegex(wellKnownRegex: pbandk.testpb.KnownRegex = pbandk.testpb.KnownRegex.fromValue(0)) : WellKnown<pbandk.testpb.KnownRegex>(wellKnownRegex)
    }

    val email: Boolean?
    val hostname: Boolean?
    val ip: Boolean?
    val ipv4: Boolean?
    val ipv6: Boolean?
    val uri: Boolean?
    val uriRef: Boolean?
    val address: Boolean?
    val uuid: Boolean?
    val wellKnownRegex: pbandk.testpb.KnownRegex?

    companion object : pbandk.Message.Companion<pbandk.testpb.StringRules> {
        operator fun invoke(
            const: String? = null,
            len: Long? = null,
            minLen: Long? = null,
            maxLen: Long? = null,
            lenBytes: Long? = null,
            minBytes: Long? = null,
            maxBytes: Long? = null,
            pattern: String? = null,
            prefix: String? = null,
            suffix: String? = null,
            contains: String? = null,
            notContains: String? = null,
            `in`: List<String> = emptyList(),
            notIn: List<String> = emptyList(),
            strict: Boolean? = null,
            wellKnown: WellKnown<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.StringRules = StringRules_Impl(
            const = const,
            len = len,
            minLen = minLen,
            maxLen = maxLen,
            lenBytes = lenBytes,
            minBytes = minBytes,
            maxBytes = maxBytes,
            pattern = pattern,
            prefix = prefix,
            suffix = suffix,
            contains = contains,
            notContains = notContains,
            `in` = `in`,
            notIn = notIn,
            strict = strict,
            wellKnown = wellKnown,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.StringRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.StringRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.StringRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.StringRules, *>>(25)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.StringRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_len",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minLen",
                        value = pbandk.testpb.StringRules::minLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_len",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxLen",
                        value = pbandk.testpb.StringRules::maxLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_bytes",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minBytes",
                        value = pbandk.testpb.StringRules::minBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_bytes",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxBytes",
                        value = pbandk.testpb.StringRules::maxBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pattern",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "pattern",
                        value = pbandk.testpb.StringRules::pattern
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prefix",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "prefix",
                        value = pbandk.testpb.StringRules::prefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.testpb.StringRules::suffix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contains",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "contains",
                        value = pbandk.testpb.StringRules::contains
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "in",
                        value = pbandk.testpb.StringRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "notIn",
                        value = pbandk.testpb.StringRules::notIn
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "email",
                        value = pbandk.testpb.StringRules::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "hostname",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "hostname",
                        value = pbandk.testpb.StringRules::hostname
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ip",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ip",
                        value = pbandk.testpb.StringRules::ip
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv4",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv4",
                        value = pbandk.testpb.StringRules::ipv4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv6",
                        number = 16,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv6",
                        value = pbandk.testpb.StringRules::ipv6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uri",
                        number = 17,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "uri",
                        value = pbandk.testpb.StringRules::uri
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uri_ref",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "uriRef",
                        value = pbandk.testpb.StringRules::uriRef
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "len",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "len",
                        value = pbandk.testpb.StringRules::len
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "len_bytes",
                        number = 20,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "lenBytes",
                        value = pbandk.testpb.StringRules::lenBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "address",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "address",
                        value = pbandk.testpb.StringRules::address
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uuid",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "uuid",
                        value = pbandk.testpb.StringRules::uuid
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_contains",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "notContains",
                        value = pbandk.testpb.StringRules::notContains
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "well_known_regex",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.KnownRegex.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "wellKnownRegex",
                        value = pbandk.testpb.StringRules::wellKnownRegex
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "strict",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "strict",
                        value = pbandk.testpb.StringRules::strict
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.StringRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface BytesRules : pbandk.Message {
    val const: pbandk.ByteArr?
    val len: Long?
    val minLen: Long?
    val maxLen: Long?
    val pattern: String?
    val prefix: pbandk.ByteArr?
    val suffix: pbandk.ByteArr?
    val contains: pbandk.ByteArr?
    val `in`: List<pbandk.ByteArr>
    val notIn: List<pbandk.ByteArr>
    val wellKnown: WellKnown<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.BytesRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BytesRules>

    sealed class WellKnown<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class Ip(ip: Boolean = false) : WellKnown<Boolean>(ip)
        class Ipv4(ipv4: Boolean = false) : WellKnown<Boolean>(ipv4)
        class Ipv6(ipv6: Boolean = false) : WellKnown<Boolean>(ipv6)
    }

    val ip: Boolean?
    val ipv4: Boolean?
    val ipv6: Boolean?

    companion object : pbandk.Message.Companion<pbandk.testpb.BytesRules> {
        operator fun invoke(
            const: pbandk.ByteArr? = null,
            len: Long? = null,
            minLen: Long? = null,
            maxLen: Long? = null,
            pattern: String? = null,
            prefix: pbandk.ByteArr? = null,
            suffix: pbandk.ByteArr? = null,
            contains: pbandk.ByteArr? = null,
            `in`: List<pbandk.ByteArr> = emptyList(),
            notIn: List<pbandk.ByteArr> = emptyList(),
            wellKnown: WellKnown<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.BytesRules = BytesRules_Impl(
            const = const,
            len = len,
            minLen = minLen,
            maxLen = maxLen,
            pattern = pattern,
            prefix = prefix,
            suffix = suffix,
            contains = contains,
            `in` = `in`,
            notIn = notIn,
            wellKnown = wellKnown,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.BytesRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.BytesRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.BytesRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.BytesRules, *>>(13)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.BytesRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_len",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minLen",
                        value = pbandk.testpb.BytesRules::minLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_len",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxLen",
                        value = pbandk.testpb.BytesRules::maxLen
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "pattern",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "pattern",
                        value = pbandk.testpb.BytesRules::pattern
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "prefix",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "prefix",
                        value = pbandk.testpb.BytesRules::prefix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "suffix",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "suffix",
                        value = pbandk.testpb.BytesRules::suffix
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "contains",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        jsonName = "contains",
                        value = pbandk.testpb.BytesRules::contains
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "in",
                        value = pbandk.testpb.BytesRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "notIn",
                        value = pbandk.testpb.BytesRules::notIn
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ip",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ip",
                        value = pbandk.testpb.BytesRules::ip
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv4",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv4",
                        value = pbandk.testpb.BytesRules::ipv4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "ipv6",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "ipv6",
                        value = pbandk.testpb.BytesRules::ipv6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "len",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "len",
                        value = pbandk.testpb.BytesRules::len
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.BytesRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface EnumRules : pbandk.Message {
    val const: Int?
    val definedOnly: Boolean?
    val `in`: List<Int>
    val notIn: List<Int>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.EnumRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.EnumRules> {
        operator fun invoke(
            const: Int? = null,
            definedOnly: Boolean? = null,
            `in`: List<Int> = emptyList(),
            notIn: List<Int> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.EnumRules = EnumRules_Impl(
            const = const,
            definedOnly = definedOnly,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.EnumRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.EnumRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.EnumRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.EnumRules, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(hasPresence = true),
                        jsonName = "const",
                        value = pbandk.testpb.EnumRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "defined_only",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "definedOnly",
                        value = pbandk.testpb.EnumRules::definedOnly
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "in",
                        value = pbandk.testpb.EnumRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "notIn",
                        value = pbandk.testpb.EnumRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.EnumRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface MessageRules : pbandk.Message {
    val skip: Boolean?
    val required: Boolean?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MessageRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.MessageRules> {
        operator fun invoke(
            skip: Boolean? = null,
            required: Boolean? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MessageRules = MessageRules_Impl(
            skip = skip,
            required = required,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.MessageRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MessageRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MessageRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MessageRules, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skip",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "skip",
                        value = pbandk.testpb.MessageRules::skip
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.MessageRules::required
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.MessageRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface RepeatedRules : pbandk.Message {
    val minItems: Long?
    val maxItems: Long?
    val unique: Boolean?
    val items: pbandk.testpb.FieldRules?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.RepeatedRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.RepeatedRules> {
        operator fun invoke(
            minItems: Long? = null,
            maxItems: Long? = null,
            unique: Boolean? = null,
            items: pbandk.testpb.FieldRules? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.RepeatedRules = RepeatedRules_Impl(
            minItems = minItems,
            maxItems = maxItems,
            unique = unique,
            items = items,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.RepeatedRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.RepeatedRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.RepeatedRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.RepeatedRules, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_items",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minItems",
                        value = pbandk.testpb.RepeatedRules::minItems
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_items",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxItems",
                        value = pbandk.testpb.RepeatedRules::maxItems
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unique",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "unique",
                        value = pbandk.testpb.RepeatedRules::unique
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "items",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
                        jsonName = "items",
                        value = pbandk.testpb.RepeatedRules::items
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.RepeatedRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface MapRules : pbandk.Message {
    val minPairs: Long?
    val maxPairs: Long?
    val noSparse: Boolean?
    val keys: pbandk.testpb.FieldRules?
    val values: pbandk.testpb.FieldRules?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.MapRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.MapRules> {
        operator fun invoke(
            minPairs: Long? = null,
            maxPairs: Long? = null,
            noSparse: Boolean? = null,
            keys: pbandk.testpb.FieldRules? = null,
            values: pbandk.testpb.FieldRules? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.MapRules = MapRules_Impl(
            minPairs = minPairs,
            maxPairs = maxPairs,
            noSparse = noSparse,
            keys = keys,
            values = values,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.MapRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.MapRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.MapRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.MapRules, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "min_pairs",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "minPairs",
                        value = pbandk.testpb.MapRules::minPairs
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_pairs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        jsonName = "maxPairs",
                        value = pbandk.testpb.MapRules::maxPairs
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "no_sparse",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "noSparse",
                        value = pbandk.testpb.MapRules::noSparse
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "keys",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
                        jsonName = "keys",
                        value = pbandk.testpb.MapRules::keys
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "values",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
                        jsonName = "values",
                        value = pbandk.testpb.MapRules::values
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.MapRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface AnyRules : pbandk.Message {
    val required: Boolean?
    val `in`: List<String>
    val notIn: List<String>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.AnyRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.AnyRules> {
        operator fun invoke(
            required: Boolean? = null,
            `in`: List<String> = emptyList(),
            notIn: List<String> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.AnyRules = AnyRules_Impl(
            required = required,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.AnyRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.AnyRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.AnyRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.AnyRules, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.AnyRules::required
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "in",
                        value = pbandk.testpb.AnyRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "notIn",
                        value = pbandk.testpb.AnyRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.AnyRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface DurationRules : pbandk.Message {
    val required: Boolean?
    val const: pbandk.wkt.Duration?
    val lt: pbandk.wkt.Duration?
    val lte: pbandk.wkt.Duration?
    val gt: pbandk.wkt.Duration?
    val gte: pbandk.wkt.Duration?
    val `in`: List<pbandk.wkt.Duration>
    val notIn: List<pbandk.wkt.Duration>

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.DurationRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DurationRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.DurationRules> {
        operator fun invoke(
            required: Boolean? = null,
            const: pbandk.wkt.Duration? = null,
            lt: pbandk.wkt.Duration? = null,
            lte: pbandk.wkt.Duration? = null,
            gt: pbandk.wkt.Duration? = null,
            gte: pbandk.wkt.Duration? = null,
            `in`: List<pbandk.wkt.Duration> = emptyList(),
            notIn: List<pbandk.wkt.Duration> = emptyList(),
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.DurationRules = DurationRules_Impl(
            required = required,
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            `in` = `in`,
            notIn = notIn,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.DurationRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.DurationRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.DurationRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.DurationRules, *>>(8)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.DurationRules::required
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "const",
                        value = pbandk.testpb.DurationRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "lt",
                        value = pbandk.testpb.DurationRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "lte",
                        value = pbandk.testpb.DurationRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "gt",
                        value = pbandk.testpb.DurationRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "gte",
                        value = pbandk.testpb.DurationRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "in",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "in",
                        value = pbandk.testpb.DurationRules::`in`
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_in",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "notIn",
                        value = pbandk.testpb.DurationRules::notIn
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.DurationRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

sealed interface TimestampRules : pbandk.Message {
    val required: Boolean?
    val const: pbandk.wkt.Timestamp?
    val lt: pbandk.wkt.Timestamp?
    val lte: pbandk.wkt.Timestamp?
    val gt: pbandk.wkt.Timestamp?
    val gte: pbandk.wkt.Timestamp?
    val ltNow: Boolean?
    val gtNow: Boolean?
    val within: pbandk.wkt.Duration?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.TimestampRules
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TimestampRules>

    companion object : pbandk.Message.Companion<pbandk.testpb.TimestampRules> {
        operator fun invoke(
            required: Boolean? = null,
            const: pbandk.wkt.Timestamp? = null,
            lt: pbandk.wkt.Timestamp? = null,
            lte: pbandk.wkt.Timestamp? = null,
            gt: pbandk.wkt.Timestamp? = null,
            gte: pbandk.wkt.Timestamp? = null,
            ltNow: Boolean? = null,
            gtNow: Boolean? = null,
            within: pbandk.wkt.Duration? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.TimestampRules = TimestampRules_Impl(
            required = required,
            const = const,
            lt = lt,
            lte = lte,
            gt = gt,
            gte = gte,
            ltNow = ltNow,
            gtNow = gtNow,
            within = within,
            unknownFields = unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.TimestampRules() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TimestampRules.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TimestampRules> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TimestampRules, *>>(9)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "required",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "required",
                        value = pbandk.testpb.TimestampRules::required
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "const",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "const",
                        value = pbandk.testpb.TimestampRules::const
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "lt",
                        value = pbandk.testpb.TimestampRules::lt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lte",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "lte",
                        value = pbandk.testpb.TimestampRules::lte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "gt",
                        value = pbandk.testpb.TimestampRules::gt
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gte",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "gte",
                        value = pbandk.testpb.TimestampRules::gte
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "lt_now",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "ltNow",
                        value = pbandk.testpb.TimestampRules::ltNow
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "gt_now",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        jsonName = "gtNow",
                        value = pbandk.testpb.TimestampRules::gtNow
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "within",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "within",
                        value = pbandk.testpb.TimestampRules::within
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.TimestampRules::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

val pbandk.wkt.MessageOptions.disabled: Boolean? 
    get() = getExtension(pbandk.testpb.disabled)

val disabled = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.MessageOptions.Companion::descriptor,
    name = "disabled",
    number = 1071,
    type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
    jsonName = "disabled",
    value = pbandk.wkt.MessageOptions::disabled
)

val pbandk.wkt.OneofOptions.required: Boolean? 
    get() = getExtension(pbandk.testpb.required)

val required = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.OneofOptions.Companion::descriptor,
    name = "required",
    number = 1071,
    type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
    jsonName = "required",
    value = pbandk.wkt.OneofOptions::required
)

val pbandk.wkt.FieldOptions.rules: pbandk.testpb.FieldRules? 
    get() = getExtension(pbandk.testpb.rules)

val rules = pbandk.FieldDescriptor(
    messageDescriptor = pbandk.wkt.FieldOptions.Companion::descriptor,
    name = "rules",
    number = 1071,
    type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FieldRules.Companion),
    jsonName = "rules",
    value = pbandk.wkt.FieldOptions::rules
)

fun FieldRules?.orDefault() = this ?: FieldRules.defaultInstance

fun FieldRules.copy(
    message: pbandk.testpb.MessageRules? = this.message,
    type: pbandk.testpb.FieldRules.Type<*>? = this.type,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): FieldRules = (this as FieldRules_Impl).copy(
    message = message,
    type = type,
    unknownFields = unknownFields
)

private data class FieldRules_Impl(
    override val message: pbandk.testpb.MessageRules?,
    override val type: pbandk.testpb.FieldRules.Type<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FieldRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FieldRules.descriptor
    override val protoSize by lazy { super.protoSize }
    override val float: pbandk.testpb.FloatRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Float_)?.value
    override val double: pbandk.testpb.DoubleRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Double_)?.value
    override val int32: pbandk.testpb.Int32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Int32)?.value
    override val int64: pbandk.testpb.Int64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Int64)?.value
    override val uint32: pbandk.testpb.UInt32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Uint32)?.value
    override val uint64: pbandk.testpb.UInt64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Uint64)?.value
    override val sint32: pbandk.testpb.SInt32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sint32)?.value
    override val sint64: pbandk.testpb.SInt64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sint64)?.value
    override val fixed32: pbandk.testpb.Fixed32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Fixed32)?.value
    override val fixed64: pbandk.testpb.Fixed64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Fixed64)?.value
    override val sfixed32: pbandk.testpb.SFixed32Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sfixed32)?.value
    override val sfixed64: pbandk.testpb.SFixed64Rules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Sfixed64)?.value
    override val bool: pbandk.testpb.BoolRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Bool)?.value
    override val string: pbandk.testpb.StringRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.String_)?.value
    override val bytes: pbandk.testpb.BytesRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Bytes)?.value
    override val enum: pbandk.testpb.EnumRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Enum)?.value
    override val repeated: pbandk.testpb.RepeatedRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Repeated)?.value
    override val map: pbandk.testpb.MapRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Map_)?.value
    override val any: pbandk.testpb.AnyRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Any)?.value
    override val duration: pbandk.testpb.DurationRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Duration)?.value
    override val timestamp: pbandk.testpb.TimestampRules?
        get() = (type as? pbandk.testpb.FieldRules.Type.Timestamp)?.value
}

private fun FieldRules.protoMergeImpl(plus: pbandk.Message?): FieldRules = (plus as? FieldRules)?.let {
    it.copy(
        message = message?.plus(plus.message) ?: plus.message,
        type = when {
            type is FieldRules.Type.Float_ && plus.type is FieldRules.Type.Float_ ->
                FieldRules.Type.Float_((type as FieldRules.Type.Float_).value + (plus.type as FieldRules.Type.Float_).value)
            type is FieldRules.Type.Double_ && plus.type is FieldRules.Type.Double_ ->
                FieldRules.Type.Double_((type as FieldRules.Type.Double_).value + (plus.type as FieldRules.Type.Double_).value)
            type is FieldRules.Type.Int32 && plus.type is FieldRules.Type.Int32 ->
                FieldRules.Type.Int32((type as FieldRules.Type.Int32).value + (plus.type as FieldRules.Type.Int32).value)
            type is FieldRules.Type.Int64 && plus.type is FieldRules.Type.Int64 ->
                FieldRules.Type.Int64((type as FieldRules.Type.Int64).value + (plus.type as FieldRules.Type.Int64).value)
            type is FieldRules.Type.Uint32 && plus.type is FieldRules.Type.Uint32 ->
                FieldRules.Type.Uint32((type as FieldRules.Type.Uint32).value + (plus.type as FieldRules.Type.Uint32).value)
            type is FieldRules.Type.Uint64 && plus.type is FieldRules.Type.Uint64 ->
                FieldRules.Type.Uint64((type as FieldRules.Type.Uint64).value + (plus.type as FieldRules.Type.Uint64).value)
            type is FieldRules.Type.Sint32 && plus.type is FieldRules.Type.Sint32 ->
                FieldRules.Type.Sint32((type as FieldRules.Type.Sint32).value + (plus.type as FieldRules.Type.Sint32).value)
            type is FieldRules.Type.Sint64 && plus.type is FieldRules.Type.Sint64 ->
                FieldRules.Type.Sint64((type as FieldRules.Type.Sint64).value + (plus.type as FieldRules.Type.Sint64).value)
            type is FieldRules.Type.Fixed32 && plus.type is FieldRules.Type.Fixed32 ->
                FieldRules.Type.Fixed32((type as FieldRules.Type.Fixed32).value + (plus.type as FieldRules.Type.Fixed32).value)
            type is FieldRules.Type.Fixed64 && plus.type is FieldRules.Type.Fixed64 ->
                FieldRules.Type.Fixed64((type as FieldRules.Type.Fixed64).value + (plus.type as FieldRules.Type.Fixed64).value)
            type is FieldRules.Type.Sfixed32 && plus.type is FieldRules.Type.Sfixed32 ->
                FieldRules.Type.Sfixed32((type as FieldRules.Type.Sfixed32).value + (plus.type as FieldRules.Type.Sfixed32).value)
            type is FieldRules.Type.Sfixed64 && plus.type is FieldRules.Type.Sfixed64 ->
                FieldRules.Type.Sfixed64((type as FieldRules.Type.Sfixed64).value + (plus.type as FieldRules.Type.Sfixed64).value)
            type is FieldRules.Type.Bool && plus.type is FieldRules.Type.Bool ->
                FieldRules.Type.Bool((type as FieldRules.Type.Bool).value + (plus.type as FieldRules.Type.Bool).value)
            type is FieldRules.Type.String_ && plus.type is FieldRules.Type.String_ ->
                FieldRules.Type.String_((type as FieldRules.Type.String_).value + (plus.type as FieldRules.Type.String_).value)
            type is FieldRules.Type.Bytes && plus.type is FieldRules.Type.Bytes ->
                FieldRules.Type.Bytes((type as FieldRules.Type.Bytes).value + (plus.type as FieldRules.Type.Bytes).value)
            type is FieldRules.Type.Enum && plus.type is FieldRules.Type.Enum ->
                FieldRules.Type.Enum((type as FieldRules.Type.Enum).value + (plus.type as FieldRules.Type.Enum).value)
            type is FieldRules.Type.Repeated && plus.type is FieldRules.Type.Repeated ->
                FieldRules.Type.Repeated((type as FieldRules.Type.Repeated).value + (plus.type as FieldRules.Type.Repeated).value)
            type is FieldRules.Type.Map_ && plus.type is FieldRules.Type.Map_ ->
                FieldRules.Type.Map_((type as FieldRules.Type.Map_).value + (plus.type as FieldRules.Type.Map_).value)
            type is FieldRules.Type.Any && plus.type is FieldRules.Type.Any ->
                FieldRules.Type.Any((type as FieldRules.Type.Any).value + (plus.type as FieldRules.Type.Any).value)
            type is FieldRules.Type.Duration && plus.type is FieldRules.Type.Duration ->
                FieldRules.Type.Duration((type as FieldRules.Type.Duration).value + (plus.type as FieldRules.Type.Duration).value)
            type is FieldRules.Type.Timestamp && plus.type is FieldRules.Type.Timestamp ->
                FieldRules.Type.Timestamp((type as FieldRules.Type.Timestamp).value + (plus.type as FieldRules.Type.Timestamp).value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FieldRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FieldRules {
    var message: pbandk.testpb.MessageRules? = null
    var type: FieldRules.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = FieldRules.Type.Float_(_fieldValue as pbandk.testpb.FloatRules)
            2 -> type = FieldRules.Type.Double_(_fieldValue as pbandk.testpb.DoubleRules)
            3 -> type = FieldRules.Type.Int32(_fieldValue as pbandk.testpb.Int32Rules)
            4 -> type = FieldRules.Type.Int64(_fieldValue as pbandk.testpb.Int64Rules)
            5 -> type = FieldRules.Type.Uint32(_fieldValue as pbandk.testpb.UInt32Rules)
            6 -> type = FieldRules.Type.Uint64(_fieldValue as pbandk.testpb.UInt64Rules)
            7 -> type = FieldRules.Type.Sint32(_fieldValue as pbandk.testpb.SInt32Rules)
            8 -> type = FieldRules.Type.Sint64(_fieldValue as pbandk.testpb.SInt64Rules)
            9 -> type = FieldRules.Type.Fixed32(_fieldValue as pbandk.testpb.Fixed32Rules)
            10 -> type = FieldRules.Type.Fixed64(_fieldValue as pbandk.testpb.Fixed64Rules)
            11 -> type = FieldRules.Type.Sfixed32(_fieldValue as pbandk.testpb.SFixed32Rules)
            12 -> type = FieldRules.Type.Sfixed64(_fieldValue as pbandk.testpb.SFixed64Rules)
            13 -> type = FieldRules.Type.Bool(_fieldValue as pbandk.testpb.BoolRules)
            14 -> type = FieldRules.Type.String_(_fieldValue as pbandk.testpb.StringRules)
            15 -> type = FieldRules.Type.Bytes(_fieldValue as pbandk.testpb.BytesRules)
            16 -> type = FieldRules.Type.Enum(_fieldValue as pbandk.testpb.EnumRules)
            17 -> message = _fieldValue as pbandk.testpb.MessageRules
            18 -> type = FieldRules.Type.Repeated(_fieldValue as pbandk.testpb.RepeatedRules)
            19 -> type = FieldRules.Type.Map_(_fieldValue as pbandk.testpb.MapRules)
            20 -> type = FieldRules.Type.Any(_fieldValue as pbandk.testpb.AnyRules)
            21 -> type = FieldRules.Type.Duration(_fieldValue as pbandk.testpb.DurationRules)
            22 -> type = FieldRules.Type.Timestamp(_fieldValue as pbandk.testpb.TimestampRules)
        }
    }
    return FieldRules(message, type, unknownFields)
}

fun FloatRules?.orDefault() = this ?: FloatRules.defaultInstance

fun FloatRules.copy(
    const: Float? = this.const,
    lt: Float? = this.lt,
    lte: Float? = this.lte,
    gt: Float? = this.gt,
    gte: Float? = this.gte,
    `in`: List<Float> = this.`in`,
    notIn: List<Float> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): FloatRules = (this as FloatRules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class FloatRules_Impl(
    override val const: Float?,
    override val lt: Float?,
    override val lte: Float?,
    override val gt: Float?,
    override val gte: Float?,
    override val `in`: List<Float>,
    override val notIn: List<Float>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : FloatRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = FloatRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun FloatRules.protoMergeImpl(plus: pbandk.Message?): FloatRules = (plus as? FloatRules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun FloatRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FloatRules {
    var const: Float? = null
    var lt: Float? = null
    var lte: Float? = null
    var gt: Float? = null
    var gte: Float? = null
    var `in`: pbandk.ListWithSize.Builder<Float>? = null
    var notIn: pbandk.ListWithSize.Builder<Float>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Float
            2 -> lt = _fieldValue as Float
            3 -> lte = _fieldValue as Float
            4 -> gt = _fieldValue as Float
            5 -> gte = _fieldValue as Float
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
        }
    }
    return FloatRules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun DoubleRules?.orDefault() = this ?: DoubleRules.defaultInstance

fun DoubleRules.copy(
    const: Double? = this.const,
    lt: Double? = this.lt,
    lte: Double? = this.lte,
    gt: Double? = this.gt,
    gte: Double? = this.gte,
    `in`: List<Double> = this.`in`,
    notIn: List<Double> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): DoubleRules = (this as DoubleRules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class DoubleRules_Impl(
    override val const: Double?,
    override val lt: Double?,
    override val lte: Double?,
    override val gt: Double?,
    override val gte: Double?,
    override val `in`: List<Double>,
    override val notIn: List<Double>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : DoubleRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = DoubleRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun DoubleRules.protoMergeImpl(plus: pbandk.Message?): DoubleRules = (plus as? DoubleRules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DoubleRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DoubleRules {
    var const: Double? = null
    var lt: Double? = null
    var lte: Double? = null
    var gt: Double? = null
    var gte: Double? = null
    var `in`: pbandk.ListWithSize.Builder<Double>? = null
    var notIn: pbandk.ListWithSize.Builder<Double>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Double
            2 -> lt = _fieldValue as Double
            3 -> lte = _fieldValue as Double
            4 -> gt = _fieldValue as Double
            5 -> gte = _fieldValue as Double
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
        }
    }
    return DoubleRules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun Int32Rules?.orDefault() = this ?: Int32Rules.defaultInstance

fun Int32Rules.copy(
    const: Int? = this.const,
    lt: Int? = this.lt,
    lte: Int? = this.lte,
    gt: Int? = this.gt,
    gte: Int? = this.gte,
    `in`: List<Int> = this.`in`,
    notIn: List<Int> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): Int32Rules = (this as Int32Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class Int32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int32Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Int32Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Int32Rules.protoMergeImpl(plus: pbandk.Message?): Int32Rules = (plus as? Int32Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Int32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return Int32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun Int64Rules?.orDefault() = this ?: Int64Rules.defaultInstance

fun Int64Rules.copy(
    const: Long? = this.const,
    lt: Long? = this.lt,
    lte: Long? = this.lte,
    gt: Long? = this.gt,
    gte: Long? = this.gte,
    `in`: List<Long> = this.`in`,
    notIn: List<Long> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): Int64Rules = (this as Int64Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class Int64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Int64Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Int64Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Int64Rules.protoMergeImpl(plus: pbandk.Message?): Int64Rules = (plus as? Int64Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Int64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Int64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return Int64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun UInt32Rules?.orDefault() = this ?: UInt32Rules.defaultInstance

fun UInt32Rules.copy(
    const: Int? = this.const,
    lt: Int? = this.lt,
    lte: Int? = this.lte,
    gt: Int? = this.gt,
    gte: Int? = this.gte,
    `in`: List<Int> = this.`in`,
    notIn: List<Int> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): UInt32Rules = (this as UInt32Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class UInt32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt32Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = UInt32Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun UInt32Rules.protoMergeImpl(plus: pbandk.Message?): UInt32Rules = (plus as? UInt32Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return UInt32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun UInt64Rules?.orDefault() = this ?: UInt64Rules.defaultInstance

fun UInt64Rules.copy(
    const: Long? = this.const,
    lt: Long? = this.lt,
    lte: Long? = this.lte,
    gt: Long? = this.gt,
    gte: Long? = this.gte,
    `in`: List<Long> = this.`in`,
    notIn: List<Long> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): UInt64Rules = (this as UInt64Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class UInt64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : UInt64Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = UInt64Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun UInt64Rules.protoMergeImpl(plus: pbandk.Message?): UInt64Rules = (plus as? UInt64Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UInt64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UInt64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return UInt64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun SInt32Rules?.orDefault() = this ?: SInt32Rules.defaultInstance

fun SInt32Rules.copy(
    const: Int? = this.const,
    lt: Int? = this.lt,
    lte: Int? = this.lte,
    gt: Int? = this.gt,
    gte: Int? = this.gte,
    `in`: List<Int> = this.`in`,
    notIn: List<Int> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): SInt32Rules = (this as SInt32Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class SInt32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SInt32Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = SInt32Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun SInt32Rules.protoMergeImpl(plus: pbandk.Message?): SInt32Rules = (plus as? SInt32Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SInt32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SInt32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return SInt32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun SInt64Rules?.orDefault() = this ?: SInt64Rules.defaultInstance

fun SInt64Rules.copy(
    const: Long? = this.const,
    lt: Long? = this.lt,
    lte: Long? = this.lte,
    gt: Long? = this.gt,
    gte: Long? = this.gte,
    `in`: List<Long> = this.`in`,
    notIn: List<Long> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): SInt64Rules = (this as SInt64Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class SInt64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SInt64Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = SInt64Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun SInt64Rules.protoMergeImpl(plus: pbandk.Message?): SInt64Rules = (plus as? SInt64Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SInt64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SInt64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return SInt64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun Fixed32Rules?.orDefault() = this ?: Fixed32Rules.defaultInstance

fun Fixed32Rules.copy(
    const: Int? = this.const,
    lt: Int? = this.lt,
    lte: Int? = this.lte,
    gt: Int? = this.gt,
    gte: Int? = this.gte,
    `in`: List<Int> = this.`in`,
    notIn: List<Int> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): Fixed32Rules = (this as Fixed32Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class Fixed32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Fixed32Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Fixed32Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Fixed32Rules.protoMergeImpl(plus: pbandk.Message?): Fixed32Rules = (plus as? Fixed32Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Fixed32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Fixed32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return Fixed32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun Fixed64Rules?.orDefault() = this ?: Fixed64Rules.defaultInstance

fun Fixed64Rules.copy(
    const: Long? = this.const,
    lt: Long? = this.lt,
    lte: Long? = this.lte,
    gt: Long? = this.gt,
    gte: Long? = this.gte,
    `in`: List<Long> = this.`in`,
    notIn: List<Long> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): Fixed64Rules = (this as Fixed64Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class Fixed64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : Fixed64Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Fixed64Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun Fixed64Rules.protoMergeImpl(plus: pbandk.Message?): Fixed64Rules = (plus as? Fixed64Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Fixed64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Fixed64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return Fixed64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun SFixed32Rules?.orDefault() = this ?: SFixed32Rules.defaultInstance

fun SFixed32Rules.copy(
    const: Int? = this.const,
    lt: Int? = this.lt,
    lte: Int? = this.lte,
    gt: Int? = this.gt,
    gte: Int? = this.gte,
    `in`: List<Int> = this.`in`,
    notIn: List<Int> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): SFixed32Rules = (this as SFixed32Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class SFixed32Rules_Impl(
    override val const: Int?,
    override val lt: Int?,
    override val lte: Int?,
    override val gt: Int?,
    override val gte: Int?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SFixed32Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = SFixed32Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun SFixed32Rules.protoMergeImpl(plus: pbandk.Message?): SFixed32Rules = (plus as? SFixed32Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SFixed32Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SFixed32Rules {
    var const: Int? = null
    var lt: Int? = null
    var lte: Int? = null
    var gt: Int? = null
    var gte: Int? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> lt = _fieldValue as Int
            3 -> lte = _fieldValue as Int
            4 -> gt = _fieldValue as Int
            5 -> gte = _fieldValue as Int
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return SFixed32Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun SFixed64Rules?.orDefault() = this ?: SFixed64Rules.defaultInstance

fun SFixed64Rules.copy(
    const: Long? = this.const,
    lt: Long? = this.lt,
    lte: Long? = this.lte,
    gt: Long? = this.gt,
    gte: Long? = this.gte,
    `in`: List<Long> = this.`in`,
    notIn: List<Long> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): SFixed64Rules = (this as SFixed64Rules_Impl).copy(
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class SFixed64Rules_Impl(
    override val const: Long?,
    override val lt: Long?,
    override val lte: Long?,
    override val gt: Long?,
    override val gte: Long?,
    override val `in`: List<Long>,
    override val notIn: List<Long>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : SFixed64Rules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = SFixed64Rules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun SFixed64Rules.protoMergeImpl(plus: pbandk.Message?): SFixed64Rules = (plus as? SFixed64Rules)?.let {
    it.copy(
        const = plus.const ?: const,
        lt = plus.lt ?: lt,
        lte = plus.lte ?: lte,
        gt = plus.gt ?: gt,
        gte = plus.gte ?: gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SFixed64Rules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SFixed64Rules {
    var const: Long? = null
    var lt: Long? = null
    var lte: Long? = null
    var gt: Long? = null
    var gte: Long? = null
    var `in`: pbandk.ListWithSize.Builder<Long>? = null
    var notIn: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Long
            2 -> lt = _fieldValue as Long
            3 -> lte = _fieldValue as Long
            4 -> gt = _fieldValue as Long
            5 -> gte = _fieldValue as Long
            6 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            7 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return SFixed64Rules(const, lt, lte, gt,
        gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun BoolRules?.orDefault() = this ?: BoolRules.defaultInstance

fun BoolRules.copy(
    const: Boolean? = this.const,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): BoolRules = (this as BoolRules_Impl).copy(
    const = const,
    unknownFields = unknownFields
)

private data class BoolRules_Impl(
    override val const: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BoolRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = BoolRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun BoolRules.protoMergeImpl(plus: pbandk.Message?): BoolRules = (plus as? BoolRules)?.let {
    it.copy(
        const = plus.const ?: const,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun BoolRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BoolRules {
    var const: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Boolean
        }
    }
    return BoolRules(const, unknownFields)
}

fun StringRules?.orDefault() = this ?: StringRules.defaultInstance

fun StringRules.copy(
    const: String? = this.const,
    len: Long? = this.len,
    minLen: Long? = this.minLen,
    maxLen: Long? = this.maxLen,
    lenBytes: Long? = this.lenBytes,
    minBytes: Long? = this.minBytes,
    maxBytes: Long? = this.maxBytes,
    pattern: String? = this.pattern,
    prefix: String? = this.prefix,
    suffix: String? = this.suffix,
    contains: String? = this.contains,
    notContains: String? = this.notContains,
    `in`: List<String> = this.`in`,
    notIn: List<String> = this.notIn,
    strict: Boolean? = this.strict,
    wellKnown: pbandk.testpb.StringRules.WellKnown<*>? = this.wellKnown,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): StringRules = (this as StringRules_Impl).copy(
    const = const,
    len = len,
    minLen = minLen,
    maxLen = maxLen,
    lenBytes = lenBytes,
    minBytes = minBytes,
    maxBytes = maxBytes,
    pattern = pattern,
    prefix = prefix,
    suffix = suffix,
    contains = contains,
    notContains = notContains,
    `in` = `in`,
    notIn = notIn,
    strict = strict,
    wellKnown = wellKnown,
    unknownFields = unknownFields
)

private data class StringRules_Impl(
    override val const: String?,
    override val len: Long?,
    override val minLen: Long?,
    override val maxLen: Long?,
    override val lenBytes: Long?,
    override val minBytes: Long?,
    override val maxBytes: Long?,
    override val pattern: String?,
    override val prefix: String?,
    override val suffix: String?,
    override val contains: String?,
    override val notContains: String?,
    override val `in`: List<String>,
    override val notIn: List<String>,
    override val strict: Boolean?,
    override val wellKnown: pbandk.testpb.StringRules.WellKnown<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : StringRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = StringRules.descriptor
    override val protoSize by lazy { super.protoSize }
    override val email: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Email)?.value
    override val hostname: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Hostname)?.value
    override val ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ip)?.value
    override val ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ipv4)?.value
    override val ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Ipv6)?.value
    override val uri: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Uri)?.value
    override val uriRef: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.UriRef)?.value
    override val address: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Address)?.value
    override val uuid: Boolean?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.Uuid)?.value
    override val wellKnownRegex: pbandk.testpb.KnownRegex?
        get() = (wellKnown as? pbandk.testpb.StringRules.WellKnown.WellKnownRegex)?.value
}

private fun StringRules.protoMergeImpl(plus: pbandk.Message?): StringRules = (plus as? StringRules)?.let {
    it.copy(
        const = plus.const ?: const,
        len = plus.len ?: len,
        minLen = plus.minLen ?: minLen,
        maxLen = plus.maxLen ?: maxLen,
        lenBytes = plus.lenBytes ?: lenBytes,
        minBytes = plus.minBytes ?: minBytes,
        maxBytes = plus.maxBytes ?: maxBytes,
        pattern = plus.pattern ?: pattern,
        prefix = plus.prefix ?: prefix,
        suffix = plus.suffix ?: suffix,
        contains = plus.contains ?: contains,
        notContains = plus.notContains ?: notContains,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        strict = plus.strict ?: strict,
        wellKnown = plus.wellKnown ?: wellKnown,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun StringRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): StringRules {
    var const: String? = null
    var len: Long? = null
    var minLen: Long? = null
    var maxLen: Long? = null
    var lenBytes: Long? = null
    var minBytes: Long? = null
    var maxBytes: Long? = null
    var pattern: String? = null
    var prefix: String? = null
    var suffix: String? = null
    var contains: String? = null
    var notContains: String? = null
    var `in`: pbandk.ListWithSize.Builder<String>? = null
    var notIn: pbandk.ListWithSize.Builder<String>? = null
    var strict: Boolean? = null
    var wellKnown: StringRules.WellKnown<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as String
            2 -> minLen = _fieldValue as Long
            3 -> maxLen = _fieldValue as Long
            4 -> minBytes = _fieldValue as Long
            5 -> maxBytes = _fieldValue as Long
            6 -> pattern = _fieldValue as String
            7 -> prefix = _fieldValue as String
            8 -> suffix = _fieldValue as String
            9 -> contains = _fieldValue as String
            10 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            11 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            12 -> wellKnown = StringRules.WellKnown.Email(_fieldValue as Boolean)
            13 -> wellKnown = StringRules.WellKnown.Hostname(_fieldValue as Boolean)
            14 -> wellKnown = StringRules.WellKnown.Ip(_fieldValue as Boolean)
            15 -> wellKnown = StringRules.WellKnown.Ipv4(_fieldValue as Boolean)
            16 -> wellKnown = StringRules.WellKnown.Ipv6(_fieldValue as Boolean)
            17 -> wellKnown = StringRules.WellKnown.Uri(_fieldValue as Boolean)
            18 -> wellKnown = StringRules.WellKnown.UriRef(_fieldValue as Boolean)
            19 -> len = _fieldValue as Long
            20 -> lenBytes = _fieldValue as Long
            21 -> wellKnown = StringRules.WellKnown.Address(_fieldValue as Boolean)
            22 -> wellKnown = StringRules.WellKnown.Uuid(_fieldValue as Boolean)
            23 -> notContains = _fieldValue as String
            24 -> wellKnown = StringRules.WellKnown.WellKnownRegex(_fieldValue as pbandk.testpb.KnownRegex)
            25 -> strict = _fieldValue as Boolean
        }
    }
    return StringRules(const, len, minLen, maxLen,
        lenBytes, minBytes, maxBytes, pattern,
        prefix, suffix, contains, notContains,
        pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), strict, wellKnown, unknownFields)
}

fun BytesRules?.orDefault() = this ?: BytesRules.defaultInstance

fun BytesRules.copy(
    const: pbandk.ByteArr? = this.const,
    len: Long? = this.len,
    minLen: Long? = this.minLen,
    maxLen: Long? = this.maxLen,
    pattern: String? = this.pattern,
    prefix: pbandk.ByteArr? = this.prefix,
    suffix: pbandk.ByteArr? = this.suffix,
    contains: pbandk.ByteArr? = this.contains,
    `in`: List<pbandk.ByteArr> = this.`in`,
    notIn: List<pbandk.ByteArr> = this.notIn,
    wellKnown: pbandk.testpb.BytesRules.WellKnown<*>? = this.wellKnown,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): BytesRules = (this as BytesRules_Impl).copy(
    const = const,
    len = len,
    minLen = minLen,
    maxLen = maxLen,
    pattern = pattern,
    prefix = prefix,
    suffix = suffix,
    contains = contains,
    `in` = `in`,
    notIn = notIn,
    wellKnown = wellKnown,
    unknownFields = unknownFields
)

private data class BytesRules_Impl(
    override val const: pbandk.ByteArr?,
    override val len: Long?,
    override val minLen: Long?,
    override val maxLen: Long?,
    override val pattern: String?,
    override val prefix: pbandk.ByteArr?,
    override val suffix: pbandk.ByteArr?,
    override val contains: pbandk.ByteArr?,
    override val `in`: List<pbandk.ByteArr>,
    override val notIn: List<pbandk.ByteArr>,
    override val wellKnown: pbandk.testpb.BytesRules.WellKnown<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : BytesRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = BytesRules.descriptor
    override val protoSize by lazy { super.protoSize }
    override val ip: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ip)?.value
    override val ipv4: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv4)?.value
    override val ipv6: Boolean?
        get() = (wellKnown as? pbandk.testpb.BytesRules.WellKnown.Ipv6)?.value
}

private fun BytesRules.protoMergeImpl(plus: pbandk.Message?): BytesRules = (plus as? BytesRules)?.let {
    it.copy(
        const = plus.const ?: const,
        len = plus.len ?: len,
        minLen = plus.minLen ?: minLen,
        maxLen = plus.maxLen ?: maxLen,
        pattern = plus.pattern ?: pattern,
        prefix = plus.prefix ?: prefix,
        suffix = plus.suffix ?: suffix,
        contains = plus.contains ?: contains,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        wellKnown = plus.wellKnown ?: wellKnown,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun BytesRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): BytesRules {
    var const: pbandk.ByteArr? = null
    var len: Long? = null
    var minLen: Long? = null
    var maxLen: Long? = null
    var pattern: String? = null
    var prefix: pbandk.ByteArr? = null
    var suffix: pbandk.ByteArr? = null
    var contains: pbandk.ByteArr? = null
    var `in`: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var notIn: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var wellKnown: BytesRules.WellKnown<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as pbandk.ByteArr
            2 -> minLen = _fieldValue as Long
            3 -> maxLen = _fieldValue as Long
            4 -> pattern = _fieldValue as String
            5 -> prefix = _fieldValue as pbandk.ByteArr
            6 -> suffix = _fieldValue as pbandk.ByteArr
            7 -> contains = _fieldValue as pbandk.ByteArr
            8 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            9 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            10 -> wellKnown = BytesRules.WellKnown.Ip(_fieldValue as Boolean)
            11 -> wellKnown = BytesRules.WellKnown.Ipv4(_fieldValue as Boolean)
            12 -> wellKnown = BytesRules.WellKnown.Ipv6(_fieldValue as Boolean)
            13 -> len = _fieldValue as Long
        }
    }
    return BytesRules(const, len, minLen, maxLen,
        pattern, prefix, suffix, contains,
        pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), wellKnown, unknownFields)
}

fun EnumRules?.orDefault() = this ?: EnumRules.defaultInstance

fun EnumRules.copy(
    const: Int? = this.const,
    definedOnly: Boolean? = this.definedOnly,
    `in`: List<Int> = this.`in`,
    notIn: List<Int> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): EnumRules = (this as EnumRules_Impl).copy(
    const = const,
    definedOnly = definedOnly,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class EnumRules_Impl(
    override val const: Int?,
    override val definedOnly: Boolean?,
    override val `in`: List<Int>,
    override val notIn: List<Int>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : EnumRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = EnumRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun EnumRules.protoMergeImpl(plus: pbandk.Message?): EnumRules = (plus as? EnumRules)?.let {
    it.copy(
        const = plus.const ?: const,
        definedOnly = plus.definedOnly ?: definedOnly,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun EnumRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): EnumRules {
    var const: Int? = null
    var definedOnly: Boolean? = null
    var `in`: pbandk.ListWithSize.Builder<Int>? = null
    var notIn: pbandk.ListWithSize.Builder<Int>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> const = _fieldValue as Int
            2 -> definedOnly = _fieldValue as Boolean
            3 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            4 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
        }
    }
    return EnumRules(const, definedOnly, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun MessageRules?.orDefault() = this ?: MessageRules.defaultInstance

fun MessageRules.copy(
    skip: Boolean? = this.skip,
    required: Boolean? = this.required,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): MessageRules = (this as MessageRules_Impl).copy(
    skip = skip,
    required = required,
    unknownFields = unknownFields
)

private data class MessageRules_Impl(
    override val skip: Boolean?,
    override val required: Boolean?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MessageRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = MessageRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun MessageRules.protoMergeImpl(plus: pbandk.Message?): MessageRules = (plus as? MessageRules)?.let {
    it.copy(
        skip = plus.skip ?: skip,
        required = plus.required ?: required,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageRules {
    var skip: Boolean? = null
    var required: Boolean? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> skip = _fieldValue as Boolean
            2 -> required = _fieldValue as Boolean
        }
    }
    return MessageRules(skip, required, unknownFields)
}

fun RepeatedRules?.orDefault() = this ?: RepeatedRules.defaultInstance

fun RepeatedRules.copy(
    minItems: Long? = this.minItems,
    maxItems: Long? = this.maxItems,
    unique: Boolean? = this.unique,
    items: pbandk.testpb.FieldRules? = this.items,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): RepeatedRules = (this as RepeatedRules_Impl).copy(
    minItems = minItems,
    maxItems = maxItems,
    unique = unique,
    items = items,
    unknownFields = unknownFields
)

private data class RepeatedRules_Impl(
    override val minItems: Long?,
    override val maxItems: Long?,
    override val unique: Boolean?,
    override val items: pbandk.testpb.FieldRules?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : RepeatedRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = RepeatedRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun RepeatedRules.protoMergeImpl(plus: pbandk.Message?): RepeatedRules = (plus as? RepeatedRules)?.let {
    it.copy(
        minItems = plus.minItems ?: minItems,
        maxItems = plus.maxItems ?: maxItems,
        unique = plus.unique ?: unique,
        items = items?.plus(plus.items) ?: plus.items,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RepeatedRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RepeatedRules {
    var minItems: Long? = null
    var maxItems: Long? = null
    var unique: Boolean? = null
    var items: pbandk.testpb.FieldRules? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> minItems = _fieldValue as Long
            2 -> maxItems = _fieldValue as Long
            3 -> unique = _fieldValue as Boolean
            4 -> items = _fieldValue as pbandk.testpb.FieldRules
        }
    }
    return RepeatedRules(minItems, maxItems, unique, items, unknownFields)
}

fun MapRules?.orDefault() = this ?: MapRules.defaultInstance

fun MapRules.copy(
    minPairs: Long? = this.minPairs,
    maxPairs: Long? = this.maxPairs,
    noSparse: Boolean? = this.noSparse,
    keys: pbandk.testpb.FieldRules? = this.keys,
    values: pbandk.testpb.FieldRules? = this.values,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): MapRules = (this as MapRules_Impl).copy(
    minPairs = minPairs,
    maxPairs = maxPairs,
    noSparse = noSparse,
    keys = keys,
    values = values,
    unknownFields = unknownFields
)

private data class MapRules_Impl(
    override val minPairs: Long?,
    override val maxPairs: Long?,
    override val noSparse: Boolean?,
    override val keys: pbandk.testpb.FieldRules?,
    override val values: pbandk.testpb.FieldRules?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : MapRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = MapRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun MapRules.protoMergeImpl(plus: pbandk.Message?): MapRules = (plus as? MapRules)?.let {
    it.copy(
        minPairs = plus.minPairs ?: minPairs,
        maxPairs = plus.maxPairs ?: maxPairs,
        noSparse = plus.noSparse ?: noSparse,
        keys = keys?.plus(plus.keys) ?: plus.keys,
        values = values?.plus(plus.values) ?: plus.values,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MapRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MapRules {
    var minPairs: Long? = null
    var maxPairs: Long? = null
    var noSparse: Boolean? = null
    var keys: pbandk.testpb.FieldRules? = null
    var values: pbandk.testpb.FieldRules? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> minPairs = _fieldValue as Long
            2 -> maxPairs = _fieldValue as Long
            3 -> noSparse = _fieldValue as Boolean
            4 -> keys = _fieldValue as pbandk.testpb.FieldRules
            5 -> values = _fieldValue as pbandk.testpb.FieldRules
        }
    }
    return MapRules(minPairs, maxPairs, noSparse, keys,
        values, unknownFields)
}

fun AnyRules?.orDefault() = this ?: AnyRules.defaultInstance

fun AnyRules.copy(
    required: Boolean? = this.required,
    `in`: List<String> = this.`in`,
    notIn: List<String> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): AnyRules = (this as AnyRules_Impl).copy(
    required = required,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class AnyRules_Impl(
    override val required: Boolean?,
    override val `in`: List<String>,
    override val notIn: List<String>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : AnyRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = AnyRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun AnyRules.protoMergeImpl(plus: pbandk.Message?): AnyRules = (plus as? AnyRules)?.let {
    it.copy(
        required = plus.required ?: required,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AnyRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AnyRules {
    var required: Boolean? = null
    var `in`: pbandk.ListWithSize.Builder<String>? = null
    var notIn: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> required = _fieldValue as Boolean
            2 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            3 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
        }
    }
    return AnyRules(required, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun DurationRules?.orDefault() = this ?: DurationRules.defaultInstance

fun DurationRules.copy(
    required: Boolean? = this.required,
    const: pbandk.wkt.Duration? = this.const,
    lt: pbandk.wkt.Duration? = this.lt,
    lte: pbandk.wkt.Duration? = this.lte,
    gt: pbandk.wkt.Duration? = this.gt,
    gte: pbandk.wkt.Duration? = this.gte,
    `in`: List<pbandk.wkt.Duration> = this.`in`,
    notIn: List<pbandk.wkt.Duration> = this.notIn,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): DurationRules = (this as DurationRules_Impl).copy(
    required = required,
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    `in` = `in`,
    notIn = notIn,
    unknownFields = unknownFields
)

private data class DurationRules_Impl(
    override val required: Boolean?,
    override val const: pbandk.wkt.Duration?,
    override val lt: pbandk.wkt.Duration?,
    override val lte: pbandk.wkt.Duration?,
    override val gt: pbandk.wkt.Duration?,
    override val gte: pbandk.wkt.Duration?,
    override val `in`: List<pbandk.wkt.Duration>,
    override val notIn: List<pbandk.wkt.Duration>,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : DurationRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = DurationRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun DurationRules.protoMergeImpl(plus: pbandk.Message?): DurationRules = (plus as? DurationRules)?.let {
    it.copy(
        required = plus.required ?: required,
        const = const?.plus(plus.const) ?: plus.const,
        lt = lt?.plus(plus.lt) ?: plus.lt,
        lte = lte?.plus(plus.lte) ?: plus.lte,
        gt = gt?.plus(plus.gt) ?: plus.gt,
        gte = gte?.plus(plus.gte) ?: plus.gte,
        `in` = `in` + plus.`in`,
        notIn = notIn + plus.notIn,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DurationRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DurationRules {
    var required: Boolean? = null
    var const: pbandk.wkt.Duration? = null
    var lt: pbandk.wkt.Duration? = null
    var lte: pbandk.wkt.Duration? = null
    var gt: pbandk.wkt.Duration? = null
    var gte: pbandk.wkt.Duration? = null
    var `in`: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null
    var notIn: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> required = _fieldValue as Boolean
            2 -> const = _fieldValue as pbandk.wkt.Duration
            3 -> lt = _fieldValue as pbandk.wkt.Duration
            4 -> lte = _fieldValue as pbandk.wkt.Duration
            5 -> gt = _fieldValue as pbandk.wkt.Duration
            6 -> gte = _fieldValue as pbandk.wkt.Duration
            7 -> `in` = (`in` ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
            8 -> notIn = (notIn ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
        }
    }
    return DurationRules(required, const, lt, lte,
        gt, gte, pbandk.ListWithSize.Builder.fixed(`in`), pbandk.ListWithSize.Builder.fixed(notIn), unknownFields)
}

fun TimestampRules?.orDefault() = this ?: TimestampRules.defaultInstance

fun TimestampRules.copy(
    required: Boolean? = this.required,
    const: pbandk.wkt.Timestamp? = this.const,
    lt: pbandk.wkt.Timestamp? = this.lt,
    lte: pbandk.wkt.Timestamp? = this.lte,
    gt: pbandk.wkt.Timestamp? = this.gt,
    gte: pbandk.wkt.Timestamp? = this.gte,
    ltNow: Boolean? = this.ltNow,
    gtNow: Boolean? = this.gtNow,
    within: pbandk.wkt.Duration? = this.within,
    unknownFields: Map<Int, pbandk.UnknownField> = this.unknownFields
): TimestampRules = (this as TimestampRules_Impl).copy(
    required = required,
    const = const,
    lt = lt,
    lte = lte,
    gt = gt,
    gte = gte,
    ltNow = ltNow,
    gtNow = gtNow,
    within = within,
    unknownFields = unknownFields
)

private data class TimestampRules_Impl(
    override val required: Boolean?,
    override val const: pbandk.wkt.Timestamp?,
    override val lt: pbandk.wkt.Timestamp?,
    override val lte: pbandk.wkt.Timestamp?,
    override val gt: pbandk.wkt.Timestamp?,
    override val gte: pbandk.wkt.Timestamp?,
    override val ltNow: Boolean?,
    override val gtNow: Boolean?,
    override val within: pbandk.wkt.Duration?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TimestampRules {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TimestampRules.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TimestampRules.protoMergeImpl(plus: pbandk.Message?): TimestampRules = (plus as? TimestampRules)?.let {
    it.copy(
        required = plus.required ?: required,
        const = const?.plus(plus.const) ?: plus.const,
        lt = lt?.plus(plus.lt) ?: plus.lt,
        lte = lte?.plus(plus.lte) ?: plus.lte,
        gt = gt?.plus(plus.gt) ?: plus.gt,
        gte = gte?.plus(plus.gte) ?: plus.gte,
        ltNow = plus.ltNow ?: ltNow,
        gtNow = plus.gtNow ?: gtNow,
        within = within?.plus(plus.within) ?: plus.within,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TimestampRules.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TimestampRules {
    var required: Boolean? = null
    var const: pbandk.wkt.Timestamp? = null
    var lt: pbandk.wkt.Timestamp? = null
    var lte: pbandk.wkt.Timestamp? = null
    var gt: pbandk.wkt.Timestamp? = null
    var gte: pbandk.wkt.Timestamp? = null
    var ltNow: Boolean? = null
    var gtNow: Boolean? = null
    var within: pbandk.wkt.Duration? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> required = _fieldValue as Boolean
            2 -> const = _fieldValue as pbandk.wkt.Timestamp
            3 -> lt = _fieldValue as pbandk.wkt.Timestamp
            4 -> lte = _fieldValue as pbandk.wkt.Timestamp
            5 -> gt = _fieldValue as pbandk.wkt.Timestamp
            6 -> gte = _fieldValue as pbandk.wkt.Timestamp
            7 -> ltNow = _fieldValue as Boolean
            8 -> gtNow = _fieldValue as Boolean
            9 -> within = _fieldValue as pbandk.wkt.Duration
        }
    }
    return TimestampRules(required, const, lt, lte,
        gt, gte, ltNow, gtNow,
        within, unknownFields)
}
