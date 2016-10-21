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

public class CSExpandBagMsg implements org.apache.thrift.TBase<CSExpandBagMsg, CSExpandBagMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSExpandBagMsg");

  private static final org.apache.thrift.protocol.TField EXPAND_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("expandCount", org.apache.thrift.protocol.TType.I16, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSExpandBagMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSExpandBagMsgTupleSchemeFactory());
  }

  public short expandCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPAND_COUNT((short)1, "expandCount");

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
        case 1: // EXPAND_COUNT
          return EXPAND_COUNT;
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
  private static final int __EXPANDCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPAND_COUNT, new org.apache.thrift.meta_data.FieldMetaData("expandCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSExpandBagMsg.class, metaDataMap);
  }

  public CSExpandBagMsg() {
  }

  public CSExpandBagMsg(
    short expandCount)
  {
    this();
    this.expandCount = expandCount;
    setExpandCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSExpandBagMsg(CSExpandBagMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.expandCount = other.expandCount;
  }

  public CSExpandBagMsg deepCopy() {
    return new CSExpandBagMsg(this);
  }

  @Override
  public void clear() {
    setExpandCountIsSet(false);
    this.expandCount = 0;
  }

  public short getExpandCount() {
    return this.expandCount;
  }

  public CSExpandBagMsg setExpandCount(short expandCount) {
    this.expandCount = expandCount;
    setExpandCountIsSet(true);
    return this;
  }

  public void unsetExpandCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPANDCOUNT_ISSET_ID);
  }

  /** Returns true if field expandCount is set (has been assigned a value) and false otherwise */
  public boolean isSetExpandCount() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPANDCOUNT_ISSET_ID);
  }

  public void setExpandCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPANDCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPAND_COUNT:
      if (value == null) {
        unsetExpandCount();
      } else {
        setExpandCount((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPAND_COUNT:
      return Short.valueOf(getExpandCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPAND_COUNT:
      return isSetExpandCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSExpandBagMsg)
      return this.equals((CSExpandBagMsg)that);
    return false;
  }

  public boolean equals(CSExpandBagMsg that) {
    if (that == null)
      return false;

    boolean this_present_expandCount = true;
    boolean that_present_expandCount = true;
    if (this_present_expandCount || that_present_expandCount) {
      if (!(this_present_expandCount && that_present_expandCount))
        return false;
      if (this.expandCount != that.expandCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSExpandBagMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSExpandBagMsg typedOther = (CSExpandBagMsg)other;

    lastComparison = Boolean.valueOf(isSetExpandCount()).compareTo(typedOther.isSetExpandCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpandCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expandCount, typedOther.expandCount);
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
    StringBuilder sb = new StringBuilder("CSExpandBagMsg(");
    boolean first = true;

    sb.append("expandCount:");
    sb.append(this.expandCount);
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

  private static class CSExpandBagMsgStandardSchemeFactory implements SchemeFactory {
    public CSExpandBagMsgStandardScheme getScheme() {
      return new CSExpandBagMsgStandardScheme();
    }
  }

  private static class CSExpandBagMsgStandardScheme extends StandardScheme<CSExpandBagMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSExpandBagMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPAND_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.expandCount = iprot.readI16();
              struct.setExpandCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSExpandBagMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EXPAND_COUNT_FIELD_DESC);
      oprot.writeI16(struct.expandCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSExpandBagMsgTupleSchemeFactory implements SchemeFactory {
    public CSExpandBagMsgTupleScheme getScheme() {
      return new CSExpandBagMsgTupleScheme();
    }
  }

  private static class CSExpandBagMsgTupleScheme extends TupleScheme<CSExpandBagMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSExpandBagMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExpandCount()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetExpandCount()) {
        oprot.writeI16(struct.expandCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSExpandBagMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.expandCount = iprot.readI16();
        struct.setExpandCountIsSet(true);
      }
    }
  }

}

