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

public class CSGetRewardByMailMsg implements org.apache.thrift.TBase<CSGetRewardByMailMsg, CSGetRewardByMailMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSGetRewardByMailMsg");

  private static final org.apache.thrift.protocol.TField MAIL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("mailId", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSGetRewardByMailMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSGetRewardByMailMsgTupleSchemeFactory());
  }

  public long mailId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAIL_ID((short)1, "mailId");

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
        case 1: // MAIL_ID
          return MAIL_ID;
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
  private static final int __MAILID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAIL_ID, new org.apache.thrift.meta_data.FieldMetaData("mailId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSGetRewardByMailMsg.class, metaDataMap);
  }

  public CSGetRewardByMailMsg() {
  }

  public CSGetRewardByMailMsg(
    long mailId)
  {
    this();
    this.mailId = mailId;
    setMailIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSGetRewardByMailMsg(CSGetRewardByMailMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.mailId = other.mailId;
  }

  public CSGetRewardByMailMsg deepCopy() {
    return new CSGetRewardByMailMsg(this);
  }

  @Override
  public void clear() {
    setMailIdIsSet(false);
    this.mailId = 0;
  }

  public long getMailId() {
    return this.mailId;
  }

  public CSGetRewardByMailMsg setMailId(long mailId) {
    this.mailId = mailId;
    setMailIdIsSet(true);
    return this;
  }

  public void unsetMailId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAILID_ISSET_ID);
  }

  /** Returns true if field mailId is set (has been assigned a value) and false otherwise */
  public boolean isSetMailId() {
    return EncodingUtils.testBit(__isset_bitfield, __MAILID_ISSET_ID);
  }

  public void setMailIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAILID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAIL_ID:
      if (value == null) {
        unsetMailId();
      } else {
        setMailId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAIL_ID:
      return Long.valueOf(getMailId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAIL_ID:
      return isSetMailId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSGetRewardByMailMsg)
      return this.equals((CSGetRewardByMailMsg)that);
    return false;
  }

  public boolean equals(CSGetRewardByMailMsg that) {
    if (that == null)
      return false;

    boolean this_present_mailId = true;
    boolean that_present_mailId = true;
    if (this_present_mailId || that_present_mailId) {
      if (!(this_present_mailId && that_present_mailId))
        return false;
      if (this.mailId != that.mailId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSGetRewardByMailMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSGetRewardByMailMsg typedOther = (CSGetRewardByMailMsg)other;

    lastComparison = Boolean.valueOf(isSetMailId()).compareTo(typedOther.isSetMailId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMailId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mailId, typedOther.mailId);
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
    StringBuilder sb = new StringBuilder("CSGetRewardByMailMsg(");
    boolean first = true;

    sb.append("mailId:");
    sb.append(this.mailId);
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

  private static class CSGetRewardByMailMsgStandardSchemeFactory implements SchemeFactory {
    public CSGetRewardByMailMsgStandardScheme getScheme() {
      return new CSGetRewardByMailMsgStandardScheme();
    }
  }

  private static class CSGetRewardByMailMsgStandardScheme extends StandardScheme<CSGetRewardByMailMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSGetRewardByMailMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAIL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.mailId = iprot.readI64();
              struct.setMailIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSGetRewardByMailMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAIL_ID_FIELD_DESC);
      oprot.writeI64(struct.mailId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSGetRewardByMailMsgTupleSchemeFactory implements SchemeFactory {
    public CSGetRewardByMailMsgTupleScheme getScheme() {
      return new CSGetRewardByMailMsgTupleScheme();
    }
  }

  private static class CSGetRewardByMailMsgTupleScheme extends TupleScheme<CSGetRewardByMailMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSGetRewardByMailMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMailId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMailId()) {
        oprot.writeI64(struct.mailId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSGetRewardByMailMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.mailId = iprot.readI64();
        struct.setMailIdIsSet(true);
      }
    }
  }

}

