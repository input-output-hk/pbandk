@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

sealed class ForeignEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
    override fun equals(other: kotlin.Any?) = other is pbandk.testpb.ForeignEnum && other.value == value
    override fun hashCode() = value.hashCode()
    override fun toString() = "ForeignEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

    object FOREIGN_FOO : ForeignEnum(0, "FOREIGN_FOO")
    object FOREIGN_BAR : ForeignEnum(1, "FOREIGN_BAR")
    object FOREIGN_BAZ : ForeignEnum(2, "FOREIGN_BAZ")
    class UNRECOGNIZED(value: Int) : pbandk.testpb.ForeignEnum(value)

    companion object : pbandk.Message.Enum.Companion<pbandk.testpb.ForeignEnum> {
        val values: List<pbandk.testpb.ForeignEnum> by lazy { listOf(FOREIGN_FOO, FOREIGN_BAR, FOREIGN_BAZ) }
        override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
        override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No ForeignEnum with name: $name")
    }
}

interface TestAllTypesProto3 : pbandk.Message {
    val optionalInt32: Int
    val optionalInt64: Long
    val optionalUint32: Int
    val optionalUint64: Long
    val optionalSint32: Int
    val optionalSint64: Long
    val optionalFixed32: Int
    val optionalFixed64: Long
    val optionalSfixed32: Int
    val optionalSfixed64: Long
    val optionalFloat: Float
    val optionalDouble: Double
    val optionalBool: Boolean
    val optionalString: String
    val optionalBytes: pbandk.ByteArr
    val optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage?
    val optionalForeignMessage: pbandk.testpb.ForeignMessage?
    val optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum
    val optionalForeignEnum: pbandk.testpb.ForeignEnum
    val optionalAliasedEnum: pbandk.testpb.TestAllTypesProto3.AliasedEnum
    val optionalStringPiece: String
    val optionalCord: String
    val recursiveMessage: pbandk.testpb.TestAllTypesProto3?
    val repeatedInt32: List<Int>
    val repeatedInt64: List<Long>
    val repeatedUint32: List<Int>
    val repeatedUint64: List<Long>
    val repeatedSint32: List<Int>
    val repeatedSint64: List<Long>
    val repeatedFixed32: List<Int>
    val repeatedFixed64: List<Long>
    val repeatedSfixed32: List<Int>
    val repeatedSfixed64: List<Long>
    val repeatedFloat: List<Float>
    val repeatedDouble: List<Double>
    val repeatedBool: List<Boolean>
    val repeatedString: List<String>
    val repeatedBytes: List<pbandk.ByteArr>
    val repeatedNestedMessage: List<pbandk.testpb.TestAllTypesProto3.NestedMessage>
    val repeatedForeignMessage: List<pbandk.testpb.ForeignMessage>
    val repeatedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum>
    val repeatedForeignEnum: List<pbandk.testpb.ForeignEnum>
    val repeatedStringPiece: List<String>
    val repeatedCord: List<String>
    val packedInt32: List<Int>
    val packedInt64: List<Long>
    val packedUint32: List<Int>
    val packedUint64: List<Long>
    val packedSint32: List<Int>
    val packedSint64: List<Long>
    val packedFixed32: List<Int>
    val packedFixed64: List<Long>
    val packedSfixed32: List<Int>
    val packedSfixed64: List<Long>
    val packedFloat: List<Float>
    val packedDouble: List<Double>
    val packedBool: List<Boolean>
    val packedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum>
    val unpackedInt32: List<Int>
    val unpackedInt64: List<Long>
    val unpackedUint32: List<Int>
    val unpackedUint64: List<Long>
    val unpackedSint32: List<Int>
    val unpackedSint64: List<Long>
    val unpackedFixed32: List<Int>
    val unpackedFixed64: List<Long>
    val unpackedSfixed32: List<Int>
    val unpackedSfixed64: List<Long>
    val unpackedFloat: List<Float>
    val unpackedDouble: List<Double>
    val unpackedBool: List<Boolean>
    val unpackedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum>
    val mapInt32Int32: Map<Int, Int>
    val mapInt64Int64: Map<Long, Long>
    val mapUint32Uint32: Map<Int, Int>
    val mapUint64Uint64: Map<Long, Long>
    val mapSint32Sint32: Map<Int, Int>
    val mapSint64Sint64: Map<Long, Long>
    val mapFixed32Fixed32: Map<Int, Int>
    val mapFixed64Fixed64: Map<Long, Long>
    val mapSfixed32Sfixed32: Map<Int, Int>
    val mapSfixed64Sfixed64: Map<Long, Long>
    val mapInt32Float: Map<Int, Float>
    val mapInt32Double: Map<Int, Double>
    val mapBoolBool: Map<Boolean, Boolean>
    val mapStringString: Map<String, String>
    val mapStringBytes: Map<String, pbandk.ByteArr>
    val mapStringNestedMessage: Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>
    val mapStringForeignMessage: Map<String, pbandk.testpb.ForeignMessage?>
    val mapStringNestedEnum: Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>
    val mapStringForeignEnum: Map<String, pbandk.testpb.ForeignEnum>
    val optionalBoolWrapper: Boolean?
    val optionalInt32Wrapper: Int?
    val optionalInt64Wrapper: Long?
    val optionalUint32Wrapper: Int?
    val optionalUint64Wrapper: Long?
    val optionalFloatWrapper: Float?
    val optionalDoubleWrapper: Double?
    val optionalStringWrapper: String?
    val optionalBytesWrapper: pbandk.ByteArr?
    val repeatedBoolWrapper: List<Boolean>
    val repeatedInt32Wrapper: List<Int>
    val repeatedInt64Wrapper: List<Long>
    val repeatedUint32Wrapper: List<Int>
    val repeatedUint64Wrapper: List<Long>
    val repeatedFloatWrapper: List<Float>
    val repeatedDoubleWrapper: List<Double>
    val repeatedStringWrapper: List<String>
    val repeatedBytesWrapper: List<pbandk.ByteArr>
    val optionalDuration: pbandk.wkt.Duration?
    val optionalTimestamp: pbandk.wkt.Timestamp?
    val optionalFieldMask: pbandk.wkt.FieldMask?
    val optionalStruct: pbandk.wkt.Struct?
    val optionalAny: pbandk.wkt.Any?
    val optionalValue: pbandk.wkt.Value?
    val repeatedDuration: List<pbandk.wkt.Duration>
    val repeatedTimestamp: List<pbandk.wkt.Timestamp>
    val repeatedFieldmask: List<pbandk.wkt.FieldMask>
    val repeatedStruct: List<pbandk.wkt.Struct>
    val repeatedAny: List<pbandk.wkt.Any>
    val repeatedValue: List<pbandk.wkt.Value>
    val repeatedListValue: List<pbandk.wkt.ListValue>
    val fieldname1: Int
    val fieldName2: Int
    val fieldName3: Int
    val field_name4: Int
    val field0name5: Int
    val field0Name6: Int
    val fieldName7: Int
    val fieldName8: Int
    val fieldName9: Int
    val fieldName10: Int
    val fIELDNAME11: Int
    val fIELDName12: Int
    val _fieldName13: Int
    val _FieldName14: Int
    val field_name15: Int
    val field_Name16: Int
    val fieldName17_: Int
    val fieldName18_: Int
    val oneofField: OneofField<*>?

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3>

    sealed class OneofField<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        class OneofUint32(oneofUint32: Int = 0) : OneofField<Int>(oneofUint32)
        class OneofNestedMessage(oneofNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage) : OneofField<pbandk.testpb.TestAllTypesProto3.NestedMessage>(oneofNestedMessage)
        class OneofString(oneofString: String = "") : OneofField<String>(oneofString)
        class OneofBytes(oneofBytes: pbandk.ByteArr = pbandk.ByteArr.empty) : OneofField<pbandk.ByteArr>(oneofBytes)
        class OneofBool(oneofBool: Boolean = false) : OneofField<Boolean>(oneofBool)
        class OneofUint64(oneofUint64: Long = 0L) : OneofField<Long>(oneofUint64)
        class OneofFloat(oneofFloat: Float = 0.0F) : OneofField<Float>(oneofFloat)
        class OneofDouble(oneofDouble: Double = 0.0) : OneofField<Double>(oneofDouble)
        class OneofEnum(oneofEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0)) : OneofField<pbandk.testpb.TestAllTypesProto3.NestedEnum>(oneofEnum)
    }

    val oneofUint32: Int?
    val oneofNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage?
    val oneofString: String?
    val oneofBytes: pbandk.ByteArr?
    val oneofBool: Boolean?
    val oneofUint64: Long?
    val oneofFloat: Float?
    val oneofDouble: Double?
    val oneofEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum?

    companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3> {
        operator fun invoke(
            optionalInt32: Int = 0,
            optionalInt64: Long = 0L,
            optionalUint32: Int = 0,
            optionalUint64: Long = 0L,
            optionalSint32: Int = 0,
            optionalSint64: Long = 0L,
            optionalFixed32: Int = 0,
            optionalFixed64: Long = 0L,
            optionalSfixed32: Int = 0,
            optionalSfixed64: Long = 0L,
            optionalFloat: Float = 0.0F,
            optionalDouble: Double = 0.0,
            optionalBool: Boolean = false,
            optionalString: String = "",
            optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
            optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null,
            optionalForeignMessage: pbandk.testpb.ForeignMessage? = null,
            optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0),
            optionalForeignEnum: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0),
            optionalAliasedEnum: pbandk.testpb.TestAllTypesProto3.AliasedEnum = pbandk.testpb.TestAllTypesProto3.AliasedEnum.fromValue(0),
            optionalStringPiece: String = "",
            optionalCord: String = "",
            recursiveMessage: pbandk.testpb.TestAllTypesProto3? = null,
            repeatedInt32: List<Int> = emptyList(),
            repeatedInt64: List<Long> = emptyList(),
            repeatedUint32: List<Int> = emptyList(),
            repeatedUint64: List<Long> = emptyList(),
            repeatedSint32: List<Int> = emptyList(),
            repeatedSint64: List<Long> = emptyList(),
            repeatedFixed32: List<Int> = emptyList(),
            repeatedFixed64: List<Long> = emptyList(),
            repeatedSfixed32: List<Int> = emptyList(),
            repeatedSfixed64: List<Long> = emptyList(),
            repeatedFloat: List<Float> = emptyList(),
            repeatedDouble: List<Double> = emptyList(),
            repeatedBool: List<Boolean> = emptyList(),
            repeatedString: List<String> = emptyList(),
            repeatedBytes: List<pbandk.ByteArr> = emptyList(),
            repeatedNestedMessage: List<pbandk.testpb.TestAllTypesProto3.NestedMessage> = emptyList(),
            repeatedForeignMessage: List<pbandk.testpb.ForeignMessage> = emptyList(),
            repeatedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
            repeatedForeignEnum: List<pbandk.testpb.ForeignEnum> = emptyList(),
            repeatedStringPiece: List<String> = emptyList(),
            repeatedCord: List<String> = emptyList(),
            packedInt32: List<Int> = emptyList(),
            packedInt64: List<Long> = emptyList(),
            packedUint32: List<Int> = emptyList(),
            packedUint64: List<Long> = emptyList(),
            packedSint32: List<Int> = emptyList(),
            packedSint64: List<Long> = emptyList(),
            packedFixed32: List<Int> = emptyList(),
            packedFixed64: List<Long> = emptyList(),
            packedSfixed32: List<Int> = emptyList(),
            packedSfixed64: List<Long> = emptyList(),
            packedFloat: List<Float> = emptyList(),
            packedDouble: List<Double> = emptyList(),
            packedBool: List<Boolean> = emptyList(),
            packedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
            unpackedInt32: List<Int> = emptyList(),
            unpackedInt64: List<Long> = emptyList(),
            unpackedUint32: List<Int> = emptyList(),
            unpackedUint64: List<Long> = emptyList(),
            unpackedSint32: List<Int> = emptyList(),
            unpackedSint64: List<Long> = emptyList(),
            unpackedFixed32: List<Int> = emptyList(),
            unpackedFixed64: List<Long> = emptyList(),
            unpackedSfixed32: List<Int> = emptyList(),
            unpackedSfixed64: List<Long> = emptyList(),
            unpackedFloat: List<Float> = emptyList(),
            unpackedDouble: List<Double> = emptyList(),
            unpackedBool: List<Boolean> = emptyList(),
            unpackedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
            mapInt32Int32: Map<Int, Int> = emptyMap(),
            mapInt64Int64: Map<Long, Long> = emptyMap(),
            mapUint32Uint32: Map<Int, Int> = emptyMap(),
            mapUint64Uint64: Map<Long, Long> = emptyMap(),
            mapSint32Sint32: Map<Int, Int> = emptyMap(),
            mapSint64Sint64: Map<Long, Long> = emptyMap(),
            mapFixed32Fixed32: Map<Int, Int> = emptyMap(),
            mapFixed64Fixed64: Map<Long, Long> = emptyMap(),
            mapSfixed32Sfixed32: Map<Int, Int> = emptyMap(),
            mapSfixed64Sfixed64: Map<Long, Long> = emptyMap(),
            mapInt32Float: Map<Int, Float> = emptyMap(),
            mapInt32Double: Map<Int, Double> = emptyMap(),
            mapBoolBool: Map<Boolean, Boolean> = emptyMap(),
            mapStringString: Map<String, String> = emptyMap(),
            mapStringBytes: Map<String, pbandk.ByteArr> = emptyMap(),
            mapStringNestedMessage: Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?> = emptyMap(),
            mapStringForeignMessage: Map<String, pbandk.testpb.ForeignMessage?> = emptyMap(),
            mapStringNestedEnum: Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyMap(),
            mapStringForeignEnum: Map<String, pbandk.testpb.ForeignEnum> = emptyMap(),
            optionalBoolWrapper: Boolean? = null,
            optionalInt32Wrapper: Int? = null,
            optionalInt64Wrapper: Long? = null,
            optionalUint32Wrapper: Int? = null,
            optionalUint64Wrapper: Long? = null,
            optionalFloatWrapper: Float? = null,
            optionalDoubleWrapper: Double? = null,
            optionalStringWrapper: String? = null,
            optionalBytesWrapper: pbandk.ByteArr? = null,
            repeatedBoolWrapper: List<Boolean> = emptyList(),
            repeatedInt32Wrapper: List<Int> = emptyList(),
            repeatedInt64Wrapper: List<Long> = emptyList(),
            repeatedUint32Wrapper: List<Int> = emptyList(),
            repeatedUint64Wrapper: List<Long> = emptyList(),
            repeatedFloatWrapper: List<Float> = emptyList(),
            repeatedDoubleWrapper: List<Double> = emptyList(),
            repeatedStringWrapper: List<String> = emptyList(),
            repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
            optionalDuration: pbandk.wkt.Duration? = null,
            optionalTimestamp: pbandk.wkt.Timestamp? = null,
            optionalFieldMask: pbandk.wkt.FieldMask? = null,
            optionalStruct: pbandk.wkt.Struct? = null,
            optionalAny: pbandk.wkt.Any? = null,
            optionalValue: pbandk.wkt.Value? = null,
            repeatedDuration: List<pbandk.wkt.Duration> = emptyList(),
            repeatedTimestamp: List<pbandk.wkt.Timestamp> = emptyList(),
            repeatedFieldmask: List<pbandk.wkt.FieldMask> = emptyList(),
            repeatedStruct: List<pbandk.wkt.Struct> = emptyList(),
            repeatedAny: List<pbandk.wkt.Any> = emptyList(),
            repeatedValue: List<pbandk.wkt.Value> = emptyList(),
            repeatedListValue: List<pbandk.wkt.ListValue> = emptyList(),
            fieldname1: Int = 0,
            fieldName2: Int = 0,
            fieldName3: Int = 0,
            field_name4: Int = 0,
            field0name5: Int = 0,
            field0Name6: Int = 0,
            fieldName7: Int = 0,
            fieldName8: Int = 0,
            fieldName9: Int = 0,
            fieldName10: Int = 0,
            fIELDNAME11: Int = 0,
            fIELDName12: Int = 0,
            _fieldName13: Int = 0,
            _FieldName14: Int = 0,
            field_name15: Int = 0,
            field_Name16: Int = 0,
            fieldName17_: Int = 0,
            fieldName18_: Int = 0,
            oneofField: OneofField<*>? = null,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.TestAllTypesProto3 = TestAllTypesProto3_Impl(
            optionalInt32,
            optionalInt64,
            optionalUint32,
            optionalUint64,
            optionalSint32,
            optionalSint64,
            optionalFixed32,
            optionalFixed64,
            optionalSfixed32,
            optionalSfixed64,
            optionalFloat,
            optionalDouble,
            optionalBool,
            optionalString,
            optionalBytes,
            optionalNestedMessage,
            optionalForeignMessage,
            optionalNestedEnum,
            optionalForeignEnum,
            optionalAliasedEnum,
            optionalStringPiece,
            optionalCord,
            recursiveMessage,
            repeatedInt32,
            repeatedInt64,
            repeatedUint32,
            repeatedUint64,
            repeatedSint32,
            repeatedSint64,
            repeatedFixed32,
            repeatedFixed64,
            repeatedSfixed32,
            repeatedSfixed64,
            repeatedFloat,
            repeatedDouble,
            repeatedBool,
            repeatedString,
            repeatedBytes,
            repeatedNestedMessage,
            repeatedForeignMessage,
            repeatedNestedEnum,
            repeatedForeignEnum,
            repeatedStringPiece,
            repeatedCord,
            packedInt32,
            packedInt64,
            packedUint32,
            packedUint64,
            packedSint32,
            packedSint64,
            packedFixed32,
            packedFixed64,
            packedSfixed32,
            packedSfixed64,
            packedFloat,
            packedDouble,
            packedBool,
            packedNestedEnum,
            unpackedInt32,
            unpackedInt64,
            unpackedUint32,
            unpackedUint64,
            unpackedSint32,
            unpackedSint64,
            unpackedFixed32,
            unpackedFixed64,
            unpackedSfixed32,
            unpackedSfixed64,
            unpackedFloat,
            unpackedDouble,
            unpackedBool,
            unpackedNestedEnum,
            mapInt32Int32,
            mapInt64Int64,
            mapUint32Uint32,
            mapUint64Uint64,
            mapSint32Sint32,
            mapSint64Sint64,
            mapFixed32Fixed32,
            mapFixed64Fixed64,
            mapSfixed32Sfixed32,
            mapSfixed64Sfixed64,
            mapInt32Float,
            mapInt32Double,
            mapBoolBool,
            mapStringString,
            mapStringBytes,
            mapStringNestedMessage,
            mapStringForeignMessage,
            mapStringNestedEnum,
            mapStringForeignEnum,
            optionalBoolWrapper,
            optionalInt32Wrapper,
            optionalInt64Wrapper,
            optionalUint32Wrapper,
            optionalUint64Wrapper,
            optionalFloatWrapper,
            optionalDoubleWrapper,
            optionalStringWrapper,
            optionalBytesWrapper,
            repeatedBoolWrapper,
            repeatedInt32Wrapper,
            repeatedInt64Wrapper,
            repeatedUint32Wrapper,
            repeatedUint64Wrapper,
            repeatedFloatWrapper,
            repeatedDoubleWrapper,
            repeatedStringWrapper,
            repeatedBytesWrapper,
            optionalDuration,
            optionalTimestamp,
            optionalFieldMask,
            optionalStruct,
            optionalAny,
            optionalValue,
            repeatedDuration,
            repeatedTimestamp,
            repeatedFieldmask,
            repeatedStruct,
            repeatedAny,
            repeatedValue,
            repeatedListValue,
            fieldname1,
            fieldName2,
            fieldName3,
            field_name4,
            field0name5,
            field0Name6,
            fieldName7,
            fieldName8,
            fieldName9,
            fieldName10,
            fIELDNAME11,
            fIELDName12,
            _fieldName13,
            _FieldName14,
            field_name15,
            field_Name16,
            fieldName17_,
            fieldName18_,
            oneofField,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3, *>>(149)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "optionalInt32",
                        value = pbandk.testpb.TestAllTypesProto3::optionalInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                        jsonName = "optionalInt64",
                        value = pbandk.testpb.TestAllTypesProto3::optionalInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                        jsonName = "optionalUint32",
                        value = pbandk.testpb.TestAllTypesProto3::optionalUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "optionalUint64",
                        value = pbandk.testpb.TestAllTypesProto3::optionalUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint32",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                        jsonName = "optionalSint32",
                        value = pbandk.testpb.TestAllTypesProto3::optionalSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sint64",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                        jsonName = "optionalSint64",
                        value = pbandk.testpb.TestAllTypesProto3::optionalSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed32",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                        jsonName = "optionalFixed32",
                        value = pbandk.testpb.TestAllTypesProto3::optionalFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_fixed64",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                        jsonName = "optionalFixed64",
                        value = pbandk.testpb.TestAllTypesProto3::optionalFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed32",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                        jsonName = "optionalSfixed32",
                        value = pbandk.testpb.TestAllTypesProto3::optionalSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_sfixed64",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                        jsonName = "optionalSfixed64",
                        value = pbandk.testpb.TestAllTypesProto3::optionalSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                        jsonName = "optionalFloat",
                        value = pbandk.testpb.TestAllTypesProto3::optionalFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                        jsonName = "optionalDouble",
                        value = pbandk.testpb.TestAllTypesProto3::optionalDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                        jsonName = "optionalBool",
                        value = pbandk.testpb.TestAllTypesProto3::optionalBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string",
                        number = 14,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalString",
                        value = pbandk.testpb.TestAllTypesProto3::optionalString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes",
                        number = 15,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "optionalBytes",
                        value = pbandk.testpb.TestAllTypesProto3::optionalBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_message",
                        number = 18,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion),
                        jsonName = "optionalNestedMessage",
                        value = pbandk.testpb.TestAllTypesProto3::optionalNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_message",
                        number = 19,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                        jsonName = "optionalForeignMessage",
                        value = pbandk.testpb.TestAllTypesProto3::optionalForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_nested_enum",
                        number = 21,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion),
                        jsonName = "optionalNestedEnum",
                        value = pbandk.testpb.TestAllTypesProto3::optionalNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_foreign_enum",
                        number = 22,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion),
                        jsonName = "optionalForeignEnum",
                        value = pbandk.testpb.TestAllTypesProto3::optionalForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_aliased_enum",
                        number = 23,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.AliasedEnum.Companion),
                        jsonName = "optionalAliasedEnum",
                        value = pbandk.testpb.TestAllTypesProto3::optionalAliasedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_piece",
                        number = 24,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalStringPiece",
                        value = pbandk.testpb.TestAllTypesProto3::optionalStringPiece
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_cord",
                        number = 25,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "optionalCord",
                        value = pbandk.testpb.TestAllTypesProto3::optionalCord
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "recursive_message",
                        number = 27,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.Companion),
                        jsonName = "recursiveMessage",
                        value = pbandk.testpb.TestAllTypesProto3::recursiveMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32",
                        number = 31,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "repeatedInt32",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64",
                        number = 32,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "repeatedInt64",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32",
                        number = 33,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "repeatedUint32",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64",
                        number = 34,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "repeatedUint64",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint32",
                        number = 35,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "repeatedSint32",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sint64",
                        number = 36,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "repeatedSint64",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed32",
                        number = 37,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "repeatedFixed32",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fixed64",
                        number = 38,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "repeatedFixed64",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed32",
                        number = 39,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "repeatedSfixed32",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_sfixed64",
                        number = 40,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "repeatedSfixed64",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float",
                        number = 41,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "repeatedFloat",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double",
                        number = 42,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "repeatedDouble",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool",
                        number = 43,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "repeatedBool",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string",
                        number = 44,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedString",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes",
                        number = 45,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "repeatedBytes",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_message",
                        number = 48,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypesProto3.NestedMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion)),
                        jsonName = "repeatedNestedMessage",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_message",
                        number = 49,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignMessage>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                        jsonName = "repeatedForeignMessage",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_nested_enum",
                        number = 51,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                        jsonName = "repeatedNestedEnum",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_foreign_enum",
                        number = 52,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.ForeignEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion), packed = true),
                        jsonName = "repeatedForeignEnum",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_piece",
                        number = 54,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedStringPiece",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedStringPiece
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_cord",
                        number = 55,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "repeatedCord",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedCord
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_int32",
                        number = 56,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "mapInt32Int32",
                        value = pbandk.testpb.TestAllTypesProto3::mapInt32Int32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int64_int64",
                        number = 57,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "mapInt64Int64",
                        value = pbandk.testpb.TestAllTypesProto3::mapInt64Int64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint32_uint32",
                        number = 58,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "mapUint32Uint32",
                        value = pbandk.testpb.TestAllTypesProto3::mapUint32Uint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_uint64_uint64",
                        number = 59,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "mapUint64Uint64",
                        value = pbandk.testpb.TestAllTypesProto3::mapUint64Uint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint32_sint32",
                        number = 60,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "mapSint32Sint32",
                        value = pbandk.testpb.TestAllTypesProto3::mapSint32Sint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sint64_sint64",
                        number = 61,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "mapSint64Sint64",
                        value = pbandk.testpb.TestAllTypesProto3::mapSint64Sint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed32_fixed32",
                        number = 62,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "mapFixed32Fixed32",
                        value = pbandk.testpb.TestAllTypesProto3::mapFixed32Fixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_fixed64_fixed64",
                        number = 63,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "mapFixed64Fixed64",
                        value = pbandk.testpb.TestAllTypesProto3::mapFixed64Fixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed32_sfixed32",
                        number = 64,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Int>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "mapSfixed32Sfixed32",
                        value = pbandk.testpb.TestAllTypesProto3::mapSfixed32Sfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_sfixed64_sfixed64",
                        number = 65,
                        type = pbandk.FieldDescriptor.Type.Map<Long, Long>(keyType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "mapSfixed64Sfixed64",
                        value = pbandk.testpb.TestAllTypesProto3::mapSfixed64Sfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_float",
                        number = 66,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Float>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "mapInt32Float",
                        value = pbandk.testpb.TestAllTypesProto3::mapInt32Float
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_int32_double",
                        number = 67,
                        type = pbandk.FieldDescriptor.Type.Map<Int, Double>(keyType = pbandk.FieldDescriptor.Type.Primitive.Int32(), valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "mapInt32Double",
                        value = pbandk.testpb.TestAllTypesProto3::mapInt32Double
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_bool_bool",
                        number = 68,
                        type = pbandk.FieldDescriptor.Type.Map<Boolean, Boolean>(keyType = pbandk.FieldDescriptor.Type.Primitive.Bool(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "mapBoolBool",
                        value = pbandk.testpb.TestAllTypesProto3::mapBoolBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_string",
                        number = 69,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "mapStringString",
                        value = pbandk.testpb.TestAllTypesProto3::mapStringString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_bytes",
                        number = 70,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.ByteArr>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.Bytes()),
                        jsonName = "mapStringBytes",
                        value = pbandk.testpb.TestAllTypesProto3::mapStringBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_message",
                        number = 71,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion)),
                        jsonName = "mapStringNestedMessage",
                        value = pbandk.testpb.TestAllTypesProto3::mapStringNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_message",
                        number = 72,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.ForeignMessage?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion)),
                        jsonName = "mapStringForeignMessage",
                        value = pbandk.testpb.TestAllTypesProto3::mapStringForeignMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_nested_enum",
                        number = 73,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion)),
                        jsonName = "mapStringNestedEnum",
                        value = pbandk.testpb.TestAllTypesProto3::mapStringNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map_string_foreign_enum",
                        number = 74,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.ForeignEnum>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion)),
                        jsonName = "mapStringForeignEnum",
                        value = pbandk.testpb.TestAllTypesProto3::mapStringForeignEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int32",
                        number = 75,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32(), packed = true),
                        jsonName = "packedInt32",
                        value = pbandk.testpb.TestAllTypesProto3::packedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_int64",
                        number = 76,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64(), packed = true),
                        jsonName = "packedInt64",
                        value = pbandk.testpb.TestAllTypesProto3::packedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint32",
                        number = 77,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32(), packed = true),
                        jsonName = "packedUint32",
                        value = pbandk.testpb.TestAllTypesProto3::packedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_uint64",
                        number = 78,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64(), packed = true),
                        jsonName = "packedUint64",
                        value = pbandk.testpb.TestAllTypesProto3::packedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint32",
                        number = 79,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32(), packed = true),
                        jsonName = "packedSint32",
                        value = pbandk.testpb.TestAllTypesProto3::packedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sint64",
                        number = 80,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64(), packed = true),
                        jsonName = "packedSint64",
                        value = pbandk.testpb.TestAllTypesProto3::packedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed32",
                        number = 81,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32(), packed = true),
                        jsonName = "packedFixed32",
                        value = pbandk.testpb.TestAllTypesProto3::packedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_fixed64",
                        number = 82,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64(), packed = true),
                        jsonName = "packedFixed64",
                        value = pbandk.testpb.TestAllTypesProto3::packedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed32",
                        number = 83,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32(), packed = true),
                        jsonName = "packedSfixed32",
                        value = pbandk.testpb.TestAllTypesProto3::packedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_sfixed64",
                        number = 84,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64(), packed = true),
                        jsonName = "packedSfixed64",
                        value = pbandk.testpb.TestAllTypesProto3::packedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_float",
                        number = 85,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float(), packed = true),
                        jsonName = "packedFloat",
                        value = pbandk.testpb.TestAllTypesProto3::packedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_double",
                        number = 86,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double(), packed = true),
                        jsonName = "packedDouble",
                        value = pbandk.testpb.TestAllTypesProto3::packedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_bool",
                        number = 87,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool(), packed = true),
                        jsonName = "packedBool",
                        value = pbandk.testpb.TestAllTypesProto3::packedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "packed_nested_enum",
                        number = 88,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion), packed = true),
                        jsonName = "packedNestedEnum",
                        value = pbandk.testpb.TestAllTypesProto3::packedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int32",
                        number = 89,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int32()),
                        jsonName = "unpackedInt32",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedInt32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_int64",
                        number = 90,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Int64()),
                        jsonName = "unpackedInt64",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedInt64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint32",
                        number = 91,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt32()),
                        jsonName = "unpackedUint32",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_uint64",
                        number = 92,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.UInt64()),
                        jsonName = "unpackedUint64",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint32",
                        number = 93,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt32()),
                        jsonName = "unpackedSint32",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedSint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sint64",
                        number = 94,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SInt64()),
                        jsonName = "unpackedSint64",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedSint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed32",
                        number = 95,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed32()),
                        jsonName = "unpackedFixed32",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedFixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_fixed64",
                        number = 96,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.Fixed64()),
                        jsonName = "unpackedFixed64",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedFixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed32",
                        number = 97,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed32()),
                        jsonName = "unpackedSfixed32",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedSfixed32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_sfixed64",
                        number = 98,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Primitive.SFixed64()),
                        jsonName = "unpackedSfixed64",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedSfixed64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_float",
                        number = 99,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Primitive.Float()),
                        jsonName = "unpackedFloat",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_double",
                        number = 100,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Primitive.Double()),
                        jsonName = "unpackedDouble",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_bool",
                        number = 101,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Primitive.Bool()),
                        jsonName = "unpackedBool",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unpacked_nested_enum",
                        number = 102,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.TestAllTypesProto3.NestedEnum>(valueType = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion)),
                        jsonName = "unpackedNestedEnum",
                        value = pbandk.testpb.TestAllTypesProto3::unpackedNestedEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_uint32",
                        number = 111,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt32(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint32",
                        value = pbandk.testpb.TestAllTypesProto3::oneofUint32
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_nested_message",
                        number = 112,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion),
                        oneofMember = true,
                        jsonName = "oneofNestedMessage",
                        value = pbandk.testpb.TestAllTypesProto3::oneofNestedMessage
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_string",
                        number = 113,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofString",
                        value = pbandk.testpb.TestAllTypesProto3::oneofString
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_bytes",
                        number = 114,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBytes",
                        value = pbandk.testpb.TestAllTypesProto3::oneofBytes
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_bool",
                        number = 115,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bool(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofBool",
                        value = pbandk.testpb.TestAllTypesProto3::oneofBool
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_uint64",
                        number = 116,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofUint64",
                        value = pbandk.testpb.TestAllTypesProto3::oneofUint64
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_float",
                        number = 117,
                        type = pbandk.FieldDescriptor.Type.Primitive.Float(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofFloat",
                        value = pbandk.testpb.TestAllTypesProto3::oneofFloat
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_double",
                        number = 118,
                        type = pbandk.FieldDescriptor.Type.Primitive.Double(hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofDouble",
                        value = pbandk.testpb.TestAllTypesProto3::oneofDouble
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "oneof_enum",
                        number = 119,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion, hasPresence = true),
                        oneofMember = true,
                        jsonName = "oneofEnum",
                        value = pbandk.testpb.TestAllTypesProto3::oneofEnum
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bool_wrapper",
                        number = 201,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion),
                        jsonName = "optionalBoolWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalBoolWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int32_wrapper",
                        number = 202,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion),
                        jsonName = "optionalInt32Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalInt32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_int64_wrapper",
                        number = 203,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion),
                        jsonName = "optionalInt64Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalInt64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint32_wrapper",
                        number = 204,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion),
                        jsonName = "optionalUint32Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalUint32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_uint64_wrapper",
                        number = 205,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion),
                        jsonName = "optionalUint64Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalUint64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_float_wrapper",
                        number = 206,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion),
                        jsonName = "optionalFloatWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalFloatWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_double_wrapper",
                        number = 207,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion),
                        jsonName = "optionalDoubleWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalDoubleWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_string_wrapper",
                        number = 208,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "optionalStringWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalStringWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_bytes_wrapper",
                        number = 209,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion),
                        jsonName = "optionalBytesWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::optionalBytesWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bool_wrapper",
                        number = 211,
                        type = pbandk.FieldDescriptor.Type.Repeated<Boolean>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BoolValue.Companion)),
                        jsonName = "repeatedBoolWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedBoolWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int32_wrapper",
                        number = 212,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int32Value.Companion)),
                        jsonName = "repeatedInt32Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedInt32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_int64_wrapper",
                        number = 213,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Int64Value.Companion)),
                        jsonName = "repeatedInt64Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedInt64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint32_wrapper",
                        number = 214,
                        type = pbandk.FieldDescriptor.Type.Repeated<Int>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt32Value.Companion)),
                        jsonName = "repeatedUint32Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedUint32Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_uint64_wrapper",
                        number = 215,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "repeatedUint64Wrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedUint64Wrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_float_wrapper",
                        number = 216,
                        type = pbandk.FieldDescriptor.Type.Repeated<Float>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FloatValue.Companion)),
                        jsonName = "repeatedFloatWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedFloatWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_double_wrapper",
                        number = 217,
                        type = pbandk.FieldDescriptor.Type.Repeated<Double>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.DoubleValue.Companion)),
                        jsonName = "repeatedDoubleWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedDoubleWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_string_wrapper",
                        number = 218,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion)),
                        jsonName = "repeatedStringWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedStringWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_bytes_wrapper",
                        number = 219,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.ByteArr>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.BytesValue.Companion)),
                        jsonName = "repeatedBytesWrapper",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedBytesWrapper
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_duration",
                        number = 301,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion),
                        jsonName = "optionalDuration",
                        value = pbandk.testpb.TestAllTypesProto3::optionalDuration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_timestamp",
                        number = 302,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion),
                        jsonName = "optionalTimestamp",
                        value = pbandk.testpb.TestAllTypesProto3::optionalTimestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_field_mask",
                        number = 303,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion),
                        jsonName = "optionalFieldMask",
                        value = pbandk.testpb.TestAllTypesProto3::optionalFieldMask
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_struct",
                        number = 304,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion),
                        jsonName = "optionalStruct",
                        value = pbandk.testpb.TestAllTypesProto3::optionalStruct
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_any",
                        number = 305,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion),
                        jsonName = "optionalAny",
                        value = pbandk.testpb.TestAllTypesProto3::optionalAny
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "optional_value",
                        number = 306,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion),
                        jsonName = "optionalValue",
                        value = pbandk.testpb.TestAllTypesProto3::optionalValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_duration",
                        number = 311,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Duration>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Duration.Companion)),
                        jsonName = "repeatedDuration",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedDuration
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_timestamp",
                        number = 312,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Timestamp>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Timestamp.Companion)),
                        jsonName = "repeatedTimestamp",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedTimestamp
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_fieldmask",
                        number = 313,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.FieldMask>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.FieldMask.Companion)),
                        jsonName = "repeatedFieldmask",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedFieldmask
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_any",
                        number = 315,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Any>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Any.Companion)),
                        jsonName = "repeatedAny",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedAny
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_value",
                        number = 316,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Value>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Value.Companion)),
                        jsonName = "repeatedValue",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_list_value",
                        number = 317,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.ListValue>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.ListValue.Companion)),
                        jsonName = "repeatedListValue",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedListValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "repeated_struct",
                        number = 324,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.wkt.Struct>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.Struct.Companion)),
                        jsonName = "repeatedStruct",
                        value = pbandk.testpb.TestAllTypesProto3::repeatedStruct
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldname1",
                        number = 401,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldname1",
                        value = pbandk.testpb.TestAllTypesProto3::fieldname1
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name2",
                        number = 402,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName2",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName2
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "_field_name3",
                        number = 403,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName3",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName3
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name4_",
                        number = 404,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName4",
                        value = pbandk.testpb.TestAllTypesProto3::field_name4
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field0name5",
                        number = 405,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "field0name5",
                        value = pbandk.testpb.TestAllTypesProto3::field0name5
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_0_name6",
                        number = 406,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "field0Name6",
                        value = pbandk.testpb.TestAllTypesProto3::field0Name6
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "fieldName7",
                        number = 407,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName7",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName7
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FieldName8",
                        number = 408,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName8",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName8
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_Name9",
                        number = 409,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName9",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName9
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_Name10",
                        number = 410,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName10",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName10
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_NAME11",
                        number = 411,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FIELDNAME11",
                        value = pbandk.testpb.TestAllTypesProto3::fIELDNAME11
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "FIELD_name12",
                        number = 412,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FIELDName12",
                        value = pbandk.testpb.TestAllTypesProto3::fIELDName12
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__field_name13",
                        number = 413,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName13",
                        value = pbandk.testpb.TestAllTypesProto3::_fieldName13
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "__Field_name14",
                        number = 414,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName14",
                        value = pbandk.testpb.TestAllTypesProto3::_FieldName14
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__name15",
                        number = 415,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName15",
                        value = pbandk.testpb.TestAllTypesProto3::field_name15
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field__Name16",
                        number = 416,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName16",
                        value = pbandk.testpb.TestAllTypesProto3::field_Name16
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field_name17__",
                        number = 417,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "fieldName17",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName17_
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "Field_name18__",
                        number = 418,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "FieldName18",
                        value = pbandk.testpb.TestAllTypesProto3::fieldName18_
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.TestAllTypesProto3::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    sealed class NestedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.testpb.TestAllTypesProto3.NestedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestAllTypesProto3.NestedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object FOO : NestedEnum(0, "FOO")
        object BAR : NestedEnum(1, "BAR")
        object BAZ : NestedEnum(2, "BAZ")
        object NEG : NestedEnum(-1, "NEG")
        class UNRECOGNIZED(value: Int) : pbandk.testpb.TestAllTypesProto3.NestedEnum(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.testpb.TestAllTypesProto3.NestedEnum> {
            val values: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> by lazy { listOf(FOO, BAR, BAZ, NEG) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No NestedEnum with name: $name")
        }
    }

    sealed class AliasedEnum(override val value: Int, override val name: String? = null) : pbandk.Message.Enum {
        override fun equals(other: kotlin.Any?) = other is pbandk.testpb.TestAllTypesProto3.AliasedEnum && other.value == value
        override fun hashCode() = value.hashCode()
        override fun toString() = "TestAllTypesProto3.AliasedEnum.${name ?: "UNRECOGNIZED"}(value=$value)"

        object ALIAS_FOO : AliasedEnum(0, "ALIAS_FOO")
        object ALIAS_BAR : AliasedEnum(1, "ALIAS_BAR")
        object ALIAS_BAZ : AliasedEnum(2, "ALIAS_BAZ")
        object QUX : AliasedEnum(2, "QUX")
        object QUX_ : AliasedEnum(2, "qux")
        object B_AZ : AliasedEnum(2, "bAz")
        class UNRECOGNIZED(value: Int) : pbandk.testpb.TestAllTypesProto3.AliasedEnum(value)

        companion object : pbandk.Message.Enum.Companion<pbandk.testpb.TestAllTypesProto3.AliasedEnum> {
            val values: List<pbandk.testpb.TestAllTypesProto3.AliasedEnum> by lazy { listOf(ALIAS_FOO, ALIAS_BAR, ALIAS_BAZ, QUX, QUX_, B_AZ) }
            override fun fromValue(value: Int) = values.firstOrNull { it.value == value } ?: UNRECOGNIZED(value)
            override fun fromName(name: String) = values.firstOrNull { it.name == name } ?: throw IllegalArgumentException("No AliasedEnum with name: $name")
        }
    }

    interface NestedMessage : pbandk.Message {
        val a: Int
        val corecursive: pbandk.testpb.TestAllTypesProto3?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.NestedMessage
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.NestedMessage>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.NestedMessage> {
            operator fun invoke(
                a: Int = 0,
                corecursive: pbandk.testpb.TestAllTypesProto3? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.NestedMessage = TestAllTypesProto3_NestedMessage_Impl(
                a,
                corecursive,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.NestedMessage() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.NestedMessage.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.NestedMessage> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.NestedMessage, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "a",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "a",
                            value = pbandk.testpb.TestAllTypesProto3.NestedMessage::a
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "corecursive",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.Companion),
                            jsonName = "corecursive",
                            value = pbandk.testpb.TestAllTypesProto3.NestedMessage::corecursive
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.NestedMessage::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapInt32Int32Entry : pbandk.Message, Map.Entry<Int, Int> {
        override val key: Int
        override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry> {
            operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry = TestAllTypesProto3_MapInt32Int32Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapInt32Int32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapInt64Int64Entry : pbandk.Message, Map.Entry<Long, Long> {
        override val key: Long
        override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry> {
            operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry = TestAllTypesProto3_MapInt64Int64Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int64(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapInt64Int64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapUint32Uint32Entry : pbandk.Message, Map.Entry<Int, Int> {
        override val key: Int
        override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry> {
            operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry = TestAllTypesProto3_MapUint32Uint32Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt32(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapUint32Uint32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapUint64Uint64Entry : pbandk.Message, Map.Entry<Long, Long> {
        override val key: Long
        override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry> {
            operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry = TestAllTypesProto3_MapUint64Uint64Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapUint64Uint64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapSint32Sint32Entry : pbandk.Message, Map.Entry<Int, Int> {
        override val key: Int
        override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry> {
            operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry = TestAllTypesProto3_MapSint32Sint32Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt32(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapSint32Sint32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapSint64Sint64Entry : pbandk.Message, Map.Entry<Long, Long> {
        override val key: Long
        override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry> {
            operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry = TestAllTypesProto3_MapSint64Sint64Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SInt64(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapSint64Sint64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapFixed32Fixed32Entry : pbandk.Message, Map.Entry<Int, Int> {
        override val key: Int
        override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry> {
            operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry = TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed32(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapFixed32Fixed32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapFixed64Fixed64Entry : pbandk.Message, Map.Entry<Long, Long> {
        override val key: Long
        override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry> {
            operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry = TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Fixed64(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapFixed64Fixed64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapSfixed32Sfixed32Entry : pbandk.Message, Map.Entry<Int, Int> {
        override val key: Int
        override val value: Int

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry> {
            operator fun invoke(
                key: Int = 0,
                value: Int = 0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry = TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed32(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapSfixed32Sfixed32Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapSfixed64Sfixed64Entry : pbandk.Message, Map.Entry<Long, Long> {
        override val key: Long
        override val value: Long

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry> {
            operator fun invoke(
                key: Long = 0L,
                value: Long = 0L,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry = TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.SFixed64(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapSfixed64Sfixed64Entry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapInt32FloatEntry : pbandk.Message, Map.Entry<Int, Float> {
        override val key: Int
        override val value: Float

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry> {
            operator fun invoke(
                key: Int = 0,
                value: Float = 0.0F,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry = TestAllTypesProto3_MapInt32FloatEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Float(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapInt32FloatEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapInt32DoubleEntry : pbandk.Message, Map.Entry<Int, Double> {
        override val key: Int
        override val value: Double

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry> {
            operator fun invoke(
                key: Int = 0,
                value: Double = 0.0,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry = TestAllTypesProto3_MapInt32DoubleEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Double(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapInt32DoubleEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapBoolBoolEntry : pbandk.Message, Map.Entry<Boolean, Boolean> {
        override val key: Boolean
        override val value: Boolean

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry> {
            operator fun invoke(
                key: Boolean = false,
                value: Boolean = false,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry = TestAllTypesProto3_MapBoolBoolEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bool(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapBoolBoolEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapStringStringEntry : pbandk.Message, Map.Entry<String, String> {
        override val key: String
        override val value: String

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapStringStringEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringStringEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapStringStringEntry> {
            operator fun invoke(
                key: String = "",
                value: String = "",
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapStringStringEntry = TestAllTypesProto3_MapStringStringEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapStringStringEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapStringStringEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringStringEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringStringEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringStringEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringStringEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapStringStringEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapStringBytesEntry : pbandk.Message, Map.Entry<String, pbandk.ByteArr> {
        override val key: String
        override val value: pbandk.ByteArr

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.ByteArr = pbandk.ByteArr.empty,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry = TestAllTypesProto3_MapStringBytesEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapStringBytesEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapStringNestedMessageEntry : pbandk.Message, Map.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?> {
        override val key: String
        override val value: pbandk.testpb.TestAllTypesProto3.NestedMessage?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry = TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.TestAllTypesProto3.NestedMessage.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapStringNestedMessageEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapStringForeignMessageEntry : pbandk.Message, Map.Entry<String, pbandk.testpb.ForeignMessage?> {
        override val key: String
        override val value: pbandk.testpb.ForeignMessage?

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.testpb.ForeignMessage? = null,
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry = TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.ForeignMessage.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapStringForeignMessageEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapStringNestedEnumEntry : pbandk.Message, Map.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedEnum> {
        override val key: String
        override val value: pbandk.testpb.TestAllTypesProto3.NestedEnum

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0),
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry = TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.TestAllTypesProto3.NestedEnum.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapStringNestedEnumEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }

    interface MapStringForeignEnumEntry : pbandk.Message, Map.Entry<String, pbandk.testpb.ForeignEnum> {
        override val key: String
        override val value: pbandk.testpb.ForeignEnum

        override operator fun plus(other: pbandk.Message?): pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry
        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry>

        companion object : pbandk.Message.Companion<pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry> {
            operator fun invoke(
                key: String = "",
                value: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0),
                unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
            ): pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry = TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
                key,
                value,
                unknownFields
            )

            val defaultInstance by lazy { pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry, *>>(2)
                fieldsList.apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = pbandk.testpb.ForeignEnum.Companion),
                            jsonName = "value",
                            value = pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = pbandk.testpb.TestAllTypesProto3.MapStringForeignEnumEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

interface ForeignMessage : pbandk.Message {
    val c: Int

    override operator fun plus(other: pbandk.Message?): pbandk.testpb.ForeignMessage
    override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.ForeignMessage>

    companion object : pbandk.Message.Companion<pbandk.testpb.ForeignMessage> {
        operator fun invoke(
            c: Int = 0,
            unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
        ): pbandk.testpb.ForeignMessage = ForeignMessage_Impl(
            c,
            unknownFields
        )

        val defaultInstance by lazy { pbandk.testpb.ForeignMessage() }
        override fun decodeWith(u: pbandk.MessageDecoder) = pbandk.testpb.ForeignMessage.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<pbandk.testpb.ForeignMessage> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<pbandk.testpb.ForeignMessage, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "c",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "c",
                        value = pbandk.testpb.ForeignMessage::c
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = pbandk.testpb.ForeignMessage::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun TestAllTypesProto3?.orDefault() = this ?: TestAllTypesProto3.defaultInstance

fun TestAllTypesProto3.copy(
    optionalInt32: Int = 0,
    optionalInt64: Long = 0L,
    optionalUint32: Int = 0,
    optionalUint64: Long = 0L,
    optionalSint32: Int = 0,
    optionalSint64: Long = 0L,
    optionalFixed32: Int = 0,
    optionalFixed64: Long = 0L,
    optionalSfixed32: Int = 0,
    optionalSfixed64: Long = 0L,
    optionalFloat: Float = 0.0F,
    optionalDouble: Double = 0.0,
    optionalBool: Boolean = false,
    optionalString: String = "",
    optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty,
    optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null,
    optionalForeignMessage: pbandk.testpb.ForeignMessage? = null,
    optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0),
    optionalForeignEnum: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0),
    optionalAliasedEnum: pbandk.testpb.TestAllTypesProto3.AliasedEnum = pbandk.testpb.TestAllTypesProto3.AliasedEnum.fromValue(0),
    optionalStringPiece: String = "",
    optionalCord: String = "",
    recursiveMessage: pbandk.testpb.TestAllTypesProto3? = null,
    repeatedInt32: List<Int> = emptyList(),
    repeatedInt64: List<Long> = emptyList(),
    repeatedUint32: List<Int> = emptyList(),
    repeatedUint64: List<Long> = emptyList(),
    repeatedSint32: List<Int> = emptyList(),
    repeatedSint64: List<Long> = emptyList(),
    repeatedFixed32: List<Int> = emptyList(),
    repeatedFixed64: List<Long> = emptyList(),
    repeatedSfixed32: List<Int> = emptyList(),
    repeatedSfixed64: List<Long> = emptyList(),
    repeatedFloat: List<Float> = emptyList(),
    repeatedDouble: List<Double> = emptyList(),
    repeatedBool: List<Boolean> = emptyList(),
    repeatedString: List<String> = emptyList(),
    repeatedBytes: List<pbandk.ByteArr> = emptyList(),
    repeatedNestedMessage: List<pbandk.testpb.TestAllTypesProto3.NestedMessage> = emptyList(),
    repeatedForeignMessage: List<pbandk.testpb.ForeignMessage> = emptyList(),
    repeatedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
    repeatedForeignEnum: List<pbandk.testpb.ForeignEnum> = emptyList(),
    repeatedStringPiece: List<String> = emptyList(),
    repeatedCord: List<String> = emptyList(),
    packedInt32: List<Int> = emptyList(),
    packedInt64: List<Long> = emptyList(),
    packedUint32: List<Int> = emptyList(),
    packedUint64: List<Long> = emptyList(),
    packedSint32: List<Int> = emptyList(),
    packedSint64: List<Long> = emptyList(),
    packedFixed32: List<Int> = emptyList(),
    packedFixed64: List<Long> = emptyList(),
    packedSfixed32: List<Int> = emptyList(),
    packedSfixed64: List<Long> = emptyList(),
    packedFloat: List<Float> = emptyList(),
    packedDouble: List<Double> = emptyList(),
    packedBool: List<Boolean> = emptyList(),
    packedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
    unpackedInt32: List<Int> = emptyList(),
    unpackedInt64: List<Long> = emptyList(),
    unpackedUint32: List<Int> = emptyList(),
    unpackedUint64: List<Long> = emptyList(),
    unpackedSint32: List<Int> = emptyList(),
    unpackedSint64: List<Long> = emptyList(),
    unpackedFixed32: List<Int> = emptyList(),
    unpackedFixed64: List<Long> = emptyList(),
    unpackedSfixed32: List<Int> = emptyList(),
    unpackedSfixed64: List<Long> = emptyList(),
    unpackedFloat: List<Float> = emptyList(),
    unpackedDouble: List<Double> = emptyList(),
    unpackedBool: List<Boolean> = emptyList(),
    unpackedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyList(),
    mapInt32Int32: Map<Int, Int> = emptyMap(),
    mapInt64Int64: Map<Long, Long> = emptyMap(),
    mapUint32Uint32: Map<Int, Int> = emptyMap(),
    mapUint64Uint64: Map<Long, Long> = emptyMap(),
    mapSint32Sint32: Map<Int, Int> = emptyMap(),
    mapSint64Sint64: Map<Long, Long> = emptyMap(),
    mapFixed32Fixed32: Map<Int, Int> = emptyMap(),
    mapFixed64Fixed64: Map<Long, Long> = emptyMap(),
    mapSfixed32Sfixed32: Map<Int, Int> = emptyMap(),
    mapSfixed64Sfixed64: Map<Long, Long> = emptyMap(),
    mapInt32Float: Map<Int, Float> = emptyMap(),
    mapInt32Double: Map<Int, Double> = emptyMap(),
    mapBoolBool: Map<Boolean, Boolean> = emptyMap(),
    mapStringString: Map<String, String> = emptyMap(),
    mapStringBytes: Map<String, pbandk.ByteArr> = emptyMap(),
    mapStringNestedMessage: Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?> = emptyMap(),
    mapStringForeignMessage: Map<String, pbandk.testpb.ForeignMessage?> = emptyMap(),
    mapStringNestedEnum: Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum> = emptyMap(),
    mapStringForeignEnum: Map<String, pbandk.testpb.ForeignEnum> = emptyMap(),
    optionalBoolWrapper: Boolean? = null,
    optionalInt32Wrapper: Int? = null,
    optionalInt64Wrapper: Long? = null,
    optionalUint32Wrapper: Int? = null,
    optionalUint64Wrapper: Long? = null,
    optionalFloatWrapper: Float? = null,
    optionalDoubleWrapper: Double? = null,
    optionalStringWrapper: String? = null,
    optionalBytesWrapper: pbandk.ByteArr? = null,
    repeatedBoolWrapper: List<Boolean> = emptyList(),
    repeatedInt32Wrapper: List<Int> = emptyList(),
    repeatedInt64Wrapper: List<Long> = emptyList(),
    repeatedUint32Wrapper: List<Int> = emptyList(),
    repeatedUint64Wrapper: List<Long> = emptyList(),
    repeatedFloatWrapper: List<Float> = emptyList(),
    repeatedDoubleWrapper: List<Double> = emptyList(),
    repeatedStringWrapper: List<String> = emptyList(),
    repeatedBytesWrapper: List<pbandk.ByteArr> = emptyList(),
    optionalDuration: pbandk.wkt.Duration? = null,
    optionalTimestamp: pbandk.wkt.Timestamp? = null,
    optionalFieldMask: pbandk.wkt.FieldMask? = null,
    optionalStruct: pbandk.wkt.Struct? = null,
    optionalAny: pbandk.wkt.Any? = null,
    optionalValue: pbandk.wkt.Value? = null,
    repeatedDuration: List<pbandk.wkt.Duration> = emptyList(),
    repeatedTimestamp: List<pbandk.wkt.Timestamp> = emptyList(),
    repeatedFieldmask: List<pbandk.wkt.FieldMask> = emptyList(),
    repeatedStruct: List<pbandk.wkt.Struct> = emptyList(),
    repeatedAny: List<pbandk.wkt.Any> = emptyList(),
    repeatedValue: List<pbandk.wkt.Value> = emptyList(),
    repeatedListValue: List<pbandk.wkt.ListValue> = emptyList(),
    fieldname1: Int = 0,
    fieldName2: Int = 0,
    fieldName3: Int = 0,
    field_name4: Int = 0,
    field0name5: Int = 0,
    field0Name6: Int = 0,
    fieldName7: Int = 0,
    fieldName8: Int = 0,
    fieldName9: Int = 0,
    fieldName10: Int = 0,
    fIELDNAME11: Int = 0,
    fIELDName12: Int = 0,
    _fieldName13: Int = 0,
    _FieldName14: Int = 0,
    field_name15: Int = 0,
    field_Name16: Int = 0,
    fieldName17_: Int = 0,
    fieldName18_: Int = 0,
    oneofField: pbandk.testpb.TestAllTypesProto3.OneofField<*>? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3 = (this as TestAllTypesProto3_Impl).copy(
    optionalInt32,
    optionalInt64,
    optionalUint32,
    optionalUint64,
    optionalSint32,
    optionalSint64,
    optionalFixed32,
    optionalFixed64,
    optionalSfixed32,
    optionalSfixed64,
    optionalFloat,
    optionalDouble,
    optionalBool,
    optionalString,
    optionalBytes,
    optionalNestedMessage,
    optionalForeignMessage,
    optionalNestedEnum,
    optionalForeignEnum,
    optionalAliasedEnum,
    optionalStringPiece,
    optionalCord,
    recursiveMessage,
    repeatedInt32,
    repeatedInt64,
    repeatedUint32,
    repeatedUint64,
    repeatedSint32,
    repeatedSint64,
    repeatedFixed32,
    repeatedFixed64,
    repeatedSfixed32,
    repeatedSfixed64,
    repeatedFloat,
    repeatedDouble,
    repeatedBool,
    repeatedString,
    repeatedBytes,
    repeatedNestedMessage,
    repeatedForeignMessage,
    repeatedNestedEnum,
    repeatedForeignEnum,
    repeatedStringPiece,
    repeatedCord,
    packedInt32,
    packedInt64,
    packedUint32,
    packedUint64,
    packedSint32,
    packedSint64,
    packedFixed32,
    packedFixed64,
    packedSfixed32,
    packedSfixed64,
    packedFloat,
    packedDouble,
    packedBool,
    packedNestedEnum,
    unpackedInt32,
    unpackedInt64,
    unpackedUint32,
    unpackedUint64,
    unpackedSint32,
    unpackedSint64,
    unpackedFixed32,
    unpackedFixed64,
    unpackedSfixed32,
    unpackedSfixed64,
    unpackedFloat,
    unpackedDouble,
    unpackedBool,
    unpackedNestedEnum,
    mapInt32Int32,
    mapInt64Int64,
    mapUint32Uint32,
    mapUint64Uint64,
    mapSint32Sint32,
    mapSint64Sint64,
    mapFixed32Fixed32,
    mapFixed64Fixed64,
    mapSfixed32Sfixed32,
    mapSfixed64Sfixed64,
    mapInt32Float,
    mapInt32Double,
    mapBoolBool,
    mapStringString,
    mapStringBytes,
    mapStringNestedMessage,
    mapStringForeignMessage,
    mapStringNestedEnum,
    mapStringForeignEnum,
    optionalBoolWrapper,
    optionalInt32Wrapper,
    optionalInt64Wrapper,
    optionalUint32Wrapper,
    optionalUint64Wrapper,
    optionalFloatWrapper,
    optionalDoubleWrapper,
    optionalStringWrapper,
    optionalBytesWrapper,
    repeatedBoolWrapper,
    repeatedInt32Wrapper,
    repeatedInt64Wrapper,
    repeatedUint32Wrapper,
    repeatedUint64Wrapper,
    repeatedFloatWrapper,
    repeatedDoubleWrapper,
    repeatedStringWrapper,
    repeatedBytesWrapper,
    optionalDuration,
    optionalTimestamp,
    optionalFieldMask,
    optionalStruct,
    optionalAny,
    optionalValue,
    repeatedDuration,
    repeatedTimestamp,
    repeatedFieldmask,
    repeatedStruct,
    repeatedAny,
    repeatedValue,
    repeatedListValue,
    fieldname1,
    fieldName2,
    fieldName3,
    field_name4,
    field0name5,
    field0Name6,
    fieldName7,
    fieldName8,
    fieldName9,
    fieldName10,
    fIELDNAME11,
    fIELDName12,
    _fieldName13,
    _FieldName14,
    field_name15,
    field_Name16,
    fieldName17_,
    fieldName18_,
    oneofField,
    unknownFields
)

private data class TestAllTypesProto3_Impl(
    override val optionalInt32: Int,
    override val optionalInt64: Long,
    override val optionalUint32: Int,
    override val optionalUint64: Long,
    override val optionalSint32: Int,
    override val optionalSint64: Long,
    override val optionalFixed32: Int,
    override val optionalFixed64: Long,
    override val optionalSfixed32: Int,
    override val optionalSfixed64: Long,
    override val optionalFloat: Float,
    override val optionalDouble: Double,
    override val optionalBool: Boolean,
    override val optionalString: String,
    override val optionalBytes: pbandk.ByteArr,
    override val optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage?,
    override val optionalForeignMessage: pbandk.testpb.ForeignMessage?,
    override val optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum,
    override val optionalForeignEnum: pbandk.testpb.ForeignEnum,
    override val optionalAliasedEnum: pbandk.testpb.TestAllTypesProto3.AliasedEnum,
    override val optionalStringPiece: String,
    override val optionalCord: String,
    override val recursiveMessage: pbandk.testpb.TestAllTypesProto3?,
    override val repeatedInt32: List<Int>,
    override val repeatedInt64: List<Long>,
    override val repeatedUint32: List<Int>,
    override val repeatedUint64: List<Long>,
    override val repeatedSint32: List<Int>,
    override val repeatedSint64: List<Long>,
    override val repeatedFixed32: List<Int>,
    override val repeatedFixed64: List<Long>,
    override val repeatedSfixed32: List<Int>,
    override val repeatedSfixed64: List<Long>,
    override val repeatedFloat: List<Float>,
    override val repeatedDouble: List<Double>,
    override val repeatedBool: List<Boolean>,
    override val repeatedString: List<String>,
    override val repeatedBytes: List<pbandk.ByteArr>,
    override val repeatedNestedMessage: List<pbandk.testpb.TestAllTypesProto3.NestedMessage>,
    override val repeatedForeignMessage: List<pbandk.testpb.ForeignMessage>,
    override val repeatedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum>,
    override val repeatedForeignEnum: List<pbandk.testpb.ForeignEnum>,
    override val repeatedStringPiece: List<String>,
    override val repeatedCord: List<String>,
    override val packedInt32: List<Int>,
    override val packedInt64: List<Long>,
    override val packedUint32: List<Int>,
    override val packedUint64: List<Long>,
    override val packedSint32: List<Int>,
    override val packedSint64: List<Long>,
    override val packedFixed32: List<Int>,
    override val packedFixed64: List<Long>,
    override val packedSfixed32: List<Int>,
    override val packedSfixed64: List<Long>,
    override val packedFloat: List<Float>,
    override val packedDouble: List<Double>,
    override val packedBool: List<Boolean>,
    override val packedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum>,
    override val unpackedInt32: List<Int>,
    override val unpackedInt64: List<Long>,
    override val unpackedUint32: List<Int>,
    override val unpackedUint64: List<Long>,
    override val unpackedSint32: List<Int>,
    override val unpackedSint64: List<Long>,
    override val unpackedFixed32: List<Int>,
    override val unpackedFixed64: List<Long>,
    override val unpackedSfixed32: List<Int>,
    override val unpackedSfixed64: List<Long>,
    override val unpackedFloat: List<Float>,
    override val unpackedDouble: List<Double>,
    override val unpackedBool: List<Boolean>,
    override val unpackedNestedEnum: List<pbandk.testpb.TestAllTypesProto3.NestedEnum>,
    override val mapInt32Int32: Map<Int, Int>,
    override val mapInt64Int64: Map<Long, Long>,
    override val mapUint32Uint32: Map<Int, Int>,
    override val mapUint64Uint64: Map<Long, Long>,
    override val mapSint32Sint32: Map<Int, Int>,
    override val mapSint64Sint64: Map<Long, Long>,
    override val mapFixed32Fixed32: Map<Int, Int>,
    override val mapFixed64Fixed64: Map<Long, Long>,
    override val mapSfixed32Sfixed32: Map<Int, Int>,
    override val mapSfixed64Sfixed64: Map<Long, Long>,
    override val mapInt32Float: Map<Int, Float>,
    override val mapInt32Double: Map<Int, Double>,
    override val mapBoolBool: Map<Boolean, Boolean>,
    override val mapStringString: Map<String, String>,
    override val mapStringBytes: Map<String, pbandk.ByteArr>,
    override val mapStringNestedMessage: Map<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>,
    override val mapStringForeignMessage: Map<String, pbandk.testpb.ForeignMessage?>,
    override val mapStringNestedEnum: Map<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>,
    override val mapStringForeignEnum: Map<String, pbandk.testpb.ForeignEnum>,
    override val optionalBoolWrapper: Boolean?,
    override val optionalInt32Wrapper: Int?,
    override val optionalInt64Wrapper: Long?,
    override val optionalUint32Wrapper: Int?,
    override val optionalUint64Wrapper: Long?,
    override val optionalFloatWrapper: Float?,
    override val optionalDoubleWrapper: Double?,
    override val optionalStringWrapper: String?,
    override val optionalBytesWrapper: pbandk.ByteArr?,
    override val repeatedBoolWrapper: List<Boolean>,
    override val repeatedInt32Wrapper: List<Int>,
    override val repeatedInt64Wrapper: List<Long>,
    override val repeatedUint32Wrapper: List<Int>,
    override val repeatedUint64Wrapper: List<Long>,
    override val repeatedFloatWrapper: List<Float>,
    override val repeatedDoubleWrapper: List<Double>,
    override val repeatedStringWrapper: List<String>,
    override val repeatedBytesWrapper: List<pbandk.ByteArr>,
    override val optionalDuration: pbandk.wkt.Duration?,
    override val optionalTimestamp: pbandk.wkt.Timestamp?,
    override val optionalFieldMask: pbandk.wkt.FieldMask?,
    override val optionalStruct: pbandk.wkt.Struct?,
    override val optionalAny: pbandk.wkt.Any?,
    override val optionalValue: pbandk.wkt.Value?,
    override val repeatedDuration: List<pbandk.wkt.Duration>,
    override val repeatedTimestamp: List<pbandk.wkt.Timestamp>,
    override val repeatedFieldmask: List<pbandk.wkt.FieldMask>,
    override val repeatedStruct: List<pbandk.wkt.Struct>,
    override val repeatedAny: List<pbandk.wkt.Any>,
    override val repeatedValue: List<pbandk.wkt.Value>,
    override val repeatedListValue: List<pbandk.wkt.ListValue>,
    override val fieldname1: Int,
    override val fieldName2: Int,
    override val fieldName3: Int,
    override val field_name4: Int,
    override val field0name5: Int,
    override val field0Name6: Int,
    override val fieldName7: Int,
    override val fieldName8: Int,
    override val fieldName9: Int,
    override val fieldName10: Int,
    override val fIELDNAME11: Int,
    override val fIELDName12: Int,
    override val _fieldName13: Int,
    override val _FieldName14: Int,
    override val field_name15: Int,
    override val field_Name16: Int,
    override val fieldName17_: Int,
    override val fieldName18_: Int,
    override val oneofField: pbandk.testpb.TestAllTypesProto3.OneofField<*>?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3 {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.descriptor
    override val protoSize by lazy { super.protoSize }
    override val oneofUint32: Int?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofUint32)?.value
    override val oneofNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofNestedMessage)?.value
    override val oneofString: String?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofString)?.value
    override val oneofBytes: pbandk.ByteArr?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofBytes)?.value
    override val oneofBool: Boolean?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofBool)?.value
    override val oneofUint64: Long?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofUint64)?.value
    override val oneofFloat: Float?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofFloat)?.value
    override val oneofDouble: Double?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofDouble)?.value
    override val oneofEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum?
        get() = (oneofField as? pbandk.testpb.TestAllTypesProto3.OneofField.OneofEnum)?.value
}

private fun TestAllTypesProto3.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3 = (plus as? TestAllTypesProto3)?.let {
    it.copy(
        optionalNestedMessage = optionalNestedMessage?.plus(plus.optionalNestedMessage) ?: plus.optionalNestedMessage,
        optionalForeignMessage = optionalForeignMessage?.plus(plus.optionalForeignMessage) ?: plus.optionalForeignMessage,
        recursiveMessage = recursiveMessage?.plus(plus.recursiveMessage) ?: plus.recursiveMessage,
        repeatedInt32 = repeatedInt32 + plus.repeatedInt32,
        repeatedInt64 = repeatedInt64 + plus.repeatedInt64,
        repeatedUint32 = repeatedUint32 + plus.repeatedUint32,
        repeatedUint64 = repeatedUint64 + plus.repeatedUint64,
        repeatedSint32 = repeatedSint32 + plus.repeatedSint32,
        repeatedSint64 = repeatedSint64 + plus.repeatedSint64,
        repeatedFixed32 = repeatedFixed32 + plus.repeatedFixed32,
        repeatedFixed64 = repeatedFixed64 + plus.repeatedFixed64,
        repeatedSfixed32 = repeatedSfixed32 + plus.repeatedSfixed32,
        repeatedSfixed64 = repeatedSfixed64 + plus.repeatedSfixed64,
        repeatedFloat = repeatedFloat + plus.repeatedFloat,
        repeatedDouble = repeatedDouble + plus.repeatedDouble,
        repeatedBool = repeatedBool + plus.repeatedBool,
        repeatedString = repeatedString + plus.repeatedString,
        repeatedBytes = repeatedBytes + plus.repeatedBytes,
        repeatedNestedMessage = repeatedNestedMessage + plus.repeatedNestedMessage,
        repeatedForeignMessage = repeatedForeignMessage + plus.repeatedForeignMessage,
        repeatedNestedEnum = repeatedNestedEnum + plus.repeatedNestedEnum,
        repeatedForeignEnum = repeatedForeignEnum + plus.repeatedForeignEnum,
        repeatedStringPiece = repeatedStringPiece + plus.repeatedStringPiece,
        repeatedCord = repeatedCord + plus.repeatedCord,
        packedInt32 = packedInt32 + plus.packedInt32,
        packedInt64 = packedInt64 + plus.packedInt64,
        packedUint32 = packedUint32 + plus.packedUint32,
        packedUint64 = packedUint64 + plus.packedUint64,
        packedSint32 = packedSint32 + plus.packedSint32,
        packedSint64 = packedSint64 + plus.packedSint64,
        packedFixed32 = packedFixed32 + plus.packedFixed32,
        packedFixed64 = packedFixed64 + plus.packedFixed64,
        packedSfixed32 = packedSfixed32 + plus.packedSfixed32,
        packedSfixed64 = packedSfixed64 + plus.packedSfixed64,
        packedFloat = packedFloat + plus.packedFloat,
        packedDouble = packedDouble + plus.packedDouble,
        packedBool = packedBool + plus.packedBool,
        packedNestedEnum = packedNestedEnum + plus.packedNestedEnum,
        unpackedInt32 = unpackedInt32 + plus.unpackedInt32,
        unpackedInt64 = unpackedInt64 + plus.unpackedInt64,
        unpackedUint32 = unpackedUint32 + plus.unpackedUint32,
        unpackedUint64 = unpackedUint64 + plus.unpackedUint64,
        unpackedSint32 = unpackedSint32 + plus.unpackedSint32,
        unpackedSint64 = unpackedSint64 + plus.unpackedSint64,
        unpackedFixed32 = unpackedFixed32 + plus.unpackedFixed32,
        unpackedFixed64 = unpackedFixed64 + plus.unpackedFixed64,
        unpackedSfixed32 = unpackedSfixed32 + plus.unpackedSfixed32,
        unpackedSfixed64 = unpackedSfixed64 + plus.unpackedSfixed64,
        unpackedFloat = unpackedFloat + plus.unpackedFloat,
        unpackedDouble = unpackedDouble + plus.unpackedDouble,
        unpackedBool = unpackedBool + plus.unpackedBool,
        unpackedNestedEnum = unpackedNestedEnum + plus.unpackedNestedEnum,
        mapInt32Int32 = mapInt32Int32 + plus.mapInt32Int32,
        mapInt64Int64 = mapInt64Int64 + plus.mapInt64Int64,
        mapUint32Uint32 = mapUint32Uint32 + plus.mapUint32Uint32,
        mapUint64Uint64 = mapUint64Uint64 + plus.mapUint64Uint64,
        mapSint32Sint32 = mapSint32Sint32 + plus.mapSint32Sint32,
        mapSint64Sint64 = mapSint64Sint64 + plus.mapSint64Sint64,
        mapFixed32Fixed32 = mapFixed32Fixed32 + plus.mapFixed32Fixed32,
        mapFixed64Fixed64 = mapFixed64Fixed64 + plus.mapFixed64Fixed64,
        mapSfixed32Sfixed32 = mapSfixed32Sfixed32 + plus.mapSfixed32Sfixed32,
        mapSfixed64Sfixed64 = mapSfixed64Sfixed64 + plus.mapSfixed64Sfixed64,
        mapInt32Float = mapInt32Float + plus.mapInt32Float,
        mapInt32Double = mapInt32Double + plus.mapInt32Double,
        mapBoolBool = mapBoolBool + plus.mapBoolBool,
        mapStringString = mapStringString + plus.mapStringString,
        mapStringBytes = mapStringBytes + plus.mapStringBytes,
        mapStringNestedMessage = mapStringNestedMessage + plus.mapStringNestedMessage,
        mapStringForeignMessage = mapStringForeignMessage + plus.mapStringForeignMessage,
        mapStringNestedEnum = mapStringNestedEnum + plus.mapStringNestedEnum,
        mapStringForeignEnum = mapStringForeignEnum + plus.mapStringForeignEnum,
        optionalBoolWrapper = plus.optionalBoolWrapper ?: optionalBoolWrapper,
        optionalInt32Wrapper = plus.optionalInt32Wrapper ?: optionalInt32Wrapper,
        optionalInt64Wrapper = plus.optionalInt64Wrapper ?: optionalInt64Wrapper,
        optionalUint32Wrapper = plus.optionalUint32Wrapper ?: optionalUint32Wrapper,
        optionalUint64Wrapper = plus.optionalUint64Wrapper ?: optionalUint64Wrapper,
        optionalFloatWrapper = plus.optionalFloatWrapper ?: optionalFloatWrapper,
        optionalDoubleWrapper = plus.optionalDoubleWrapper ?: optionalDoubleWrapper,
        optionalStringWrapper = plus.optionalStringWrapper ?: optionalStringWrapper,
        optionalBytesWrapper = plus.optionalBytesWrapper ?: optionalBytesWrapper,
        repeatedBoolWrapper = repeatedBoolWrapper + plus.repeatedBoolWrapper,
        repeatedInt32Wrapper = repeatedInt32Wrapper + plus.repeatedInt32Wrapper,
        repeatedInt64Wrapper = repeatedInt64Wrapper + plus.repeatedInt64Wrapper,
        repeatedUint32Wrapper = repeatedUint32Wrapper + plus.repeatedUint32Wrapper,
        repeatedUint64Wrapper = repeatedUint64Wrapper + plus.repeatedUint64Wrapper,
        repeatedFloatWrapper = repeatedFloatWrapper + plus.repeatedFloatWrapper,
        repeatedDoubleWrapper = repeatedDoubleWrapper + plus.repeatedDoubleWrapper,
        repeatedStringWrapper = repeatedStringWrapper + plus.repeatedStringWrapper,
        repeatedBytesWrapper = repeatedBytesWrapper + plus.repeatedBytesWrapper,
        optionalDuration = optionalDuration?.plus(plus.optionalDuration) ?: plus.optionalDuration,
        optionalTimestamp = optionalTimestamp?.plus(plus.optionalTimestamp) ?: plus.optionalTimestamp,
        optionalFieldMask = optionalFieldMask?.plus(plus.optionalFieldMask) ?: plus.optionalFieldMask,
        optionalStruct = optionalStruct?.plus(plus.optionalStruct) ?: plus.optionalStruct,
        optionalAny = optionalAny?.plus(plus.optionalAny) ?: plus.optionalAny,
        optionalValue = optionalValue?.plus(plus.optionalValue) ?: plus.optionalValue,
        repeatedDuration = repeatedDuration + plus.repeatedDuration,
        repeatedTimestamp = repeatedTimestamp + plus.repeatedTimestamp,
        repeatedFieldmask = repeatedFieldmask + plus.repeatedFieldmask,
        repeatedStruct = repeatedStruct + plus.repeatedStruct,
        repeatedAny = repeatedAny + plus.repeatedAny,
        repeatedValue = repeatedValue + plus.repeatedValue,
        repeatedListValue = repeatedListValue + plus.repeatedListValue,
        oneofField = when {
            oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage && plus.oneofField is TestAllTypesProto3.OneofField.OneofNestedMessage ->
                TestAllTypesProto3.OneofField.OneofNestedMessage((oneofField as TestAllTypesProto3.OneofField.OneofNestedMessage).value + (plus.oneofField as TestAllTypesProto3.OneofField.OneofNestedMessage).value)
            else ->
                plus.oneofField ?: oneofField
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3 {
    var optionalInt32 = 0
    var optionalInt64 = 0L
    var optionalUint32 = 0
    var optionalUint64 = 0L
    var optionalSint32 = 0
    var optionalSint64 = 0L
    var optionalFixed32 = 0
    var optionalFixed64 = 0L
    var optionalSfixed32 = 0
    var optionalSfixed64 = 0L
    var optionalFloat = 0.0F
    var optionalDouble = 0.0
    var optionalBool = false
    var optionalString = ""
    var optionalBytes: pbandk.ByteArr = pbandk.ByteArr.empty
    var optionalNestedMessage: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null
    var optionalForeignMessage: pbandk.testpb.ForeignMessage? = null
    var optionalNestedEnum: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0)
    var optionalForeignEnum: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0)
    var optionalAliasedEnum: pbandk.testpb.TestAllTypesProto3.AliasedEnum = pbandk.testpb.TestAllTypesProto3.AliasedEnum.fromValue(0)
    var optionalStringPiece = ""
    var optionalCord = ""
    var recursiveMessage: pbandk.testpb.TestAllTypesProto3? = null
    var repeatedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedString: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytes: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var repeatedNestedMessage: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypesProto3.NestedMessage>? = null
    var repeatedForeignMessage: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignMessage>? = null
    var repeatedNestedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypesProto3.NestedEnum>? = null
    var repeatedForeignEnum: pbandk.ListWithSize.Builder<pbandk.testpb.ForeignEnum>? = null
    var repeatedStringPiece: pbandk.ListWithSize.Builder<String>? = null
    var repeatedCord: pbandk.ListWithSize.Builder<String>? = null
    var packedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var packedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var packedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var packedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var packedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var packedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var packedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var packedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var packedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var packedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var packedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var packedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var packedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var packedNestedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypesProto3.NestedEnum>? = null
    var unpackedInt32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedInt64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedUint32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedUint64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedSint32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedSint64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedFixed32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedFixed64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedSfixed32: pbandk.ListWithSize.Builder<Int>? = null
    var unpackedSfixed64: pbandk.ListWithSize.Builder<Long>? = null
    var unpackedFloat: pbandk.ListWithSize.Builder<Float>? = null
    var unpackedDouble: pbandk.ListWithSize.Builder<Double>? = null
    var unpackedBool: pbandk.ListWithSize.Builder<Boolean>? = null
    var unpackedNestedEnum: pbandk.ListWithSize.Builder<pbandk.testpb.TestAllTypesProto3.NestedEnum>? = null
    var mapInt32Int32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapInt64Int64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapUint32Uint32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapUint64Uint64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapSint32Sint32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapSint64Sint64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapFixed32Fixed32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapFixed64Fixed64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapSfixed32Sfixed32: pbandk.MessageMap.Builder<Int, Int>? = null
    var mapSfixed64Sfixed64: pbandk.MessageMap.Builder<Long, Long>? = null
    var mapInt32Float: pbandk.MessageMap.Builder<Int, Float>? = null
    var mapInt32Double: pbandk.MessageMap.Builder<Int, Double>? = null
    var mapBoolBool: pbandk.MessageMap.Builder<Boolean, Boolean>? = null
    var mapStringString: pbandk.MessageMap.Builder<String, String>? = null
    var mapStringBytes: pbandk.MessageMap.Builder<String, pbandk.ByteArr>? = null
    var mapStringNestedMessage: pbandk.MessageMap.Builder<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>? = null
    var mapStringForeignMessage: pbandk.MessageMap.Builder<String, pbandk.testpb.ForeignMessage?>? = null
    var mapStringNestedEnum: pbandk.MessageMap.Builder<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>? = null
    var mapStringForeignEnum: pbandk.MessageMap.Builder<String, pbandk.testpb.ForeignEnum>? = null
    var optionalBoolWrapper: Boolean? = null
    var optionalInt32Wrapper: Int? = null
    var optionalInt64Wrapper: Long? = null
    var optionalUint32Wrapper: Int? = null
    var optionalUint64Wrapper: Long? = null
    var optionalFloatWrapper: Float? = null
    var optionalDoubleWrapper: Double? = null
    var optionalStringWrapper: String? = null
    var optionalBytesWrapper: pbandk.ByteArr? = null
    var repeatedBoolWrapper: pbandk.ListWithSize.Builder<Boolean>? = null
    var repeatedInt32Wrapper: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedInt64Wrapper: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedUint32Wrapper: pbandk.ListWithSize.Builder<Int>? = null
    var repeatedUint64Wrapper: pbandk.ListWithSize.Builder<Long>? = null
    var repeatedFloatWrapper: pbandk.ListWithSize.Builder<Float>? = null
    var repeatedDoubleWrapper: pbandk.ListWithSize.Builder<Double>? = null
    var repeatedStringWrapper: pbandk.ListWithSize.Builder<String>? = null
    var repeatedBytesWrapper: pbandk.ListWithSize.Builder<pbandk.ByteArr>? = null
    var optionalDuration: pbandk.wkt.Duration? = null
    var optionalTimestamp: pbandk.wkt.Timestamp? = null
    var optionalFieldMask: pbandk.wkt.FieldMask? = null
    var optionalStruct: pbandk.wkt.Struct? = null
    var optionalAny: pbandk.wkt.Any? = null
    var optionalValue: pbandk.wkt.Value? = null
    var repeatedDuration: pbandk.ListWithSize.Builder<pbandk.wkt.Duration>? = null
    var repeatedTimestamp: pbandk.ListWithSize.Builder<pbandk.wkt.Timestamp>? = null
    var repeatedFieldmask: pbandk.ListWithSize.Builder<pbandk.wkt.FieldMask>? = null
    var repeatedStruct: pbandk.ListWithSize.Builder<pbandk.wkt.Struct>? = null
    var repeatedAny: pbandk.ListWithSize.Builder<pbandk.wkt.Any>? = null
    var repeatedValue: pbandk.ListWithSize.Builder<pbandk.wkt.Value>? = null
    var repeatedListValue: pbandk.ListWithSize.Builder<pbandk.wkt.ListValue>? = null
    var fieldname1 = 0
    var fieldName2 = 0
    var fieldName3 = 0
    var field_name4 = 0
    var field0name5 = 0
    var field0Name6 = 0
    var fieldName7 = 0
    var fieldName8 = 0
    var fieldName9 = 0
    var fieldName10 = 0
    var fIELDNAME11 = 0
    var fIELDName12 = 0
    var _fieldName13 = 0
    var _FieldName14 = 0
    var field_name15 = 0
    var field_Name16 = 0
    var fieldName17_ = 0
    var fieldName18_ = 0
    var oneofField: TestAllTypesProto3.OneofField<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> optionalInt32 = _fieldValue as Int
            2 -> optionalInt64 = _fieldValue as Long
            3 -> optionalUint32 = _fieldValue as Int
            4 -> optionalUint64 = _fieldValue as Long
            5 -> optionalSint32 = _fieldValue as Int
            6 -> optionalSint64 = _fieldValue as Long
            7 -> optionalFixed32 = _fieldValue as Int
            8 -> optionalFixed64 = _fieldValue as Long
            9 -> optionalSfixed32 = _fieldValue as Int
            10 -> optionalSfixed64 = _fieldValue as Long
            11 -> optionalFloat = _fieldValue as Float
            12 -> optionalDouble = _fieldValue as Double
            13 -> optionalBool = _fieldValue as Boolean
            14 -> optionalString = _fieldValue as String
            15 -> optionalBytes = _fieldValue as pbandk.ByteArr
            18 -> optionalNestedMessage = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedMessage
            19 -> optionalForeignMessage = _fieldValue as pbandk.testpb.ForeignMessage
            21 -> optionalNestedEnum = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedEnum
            22 -> optionalForeignEnum = _fieldValue as pbandk.testpb.ForeignEnum
            23 -> optionalAliasedEnum = _fieldValue as pbandk.testpb.TestAllTypesProto3.AliasedEnum
            24 -> optionalStringPiece = _fieldValue as String
            25 -> optionalCord = _fieldValue as String
            27 -> recursiveMessage = _fieldValue as pbandk.testpb.TestAllTypesProto3
            31 -> repeatedInt32 = (repeatedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            32 -> repeatedInt64 = (repeatedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            33 -> repeatedUint32 = (repeatedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            34 -> repeatedUint64 = (repeatedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            35 -> repeatedSint32 = (repeatedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            36 -> repeatedSint64 = (repeatedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            37 -> repeatedFixed32 = (repeatedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            38 -> repeatedFixed64 = (repeatedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            39 -> repeatedSfixed32 = (repeatedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            40 -> repeatedSfixed64 = (repeatedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            41 -> repeatedFloat = (repeatedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            42 -> repeatedDouble = (repeatedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            43 -> repeatedBool = (repeatedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            44 -> repeatedString = (repeatedString ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            45 -> repeatedBytes = (repeatedBytes ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            48 -> repeatedNestedMessage = (repeatedNestedMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypesProto3.NestedMessage> }
            49 -> repeatedForeignMessage = (repeatedForeignMessage ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignMessage> }
            51 -> repeatedNestedEnum = (repeatedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypesProto3.NestedEnum> }
            52 -> repeatedForeignEnum = (repeatedForeignEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.ForeignEnum> }
            54 -> repeatedStringPiece = (repeatedStringPiece ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            55 -> repeatedCord = (repeatedCord ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            56 -> mapInt32Int32 = (mapInt32Int32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            57 -> mapInt64Int64 = (mapInt64Int64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            58 -> mapUint32Uint32 = (mapUint32Uint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            59 -> mapUint64Uint64 = (mapUint64Uint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            60 -> mapSint32Sint32 = (mapSint32Sint32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            61 -> mapSint64Sint64 = (mapSint64Sint64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            62 -> mapFixed32Fixed32 = (mapFixed32Fixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            63 -> mapFixed64Fixed64 = (mapFixed64Fixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            64 -> mapSfixed32Sfixed32 = (mapSfixed32Sfixed32 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Int>> }
            65 -> mapSfixed64Sfixed64 = (mapSfixed64Sfixed64 ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Long, Long>> }
            66 -> mapInt32Float = (mapInt32Float ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Float>> }
            67 -> mapInt32Double = (mapInt32Double ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Int, Double>> }
            68 -> mapBoolBool = (mapBoolBool ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<Boolean, Boolean>> }
            69 -> mapStringString = (mapStringString ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
            70 -> mapStringBytes = (mapStringBytes ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.ByteArr>> }
            71 -> mapStringNestedMessage = (mapStringNestedMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedMessage?>> }
            72 -> mapStringForeignMessage = (mapStringForeignMessage ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.ForeignMessage?>> }
            73 -> mapStringNestedEnum = (mapStringNestedEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.TestAllTypesProto3.NestedEnum>> }
            74 -> mapStringForeignEnum = (mapStringForeignEnum ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.ForeignEnum>> }
            75 -> packedInt32 = (packedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            76 -> packedInt64 = (packedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            77 -> packedUint32 = (packedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            78 -> packedUint64 = (packedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            79 -> packedSint32 = (packedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            80 -> packedSint64 = (packedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            81 -> packedFixed32 = (packedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            82 -> packedFixed64 = (packedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            83 -> packedSfixed32 = (packedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            84 -> packedSfixed64 = (packedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            85 -> packedFloat = (packedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            86 -> packedDouble = (packedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            87 -> packedBool = (packedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            88 -> packedNestedEnum = (packedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypesProto3.NestedEnum> }
            89 -> unpackedInt32 = (unpackedInt32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            90 -> unpackedInt64 = (unpackedInt64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            91 -> unpackedUint32 = (unpackedUint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            92 -> unpackedUint64 = (unpackedUint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            93 -> unpackedSint32 = (unpackedSint32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            94 -> unpackedSint64 = (unpackedSint64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            95 -> unpackedFixed32 = (unpackedFixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            96 -> unpackedFixed64 = (unpackedFixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            97 -> unpackedSfixed32 = (unpackedSfixed32 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            98 -> unpackedSfixed64 = (unpackedSfixed64 ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            99 -> unpackedFloat = (unpackedFloat ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            100 -> unpackedDouble = (unpackedDouble ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            101 -> unpackedBool = (unpackedBool ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            102 -> unpackedNestedEnum = (unpackedNestedEnum ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.TestAllTypesProto3.NestedEnum> }
            111 -> oneofField = TestAllTypesProto3.OneofField.OneofUint32(_fieldValue as Int)
            112 -> oneofField = TestAllTypesProto3.OneofField.OneofNestedMessage(_fieldValue as pbandk.testpb.TestAllTypesProto3.NestedMessage)
            113 -> oneofField = TestAllTypesProto3.OneofField.OneofString(_fieldValue as String)
            114 -> oneofField = TestAllTypesProto3.OneofField.OneofBytes(_fieldValue as pbandk.ByteArr)
            115 -> oneofField = TestAllTypesProto3.OneofField.OneofBool(_fieldValue as Boolean)
            116 -> oneofField = TestAllTypesProto3.OneofField.OneofUint64(_fieldValue as Long)
            117 -> oneofField = TestAllTypesProto3.OneofField.OneofFloat(_fieldValue as Float)
            118 -> oneofField = TestAllTypesProto3.OneofField.OneofDouble(_fieldValue as Double)
            119 -> oneofField = TestAllTypesProto3.OneofField.OneofEnum(_fieldValue as pbandk.testpb.TestAllTypesProto3.NestedEnum)
            201 -> optionalBoolWrapper = _fieldValue as Boolean
            202 -> optionalInt32Wrapper = _fieldValue as Int
            203 -> optionalInt64Wrapper = _fieldValue as Long
            204 -> optionalUint32Wrapper = _fieldValue as Int
            205 -> optionalUint64Wrapper = _fieldValue as Long
            206 -> optionalFloatWrapper = _fieldValue as Float
            207 -> optionalDoubleWrapper = _fieldValue as Double
            208 -> optionalStringWrapper = _fieldValue as String
            209 -> optionalBytesWrapper = _fieldValue as pbandk.ByteArr
            211 -> repeatedBoolWrapper = (repeatedBoolWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Boolean> }
            212 -> repeatedInt32Wrapper = (repeatedInt32Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            213 -> repeatedInt64Wrapper = (repeatedInt64Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            214 -> repeatedUint32Wrapper = (repeatedUint32Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Int> }
            215 -> repeatedUint64Wrapper = (repeatedUint64Wrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
            216 -> repeatedFloatWrapper = (repeatedFloatWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Float> }
            217 -> repeatedDoubleWrapper = (repeatedDoubleWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Double> }
            218 -> repeatedStringWrapper = (repeatedStringWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<String> }
            219 -> repeatedBytesWrapper = (repeatedBytesWrapper ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.ByteArr> }
            301 -> optionalDuration = _fieldValue as pbandk.wkt.Duration
            302 -> optionalTimestamp = _fieldValue as pbandk.wkt.Timestamp
            303 -> optionalFieldMask = _fieldValue as pbandk.wkt.FieldMask
            304 -> optionalStruct = _fieldValue as pbandk.wkt.Struct
            305 -> optionalAny = _fieldValue as pbandk.wkt.Any
            306 -> optionalValue = _fieldValue as pbandk.wkt.Value
            311 -> repeatedDuration = (repeatedDuration ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Duration> }
            312 -> repeatedTimestamp = (repeatedTimestamp ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Timestamp> }
            313 -> repeatedFieldmask = (repeatedFieldmask ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.FieldMask> }
            315 -> repeatedAny = (repeatedAny ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Any> }
            316 -> repeatedValue = (repeatedValue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Value> }
            317 -> repeatedListValue = (repeatedListValue ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.ListValue> }
            324 -> repeatedStruct = (repeatedStruct ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.wkt.Struct> }
            401 -> fieldname1 = _fieldValue as Int
            402 -> fieldName2 = _fieldValue as Int
            403 -> fieldName3 = _fieldValue as Int
            404 -> field_name4 = _fieldValue as Int
            405 -> field0name5 = _fieldValue as Int
            406 -> field0Name6 = _fieldValue as Int
            407 -> fieldName7 = _fieldValue as Int
            408 -> fieldName8 = _fieldValue as Int
            409 -> fieldName9 = _fieldValue as Int
            410 -> fieldName10 = _fieldValue as Int
            411 -> fIELDNAME11 = _fieldValue as Int
            412 -> fIELDName12 = _fieldValue as Int
            413 -> _fieldName13 = _fieldValue as Int
            414 -> _FieldName14 = _fieldValue as Int
            415 -> field_name15 = _fieldValue as Int
            416 -> field_Name16 = _fieldValue as Int
            417 -> fieldName17_ = _fieldValue as Int
            418 -> fieldName18_ = _fieldValue as Int
        }
    }
    return TestAllTypesProto3(optionalInt32, optionalInt64, optionalUint32, optionalUint64,
        optionalSint32, optionalSint64, optionalFixed32, optionalFixed64,
        optionalSfixed32, optionalSfixed64, optionalFloat, optionalDouble,
        optionalBool, optionalString, optionalBytes, optionalNestedMessage,
        optionalForeignMessage, optionalNestedEnum, optionalForeignEnum, optionalAliasedEnum,
        optionalStringPiece, optionalCord, recursiveMessage, pbandk.ListWithSize.Builder.fixed(repeatedInt32),
        pbandk.ListWithSize.Builder.fixed(repeatedInt64), pbandk.ListWithSize.Builder.fixed(repeatedUint32), pbandk.ListWithSize.Builder.fixed(repeatedUint64), pbandk.ListWithSize.Builder.fixed(repeatedSint32),
        pbandk.ListWithSize.Builder.fixed(repeatedSint64), pbandk.ListWithSize.Builder.fixed(repeatedFixed32), pbandk.ListWithSize.Builder.fixed(repeatedFixed64), pbandk.ListWithSize.Builder.fixed(repeatedSfixed32),
        pbandk.ListWithSize.Builder.fixed(repeatedSfixed64), pbandk.ListWithSize.Builder.fixed(repeatedFloat), pbandk.ListWithSize.Builder.fixed(repeatedDouble), pbandk.ListWithSize.Builder.fixed(repeatedBool),
        pbandk.ListWithSize.Builder.fixed(repeatedString), pbandk.ListWithSize.Builder.fixed(repeatedBytes), pbandk.ListWithSize.Builder.fixed(repeatedNestedMessage), pbandk.ListWithSize.Builder.fixed(repeatedForeignMessage),
        pbandk.ListWithSize.Builder.fixed(repeatedNestedEnum), pbandk.ListWithSize.Builder.fixed(repeatedForeignEnum), pbandk.ListWithSize.Builder.fixed(repeatedStringPiece), pbandk.ListWithSize.Builder.fixed(repeatedCord),
        pbandk.ListWithSize.Builder.fixed(packedInt32), pbandk.ListWithSize.Builder.fixed(packedInt64), pbandk.ListWithSize.Builder.fixed(packedUint32), pbandk.ListWithSize.Builder.fixed(packedUint64),
        pbandk.ListWithSize.Builder.fixed(packedSint32), pbandk.ListWithSize.Builder.fixed(packedSint64), pbandk.ListWithSize.Builder.fixed(packedFixed32), pbandk.ListWithSize.Builder.fixed(packedFixed64),
        pbandk.ListWithSize.Builder.fixed(packedSfixed32), pbandk.ListWithSize.Builder.fixed(packedSfixed64), pbandk.ListWithSize.Builder.fixed(packedFloat), pbandk.ListWithSize.Builder.fixed(packedDouble),
        pbandk.ListWithSize.Builder.fixed(packedBool), pbandk.ListWithSize.Builder.fixed(packedNestedEnum), pbandk.ListWithSize.Builder.fixed(unpackedInt32), pbandk.ListWithSize.Builder.fixed(unpackedInt64),
        pbandk.ListWithSize.Builder.fixed(unpackedUint32), pbandk.ListWithSize.Builder.fixed(unpackedUint64), pbandk.ListWithSize.Builder.fixed(unpackedSint32), pbandk.ListWithSize.Builder.fixed(unpackedSint64),
        pbandk.ListWithSize.Builder.fixed(unpackedFixed32), pbandk.ListWithSize.Builder.fixed(unpackedFixed64), pbandk.ListWithSize.Builder.fixed(unpackedSfixed32), pbandk.ListWithSize.Builder.fixed(unpackedSfixed64),
        pbandk.ListWithSize.Builder.fixed(unpackedFloat), pbandk.ListWithSize.Builder.fixed(unpackedDouble), pbandk.ListWithSize.Builder.fixed(unpackedBool), pbandk.ListWithSize.Builder.fixed(unpackedNestedEnum),
        pbandk.MessageMap.Builder.fixed(mapInt32Int32), pbandk.MessageMap.Builder.fixed(mapInt64Int64), pbandk.MessageMap.Builder.fixed(mapUint32Uint32), pbandk.MessageMap.Builder.fixed(mapUint64Uint64),
        pbandk.MessageMap.Builder.fixed(mapSint32Sint32), pbandk.MessageMap.Builder.fixed(mapSint64Sint64), pbandk.MessageMap.Builder.fixed(mapFixed32Fixed32), pbandk.MessageMap.Builder.fixed(mapFixed64Fixed64),
        pbandk.MessageMap.Builder.fixed(mapSfixed32Sfixed32), pbandk.MessageMap.Builder.fixed(mapSfixed64Sfixed64), pbandk.MessageMap.Builder.fixed(mapInt32Float), pbandk.MessageMap.Builder.fixed(mapInt32Double),
        pbandk.MessageMap.Builder.fixed(mapBoolBool), pbandk.MessageMap.Builder.fixed(mapStringString), pbandk.MessageMap.Builder.fixed(mapStringBytes), pbandk.MessageMap.Builder.fixed(mapStringNestedMessage),
        pbandk.MessageMap.Builder.fixed(mapStringForeignMessage), pbandk.MessageMap.Builder.fixed(mapStringNestedEnum), pbandk.MessageMap.Builder.fixed(mapStringForeignEnum), optionalBoolWrapper,
        optionalInt32Wrapper, optionalInt64Wrapper, optionalUint32Wrapper, optionalUint64Wrapper,
        optionalFloatWrapper, optionalDoubleWrapper, optionalStringWrapper, optionalBytesWrapper,
        pbandk.ListWithSize.Builder.fixed(repeatedBoolWrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt32Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedInt64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedUint32Wrapper),
        pbandk.ListWithSize.Builder.fixed(repeatedUint64Wrapper), pbandk.ListWithSize.Builder.fixed(repeatedFloatWrapper), pbandk.ListWithSize.Builder.fixed(repeatedDoubleWrapper), pbandk.ListWithSize.Builder.fixed(repeatedStringWrapper),
        pbandk.ListWithSize.Builder.fixed(repeatedBytesWrapper), optionalDuration, optionalTimestamp, optionalFieldMask,
        optionalStruct, optionalAny, optionalValue, pbandk.ListWithSize.Builder.fixed(repeatedDuration),
        pbandk.ListWithSize.Builder.fixed(repeatedTimestamp), pbandk.ListWithSize.Builder.fixed(repeatedFieldmask), pbandk.ListWithSize.Builder.fixed(repeatedStruct), pbandk.ListWithSize.Builder.fixed(repeatedAny),
        pbandk.ListWithSize.Builder.fixed(repeatedValue), pbandk.ListWithSize.Builder.fixed(repeatedListValue), fieldname1, fieldName2,
        fieldName3, field_name4, field0name5, field0Name6,
        fieldName7, fieldName8, fieldName9, fieldName10,
        fIELDNAME11, fIELDName12, _fieldName13, _FieldName14,
        field_name15, field_Name16, fieldName17_, fieldName18_,
        oneofField, unknownFields)
}

fun TestAllTypesProto3.NestedMessage?.orDefault() = this ?: TestAllTypesProto3.NestedMessage.defaultInstance

fun TestAllTypesProto3.NestedMessage.copy(
    a: Int = 0,
    corecursive: pbandk.testpb.TestAllTypesProto3? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.NestedMessage = (this as TestAllTypesProto3_NestedMessage_Impl).copy(
    a,
    corecursive,
    unknownFields
)

private data class TestAllTypesProto3_NestedMessage_Impl(
    override val a: Int,
    override val corecursive: pbandk.testpb.TestAllTypesProto3?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.NestedMessage {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.NestedMessage.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.NestedMessage.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.NestedMessage = (plus as? TestAllTypesProto3.NestedMessage)?.let {
    it.copy(
        corecursive = corecursive?.plus(plus.corecursive) ?: plus.corecursive,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.NestedMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.NestedMessage {
    var a = 0
    var corecursive: pbandk.testpb.TestAllTypesProto3? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> a = _fieldValue as Int
            2 -> corecursive = _fieldValue as pbandk.testpb.TestAllTypesProto3
        }
    }
    return TestAllTypesProto3.NestedMessage(a, corecursive, unknownFields)
}

fun TestAllTypesProto3.MapInt32Int32Entry?.orDefault() = this ?: TestAllTypesProto3.MapInt32Int32Entry.defaultInstance

fun TestAllTypesProto3.MapInt32Int32Entry.copy(
    key: Int = 0,
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapInt32Int32Entry = (this as TestAllTypesProto3_MapInt32Int32Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapInt32Int32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt32Int32Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapInt32Int32Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapInt32Int32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt32Int32Entry = (plus as? TestAllTypesProto3.MapInt32Int32Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32Int32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt32Int32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapInt32Int32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapInt64Int64Entry?.orDefault() = this ?: TestAllTypesProto3.MapInt64Int64Entry.defaultInstance

fun TestAllTypesProto3.MapInt64Int64Entry.copy(
    key: Long = 0L,
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapInt64Int64Entry = (this as TestAllTypesProto3_MapInt64Int64Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapInt64Int64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt64Int64Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapInt64Int64Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapInt64Int64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt64Int64Entry = (plus as? TestAllTypesProto3.MapInt64Int64Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt64Int64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt64Int64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapInt64Int64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapUint32Uint32Entry?.orDefault() = this ?: TestAllTypesProto3.MapUint32Uint32Entry.defaultInstance

fun TestAllTypesProto3.MapUint32Uint32Entry.copy(
    key: Int = 0,
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapUint32Uint32Entry = (this as TestAllTypesProto3_MapUint32Uint32Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapUint32Uint32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapUint32Uint32Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapUint32Uint32Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapUint32Uint32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapUint32Uint32Entry = (plus as? TestAllTypesProto3.MapUint32Uint32Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapUint32Uint32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapUint32Uint32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapUint32Uint32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapUint64Uint64Entry?.orDefault() = this ?: TestAllTypesProto3.MapUint64Uint64Entry.defaultInstance

fun TestAllTypesProto3.MapUint64Uint64Entry.copy(
    key: Long = 0L,
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapUint64Uint64Entry = (this as TestAllTypesProto3_MapUint64Uint64Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapUint64Uint64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapUint64Uint64Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapUint64Uint64Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapUint64Uint64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapUint64Uint64Entry = (plus as? TestAllTypesProto3.MapUint64Uint64Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapUint64Uint64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapUint64Uint64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapUint64Uint64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSint32Sint32Entry?.orDefault() = this ?: TestAllTypesProto3.MapSint32Sint32Entry.defaultInstance

fun TestAllTypesProto3.MapSint32Sint32Entry.copy(
    key: Int = 0,
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapSint32Sint32Entry = (this as TestAllTypesProto3_MapSint32Sint32Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapSint32Sint32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSint32Sint32Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapSint32Sint32Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapSint32Sint32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSint32Sint32Entry = (plus as? TestAllTypesProto3.MapSint32Sint32Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSint32Sint32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSint32Sint32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapSint32Sint32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSint64Sint64Entry?.orDefault() = this ?: TestAllTypesProto3.MapSint64Sint64Entry.defaultInstance

fun TestAllTypesProto3.MapSint64Sint64Entry.copy(
    key: Long = 0L,
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapSint64Sint64Entry = (this as TestAllTypesProto3_MapSint64Sint64Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapSint64Sint64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSint64Sint64Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapSint64Sint64Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapSint64Sint64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSint64Sint64Entry = (plus as? TestAllTypesProto3.MapSint64Sint64Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSint64Sint64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSint64Sint64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapSint64Sint64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapFixed32Fixed32Entry?.orDefault() = this ?: TestAllTypesProto3.MapFixed32Fixed32Entry.defaultInstance

fun TestAllTypesProto3.MapFixed32Fixed32Entry.copy(
    key: Int = 0,
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapFixed32Fixed32Entry = (this as TestAllTypesProto3_MapFixed32Fixed32Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapFixed32Fixed32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapFixed32Fixed32Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapFixed32Fixed32Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapFixed32Fixed32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapFixed32Fixed32Entry = (plus as? TestAllTypesProto3.MapFixed32Fixed32Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapFixed32Fixed32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapFixed32Fixed32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapFixed32Fixed32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapFixed64Fixed64Entry?.orDefault() = this ?: TestAllTypesProto3.MapFixed64Fixed64Entry.defaultInstance

fun TestAllTypesProto3.MapFixed64Fixed64Entry.copy(
    key: Long = 0L,
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapFixed64Fixed64Entry = (this as TestAllTypesProto3_MapFixed64Fixed64Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapFixed64Fixed64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapFixed64Fixed64Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapFixed64Fixed64Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapFixed64Fixed64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapFixed64Fixed64Entry = (plus as? TestAllTypesProto3.MapFixed64Fixed64Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapFixed64Fixed64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapFixed64Fixed64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapFixed64Fixed64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSfixed32Sfixed32Entry?.orDefault() = this ?: TestAllTypesProto3.MapSfixed32Sfixed32Entry.defaultInstance

fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.copy(
    key: Int = 0,
    value: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapSfixed32Sfixed32Entry = (this as TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapSfixed32Sfixed32Entry_Impl(
    override val key: Int,
    override val value: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapSfixed32Sfixed32Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSfixed32Sfixed32Entry = (plus as? TestAllTypesProto3.MapSfixed32Sfixed32Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSfixed32Sfixed32Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSfixed32Sfixed32Entry {
    var key = 0
    var value = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Int
        }
    }
    return TestAllTypesProto3.MapSfixed32Sfixed32Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapSfixed64Sfixed64Entry?.orDefault() = this ?: TestAllTypesProto3.MapSfixed64Sfixed64Entry.defaultInstance

fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.copy(
    key: Long = 0L,
    value: Long = 0L,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapSfixed64Sfixed64Entry = (this as TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapSfixed64Sfixed64Entry_Impl(
    override val key: Long,
    override val value: Long,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapSfixed64Sfixed64Entry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapSfixed64Sfixed64Entry = (plus as? TestAllTypesProto3.MapSfixed64Sfixed64Entry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapSfixed64Sfixed64Entry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapSfixed64Sfixed64Entry {
    var key = 0L
    var value = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Long
            2 -> value = _fieldValue as Long
        }
    }
    return TestAllTypesProto3.MapSfixed64Sfixed64Entry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapInt32FloatEntry?.orDefault() = this ?: TestAllTypesProto3.MapInt32FloatEntry.defaultInstance

fun TestAllTypesProto3.MapInt32FloatEntry.copy(
    key: Int = 0,
    value: Float = 0.0F,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapInt32FloatEntry = (this as TestAllTypesProto3_MapInt32FloatEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapInt32FloatEntry_Impl(
    override val key: Int,
    override val value: Float,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt32FloatEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapInt32FloatEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapInt32FloatEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt32FloatEntry = (plus as? TestAllTypesProto3.MapInt32FloatEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32FloatEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt32FloatEntry {
    var key = 0
    var value = 0.0F

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Float
        }
    }
    return TestAllTypesProto3.MapInt32FloatEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapInt32DoubleEntry?.orDefault() = this ?: TestAllTypesProto3.MapInt32DoubleEntry.defaultInstance

fun TestAllTypesProto3.MapInt32DoubleEntry.copy(
    key: Int = 0,
    value: Double = 0.0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapInt32DoubleEntry = (this as TestAllTypesProto3_MapInt32DoubleEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapInt32DoubleEntry_Impl(
    override val key: Int,
    override val value: Double,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapInt32DoubleEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapInt32DoubleEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapInt32DoubleEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapInt32DoubleEntry = (plus as? TestAllTypesProto3.MapInt32DoubleEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapInt32DoubleEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapInt32DoubleEntry {
    var key = 0
    var value = 0.0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Int
            2 -> value = _fieldValue as Double
        }
    }
    return TestAllTypesProto3.MapInt32DoubleEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapBoolBoolEntry?.orDefault() = this ?: TestAllTypesProto3.MapBoolBoolEntry.defaultInstance

fun TestAllTypesProto3.MapBoolBoolEntry.copy(
    key: Boolean = false,
    value: Boolean = false,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapBoolBoolEntry = (this as TestAllTypesProto3_MapBoolBoolEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapBoolBoolEntry_Impl(
    override val key: Boolean,
    override val value: Boolean,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapBoolBoolEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapBoolBoolEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapBoolBoolEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapBoolBoolEntry = (plus as? TestAllTypesProto3.MapBoolBoolEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapBoolBoolEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapBoolBoolEntry {
    var key = false
    var value = false

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as Boolean
            2 -> value = _fieldValue as Boolean
        }
    }
    return TestAllTypesProto3.MapBoolBoolEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringStringEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringStringEntry.defaultInstance

fun TestAllTypesProto3.MapStringStringEntry.copy(
    key: String = "",
    value: String = "",
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapStringStringEntry = (this as TestAllTypesProto3_MapStringStringEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapStringStringEntry_Impl(
    override val key: String,
    override val value: String,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringStringEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapStringStringEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapStringStringEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringStringEntry = (plus as? TestAllTypesProto3.MapStringStringEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringStringEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringStringEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    return TestAllTypesProto3.MapStringStringEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringBytesEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringBytesEntry.defaultInstance

fun TestAllTypesProto3.MapStringBytesEntry.copy(
    key: String = "",
    value: pbandk.ByteArr = pbandk.ByteArr.empty,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapStringBytesEntry = (this as TestAllTypesProto3_MapStringBytesEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapStringBytesEntry_Impl(
    override val key: String,
    override val value: pbandk.ByteArr,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringBytesEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapStringBytesEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapStringBytesEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringBytesEntry = (plus as? TestAllTypesProto3.MapStringBytesEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringBytesEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringBytesEntry {
    var key = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return TestAllTypesProto3.MapStringBytesEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringNestedMessageEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringNestedMessageEntry.defaultInstance

fun TestAllTypesProto3.MapStringNestedMessageEntry.copy(
    key: String = "",
    value: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapStringNestedMessageEntry = (this as TestAllTypesProto3_MapStringNestedMessageEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapStringNestedMessageEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.TestAllTypesProto3.NestedMessage?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringNestedMessageEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapStringNestedMessageEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapStringNestedMessageEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringNestedMessageEntry = (plus as? TestAllTypesProto3.MapStringNestedMessageEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringNestedMessageEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringNestedMessageEntry {
    var key = ""
    var value: pbandk.testpb.TestAllTypesProto3.NestedMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedMessage
        }
    }
    return TestAllTypesProto3.MapStringNestedMessageEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringForeignMessageEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringForeignMessageEntry.defaultInstance

fun TestAllTypesProto3.MapStringForeignMessageEntry.copy(
    key: String = "",
    value: pbandk.testpb.ForeignMessage? = null,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapStringForeignMessageEntry = (this as TestAllTypesProto3_MapStringForeignMessageEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapStringForeignMessageEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.ForeignMessage?,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringForeignMessageEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapStringForeignMessageEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapStringForeignMessageEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringForeignMessageEntry = (plus as? TestAllTypesProto3.MapStringForeignMessageEntry)?.let {
    it.copy(
        value = value?.plus(plus.value) ?: plus.value,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringForeignMessageEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringForeignMessageEntry {
    var key = ""
    var value: pbandk.testpb.ForeignMessage? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.ForeignMessage
        }
    }
    return TestAllTypesProto3.MapStringForeignMessageEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringNestedEnumEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringNestedEnumEntry.defaultInstance

fun TestAllTypesProto3.MapStringNestedEnumEntry.copy(
    key: String = "",
    value: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapStringNestedEnumEntry = (this as TestAllTypesProto3_MapStringNestedEnumEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapStringNestedEnumEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.TestAllTypesProto3.NestedEnum,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringNestedEnumEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapStringNestedEnumEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapStringNestedEnumEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringNestedEnumEntry = (plus as? TestAllTypesProto3.MapStringNestedEnumEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringNestedEnumEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringNestedEnumEntry {
    var key = ""
    var value: pbandk.testpb.TestAllTypesProto3.NestedEnum = pbandk.testpb.TestAllTypesProto3.NestedEnum.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.TestAllTypesProto3.NestedEnum
        }
    }
    return TestAllTypesProto3.MapStringNestedEnumEntry(key, value, unknownFields)
}

fun TestAllTypesProto3.MapStringForeignEnumEntry?.orDefault() = this ?: TestAllTypesProto3.MapStringForeignEnumEntry.defaultInstance

fun TestAllTypesProto3.MapStringForeignEnumEntry.copy(
    key: String = "",
    value: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0),
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): TestAllTypesProto3.MapStringForeignEnumEntry = (this as TestAllTypesProto3_MapStringForeignEnumEntry_Impl).copy(
    key,
    value,
    unknownFields
)

private data class TestAllTypesProto3_MapStringForeignEnumEntry_Impl(
    override val key: String,
    override val value: pbandk.testpb.ForeignEnum,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : TestAllTypesProto3.MapStringForeignEnumEntry {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = TestAllTypesProto3.MapStringForeignEnumEntry.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun TestAllTypesProto3.MapStringForeignEnumEntry.protoMergeImpl(plus: pbandk.Message?): TestAllTypesProto3.MapStringForeignEnumEntry = (plus as? TestAllTypesProto3.MapStringForeignEnumEntry)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TestAllTypesProto3.MapStringForeignEnumEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TestAllTypesProto3.MapStringForeignEnumEntry {
    var key = ""
    var value: pbandk.testpb.ForeignEnum = pbandk.testpb.ForeignEnum.fromValue(0)

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.ForeignEnum
        }
    }
    return TestAllTypesProto3.MapStringForeignEnumEntry(key, value, unknownFields)
}

fun ForeignMessage?.orDefault() = this ?: ForeignMessage.defaultInstance

fun ForeignMessage.copy(
    c: Int = 0,
    unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
): ForeignMessage = (this as ForeignMessage_Impl).copy(
    c,
    unknownFields
)

private data class ForeignMessage_Impl(
    override val c: Int,
    override val unknownFields: Map<Int, pbandk.UnknownField>
) : ForeignMessage {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = ForeignMessage.descriptor
    override val protoSize by lazy { super.protoSize }
}

private fun ForeignMessage.protoMergeImpl(plus: pbandk.Message?): ForeignMessage = (plus as? ForeignMessage)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ForeignMessage.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ForeignMessage {
    var c = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> c = _fieldValue as Int
        }
    }
    return ForeignMessage(c, unknownFields)
}
