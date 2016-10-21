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

public class TouchRecordInfo implements org.apache.thrift.TBase<TouchRecordInfo, TouchRecordInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TouchRecordInfo");

  private static final org.apache.thrift.protocol.TField PERSON_TOUCHING_FIELD_DESC = new org.apache.thrift.protocol.TField("personTouching", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PERSON_TOUCHED_FIELD_DESC = new org.apache.thrift.protocol.TField("personTouched", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TOUCHING_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("touchingTime", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TOUCHING_POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("touchingPosition", org.apache.thrift.protocol.TType.BYTE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TouchRecordInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TouchRecordInfoTupleSchemeFactory());
  }

  public String personTouching; // required
  public String personTouched; // required
  public int touchingTime; // required
  public byte touchingPosition; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERSON_TOUCHING((short)1, "personTouching"),
    PERSON_TOUCHED((short)2, "personTouched"),
    TOUCHING_TIME((short)3, "touchingTime"),
    TOUCHING_POSITION((short)4, "touchingPosition");

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
        case 1: // PERSON_TOUCHING
          return PERSON_TOUCHING;
        case 2: // PERSON_TOUCHED
          return PERSON_TOUCHED;
        case 3: // TOUCHING_TIME
          return TOUCHING_TIME;
        case 4: // TOUCHING_POSITION
          return TOUCHING_POSITION;
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
  private static final int __TOUCHINGTIME_ISSET_ID = 0;
  private static final int __TOUCHINGPOSITION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERSON_TOUCHING, new org.apache.thrift.meta_data.FieldMetaData("personTouching", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERSON_TOUCHED, new org.apache.thrift.meta_data.FieldMetaData("personTouched", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOUCHING_TIME, new org.apache.thrift.meta_data.FieldMetaData("touchingTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOUCHING_POSITION, new org.apache.thrift.meta_data.FieldMetaData("touchingPosition", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TouchRecordInfo.class, metaDataMap);
  }

  public TouchRecordInfo() {
  }

  public TouchRecordInfo(
    String personTouching,
    String personTouched,
    int touchingTime,
    byte touchingPosition)
  {
    this();
    this.personTouching = personTouching;
    this.personTouched = personTouched;
    this.touchingTime = touchingTime;
    setTouchingTimeIsSet(true);
    this.touchingPosition = touchingPosition;
    setTouchingPositionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TouchRecordInfo(TouchRecordInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPersonTouching()) {
      this.personTouching = other.personTouching;
    }
    if (other.isSetPersonTouched()) {
      this.personTouched = other.personTouched;
    }
    this.touchingTime = other.touchingTime;
    this.touchingPosition = other.touchingPosition;
  }

  public TouchRecordInfo deepCopy() {
    return new TouchRecordInfo(this);
  }

  @Override
  public void clear() {
    this.personTouching = null;
    this.personTouched = null;
    setTouchingTimeIsSet(false);
    this.touchingTime = 0;
    setTouchingPositionIsSet(false);
    this.touchingPosition = 0;
  }

  public String getPersonTouching() {
    return this.personTouching;
  }

  public TouchRecordInfo setPersonTouching(String personTouching) {
    this.personTouching = personTouching;
    return this;
  }

  public void unsetPersonTouching() {
    this.personTouching = null;
  }

  /** Returns true if field personTouching is set (has been assigned a value) and false otherwise */
  public boolean isSetPersonTouching() {
    return this.personTouching != null;
  }

  public void setPersonTouchingIsSet(boolean value) {
    if (!value) {
      this.personTouching = null;
    }
  }

  public String getPersonTouched() {
    return this.personTouched;
  }

  public TouchRecordInfo setPersonTouched(String personTouched) {
    this.personTouched = personTouched;
    return this;
  }

  public void unsetPersonTouched() {
    this.personTouched = null;
  }

  /** Returns true if field personTouched is set (has been assigned a value) and false otherwise */
  public boolean isSetPersonTouched() {
    return this.personTouched != null;
  }

  public void setPersonTouchedIsSet(boolean value) {
    if (!value) {
      this.personTouched = null;
    }
  }

  public int getTouchingTime() {
    return this.touchingTime;
  }

  public TouchRecordInfo setTouchingTime(int touchingTime) {
    this.touchingTime = touchingTime;
    setTouchingTimeIsSet(true);
    return this;
  }

  public void unsetTouchingTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOUCHINGTIME_ISSET_ID);
  }

  /** Returns true if field touchingTime is set (has been assigned a value) and false otherwise */
  public boolean isSetTouchingTime() {
    return EncodingUtils.testBit(__isset_bitfield, __TOUCHINGTIME_ISSET_ID);
  }

  public void setTouchingTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOUCHINGTIME_ISSET_ID, value);
  }

  public byte getTouchingPosition() {
    return this.touchingPosition;
  }

  public TouchRecordInfo setTouchingPosition(byte touchingPosition) {
    this.touchingPosition = touchingPosition;
    setTouchingPositionIsSet(true);
    return this;
  }

  public void unsetTouchingPosition() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOUCHINGPOSITION_ISSET_ID);
  }

  /** Returns true if field touchingPosition is set (has been assigned a value) and false otherwise */
  public boolean isSetTouchingPosition() {
    return EncodingUtils.testBit(__isset_bitfield, __TOUCHINGPOSITION_ISSET_ID);
  }

  public void setTouchingPositionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOUCHINGPOSITION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERSON_TOUCHING:
      if (value == null) {
        unsetPersonTouching();
      } else {
        setPersonTouching((String)value);
      }
      break;

    case PERSON_TOUCHED:
      if (value == null) {
        unsetPersonTouched();
      } else {
        setPersonTouched((String)value);
      }
      break;

    case TOUCHING_TIME:
      if (value == null) {
        unsetTouchingTime();
      } else {
        setTouchingTime((Integer)value);
      }
      break;

    case TOUCHING_POSITION:
      if (value == null) {
        unsetTouchingPosition();
      } else {
        setTouchingPosition((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERSON_TOUCHING:
      return getPersonTouching();

    case PERSON_TOUCHED:
      return getPersonTouched();

    case TOUCHING_TIME:
      return Integer.valueOf(getTouchingTime());

    case TOUCHING_POSITION:
      return Byte.valueOf(getTouchingPosition());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERSON_TOUCHING:
      return isSetPersonTouching();
    case PERSON_TOUCHED:
      return isSetPersonTouched();
    case TOUCHING_TIME:
      return isSetTouchingTime();
    case TOUCHING_POSITION:
      return isSetTouchingPosition();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TouchRecordInfo)
      return this.equals((TouchRecordInfo)that);
    return false;
  }

  public boolean equals(TouchRecordInfo that) {
    if (that == null)
      return false;

    boolean this_present_personTouching = true && this.isSetPersonTouching();
    boolean that_present_personTouching = true && that.isSetPersonTouching();
    if (this_present_personTouching || that_present_personTouching) {
      if (!(this_present_personTouching && that_present_personTouching))
        return false;
      if (!this.personTouching.equals(that.personTouching))
        return false;
    }

    boolean this_present_personTouched = true && this.isSetPersonTouched();
    boolean that_present_personTouched = true && that.isSetPersonTouched();
    if (this_present_personTouched || that_present_personTouched) {
      if (!(this_present_personTouched && that_present_personTouched))
        return false;
      if (!this.personTouched.equals(that.personTouched))
        return false;
    }

    boolean this_present_touchingTime = true;
    boolean that_present_touchingTime = true;
    if (this_present_touchingTime || that_present_touchingTime) {
      if (!(this_present_touchingTime && that_present_touchingTime))
        return false;
      if (this.touchingTime != that.touchingTime)
        return false;
    }

    boolean this_present_touchingPosition = true;
    boolean that_present_touchingPosition = true;
    if (this_present_touchingPosition || that_present_touchingPosition) {
      if (!(this_present_touchingPosition && that_present_touchingPosition))
        return false;
      if (this.touchingPosition != that.touchingPosition)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TouchRecordInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TouchRecordInfo typedOther = (TouchRecordInfo)other;

    lastComparison = Boolean.valueOf(isSetPersonTouching()).compareTo(typedOther.isSetPersonTouching());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersonTouching()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.personTouching, typedOther.personTouching);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPersonTouched()).compareTo(typedOther.isSetPersonTouched());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersonTouched()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.personTouched, typedOther.personTouched);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTouchingTime()).compareTo(typedOther.isSetTouchingTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTouchingTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.touchingTime, typedOther.touchingTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTouchingPosition()).compareTo(typedOther.isSetTouchingPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTouchingPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.touchingPosition, typedOther.touchingPosition);
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
    StringBuilder sb = new StringBuilder("TouchRecordInfo(");
    boolean first = true;

    sb.append("personTouching:");
    if (this.personTouching == null) {
      sb.append("null");
    } else {
      sb.append(this.personTouching);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("personTouched:");
    if (this.personTouched == null) {
      sb.append("null");
    } else {
      sb.append(this.personTouched);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("touchingTime:");
    sb.append(this.touchingTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("touchingPosition:");
    sb.append(this.touchingPosition);
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

  private static class TouchRecordInfoStandardSchemeFactory implements SchemeFactory {
    public TouchRecordInfoStandardScheme getScheme() {
      return new TouchRecordInfoStandardScheme();
    }
  }

  private static class TouchRecordInfoStandardScheme extends StandardScheme<TouchRecordInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TouchRecordInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERSON_TOUCHING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.personTouching = iprot.readString();
              struct.setPersonTouchingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PERSON_TOUCHED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.personTouched = iprot.readString();
              struct.setPersonTouchedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOUCHING_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.touchingTime = iprot.readI32();
              struct.setTouchingTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOUCHING_POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.touchingPosition = iprot.readByte();
              struct.setTouchingPositionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TouchRecordInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.personTouching != null) {
        oprot.writeFieldBegin(PERSON_TOUCHING_FIELD_DESC);
        oprot.writeString(struct.personTouching);
        oprot.writeFieldEnd();
      }
      if (struct.personTouched != null) {
        oprot.writeFieldBegin(PERSON_TOUCHED_FIELD_DESC);
        oprot.writeString(struct.personTouched);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOUCHING_TIME_FIELD_DESC);
      oprot.writeI32(struct.touchingTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOUCHING_POSITION_FIELD_DESC);
      oprot.writeByte(struct.touchingPosition);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TouchRecordInfoTupleSchemeFactory implements SchemeFactory {
    public TouchRecordInfoTupleScheme getScheme() {
      return new TouchRecordInfoTupleScheme();
    }
  }

  private static class TouchRecordInfoTupleScheme extends TupleScheme<TouchRecordInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TouchRecordInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPersonTouching()) {
        optionals.set(0);
      }
      if (struct.isSetPersonTouched()) {
        optionals.set(1);
      }
      if (struct.isSetTouchingTime()) {
        optionals.set(2);
      }
      if (struct.isSetTouchingPosition()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPersonTouching()) {
        oprot.writeString(struct.personTouching);
      }
      if (struct.isSetPersonTouched()) {
        oprot.writeString(struct.personTouched);
      }
      if (struct.isSetTouchingTime()) {
        oprot.writeI32(struct.touchingTime);
      }
      if (struct.isSetTouchingPosition()) {
        oprot.writeByte(struct.touchingPosition);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TouchRecordInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.personTouching = iprot.readString();
        struct.setPersonTouchingIsSet(true);
      }
      if (incoming.get(1)) {
        struct.personTouched = iprot.readString();
        struct.setPersonTouchedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.touchingTime = iprot.readI32();
        struct.setTouchingTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.touchingPosition = iprot.readByte();
        struct.setTouchingPositionIsSet(true);
      }
    }
  }

}
