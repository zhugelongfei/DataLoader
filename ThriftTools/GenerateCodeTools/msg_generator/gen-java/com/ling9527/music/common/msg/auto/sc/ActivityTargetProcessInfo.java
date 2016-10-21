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
 * 活动目标进度信息
 */
public class ActivityTargetProcessInfo implements org.apache.thrift.TBase<ActivityTargetProcessInfo, ActivityTargetProcessInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ActivityTargetProcessInfo");

  private static final org.apache.thrift.protocol.TField TARGET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CUR_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("curNum", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CAN_GET_PRIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("canGetPrize", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ActivityTargetProcessInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ActivityTargetProcessInfoTupleSchemeFactory());
  }

  /**
   * 目标id
   */
  public int targetId; // required
  /**
   * 当前进度
   */
  public long curNum; // required
  /**
   * 是否可领取奖励
   */
  public boolean canGetPrize; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 目标id
     */
    TARGET_ID((short)1, "targetId"),
    /**
     * 当前进度
     */
    CUR_NUM((short)2, "curNum"),
    /**
     * 是否可领取奖励
     */
    CAN_GET_PRIZE((short)3, "canGetPrize");

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
        case 1: // TARGET_ID
          return TARGET_ID;
        case 2: // CUR_NUM
          return CUR_NUM;
        case 3: // CAN_GET_PRIZE
          return CAN_GET_PRIZE;
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
  private static final int __TARGETID_ISSET_ID = 0;
  private static final int __CURNUM_ISSET_ID = 1;
  private static final int __CANGETPRIZE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CAN_GET_PRIZE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TARGET_ID, new org.apache.thrift.meta_data.FieldMetaData("targetId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CUR_NUM, new org.apache.thrift.meta_data.FieldMetaData("curNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CAN_GET_PRIZE, new org.apache.thrift.meta_data.FieldMetaData("canGetPrize", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ActivityTargetProcessInfo.class, metaDataMap);
  }

  public ActivityTargetProcessInfo() {
  }

  public ActivityTargetProcessInfo(
    int targetId,
    long curNum)
  {
    this();
    this.targetId = targetId;
    setTargetIdIsSet(true);
    this.curNum = curNum;
    setCurNumIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ActivityTargetProcessInfo(ActivityTargetProcessInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.targetId = other.targetId;
    this.curNum = other.curNum;
    this.canGetPrize = other.canGetPrize;
  }

  public ActivityTargetProcessInfo deepCopy() {
    return new ActivityTargetProcessInfo(this);
  }

  @Override
  public void clear() {
    setTargetIdIsSet(false);
    this.targetId = 0;
    setCurNumIsSet(false);
    this.curNum = 0;
    setCanGetPrizeIsSet(false);
    this.canGetPrize = false;
  }

  /**
   * 目标id
   */
  public int getTargetId() {
    return this.targetId;
  }

  /**
   * 目标id
   */
  public ActivityTargetProcessInfo setTargetId(int targetId) {
    this.targetId = targetId;
    setTargetIdIsSet(true);
    return this;
  }

  public void unsetTargetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TARGETID_ISSET_ID);
  }

  /** Returns true if field targetId is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetId() {
    return EncodingUtils.testBit(__isset_bitfield, __TARGETID_ISSET_ID);
  }

  public void setTargetIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TARGETID_ISSET_ID, value);
  }

  /**
   * 当前进度
   */
  public long getCurNum() {
    return this.curNum;
  }

  /**
   * 当前进度
   */
  public ActivityTargetProcessInfo setCurNum(long curNum) {
    this.curNum = curNum;
    setCurNumIsSet(true);
    return this;
  }

  public void unsetCurNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURNUM_ISSET_ID);
  }

  /** Returns true if field curNum is set (has been assigned a value) and false otherwise */
  public boolean isSetCurNum() {
    return EncodingUtils.testBit(__isset_bitfield, __CURNUM_ISSET_ID);
  }

  public void setCurNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURNUM_ISSET_ID, value);
  }

  /**
   * 是否可领取奖励
   */
  public boolean isCanGetPrize() {
    return this.canGetPrize;
  }

  /**
   * 是否可领取奖励
   */
  public ActivityTargetProcessInfo setCanGetPrize(boolean canGetPrize) {
    this.canGetPrize = canGetPrize;
    setCanGetPrizeIsSet(true);
    return this;
  }

  public void unsetCanGetPrize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CANGETPRIZE_ISSET_ID);
  }

  /** Returns true if field canGetPrize is set (has been assigned a value) and false otherwise */
  public boolean isSetCanGetPrize() {
    return EncodingUtils.testBit(__isset_bitfield, __CANGETPRIZE_ISSET_ID);
  }

  public void setCanGetPrizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CANGETPRIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TARGET_ID:
      if (value == null) {
        unsetTargetId();
      } else {
        setTargetId((Integer)value);
      }
      break;

    case CUR_NUM:
      if (value == null) {
        unsetCurNum();
      } else {
        setCurNum((Long)value);
      }
      break;

    case CAN_GET_PRIZE:
      if (value == null) {
        unsetCanGetPrize();
      } else {
        setCanGetPrize((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TARGET_ID:
      return Integer.valueOf(getTargetId());

    case CUR_NUM:
      return Long.valueOf(getCurNum());

    case CAN_GET_PRIZE:
      return Boolean.valueOf(isCanGetPrize());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TARGET_ID:
      return isSetTargetId();
    case CUR_NUM:
      return isSetCurNum();
    case CAN_GET_PRIZE:
      return isSetCanGetPrize();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ActivityTargetProcessInfo)
      return this.equals((ActivityTargetProcessInfo)that);
    return false;
  }

  public boolean equals(ActivityTargetProcessInfo that) {
    if (that == null)
      return false;

    boolean this_present_targetId = true;
    boolean that_present_targetId = true;
    if (this_present_targetId || that_present_targetId) {
      if (!(this_present_targetId && that_present_targetId))
        return false;
      if (this.targetId != that.targetId)
        return false;
    }

    boolean this_present_curNum = true;
    boolean that_present_curNum = true;
    if (this_present_curNum || that_present_curNum) {
      if (!(this_present_curNum && that_present_curNum))
        return false;
      if (this.curNum != that.curNum)
        return false;
    }

    boolean this_present_canGetPrize = true && this.isSetCanGetPrize();
    boolean that_present_canGetPrize = true && that.isSetCanGetPrize();
    if (this_present_canGetPrize || that_present_canGetPrize) {
      if (!(this_present_canGetPrize && that_present_canGetPrize))
        return false;
      if (this.canGetPrize != that.canGetPrize)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ActivityTargetProcessInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ActivityTargetProcessInfo typedOther = (ActivityTargetProcessInfo)other;

    lastComparison = Boolean.valueOf(isSetTargetId()).compareTo(typedOther.isSetTargetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetId, typedOther.targetId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurNum()).compareTo(typedOther.isSetCurNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.curNum, typedOther.curNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCanGetPrize()).compareTo(typedOther.isSetCanGetPrize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCanGetPrize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.canGetPrize, typedOther.canGetPrize);
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
    StringBuilder sb = new StringBuilder("ActivityTargetProcessInfo(");
    boolean first = true;

    sb.append("targetId:");
    sb.append(this.targetId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("curNum:");
    sb.append(this.curNum);
    first = false;
    if (isSetCanGetPrize()) {
      if (!first) sb.append(", ");
      sb.append("canGetPrize:");
      sb.append(this.canGetPrize);
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

  private static class ActivityTargetProcessInfoStandardSchemeFactory implements SchemeFactory {
    public ActivityTargetProcessInfoStandardScheme getScheme() {
      return new ActivityTargetProcessInfoStandardScheme();
    }
  }

  private static class ActivityTargetProcessInfoStandardScheme extends StandardScheme<ActivityTargetProcessInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ActivityTargetProcessInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TARGET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.targetId = iprot.readI32();
              struct.setTargetIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CUR_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.curNum = iprot.readI64();
              struct.setCurNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CAN_GET_PRIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.canGetPrize = iprot.readBool();
              struct.setCanGetPrizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ActivityTargetProcessInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TARGET_ID_FIELD_DESC);
      oprot.writeI32(struct.targetId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CUR_NUM_FIELD_DESC);
      oprot.writeI64(struct.curNum);
      oprot.writeFieldEnd();
      if (struct.isSetCanGetPrize()) {
        oprot.writeFieldBegin(CAN_GET_PRIZE_FIELD_DESC);
        oprot.writeBool(struct.canGetPrize);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ActivityTargetProcessInfoTupleSchemeFactory implements SchemeFactory {
    public ActivityTargetProcessInfoTupleScheme getScheme() {
      return new ActivityTargetProcessInfoTupleScheme();
    }
  }

  private static class ActivityTargetProcessInfoTupleScheme extends TupleScheme<ActivityTargetProcessInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ActivityTargetProcessInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTargetId()) {
        optionals.set(0);
      }
      if (struct.isSetCurNum()) {
        optionals.set(1);
      }
      if (struct.isSetCanGetPrize()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTargetId()) {
        oprot.writeI32(struct.targetId);
      }
      if (struct.isSetCurNum()) {
        oprot.writeI64(struct.curNum);
      }
      if (struct.isSetCanGetPrize()) {
        oprot.writeBool(struct.canGetPrize);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ActivityTargetProcessInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.targetId = iprot.readI32();
        struct.setTargetIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.curNum = iprot.readI64();
        struct.setCurNumIsSet(true);
      }
      if (incoming.get(2)) {
        struct.canGetPrize = iprot.readBool();
        struct.setCanGetPrizeIsSet(true);
      }
    }
  }

}

