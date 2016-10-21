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

public class CSItemRenewMsg implements org.apache.thrift.TBase<CSItemRenewMsg, CSItemRenewMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSItemRenewMsg");

  private static final org.apache.thrift.protocol.TField ITEM_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemInstanceId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VALID_TIME_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("validTimeType", org.apache.thrift.protocol.TType.BYTE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSItemRenewMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSItemRenewMsgTupleSchemeFactory());
  }

  public long itemInstanceId; // required
  public byte validTimeType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_INSTANCE_ID((short)1, "itemInstanceId"),
    VALID_TIME_TYPE((short)2, "validTimeType");

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
        case 1: // ITEM_INSTANCE_ID
          return ITEM_INSTANCE_ID;
        case 2: // VALID_TIME_TYPE
          return VALID_TIME_TYPE;
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
  private static final int __ITEMINSTANCEID_ISSET_ID = 0;
  private static final int __VALIDTIMETYPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("itemInstanceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID_TIME_TYPE, new org.apache.thrift.meta_data.FieldMetaData("validTimeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSItemRenewMsg.class, metaDataMap);
  }

  public CSItemRenewMsg() {
  }

  public CSItemRenewMsg(
    long itemInstanceId,
    byte validTimeType)
  {
    this();
    this.itemInstanceId = itemInstanceId;
    setItemInstanceIdIsSet(true);
    this.validTimeType = validTimeType;
    setValidTimeTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSItemRenewMsg(CSItemRenewMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.itemInstanceId = other.itemInstanceId;
    this.validTimeType = other.validTimeType;
  }

  public CSItemRenewMsg deepCopy() {
    return new CSItemRenewMsg(this);
  }

  @Override
  public void clear() {
    setItemInstanceIdIsSet(false);
    this.itemInstanceId = 0;
    setValidTimeTypeIsSet(false);
    this.validTimeType = 0;
  }

  public long getItemInstanceId() {
    return this.itemInstanceId;
  }

  public CSItemRenewMsg setItemInstanceId(long itemInstanceId) {
    this.itemInstanceId = itemInstanceId;
    setItemInstanceIdIsSet(true);
    return this;
  }

  public void unsetItemInstanceId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITEMINSTANCEID_ISSET_ID);
  }

  /** Returns true if field itemInstanceId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemInstanceId() {
    return EncodingUtils.testBit(__isset_bitfield, __ITEMINSTANCEID_ISSET_ID);
  }

  public void setItemInstanceIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITEMINSTANCEID_ISSET_ID, value);
  }

  public byte getValidTimeType() {
    return this.validTimeType;
  }

  public CSItemRenewMsg setValidTimeType(byte validTimeType) {
    this.validTimeType = validTimeType;
    setValidTimeTypeIsSet(true);
    return this;
  }

  public void unsetValidTimeType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALIDTIMETYPE_ISSET_ID);
  }

  /** Returns true if field validTimeType is set (has been assigned a value) and false otherwise */
  public boolean isSetValidTimeType() {
    return EncodingUtils.testBit(__isset_bitfield, __VALIDTIMETYPE_ISSET_ID);
  }

  public void setValidTimeTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALIDTIMETYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM_INSTANCE_ID:
      if (value == null) {
        unsetItemInstanceId();
      } else {
        setItemInstanceId((Long)value);
      }
      break;

    case VALID_TIME_TYPE:
      if (value == null) {
        unsetValidTimeType();
      } else {
        setValidTimeType((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_INSTANCE_ID:
      return Long.valueOf(getItemInstanceId());

    case VALID_TIME_TYPE:
      return Byte.valueOf(getValidTimeType());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM_INSTANCE_ID:
      return isSetItemInstanceId();
    case VALID_TIME_TYPE:
      return isSetValidTimeType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSItemRenewMsg)
      return this.equals((CSItemRenewMsg)that);
    return false;
  }

  public boolean equals(CSItemRenewMsg that) {
    if (that == null)
      return false;

    boolean this_present_itemInstanceId = true;
    boolean that_present_itemInstanceId = true;
    if (this_present_itemInstanceId || that_present_itemInstanceId) {
      if (!(this_present_itemInstanceId && that_present_itemInstanceId))
        return false;
      if (this.itemInstanceId != that.itemInstanceId)
        return false;
    }

    boolean this_present_validTimeType = true;
    boolean that_present_validTimeType = true;
    if (this_present_validTimeType || that_present_validTimeType) {
      if (!(this_present_validTimeType && that_present_validTimeType))
        return false;
      if (this.validTimeType != that.validTimeType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSItemRenewMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSItemRenewMsg typedOther = (CSItemRenewMsg)other;

    lastComparison = Boolean.valueOf(isSetItemInstanceId()).compareTo(typedOther.isSetItemInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemInstanceId, typedOther.itemInstanceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValidTimeType()).compareTo(typedOther.isSetValidTimeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidTimeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validTimeType, typedOther.validTimeType);
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
    StringBuilder sb = new StringBuilder("CSItemRenewMsg(");
    boolean first = true;

    sb.append("itemInstanceId:");
    sb.append(this.itemInstanceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("validTimeType:");
    sb.append(this.validTimeType);
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

  private static class CSItemRenewMsgStandardSchemeFactory implements SchemeFactory {
    public CSItemRenewMsgStandardScheme getScheme() {
      return new CSItemRenewMsgStandardScheme();
    }
  }

  private static class CSItemRenewMsgStandardScheme extends StandardScheme<CSItemRenewMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSItemRenewMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.itemInstanceId = iprot.readI64();
              struct.setItemInstanceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALID_TIME_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.validTimeType = iprot.readByte();
              struct.setValidTimeTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSItemRenewMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ITEM_INSTANCE_ID_FIELD_DESC);
      oprot.writeI64(struct.itemInstanceId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALID_TIME_TYPE_FIELD_DESC);
      oprot.writeByte(struct.validTimeType);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSItemRenewMsgTupleSchemeFactory implements SchemeFactory {
    public CSItemRenewMsgTupleScheme getScheme() {
      return new CSItemRenewMsgTupleScheme();
    }
  }

  private static class CSItemRenewMsgTupleScheme extends TupleScheme<CSItemRenewMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSItemRenewMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemInstanceId()) {
        optionals.set(0);
      }
      if (struct.isSetValidTimeType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetItemInstanceId()) {
        oprot.writeI64(struct.itemInstanceId);
      }
      if (struct.isSetValidTimeType()) {
        oprot.writeByte(struct.validTimeType);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSItemRenewMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.itemInstanceId = iprot.readI64();
        struct.setItemInstanceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.validTimeType = iprot.readByte();
        struct.setValidTimeTypeIsSet(true);
      }
    }
  }

}
