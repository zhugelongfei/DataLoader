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

/**
 * 请求红包领取信息
 */
public class CSReqLuckyMoneyReceivers implements org.apache.thrift.TBase<CSReqLuckyMoneyReceivers, CSReqLuckyMoneyReceivers._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSReqLuckyMoneyReceivers");

  private static final org.apache.thrift.protocol.TField LUCKY_MONEY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("luckyMoneyID", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField START_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("startIndex", org.apache.thrift.protocol.TType.I16, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSReqLuckyMoneyReceiversStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSReqLuckyMoneyReceiversTupleSchemeFactory());
  }

  /**
   * 红包ID
   */
  public long luckyMoneyID; // required
  /**
   * 当前索引
   */
  public short startIndex; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 红包ID
     */
    LUCKY_MONEY_ID((short)1, "luckyMoneyID"),
    /**
     * 当前索引
     */
    START_INDEX((short)2, "startIndex");

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
        case 1: // LUCKY_MONEY_ID
          return LUCKY_MONEY_ID;
        case 2: // START_INDEX
          return START_INDEX;
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
  private static final int __LUCKYMONEYID_ISSET_ID = 0;
  private static final int __STARTINDEX_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LUCKY_MONEY_ID, new org.apache.thrift.meta_data.FieldMetaData("luckyMoneyID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.START_INDEX, new org.apache.thrift.meta_data.FieldMetaData("startIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSReqLuckyMoneyReceivers.class, metaDataMap);
  }

  public CSReqLuckyMoneyReceivers() {
  }

  public CSReqLuckyMoneyReceivers(
    long luckyMoneyID,
    short startIndex)
  {
    this();
    this.luckyMoneyID = luckyMoneyID;
    setLuckyMoneyIDIsSet(true);
    this.startIndex = startIndex;
    setStartIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSReqLuckyMoneyReceivers(CSReqLuckyMoneyReceivers other) {
    __isset_bitfield = other.__isset_bitfield;
    this.luckyMoneyID = other.luckyMoneyID;
    this.startIndex = other.startIndex;
  }

  public CSReqLuckyMoneyReceivers deepCopy() {
    return new CSReqLuckyMoneyReceivers(this);
  }

  @Override
  public void clear() {
    setLuckyMoneyIDIsSet(false);
    this.luckyMoneyID = 0;
    setStartIndexIsSet(false);
    this.startIndex = 0;
  }

  /**
   * 红包ID
   */
  public long getLuckyMoneyID() {
    return this.luckyMoneyID;
  }

  /**
   * 红包ID
   */
  public CSReqLuckyMoneyReceivers setLuckyMoneyID(long luckyMoneyID) {
    this.luckyMoneyID = luckyMoneyID;
    setLuckyMoneyIDIsSet(true);
    return this;
  }

  public void unsetLuckyMoneyID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LUCKYMONEYID_ISSET_ID);
  }

  /** Returns true if field luckyMoneyID is set (has been assigned a value) and false otherwise */
  public boolean isSetLuckyMoneyID() {
    return EncodingUtils.testBit(__isset_bitfield, __LUCKYMONEYID_ISSET_ID);
  }

  public void setLuckyMoneyIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LUCKYMONEYID_ISSET_ID, value);
  }

  /**
   * 当前索引
   */
  public short getStartIndex() {
    return this.startIndex;
  }

  /**
   * 当前索引
   */
  public CSReqLuckyMoneyReceivers setStartIndex(short startIndex) {
    this.startIndex = startIndex;
    setStartIndexIsSet(true);
    return this;
  }

  public void unsetStartIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTINDEX_ISSET_ID);
  }

  /** Returns true if field startIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetStartIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTINDEX_ISSET_ID);
  }

  public void setStartIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTINDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LUCKY_MONEY_ID:
      if (value == null) {
        unsetLuckyMoneyID();
      } else {
        setLuckyMoneyID((Long)value);
      }
      break;

    case START_INDEX:
      if (value == null) {
        unsetStartIndex();
      } else {
        setStartIndex((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LUCKY_MONEY_ID:
      return Long.valueOf(getLuckyMoneyID());

    case START_INDEX:
      return Short.valueOf(getStartIndex());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LUCKY_MONEY_ID:
      return isSetLuckyMoneyID();
    case START_INDEX:
      return isSetStartIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSReqLuckyMoneyReceivers)
      return this.equals((CSReqLuckyMoneyReceivers)that);
    return false;
  }

  public boolean equals(CSReqLuckyMoneyReceivers that) {
    if (that == null)
      return false;

    boolean this_present_luckyMoneyID = true;
    boolean that_present_luckyMoneyID = true;
    if (this_present_luckyMoneyID || that_present_luckyMoneyID) {
      if (!(this_present_luckyMoneyID && that_present_luckyMoneyID))
        return false;
      if (this.luckyMoneyID != that.luckyMoneyID)
        return false;
    }

    boolean this_present_startIndex = true;
    boolean that_present_startIndex = true;
    if (this_present_startIndex || that_present_startIndex) {
      if (!(this_present_startIndex && that_present_startIndex))
        return false;
      if (this.startIndex != that.startIndex)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSReqLuckyMoneyReceivers other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSReqLuckyMoneyReceivers typedOther = (CSReqLuckyMoneyReceivers)other;

    lastComparison = Boolean.valueOf(isSetLuckyMoneyID()).compareTo(typedOther.isSetLuckyMoneyID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuckyMoneyID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.luckyMoneyID, typedOther.luckyMoneyID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartIndex()).compareTo(typedOther.isSetStartIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startIndex, typedOther.startIndex);
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
    StringBuilder sb = new StringBuilder("CSReqLuckyMoneyReceivers(");
    boolean first = true;

    sb.append("luckyMoneyID:");
    sb.append(this.luckyMoneyID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startIndex:");
    sb.append(this.startIndex);
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

  private static class CSReqLuckyMoneyReceiversStandardSchemeFactory implements SchemeFactory {
    public CSReqLuckyMoneyReceiversStandardScheme getScheme() {
      return new CSReqLuckyMoneyReceiversStandardScheme();
    }
  }

  private static class CSReqLuckyMoneyReceiversStandardScheme extends StandardScheme<CSReqLuckyMoneyReceivers> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSReqLuckyMoneyReceivers struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LUCKY_MONEY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.luckyMoneyID = iprot.readI64();
              struct.setLuckyMoneyIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.startIndex = iprot.readI16();
              struct.setStartIndexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSReqLuckyMoneyReceivers struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LUCKY_MONEY_ID_FIELD_DESC);
      oprot.writeI64(struct.luckyMoneyID);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_INDEX_FIELD_DESC);
      oprot.writeI16(struct.startIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSReqLuckyMoneyReceiversTupleSchemeFactory implements SchemeFactory {
    public CSReqLuckyMoneyReceiversTupleScheme getScheme() {
      return new CSReqLuckyMoneyReceiversTupleScheme();
    }
  }

  private static class CSReqLuckyMoneyReceiversTupleScheme extends TupleScheme<CSReqLuckyMoneyReceivers> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSReqLuckyMoneyReceivers struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLuckyMoneyID()) {
        optionals.set(0);
      }
      if (struct.isSetStartIndex()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLuckyMoneyID()) {
        oprot.writeI64(struct.luckyMoneyID);
      }
      if (struct.isSetStartIndex()) {
        oprot.writeI16(struct.startIndex);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSReqLuckyMoneyReceivers struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.luckyMoneyID = iprot.readI64();
        struct.setLuckyMoneyIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startIndex = iprot.readI16();
        struct.setStartIndexIsSet(true);
      }
    }
  }

}

