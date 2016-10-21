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
 * 广场舞蹈区使用香槟成功
 */
public class SCUseChampagneSucc implements org.apache.thrift.TBase<SCUseChampagneSucc, SCUseChampagneSucc._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCUseChampagneSucc");

  private static final org.apache.thrift.protocol.TField USED_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("usedCharId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField CHAMPAGNE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ChampagneId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField HOT_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("hotVal", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCUseChampagneSuccStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCUseChampagneSuccTupleSchemeFactory());
  }

  public long usedCharId; // required
  /**
   * 香槟id
   */
  public int ChampagneId; // required
  /**
   * 更新的热力值
   */
  public int hotVal; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USED_CHAR_ID((short)1, "usedCharId"),
    /**
     * 香槟id
     */
    CHAMPAGNE_ID((short)2, "ChampagneId"),
    /**
     * 更新的热力值
     */
    HOT_VAL((short)3, "hotVal");

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
        case 1: // USED_CHAR_ID
          return USED_CHAR_ID;
        case 2: // CHAMPAGNE_ID
          return CHAMPAGNE_ID;
        case 3: // HOT_VAL
          return HOT_VAL;
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
  private static final int __USEDCHARID_ISSET_ID = 0;
  private static final int __CHAMPAGNEID_ISSET_ID = 1;
  private static final int __HOTVAL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USED_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("usedCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CHAMPAGNE_ID, new org.apache.thrift.meta_data.FieldMetaData("ChampagneId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HOT_VAL, new org.apache.thrift.meta_data.FieldMetaData("hotVal", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCUseChampagneSucc.class, metaDataMap);
  }

  public SCUseChampagneSucc() {
  }

  public SCUseChampagneSucc(
    long usedCharId,
    int ChampagneId,
    int hotVal)
  {
    this();
    this.usedCharId = usedCharId;
    setUsedCharIdIsSet(true);
    this.ChampagneId = ChampagneId;
    setChampagneIdIsSet(true);
    this.hotVal = hotVal;
    setHotValIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCUseChampagneSucc(SCUseChampagneSucc other) {
    __isset_bitfield = other.__isset_bitfield;
    this.usedCharId = other.usedCharId;
    this.ChampagneId = other.ChampagneId;
    this.hotVal = other.hotVal;
  }

  public SCUseChampagneSucc deepCopy() {
    return new SCUseChampagneSucc(this);
  }

  @Override
  public void clear() {
    setUsedCharIdIsSet(false);
    this.usedCharId = 0;
    setChampagneIdIsSet(false);
    this.ChampagneId = 0;
    setHotValIsSet(false);
    this.hotVal = 0;
  }

  public long getUsedCharId() {
    return this.usedCharId;
  }

  public SCUseChampagneSucc setUsedCharId(long usedCharId) {
    this.usedCharId = usedCharId;
    setUsedCharIdIsSet(true);
    return this;
  }

  public void unsetUsedCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEDCHARID_ISSET_ID);
  }

  /** Returns true if field usedCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __USEDCHARID_ISSET_ID);
  }

  public void setUsedCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEDCHARID_ISSET_ID, value);
  }

  /**
   * 香槟id
   */
  public int getChampagneId() {
    return this.ChampagneId;
  }

  /**
   * 香槟id
   */
  public SCUseChampagneSucc setChampagneId(int ChampagneId) {
    this.ChampagneId = ChampagneId;
    setChampagneIdIsSet(true);
    return this;
  }

  public void unsetChampagneId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHAMPAGNEID_ISSET_ID);
  }

  /** Returns true if field ChampagneId is set (has been assigned a value) and false otherwise */
  public boolean isSetChampagneId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHAMPAGNEID_ISSET_ID);
  }

  public void setChampagneIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHAMPAGNEID_ISSET_ID, value);
  }

  /**
   * 更新的热力值
   */
  public int getHotVal() {
    return this.hotVal;
  }

  /**
   * 更新的热力值
   */
  public SCUseChampagneSucc setHotVal(int hotVal) {
    this.hotVal = hotVal;
    setHotValIsSet(true);
    return this;
  }

  public void unsetHotVal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HOTVAL_ISSET_ID);
  }

  /** Returns true if field hotVal is set (has been assigned a value) and false otherwise */
  public boolean isSetHotVal() {
    return EncodingUtils.testBit(__isset_bitfield, __HOTVAL_ISSET_ID);
  }

  public void setHotValIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HOTVAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USED_CHAR_ID:
      if (value == null) {
        unsetUsedCharId();
      } else {
        setUsedCharId((Long)value);
      }
      break;

    case CHAMPAGNE_ID:
      if (value == null) {
        unsetChampagneId();
      } else {
        setChampagneId((Integer)value);
      }
      break;

    case HOT_VAL:
      if (value == null) {
        unsetHotVal();
      } else {
        setHotVal((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USED_CHAR_ID:
      return Long.valueOf(getUsedCharId());

    case CHAMPAGNE_ID:
      return Integer.valueOf(getChampagneId());

    case HOT_VAL:
      return Integer.valueOf(getHotVal());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USED_CHAR_ID:
      return isSetUsedCharId();
    case CHAMPAGNE_ID:
      return isSetChampagneId();
    case HOT_VAL:
      return isSetHotVal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCUseChampagneSucc)
      return this.equals((SCUseChampagneSucc)that);
    return false;
  }

  public boolean equals(SCUseChampagneSucc that) {
    if (that == null)
      return false;

    boolean this_present_usedCharId = true;
    boolean that_present_usedCharId = true;
    if (this_present_usedCharId || that_present_usedCharId) {
      if (!(this_present_usedCharId && that_present_usedCharId))
        return false;
      if (this.usedCharId != that.usedCharId)
        return false;
    }

    boolean this_present_ChampagneId = true;
    boolean that_present_ChampagneId = true;
    if (this_present_ChampagneId || that_present_ChampagneId) {
      if (!(this_present_ChampagneId && that_present_ChampagneId))
        return false;
      if (this.ChampagneId != that.ChampagneId)
        return false;
    }

    boolean this_present_hotVal = true;
    boolean that_present_hotVal = true;
    if (this_present_hotVal || that_present_hotVal) {
      if (!(this_present_hotVal && that_present_hotVal))
        return false;
      if (this.hotVal != that.hotVal)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCUseChampagneSucc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCUseChampagneSucc typedOther = (SCUseChampagneSucc)other;

    lastComparison = Boolean.valueOf(isSetUsedCharId()).compareTo(typedOther.isSetUsedCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usedCharId, typedOther.usedCharId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChampagneId()).compareTo(typedOther.isSetChampagneId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChampagneId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ChampagneId, typedOther.ChampagneId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHotVal()).compareTo(typedOther.isSetHotVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHotVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hotVal, typedOther.hotVal);
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
    StringBuilder sb = new StringBuilder("SCUseChampagneSucc(");
    boolean first = true;

    sb.append("usedCharId:");
    sb.append(this.usedCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ChampagneId:");
    sb.append(this.ChampagneId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hotVal:");
    sb.append(this.hotVal);
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

  private static class SCUseChampagneSuccStandardSchemeFactory implements SchemeFactory {
    public SCUseChampagneSuccStandardScheme getScheme() {
      return new SCUseChampagneSuccStandardScheme();
    }
  }

  private static class SCUseChampagneSuccStandardScheme extends StandardScheme<SCUseChampagneSucc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCUseChampagneSucc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USED_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.usedCharId = iprot.readI64();
              struct.setUsedCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHAMPAGNE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ChampagneId = iprot.readI32();
              struct.setChampagneIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOT_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.hotVal = iprot.readI32();
              struct.setHotValIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCUseChampagneSucc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USED_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.usedCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHAMPAGNE_ID_FIELD_DESC);
      oprot.writeI32(struct.ChampagneId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HOT_VAL_FIELD_DESC);
      oprot.writeI32(struct.hotVal);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCUseChampagneSuccTupleSchemeFactory implements SchemeFactory {
    public SCUseChampagneSuccTupleScheme getScheme() {
      return new SCUseChampagneSuccTupleScheme();
    }
  }

  private static class SCUseChampagneSuccTupleScheme extends TupleScheme<SCUseChampagneSucc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCUseChampagneSucc struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUsedCharId()) {
        optionals.set(0);
      }
      if (struct.isSetChampagneId()) {
        optionals.set(1);
      }
      if (struct.isSetHotVal()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUsedCharId()) {
        oprot.writeI64(struct.usedCharId);
      }
      if (struct.isSetChampagneId()) {
        oprot.writeI32(struct.ChampagneId);
      }
      if (struct.isSetHotVal()) {
        oprot.writeI32(struct.hotVal);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCUseChampagneSucc struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.usedCharId = iprot.readI64();
        struct.setUsedCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ChampagneId = iprot.readI32();
        struct.setChampagneIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.hotVal = iprot.readI32();
        struct.setHotValIsSet(true);
      }
    }
  }

}

