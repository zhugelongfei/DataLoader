/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto;

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

public class FriendInfo implements org.apache.thrift.TBase<FriendInfo, FriendInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FriendInfo");

  private static final org.apache.thrift.protocol.TField SIMPLE_CARD_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("simpleCardInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TWO_WAY_FIELD_DESC = new org.apache.thrift.protocol.TField("twoWay", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField INTIMACY_FIELD_DESC = new org.apache.thrift.protocol.TField("intimacy", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FriendInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FriendInfoTupleSchemeFactory());
  }

  public SimpleBusinessCardInfo simpleCardInfo; // required
  public boolean twoWay; // required
  public int intimacy; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SIMPLE_CARD_INFO((short)1, "simpleCardInfo"),
    TWO_WAY((short)2, "twoWay"),
    INTIMACY((short)3, "intimacy");

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
        case 1: // SIMPLE_CARD_INFO
          return SIMPLE_CARD_INFO;
        case 2: // TWO_WAY
          return TWO_WAY;
        case 3: // INTIMACY
          return INTIMACY;
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
  private static final int __TWOWAY_ISSET_ID = 0;
  private static final int __INTIMACY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SIMPLE_CARD_INFO, new org.apache.thrift.meta_data.FieldMetaData("simpleCardInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SimpleBusinessCardInfo.class)));
    tmpMap.put(_Fields.TWO_WAY, new org.apache.thrift.meta_data.FieldMetaData("twoWay", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INTIMACY, new org.apache.thrift.meta_data.FieldMetaData("intimacy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FriendInfo.class, metaDataMap);
  }

  public FriendInfo() {
  }

  public FriendInfo(
    SimpleBusinessCardInfo simpleCardInfo,
    boolean twoWay,
    int intimacy)
  {
    this();
    this.simpleCardInfo = simpleCardInfo;
    this.twoWay = twoWay;
    setTwoWayIsSet(true);
    this.intimacy = intimacy;
    setIntimacyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FriendInfo(FriendInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSimpleCardInfo()) {
      this.simpleCardInfo = new SimpleBusinessCardInfo(other.simpleCardInfo);
    }
    this.twoWay = other.twoWay;
    this.intimacy = other.intimacy;
  }

  public FriendInfo deepCopy() {
    return new FriendInfo(this);
  }

  @Override
  public void clear() {
    this.simpleCardInfo = null;
    setTwoWayIsSet(false);
    this.twoWay = false;
    setIntimacyIsSet(false);
    this.intimacy = 0;
  }

  public SimpleBusinessCardInfo getSimpleCardInfo() {
    return this.simpleCardInfo;
  }

  public FriendInfo setSimpleCardInfo(SimpleBusinessCardInfo simpleCardInfo) {
    this.simpleCardInfo = simpleCardInfo;
    return this;
  }

  public void unsetSimpleCardInfo() {
    this.simpleCardInfo = null;
  }

  /** Returns true if field simpleCardInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetSimpleCardInfo() {
    return this.simpleCardInfo != null;
  }

  public void setSimpleCardInfoIsSet(boolean value) {
    if (!value) {
      this.simpleCardInfo = null;
    }
  }

  public boolean isTwoWay() {
    return this.twoWay;
  }

  public FriendInfo setTwoWay(boolean twoWay) {
    this.twoWay = twoWay;
    setTwoWayIsSet(true);
    return this;
  }

  public void unsetTwoWay() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TWOWAY_ISSET_ID);
  }

  /** Returns true if field twoWay is set (has been assigned a value) and false otherwise */
  public boolean isSetTwoWay() {
    return EncodingUtils.testBit(__isset_bitfield, __TWOWAY_ISSET_ID);
  }

  public void setTwoWayIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TWOWAY_ISSET_ID, value);
  }

  public int getIntimacy() {
    return this.intimacy;
  }

  public FriendInfo setIntimacy(int intimacy) {
    this.intimacy = intimacy;
    setIntimacyIsSet(true);
    return this;
  }

  public void unsetIntimacy() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INTIMACY_ISSET_ID);
  }

  /** Returns true if field intimacy is set (has been assigned a value) and false otherwise */
  public boolean isSetIntimacy() {
    return EncodingUtils.testBit(__isset_bitfield, __INTIMACY_ISSET_ID);
  }

  public void setIntimacyIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INTIMACY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SIMPLE_CARD_INFO:
      if (value == null) {
        unsetSimpleCardInfo();
      } else {
        setSimpleCardInfo((SimpleBusinessCardInfo)value);
      }
      break;

    case TWO_WAY:
      if (value == null) {
        unsetTwoWay();
      } else {
        setTwoWay((Boolean)value);
      }
      break;

    case INTIMACY:
      if (value == null) {
        unsetIntimacy();
      } else {
        setIntimacy((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SIMPLE_CARD_INFO:
      return getSimpleCardInfo();

    case TWO_WAY:
      return Boolean.valueOf(isTwoWay());

    case INTIMACY:
      return Integer.valueOf(getIntimacy());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SIMPLE_CARD_INFO:
      return isSetSimpleCardInfo();
    case TWO_WAY:
      return isSetTwoWay();
    case INTIMACY:
      return isSetIntimacy();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FriendInfo)
      return this.equals((FriendInfo)that);
    return false;
  }

  public boolean equals(FriendInfo that) {
    if (that == null)
      return false;

    boolean this_present_simpleCardInfo = true && this.isSetSimpleCardInfo();
    boolean that_present_simpleCardInfo = true && that.isSetSimpleCardInfo();
    if (this_present_simpleCardInfo || that_present_simpleCardInfo) {
      if (!(this_present_simpleCardInfo && that_present_simpleCardInfo))
        return false;
      if (!this.simpleCardInfo.equals(that.simpleCardInfo))
        return false;
    }

    boolean this_present_twoWay = true;
    boolean that_present_twoWay = true;
    if (this_present_twoWay || that_present_twoWay) {
      if (!(this_present_twoWay && that_present_twoWay))
        return false;
      if (this.twoWay != that.twoWay)
        return false;
    }

    boolean this_present_intimacy = true;
    boolean that_present_intimacy = true;
    if (this_present_intimacy || that_present_intimacy) {
      if (!(this_present_intimacy && that_present_intimacy))
        return false;
      if (this.intimacy != that.intimacy)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(FriendInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FriendInfo typedOther = (FriendInfo)other;

    lastComparison = Boolean.valueOf(isSetSimpleCardInfo()).compareTo(typedOther.isSetSimpleCardInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSimpleCardInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.simpleCardInfo, typedOther.simpleCardInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTwoWay()).compareTo(typedOther.isSetTwoWay());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTwoWay()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.twoWay, typedOther.twoWay);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIntimacy()).compareTo(typedOther.isSetIntimacy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntimacy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intimacy, typedOther.intimacy);
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
    StringBuilder sb = new StringBuilder("FriendInfo(");
    boolean first = true;

    sb.append("simpleCardInfo:");
    if (this.simpleCardInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.simpleCardInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("twoWay:");
    sb.append(this.twoWay);
    first = false;
    if (!first) sb.append(", ");
    sb.append("intimacy:");
    sb.append(this.intimacy);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (simpleCardInfo != null) {
      simpleCardInfo.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FriendInfoStandardSchemeFactory implements SchemeFactory {
    public FriendInfoStandardScheme getScheme() {
      return new FriendInfoStandardScheme();
    }
  }

  private static class FriendInfoStandardScheme extends StandardScheme<FriendInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FriendInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SIMPLE_CARD_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.simpleCardInfo = new SimpleBusinessCardInfo();
              struct.simpleCardInfo.read(iprot);
              struct.setSimpleCardInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TWO_WAY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.twoWay = iprot.readBool();
              struct.setTwoWayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INTIMACY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intimacy = iprot.readI32();
              struct.setIntimacyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FriendInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.simpleCardInfo != null) {
        oprot.writeFieldBegin(SIMPLE_CARD_INFO_FIELD_DESC);
        struct.simpleCardInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TWO_WAY_FIELD_DESC);
      oprot.writeBool(struct.twoWay);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INTIMACY_FIELD_DESC);
      oprot.writeI32(struct.intimacy);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FriendInfoTupleSchemeFactory implements SchemeFactory {
    public FriendInfoTupleScheme getScheme() {
      return new FriendInfoTupleScheme();
    }
  }

  private static class FriendInfoTupleScheme extends TupleScheme<FriendInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FriendInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSimpleCardInfo()) {
        optionals.set(0);
      }
      if (struct.isSetTwoWay()) {
        optionals.set(1);
      }
      if (struct.isSetIntimacy()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSimpleCardInfo()) {
        struct.simpleCardInfo.write(oprot);
      }
      if (struct.isSetTwoWay()) {
        oprot.writeBool(struct.twoWay);
      }
      if (struct.isSetIntimacy()) {
        oprot.writeI32(struct.intimacy);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FriendInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.simpleCardInfo = new SimpleBusinessCardInfo();
        struct.simpleCardInfo.read(iprot);
        struct.setSimpleCardInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.twoWay = iprot.readBool();
        struct.setTwoWayIsSet(true);
      }
      if (incoming.get(2)) {
        struct.intimacy = iprot.readI32();
        struct.setIntimacyIsSet(true);
      }
    }
  }

}
