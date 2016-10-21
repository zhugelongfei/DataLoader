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

public class CSChannelAddictionMsg implements org.apache.thrift.TBase<CSChannelAddictionMsg, CSChannelAddictionMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSChannelAddictionMsg");

  private static final org.apache.thrift.protocol.TField IS_ADDICTION_FIELD_DESC = new org.apache.thrift.protocol.TField("isAddiction", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSChannelAddictionMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSChannelAddictionMsgTupleSchemeFactory());
  }

  public boolean isAddiction; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_ADDICTION((short)1, "isAddiction");

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
        case 1: // IS_ADDICTION
          return IS_ADDICTION;
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
  private static final int __ISADDICTION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_ADDICTION, new org.apache.thrift.meta_data.FieldMetaData("isAddiction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSChannelAddictionMsg.class, metaDataMap);
  }

  public CSChannelAddictionMsg() {
  }

  public CSChannelAddictionMsg(
    boolean isAddiction)
  {
    this();
    this.isAddiction = isAddiction;
    setIsAddictionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSChannelAddictionMsg(CSChannelAddictionMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isAddiction = other.isAddiction;
  }

  public CSChannelAddictionMsg deepCopy() {
    return new CSChannelAddictionMsg(this);
  }

  @Override
  public void clear() {
    setIsAddictionIsSet(false);
    this.isAddiction = false;
  }

  public boolean isIsAddiction() {
    return this.isAddiction;
  }

  public CSChannelAddictionMsg setIsAddiction(boolean isAddiction) {
    this.isAddiction = isAddiction;
    setIsAddictionIsSet(true);
    return this;
  }

  public void unsetIsAddiction() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISADDICTION_ISSET_ID);
  }

  /** Returns true if field isAddiction is set (has been assigned a value) and false otherwise */
  public boolean isSetIsAddiction() {
    return EncodingUtils.testBit(__isset_bitfield, __ISADDICTION_ISSET_ID);
  }

  public void setIsAddictionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISADDICTION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_ADDICTION:
      if (value == null) {
        unsetIsAddiction();
      } else {
        setIsAddiction((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_ADDICTION:
      return Boolean.valueOf(isIsAddiction());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_ADDICTION:
      return isSetIsAddiction();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSChannelAddictionMsg)
      return this.equals((CSChannelAddictionMsg)that);
    return false;
  }

  public boolean equals(CSChannelAddictionMsg that) {
    if (that == null)
      return false;

    boolean this_present_isAddiction = true;
    boolean that_present_isAddiction = true;
    if (this_present_isAddiction || that_present_isAddiction) {
      if (!(this_present_isAddiction && that_present_isAddiction))
        return false;
      if (this.isAddiction != that.isAddiction)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSChannelAddictionMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSChannelAddictionMsg typedOther = (CSChannelAddictionMsg)other;

    lastComparison = Boolean.valueOf(isSetIsAddiction()).compareTo(typedOther.isSetIsAddiction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsAddiction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isAddiction, typedOther.isAddiction);
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
    StringBuilder sb = new StringBuilder("CSChannelAddictionMsg(");
    boolean first = true;

    sb.append("isAddiction:");
    sb.append(this.isAddiction);
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

  private static class CSChannelAddictionMsgStandardSchemeFactory implements SchemeFactory {
    public CSChannelAddictionMsgStandardScheme getScheme() {
      return new CSChannelAddictionMsgStandardScheme();
    }
  }

  private static class CSChannelAddictionMsgStandardScheme extends StandardScheme<CSChannelAddictionMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSChannelAddictionMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_ADDICTION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isAddiction = iprot.readBool();
              struct.setIsAddictionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSChannelAddictionMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_ADDICTION_FIELD_DESC);
      oprot.writeBool(struct.isAddiction);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSChannelAddictionMsgTupleSchemeFactory implements SchemeFactory {
    public CSChannelAddictionMsgTupleScheme getScheme() {
      return new CSChannelAddictionMsgTupleScheme();
    }
  }

  private static class CSChannelAddictionMsgTupleScheme extends TupleScheme<CSChannelAddictionMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSChannelAddictionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIsAddiction()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIsAddiction()) {
        oprot.writeBool(struct.isAddiction);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSChannelAddictionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.isAddiction = iprot.readBool();
        struct.setIsAddictionIsSet(true);
      }
    }
  }

}

