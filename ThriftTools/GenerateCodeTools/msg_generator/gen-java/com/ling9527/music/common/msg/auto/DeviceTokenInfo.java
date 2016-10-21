/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto;

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

public class DeviceTokenInfo implements org.apache.thrift.TBase<DeviceTokenInfo, DeviceTokenInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeviceTokenInfo");

  private static final org.apache.thrift.protocol.TField DEVICE_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("deviceToken", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField UP_PIC_LIMIT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("upPicLimitCount", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField GIFT_LIMIT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("giftLimitCount", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField LAST_UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastUpdateTime", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeviceTokenInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeviceTokenInfoTupleSchemeFactory());
  }

  public String deviceToken; // required
  public long updateTime; // required
  public byte upPicLimitCount; // required
  public byte giftLimitCount; // required
  public long lastUpdateTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEVICE_TOKEN((short)1, "deviceToken"),
    UPDATE_TIME((short)2, "updateTime"),
    UP_PIC_LIMIT_COUNT((short)3, "upPicLimitCount"),
    GIFT_LIMIT_COUNT((short)4, "giftLimitCount"),
    LAST_UPDATE_TIME((short)5, "lastUpdateTime");

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
        case 1: // DEVICE_TOKEN
          return DEVICE_TOKEN;
        case 2: // UPDATE_TIME
          return UPDATE_TIME;
        case 3: // UP_PIC_LIMIT_COUNT
          return UP_PIC_LIMIT_COUNT;
        case 4: // GIFT_LIMIT_COUNT
          return GIFT_LIMIT_COUNT;
        case 5: // LAST_UPDATE_TIME
          return LAST_UPDATE_TIME;
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
  private static final int __UPDATETIME_ISSET_ID = 0;
  private static final int __UPPICLIMITCOUNT_ISSET_ID = 1;
  private static final int __GIFTLIMITCOUNT_ISSET_ID = 2;
  private static final int __LASTUPDATETIME_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVICE_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("deviceToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UP_PIC_LIMIT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("upPicLimitCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.GIFT_LIMIT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("giftLimitCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.LAST_UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastUpdateTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeviceTokenInfo.class, metaDataMap);
  }

  public DeviceTokenInfo() {
  }

  public DeviceTokenInfo(
    String deviceToken,
    long updateTime,
    byte upPicLimitCount,
    byte giftLimitCount,
    long lastUpdateTime)
  {
    this();
    this.deviceToken = deviceToken;
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    this.upPicLimitCount = upPicLimitCount;
    setUpPicLimitCountIsSet(true);
    this.giftLimitCount = giftLimitCount;
    setGiftLimitCountIsSet(true);
    this.lastUpdateTime = lastUpdateTime;
    setLastUpdateTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeviceTokenInfo(DeviceTokenInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDeviceToken()) {
      this.deviceToken = other.deviceToken;
    }
    this.updateTime = other.updateTime;
    this.upPicLimitCount = other.upPicLimitCount;
    this.giftLimitCount = other.giftLimitCount;
    this.lastUpdateTime = other.lastUpdateTime;
  }

  public DeviceTokenInfo deepCopy() {
    return new DeviceTokenInfo(this);
  }

  @Override
  public void clear() {
    this.deviceToken = null;
    setUpdateTimeIsSet(false);
    this.updateTime = 0;
    setUpPicLimitCountIsSet(false);
    this.upPicLimitCount = 0;
    setGiftLimitCountIsSet(false);
    this.giftLimitCount = 0;
    setLastUpdateTimeIsSet(false);
    this.lastUpdateTime = 0;
  }

  public String getDeviceToken() {
    return this.deviceToken;
  }

  public DeviceTokenInfo setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }

  public void unsetDeviceToken() {
    this.deviceToken = null;
  }

  /** Returns true if field deviceToken is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceToken() {
    return this.deviceToken != null;
  }

  public void setDeviceTokenIsSet(boolean value) {
    if (!value) {
      this.deviceToken = null;
    }
  }

  public long getUpdateTime() {
    return this.updateTime;
  }

  public DeviceTokenInfo setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    return this;
  }

  public void unsetUpdateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  /** Returns true if field updateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  public void setUpdateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATETIME_ISSET_ID, value);
  }

  public byte getUpPicLimitCount() {
    return this.upPicLimitCount;
  }

  public DeviceTokenInfo setUpPicLimitCount(byte upPicLimitCount) {
    this.upPicLimitCount = upPicLimitCount;
    setUpPicLimitCountIsSet(true);
    return this;
  }

  public void unsetUpPicLimitCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPPICLIMITCOUNT_ISSET_ID);
  }

  /** Returns true if field upPicLimitCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUpPicLimitCount() {
    return EncodingUtils.testBit(__isset_bitfield, __UPPICLIMITCOUNT_ISSET_ID);
  }

  public void setUpPicLimitCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPPICLIMITCOUNT_ISSET_ID, value);
  }

  public byte getGiftLimitCount() {
    return this.giftLimitCount;
  }

  public DeviceTokenInfo setGiftLimitCount(byte giftLimitCount) {
    this.giftLimitCount = giftLimitCount;
    setGiftLimitCountIsSet(true);
    return this;
  }

  public void unsetGiftLimitCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GIFTLIMITCOUNT_ISSET_ID);
  }

  /** Returns true if field giftLimitCount is set (has been assigned a value) and false otherwise */
  public boolean isSetGiftLimitCount() {
    return EncodingUtils.testBit(__isset_bitfield, __GIFTLIMITCOUNT_ISSET_ID);
  }

  public void setGiftLimitCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GIFTLIMITCOUNT_ISSET_ID, value);
  }

  public long getLastUpdateTime() {
    return this.lastUpdateTime;
  }

  public DeviceTokenInfo setLastUpdateTime(long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    setLastUpdateTimeIsSet(true);
    return this;
  }

  public void unsetLastUpdateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTUPDATETIME_ISSET_ID);
  }

  /** Returns true if field lastUpdateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastUpdateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTUPDATETIME_ISSET_ID);
  }

  public void setLastUpdateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTUPDATETIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVICE_TOKEN:
      if (value == null) {
        unsetDeviceToken();
      } else {
        setDeviceToken((String)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdateTime();
      } else {
        setUpdateTime((Long)value);
      }
      break;

    case UP_PIC_LIMIT_COUNT:
      if (value == null) {
        unsetUpPicLimitCount();
      } else {
        setUpPicLimitCount((Byte)value);
      }
      break;

    case GIFT_LIMIT_COUNT:
      if (value == null) {
        unsetGiftLimitCount();
      } else {
        setGiftLimitCount((Byte)value);
      }
      break;

    case LAST_UPDATE_TIME:
      if (value == null) {
        unsetLastUpdateTime();
      } else {
        setLastUpdateTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVICE_TOKEN:
      return getDeviceToken();

    case UPDATE_TIME:
      return Long.valueOf(getUpdateTime());

    case UP_PIC_LIMIT_COUNT:
      return Byte.valueOf(getUpPicLimitCount());

    case GIFT_LIMIT_COUNT:
      return Byte.valueOf(getGiftLimitCount());

    case LAST_UPDATE_TIME:
      return Long.valueOf(getLastUpdateTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVICE_TOKEN:
      return isSetDeviceToken();
    case UPDATE_TIME:
      return isSetUpdateTime();
    case UP_PIC_LIMIT_COUNT:
      return isSetUpPicLimitCount();
    case GIFT_LIMIT_COUNT:
      return isSetGiftLimitCount();
    case LAST_UPDATE_TIME:
      return isSetLastUpdateTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeviceTokenInfo)
      return this.equals((DeviceTokenInfo)that);
    return false;
  }

  public boolean equals(DeviceTokenInfo that) {
    if (that == null)
      return false;

    boolean this_present_deviceToken = true && this.isSetDeviceToken();
    boolean that_present_deviceToken = true && that.isSetDeviceToken();
    if (this_present_deviceToken || that_present_deviceToken) {
      if (!(this_present_deviceToken && that_present_deviceToken))
        return false;
      if (!this.deviceToken.equals(that.deviceToken))
        return false;
    }

    boolean this_present_updateTime = true;
    boolean that_present_updateTime = true;
    if (this_present_updateTime || that_present_updateTime) {
      if (!(this_present_updateTime && that_present_updateTime))
        return false;
      if (this.updateTime != that.updateTime)
        return false;
    }

    boolean this_present_upPicLimitCount = true;
    boolean that_present_upPicLimitCount = true;
    if (this_present_upPicLimitCount || that_present_upPicLimitCount) {
      if (!(this_present_upPicLimitCount && that_present_upPicLimitCount))
        return false;
      if (this.upPicLimitCount != that.upPicLimitCount)
        return false;
    }

    boolean this_present_giftLimitCount = true;
    boolean that_present_giftLimitCount = true;
    if (this_present_giftLimitCount || that_present_giftLimitCount) {
      if (!(this_present_giftLimitCount && that_present_giftLimitCount))
        return false;
      if (this.giftLimitCount != that.giftLimitCount)
        return false;
    }

    boolean this_present_lastUpdateTime = true;
    boolean that_present_lastUpdateTime = true;
    if (this_present_lastUpdateTime || that_present_lastUpdateTime) {
      if (!(this_present_lastUpdateTime && that_present_lastUpdateTime))
        return false;
      if (this.lastUpdateTime != that.lastUpdateTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(DeviceTokenInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DeviceTokenInfo typedOther = (DeviceTokenInfo)other;

    lastComparison = Boolean.valueOf(isSetDeviceToken()).compareTo(typedOther.isSetDeviceToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deviceToken, typedOther.deviceToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateTime()).compareTo(typedOther.isSetUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, typedOther.updateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpPicLimitCount()).compareTo(typedOther.isSetUpPicLimitCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpPicLimitCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.upPicLimitCount, typedOther.upPicLimitCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGiftLimitCount()).compareTo(typedOther.isSetGiftLimitCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGiftLimitCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.giftLimitCount, typedOther.giftLimitCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastUpdateTime()).compareTo(typedOther.isSetLastUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastUpdateTime, typedOther.lastUpdateTime);
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
    StringBuilder sb = new StringBuilder("DeviceTokenInfo(");
    boolean first = true;

    sb.append("deviceToken:");
    if (this.deviceToken == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateTime:");
    sb.append(this.updateTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("upPicLimitCount:");
    sb.append(this.upPicLimitCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("giftLimitCount:");
    sb.append(this.giftLimitCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastUpdateTime:");
    sb.append(this.lastUpdateTime);
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

  private static class DeviceTokenInfoStandardSchemeFactory implements SchemeFactory {
    public DeviceTokenInfoStandardScheme getScheme() {
      return new DeviceTokenInfoStandardScheme();
    }
  }

  private static class DeviceTokenInfoStandardScheme extends StandardScheme<DeviceTokenInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeviceTokenInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVICE_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deviceToken = iprot.readString();
              struct.setDeviceTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updateTime = iprot.readI64();
              struct.setUpdateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UP_PIC_LIMIT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.upPicLimitCount = iprot.readByte();
              struct.setUpPicLimitCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GIFT_LIMIT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.giftLimitCount = iprot.readByte();
              struct.setGiftLimitCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastUpdateTime = iprot.readI64();
              struct.setLastUpdateTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeviceTokenInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.deviceToken != null) {
        oprot.writeFieldBegin(DEVICE_TOKEN_FIELD_DESC);
        oprot.writeString(struct.deviceToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
      oprot.writeI64(struct.updateTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UP_PIC_LIMIT_COUNT_FIELD_DESC);
      oprot.writeByte(struct.upPicLimitCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GIFT_LIMIT_COUNT_FIELD_DESC);
      oprot.writeByte(struct.giftLimitCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_UPDATE_TIME_FIELD_DESC);
      oprot.writeI64(struct.lastUpdateTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeviceTokenInfoTupleSchemeFactory implements SchemeFactory {
    public DeviceTokenInfoTupleScheme getScheme() {
      return new DeviceTokenInfoTupleScheme();
    }
  }

  private static class DeviceTokenInfoTupleScheme extends TupleScheme<DeviceTokenInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeviceTokenInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDeviceToken()) {
        optionals.set(0);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(1);
      }
      if (struct.isSetUpPicLimitCount()) {
        optionals.set(2);
      }
      if (struct.isSetGiftLimitCount()) {
        optionals.set(3);
      }
      if (struct.isSetLastUpdateTime()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetDeviceToken()) {
        oprot.writeString(struct.deviceToken);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeI64(struct.updateTime);
      }
      if (struct.isSetUpPicLimitCount()) {
        oprot.writeByte(struct.upPicLimitCount);
      }
      if (struct.isSetGiftLimitCount()) {
        oprot.writeByte(struct.giftLimitCount);
      }
      if (struct.isSetLastUpdateTime()) {
        oprot.writeI64(struct.lastUpdateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeviceTokenInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.deviceToken = iprot.readString();
        struct.setDeviceTokenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.updateTime = iprot.readI64();
        struct.setUpdateTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.upPicLimitCount = iprot.readByte();
        struct.setUpPicLimitCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.giftLimitCount = iprot.readByte();
        struct.setGiftLimitCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.lastUpdateTime = iprot.readI64();
        struct.setLastUpdateTimeIsSet(true);
      }
    }
  }

}

