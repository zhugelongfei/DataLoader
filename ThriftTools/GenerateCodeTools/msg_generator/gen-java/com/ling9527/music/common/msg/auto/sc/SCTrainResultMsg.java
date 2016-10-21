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
 * 训练结果
 */
public class SCTrainResultMsg implements org.apache.thrift.TBase<SCTrainResultMsg, SCTrainResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCTrainResultMsg");

  private static final org.apache.thrift.protocol.TField OCCUPATION_FIELD_DESC = new org.apache.thrift.protocol.TField("occupation", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("level", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OCCUPTION_ADD_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("occuptionAddExp", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CRIT_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("critVal", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STAR_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("starLvl", org.apache.thrift.protocol.TType.I16, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCTrainResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCTrainResultMsgTupleSchemeFactory());
  }

  /**
   * 职业ETrainOccupation
   */
  public byte occupation; // required
  /**
   * 当前等级
   */
  public int level; // required
  /**
   * 增加经验
   */
  public int occuptionAddExp; // required
  /**
   * 暴击倍数(需要/100)
   */
  public int critVal; // optional
  /**
   * 当前星光等级
   */
  public short starLvl; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 职业ETrainOccupation
     */
    OCCUPATION((short)1, "occupation"),
    /**
     * 当前等级
     */
    LEVEL((short)2, "level"),
    /**
     * 增加经验
     */
    OCCUPTION_ADD_EXP((short)3, "occuptionAddExp"),
    /**
     * 暴击倍数(需要/100)
     */
    CRIT_VAL((short)4, "critVal"),
    /**
     * 当前星光等级
     */
    STAR_LVL((short)5, "starLvl");

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
        case 1: // OCCUPATION
          return OCCUPATION;
        case 2: // LEVEL
          return LEVEL;
        case 3: // OCCUPTION_ADD_EXP
          return OCCUPTION_ADD_EXP;
        case 4: // CRIT_VAL
          return CRIT_VAL;
        case 5: // STAR_LVL
          return STAR_LVL;
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
  private static final int __OCCUPATION_ISSET_ID = 0;
  private static final int __LEVEL_ISSET_ID = 1;
  private static final int __OCCUPTIONADDEXP_ISSET_ID = 2;
  private static final int __CRITVAL_ISSET_ID = 3;
  private static final int __STARLVL_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CRIT_VAL,_Fields.STAR_LVL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OCCUPATION, new org.apache.thrift.meta_data.FieldMetaData("occupation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.LEVEL, new org.apache.thrift.meta_data.FieldMetaData("level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OCCUPTION_ADD_EXP, new org.apache.thrift.meta_data.FieldMetaData("occuptionAddExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CRIT_VAL, new org.apache.thrift.meta_data.FieldMetaData("critVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAR_LVL, new org.apache.thrift.meta_data.FieldMetaData("starLvl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCTrainResultMsg.class, metaDataMap);
  }

  public SCTrainResultMsg() {
  }

  public SCTrainResultMsg(
    byte occupation,
    int level,
    int occuptionAddExp)
  {
    this();
    this.occupation = occupation;
    setOccupationIsSet(true);
    this.level = level;
    setLevelIsSet(true);
    this.occuptionAddExp = occuptionAddExp;
    setOccuptionAddExpIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCTrainResultMsg(SCTrainResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.occupation = other.occupation;
    this.level = other.level;
    this.occuptionAddExp = other.occuptionAddExp;
    this.critVal = other.critVal;
    this.starLvl = other.starLvl;
  }

  public SCTrainResultMsg deepCopy() {
    return new SCTrainResultMsg(this);
  }

  @Override
  public void clear() {
    setOccupationIsSet(false);
    this.occupation = 0;
    setLevelIsSet(false);
    this.level = 0;
    setOccuptionAddExpIsSet(false);
    this.occuptionAddExp = 0;
    setCritValIsSet(false);
    this.critVal = 0;
    setStarLvlIsSet(false);
    this.starLvl = 0;
  }

  /**
   * 职业ETrainOccupation
   */
  public byte getOccupation() {
    return this.occupation;
  }

  /**
   * 职业ETrainOccupation
   */
  public SCTrainResultMsg setOccupation(byte occupation) {
    this.occupation = occupation;
    setOccupationIsSet(true);
    return this;
  }

  public void unsetOccupation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OCCUPATION_ISSET_ID);
  }

  /** Returns true if field occupation is set (has been assigned a value) and false otherwise */
  public boolean isSetOccupation() {
    return EncodingUtils.testBit(__isset_bitfield, __OCCUPATION_ISSET_ID);
  }

  public void setOccupationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OCCUPATION_ISSET_ID, value);
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
  public SCTrainResultMsg setLevel(int level) {
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
   * 增加经验
   */
  public int getOccuptionAddExp() {
    return this.occuptionAddExp;
  }

  /**
   * 增加经验
   */
  public SCTrainResultMsg setOccuptionAddExp(int occuptionAddExp) {
    this.occuptionAddExp = occuptionAddExp;
    setOccuptionAddExpIsSet(true);
    return this;
  }

  public void unsetOccuptionAddExp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OCCUPTIONADDEXP_ISSET_ID);
  }

  /** Returns true if field occuptionAddExp is set (has been assigned a value) and false otherwise */
  public boolean isSetOccuptionAddExp() {
    return EncodingUtils.testBit(__isset_bitfield, __OCCUPTIONADDEXP_ISSET_ID);
  }

  public void setOccuptionAddExpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OCCUPTIONADDEXP_ISSET_ID, value);
  }

  /**
   * 暴击倍数(需要/100)
   */
  public int getCritVal() {
    return this.critVal;
  }

  /**
   * 暴击倍数(需要/100)
   */
  public SCTrainResultMsg setCritVal(int critVal) {
    this.critVal = critVal;
    setCritValIsSet(true);
    return this;
  }

  public void unsetCritVal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CRITVAL_ISSET_ID);
  }

  /** Returns true if field critVal is set (has been assigned a value) and false otherwise */
  public boolean isSetCritVal() {
    return EncodingUtils.testBit(__isset_bitfield, __CRITVAL_ISSET_ID);
  }

  public void setCritValIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CRITVAL_ISSET_ID, value);
  }

  /**
   * 当前星光等级
   */
  public short getStarLvl() {
    return this.starLvl;
  }

  /**
   * 当前星光等级
   */
  public SCTrainResultMsg setStarLvl(short starLvl) {
    this.starLvl = starLvl;
    setStarLvlIsSet(true);
    return this;
  }

  public void unsetStarLvl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARLVL_ISSET_ID);
  }

  /** Returns true if field starLvl is set (has been assigned a value) and false otherwise */
  public boolean isSetStarLvl() {
    return EncodingUtils.testBit(__isset_bitfield, __STARLVL_ISSET_ID);
  }

  public void setStarLvlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARLVL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OCCUPATION:
      if (value == null) {
        unsetOccupation();
      } else {
        setOccupation((Byte)value);
      }
      break;

    case LEVEL:
      if (value == null) {
        unsetLevel();
      } else {
        setLevel((Integer)value);
      }
      break;

    case OCCUPTION_ADD_EXP:
      if (value == null) {
        unsetOccuptionAddExp();
      } else {
        setOccuptionAddExp((Integer)value);
      }
      break;

    case CRIT_VAL:
      if (value == null) {
        unsetCritVal();
      } else {
        setCritVal((Integer)value);
      }
      break;

    case STAR_LVL:
      if (value == null) {
        unsetStarLvl();
      } else {
        setStarLvl((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OCCUPATION:
      return Byte.valueOf(getOccupation());

    case LEVEL:
      return Integer.valueOf(getLevel());

    case OCCUPTION_ADD_EXP:
      return Integer.valueOf(getOccuptionAddExp());

    case CRIT_VAL:
      return Integer.valueOf(getCritVal());

    case STAR_LVL:
      return Short.valueOf(getStarLvl());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OCCUPATION:
      return isSetOccupation();
    case LEVEL:
      return isSetLevel();
    case OCCUPTION_ADD_EXP:
      return isSetOccuptionAddExp();
    case CRIT_VAL:
      return isSetCritVal();
    case STAR_LVL:
      return isSetStarLvl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCTrainResultMsg)
      return this.equals((SCTrainResultMsg)that);
    return false;
  }

  public boolean equals(SCTrainResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_occupation = true;
    boolean that_present_occupation = true;
    if (this_present_occupation || that_present_occupation) {
      if (!(this_present_occupation && that_present_occupation))
        return false;
      if (this.occupation != that.occupation)
        return false;
    }

    boolean this_present_level = true;
    boolean that_present_level = true;
    if (this_present_level || that_present_level) {
      if (!(this_present_level && that_present_level))
        return false;
      if (this.level != that.level)
        return false;
    }

    boolean this_present_occuptionAddExp = true;
    boolean that_present_occuptionAddExp = true;
    if (this_present_occuptionAddExp || that_present_occuptionAddExp) {
      if (!(this_present_occuptionAddExp && that_present_occuptionAddExp))
        return false;
      if (this.occuptionAddExp != that.occuptionAddExp)
        return false;
    }

    boolean this_present_critVal = true && this.isSetCritVal();
    boolean that_present_critVal = true && that.isSetCritVal();
    if (this_present_critVal || that_present_critVal) {
      if (!(this_present_critVal && that_present_critVal))
        return false;
      if (this.critVal != that.critVal)
        return false;
    }

    boolean this_present_starLvl = true && this.isSetStarLvl();
    boolean that_present_starLvl = true && that.isSetStarLvl();
    if (this_present_starLvl || that_present_starLvl) {
      if (!(this_present_starLvl && that_present_starLvl))
        return false;
      if (this.starLvl != that.starLvl)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCTrainResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCTrainResultMsg typedOther = (SCTrainResultMsg)other;

    lastComparison = Boolean.valueOf(isSetOccupation()).compareTo(typedOther.isSetOccupation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOccupation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.occupation, typedOther.occupation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetOccuptionAddExp()).compareTo(typedOther.isSetOccuptionAddExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOccuptionAddExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.occuptionAddExp, typedOther.occuptionAddExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCritVal()).compareTo(typedOther.isSetCritVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCritVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.critVal, typedOther.critVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStarLvl()).compareTo(typedOther.isSetStarLvl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarLvl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.starLvl, typedOther.starLvl);
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
    StringBuilder sb = new StringBuilder("SCTrainResultMsg(");
    boolean first = true;

    sb.append("occupation:");
    sb.append(this.occupation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("level:");
    sb.append(this.level);
    first = false;
    if (!first) sb.append(", ");
    sb.append("occuptionAddExp:");
    sb.append(this.occuptionAddExp);
    first = false;
    if (isSetCritVal()) {
      if (!first) sb.append(", ");
      sb.append("critVal:");
      sb.append(this.critVal);
      first = false;
    }
    if (isSetStarLvl()) {
      if (!first) sb.append(", ");
      sb.append("starLvl:");
      sb.append(this.starLvl);
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

  private static class SCTrainResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCTrainResultMsgStandardScheme getScheme() {
      return new SCTrainResultMsgStandardScheme();
    }
  }

  private static class SCTrainResultMsgStandardScheme extends StandardScheme<SCTrainResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCTrainResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OCCUPATION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.occupation = iprot.readByte();
              struct.setOccupationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.level = iprot.readI32();
              struct.setLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OCCUPTION_ADD_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.occuptionAddExp = iprot.readI32();
              struct.setOccuptionAddExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CRIT_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.critVal = iprot.readI32();
              struct.setCritValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STAR_LVL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.starLvl = iprot.readI16();
              struct.setStarLvlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCTrainResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OCCUPATION_FIELD_DESC);
      oprot.writeByte(struct.occupation);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LEVEL_FIELD_DESC);
      oprot.writeI32(struct.level);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OCCUPTION_ADD_EXP_FIELD_DESC);
      oprot.writeI32(struct.occuptionAddExp);
      oprot.writeFieldEnd();
      if (struct.isSetCritVal()) {
        oprot.writeFieldBegin(CRIT_VAL_FIELD_DESC);
        oprot.writeI32(struct.critVal);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStarLvl()) {
        oprot.writeFieldBegin(STAR_LVL_FIELD_DESC);
        oprot.writeI16(struct.starLvl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCTrainResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCTrainResultMsgTupleScheme getScheme() {
      return new SCTrainResultMsgTupleScheme();
    }
  }

  private static class SCTrainResultMsgTupleScheme extends TupleScheme<SCTrainResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCTrainResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOccupation()) {
        optionals.set(0);
      }
      if (struct.isSetLevel()) {
        optionals.set(1);
      }
      if (struct.isSetOccuptionAddExp()) {
        optionals.set(2);
      }
      if (struct.isSetCritVal()) {
        optionals.set(3);
      }
      if (struct.isSetStarLvl()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetOccupation()) {
        oprot.writeByte(struct.occupation);
      }
      if (struct.isSetLevel()) {
        oprot.writeI32(struct.level);
      }
      if (struct.isSetOccuptionAddExp()) {
        oprot.writeI32(struct.occuptionAddExp);
      }
      if (struct.isSetCritVal()) {
        oprot.writeI32(struct.critVal);
      }
      if (struct.isSetStarLvl()) {
        oprot.writeI16(struct.starLvl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCTrainResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.occupation = iprot.readByte();
        struct.setOccupationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.level = iprot.readI32();
        struct.setLevelIsSet(true);
      }
      if (incoming.get(2)) {
        struct.occuptionAddExp = iprot.readI32();
        struct.setOccuptionAddExpIsSet(true);
      }
      if (incoming.get(3)) {
        struct.critVal = iprot.readI32();
        struct.setCritValIsSet(true);
      }
      if (incoming.get(4)) {
        struct.starLvl = iprot.readI16();
        struct.setStarLvlIsSet(true);
      }
    }
  }

}

