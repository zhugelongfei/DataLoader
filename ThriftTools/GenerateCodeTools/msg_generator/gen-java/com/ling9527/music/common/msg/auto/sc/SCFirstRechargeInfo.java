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
 * 首充返回消息
 */
public class SCFirstRechargeInfo implements org.apache.thrift.TBase<SCFirstRechargeInfo, SCFirstRechargeInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCFirstRechargeInfo");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PRIZE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("prizeInfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SPECIAL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("specialId", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCFirstRechargeInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCFirstRechargeInfoTupleSchemeFactory());
  }

  /**
   * 领取状态 true:领取 false:未领取
   * 
   * @see com.ling9527.music.common.msg.auto.FirstRechargeAwardState
   */
  public com.ling9527.music.common.msg.auto.FirstRechargeAwardState state; // required
  /**
   * 首充奖励
   */
  public com.ling9527.music.common.msg.auto.PrizeInfo prizeInfo; // required
  /**
   * 版本号
   */
  public byte version; // required
  /**
   * 活动信息描述
   */
  public String desc; // required
  /**
   * 特效ID
   */
  public int specialId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 领取状态 true:领取 false:未领取
     * 
     * @see com.ling9527.music.common.msg.auto.FirstRechargeAwardState
     */
    STATE((short)1, "state"),
    /**
     * 首充奖励
     */
    PRIZE_INFO((short)2, "prizeInfo"),
    /**
     * 版本号
     */
    VERSION((short)3, "version"),
    /**
     * 活动信息描述
     */
    DESC((short)4, "desc"),
    /**
     * 特效ID
     */
    SPECIAL_ID((short)5, "specialId");

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
        case 1: // STATE
          return STATE;
        case 2: // PRIZE_INFO
          return PRIZE_INFO;
        case 3: // VERSION
          return VERSION;
        case 4: // DESC
          return DESC;
        case 5: // SPECIAL_ID
          return SPECIAL_ID;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __SPECIALID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.FirstRechargeAwardState.class)));
    tmpMap.put(_Fields.PRIZE_INFO, new org.apache.thrift.meta_data.FieldMetaData("prizeInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.PrizeInfo.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SPECIAL_ID, new org.apache.thrift.meta_data.FieldMetaData("specialId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCFirstRechargeInfo.class, metaDataMap);
  }

  public SCFirstRechargeInfo() {
  }

  public SCFirstRechargeInfo(
    com.ling9527.music.common.msg.auto.FirstRechargeAwardState state,
    com.ling9527.music.common.msg.auto.PrizeInfo prizeInfo,
    byte version,
    String desc,
    int specialId)
  {
    this();
    this.state = state;
    this.prizeInfo = prizeInfo;
    this.version = version;
    setVersionIsSet(true);
    this.desc = desc;
    this.specialId = specialId;
    setSpecialIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCFirstRechargeInfo(SCFirstRechargeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetPrizeInfo()) {
      this.prizeInfo = new com.ling9527.music.common.msg.auto.PrizeInfo(other.prizeInfo);
    }
    this.version = other.version;
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
    this.specialId = other.specialId;
  }

  public SCFirstRechargeInfo deepCopy() {
    return new SCFirstRechargeInfo(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.prizeInfo = null;
    setVersionIsSet(false);
    this.version = 0;
    this.desc = null;
    setSpecialIdIsSet(false);
    this.specialId = 0;
  }

  /**
   * 领取状态 true:领取 false:未领取
   * 
   * @see com.ling9527.music.common.msg.auto.FirstRechargeAwardState
   */
  public com.ling9527.music.common.msg.auto.FirstRechargeAwardState getState() {
    return this.state;
  }

  /**
   * 领取状态 true:领取 false:未领取
   * 
   * @see com.ling9527.music.common.msg.auto.FirstRechargeAwardState
   */
  public SCFirstRechargeInfo setState(com.ling9527.music.common.msg.auto.FirstRechargeAwardState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  /**
   * 首充奖励
   */
  public com.ling9527.music.common.msg.auto.PrizeInfo getPrizeInfo() {
    return this.prizeInfo;
  }

  /**
   * 首充奖励
   */
  public SCFirstRechargeInfo setPrizeInfo(com.ling9527.music.common.msg.auto.PrizeInfo prizeInfo) {
    this.prizeInfo = prizeInfo;
    return this;
  }

  public void unsetPrizeInfo() {
    this.prizeInfo = null;
  }

  /** Returns true if field prizeInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetPrizeInfo() {
    return this.prizeInfo != null;
  }

  public void setPrizeInfoIsSet(boolean value) {
    if (!value) {
      this.prizeInfo = null;
    }
  }

  /**
   * 版本号
   */
  public byte getVersion() {
    return this.version;
  }

  /**
   * 版本号
   */
  public SCFirstRechargeInfo setVersion(byte version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  /**
   * 活动信息描述
   */
  public String getDesc() {
    return this.desc;
  }

  /**
   * 活动信息描述
   */
  public SCFirstRechargeInfo setDesc(String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  /**
   * 特效ID
   */
  public int getSpecialId() {
    return this.specialId;
  }

  /**
   * 特效ID
   */
  public SCFirstRechargeInfo setSpecialId(int specialId) {
    this.specialId = specialId;
    setSpecialIdIsSet(true);
    return this;
  }

  public void unsetSpecialId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPECIALID_ISSET_ID);
  }

  /** Returns true if field specialId is set (has been assigned a value) and false otherwise */
  public boolean isSetSpecialId() {
    return EncodingUtils.testBit(__isset_bitfield, __SPECIALID_ISSET_ID);
  }

  public void setSpecialIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPECIALID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((com.ling9527.music.common.msg.auto.FirstRechargeAwardState)value);
      }
      break;

    case PRIZE_INFO:
      if (value == null) {
        unsetPrizeInfo();
      } else {
        setPrizeInfo((com.ling9527.music.common.msg.auto.PrizeInfo)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Byte)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((String)value);
      }
      break;

    case SPECIAL_ID:
      if (value == null) {
        unsetSpecialId();
      } else {
        setSpecialId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case PRIZE_INFO:
      return getPrizeInfo();

    case VERSION:
      return Byte.valueOf(getVersion());

    case DESC:
      return getDesc();

    case SPECIAL_ID:
      return Integer.valueOf(getSpecialId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case PRIZE_INFO:
      return isSetPrizeInfo();
    case VERSION:
      return isSetVersion();
    case DESC:
      return isSetDesc();
    case SPECIAL_ID:
      return isSetSpecialId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCFirstRechargeInfo)
      return this.equals((SCFirstRechargeInfo)that);
    return false;
  }

  public boolean equals(SCFirstRechargeInfo that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_prizeInfo = true && this.isSetPrizeInfo();
    boolean that_present_prizeInfo = true && that.isSetPrizeInfo();
    if (this_present_prizeInfo || that_present_prizeInfo) {
      if (!(this_present_prizeInfo && that_present_prizeInfo))
        return false;
      if (!this.prizeInfo.equals(that.prizeInfo))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    boolean this_present_specialId = true;
    boolean that_present_specialId = true;
    if (this_present_specialId || that_present_specialId) {
      if (!(this_present_specialId && that_present_specialId))
        return false;
      if (this.specialId != that.specialId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCFirstRechargeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCFirstRechargeInfo typedOther = (SCFirstRechargeInfo)other;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, typedOther.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrizeInfo()).compareTo(typedOther.isSetPrizeInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrizeInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prizeInfo, typedOther.prizeInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDesc()).compareTo(typedOther.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, typedOther.desc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpecialId()).compareTo(typedOther.isSetSpecialId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpecialId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.specialId, typedOther.specialId);
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
    StringBuilder sb = new StringBuilder("SCFirstRechargeInfo(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("prizeInfo:");
    if (this.prizeInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.prizeInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("desc:");
    if (this.desc == null) {
      sb.append("null");
    } else {
      sb.append(this.desc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("specialId:");
    sb.append(this.specialId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (prizeInfo != null) {
      prizeInfo.validate();
    }
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

  private static class SCFirstRechargeInfoStandardSchemeFactory implements SchemeFactory {
    public SCFirstRechargeInfoStandardScheme getScheme() {
      return new SCFirstRechargeInfoStandardScheme();
    }
  }

  private static class SCFirstRechargeInfoStandardScheme extends StandardScheme<SCFirstRechargeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCFirstRechargeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = com.ling9527.music.common.msg.auto.FirstRechargeAwardState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRIZE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.prizeInfo = new com.ling9527.music.common.msg.auto.PrizeInfo();
              struct.prizeInfo.read(iprot);
              struct.setPrizeInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.version = iprot.readByte();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SPECIAL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.specialId = iprot.readI32();
              struct.setSpecialIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCFirstRechargeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.prizeInfo != null) {
        oprot.writeFieldBegin(PRIZE_INFO_FIELD_DESC);
        struct.prizeInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeByte(struct.version);
      oprot.writeFieldEnd();
      if (struct.desc != null) {
        oprot.writeFieldBegin(DESC_FIELD_DESC);
        oprot.writeString(struct.desc);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SPECIAL_ID_FIELD_DESC);
      oprot.writeI32(struct.specialId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCFirstRechargeInfoTupleSchemeFactory implements SchemeFactory {
    public SCFirstRechargeInfoTupleScheme getScheme() {
      return new SCFirstRechargeInfoTupleScheme();
    }
  }

  private static class SCFirstRechargeInfoTupleScheme extends TupleScheme<SCFirstRechargeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCFirstRechargeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetState()) {
        optionals.set(0);
      }
      if (struct.isSetPrizeInfo()) {
        optionals.set(1);
      }
      if (struct.isSetVersion()) {
        optionals.set(2);
      }
      if (struct.isSetDesc()) {
        optionals.set(3);
      }
      if (struct.isSetSpecialId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetPrizeInfo()) {
        struct.prizeInfo.write(oprot);
      }
      if (struct.isSetVersion()) {
        oprot.writeByte(struct.version);
      }
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
      if (struct.isSetSpecialId()) {
        oprot.writeI32(struct.specialId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCFirstRechargeInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.state = com.ling9527.music.common.msg.auto.FirstRechargeAwardState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.prizeInfo = new com.ling9527.music.common.msg.auto.PrizeInfo();
        struct.prizeInfo.read(iprot);
        struct.setPrizeInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.version = iprot.readByte();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
      if (incoming.get(4)) {
        struct.specialId = iprot.readI32();
        struct.setSpecialIdIsSet(true);
      }
    }
  }

}
