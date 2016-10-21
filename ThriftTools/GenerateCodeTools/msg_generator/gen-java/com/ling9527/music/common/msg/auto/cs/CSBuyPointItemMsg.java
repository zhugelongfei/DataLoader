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

public class CSBuyPointItemMsg implements org.apache.thrift.TBase<CSBuyPointItemMsg, CSBuyPointItemMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSBuyPointItemMsg");

  private static final org.apache.thrift.protocol.TField POINT_ITEM_FIELD_DESC = new org.apache.thrift.protocol.TField("pointItem", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSBuyPointItemMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSBuyPointItemMsgTupleSchemeFactory());
  }

  public int pointItem; // required
  public long orderId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POINT_ITEM((short)1, "pointItem"),
    ORDER_ID((short)2, "orderId");

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
        case 1: // POINT_ITEM
          return POINT_ITEM;
        case 2: // ORDER_ID
          return ORDER_ID;
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
  private static final int __POINTITEM_ISSET_ID = 0;
  private static final int __ORDERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POINT_ITEM, new org.apache.thrift.meta_data.FieldMetaData("pointItem", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSBuyPointItemMsg.class, metaDataMap);
  }

  public CSBuyPointItemMsg() {
  }

  public CSBuyPointItemMsg(
    int pointItem,
    long orderId)
  {
    this();
    this.pointItem = pointItem;
    setPointItemIsSet(true);
    this.orderId = orderId;
    setOrderIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSBuyPointItemMsg(CSBuyPointItemMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pointItem = other.pointItem;
    this.orderId = other.orderId;
  }

  public CSBuyPointItemMsg deepCopy() {
    return new CSBuyPointItemMsg(this);
  }

  @Override
  public void clear() {
    setPointItemIsSet(false);
    this.pointItem = 0;
    setOrderIdIsSet(false);
    this.orderId = 0;
  }

  public int getPointItem() {
    return this.pointItem;
  }

  public CSBuyPointItemMsg setPointItem(int pointItem) {
    this.pointItem = pointItem;
    setPointItemIsSet(true);
    return this;
  }

  public void unsetPointItem() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POINTITEM_ISSET_ID);
  }

  /** Returns true if field pointItem is set (has been assigned a value) and false otherwise */
  public boolean isSetPointItem() {
    return EncodingUtils.testBit(__isset_bitfield, __POINTITEM_ISSET_ID);
  }

  public void setPointItemIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POINTITEM_ISSET_ID, value);
  }

  public long getOrderId() {
    return this.orderId;
  }

  public CSBuyPointItemMsg setOrderId(long orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return EncodingUtils.testBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORDERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POINT_ITEM:
      if (value == null) {
        unsetPointItem();
      } else {
        setPointItem((Integer)value);
      }
      break;

    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POINT_ITEM:
      return Integer.valueOf(getPointItem());

    case ORDER_ID:
      return Long.valueOf(getOrderId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POINT_ITEM:
      return isSetPointItem();
    case ORDER_ID:
      return isSetOrderId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSBuyPointItemMsg)
      return this.equals((CSBuyPointItemMsg)that);
    return false;
  }

  public boolean equals(CSBuyPointItemMsg that) {
    if (that == null)
      return false;

    boolean this_present_pointItem = true;
    boolean that_present_pointItem = true;
    if (this_present_pointItem || that_present_pointItem) {
      if (!(this_present_pointItem && that_present_pointItem))
        return false;
      if (this.pointItem != that.pointItem)
        return false;
    }

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSBuyPointItemMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSBuyPointItemMsg typedOther = (CSBuyPointItemMsg)other;

    lastComparison = Boolean.valueOf(isSetPointItem()).compareTo(typedOther.isSetPointItem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPointItem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pointItem, typedOther.pointItem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(typedOther.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, typedOther.orderId);
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
    StringBuilder sb = new StringBuilder("CSBuyPointItemMsg(");
    boolean first = true;

    sb.append("pointItem:");
    sb.append(this.pointItem);
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderId:");
    sb.append(this.orderId);
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

  private static class CSBuyPointItemMsgStandardSchemeFactory implements SchemeFactory {
    public CSBuyPointItemMsgStandardScheme getScheme() {
      return new CSBuyPointItemMsgStandardScheme();
    }
  }

  private static class CSBuyPointItemMsgStandardScheme extends StandardScheme<CSBuyPointItemMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSBuyPointItemMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POINT_ITEM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pointItem = iprot.readI32();
              struct.setPointItemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.orderId = iprot.readI64();
              struct.setOrderIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSBuyPointItemMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(POINT_ITEM_FIELD_DESC);
      oprot.writeI32(struct.pointItem);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeI64(struct.orderId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSBuyPointItemMsgTupleSchemeFactory implements SchemeFactory {
    public CSBuyPointItemMsgTupleScheme getScheme() {
      return new CSBuyPointItemMsgTupleScheme();
    }
  }

  private static class CSBuyPointItemMsgTupleScheme extends TupleScheme<CSBuyPointItemMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSBuyPointItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPointItem()) {
        optionals.set(0);
      }
      if (struct.isSetOrderId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPointItem()) {
        oprot.writeI32(struct.pointItem);
      }
      if (struct.isSetOrderId()) {
        oprot.writeI64(struct.orderId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSBuyPointItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.pointItem = iprot.readI32();
        struct.setPointItemIsSet(true);
      }
      if (incoming.get(1)) {
        struct.orderId = iprot.readI64();
        struct.setOrderIdIsSet(true);
      }
    }
  }

}

