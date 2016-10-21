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
 * 成为情侣结果
 */
public class SCBeLoversResultMsg implements org.apache.thrift.TBase<SCBeLoversResultMsg, SCBeLoversResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCBeLoversResultMsg");

  private static final org.apache.thrift.protocol.TField INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("info", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.BYTE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCBeLoversResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCBeLoversResultMsgTupleSchemeFactory());
  }

  public com.ling9527.music.common.msg.auto.CloseFriendInfo info; // required
  public String name; // required
  /**
   * 1-同意 2-拒绝
   */
  public byte result; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INFO((short)1, "info"),
    NAME((short)2, "name"),
    /**
     * 1-同意 2-拒绝
     */
    RESULT((short)3, "result");

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
        case 1: // INFO
          return INFO;
        case 2: // NAME
          return NAME;
        case 3: // RESULT
          return RESULT;
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
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INFO, new org.apache.thrift.meta_data.FieldMetaData("info", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.CloseFriendInfo.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCBeLoversResultMsg.class, metaDataMap);
  }

  public SCBeLoversResultMsg() {
  }

  public SCBeLoversResultMsg(
    com.ling9527.music.common.msg.auto.CloseFriendInfo info,
    String name,
    byte result)
  {
    this();
    this.info = info;
    this.name = name;
    this.result = result;
    setResultIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCBeLoversResultMsg(SCBeLoversResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetInfo()) {
      this.info = new com.ling9527.music.common.msg.auto.CloseFriendInfo(other.info);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.result = other.result;
  }

  public SCBeLoversResultMsg deepCopy() {
    return new SCBeLoversResultMsg(this);
  }

  @Override
  public void clear() {
    this.info = null;
    this.name = null;
    setResultIsSet(false);
    this.result = 0;
  }

  public com.ling9527.music.common.msg.auto.CloseFriendInfo getInfo() {
    return this.info;
  }

  public SCBeLoversResultMsg setInfo(com.ling9527.music.common.msg.auto.CloseFriendInfo info) {
    this.info = info;
    return this;
  }

  public void unsetInfo() {
    this.info = null;
  }

  /** Returns true if field info is set (has been assigned a value) and false otherwise */
  public boolean isSetInfo() {
    return this.info != null;
  }

  public void setInfoIsSet(boolean value) {
    if (!value) {
      this.info = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public SCBeLoversResultMsg setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 1-同意 2-拒绝
   */
  public byte getResult() {
    return this.result;
  }

  /**
   * 1-同意 2-拒绝
   */
  public SCBeLoversResultMsg setResult(byte result) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INFO:
      if (value == null) {
        unsetInfo();
      } else {
        setInfo((com.ling9527.music.common.msg.auto.CloseFriendInfo)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INFO:
      return getInfo();

    case NAME:
      return getName();

    case RESULT:
      return Byte.valueOf(getResult());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INFO:
      return isSetInfo();
    case NAME:
      return isSetName();
    case RESULT:
      return isSetResult();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCBeLoversResultMsg)
      return this.equals((SCBeLoversResultMsg)that);
    return false;
  }

  public boolean equals(SCBeLoversResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_info = true && this.isSetInfo();
    boolean that_present_info = true && that.isSetInfo();
    if (this_present_info || that_present_info) {
      if (!(this_present_info && that_present_info))
        return false;
      if (!this.info.equals(that.info))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_result = true;
    boolean that_present_result = true;
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (this.result != that.result)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCBeLoversResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCBeLoversResultMsg typedOther = (SCBeLoversResultMsg)other;

    lastComparison = Boolean.valueOf(isSetInfo()).compareTo(typedOther.isSetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.info, typedOther.info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("SCBeLoversResultMsg(");
    boolean first = true;

    sb.append("info:");
    if (this.info == null) {
      sb.append("null");
    } else {
      sb.append(this.info);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("result:");
    sb.append(this.result);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (info != null) {
      info.validate();
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

  private static class SCBeLoversResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCBeLoversResultMsgStandardScheme getScheme() {
      return new SCBeLoversResultMsgStandardScheme();
    }
  }

  private static class SCBeLoversResultMsgStandardScheme extends StandardScheme<SCBeLoversResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCBeLoversResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.info = new com.ling9527.music.common.msg.auto.CloseFriendInfo();
              struct.info.read(iprot);
              struct.setInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.result = iprot.readByte();
              struct.setResultIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCBeLoversResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.info != null) {
        oprot.writeFieldBegin(INFO_FIELD_DESC);
        struct.info.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeByte(struct.result);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCBeLoversResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCBeLoversResultMsgTupleScheme getScheme() {
      return new SCBeLoversResultMsgTupleScheme();
    }
  }

  private static class SCBeLoversResultMsgTupleScheme extends TupleScheme<SCBeLoversResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCBeLoversResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInfo()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetResult()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetInfo()) {
        struct.info.write(oprot);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetResult()) {
        oprot.writeByte(struct.result);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCBeLoversResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.info = new com.ling9527.music.common.msg.auto.CloseFriendInfo();
        struct.info.read(iprot);
        struct.setInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.result = iprot.readByte();
        struct.setResultIsSet(true);
      }
    }
  }

}

