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
 * 更新训练次数信息
 */
public class SCUpdateTrainCountInfo implements org.apache.thrift.TBase<SCUpdateTrainCountInfo, SCUpdateTrainCountInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCUpdateTrainCountInfo");

  private static final org.apache.thrift.protocol.TField TODAY_LEFT_TRAIN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("todayLeftTrainCount", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField TODAY_BUY_TRAIN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("todayBuyTrainCount", org.apache.thrift.protocol.TType.I16, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCUpdateTrainCountInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCUpdateTrainCountInfoTupleSchemeFactory());
  }

  /**
   * 今天剩余训练次数
   */
  public short todayLeftTrainCount; // optional
  /**
   * 今天购买训练次数
   */
  public short todayBuyTrainCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 今天剩余训练次数
     */
    TODAY_LEFT_TRAIN_COUNT((short)1, "todayLeftTrainCount"),
    /**
     * 今天购买训练次数
     */
    TODAY_BUY_TRAIN_COUNT((short)2, "todayBuyTrainCount");

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
        case 1: // TODAY_LEFT_TRAIN_COUNT
          return TODAY_LEFT_TRAIN_COUNT;
        case 2: // TODAY_BUY_TRAIN_COUNT
          return TODAY_BUY_TRAIN_COUNT;
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
  private static final int __TODAYLEFTTRAINCOUNT_ISSET_ID = 0;
  private static final int __TODAYBUYTRAINCOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.TODAY_LEFT_TRAIN_COUNT,_Fields.TODAY_BUY_TRAIN_COUNT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TODAY_LEFT_TRAIN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("todayLeftTrainCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.TODAY_BUY_TRAIN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("todayBuyTrainCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCUpdateTrainCountInfo.class, metaDataMap);
  }

  public SCUpdateTrainCountInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCUpdateTrainCountInfo(SCUpdateTrainCountInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.todayLeftTrainCount = other.todayLeftTrainCount;
    this.todayBuyTrainCount = other.todayBuyTrainCount;
  }

  public SCUpdateTrainCountInfo deepCopy() {
    return new SCUpdateTrainCountInfo(this);
  }

  @Override
  public void clear() {
    setTodayLeftTrainCountIsSet(false);
    this.todayLeftTrainCount = 0;
    setTodayBuyTrainCountIsSet(false);
    this.todayBuyTrainCount = 0;
  }

  /**
   * 今天剩余训练次数
   */
  public short getTodayLeftTrainCount() {
    return this.todayLeftTrainCount;
  }

  /**
   * 今天剩余训练次数
   */
  public SCUpdateTrainCountInfo setTodayLeftTrainCount(short todayLeftTrainCount) {
    this.todayLeftTrainCount = todayLeftTrainCount;
    setTodayLeftTrainCountIsSet(true);
    return this;
  }

  public void unsetTodayLeftTrainCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TODAYLEFTTRAINCOUNT_ISSET_ID);
  }

  /** Returns true if field todayLeftTrainCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTodayLeftTrainCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TODAYLEFTTRAINCOUNT_ISSET_ID);
  }

  public void setTodayLeftTrainCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TODAYLEFTTRAINCOUNT_ISSET_ID, value);
  }

  /**
   * 今天购买训练次数
   */
  public short getTodayBuyTrainCount() {
    return this.todayBuyTrainCount;
  }

  /**
   * 今天购买训练次数
   */
  public SCUpdateTrainCountInfo setTodayBuyTrainCount(short todayBuyTrainCount) {
    this.todayBuyTrainCount = todayBuyTrainCount;
    setTodayBuyTrainCountIsSet(true);
    return this;
  }

  public void unsetTodayBuyTrainCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TODAYBUYTRAINCOUNT_ISSET_ID);
  }

  /** Returns true if field todayBuyTrainCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTodayBuyTrainCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TODAYBUYTRAINCOUNT_ISSET_ID);
  }

  public void setTodayBuyTrainCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TODAYBUYTRAINCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TODAY_LEFT_TRAIN_COUNT:
      if (value == null) {
        unsetTodayLeftTrainCount();
      } else {
        setTodayLeftTrainCount((Short)value);
      }
      break;

    case TODAY_BUY_TRAIN_COUNT:
      if (value == null) {
        unsetTodayBuyTrainCount();
      } else {
        setTodayBuyTrainCount((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TODAY_LEFT_TRAIN_COUNT:
      return Short.valueOf(getTodayLeftTrainCount());

    case TODAY_BUY_TRAIN_COUNT:
      return Short.valueOf(getTodayBuyTrainCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TODAY_LEFT_TRAIN_COUNT:
      return isSetTodayLeftTrainCount();
    case TODAY_BUY_TRAIN_COUNT:
      return isSetTodayBuyTrainCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCUpdateTrainCountInfo)
      return this.equals((SCUpdateTrainCountInfo)that);
    return false;
  }

  public boolean equals(SCUpdateTrainCountInfo that) {
    if (that == null)
      return false;

    boolean this_present_todayLeftTrainCount = true && this.isSetTodayLeftTrainCount();
    boolean that_present_todayLeftTrainCount = true && that.isSetTodayLeftTrainCount();
    if (this_present_todayLeftTrainCount || that_present_todayLeftTrainCount) {
      if (!(this_present_todayLeftTrainCount && that_present_todayLeftTrainCount))
        return false;
      if (this.todayLeftTrainCount != that.todayLeftTrainCount)
        return false;
    }

    boolean this_present_todayBuyTrainCount = true && this.isSetTodayBuyTrainCount();
    boolean that_present_todayBuyTrainCount = true && that.isSetTodayBuyTrainCount();
    if (this_present_todayBuyTrainCount || that_present_todayBuyTrainCount) {
      if (!(this_present_todayBuyTrainCount && that_present_todayBuyTrainCount))
        return false;
      if (this.todayBuyTrainCount != that.todayBuyTrainCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCUpdateTrainCountInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCUpdateTrainCountInfo typedOther = (SCUpdateTrainCountInfo)other;

    lastComparison = Boolean.valueOf(isSetTodayLeftTrainCount()).compareTo(typedOther.isSetTodayLeftTrainCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTodayLeftTrainCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.todayLeftTrainCount, typedOther.todayLeftTrainCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTodayBuyTrainCount()).compareTo(typedOther.isSetTodayBuyTrainCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTodayBuyTrainCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.todayBuyTrainCount, typedOther.todayBuyTrainCount);
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
    StringBuilder sb = new StringBuilder("SCUpdateTrainCountInfo(");
    boolean first = true;

    if (isSetTodayLeftTrainCount()) {
      sb.append("todayLeftTrainCount:");
      sb.append(this.todayLeftTrainCount);
      first = false;
    }
    if (isSetTodayBuyTrainCount()) {
      if (!first) sb.append(", ");
      sb.append("todayBuyTrainCount:");
      sb.append(this.todayBuyTrainCount);
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

  private static class SCUpdateTrainCountInfoStandardSchemeFactory implements SchemeFactory {
    public SCUpdateTrainCountInfoStandardScheme getScheme() {
      return new SCUpdateTrainCountInfoStandardScheme();
    }
  }

  private static class SCUpdateTrainCountInfoStandardScheme extends StandardScheme<SCUpdateTrainCountInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCUpdateTrainCountInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TODAY_LEFT_TRAIN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.todayLeftTrainCount = iprot.readI16();
              struct.setTodayLeftTrainCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TODAY_BUY_TRAIN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.todayBuyTrainCount = iprot.readI16();
              struct.setTodayBuyTrainCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCUpdateTrainCountInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTodayLeftTrainCount()) {
        oprot.writeFieldBegin(TODAY_LEFT_TRAIN_COUNT_FIELD_DESC);
        oprot.writeI16(struct.todayLeftTrainCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTodayBuyTrainCount()) {
        oprot.writeFieldBegin(TODAY_BUY_TRAIN_COUNT_FIELD_DESC);
        oprot.writeI16(struct.todayBuyTrainCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCUpdateTrainCountInfoTupleSchemeFactory implements SchemeFactory {
    public SCUpdateTrainCountInfoTupleScheme getScheme() {
      return new SCUpdateTrainCountInfoTupleScheme();
    }
  }

  private static class SCUpdateTrainCountInfoTupleScheme extends TupleScheme<SCUpdateTrainCountInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCUpdateTrainCountInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTodayLeftTrainCount()) {
        optionals.set(0);
      }
      if (struct.isSetTodayBuyTrainCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTodayLeftTrainCount()) {
        oprot.writeI16(struct.todayLeftTrainCount);
      }
      if (struct.isSetTodayBuyTrainCount()) {
        oprot.writeI16(struct.todayBuyTrainCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCUpdateTrainCountInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.todayLeftTrainCount = iprot.readI16();
        struct.setTodayLeftTrainCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.todayBuyTrainCount = iprot.readI16();
        struct.setTodayBuyTrainCountIsSet(true);
      }
    }
  }

}

