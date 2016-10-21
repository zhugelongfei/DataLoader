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
 * 查看对应vip等级奖励信息
 */
public class CSVipLevelPrizeMsg implements org.apache.thrift.TBase<CSVipLevelPrizeMsg, CSVipLevelPrizeMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSVipLevelPrizeMsg");

  private static final org.apache.thrift.protocol.TField VIP_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("vipLvl", org.apache.thrift.protocol.TType.BYTE, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSVipLevelPrizeMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSVipLevelPrizeMsgTupleSchemeFactory());
  }

  /**
   * vip等级
   */
  public byte vipLvl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * vip等级
     */
    VIP_LVL((short)1, "vipLvl");

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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VIP_LVL, new org.apache.thrift.meta_data.FieldMetaData("vipLvl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSVipLevelPrizeMsg.class, metaDataMap);
  }

  public CSVipLevelPrizeMsg() {
  }

  public CSVipLevelPrizeMsg(
    byte vipLvl)
  {
    this();
    this.vipLvl = vipLvl;
    setVipLvlIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSVipLevelPrizeMsg(CSVipLevelPrizeMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.vipLvl = other.vipLvl;
  }

  public CSVipLevelPrizeMsg deepCopy() {
    return new CSVipLevelPrizeMsg(this);
  }

  @Override
  public void clear() {
    setVipLvlIsSet(false);
    this.vipLvl = 0;
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
  public CSVipLevelPrizeMsg setVipLvl(byte vipLvl) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VIP_LVL:
      if (value == null) {
        unsetVipLvl();
      } else {
        setVipLvl((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VIP_LVL:
      return Byte.valueOf(getVipLvl());

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
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSVipLevelPrizeMsg)
      return this.equals((CSVipLevelPrizeMsg)that);
    return false;
  }

  public boolean equals(CSVipLevelPrizeMsg that) {
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSVipLevelPrizeMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSVipLevelPrizeMsg typedOther = (CSVipLevelPrizeMsg)other;

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
    StringBuilder sb = new StringBuilder("CSVipLevelPrizeMsg(");
    boolean first = true;

    sb.append("vipLvl:");
    sb.append(this.vipLvl);
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

  private static class CSVipLevelPrizeMsgStandardSchemeFactory implements SchemeFactory {
    public CSVipLevelPrizeMsgStandardScheme getScheme() {
      return new CSVipLevelPrizeMsgStandardScheme();
    }
  }

  private static class CSVipLevelPrizeMsgStandardScheme extends StandardScheme<CSVipLevelPrizeMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VIP_LVL_FIELD_DESC);
      oprot.writeByte(struct.vipLvl);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSVipLevelPrizeMsgTupleSchemeFactory implements SchemeFactory {
    public CSVipLevelPrizeMsgTupleScheme getScheme() {
      return new CSVipLevelPrizeMsgTupleScheme();
    }
  }

  private static class CSVipLevelPrizeMsgTupleScheme extends TupleScheme<CSVipLevelPrizeMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVipLvl()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVipLvl()) {
        oprot.writeByte(struct.vipLvl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSVipLevelPrizeMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.vipLvl = iprot.readByte();
        struct.setVipLvlIsSet(true);
      }
    }
  }

}

