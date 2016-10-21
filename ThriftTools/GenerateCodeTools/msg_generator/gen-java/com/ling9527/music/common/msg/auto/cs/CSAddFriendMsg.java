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
 * 通过charId来添加好友
 */
public class CSAddFriendMsg implements org.apache.thrift.TBase<CSAddFriendMsg, CSAddFriendMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSAddFriendMsg");

  private static final org.apache.thrift.protocol.TField FRIEND_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("friendCharId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.BYTE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSAddFriendMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSAddFriendMsgTupleSchemeFactory());
  }

  /**
   * 添加好友id
   */
  public long friendCharId; // required
  public byte source; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 添加好友id
     */
    FRIEND_CHAR_ID((short)1, "friendCharId"),
    SOURCE((short)2, "source");

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
        case 1: // FRIEND_CHAR_ID
          return FRIEND_CHAR_ID;
        case 2: // SOURCE
          return SOURCE;
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
  private static final int __FRIENDCHARID_ISSET_ID = 0;
  private static final int __SOURCE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRIEND_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("friendCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSAddFriendMsg.class, metaDataMap);
  }

  public CSAddFriendMsg() {
  }

  public CSAddFriendMsg(
    long friendCharId,
    byte source)
  {
    this();
    this.friendCharId = friendCharId;
    setFriendCharIdIsSet(true);
    this.source = source;
    setSourceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSAddFriendMsg(CSAddFriendMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.friendCharId = other.friendCharId;
    this.source = other.source;
  }

  public CSAddFriendMsg deepCopy() {
    return new CSAddFriendMsg(this);
  }

  @Override
  public void clear() {
    setFriendCharIdIsSet(false);
    this.friendCharId = 0;
    setSourceIsSet(false);
    this.source = 0;
  }

  /**
   * 添加好友id
   */
  public long getFriendCharId() {
    return this.friendCharId;
  }

  /**
   * 添加好友id
   */
  public CSAddFriendMsg setFriendCharId(long friendCharId) {
    this.friendCharId = friendCharId;
    setFriendCharIdIsSet(true);
    return this;
  }

  public void unsetFriendCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FRIENDCHARID_ISSET_ID);
  }

  /** Returns true if field friendCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __FRIENDCHARID_ISSET_ID);
  }

  public void setFriendCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FRIENDCHARID_ISSET_ID, value);
  }

  public byte getSource() {
    return this.source;
  }

  public CSAddFriendMsg setSource(byte source) {
    this.source = source;
    setSourceIsSet(true);
    return this;
  }

  public void unsetSource() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SOURCE_ISSET_ID);
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return EncodingUtils.testBit(__isset_bitfield, __SOURCE_ISSET_ID);
  }

  public void setSourceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SOURCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRIEND_CHAR_ID:
      if (value == null) {
        unsetFriendCharId();
      } else {
        setFriendCharId((Long)value);
      }
      break;

    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRIEND_CHAR_ID:
      return Long.valueOf(getFriendCharId());

    case SOURCE:
      return Byte.valueOf(getSource());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRIEND_CHAR_ID:
      return isSetFriendCharId();
    case SOURCE:
      return isSetSource();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSAddFriendMsg)
      return this.equals((CSAddFriendMsg)that);
    return false;
  }

  public boolean equals(CSAddFriendMsg that) {
    if (that == null)
      return false;

    boolean this_present_friendCharId = true;
    boolean that_present_friendCharId = true;
    if (this_present_friendCharId || that_present_friendCharId) {
      if (!(this_present_friendCharId && that_present_friendCharId))
        return false;
      if (this.friendCharId != that.friendCharId)
        return false;
    }

    boolean this_present_source = true;
    boolean that_present_source = true;
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (this.source != that.source)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSAddFriendMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSAddFriendMsg typedOther = (CSAddFriendMsg)other;

    lastComparison = Boolean.valueOf(isSetFriendCharId()).compareTo(typedOther.isSetFriendCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendCharId, typedOther.friendCharId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSource()).compareTo(typedOther.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, typedOther.source);
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
    StringBuilder sb = new StringBuilder("CSAddFriendMsg(");
    boolean first = true;

    sb.append("friendCharId:");
    sb.append(this.friendCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("source:");
    sb.append(this.source);
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

  private static class CSAddFriendMsgStandardSchemeFactory implements SchemeFactory {
    public CSAddFriendMsgStandardScheme getScheme() {
      return new CSAddFriendMsgStandardScheme();
    }
  }

  private static class CSAddFriendMsgStandardScheme extends StandardScheme<CSAddFriendMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSAddFriendMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRIEND_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.friendCharId = iprot.readI64();
              struct.setFriendCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.source = iprot.readByte();
              struct.setSourceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSAddFriendMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FRIEND_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.friendCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SOURCE_FIELD_DESC);
      oprot.writeByte(struct.source);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSAddFriendMsgTupleSchemeFactory implements SchemeFactory {
    public CSAddFriendMsgTupleScheme getScheme() {
      return new CSAddFriendMsgTupleScheme();
    }
  }

  private static class CSAddFriendMsgTupleScheme extends TupleScheme<CSAddFriendMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSAddFriendMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFriendCharId()) {
        optionals.set(0);
      }
      if (struct.isSetSource()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFriendCharId()) {
        oprot.writeI64(struct.friendCharId);
      }
      if (struct.isSetSource()) {
        oprot.writeByte(struct.source);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSAddFriendMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.friendCharId = iprot.readI64();
        struct.setFriendCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.source = iprot.readByte();
        struct.setSourceIsSet(true);
      }
    }
  }

}

