/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto.cs;

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

public class CSGetCollectExchangePrizeMsg implements org.apache.thrift.TBase<CSGetCollectExchangePrizeMsg, CSGetCollectExchangePrizeMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSGetCollectExchangePrizeMsg");

  private static final org.apache.thrift.protocol.TField ACTIVITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("activityId", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I16, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSGetCollectExchangePrizeMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSGetCollectExchangePrizeMsgTupleSchemeFactory());
  }

  public short activityId; // required
  public byte index; // required
  public short count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTIVITY_ID((short)1, "activityId"),
    INDEX((short)2, "index"),
    COUNT((short)3, "count");

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
        case 1: // ACTIVITY_ID
          return ACTIVITY_ID;
        case 2: // INDEX
          return INDEX;
        case 3: // COUNT
          return COUNT;
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
  private static final int __ACTIVITYID_ISSET_ID = 0;
  private static final int __INDEX_ISSET_ID = 1;
  private static final int __COUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTIVITY_ID, new org.apache.thrift.meta_data.FieldMetaData("activityId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSGetCollectExchangePrizeMsg.class, metaDataMap);
  }

  public CSGetCollectExchangePrizeMsg() {
  }

  public CSGetCollectExchangePrizeMsg(
    short activityId,
    byte index,
    short count)
  {
    this();
    this.activityId = activityId;
    setActivityIdIsSet(true);
    this.index = index;
    setIndexIsSet(true);
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSGetCollectExchangePrizeMsg(CSGetCollectExchangePrizeMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.activityId = other.activityId;
    this.index = other.index;
    this.count = other.count;
  }

  public CSGetCollectExchangePrizeMsg deepCopy() {
    return new CSGetCollectExchangePrizeMsg(this);
  }

  @Override
  public void clear() {
    setActivityIdIsSet(false);
    this.activityId = 0;
    setIndexIsSet(false);
    this.index = 0;
    setCountIsSet(false);
    this.count = 0;
  }

  public short getActivityId() {
    return this.activityId;
  }

  public CSGetCollectExchangePrizeMsg setActivityId(short activityId) {
    this.activityId = activityId;
    setActivityIdIsSet(true);
    return this;
  }

  public void unsetActivityId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIVITYID_ISSET_ID);
  }

  /** Returns true if field activityId is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityId() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIVITYID_ISSET_ID);
  }

  public void setActivityIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIVITYID_ISSET_ID, value);
  }

  public byte getIndex() {
    return this.index;
  }

  public CSGetCollectExchangePrizeMsg setIndex(byte index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEX_ISSET_ID, value);
  }

  public short getCount() {
    return this.count;
  }

  public CSGetCollectExchangePrizeMsg setCount(short count) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTIVITY_ID:
      if (value == null) {
        unsetActivityId();
      } else {
        setActivityId((Short)value);
      }
      break;

    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((Byte)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTIVITY_ID:
      return Short.valueOf(getActivityId());

    case INDEX:
      return Byte.valueOf(getIndex());

    case COUNT:
      return Short.valueOf(getCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTIVITY_ID:
      return isSetActivityId();
    case INDEX:
      return isSetIndex();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSGetCollectExchangePrizeMsg)
      return this.equals((CSGetCollectExchangePrizeMsg)that);
    return false;
  }

  public boolean equals(CSGetCollectExchangePrizeMsg that) {
    if (that == null)
      return false;

    boolean this_present_activityId = true;
    boolean that_present_activityId = true;
    if (this_present_activityId || that_present_activityId) {
      if (!(this_present_activityId && that_present_activityId))
        return false;
      if (this.activityId != that.activityId)
        return false;
    }

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSGetCollectExchangePrizeMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSGetCollectExchangePrizeMsg typedOther = (CSGetCollectExchangePrizeMsg)other;

    lastComparison = Boolean.valueOf(isSetActivityId()).compareTo(typedOther.isSetActivityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityId, typedOther.activityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex()).compareTo(typedOther.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, typedOther.index);
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
    StringBuilder sb = new StringBuilder("CSGetCollectExchangePrizeMsg(");
    boolean first = true;

    sb.append("activityId:");
    sb.append(this.activityId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
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

  private static class CSGetCollectExchangePrizeMsgStandardSchemeFactory implements SchemeFactory {
    public CSGetCollectExchangePrizeMsgStandardScheme getScheme() {
      return new CSGetCollectExchangePrizeMsgStandardScheme();
    }
  }

  private static class CSGetCollectExchangePrizeMsgStandardScheme extends StandardScheme<CSGetCollectExchangePrizeMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSGetCollectExchangePrizeMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTIVITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.activityId = iprot.readI16();
              struct.setActivityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.index = iprot.readByte();
              struct.setIndexIsSet(true);
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSGetCollectExchangePrizeMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACTIVITY_ID_FIELD_DESC);
      oprot.writeI16(struct.activityId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeByte(struct.index);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI16(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSGetCollectExchangePrizeMsgTupleSchemeFactory implements SchemeFactory {
    public CSGetCollectExchangePrizeMsgTupleScheme getScheme() {
      return new CSGetCollectExchangePrizeMsgTupleScheme();
    }
  }

  private static class CSGetCollectExchangePrizeMsgTupleScheme extends TupleScheme<CSGetCollectExchangePrizeMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSGetCollectExchangePrizeMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActivityId()) {
        optionals.set(0);
      }
      if (struct.isSetIndex()) {
        optionals.set(1);
      }
      if (struct.isSetCount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetActivityId()) {
        oprot.writeI16(struct.activityId);
      }
      if (struct.isSetIndex()) {
        oprot.writeByte(struct.index);
      }
      if (struct.isSetCount()) {
        oprot.writeI16(struct.count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSGetCollectExchangePrizeMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.activityId = iprot.readI16();
        struct.setActivityIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.index = iprot.readByte();
        struct.setIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.count = iprot.readI16();
        struct.setCountIsSet(true);
      }
    }
  }

}

