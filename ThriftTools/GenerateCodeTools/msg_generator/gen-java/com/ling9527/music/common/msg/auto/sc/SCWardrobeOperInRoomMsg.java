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
 * 房间内衣橱开关操作
 */
public class SCWardrobeOperInRoomMsg implements org.apache.thrift.TBase<SCWardrobeOperInRoomMsg, SCWardrobeOperInRoomMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCWardrobeOperInRoomMsg");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField OPER_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operCharId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCWardrobeOperInRoomMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCWardrobeOperInRoomMsgTupleSchemeFactory());
  }

  /**
   * 0-关 1-开
   */
  public byte status; // required
  /**
   * 衣橱操作角色id
   */
  public long operCharId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 0-关 1-开
     */
    STATUS((short)1, "status"),
    /**
     * 衣橱操作角色id
     */
    OPER_CHAR_ID((short)2, "operCharId");

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
        case 1: // STATUS
          return STATUS;
        case 2: // OPER_CHAR_ID
          return OPER_CHAR_ID;
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
  private static final int __STATUS_ISSET_ID = 0;
  private static final int __OPERCHARID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.OPER_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("operCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCWardrobeOperInRoomMsg.class, metaDataMap);
  }

  public SCWardrobeOperInRoomMsg() {
  }

  public SCWardrobeOperInRoomMsg(
    byte status,
    long operCharId)
  {
    this();
    this.status = status;
    setStatusIsSet(true);
    this.operCharId = operCharId;
    setOperCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCWardrobeOperInRoomMsg(SCWardrobeOperInRoomMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.status = other.status;
    this.operCharId = other.operCharId;
  }

  public SCWardrobeOperInRoomMsg deepCopy() {
    return new SCWardrobeOperInRoomMsg(this);
  }

  @Override
  public void clear() {
    setStatusIsSet(false);
    this.status = 0;
    setOperCharIdIsSet(false);
    this.operCharId = 0;
  }

  /**
   * 0-关 1-开
   */
  public byte getStatus() {
    return this.status;
  }

  /**
   * 0-关 1-开
   */
  public SCWardrobeOperInRoomMsg setStatus(byte status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  /**
   * 衣橱操作角色id
   */
  public long getOperCharId() {
    return this.operCharId;
  }

  /**
   * 衣橱操作角色id
   */
  public SCWardrobeOperInRoomMsg setOperCharId(long operCharId) {
    this.operCharId = operCharId;
    setOperCharIdIsSet(true);
    return this;
  }

  public void unsetOperCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPERCHARID_ISSET_ID);
  }

  /** Returns true if field operCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __OPERCHARID_ISSET_ID);
  }

  public void setOperCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPERCHARID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Byte)value);
      }
      break;

    case OPER_CHAR_ID:
      if (value == null) {
        unsetOperCharId();
      } else {
        setOperCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return Byte.valueOf(getStatus());

    case OPER_CHAR_ID:
      return Long.valueOf(getOperCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case OPER_CHAR_ID:
      return isSetOperCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCWardrobeOperInRoomMsg)
      return this.equals((SCWardrobeOperInRoomMsg)that);
    return false;
  }

  public boolean equals(SCWardrobeOperInRoomMsg that) {
    if (that == null)
      return false;

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_operCharId = true;
    boolean that_present_operCharId = true;
    if (this_present_operCharId || that_present_operCharId) {
      if (!(this_present_operCharId && that_present_operCharId))
        return false;
      if (this.operCharId != that.operCharId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCWardrobeOperInRoomMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCWardrobeOperInRoomMsg typedOther = (SCWardrobeOperInRoomMsg)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperCharId()).compareTo(typedOther.isSetOperCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operCharId, typedOther.operCharId);
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
    StringBuilder sb = new StringBuilder("SCWardrobeOperInRoomMsg(");
    boolean first = true;

    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("operCharId:");
    sb.append(this.operCharId);
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

  private static class SCWardrobeOperInRoomMsgStandardSchemeFactory implements SchemeFactory {
    public SCWardrobeOperInRoomMsgStandardScheme getScheme() {
      return new SCWardrobeOperInRoomMsgStandardScheme();
    }
  }

  private static class SCWardrobeOperInRoomMsgStandardScheme extends StandardScheme<SCWardrobeOperInRoomMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCWardrobeOperInRoomMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.status = iprot.readByte();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPER_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.operCharId = iprot.readI64();
              struct.setOperCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCWardrobeOperInRoomMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeByte(struct.status);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OPER_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.operCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCWardrobeOperInRoomMsgTupleSchemeFactory implements SchemeFactory {
    public SCWardrobeOperInRoomMsgTupleScheme getScheme() {
      return new SCWardrobeOperInRoomMsgTupleScheme();
    }
  }

  private static class SCWardrobeOperInRoomMsgTupleScheme extends TupleScheme<SCWardrobeOperInRoomMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCWardrobeOperInRoomMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetOperCharId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStatus()) {
        oprot.writeByte(struct.status);
      }
      if (struct.isSetOperCharId()) {
        oprot.writeI64(struct.operCharId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCWardrobeOperInRoomMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.status = iprot.readByte();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operCharId = iprot.readI64();
        struct.setOperCharIdIsSet(true);
      }
    }
  }

}
