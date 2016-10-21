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

/**
 * 放烟火成功
 */
public class SCLightFireWorksSucc implements org.apache.thrift.TBase<SCLightFireWorksSucc, SCLightFireWorksSucc._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCLightFireWorksSucc");

  private static final org.apache.thrift.protocol.TField FIREWORK_ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fireworkItemId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCLightFireWorksSuccStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCLightFireWorksSuccTupleSchemeFactory());
  }

  /**
   * 烟花道具id
   */
  public int fireworkItemId; // required
  /**
   * 场景特效-放烟火地点
   */
  public byte location; // required
  /**
   * 发送者
   */
  public long sender; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 烟花道具id
     */
    FIREWORK_ITEM_ID((short)1, "fireworkItemId"),
    /**
     * 场景特效-放烟火地点
     */
    LOCATION((short)2, "location"),
    /**
     * 发送者
     */
    SENDER((short)3, "sender");

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
        case 1: // FIREWORK_ITEM_ID
          return FIREWORK_ITEM_ID;
        case 2: // LOCATION
          return LOCATION;
        case 3: // SENDER
          return SENDER;
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
  private static final int __FIREWORKITEMID_ISSET_ID = 0;
  private static final int __LOCATION_ISSET_ID = 1;
  private static final int __SENDER_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIREWORK_ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("fireworkItemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCLightFireWorksSucc.class, metaDataMap);
  }

  public SCLightFireWorksSucc() {
  }

  public SCLightFireWorksSucc(
    int fireworkItemId,
    byte location,
    long sender)
  {
    this();
    this.fireworkItemId = fireworkItemId;
    setFireworkItemIdIsSet(true);
    this.location = location;
    setLocationIsSet(true);
    this.sender = sender;
    setSenderIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCLightFireWorksSucc(SCLightFireWorksSucc other) {
    __isset_bitfield = other.__isset_bitfield;
    this.fireworkItemId = other.fireworkItemId;
    this.location = other.location;
    this.sender = other.sender;
  }

  public SCLightFireWorksSucc deepCopy() {
    return new SCLightFireWorksSucc(this);
  }

  @Override
  public void clear() {
    setFireworkItemIdIsSet(false);
    this.fireworkItemId = 0;
    setLocationIsSet(false);
    this.location = 0;
    setSenderIsSet(false);
    this.sender = 0;
  }

  /**
   * 烟花道具id
   */
  public int getFireworkItemId() {
    return this.fireworkItemId;
  }

  /**
   * 烟花道具id
   */
  public SCLightFireWorksSucc setFireworkItemId(int fireworkItemId) {
    this.fireworkItemId = fireworkItemId;
    setFireworkItemIdIsSet(true);
    return this;
  }

  public void unsetFireworkItemId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FIREWORKITEMID_ISSET_ID);
  }

  /** Returns true if field fireworkItemId is set (has been assigned a value) and false otherwise */
  public boolean isSetFireworkItemId() {
    return EncodingUtils.testBit(__isset_bitfield, __FIREWORKITEMID_ISSET_ID);
  }

  public void setFireworkItemIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FIREWORKITEMID_ISSET_ID, value);
  }

  /**
   * 场景特效-放烟火地点
   */
  public byte getLocation() {
    return this.location;
  }

  /**
   * 场景特效-放烟火地点
   */
  public SCLightFireWorksSucc setLocation(byte location) {
    this.location = location;
    setLocationIsSet(true);
    return this;
  }

  public void unsetLocation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCATION_ISSET_ID);
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCATION_ISSET_ID);
  }

  public void setLocationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCATION_ISSET_ID, value);
  }

  /**
   * 发送者
   */
  public long getSender() {
    return this.sender;
  }

  /**
   * 发送者
   */
  public SCLightFireWorksSucc setSender(long sender) {
    this.sender = sender;
    setSenderIsSet(true);
    return this;
  }

  public void unsetSender() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENDER_ISSET_ID);
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return EncodingUtils.testBit(__isset_bitfield, __SENDER_ISSET_ID);
  }

  public void setSenderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENDER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIREWORK_ITEM_ID:
      if (value == null) {
        unsetFireworkItemId();
      } else {
        setFireworkItemId((Integer)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((Byte)value);
      }
      break;

    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        setSender((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIREWORK_ITEM_ID:
      return Integer.valueOf(getFireworkItemId());

    case LOCATION:
      return Byte.valueOf(getLocation());

    case SENDER:
      return Long.valueOf(getSender());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIREWORK_ITEM_ID:
      return isSetFireworkItemId();
    case LOCATION:
      return isSetLocation();
    case SENDER:
      return isSetSender();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCLightFireWorksSucc)
      return this.equals((SCLightFireWorksSucc)that);
    return false;
  }

  public boolean equals(SCLightFireWorksSucc that) {
    if (that == null)
      return false;

    boolean this_present_fireworkItemId = true;
    boolean that_present_fireworkItemId = true;
    if (this_present_fireworkItemId || that_present_fireworkItemId) {
      if (!(this_present_fireworkItemId && that_present_fireworkItemId))
        return false;
      if (this.fireworkItemId != that.fireworkItemId)
        return false;
    }

    boolean this_present_location = true;
    boolean that_present_location = true;
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (this.location != that.location)
        return false;
    }

    boolean this_present_sender = true;
    boolean that_present_sender = true;
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (this.sender != that.sender)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCLightFireWorksSucc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCLightFireWorksSucc typedOther = (SCLightFireWorksSucc)other;

    lastComparison = Boolean.valueOf(isSetFireworkItemId()).compareTo(typedOther.isSetFireworkItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFireworkItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fireworkItemId, typedOther.fireworkItemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(typedOther.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, typedOther.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSender()).compareTo(typedOther.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, typedOther.sender);
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
    StringBuilder sb = new StringBuilder("SCLightFireWorksSucc(");
    boolean first = true;

    sb.append("fireworkItemId:");
    sb.append(this.fireworkItemId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    sb.append(this.location);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender:");
    sb.append(this.sender);
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

  private static class SCLightFireWorksSuccStandardSchemeFactory implements SchemeFactory {
    public SCLightFireWorksSuccStandardScheme getScheme() {
      return new SCLightFireWorksSuccStandardScheme();
    }
  }

  private static class SCLightFireWorksSuccStandardScheme extends StandardScheme<SCLightFireWorksSucc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCLightFireWorksSucc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIREWORK_ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fireworkItemId = iprot.readI32();
              struct.setFireworkItemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.location = iprot.readByte();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sender = iprot.readI64();
              struct.setSenderIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCLightFireWorksSucc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FIREWORK_ITEM_ID_FIELD_DESC);
      oprot.writeI32(struct.fireworkItemId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOCATION_FIELD_DESC);
      oprot.writeByte(struct.location);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SENDER_FIELD_DESC);
      oprot.writeI64(struct.sender);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCLightFireWorksSuccTupleSchemeFactory implements SchemeFactory {
    public SCLightFireWorksSuccTupleScheme getScheme() {
      return new SCLightFireWorksSuccTupleScheme();
    }
  }

  private static class SCLightFireWorksSuccTupleScheme extends TupleScheme<SCLightFireWorksSucc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCLightFireWorksSucc struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFireworkItemId()) {
        optionals.set(0);
      }
      if (struct.isSetLocation()) {
        optionals.set(1);
      }
      if (struct.isSetSender()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetFireworkItemId()) {
        oprot.writeI32(struct.fireworkItemId);
      }
      if (struct.isSetLocation()) {
        oprot.writeByte(struct.location);
      }
      if (struct.isSetSender()) {
        oprot.writeI64(struct.sender);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCLightFireWorksSucc struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.fireworkItemId = iprot.readI32();
        struct.setFireworkItemIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.location = iprot.readByte();
        struct.setLocationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sender = iprot.readI64();
        struct.setSenderIsSet(true);
      }
    }
  }

}

