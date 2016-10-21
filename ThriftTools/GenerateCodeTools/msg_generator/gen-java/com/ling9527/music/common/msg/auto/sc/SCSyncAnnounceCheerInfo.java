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
 * 通告同步欢呼值
 */
public class SCSyncAnnounceCheerInfo implements org.apache.thrift.TBase<SCSyncAnnounceCheerInfo, SCSyncAnnounceCheerInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCSyncAnnounceCheerInfo");

  private static final org.apache.thrift.protocol.TField SYNC_DANCE_CHEER_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("syncDanceCheerInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_SPECIAL_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("hasSpecialVal", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCSyncAnnounceCheerInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCSyncAnnounceCheerInfoTupleSchemeFactory());
  }

  /**
   * 同步欢呼值信息
   */
  public com.ling9527.music.common.msg.auto.SyncDanceCheerInfo syncDanceCheerInfo; // required
  /**
   * 是否触发特殊玩法
   */
  public boolean hasSpecialVal; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 同步欢呼值信息
     */
    SYNC_DANCE_CHEER_INFO((short)1, "syncDanceCheerInfo"),
    /**
     * 是否触发特殊玩法
     */
    HAS_SPECIAL_VAL((short)2, "hasSpecialVal");

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
        case 1: // SYNC_DANCE_CHEER_INFO
          return SYNC_DANCE_CHEER_INFO;
        case 2: // HAS_SPECIAL_VAL
          return HAS_SPECIAL_VAL;
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
  private static final int __HASSPECIALVAL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.HAS_SPECIAL_VAL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SYNC_DANCE_CHEER_INFO, new org.apache.thrift.meta_data.FieldMetaData("syncDanceCheerInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.SyncDanceCheerInfo.class)));
    tmpMap.put(_Fields.HAS_SPECIAL_VAL, new org.apache.thrift.meta_data.FieldMetaData("hasSpecialVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCSyncAnnounceCheerInfo.class, metaDataMap);
  }

  public SCSyncAnnounceCheerInfo() {
  }

  public SCSyncAnnounceCheerInfo(
    com.ling9527.music.common.msg.auto.SyncDanceCheerInfo syncDanceCheerInfo)
  {
    this();
    this.syncDanceCheerInfo = syncDanceCheerInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCSyncAnnounceCheerInfo(SCSyncAnnounceCheerInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSyncDanceCheerInfo()) {
      this.syncDanceCheerInfo = new com.ling9527.music.common.msg.auto.SyncDanceCheerInfo(other.syncDanceCheerInfo);
    }
    this.hasSpecialVal = other.hasSpecialVal;
  }

  public SCSyncAnnounceCheerInfo deepCopy() {
    return new SCSyncAnnounceCheerInfo(this);
  }

  @Override
  public void clear() {
    this.syncDanceCheerInfo = null;
    setHasSpecialValIsSet(false);
    this.hasSpecialVal = false;
  }

  /**
   * 同步欢呼值信息
   */
  public com.ling9527.music.common.msg.auto.SyncDanceCheerInfo getSyncDanceCheerInfo() {
    return this.syncDanceCheerInfo;
  }

  /**
   * 同步欢呼值信息
   */
  public SCSyncAnnounceCheerInfo setSyncDanceCheerInfo(com.ling9527.music.common.msg.auto.SyncDanceCheerInfo syncDanceCheerInfo) {
    this.syncDanceCheerInfo = syncDanceCheerInfo;
    return this;
  }

  public void unsetSyncDanceCheerInfo() {
    this.syncDanceCheerInfo = null;
  }

  /** Returns true if field syncDanceCheerInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetSyncDanceCheerInfo() {
    return this.syncDanceCheerInfo != null;
  }

  public void setSyncDanceCheerInfoIsSet(boolean value) {
    if (!value) {
      this.syncDanceCheerInfo = null;
    }
  }

  /**
   * 是否触发特殊玩法
   */
  public boolean isHasSpecialVal() {
    return this.hasSpecialVal;
  }

  /**
   * 是否触发特殊玩法
   */
  public SCSyncAnnounceCheerInfo setHasSpecialVal(boolean hasSpecialVal) {
    this.hasSpecialVal = hasSpecialVal;
    setHasSpecialValIsSet(true);
    return this;
  }

  public void unsetHasSpecialVal() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HASSPECIALVAL_ISSET_ID);
  }

  /** Returns true if field hasSpecialVal is set (has been assigned a value) and false otherwise */
  public boolean isSetHasSpecialVal() {
    return EncodingUtils.testBit(__isset_bitfield, __HASSPECIALVAL_ISSET_ID);
  }

  public void setHasSpecialValIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HASSPECIALVAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SYNC_DANCE_CHEER_INFO:
      if (value == null) {
        unsetSyncDanceCheerInfo();
      } else {
        setSyncDanceCheerInfo((com.ling9527.music.common.msg.auto.SyncDanceCheerInfo)value);
      }
      break;

    case HAS_SPECIAL_VAL:
      if (value == null) {
        unsetHasSpecialVal();
      } else {
        setHasSpecialVal((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SYNC_DANCE_CHEER_INFO:
      return getSyncDanceCheerInfo();

    case HAS_SPECIAL_VAL:
      return Boolean.valueOf(isHasSpecialVal());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SYNC_DANCE_CHEER_INFO:
      return isSetSyncDanceCheerInfo();
    case HAS_SPECIAL_VAL:
      return isSetHasSpecialVal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCSyncAnnounceCheerInfo)
      return this.equals((SCSyncAnnounceCheerInfo)that);
    return false;
  }

  public boolean equals(SCSyncAnnounceCheerInfo that) {
    if (that == null)
      return false;

    boolean this_present_syncDanceCheerInfo = true && this.isSetSyncDanceCheerInfo();
    boolean that_present_syncDanceCheerInfo = true && that.isSetSyncDanceCheerInfo();
    if (this_present_syncDanceCheerInfo || that_present_syncDanceCheerInfo) {
      if (!(this_present_syncDanceCheerInfo && that_present_syncDanceCheerInfo))
        return false;
      if (!this.syncDanceCheerInfo.equals(that.syncDanceCheerInfo))
        return false;
    }

    boolean this_present_hasSpecialVal = true && this.isSetHasSpecialVal();
    boolean that_present_hasSpecialVal = true && that.isSetHasSpecialVal();
    if (this_present_hasSpecialVal || that_present_hasSpecialVal) {
      if (!(this_present_hasSpecialVal && that_present_hasSpecialVal))
        return false;
      if (this.hasSpecialVal != that.hasSpecialVal)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCSyncAnnounceCheerInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCSyncAnnounceCheerInfo typedOther = (SCSyncAnnounceCheerInfo)other;

    lastComparison = Boolean.valueOf(isSetSyncDanceCheerInfo()).compareTo(typedOther.isSetSyncDanceCheerInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncDanceCheerInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncDanceCheerInfo, typedOther.syncDanceCheerInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasSpecialVal()).compareTo(typedOther.isSetHasSpecialVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasSpecialVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasSpecialVal, typedOther.hasSpecialVal);
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
    StringBuilder sb = new StringBuilder("SCSyncAnnounceCheerInfo(");
    boolean first = true;

    sb.append("syncDanceCheerInfo:");
    if (this.syncDanceCheerInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.syncDanceCheerInfo);
    }
    first = false;
    if (isSetHasSpecialVal()) {
      if (!first) sb.append(", ");
      sb.append("hasSpecialVal:");
      sb.append(this.hasSpecialVal);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (syncDanceCheerInfo != null) {
      syncDanceCheerInfo.validate();
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

  private static class SCSyncAnnounceCheerInfoStandardSchemeFactory implements SchemeFactory {
    public SCSyncAnnounceCheerInfoStandardScheme getScheme() {
      return new SCSyncAnnounceCheerInfoStandardScheme();
    }
  }

  private static class SCSyncAnnounceCheerInfoStandardScheme extends StandardScheme<SCSyncAnnounceCheerInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCSyncAnnounceCheerInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SYNC_DANCE_CHEER_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.syncDanceCheerInfo = new com.ling9527.music.common.msg.auto.SyncDanceCheerInfo();
              struct.syncDanceCheerInfo.read(iprot);
              struct.setSyncDanceCheerInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_SPECIAL_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasSpecialVal = iprot.readBool();
              struct.setHasSpecialValIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCSyncAnnounceCheerInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.syncDanceCheerInfo != null) {
        oprot.writeFieldBegin(SYNC_DANCE_CHEER_INFO_FIELD_DESC);
        struct.syncDanceCheerInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetHasSpecialVal()) {
        oprot.writeFieldBegin(HAS_SPECIAL_VAL_FIELD_DESC);
        oprot.writeBool(struct.hasSpecialVal);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCSyncAnnounceCheerInfoTupleSchemeFactory implements SchemeFactory {
    public SCSyncAnnounceCheerInfoTupleScheme getScheme() {
      return new SCSyncAnnounceCheerInfoTupleScheme();
    }
  }

  private static class SCSyncAnnounceCheerInfoTupleScheme extends TupleScheme<SCSyncAnnounceCheerInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCSyncAnnounceCheerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSyncDanceCheerInfo()) {
        optionals.set(0);
      }
      if (struct.isSetHasSpecialVal()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSyncDanceCheerInfo()) {
        struct.syncDanceCheerInfo.write(oprot);
      }
      if (struct.isSetHasSpecialVal()) {
        oprot.writeBool(struct.hasSpecialVal);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCSyncAnnounceCheerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.syncDanceCheerInfo = new com.ling9527.music.common.msg.auto.SyncDanceCheerInfo();
        struct.syncDanceCheerInfo.read(iprot);
        struct.setSyncDanceCheerInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hasSpecialVal = iprot.readBool();
        struct.setHasSpecialValIsSet(true);
      }
    }
  }

}

