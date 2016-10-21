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

public class SCExpandBagResultMsg implements org.apache.thrift.TBase<SCExpandBagResultMsg, SCExpandBagResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCExpandBagResultMsg");

  private static final org.apache.thrift.protocol.TField BAG_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("bagCount", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField BAG_EXPAND_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("bagExpandType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCExpandBagResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCExpandBagResultMsgTupleSchemeFactory());
  }

  public short bagCount; // required
  /**
   * 
   * @see com.ling9527.music.common.msg.auto.BagExpandType
   */
  public com.ling9527.music.common.msg.auto.BagExpandType bagExpandType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BAG_COUNT((short)1, "bagCount"),
    /**
     * 
     * @see com.ling9527.music.common.msg.auto.BagExpandType
     */
    BAG_EXPAND_TYPE((short)2, "bagExpandType");

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
        case 1: // BAG_COUNT
          return BAG_COUNT;
        case 2: // BAG_EXPAND_TYPE
          return BAG_EXPAND_TYPE;
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
  private static final int __BAGCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BAG_COUNT, new org.apache.thrift.meta_data.FieldMetaData("bagCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.BAG_EXPAND_TYPE, new org.apache.thrift.meta_data.FieldMetaData("bagExpandType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.BagExpandType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCExpandBagResultMsg.class, metaDataMap);
  }

  public SCExpandBagResultMsg() {
  }

  public SCExpandBagResultMsg(
    short bagCount,
    com.ling9527.music.common.msg.auto.BagExpandType bagExpandType)
  {
    this();
    this.bagCount = bagCount;
    setBagCountIsSet(true);
    this.bagExpandType = bagExpandType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCExpandBagResultMsg(SCExpandBagResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bagCount = other.bagCount;
    if (other.isSetBagExpandType()) {
      this.bagExpandType = other.bagExpandType;
    }
  }

  public SCExpandBagResultMsg deepCopy() {
    return new SCExpandBagResultMsg(this);
  }

  @Override
  public void clear() {
    setBagCountIsSet(false);
    this.bagCount = 0;
    this.bagExpandType = null;
  }

  public short getBagCount() {
    return this.bagCount;
  }

  public SCExpandBagResultMsg setBagCount(short bagCount) {
    this.bagCount = bagCount;
    setBagCountIsSet(true);
    return this;
  }

  public void unsetBagCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BAGCOUNT_ISSET_ID);
  }

  /** Returns true if field bagCount is set (has been assigned a value) and false otherwise */
  public boolean isSetBagCount() {
    return EncodingUtils.testBit(__isset_bitfield, __BAGCOUNT_ISSET_ID);
  }

  public void setBagCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BAGCOUNT_ISSET_ID, value);
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.BagExpandType
   */
  public com.ling9527.music.common.msg.auto.BagExpandType getBagExpandType() {
    return this.bagExpandType;
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.BagExpandType
   */
  public SCExpandBagResultMsg setBagExpandType(com.ling9527.music.common.msg.auto.BagExpandType bagExpandType) {
    this.bagExpandType = bagExpandType;
    return this;
  }

  public void unsetBagExpandType() {
    this.bagExpandType = null;
  }

  /** Returns true if field bagExpandType is set (has been assigned a value) and false otherwise */
  public boolean isSetBagExpandType() {
    return this.bagExpandType != null;
  }

  public void setBagExpandTypeIsSet(boolean value) {
    if (!value) {
      this.bagExpandType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BAG_COUNT:
      if (value == null) {
        unsetBagCount();
      } else {
        setBagCount((Short)value);
      }
      break;

    case BAG_EXPAND_TYPE:
      if (value == null) {
        unsetBagExpandType();
      } else {
        setBagExpandType((com.ling9527.music.common.msg.auto.BagExpandType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BAG_COUNT:
      return Short.valueOf(getBagCount());

    case BAG_EXPAND_TYPE:
      return getBagExpandType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BAG_COUNT:
      return isSetBagCount();
    case BAG_EXPAND_TYPE:
      return isSetBagExpandType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCExpandBagResultMsg)
      return this.equals((SCExpandBagResultMsg)that);
    return false;
  }

  public boolean equals(SCExpandBagResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_bagCount = true;
    boolean that_present_bagCount = true;
    if (this_present_bagCount || that_present_bagCount) {
      if (!(this_present_bagCount && that_present_bagCount))
        return false;
      if (this.bagCount != that.bagCount)
        return false;
    }

    boolean this_present_bagExpandType = true && this.isSetBagExpandType();
    boolean that_present_bagExpandType = true && that.isSetBagExpandType();
    if (this_present_bagExpandType || that_present_bagExpandType) {
      if (!(this_present_bagExpandType && that_present_bagExpandType))
        return false;
      if (!this.bagExpandType.equals(that.bagExpandType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCExpandBagResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCExpandBagResultMsg typedOther = (SCExpandBagResultMsg)other;

    lastComparison = Boolean.valueOf(isSetBagCount()).compareTo(typedOther.isSetBagCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBagCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bagCount, typedOther.bagCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBagExpandType()).compareTo(typedOther.isSetBagExpandType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBagExpandType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bagExpandType, typedOther.bagExpandType);
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
    StringBuilder sb = new StringBuilder("SCExpandBagResultMsg(");
    boolean first = true;

    sb.append("bagCount:");
    sb.append(this.bagCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bagExpandType:");
    if (this.bagExpandType == null) {
      sb.append("null");
    } else {
      sb.append(this.bagExpandType);
    }
    first = false;
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

  private static class SCExpandBagResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCExpandBagResultMsgStandardScheme getScheme() {
      return new SCExpandBagResultMsgStandardScheme();
    }
  }

  private static class SCExpandBagResultMsgStandardScheme extends StandardScheme<SCExpandBagResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCExpandBagResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BAG_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.bagCount = iprot.readI16();
              struct.setBagCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BAG_EXPAND_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bagExpandType = com.ling9527.music.common.msg.auto.BagExpandType.findByValue(iprot.readI32());
              struct.setBagExpandTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCExpandBagResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BAG_COUNT_FIELD_DESC);
      oprot.writeI16(struct.bagCount);
      oprot.writeFieldEnd();
      if (struct.bagExpandType != null) {
        oprot.writeFieldBegin(BAG_EXPAND_TYPE_FIELD_DESC);
        oprot.writeI32(struct.bagExpandType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCExpandBagResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCExpandBagResultMsgTupleScheme getScheme() {
      return new SCExpandBagResultMsgTupleScheme();
    }
  }

  private static class SCExpandBagResultMsgTupleScheme extends TupleScheme<SCExpandBagResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCExpandBagResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBagCount()) {
        optionals.set(0);
      }
      if (struct.isSetBagExpandType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBagCount()) {
        oprot.writeI16(struct.bagCount);
      }
      if (struct.isSetBagExpandType()) {
        oprot.writeI32(struct.bagExpandType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCExpandBagResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.bagCount = iprot.readI16();
        struct.setBagCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bagExpandType = com.ling9527.music.common.msg.auto.BagExpandType.findByValue(iprot.readI32());
        struct.setBagExpandTypeIsSet(true);
      }
    }
  }

}
