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
 * 训练职业数据
 */
public class TrainOccupationData implements org.apache.thrift.TBase<TrainOccupationData, TrainOccupationData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TrainOccupationData");

  private static final org.apache.thrift.protocol.TField LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("level", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("exp", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TrainOccupationDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TrainOccupationDataTupleSchemeFactory());
  }

  /**
   * 当前等级
   */
  public int level; // required
  /**
   * 当前经验值
   */
  public int exp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 当前等级
     */
    LEVEL((short)1, "level"),
    /**
     * 当前经验值
     */
    EXP((short)2, "exp");

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
        case 1: // LEVEL
          return LEVEL;
        case 2: // EXP
          return EXP;
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
  private static final int __LEVEL_ISSET_ID = 0;
  private static final int __EXP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LEVEL, new org.apache.thrift.meta_data.FieldMetaData("level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EXP, new org.apache.thrift.meta_data.FieldMetaData("exp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TrainOccupationData.class, metaDataMap);
  }

  public TrainOccupationData() {
  }

  public TrainOccupationData(
    int level,
    int exp)
  {
    this();
    this.level = level;
    setLevelIsSet(true);
    this.exp = exp;
    setExpIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TrainOccupationData(TrainOccupationData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.level = other.level;
    this.exp = other.exp;
  }

  public TrainOccupationData deepCopy() {
    return new TrainOccupationData(this);
  }

  @Override
  public void clear() {
    setLevelIsSet(false);
    this.level = 0;
    setExpIsSet(false);
    this.exp = 0;
  }

  /**
   * 当前等级
   */
  public int getLevel() {
    return this.level;
  }

  /**
   * 当前等级
   */
  public TrainOccupationData setLevel(int level) {
    this.level = level;
    setLevelIsSet(true);
    return this;
  }

  public void unsetLevel() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEVEL_ISSET_ID);
  }

  /** Returns true if field level is set (has been assigned a value) and false otherwise */
  public boolean isSetLevel() {
    return EncodingUtils.testBit(__isset_bitfield, __LEVEL_ISSET_ID);
  }

  public void setLevelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEVEL_ISSET_ID, value);
  }

  /**
   * 当前经验值
   */
  public int getExp() {
    return this.exp;
  }

  /**
   * 当前经验值
   */
  public TrainOccupationData setExp(int exp) {
    this.exp = exp;
    setExpIsSet(true);
    return this;
  }

  public void unsetExp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXP_ISSET_ID);
  }

  /** Returns true if field exp is set (has been assigned a value) and false otherwise */
  public boolean isSetExp() {
    return EncodingUtils.testBit(__isset_bitfield, __EXP_ISSET_ID);
  }

  public void setExpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LEVEL:
      if (value == null) {
        unsetLevel();
      } else {
        setLevel((Integer)value);
      }
      break;

    case EXP:
      if (value == null) {
        unsetExp();
      } else {
        setExp((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LEVEL:
      return Integer.valueOf(getLevel());

    case EXP:
      return Integer.valueOf(getExp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LEVEL:
      return isSetLevel();
    case EXP:
      return isSetExp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TrainOccupationData)
      return this.equals((TrainOccupationData)that);
    return false;
  }

  public boolean equals(TrainOccupationData that) {
    if (that == null)
      return false;

    boolean this_present_level = true;
    boolean that_present_level = true;
    if (this_present_level || that_present_level) {
      if (!(this_present_level && that_present_level))
        return false;
      if (this.level != that.level)
        return false;
    }

    boolean this_present_exp = true;
    boolean that_present_exp = true;
    if (this_present_exp || that_present_exp) {
      if (!(this_present_exp && that_present_exp))
        return false;
      if (this.exp != that.exp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TrainOccupationData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TrainOccupationData typedOther = (TrainOccupationData)other;

    lastComparison = Boolean.valueOf(isSetLevel()).compareTo(typedOther.isSetLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.level, typedOther.level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExp()).compareTo(typedOther.isSetExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exp, typedOther.exp);
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
    StringBuilder sb = new StringBuilder("TrainOccupationData(");
    boolean first = true;

    sb.append("level:");
    sb.append(this.level);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exp:");
    sb.append(this.exp);
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

  private static class TrainOccupationDataStandardSchemeFactory implements SchemeFactory {
    public TrainOccupationDataStandardScheme getScheme() {
      return new TrainOccupationDataStandardScheme();
    }
  }

  private static class TrainOccupationDataStandardScheme extends StandardScheme<TrainOccupationData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TrainOccupationData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.level = iprot.readI32();
              struct.setLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.exp = iprot.readI32();
              struct.setExpIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TrainOccupationData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LEVEL_FIELD_DESC);
      oprot.writeI32(struct.level);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EXP_FIELD_DESC);
      oprot.writeI32(struct.exp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TrainOccupationDataTupleSchemeFactory implements SchemeFactory {
    public TrainOccupationDataTupleScheme getScheme() {
      return new TrainOccupationDataTupleScheme();
    }
  }

  private static class TrainOccupationDataTupleScheme extends TupleScheme<TrainOccupationData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TrainOccupationData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLevel()) {
        optionals.set(0);
      }
      if (struct.isSetExp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLevel()) {
        oprot.writeI32(struct.level);
      }
      if (struct.isSetExp()) {
        oprot.writeI32(struct.exp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TrainOccupationData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.level = iprot.readI32();
        struct.setLevelIsSet(true);
      }
      if (incoming.get(1)) {
        struct.exp = iprot.readI32();
        struct.setExpIsSet(true);
      }
    }
  }

}

