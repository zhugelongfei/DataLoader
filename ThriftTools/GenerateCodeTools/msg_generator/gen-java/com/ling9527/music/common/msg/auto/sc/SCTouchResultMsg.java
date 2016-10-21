/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto.sc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 摸一摸结果
 */
public class SCTouchResultMsg implements org.apache.thrift.TBase<SCTouchResultMsg, SCTouchResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCTouchResultMsg");

  private static final org.apache.thrift.protocol.TField CAN_ADD_LOVER_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("canAddLoverVal", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField INC_TARGET_POP_FIELD_DESC = new org.apache.thrift.protocol.TField("incTargetPop", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RELATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("relationType", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField INC_RELATION_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("incRelationVal", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCTouchResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCTouchResultMsgTupleSchemeFactory());
  }

  /**
   * 能否增加爱心值
   */
  public boolean canAddLoverVal; // required
  /**
   * 被摸者增加人气值
   */
  public int incTargetPop; // required
  /**
   * 关系类型 -1无关系 0-好友 1-密友 2-情侣 3-夫妻
   */
  public byte relationType; // required
  /**
   * 增加的友好度或亲密值或甜蜜值
   */
  public int incRelationVal; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 能否增加爱心值
     */
    CAN_ADD_LOVER_VAL((short)1, "canAddLoverVal"),
    /**
     * 被摸者增加人气值
     */
    INC_TARGET_POP((short)2, "incTargetPop"),
    /**
     * 关系类型 -1无关系 0-好友 1-密友 2-情侣 3-夫妻
     */
    RELATION_TYPE((short)3, "relationType"),
    /**
     * 增加的友好度或亲密值或甜蜜值
     */
    INC_RELATION_VAL((short)4, "incRelationVal");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CAN_ADD_LOVER_VAL
          return CAN_ADD_LOVER_VAL;
        case 2: // INC_TARGET_POP
          return INC_TARGET_POP;
        case 3: // RELATION_TYPE
          return RELATION_TYPE;
        case 4: // INC_RELATION_VAL
          return INC_RELATION_VAL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CANADDLOVERVAL_ISSET_ID = 0;
  private static final int __INCTARGETPOP_ISSET_ID = 1;
  private static final int __RELATIONTYPE_ISSET_ID = 2;
  private static final int __INCRELATIONVAL_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.INC_RELATION_VAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAN_ADD_LOVER_VAL, new org.apache.thrift.meta_data.FieldMetaData("canAddLoverVal", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INC_TARGET_POP, new org.apache.thrift.meta_data.FieldMetaData("incTargetPop", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RELATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("relationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.INC_RELATION_VAL, new org.apache.thrift.meta_data.FieldMetaData("incRelationVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCTouchResultMsg.class, metaDataMap);
  }

  public SCTouchResultMsg() {
  }

  public SCTouchResultMsg(
    boolean canAddLoverVal,
    int incTargetPop,
    byte relationType)
  {
    this();
    this.canAddLoverVal = canAddLoverVal;
    setCanAddLoverValIsSet(true);
    this.incTargetPop = incTargetPop;
    setIncTargetPopIsSet(true);
    this.relationType = relationType;
    setRelationTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCTouchResultMsg(SCTouchResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.canAddLoverVal = other.canAddLoverVal;
    this.incTargetPop = other.incTargetPop;
    this.relationType = other.relationType;
    this.incRelationVal = other.incRelationVal;
  }

  public SCTouchResultMsg deepCopy() {
    return new SCTouchResultMsg(this);
  }

  @Override
  public void clear() {
    setCanAddLoverValIsSet(false);
    this.canAddLoverVal = false;
    setIncTargetPopIsSet(false);
    this.incTargetPop = 0;
    setRelationTypeIsSet(false);
    this.relationType = 0;
    setIncRelationValIsSet(false);
    this.incRelationVal = 0;
  }

  /**
   * 能否增加爱心值
   */
  public boolean isCanAddLoverVal() {
    return this.canAddLoverVal;
  }

  /**
   * 能否增加爱心值
   */
  public SCTouchResultMsg setCanAddLoverVal(boolean canAddLoverVal) {
    this.canAddLoverVal = canAddLoverVal;
    setCanAddLoverValIsSet(true);
    return this;
  }

  public void unsetCanAddLoverVal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CANADDLOVERVAL_ISSET_ID);
  }

  /** Returns true if field canAddLoverVal is set (has been assigned a value) and false otherwise */
  public boolean isSetCanAddLoverVal() {
    return EncodingUtils.testBit(__isset_bitfield, __CANADDLOVERVAL_ISSET_ID);
  }

  public void setCanAddLoverValIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CANADDLOVERVAL_ISSET_ID, value);
  }

  /**
   * 被摸者增加人气值
   */
  public int getIncTargetPop() {
    return this.incTargetPop;
  }

  /**
   * 被摸者增加人气值
   */
  public SCTouchResultMsg setIncTargetPop(int incTargetPop) {
    this.incTargetPop = incTargetPop;
    setIncTargetPopIsSet(true);
    return this;
  }

  public void unsetIncTargetPop() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCTARGETPOP_ISSET_ID);
  }

  /** Returns true if field incTargetPop is set (has been assigned a value) and false otherwise */
  public boolean isSetIncTargetPop() {
    return EncodingUtils.testBit(__isset_bitfield, __INCTARGETPOP_ISSET_ID);
  }

  public void setIncTargetPopIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCTARGETPOP_ISSET_ID, value);
  }

  /**
   * 关系类型 -1无关系 0-好友 1-密友 2-情侣 3-夫妻
   */
  public byte getRelationType() {
    return this.relationType;
  }

  /**
   * 关系类型 -1无关系 0-好友 1-密友 2-情侣 3-夫妻
   */
  public SCTouchResultMsg setRelationType(byte relationType) {
    this.relationType = relationType;
    setRelationTypeIsSet(true);
    return this;
  }

  public void unsetRelationType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RELATIONTYPE_ISSET_ID);
  }

  /** Returns true if field relationType is set (has been assigned a value) and false otherwise */
  public boolean isSetRelationType() {
    return EncodingUtils.testBit(__isset_bitfield, __RELATIONTYPE_ISSET_ID);
  }

  public void setRelationTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RELATIONTYPE_ISSET_ID, value);
  }

  /**
   * 增加的友好度或亲密值或甜蜜值
   */
  public int getIncRelationVal() {
    return this.incRelationVal;
  }

  /**
   * 增加的友好度或亲密值或甜蜜值
   */
  public SCTouchResultMsg setIncRelationVal(int incRelationVal) {
    this.incRelationVal = incRelationVal;
    setIncRelationValIsSet(true);
    return this;
  }

  public void unsetIncRelationVal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCRELATIONVAL_ISSET_ID);
  }

  /** Returns true if field incRelationVal is set (has been assigned a value) and false otherwise */
  public boolean isSetIncRelationVal() {
    return EncodingUtils.testBit(__isset_bitfield, __INCRELATIONVAL_ISSET_ID);
  }

  public void setIncRelationValIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCRELATIONVAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CAN_ADD_LOVER_VAL:
      if (value == null) {
        unsetCanAddLoverVal();
      } else {
        setCanAddLoverVal((Boolean)value);
      }
      break;

    case INC_TARGET_POP:
      if (value == null) {
        unsetIncTargetPop();
      } else {
        setIncTargetPop((Integer)value);
      }
      break;

    case RELATION_TYPE:
      if (value == null) {
        unsetRelationType();
      } else {
        setRelationType((Byte)value);
      }
      break;

    case INC_RELATION_VAL:
      if (value == null) {
        unsetIncRelationVal();
      } else {
        setIncRelationVal((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CAN_ADD_LOVER_VAL:
      return Boolean.valueOf(isCanAddLoverVal());

    case INC_TARGET_POP:
      return Integer.valueOf(getIncTargetPop());

    case RELATION_TYPE:
      return Byte.valueOf(getRelationType());

    case INC_RELATION_VAL:
      return Integer.valueOf(getIncRelationVal());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CAN_ADD_LOVER_VAL:
      return isSetCanAddLoverVal();
    case INC_TARGET_POP:
      return isSetIncTargetPop();
    case RELATION_TYPE:
      return isSetRelationType();
    case INC_RELATION_VAL:
      return isSetIncRelationVal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCTouchResultMsg)
      return this.equals((SCTouchResultMsg)that);
    return false;
  }

  public boolean equals(SCTouchResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_canAddLoverVal = true;
    boolean that_present_canAddLoverVal = true;
    if (this_present_canAddLoverVal || that_present_canAddLoverVal) {
      if (!(this_present_canAddLoverVal && that_present_canAddLoverVal))
        return false;
      if (this.canAddLoverVal != that.canAddLoverVal)
        return false;
    }

    boolean this_present_incTargetPop = true;
    boolean that_present_incTargetPop = true;
    if (this_present_incTargetPop || that_present_incTargetPop) {
      if (!(this_present_incTargetPop && that_present_incTargetPop))
        return false;
      if (this.incTargetPop != that.incTargetPop)
        return false;
    }

    boolean this_present_relationType = true;
    boolean that_present_relationType = true;
    if (this_present_relationType || that_present_relationType) {
      if (!(this_present_relationType && that_present_relationType))
        return false;
      if (this.relationType != that.relationType)
        return false;
    }

    boolean this_present_incRelationVal = true && this.isSetIncRelationVal();
    boolean that_present_incRelationVal = true && that.isSetIncRelationVal();
    if (this_present_incRelationVal || that_present_incRelationVal) {
      if (!(this_present_incRelationVal && that_present_incRelationVal))
        return false;
      if (this.incRelationVal != that.incRelationVal)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCTouchResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCTouchResultMsg typedOther = (SCTouchResultMsg)other;

    lastComparison = Boolean.valueOf(isSetCanAddLoverVal()).compareTo(typedOther.isSetCanAddLoverVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCanAddLoverVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.canAddLoverVal, typedOther.canAddLoverVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncTargetPop()).compareTo(typedOther.isSetIncTargetPop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncTargetPop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.incTargetPop, typedOther.incTargetPop);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRelationType()).compareTo(typedOther.isSetRelationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relationType, typedOther.relationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncRelationVal()).compareTo(typedOther.isSetIncRelationVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncRelationVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.incRelationVal, typedOther.incRelationVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SCTouchResultMsg(");
    boolean first = true;

    sb.append("canAddLoverVal:");
    sb.append(this.canAddLoverVal);
    first = false;
    if (!first) sb.append(", ");
    sb.append("incTargetPop:");
    sb.append(this.incTargetPop);
    first = false;
    if (!first) sb.append(", ");
    sb.append("relationType:");
    sb.append(this.relationType);
    first = false;
    if (isSetIncRelationVal()) {
      if (!first) sb.append(", ");
      sb.append("incRelationVal:");
      sb.append(this.incRelationVal);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCTouchResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCTouchResultMsgStandardScheme getScheme() {
      return new SCTouchResultMsgStandardScheme();
    }
  }

  private static class SCTouchResultMsgStandardScheme extends StandardScheme<SCTouchResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCTouchResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAN_ADD_LOVER_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.canAddLoverVal = iprot.readBool();
              struct.setCanAddLoverValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INC_TARGET_POP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.incTargetPop = iprot.readI32();
              struct.setIncTargetPopIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RELATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.relationType = iprot.readByte();
              struct.setRelationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INC_RELATION_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.incRelationVal = iprot.readI32();
              struct.setIncRelationValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCTouchResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CAN_ADD_LOVER_VAL_FIELD_DESC);
      oprot.writeBool(struct.canAddLoverVal);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INC_TARGET_POP_FIELD_DESC);
      oprot.writeI32(struct.incTargetPop);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RELATION_TYPE_FIELD_DESC);
      oprot.writeByte(struct.relationType);
      oprot.writeFieldEnd();
      if (struct.isSetIncRelationVal()) {
        oprot.writeFieldBegin(INC_RELATION_VAL_FIELD_DESC);
        oprot.writeI32(struct.incRelationVal);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCTouchResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCTouchResultMsgTupleScheme getScheme() {
      return new SCTouchResultMsgTupleScheme();
    }
  }

  private static class SCTouchResultMsgTupleScheme extends TupleScheme<SCTouchResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCTouchResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCanAddLoverVal()) {
        optionals.set(0);
      }
      if (struct.isSetIncTargetPop()) {
        optionals.set(1);
      }
      if (struct.isSetRelationType()) {
        optionals.set(2);
      }
      if (struct.isSetIncRelationVal()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCanAddLoverVal()) {
        oprot.writeBool(struct.canAddLoverVal);
      }
      if (struct.isSetIncTargetPop()) {
        oprot.writeI32(struct.incTargetPop);
      }
      if (struct.isSetRelationType()) {
        oprot.writeByte(struct.relationType);
      }
      if (struct.isSetIncRelationVal()) {
        oprot.writeI32(struct.incRelationVal);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCTouchResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.canAddLoverVal = iprot.readBool();
        struct.setCanAddLoverValIsSet(true);
      }
      if (incoming.get(1)) {
        struct.incTargetPop = iprot.readI32();
        struct.setIncTargetPopIsSet(true);
      }
      if (incoming.get(2)) {
        struct.relationType = iprot.readByte();
        struct.setRelationTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.incRelationVal = iprot.readI32();
        struct.setIncRelationValIsSet(true);
      }
    }
  }

}

