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

public class CSSendVoiceMailMsg implements org.apache.thrift.TBase<CSSendVoiceMailMsg, CSSendVoiceMailMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSSendVoiceMailMsg");

  private static final org.apache.thrift.protocol.TField RECEIVE_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("receiveCharId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VOICE_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("voiceKey", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSSendVoiceMailMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSSendVoiceMailMsgTupleSchemeFactory());
  }

  public long receiveCharId; // required
  public String voiceKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECEIVE_CHAR_ID((short)1, "receiveCharId"),
    VOICE_KEY((short)2, "voiceKey");

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
        case 1: // RECEIVE_CHAR_ID
          return RECEIVE_CHAR_ID;
        case 2: // VOICE_KEY
          return VOICE_KEY;
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
  private static final int __RECEIVECHARID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECEIVE_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("receiveCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VOICE_KEY, new org.apache.thrift.meta_data.FieldMetaData("voiceKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSSendVoiceMailMsg.class, metaDataMap);
  }

  public CSSendVoiceMailMsg() {
  }

  public CSSendVoiceMailMsg(
    long receiveCharId,
    String voiceKey)
  {
    this();
    this.receiveCharId = receiveCharId;
    setReceiveCharIdIsSet(true);
    this.voiceKey = voiceKey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSSendVoiceMailMsg(CSSendVoiceMailMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.receiveCharId = other.receiveCharId;
    if (other.isSetVoiceKey()) {
      this.voiceKey = other.voiceKey;
    }
  }

  public CSSendVoiceMailMsg deepCopy() {
    return new CSSendVoiceMailMsg(this);
  }

  @Override
  public void clear() {
    setReceiveCharIdIsSet(false);
    this.receiveCharId = 0;
    this.voiceKey = null;
  }

  public long getReceiveCharId() {
    return this.receiveCharId;
  }

  public CSSendVoiceMailMsg setReceiveCharId(long receiveCharId) {
    this.receiveCharId = receiveCharId;
    setReceiveCharIdIsSet(true);
    return this;
  }

  public void unsetReceiveCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECEIVECHARID_ISSET_ID);
  }

  /** Returns true if field receiveCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiveCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __RECEIVECHARID_ISSET_ID);
  }

  public void setReceiveCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECEIVECHARID_ISSET_ID, value);
  }

  public String getVoiceKey() {
    return this.voiceKey;
  }

  public CSSendVoiceMailMsg setVoiceKey(String voiceKey) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECEIVE_CHAR_ID:
      if (value == null) {
        unsetReceiveCharId();
      } else {
        setReceiveCharId((Long)value);
      }
      break;

    case VOICE_KEY:
      if (value == null) {
        unsetVoiceKey();
      } else {
        setVoiceKey((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECEIVE_CHAR_ID:
      return Long.valueOf(getReceiveCharId());

    case VOICE_KEY:
      return getVoiceKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECEIVE_CHAR_ID:
      return isSetReceiveCharId();
    case VOICE_KEY:
      return isSetVoiceKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSSendVoiceMailMsg)
      return this.equals((CSSendVoiceMailMsg)that);
    return false;
  }

  public boolean equals(CSSendVoiceMailMsg that) {
    if (that == null)
      return false;

    boolean this_present_receiveCharId = true;
    boolean that_present_receiveCharId = true;
    if (this_present_receiveCharId || that_present_receiveCharId) {
      if (!(this_present_receiveCharId && that_present_receiveCharId))
        return false;
      if (this.receiveCharId != that.receiveCharId)
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

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSSendVoiceMailMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSSendVoiceMailMsg typedOther = (CSSendVoiceMailMsg)other;

    lastComparison = Boolean.valueOf(isSetReceiveCharId()).compareTo(typedOther.isSetReceiveCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiveCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiveCharId, typedOther.receiveCharId);
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
    StringBuilder sb = new StringBuilder("CSSendVoiceMailMsg(");
    boolean first = true;

    sb.append("receiveCharId:");
    sb.append(this.receiveCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("voiceKey:");
    if (this.voiceKey == null) {
      sb.append("null");
    } else {
      sb.append(this.voiceKey);
    }
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

  private static class CSSendVoiceMailMsgStandardSchemeFactory implements SchemeFactory {
    public CSSendVoiceMailMsgStandardScheme getScheme() {
      return new CSSendVoiceMailMsgStandardScheme();
    }
  }

  private static class CSSendVoiceMailMsgStandardScheme extends StandardScheme<CSSendVoiceMailMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSSendVoiceMailMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECEIVE_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.receiveCharId = iprot.readI64();
              struct.setReceiveCharIdIsSet(true);
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSSendVoiceMailMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RECEIVE_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.receiveCharId);
      oprot.writeFieldEnd();
      if (struct.voiceKey != null) {
        oprot.writeFieldBegin(VOICE_KEY_FIELD_DESC);
        oprot.writeString(struct.voiceKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSSendVoiceMailMsgTupleSchemeFactory implements SchemeFactory {
    public CSSendVoiceMailMsgTupleScheme getScheme() {
      return new CSSendVoiceMailMsgTupleScheme();
    }
  }

  private static class CSSendVoiceMailMsgTupleScheme extends TupleScheme<CSSendVoiceMailMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSSendVoiceMailMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReceiveCharId()) {
        optionals.set(0);
      }
      if (struct.isSetVoiceKey()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReceiveCharId()) {
        oprot.writeI64(struct.receiveCharId);
      }
      if (struct.isSetVoiceKey()) {
        oprot.writeString(struct.voiceKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSSendVoiceMailMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.receiveCharId = iprot.readI64();
        struct.setReceiveCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.voiceKey = iprot.readString();
        struct.setVoiceKeyIsSet(true);
      }
    }
  }

}
