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
 * vip等级奖励信息
 */
public class SCVipLevelPrizeMsg implements org.apache.thrift.TBase<SCVipLevelPrizeMsg, SCVipLevelPrizeMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCVipLevelPrizeMsg");

  private static final org.apache.thrift.protocol.TField VIP_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("vipLvl", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField PRIZE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("prizeInfos", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCVipLevelPrizeMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCVipLevelPrizeMsgTupleSchemeFactory());
  }

  /**
   * vip等级
   */
  public byte vipLvl; // required
  /**
   * 奖励
   */
  public com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * vip等级
     */
    VIP_LVL((short)1, "vipLvl"),
    /**
     * 奖励
     */
    PRIZE_INFOS((short)2, "prizeInfos");

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
        case 1: // VIP_LVL
          return VIP_LVL;
        case 2: // PRIZE_INFOS
          return PRIZE_INFOS;
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
  private static final int __VIPLVL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PRIZE_INFOS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VIP_LVL, new org.apache.thrift.meta_data.FieldMetaData("vipLvl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PRIZE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("prizeInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.PrizeInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCVipLevelPrizeMsg.class, metaDataMap);
  }

  public SCVipLevelPrizeMsg() {
  }

  public SCVipLevelPrizeMsg(
    byte vipLvl)
  {
    this();
    this.vipLvl = vipLvl;
    setVipLvlIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCVipLevelPrizeMsg(SCVipLevelPrizeMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.vipLvl = other.vipLvl;
    if (other.isSetPrizeInfos()) {
      this.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo(other.prizeInfos);
    }
  }

  public SCVipLevelPrizeMsg deepCopy() {
    return new SCVipLevelPrizeMsg(this);
  }

  @Override
  public void clear() {
    setVipLvlIsSet(false);
    this.vipLvl = 0;
    this.prizeInfos = null;
  }

  /**
   * vip等级
   */
  public byte getVipLvl() {
    return this.vipLvl;
  }

  /**
   * vip等级
   */
  public SCVipLevelPrizeMsg setVipLvl(byte vipLvl) {
    this.vipLvl = vipLvl;
    setVipLvlIsSet(true);
    return this;
  }

  public void unsetVipLvl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIPLVL_ISSET_ID);
  }

  /** Returns true if field vipLvl is set (has been assigned a value) and false otherwise */
  public boolean isSetVipLvl() {
    return EncodingUtils.testBit(__isset_bitfield, __VIPLVL_ISSET_ID);
  }

  public void setVipLvlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIPLVL_ISSET_ID, value);
  }

  /**
   * 奖励
   */
  public com.ling9527.music.common.msg.auto.PrizeInfo getPrizeInfos() {
    return this.prizeInfos;
  }

  /**
   * 奖励
   */
  public SCVipLevelPrizeMsg setPrizeInfos(com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos) {
    this.prizeInfos = prizeInfos;
    return this;
  }

  public void unsetPrizeInfos() {
    this.prizeInfos = null;
  }

  /** Returns true if field prizeInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetPrizeInfos() {
    return this.prizeInfos != null;
  }

  public void setPrizeInfosIsSet(boolean value) {
    if (!value) {
      this.prizeInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VIP_LVL:
      if (value == null) {
        unsetVipLvl();
      } else {
        setVipLvl((Byte)value);
      }
      break;

    case PRIZE_INFOS:
      if (value == null) {
        unsetPrizeInfos();
      } else {
        setPrizeInfos((com.ling9527.music.common.msg.auto.PrizeInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VIP_LVL:
      return Byte.valueOf(getVipLvl());

    case PRIZE_INFOS:
      return getPrizeInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VIP_LVL:
      return isSetVipLvl();
    case PRIZE_INFOS:
      return isSetPrizeInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCVipLevelPrizeMsg)
      return this.equals((SCVipLevelPrizeMsg)that);
    return false;
  }

  public boolean equals(SCVipLevelPrizeMsg that) {
    if (that == null)
      return false;

    boolean this_present_vipLvl = true;
    boolean that_present_vipLvl = true;
    if (this_present_vipLvl || that_present_vipLvl) {
      if (!(this_present_vipLvl && that_present_vipLvl))
        return false;
      if (this.vipLvl != that.vipLvl)
        return false;
    }

    boolean this_present_prizeInfos = true && this.isSetPrizeInfos();
    boolean that_present_prizeInfos = true && that.isSetPrizeInfos();
    if (this_present_prizeInfos || that_present_prizeInfos) {
      if (!(this_present_prizeInfos && that_present_prizeInfos))
        return false;
      if (!this.prizeInfos.equals(that.prizeInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCVipLevelPrizeMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCVipLevelPrizeMsg typedOther = (SCVipLevelPrizeMsg)other;

    lastComparison = Boolean.valueOf(isSetVipLvl()).compareTo(typedOther.isSetVipLvl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVipLvl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vipLvl, typedOther.vipLvl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrizeInfos()).compareTo(typedOther.isSetPrizeInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrizeInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prizeInfos, typedOther.prizeInfos);
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
    StringBuilder sb = new StringBuilder("SCVipLevelPrizeMsg(");
    boolean first = true;

    sb.append("vipLvl:");
    sb.append(this.vipLvl);
    first = false;
    if (isSetPrizeInfos()) {
      if (!first) sb.append(", ");
      sb.append("prizeInfos:");
      if (this.prizeInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.prizeInfos);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (prizeInfos != null) {
      prizeInfos.validate();
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

  private static class SCVipLevelPrizeMsgStandardSchemeFactory implements SchemeFactory {
    public SCVipLevelPrizeMsgStandardScheme getScheme() {
      return new SCVipLevelPrizeMsgStandardScheme();
    }
  }

  private static class SCVipLevelPrizeMsgStandardScheme extends StandardScheme<SCVipLevelPrizeMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VIP_LVL
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.vipLvl = iprot.readByte();
              struct.setVipLvlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRIZE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo();
              struct.prizeInfos.read(iprot);
              struct.setPrizeInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VIP_LVL_FIELD_DESC);
      oprot.writeByte(struct.vipLvl);
      oprot.writeFieldEnd();
      if (struct.prizeInfos != null) {
        if (struct.isSetPrizeInfos()) {
          oprot.writeFieldBegin(PRIZE_INFOS_FIELD_DESC);
          struct.prizeInfos.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCVipLevelPrizeMsgTupleSchemeFactory implements SchemeFactory {
    public SCVipLevelPrizeMsgTupleScheme getScheme() {
      return new SCVipLevelPrizeMsgTupleScheme();
    }
  }

  private static class SCVipLevelPrizeMsgTupleScheme extends TupleScheme<SCVipLevelPrizeMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVipLvl()) {
        optionals.set(0);
      }
      if (struct.isSetPrizeInfos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetVipLvl()) {
        oprot.writeByte(struct.vipLvl);
      }
      if (struct.isSetPrizeInfos()) {
        struct.prizeInfos.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.vipLvl = iprot.readByte();
        struct.setVipLvlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo();
        struct.prizeInfos.read(iprot);
        struct.setPrizeInfosIsSet(true);
      }
    }
  }

}
