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

public class SCDonateOkMsg implements org.apache.thrift.TBase<SCDonateOkMsg, SCDonateOkMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCDonateOkMsg");

  private static final org.apache.thrift.protocol.TField DONATE_FIELD_DESC = new org.apache.thrift.protocol.TField("donate", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCDonateOkMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCDonateOkMsgTupleSchemeFactory());
  }

  public com.ling9527.music.common.msg.auto.Donate donate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DONATE((short)1, "donate");

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
        case 1: // DONATE
          return DONATE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DONATE, new org.apache.thrift.meta_data.FieldMetaData("donate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.Donate.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCDonateOkMsg.class, metaDataMap);
  }

  public SCDonateOkMsg() {
  }

  public SCDonateOkMsg(
    com.ling9527.music.common.msg.auto.Donate donate)
  {
    this();
    this.donate = donate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCDonateOkMsg(SCDonateOkMsg other) {
    if (other.isSetDonate()) {
      this.donate = new com.ling9527.music.common.msg.auto.Donate(other.donate);
    }
  }

  public SCDonateOkMsg deepCopy() {
    return new SCDonateOkMsg(this);
  }

  @Override
  public void clear() {
    this.donate = null;
  }

  public com.ling9527.music.common.msg.auto.Donate getDonate() {
    return this.donate;
  }

  public SCDonateOkMsg setDonate(com.ling9527.music.common.msg.auto.Donate donate) {
    this.donate = donate;
    return this;
  }

  public void unsetDonate() {
    this.donate = null;
  }

  /** Returns true if field donate is set (has been assigned a value) and false otherwise */
  public boolean isSetDonate() {
    return this.donate != null;
  }

  public void setDonateIsSet(boolean value) {
    if (!value) {
      this.donate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DONATE:
      if (value == null) {
        unsetDonate();
      } else {
        setDonate((com.ling9527.music.common.msg.auto.Donate)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DONATE:
      return getDonate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DONATE:
      return isSetDonate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCDonateOkMsg)
      return this.equals((SCDonateOkMsg)that);
    return false;
  }

  public boolean equals(SCDonateOkMsg that) {
    if (that == null)
      return false;

    boolean this_present_donate = true && this.isSetDonate();
    boolean that_present_donate = true && that.isSetDonate();
    if (this_present_donate || that_present_donate) {
      if (!(this_present_donate && that_present_donate))
        return false;
      if (!this.donate.equals(that.donate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCDonateOkMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCDonateOkMsg typedOther = (SCDonateOkMsg)other;

    lastComparison = Boolean.valueOf(isSetDonate()).compareTo(typedOther.isSetDonate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDonate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.donate, typedOther.donate);
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
    StringBuilder sb = new StringBuilder("SCDonateOkMsg(");
    boolean first = true;

    sb.append("donate:");
    if (this.donate == null) {
      sb.append("null");
    } else {
      sb.append(this.donate);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (donate != null) {
      donate.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCDonateOkMsgStandardSchemeFactory implements SchemeFactory {
    public SCDonateOkMsgStandardScheme getScheme() {
      return new SCDonateOkMsgStandardScheme();
    }
  }

  private static class SCDonateOkMsgStandardScheme extends StandardScheme<SCDonateOkMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCDonateOkMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DONATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.donate = new com.ling9527.music.common.msg.auto.Donate();
              struct.donate.read(iprot);
              struct.setDonateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCDonateOkMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.donate != null) {
        oprot.writeFieldBegin(DONATE_FIELD_DESC);
        struct.donate.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCDonateOkMsgTupleSchemeFactory implements SchemeFactory {
    public SCDonateOkMsgTupleScheme getScheme() {
      return new SCDonateOkMsgTupleScheme();
    }
  }

  private static class SCDonateOkMsgTupleScheme extends TupleScheme<SCDonateOkMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCDonateOkMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDonate()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDonate()) {
        struct.donate.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCDonateOkMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.donate = new com.ling9527.music.common.msg.auto.Donate();
        struct.donate.read(iprot);
        struct.setDonateIsSet(true);
      }
    }
  }

}

