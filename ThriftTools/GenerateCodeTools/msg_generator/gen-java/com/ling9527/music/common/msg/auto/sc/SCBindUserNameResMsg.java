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

public class SCBindUserNameResMsg implements org.apache.thrift.TBase<SCBindUserNameResMsg, SCBindUserNameResMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCBindUserNameResMsg");

  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField BIND_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("bindCharId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCBindUserNameResMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCBindUserNameResMsgTupleSchemeFactory());
  }

  /**
   * 0-fail 1-succ
   */
  public byte result; // required
  /**
   * 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail
   */
  public byte errorCode; // required
  public long bindCharId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 0-fail 1-succ
     */
    RESULT((short)1, "result"),
    /**
     * 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail
     */
    ERROR_CODE((short)2, "errorCode"),
    BIND_CHAR_ID((short)3, "bindCharId");

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
        case 1: // RESULT
          return RESULT;
        case 2: // ERROR_CODE
          return ERROR_CODE;
        case 3: // BIND_CHAR_ID
          return BIND_CHAR_ID;
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
  private static final int __RESULT_ISSET_ID = 0;
  private static final int __ERRORCODE_ISSET_ID = 1;
  private static final int __BINDCHARID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.BIND_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("bindCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCBindUserNameResMsg.class, metaDataMap);
  }

  public SCBindUserNameResMsg() {
  }

  public SCBindUserNameResMsg(
    byte result,
    byte errorCode,
    long bindCharId)
  {
    this();
    this.result = result;
    setResultIsSet(true);
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    this.bindCharId = bindCharId;
    setBindCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCBindUserNameResMsg(SCBindUserNameResMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.result = other.result;
    this.errorCode = other.errorCode;
    this.bindCharId = other.bindCharId;
  }

  public SCBindUserNameResMsg deepCopy() {
    return new SCBindUserNameResMsg(this);
  }

  @Override
  public void clear() {
    setResultIsSet(false);
    this.result = 0;
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    setBindCharIdIsSet(false);
    this.bindCharId = 0;
  }

  /**
   * 0-fail 1-succ
   */
  public byte getResult() {
    return this.result;
  }

  /**
   * 0-fail 1-succ
   */
  public SCBindUserNameResMsg setResult(byte result) {
    this.result = result;
    setResultIsSet(true);
    return this;
  }

  public void unsetResult() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return EncodingUtils.testBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  public void setResultIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESULT_ISSET_ID, value);
  }

  /**
   * 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail
   */
  public byte getErrorCode() {
    return this.errorCode;
  }

  /**
   * 0-ilegal uer 1-already bind 2-binded user has char 3-bind fail
   */
  public SCBindUserNameResMsg setErrorCode(byte errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    return this;
  }

  public void unsetErrorCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public long getBindCharId() {
    return this.bindCharId;
  }

  public SCBindUserNameResMsg setBindCharId(long bindCharId) {
    this.bindCharId = bindCharId;
    setBindCharIdIsSet(true);
    return this;
  }

  public void unsetBindCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BINDCHARID_ISSET_ID);
  }

  /** Returns true if field bindCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetBindCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __BINDCHARID_ISSET_ID);
  }

  public void setBindCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BINDCHARID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((Byte)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Byte)value);
      }
      break;

    case BIND_CHAR_ID:
      if (value == null) {
        unsetBindCharId();
      } else {
        setBindCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return Byte.valueOf(getResult());

    case ERROR_CODE:
      return Byte.valueOf(getErrorCode());

    case BIND_CHAR_ID:
      return Long.valueOf(getBindCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case ERROR_CODE:
      return isSetErrorCode();
    case BIND_CHAR_ID:
      return isSetBindCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCBindUserNameResMsg)
      return this.equals((SCBindUserNameResMsg)that);
    return false;
  }

  public boolean equals(SCBindUserNameResMsg that) {
    if (that == null)
      return false;

    boolean this_present_result = true;
    boolean that_present_result = true;
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (this.result != that.result)
        return false;
    }

    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_bindCharId = true;
    boolean that_present_bindCharId = true;
    if (this_present_bindCharId || that_present_bindCharId) {
      if (!(this_present_bindCharId && that_present_bindCharId))
        return false;
      if (this.bindCharId != that.bindCharId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCBindUserNameResMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCBindUserNameResMsg typedOther = (SCBindUserNameResMsg)other;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(typedOther.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, typedOther.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBindCharId()).compareTo(typedOther.isSetBindCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBindCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bindCharId, typedOther.bindCharId);
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
    StringBuilder sb = new StringBuilder("SCBindUserNameResMsg(");
    boolean first = true;

    sb.append("result:");
    sb.append(this.result);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bindCharId:");
    sb.append(this.bindCharId);
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

  private static class SCBindUserNameResMsgStandardSchemeFactory implements SchemeFactory {
    public SCBindUserNameResMsgStandardScheme getScheme() {
      return new SCBindUserNameResMsgStandardScheme();
    }
  }

  private static class SCBindUserNameResMsgStandardScheme extends StandardScheme<SCBindUserNameResMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCBindUserNameResMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.result = iprot.readByte();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.errorCode = iprot.readByte();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BIND_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.bindCharId = iprot.readI64();
              struct.setBindCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCBindUserNameResMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeByte(struct.result);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeByte(struct.errorCode);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BIND_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.bindCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCBindUserNameResMsgTupleSchemeFactory implements SchemeFactory {
    public SCBindUserNameResMsgTupleScheme getScheme() {
      return new SCBindUserNameResMsgTupleScheme();
    }
  }

  private static class SCBindUserNameResMsgTupleScheme extends TupleScheme<SCBindUserNameResMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCBindUserNameResMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResult()) {
        optionals.set(0);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(1);
      }
      if (struct.isSetBindCharId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetResult()) {
        oprot.writeByte(struct.result);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeByte(struct.errorCode);
      }
      if (struct.isSetBindCharId()) {
        oprot.writeI64(struct.bindCharId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCBindUserNameResMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.result = iprot.readByte();
        struct.setResultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errorCode = iprot.readByte();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bindCharId = iprot.readI64();
        struct.setBindCharIdIsSet(true);
      }
    }
  }

}

