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

public class SCSlotPrizePoolMsg implements org.apache.thrift.TBase<SCSlotPrizePoolMsg, SCSlotPrizePoolMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCSlotPrizePoolMsg");

  private static final org.apache.thrift.protocol.TField DIAMOND_POOL_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("diamondPoolSize", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BIND_DIAMOND_POOL_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("bindDiamondPoolSize", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCSlotPrizePoolMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCSlotPrizePoolMsgTupleSchemeFactory());
  }

  public int diamondPoolSize; // required
  public int bindDiamondPoolSize; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DIAMOND_POOL_SIZE((short)1, "diamondPoolSize"),
    BIND_DIAMOND_POOL_SIZE((short)2, "bindDiamondPoolSize");

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
        case 1: // DIAMOND_POOL_SIZE
          return DIAMOND_POOL_SIZE;
        case 2: // BIND_DIAMOND_POOL_SIZE
          return BIND_DIAMOND_POOL_SIZE;
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
  private static final int __DIAMONDPOOLSIZE_ISSET_ID = 0;
  private static final int __BINDDIAMONDPOOLSIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DIAMOND_POOL_SIZE, new org.apache.thrift.meta_data.FieldMetaData("diamondPoolSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BIND_DIAMOND_POOL_SIZE, new org.apache.thrift.meta_data.FieldMetaData("bindDiamondPoolSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCSlotPrizePoolMsg.class, metaDataMap);
  }

  public SCSlotPrizePoolMsg() {
  }

  public SCSlotPrizePoolMsg(
    int diamondPoolSize,
    int bindDiamondPoolSize)
  {
    this();
    this.diamondPoolSize = diamondPoolSize;
    setDiamondPoolSizeIsSet(true);
    this.bindDiamondPoolSize = bindDiamondPoolSize;
    setBindDiamondPoolSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCSlotPrizePoolMsg(SCSlotPrizePoolMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.diamondPoolSize = other.diamondPoolSize;
    this.bindDiamondPoolSize = other.bindDiamondPoolSize;
  }

  public SCSlotPrizePoolMsg deepCopy() {
    return new SCSlotPrizePoolMsg(this);
  }

  @Override
  public void clear() {
    setDiamondPoolSizeIsSet(false);
    this.diamondPoolSize = 0;
    setBindDiamondPoolSizeIsSet(false);
    this.bindDiamondPoolSize = 0;
  }

  public int getDiamondPoolSize() {
    return this.diamondPoolSize;
  }

  public SCSlotPrizePoolMsg setDiamondPoolSize(int diamondPoolSize) {
    this.diamondPoolSize = diamondPoolSize;
    setDiamondPoolSizeIsSet(true);
    return this;
  }

  public void unsetDiamondPoolSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DIAMONDPOOLSIZE_ISSET_ID);
  }

  /** Returns true if field diamondPoolSize is set (has been assigned a value) and false otherwise */
  public boolean isSetDiamondPoolSize() {
    return EncodingUtils.testBit(__isset_bitfield, __DIAMONDPOOLSIZE_ISSET_ID);
  }

  public void setDiamondPoolSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DIAMONDPOOLSIZE_ISSET_ID, value);
  }

  public int getBindDiamondPoolSize() {
    return this.bindDiamondPoolSize;
  }

  public SCSlotPrizePoolMsg setBindDiamondPoolSize(int bindDiamondPoolSize) {
    this.bindDiamondPoolSize = bindDiamondPoolSize;
    setBindDiamondPoolSizeIsSet(true);
    return this;
  }

  public void unsetBindDiamondPoolSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BINDDIAMONDPOOLSIZE_ISSET_ID);
  }

  /** Returns true if field bindDiamondPoolSize is set (has been assigned a value) and false otherwise */
  public boolean isSetBindDiamondPoolSize() {
    return EncodingUtils.testBit(__isset_bitfield, __BINDDIAMONDPOOLSIZE_ISSET_ID);
  }

  public void setBindDiamondPoolSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BINDDIAMONDPOOLSIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DIAMOND_POOL_SIZE:
      if (value == null) {
        unsetDiamondPoolSize();
      } else {
        setDiamondPoolSize((Integer)value);
      }
      break;

    case BIND_DIAMOND_POOL_SIZE:
      if (value == null) {
        unsetBindDiamondPoolSize();
      } else {
        setBindDiamondPoolSize((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DIAMOND_POOL_SIZE:
      return Integer.valueOf(getDiamondPoolSize());

    case BIND_DIAMOND_POOL_SIZE:
      return Integer.valueOf(getBindDiamondPoolSize());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DIAMOND_POOL_SIZE:
      return isSetDiamondPoolSize();
    case BIND_DIAMOND_POOL_SIZE:
      return isSetBindDiamondPoolSize();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCSlotPrizePoolMsg)
      return this.equals((SCSlotPrizePoolMsg)that);
    return false;
  }

  public boolean equals(SCSlotPrizePoolMsg that) {
    if (that == null)
      return false;

    boolean this_present_diamondPoolSize = true;
    boolean that_present_diamondPoolSize = true;
    if (this_present_diamondPoolSize || that_present_diamondPoolSize) {
      if (!(this_present_diamondPoolSize && that_present_diamondPoolSize))
        return false;
      if (this.diamondPoolSize != that.diamondPoolSize)
        return false;
    }

    boolean this_present_bindDiamondPoolSize = true;
    boolean that_present_bindDiamondPoolSize = true;
    if (this_present_bindDiamondPoolSize || that_present_bindDiamondPoolSize) {
      if (!(this_present_bindDiamondPoolSize && that_present_bindDiamondPoolSize))
        return false;
      if (this.bindDiamondPoolSize != that.bindDiamondPoolSize)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCSlotPrizePoolMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCSlotPrizePoolMsg typedOther = (SCSlotPrizePoolMsg)other;

    lastComparison = Boolean.valueOf(isSetDiamondPoolSize()).compareTo(typedOther.isSetDiamondPoolSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiamondPoolSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diamondPoolSize, typedOther.diamondPoolSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBindDiamondPoolSize()).compareTo(typedOther.isSetBindDiamondPoolSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBindDiamondPoolSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bindDiamondPoolSize, typedOther.bindDiamondPoolSize);
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
    StringBuilder sb = new StringBuilder("SCSlotPrizePoolMsg(");
    boolean first = true;

    sb.append("diamondPoolSize:");
    sb.append(this.diamondPoolSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bindDiamondPoolSize:");
    sb.append(this.bindDiamondPoolSize);
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

  private static class SCSlotPrizePoolMsgStandardSchemeFactory implements SchemeFactory {
    public SCSlotPrizePoolMsgStandardScheme getScheme() {
      return new SCSlotPrizePoolMsgStandardScheme();
    }
  }

  private static class SCSlotPrizePoolMsgStandardScheme extends StandardScheme<SCSlotPrizePoolMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCSlotPrizePoolMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DIAMOND_POOL_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.diamondPoolSize = iprot.readI32();
              struct.setDiamondPoolSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BIND_DIAMOND_POOL_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bindDiamondPoolSize = iprot.readI32();
              struct.setBindDiamondPoolSizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCSlotPrizePoolMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DIAMOND_POOL_SIZE_FIELD_DESC);
      oprot.writeI32(struct.diamondPoolSize);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BIND_DIAMOND_POOL_SIZE_FIELD_DESC);
      oprot.writeI32(struct.bindDiamondPoolSize);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCSlotPrizePoolMsgTupleSchemeFactory implements SchemeFactory {
    public SCSlotPrizePoolMsgTupleScheme getScheme() {
      return new SCSlotPrizePoolMsgTupleScheme();
    }
  }

  private static class SCSlotPrizePoolMsgTupleScheme extends TupleScheme<SCSlotPrizePoolMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCSlotPrizePoolMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDiamondPoolSize()) {
        optionals.set(0);
      }
      if (struct.isSetBindDiamondPoolSize()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDiamondPoolSize()) {
        oprot.writeI32(struct.diamondPoolSize);
      }
      if (struct.isSetBindDiamondPoolSize()) {
        oprot.writeI32(struct.bindDiamondPoolSize);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCSlotPrizePoolMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.diamondPoolSize = iprot.readI32();
        struct.setDiamondPoolSizeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bindDiamondPoolSize = iprot.readI32();
        struct.setBindDiamondPoolSizeIsSet(true);
      }
    }
  }

}
