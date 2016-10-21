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

public class SCPointOrderCheckMsg implements org.apache.thrift.TBase<SCPointOrderCheckMsg, SCPointOrderCheckMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCPointOrderCheckMsg");

  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCPointOrderCheckMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCPointOrderCheckMsgTupleSchemeFactory());
  }

  public byte result; // required
  public long orderId; // required
  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PointMallErrorCode
   */
  public com.ling9527.music.common.msg.auto.PointMallErrorCode errorCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT((short)1, "result"),
    ORDER_ID((short)2, "orderId"),
    /**
     * 
     * @see com.ling9527.music.common.msg.auto.PointMallErrorCode
     */
    ERROR_CODE((short)3, "errorCode");

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
        case 2: // ORDER_ID
          return ORDER_ID;
        case 3: // ERROR_CODE
          return ERROR_CODE;
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
  private static final int __ORDERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.PointMallErrorCode.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCPointOrderCheckMsg.class, metaDataMap);
  }

  public SCPointOrderCheckMsg() {
  }

  public SCPointOrderCheckMsg(
    byte result,
    long orderId,
    com.ling9527.music.common.msg.auto.PointMallErrorCode errorCode)
  {
    this();
    this.result = result;
    setResultIsSet(true);
    this.orderId = orderId;
    setOrderIdIsSet(true);
    this.errorCode = errorCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCPointOrderCheckMsg(SCPointOrderCheckMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.result = other.result;
    this.orderId = other.orderId;
    if (other.isSetErrorCode()) {
      this.errorCode = other.errorCode;
    }
  }

  public SCPointOrderCheckMsg deepCopy() {
    return new SCPointOrderCheckMsg(this);
  }

  @Override
  public void clear() {
    setResultIsSet(false);
    this.result = 0;
    setOrderIdIsSet(false);
    this.orderId = 0;
    this.errorCode = null;
  }

  public byte getResult() {
    return this.result;
  }

  public SCPointOrderCheckMsg setResult(byte result) {
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

  public long getOrderId() {
    return this.orderId;
  }

  public SCPointOrderCheckMsg setOrderId(long orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return EncodingUtils.testBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORDERID_ISSET_ID, value);
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PointMallErrorCode
   */
  public com.ling9527.music.common.msg.auto.PointMallErrorCode getErrorCode() {
    return this.errorCode;
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PointMallErrorCode
   */
  public SCPointOrderCheckMsg setErrorCode(com.ling9527.music.common.msg.auto.PointMallErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public void unsetErrorCode() {
    this.errorCode = null;
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return this.errorCode != null;
  }

  public void setErrorCodeIsSet(boolean value) {
    if (!value) {
      this.errorCode = null;
    }
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

    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((Long)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((com.ling9527.music.common.msg.auto.PointMallErrorCode)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return Byte.valueOf(getResult());

    case ORDER_ID:
      return Long.valueOf(getOrderId());

    case ERROR_CODE:
      return getErrorCode();

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
    case ORDER_ID:
      return isSetOrderId();
    case ERROR_CODE:
      return isSetErrorCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCPointOrderCheckMsg)
      return this.equals((SCPointOrderCheckMsg)that);
    return false;
  }

  public boolean equals(SCPointOrderCheckMsg that) {
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

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (!this.errorCode.equals(that.errorCode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCPointOrderCheckMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCPointOrderCheckMsg typedOther = (SCPointOrderCheckMsg)other;

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
    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(typedOther.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, typedOther.orderId);
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
    StringBuilder sb = new StringBuilder("SCPointOrderCheckMsg(");
    boolean first = true;

    sb.append("result:");
    sb.append(this.result);
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderId:");
    sb.append(this.orderId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorCode:");
    if (this.errorCode == null) {
      sb.append("null");
    } else {
      sb.append(this.errorCode);
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

  private static class SCPointOrderCheckMsgStandardSchemeFactory implements SchemeFactory {
    public SCPointOrderCheckMsgStandardScheme getScheme() {
      return new SCPointOrderCheckMsgStandardScheme();
    }
  }

  private static class SCPointOrderCheckMsgStandardScheme extends StandardScheme<SCPointOrderCheckMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCPointOrderCheckMsg struct) throws org.apache.thrift.TException {
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
          case 2: // ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.orderId = iprot.readI64();
              struct.setOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = com.ling9527.music.common.msg.auto.PointMallErrorCode.findByValue(iprot.readI32());
              struct.setErrorCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCPointOrderCheckMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeByte(struct.result);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeI64(struct.orderId);
      oprot.writeFieldEnd();
      if (struct.errorCode != null) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCPointOrderCheckMsgTupleSchemeFactory implements SchemeFactory {
    public SCPointOrderCheckMsgTupleScheme getScheme() {
      return new SCPointOrderCheckMsgTupleScheme();
    }
  }

  private static class SCPointOrderCheckMsgTupleScheme extends TupleScheme<SCPointOrderCheckMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCPointOrderCheckMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResult()) {
        optionals.set(0);
      }
      if (struct.isSetOrderId()) {
        optionals.set(1);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetResult()) {
        oprot.writeByte(struct.result);
      }
      if (struct.isSetOrderId()) {
        oprot.writeI64(struct.orderId);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCPointOrderCheckMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.result = iprot.readByte();
        struct.setResultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.orderId = iprot.readI64();
        struct.setOrderIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorCode = com.ling9527.music.common.msg.auto.PointMallErrorCode.findByValue(iprot.readI32());
        struct.setErrorCodeIsSet(true);
      }
    }
  }

}

