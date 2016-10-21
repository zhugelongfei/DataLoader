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

public class CSQueryMallVersionMsg implements org.apache.thrift.TBase<CSQueryMallVersionMsg, CSQueryMallVersionMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSQueryMallVersionMsg");

  private static final org.apache.thrift.protocol.TField IS_LIMIT_MALL_FIELD_DESC = new org.apache.thrift.protocol.TField("isLimitMall", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSQueryMallVersionMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSQueryMallVersionMsgTupleSchemeFactory());
  }

  /**
   * 是否限时商城
   */
  public boolean isLimitMall; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 是否限时商城
     */
    IS_LIMIT_MALL((short)1, "isLimitMall");

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
        case 1: // IS_LIMIT_MALL
          return IS_LIMIT_MALL;
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
  private static final int __ISLIMITMALL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.IS_LIMIT_MALL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_LIMIT_MALL, new org.apache.thrift.meta_data.FieldMetaData("isLimitMall", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSQueryMallVersionMsg.class, metaDataMap);
  }

  public CSQueryMallVersionMsg() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSQueryMallVersionMsg(CSQueryMallVersionMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isLimitMall = other.isLimitMall;
  }

  public CSQueryMallVersionMsg deepCopy() {
    return new CSQueryMallVersionMsg(this);
  }

  @Override
  public void clear() {
    setIsLimitMallIsSet(false);
    this.isLimitMall = false;
  }

  /**
   * 是否限时商城
   */
  public boolean isIsLimitMall() {
    return this.isLimitMall;
  }

  /**
   * 是否限时商城
   */
  public CSQueryMallVersionMsg setIsLimitMall(boolean isLimitMall) {
    this.isLimitMall = isLimitMall;
    setIsLimitMallIsSet(true);
    return this;
  }

  public void unsetIsLimitMall() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID);
  }

  /** Returns true if field isLimitMall is set (has been assigned a value) and false otherwise */
  public boolean isSetIsLimitMall() {
    return EncodingUtils.testBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID);
  }

  public void setIsLimitMallIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_LIMIT_MALL:
      if (value == null) {
        unsetIsLimitMall();
      } else {
        setIsLimitMall((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_LIMIT_MALL:
      return Boolean.valueOf(isIsLimitMall());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_LIMIT_MALL:
      return isSetIsLimitMall();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSQueryMallVersionMsg)
      return this.equals((CSQueryMallVersionMsg)that);
    return false;
  }

  public boolean equals(CSQueryMallVersionMsg that) {
    if (that == null)
      return false;

    boolean this_present_isLimitMall = true && this.isSetIsLimitMall();
    boolean that_present_isLimitMall = true && that.isSetIsLimitMall();
    if (this_present_isLimitMall || that_present_isLimitMall) {
      if (!(this_present_isLimitMall && that_present_isLimitMall))
        return false;
      if (this.isLimitMall != that.isLimitMall)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSQueryMallVersionMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSQueryMallVersionMsg typedOther = (CSQueryMallVersionMsg)other;

    lastComparison = Boolean.valueOf(isSetIsLimitMall()).compareTo(typedOther.isSetIsLimitMall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsLimitMall()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isLimitMall, typedOther.isLimitMall);
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
    StringBuilder sb = new StringBuilder("CSQueryMallVersionMsg(");
    boolean first = true;

    if (isSetIsLimitMall()) {
      sb.append("isLimitMall:");
      sb.append(this.isLimitMall);
      first = false;
    }
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

  private static class CSQueryMallVersionMsgStandardSchemeFactory implements SchemeFactory {
    public CSQueryMallVersionMsgStandardScheme getScheme() {
      return new CSQueryMallVersionMsgStandardScheme();
    }
  }

  private static class CSQueryMallVersionMsgStandardScheme extends StandardScheme<CSQueryMallVersionMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSQueryMallVersionMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_LIMIT_MALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isLimitMall = iprot.readBool();
              struct.setIsLimitMallIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSQueryMallVersionMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetIsLimitMall()) {
        oprot.writeFieldBegin(IS_LIMIT_MALL_FIELD_DESC);
        oprot.writeBool(struct.isLimitMall);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSQueryMallVersionMsgTupleSchemeFactory implements SchemeFactory {
    public CSQueryMallVersionMsgTupleScheme getScheme() {
      return new CSQueryMallVersionMsgTupleScheme();
    }
  }

  private static class CSQueryMallVersionMsgTupleScheme extends TupleScheme<CSQueryMallVersionMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSQueryMallVersionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIsLimitMall()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIsLimitMall()) {
        oprot.writeBool(struct.isLimitMall);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSQueryMallVersionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.isLimitMall = iprot.readBool();
        struct.setIsLimitMallIsSet(true);
      }
    }
  }

}
