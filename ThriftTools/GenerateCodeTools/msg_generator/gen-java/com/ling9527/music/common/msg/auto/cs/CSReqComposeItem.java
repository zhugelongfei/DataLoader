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
 * 请求合成道具
 */
public class CSReqComposeItem implements org.apache.thrift.TBase<CSReqComposeItem, CSReqComposeItem._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSReqComposeItem");

  private static final org.apache.thrift.protocol.TField VALID_TIME_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("validTimeType", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemId", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSReqComposeItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSReqComposeItemTupleSchemeFactory());
  }

  /**
   * 0-7天 1-30天 2-永久
   */
  public byte validTimeType; // required
  public int itemId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 0-7天 1-30天 2-永久
     */
    VALID_TIME_TYPE((short)1, "validTimeType"),
    ITEM_ID((short)2, "itemId");

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
        case 1: // VALID_TIME_TYPE
          return VALID_TIME_TYPE;
        case 2: // ITEM_ID
          return ITEM_ID;
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
  private static final int __VALIDTIMETYPE_ISSET_ID = 0;
  private static final int __ITEMID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALID_TIME_TYPE, new org.apache.thrift.meta_data.FieldMetaData("validTimeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("itemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSReqComposeItem.class, metaDataMap);
  }

  public CSReqComposeItem() {
  }

  public CSReqComposeItem(
    byte validTimeType,
    int itemId)
  {
    this();
    this.validTimeType = validTimeType;
    setValidTimeTypeIsSet(true);
    this.itemId = itemId;
    setItemIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSReqComposeItem(CSReqComposeItem other) {
    __isset_bitfield = other.__isset_bitfield;
    this.validTimeType = other.validTimeType;
    this.itemId = other.itemId;
  }

  public CSReqComposeItem deepCopy() {
    return new CSReqComposeItem(this);
  }

  @Override
  public void clear() {
    setValidTimeTypeIsSet(false);
    this.validTimeType = 0;
    setItemIdIsSet(false);
    this.itemId = 0;
  }

  /**
   * 0-7天 1-30天 2-永久
   */
  public byte getValidTimeType() {
    return this.validTimeType;
  }

  /**
   * 0-7天 1-30天 2-永久
   */
  public CSReqComposeItem setValidTimeType(byte validTimeType) {
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

  public int getItemId() {
    return this.itemId;
  }

  public CSReqComposeItem setItemId(int itemId) {
    this.itemId = itemId;
    setItemIdIsSet(true);
    return this;
  }

  public void unsetItemId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITEMID_ISSET_ID);
  }

  /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemId() {
    return EncodingUtils.testBit(__isset_bitfield, __ITEMID_ISSET_ID);
  }

  public void setItemIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITEMID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALID_TIME_TYPE:
      if (value == null) {
        unsetValidTimeType();
      } else {
        setValidTimeType((Byte)value);
      }
      break;

    case ITEM_ID:
      if (value == null) {
        unsetItemId();
      } else {
        setItemId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALID_TIME_TYPE:
      return Byte.valueOf(getValidTimeType());

    case ITEM_ID:
      return Integer.valueOf(getItemId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALID_TIME_TYPE:
      return isSetValidTimeType();
    case ITEM_ID:
      return isSetItemId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSReqComposeItem)
      return this.equals((CSReqComposeItem)that);
    return false;
  }

  public boolean equals(CSReqComposeItem that) {
    if (that == null)
      return false;

    boolean this_present_validTimeType = true;
    boolean that_present_validTimeType = true;
    if (this_present_validTimeType || that_present_validTimeType) {
      if (!(this_present_validTimeType && that_present_validTimeType))
        return false;
      if (this.validTimeType != that.validTimeType)
        return false;
    }

    boolean this_present_itemId = true;
    boolean that_present_itemId = true;
    if (this_present_itemId || that_present_itemId) {
      if (!(this_present_itemId && that_present_itemId))
        return false;
      if (this.itemId != that.itemId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSReqComposeItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSReqComposeItem typedOther = (CSReqComposeItem)other;

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
    lastComparison = Boolean.valueOf(isSetItemId()).compareTo(typedOther.isSetItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemId, typedOther.itemId);
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
    StringBuilder sb = new StringBuilder("CSReqComposeItem(");
    boolean first = true;

    sb.append("validTimeType:");
    sb.append(this.validTimeType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemId:");
    sb.append(this.itemId);
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

  private static class CSReqComposeItemStandardSchemeFactory implements SchemeFactory {
    public CSReqComposeItemStandardScheme getScheme() {
      return new CSReqComposeItemStandardScheme();
    }
  }

  private static class CSReqComposeItemStandardScheme extends StandardScheme<CSReqComposeItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSReqComposeItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALID_TIME_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.validTimeType = iprot.readByte();
              struct.setValidTimeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.itemId = iprot.readI32();
              struct.setItemIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSReqComposeItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VALID_TIME_TYPE_FIELD_DESC);
      oprot.writeByte(struct.validTimeType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
      oprot.writeI32(struct.itemId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSReqComposeItemTupleSchemeFactory implements SchemeFactory {
    public CSReqComposeItemTupleScheme getScheme() {
      return new CSReqComposeItemTupleScheme();
    }
  }

  private static class CSReqComposeItemTupleScheme extends TupleScheme<CSReqComposeItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSReqComposeItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetValidTimeType()) {
        optionals.set(0);
      }
      if (struct.isSetItemId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetValidTimeType()) {
        oprot.writeByte(struct.validTimeType);
      }
      if (struct.isSetItemId()) {
        oprot.writeI32(struct.itemId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSReqComposeItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.validTimeType = iprot.readByte();
        struct.setValidTimeTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.itemId = iprot.readI32();
        struct.setItemIdIsSet(true);
      }
    }
  }

}

