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

public class SCBuySingleItemSuccMsg implements org.apache.thrift.TBase<SCBuySingleItemSuccMsg, SCBuySingleItemSuccMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCBuySingleItemSuccMsg");

  private static final org.apache.thrift.protocol.TField ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VALID_TIME_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("validTimeType", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField IS_LIMIT_MALL_FIELD_DESC = new org.apache.thrift.protocol.TField("isLimitMall", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCBuySingleItemSuccMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCBuySingleItemSuccMsgTupleSchemeFactory());
  }

  public int itemId; // required
  public byte validTimeType; // required
  public short count; // required
  /**
   * 是否限时商城
   */
  public boolean isLimitMall; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_ID((short)1, "itemId"),
    VALID_TIME_TYPE((short)2, "validTimeType"),
    COUNT((short)3, "count"),
    /**
     * 是否限时商城
     */
    IS_LIMIT_MALL((short)4, "isLimitMall");

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
        case 1: // ITEM_ID
          return ITEM_ID;
        case 2: // VALID_TIME_TYPE
          return VALID_TIME_TYPE;
        case 3: // COUNT
          return COUNT;
        case 4: // IS_LIMIT_MALL
          return IS_LIMIT_MALL;
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
  private static final int __ITEMID_ISSET_ID = 0;
  private static final int __VALIDTIMETYPE_ISSET_ID = 1;
  private static final int __COUNT_ISSET_ID = 2;
  private static final int __ISLIMITMALL_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.IS_LIMIT_MALL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("itemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALID_TIME_TYPE, new org.apache.thrift.meta_data.FieldMetaData("validTimeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.IS_LIMIT_MALL, new org.apache.thrift.meta_data.FieldMetaData("isLimitMall", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCBuySingleItemSuccMsg.class, metaDataMap);
  }

  public SCBuySingleItemSuccMsg() {
  }

  public SCBuySingleItemSuccMsg(
    int itemId,
    byte validTimeType,
    short count)
  {
    this();
    this.itemId = itemId;
    setItemIdIsSet(true);
    this.validTimeType = validTimeType;
    setValidTimeTypeIsSet(true);
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCBuySingleItemSuccMsg(SCBuySingleItemSuccMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.itemId = other.itemId;
    this.validTimeType = other.validTimeType;
    this.count = other.count;
    this.isLimitMall = other.isLimitMall;
  }

  public SCBuySingleItemSuccMsg deepCopy() {
    return new SCBuySingleItemSuccMsg(this);
  }

  @Override
  public void clear() {
    setItemIdIsSet(false);
    this.itemId = 0;
    setValidTimeTypeIsSet(false);
    this.validTimeType = 0;
    setCountIsSet(false);
    this.count = 0;
    setIsLimitMallIsSet(false);
    this.isLimitMall = false;
  }

  public int getItemId() {
    return this.itemId;
  }

  public SCBuySingleItemSuccMsg setItemId(int itemId) {
    this.itemId = itemId;
    setItemIdIsSet(true);
    return this;
  }

  public void unsetItemId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITEMID_ISSET_ID);
  }

  /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemId() {
    return EncodingUtils.testBit(__isset_bitfield, __ITEMID_ISSET_ID);
  }

  public void setItemIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITEMID_ISSET_ID, value);
  }

  public byte getValidTimeType() {
    return this.validTimeType;
  }

  public SCBuySingleItemSuccMsg setValidTimeType(byte validTimeType) {
    this.validTimeType = validTimeType;
    setValidTimeTypeIsSet(true);
    return this;
  }

  public void unsetValidTimeType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALIDTIMETYPE_ISSET_ID);
  }

  /** Returns true if field validTimeType is set (has been assigned a value) and false otherwise */
  public boolean isSetValidTimeType() {
    return EncodingUtils.testBit(__isset_bitfield, __VALIDTIMETYPE_ISSET_ID);
  }

  public void setValidTimeTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALIDTIMETYPE_ISSET_ID, value);
  }

  public short getCount() {
    return this.count;
  }

  public SCBuySingleItemSuccMsg setCount(short count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  /**
   * 是否限时商城
   */
  public boolean isIsLimitMall() {
    return this.isLimitMall;
  }

  /**
   * 是否限时商城
   */
  public SCBuySingleItemSuccMsg setIsLimitMall(boolean isLimitMall) {
    this.isLimitMall = isLimitMall;
    setIsLimitMallIsSet(true);
    return this;
  }

  public void unsetIsLimitMall() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID);
  }

  /** Returns true if field isLimitMall is set (has been assigned a value) and false otherwise */
  public boolean isSetIsLimitMall() {
    return EncodingUtils.testBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID);
  }

  public void setIsLimitMallIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM_ID:
      if (value == null) {
        unsetItemId();
      } else {
        setItemId((Integer)value);
      }
      break;

    case VALID_TIME_TYPE:
      if (value == null) {
        unsetValidTimeType();
      } else {
        setValidTimeType((Byte)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Short)value);
      }
      break;

    case IS_LIMIT_MALL:
      if (value == null) {
        unsetIsLimitMall();
      } else {
        setIsLimitMall((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_ID:
      return Integer.valueOf(getItemId());

    case VALID_TIME_TYPE:
      return Byte.valueOf(getValidTimeType());

    case COUNT:
      return Short.valueOf(getCount());

    case IS_LIMIT_MALL:
      return Boolean.valueOf(isIsLimitMall());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM_ID:
      return isSetItemId();
    case VALID_TIME_TYPE:
      return isSetValidTimeType();
    case COUNT:
      return isSetCount();
    case IS_LIMIT_MALL:
      return isSetIsLimitMall();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCBuySingleItemSuccMsg)
      return this.equals((SCBuySingleItemSuccMsg)that);
    return false;
  }

  public boolean equals(SCBuySingleItemSuccMsg that) {
    if (that == null)
      return false;

    boolean this_present_itemId = true;
    boolean that_present_itemId = true;
    if (this_present_itemId || that_present_itemId) {
      if (!(this_present_itemId && that_present_itemId))
        return false;
      if (this.itemId != that.itemId)
        return false;
    }

    boolean this_present_validTimeType = true;
    boolean that_present_validTimeType = true;
    if (this_present_validTimeType || that_present_validTimeType) {
      if (!(this_present_validTimeType && that_present_validTimeType))
        return false;
      if (this.validTimeType != that.validTimeType)
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_isLimitMall = true && this.isSetIsLimitMall();
    boolean that_present_isLimitMall = true && that.isSetIsLimitMall();
    if (this_present_isLimitMall || that_present_isLimitMall) {
      if (!(this_present_isLimitMall && that_present_isLimitMall))
        return false;
      if (this.isLimitMall != that.isLimitMall)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCBuySingleItemSuccMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCBuySingleItemSuccMsg typedOther = (SCBuySingleItemSuccMsg)other;

    lastComparison = Boolean.valueOf(isSetItemId()).compareTo(typedOther.isSetItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemId, typedOther.itemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValidTimeType()).compareTo(typedOther.isSetValidTimeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidTimeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validTimeType, typedOther.validTimeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(typedOther.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, typedOther.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsLimitMall()).compareTo(typedOther.isSetIsLimitMall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsLimitMall()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isLimitMall, typedOther.isLimitMall);
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
    StringBuilder sb = new StringBuilder("SCBuySingleItemSuccMsg(");
    boolean first = true;

    sb.append("itemId:");
    sb.append(this.itemId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("validTimeType:");
    sb.append(this.validTimeType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (isSetIsLimitMall()) {
      if (!first) sb.append(", ");
      sb.append("isLimitMall:");
      sb.append(this.isLimitMall);
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

  private static class SCBuySingleItemSuccMsgStandardSchemeFactory implements SchemeFactory {
    public SCBuySingleItemSuccMsgStandardScheme getScheme() {
      return new SCBuySingleItemSuccMsgStandardScheme();
    }
  }

  private static class SCBuySingleItemSuccMsgStandardScheme extends StandardScheme<SCBuySingleItemSuccMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCBuySingleItemSuccMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.itemId = iprot.readI32();
              struct.setItemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALID_TIME_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.validTimeType = iprot.readByte();
              struct.setValidTimeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.count = iprot.readI16();
              struct.setCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_LIMIT_MALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isLimitMall = iprot.readBool();
              struct.setIsLimitMallIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCBuySingleItemSuccMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
      oprot.writeI32(struct.itemId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALID_TIME_TYPE_FIELD_DESC);
      oprot.writeByte(struct.validTimeType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI16(struct.count);
      oprot.writeFieldEnd();
      if (struct.isSetIsLimitMall()) {
        oprot.writeFieldBegin(IS_LIMIT_MALL_FIELD_DESC);
        oprot.writeBool(struct.isLimitMall);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCBuySingleItemSuccMsgTupleSchemeFactory implements SchemeFactory {
    public SCBuySingleItemSuccMsgTupleScheme getScheme() {
      return new SCBuySingleItemSuccMsgTupleScheme();
    }
  }

  private static class SCBuySingleItemSuccMsgTupleScheme extends TupleScheme<SCBuySingleItemSuccMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCBuySingleItemSuccMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemId()) {
        optionals.set(0);
      }
      if (struct.isSetValidTimeType()) {
        optionals.set(1);
      }
      if (struct.isSetCount()) {
        optionals.set(2);
      }
      if (struct.isSetIsLimitMall()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetItemId()) {
        oprot.writeI32(struct.itemId);
      }
      if (struct.isSetValidTimeType()) {
        oprot.writeByte(struct.validTimeType);
      }
      if (struct.isSetCount()) {
        oprot.writeI16(struct.count);
      }
      if (struct.isSetIsLimitMall()) {
        oprot.writeBool(struct.isLimitMall);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCBuySingleItemSuccMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.itemId = iprot.readI32();
        struct.setItemIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.validTimeType = iprot.readByte();
        struct.setValidTimeTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.count = iprot.readI16();
        struct.setCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isLimitMall = iprot.readBool();
        struct.setIsLimitMallIsSet(true);
      }
    }
  }

}
