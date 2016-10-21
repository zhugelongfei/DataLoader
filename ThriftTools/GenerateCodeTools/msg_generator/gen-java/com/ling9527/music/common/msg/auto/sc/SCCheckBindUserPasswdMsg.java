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

public class SCCheckBindUserPasswdMsg implements org.apache.thrift.TBase<SCCheckBindUserPasswdMsg, SCCheckBindUserPasswdMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCCheckBindUserPasswdMsg");

  private static final org.apache.thrift.protocol.TField BIND_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("bindUserName", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCCheckBindUserPasswdMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCCheckBindUserPasswdMsgTupleSchemeFactory());
  }

  /**
   * quick login bind user name
   */
  public String bindUserName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * quick login bind user name
     */
    BIND_USER_NAME((short)1, "bindUserName");

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
        case 1: // BIND_USER_NAME
          return BIND_USER_NAME;
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
    tmpMap.put(_Fields.BIND_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("bindUserName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCCheckBindUserPasswdMsg.class, metaDataMap);
  }

  public SCCheckBindUserPasswdMsg() {
  }

  public SCCheckBindUserPasswdMsg(
    String bindUserName)
  {
    this();
    this.bindUserName = bindUserName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCCheckBindUserPasswdMsg(SCCheckBindUserPasswdMsg other) {
    if (other.isSetBindUserName()) {
      this.bindUserName = other.bindUserName;
    }
  }

  public SCCheckBindUserPasswdMsg deepCopy() {
    return new SCCheckBindUserPasswdMsg(this);
  }

  @Override
  public void clear() {
    this.bindUserName = null;
  }

  /**
   * quick login bind user name
   */
  public String getBindUserName() {
    return this.bindUserName;
  }

  /**
   * quick login bind user name
   */
  public SCCheckBindUserPasswdMsg setBindUserName(String bindUserName) {
    this.bindUserName = bindUserName;
    return this;
  }

  public void unsetBindUserName() {
    this.bindUserName = null;
  }

  /** Returns true if field bindUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetBindUserName() {
    return this.bindUserName != null;
  }

  public void setBindUserNameIsSet(boolean value) {
    if (!value) {
      this.bindUserName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BIND_USER_NAME:
      if (value == null) {
        unsetBindUserName();
      } else {
        setBindUserName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BIND_USER_NAME:
      return getBindUserName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BIND_USER_NAME:
      return isSetBindUserName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCCheckBindUserPasswdMsg)
      return this.equals((SCCheckBindUserPasswdMsg)that);
    return false;
  }

  public boolean equals(SCCheckBindUserPasswdMsg that) {
    if (that == null)
      return false;

    boolean this_present_bindUserName = true && this.isSetBindUserName();
    boolean that_present_bindUserName = true && that.isSetBindUserName();
    if (this_present_bindUserName || that_present_bindUserName) {
      if (!(this_present_bindUserName && that_present_bindUserName))
        return false;
      if (!this.bindUserName.equals(that.bindUserName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCCheckBindUserPasswdMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCCheckBindUserPasswdMsg typedOther = (SCCheckBindUserPasswdMsg)other;

    lastComparison = Boolean.valueOf(isSetBindUserName()).compareTo(typedOther.isSetBindUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBindUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bindUserName, typedOther.bindUserName);
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
    StringBuilder sb = new StringBuilder("SCCheckBindUserPasswdMsg(");
    boolean first = true;

    sb.append("bindUserName:");
    if (this.bindUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.bindUserName);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCCheckBindUserPasswdMsgStandardSchemeFactory implements SchemeFactory {
    public SCCheckBindUserPasswdMsgStandardScheme getScheme() {
      return new SCCheckBindUserPasswdMsgStandardScheme();
    }
  }

  private static class SCCheckBindUserPasswdMsgStandardScheme extends StandardScheme<SCCheckBindUserPasswdMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCCheckBindUserPasswdMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BIND_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.bindUserName = iprot.readString();
              struct.setBindUserNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCCheckBindUserPasswdMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bindUserName != null) {
        oprot.writeFieldBegin(BIND_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.bindUserName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCCheckBindUserPasswdMsgTupleSchemeFactory implements SchemeFactory {
    public SCCheckBindUserPasswdMsgTupleScheme getScheme() {
      return new SCCheckBindUserPasswdMsgTupleScheme();
    }
  }

  private static class SCCheckBindUserPasswdMsgTupleScheme extends TupleScheme<SCCheckBindUserPasswdMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCCheckBindUserPasswdMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBindUserName()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBindUserName()) {
        oprot.writeString(struct.bindUserName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCCheckBindUserPasswdMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.bindUserName = iprot.readString();
        struct.setBindUserNameIsSet(true);
      }
    }
  }

}

