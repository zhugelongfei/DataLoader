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

public class VoiceMailInfo implements org.apache.thrift.TBase<VoiceMailInfo, VoiceMailInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("VoiceMailInfo");

  private static final org.apache.thrift.protocol.TField SEND_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sendCharId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VOICE_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("voiceKey", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEND_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("sendTime", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VoiceMailInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VoiceMailInfoTupleSchemeFactory());
  }

  public long sendCharId; // required
  public String voiceKey; // required
  /**
   * timestamp, accurate to seconds
   */
  public int sendTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEND_CHAR_ID((short)1, "sendCharId"),
    VOICE_KEY((short)2, "voiceKey"),
    /**
     * timestamp, accurate to seconds
     */
    SEND_TIME((short)3, "sendTime");

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
        case 1: // SEND_CHAR_ID
          return SEND_CHAR_ID;
        case 2: // VOICE_KEY
          return VOICE_KEY;
        case 3: // SEND_TIME
          return SEND_TIME;
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
  private static final int __SENDCHARID_ISSET_ID = 0;
  private static final int __SENDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEND_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("sendCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VOICE_KEY, new org.apache.thrift.meta_data.FieldMetaData("voiceKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEND_TIME, new org.apache.thrift.meta_data.FieldMetaData("sendTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(VoiceMailInfo.class, metaDataMap);
  }

  public VoiceMailInfo() {
  }

  public VoiceMailInfo(
    long sendCharId,
    String voiceKey,
    int sendTime)
  {
    this();
    this.sendCharId = sendCharId;
    setSendCharIdIsSet(true);
    this.voiceKey = voiceKey;
    this.sendTime = sendTime;
    setSendTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VoiceMailInfo(VoiceMailInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sendCharId = other.sendCharId;
    if (other.isSetVoiceKey()) {
      this.voiceKey = other.voiceKey;
    }
    this.sendTime = other.sendTime;
  }

  public VoiceMailInfo deepCopy() {
    return new VoiceMailInfo(this);
  }

  @Override
  public void clear() {
    setSendCharIdIsSet(false);
    this.sendCharId = 0;
    this.voiceKey = null;
    setSendTimeIsSet(false);
    this.sendTime = 0;
  }

  public long getSendCharId() {
    return this.sendCharId;
  }

  public VoiceMailInfo setSendCharId(long sendCharId) {
    this.sendCharId = sendCharId;
    setSendCharIdIsSet(true);
    return this;
  }

  public void unsetSendCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENDCHARID_ISSET_ID);
  }

  /** Returns true if field sendCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetSendCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __SENDCHARID_ISSET_ID);
  }

  public void setSendCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENDCHARID_ISSET_ID, value);
  }

  public String getVoiceKey() {
    return this.voiceKey;
  }

  public VoiceMailInfo setVoiceKey(String voiceKey) {
    this.voiceKey = voiceKey;
    return this;
  }

  public void unsetVoiceKey() {
    this.voiceKey = null;
  }

  /** Returns true if field voiceKey is set (has been assigned a value) and false otherwise */
  public boolean isSetVoiceKey() {
    return this.voiceKey != null;
  }

  public void setVoiceKeyIsSet(boolean value) {
    if (!value) {
      this.voiceKey = null;
    }
  }

  /**
   * timestamp, accurate to seconds
   */
  public int getSendTime() {
    return this.sendTime;
  }

  /**
   * timestamp, accurate to seconds
   */
  public VoiceMailInfo setSendTime(int sendTime) {
    this.sendTime = sendTime;
    setSendTimeIsSet(true);
    return this;
  }

  public void unsetSendTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENDTIME_ISSET_ID);
  }

  /** Returns true if field sendTime is set (has been assigned a value) and false otherwise */
  public boolean isSetSendTime() {
    return EncodingUtils.testBit(__isset_bitfield, __SENDTIME_ISSET_ID);
  }

  public void setSendTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENDTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SEND_CHAR_ID:
      if (value == null) {
        unsetSendCharId();
      } else {
        setSendCharId((Long)value);
      }
      break;

    case VOICE_KEY:
      if (value == null) {
        unsetVoiceKey();
      } else {
        setVoiceKey((String)value);
      }
      break;

    case SEND_TIME:
      if (value == null) {
        unsetSendTime();
      } else {
        setSendTime((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SEND_CHAR_ID:
      return Long.valueOf(getSendCharId());

    case VOICE_KEY:
      return getVoiceKey();

    case SEND_TIME:
      return Integer.valueOf(getSendTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SEND_CHAR_ID:
      return isSetSendCharId();
    case VOICE_KEY:
      return isSetVoiceKey();
    case SEND_TIME:
      return isSetSendTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VoiceMailInfo)
      return this.equals((VoiceMailInfo)that);
    return false;
  }

  public boolean equals(VoiceMailInfo that) {
    if (that == null)
      return false;

    boolean this_present_sendCharId = true;
    boolean that_present_sendCharId = true;
    if (this_present_sendCharId || that_present_sendCharId) {
      if (!(this_present_sendCharId && that_present_sendCharId))
        return false;
      if (this.sendCharId != that.sendCharId)
        return false;
    }

    boolean this_present_voiceKey = true && this.isSetVoiceKey();
    boolean that_present_voiceKey = true && that.isSetVoiceKey();
    if (this_present_voiceKey || that_present_voiceKey) {
      if (!(this_present_voiceKey && that_present_voiceKey))
        return false;
      if (!this.voiceKey.equals(that.voiceKey))
        return false;
    }

    boolean this_present_sendTime = true;
    boolean that_present_sendTime = true;
    if (this_present_sendTime || that_present_sendTime) {
      if (!(this_present_sendTime && that_present_sendTime))
        return false;
      if (this.sendTime != that.sendTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(VoiceMailInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    VoiceMailInfo typedOther = (VoiceMailInfo)other;

    lastComparison = Boolean.valueOf(isSetSendCharId()).compareTo(typedOther.isSetSendCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sendCharId, typedOther.sendCharId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVoiceKey()).compareTo(typedOther.isSetVoiceKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVoiceKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.voiceKey, typedOther.voiceKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSendTime()).compareTo(typedOther.isSetSendTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sendTime, typedOther.sendTime);
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
    StringBuilder sb = new StringBuilder("VoiceMailInfo(");
    boolean first = true;

    sb.append("sendCharId:");
    sb.append(this.sendCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("voiceKey:");
    if (this.voiceKey == null) {
      sb.append("null");
    } else {
      sb.append(this.voiceKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sendTime:");
    sb.append(this.sendTime);
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

  private static class VoiceMailInfoStandardSchemeFactory implements SchemeFactory {
    public VoiceMailInfoStandardScheme getScheme() {
      return new VoiceMailInfoStandardScheme();
    }
  }

  private static class VoiceMailInfoStandardScheme extends StandardScheme<VoiceMailInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, VoiceMailInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEND_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sendCharId = iprot.readI64();
              struct.setSendCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VOICE_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.voiceKey = iprot.readString();
              struct.setVoiceKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEND_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sendTime = iprot.readI32();
              struct.setSendTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, VoiceMailInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SEND_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.sendCharId);
      oprot.writeFieldEnd();
      if (struct.voiceKey != null) {
        oprot.writeFieldBegin(VOICE_KEY_FIELD_DESC);
        oprot.writeString(struct.voiceKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEND_TIME_FIELD_DESC);
      oprot.writeI32(struct.sendTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VoiceMailInfoTupleSchemeFactory implements SchemeFactory {
    public VoiceMailInfoTupleScheme getScheme() {
      return new VoiceMailInfoTupleScheme();
    }
  }

  private static class VoiceMailInfoTupleScheme extends TupleScheme<VoiceMailInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, VoiceMailInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSendCharId()) {
        optionals.set(0);
      }
      if (struct.isSetVoiceKey()) {
        optionals.set(1);
      }
      if (struct.isSetSendTime()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSendCharId()) {
        oprot.writeI64(struct.sendCharId);
      }
      if (struct.isSetVoiceKey()) {
        oprot.writeString(struct.voiceKey);
      }
      if (struct.isSetSendTime()) {
        oprot.writeI32(struct.sendTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, VoiceMailInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.sendCharId = iprot.readI64();
        struct.setSendCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.voiceKey = iprot.readString();
        struct.setVoiceKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sendTime = iprot.readI32();
        struct.setSendTimeIsSet(true);
      }
    }
  }

}

