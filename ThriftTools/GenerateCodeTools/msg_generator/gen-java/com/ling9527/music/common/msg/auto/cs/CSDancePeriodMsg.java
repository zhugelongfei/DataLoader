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
 * Period in dance.
 */
public class CSDancePeriodMsg implements org.apache.thrift.TBase<CSDancePeriodMsg, CSDancePeriodMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSDancePeriodMsg");

  private static final org.apache.thrift.protocol.TField PERIOD_FIELD_DESC = new org.apache.thrift.protocol.TField("period", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField GAME_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("gameType", org.apache.thrift.protocol.TType.BYTE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSDancePeriodMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSDancePeriodMsgTupleSchemeFactory());
  }

  /**
   * 0-start input, 1-show time
   */
  public byte period; // required
  public byte index; // required
  public byte gameType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 0-start input, 1-show time
     */
    PERIOD((short)1, "period"),
    INDEX((short)2, "index"),
    GAME_TYPE((short)3, "gameType");

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
        case 1: // PERIOD
          return PERIOD;
        case 2: // INDEX
          return INDEX;
        case 3: // GAME_TYPE
          return GAME_TYPE;
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
  private static final int __PERIOD_ISSET_ID = 0;
  private static final int __INDEX_ISSET_ID = 1;
  private static final int __GAMETYPE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.GAME_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERIOD, new org.apache.thrift.meta_data.FieldMetaData("period", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.GAME_TYPE, new org.apache.thrift.meta_data.FieldMetaData("gameType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSDancePeriodMsg.class, metaDataMap);
  }

  public CSDancePeriodMsg() {
  }

  public CSDancePeriodMsg(
    byte period,
    byte index)
  {
    this();
    this.period = period;
    setPeriodIsSet(true);
    this.index = index;
    setIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSDancePeriodMsg(CSDancePeriodMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.period = other.period;
    this.index = other.index;
    this.gameType = other.gameType;
  }

  public CSDancePeriodMsg deepCopy() {
    return new CSDancePeriodMsg(this);
  }

  @Override
  public void clear() {
    setPeriodIsSet(false);
    this.period = 0;
    setIndexIsSet(false);
    this.index = 0;
    setGameTypeIsSet(false);
    this.gameType = 0;
  }

  /**
   * 0-start input, 1-show time
   */
  public byte getPeriod() {
    return this.period;
  }

  /**
   * 0-start input, 1-show time
   */
  public CSDancePeriodMsg setPeriod(byte period) {
    this.period = period;
    setPeriodIsSet(true);
    return this;
  }

  public void unsetPeriod() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERIOD_ISSET_ID);
  }

  /** Returns true if field period is set (has been assigned a value) and false otherwise */
  public boolean isSetPeriod() {
    return EncodingUtils.testBit(__isset_bitfield, __PERIOD_ISSET_ID);
  }

  public void setPeriodIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERIOD_ISSET_ID, value);
  }

  public byte getIndex() {
    return this.index;
  }

  public CSDancePeriodMsg setIndex(byte index) {
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

  public byte getGameType() {
    return this.gameType;
  }

  public CSDancePeriodMsg setGameType(byte gameType) {
    this.gameType = gameType;
    setGameTypeIsSet(true);
    return this;
  }

  public void unsetGameType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GAMETYPE_ISSET_ID);
  }

  /** Returns true if field gameType is set (has been assigned a value) and false otherwise */
  public boolean isSetGameType() {
    return EncodingUtils.testBit(__isset_bitfield, __GAMETYPE_ISSET_ID);
  }

  public void setGameTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GAMETYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERIOD:
      if (value == null) {
        unsetPeriod();
      } else {
        setPeriod((Byte)value);
      }
      break;

    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((Byte)value);
      }
      break;

    case GAME_TYPE:
      if (value == null) {
        unsetGameType();
      } else {
        setGameType((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERIOD:
      return Byte.valueOf(getPeriod());

    case INDEX:
      return Byte.valueOf(getIndex());

    case GAME_TYPE:
      return Byte.valueOf(getGameType());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERIOD:
      return isSetPeriod();
    case INDEX:
      return isSetIndex();
    case GAME_TYPE:
      return isSetGameType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSDancePeriodMsg)
      return this.equals((CSDancePeriodMsg)that);
    return false;
  }

  public boolean equals(CSDancePeriodMsg that) {
    if (that == null)
      return false;

    boolean this_present_period = true;
    boolean that_present_period = true;
    if (this_present_period || that_present_period) {
      if (!(this_present_period && that_present_period))
        return false;
      if (this.period != that.period)
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

    boolean this_present_gameType = true && this.isSetGameType();
    boolean that_present_gameType = true && that.isSetGameType();
    if (this_present_gameType || that_present_gameType) {
      if (!(this_present_gameType && that_present_gameType))
        return false;
      if (this.gameType != that.gameType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSDancePeriodMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSDancePeriodMsg typedOther = (CSDancePeriodMsg)other;

    lastComparison = Boolean.valueOf(isSetPeriod()).compareTo(typedOther.isSetPeriod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeriod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.period, typedOther.period);
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
    lastComparison = Boolean.valueOf(isSetGameType()).compareTo(typedOther.isSetGameType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGameType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gameType, typedOther.gameType);
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
    StringBuilder sb = new StringBuilder("CSDancePeriodMsg(");
    boolean first = true;

    sb.append("period:");
    sb.append(this.period);
    first = false;
    if (!first) sb.append(", ");
    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (isSetGameType()) {
      if (!first) sb.append(", ");
      sb.append("gameType:");
      sb.append(this.gameType);
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

  private static class CSDancePeriodMsgStandardSchemeFactory implements SchemeFactory {
    public CSDancePeriodMsgStandardScheme getScheme() {
      return new CSDancePeriodMsgStandardScheme();
    }
  }

  private static class CSDancePeriodMsgStandardScheme extends StandardScheme<CSDancePeriodMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSDancePeriodMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERIOD
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.period = iprot.readByte();
              struct.setPeriodIsSet(true);
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
          case 3: // GAME_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.gameType = iprot.readByte();
              struct.setGameTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSDancePeriodMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PERIOD_FIELD_DESC);
      oprot.writeByte(struct.period);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeByte(struct.index);
      oprot.writeFieldEnd();
      if (struct.isSetGameType()) {
        oprot.writeFieldBegin(GAME_TYPE_FIELD_DESC);
        oprot.writeByte(struct.gameType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSDancePeriodMsgTupleSchemeFactory implements SchemeFactory {
    public CSDancePeriodMsgTupleScheme getScheme() {
      return new CSDancePeriodMsgTupleScheme();
    }
  }

  private static class CSDancePeriodMsgTupleScheme extends TupleScheme<CSDancePeriodMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSDancePeriodMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPeriod()) {
        optionals.set(0);
      }
      if (struct.isSetIndex()) {
        optionals.set(1);
      }
      if (struct.isSetGameType()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPeriod()) {
        oprot.writeByte(struct.period);
      }
      if (struct.isSetIndex()) {
        oprot.writeByte(struct.index);
      }
      if (struct.isSetGameType()) {
        oprot.writeByte(struct.gameType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSDancePeriodMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.period = iprot.readByte();
        struct.setPeriodIsSet(true);
      }
      if (incoming.get(1)) {
        struct.index = iprot.readByte();
        struct.setIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.gameType = iprot.readByte();
        struct.setGameTypeIsSet(true);
      }
    }
  }

}
