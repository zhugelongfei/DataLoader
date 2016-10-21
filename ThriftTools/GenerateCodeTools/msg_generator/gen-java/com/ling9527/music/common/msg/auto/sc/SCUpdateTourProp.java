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
 * 更新巡演属性信息
 */
public class SCUpdateTourProp implements org.apache.thrift.TBase<SCUpdateTourProp, SCUpdateTourProp._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCUpdateTourProp");

  private static final org.apache.thrift.protocol.TField CHAPTER_STARS_FIELD_DESC = new org.apache.thrift.protocol.TField("chapterStars", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LEFT_TOUR_TIMES_FIELD_DESC = new org.apache.thrift.protocol.TField("leftTourTimes", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DAY_BUY_TIMES_FIELD_DESC = new org.apache.thrift.protocol.TField("dayBuyTimes", org.apache.thrift.protocol.TType.I16, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCUpdateTourPropStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCUpdateTourPropTupleSchemeFactory());
  }

  /**
   * 章节获得星数
   */
  public ChapterStars chapterStars; // optional
  /**
   * 剩余巡演次数
   */
  public int leftTourTimes; // optional
  /**
   * 今日已购买次数
   */
  public short dayBuyTimes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 章节获得星数
     */
    CHAPTER_STARS((short)1, "chapterStars"),
    /**
     * 剩余巡演次数
     */
    LEFT_TOUR_TIMES((short)2, "leftTourTimes"),
    /**
     * 今日已购买次数
     */
    DAY_BUY_TIMES((short)3, "dayBuyTimes");

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
        case 1: // CHAPTER_STARS
          return CHAPTER_STARS;
        case 2: // LEFT_TOUR_TIMES
          return LEFT_TOUR_TIMES;
        case 3: // DAY_BUY_TIMES
          return DAY_BUY_TIMES;
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
  private static final int __LEFTTOURTIMES_ISSET_ID = 0;
  private static final int __DAYBUYTIMES_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CHAPTER_STARS,_Fields.LEFT_TOUR_TIMES,_Fields.DAY_BUY_TIMES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHAPTER_STARS, new org.apache.thrift.meta_data.FieldMetaData("chapterStars", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ChapterStars.class)));
    tmpMap.put(_Fields.LEFT_TOUR_TIMES, new org.apache.thrift.meta_data.FieldMetaData("leftTourTimes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DAY_BUY_TIMES, new org.apache.thrift.meta_data.FieldMetaData("dayBuyTimes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCUpdateTourProp.class, metaDataMap);
  }

  public SCUpdateTourProp() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCUpdateTourProp(SCUpdateTourProp other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChapterStars()) {
      this.chapterStars = new ChapterStars(other.chapterStars);
    }
    this.leftTourTimes = other.leftTourTimes;
    this.dayBuyTimes = other.dayBuyTimes;
  }

  public SCUpdateTourProp deepCopy() {
    return new SCUpdateTourProp(this);
  }

  @Override
  public void clear() {
    this.chapterStars = null;
    setLeftTourTimesIsSet(false);
    this.leftTourTimes = 0;
    setDayBuyTimesIsSet(false);
    this.dayBuyTimes = 0;
  }

  /**
   * 章节获得星数
   */
  public ChapterStars getChapterStars() {
    return this.chapterStars;
  }

  /**
   * 章节获得星数
   */
  public SCUpdateTourProp setChapterStars(ChapterStars chapterStars) {
    this.chapterStars = chapterStars;
    return this;
  }

  public void unsetChapterStars() {
    this.chapterStars = null;
  }

  /** Returns true if field chapterStars is set (has been assigned a value) and false otherwise */
  public boolean isSetChapterStars() {
    return this.chapterStars != null;
  }

  public void setChapterStarsIsSet(boolean value) {
    if (!value) {
      this.chapterStars = null;
    }
  }

  /**
   * 剩余巡演次数
   */
  public int getLeftTourTimes() {
    return this.leftTourTimes;
  }

  /**
   * 剩余巡演次数
   */
  public SCUpdateTourProp setLeftTourTimes(int leftTourTimes) {
    this.leftTourTimes = leftTourTimes;
    setLeftTourTimesIsSet(true);
    return this;
  }

  public void unsetLeftTourTimes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEFTTOURTIMES_ISSET_ID);
  }

  /** Returns true if field leftTourTimes is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftTourTimes() {
    return EncodingUtils.testBit(__isset_bitfield, __LEFTTOURTIMES_ISSET_ID);
  }

  public void setLeftTourTimesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEFTTOURTIMES_ISSET_ID, value);
  }

  /**
   * 今日已购买次数
   */
  public short getDayBuyTimes() {
    return this.dayBuyTimes;
  }

  /**
   * 今日已购买次数
   */
  public SCUpdateTourProp setDayBuyTimes(short dayBuyTimes) {
    this.dayBuyTimes = dayBuyTimes;
    setDayBuyTimesIsSet(true);
    return this;
  }

  public void unsetDayBuyTimes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DAYBUYTIMES_ISSET_ID);
  }

  /** Returns true if field dayBuyTimes is set (has been assigned a value) and false otherwise */
  public boolean isSetDayBuyTimes() {
    return EncodingUtils.testBit(__isset_bitfield, __DAYBUYTIMES_ISSET_ID);
  }

  public void setDayBuyTimesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DAYBUYTIMES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHAPTER_STARS:
      if (value == null) {
        unsetChapterStars();
      } else {
        setChapterStars((ChapterStars)value);
      }
      break;

    case LEFT_TOUR_TIMES:
      if (value == null) {
        unsetLeftTourTimes();
      } else {
        setLeftTourTimes((Integer)value);
      }
      break;

    case DAY_BUY_TIMES:
      if (value == null) {
        unsetDayBuyTimes();
      } else {
        setDayBuyTimes((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHAPTER_STARS:
      return getChapterStars();

    case LEFT_TOUR_TIMES:
      return Integer.valueOf(getLeftTourTimes());

    case DAY_BUY_TIMES:
      return Short.valueOf(getDayBuyTimes());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHAPTER_STARS:
      return isSetChapterStars();
    case LEFT_TOUR_TIMES:
      return isSetLeftTourTimes();
    case DAY_BUY_TIMES:
      return isSetDayBuyTimes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCUpdateTourProp)
      return this.equals((SCUpdateTourProp)that);
    return false;
  }

  public boolean equals(SCUpdateTourProp that) {
    if (that == null)
      return false;

    boolean this_present_chapterStars = true && this.isSetChapterStars();
    boolean that_present_chapterStars = true && that.isSetChapterStars();
    if (this_present_chapterStars || that_present_chapterStars) {
      if (!(this_present_chapterStars && that_present_chapterStars))
        return false;
      if (!this.chapterStars.equals(that.chapterStars))
        return false;
    }

    boolean this_present_leftTourTimes = true && this.isSetLeftTourTimes();
    boolean that_present_leftTourTimes = true && that.isSetLeftTourTimes();
    if (this_present_leftTourTimes || that_present_leftTourTimes) {
      if (!(this_present_leftTourTimes && that_present_leftTourTimes))
        return false;
      if (this.leftTourTimes != that.leftTourTimes)
        return false;
    }

    boolean this_present_dayBuyTimes = true && this.isSetDayBuyTimes();
    boolean that_present_dayBuyTimes = true && that.isSetDayBuyTimes();
    if (this_present_dayBuyTimes || that_present_dayBuyTimes) {
      if (!(this_present_dayBuyTimes && that_present_dayBuyTimes))
        return false;
      if (this.dayBuyTimes != that.dayBuyTimes)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCUpdateTourProp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCUpdateTourProp typedOther = (SCUpdateTourProp)other;

    lastComparison = Boolean.valueOf(isSetChapterStars()).compareTo(typedOther.isSetChapterStars());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChapterStars()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chapterStars, typedOther.chapterStars);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeftTourTimes()).compareTo(typedOther.isSetLeftTourTimes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftTourTimes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftTourTimes, typedOther.leftTourTimes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDayBuyTimes()).compareTo(typedOther.isSetDayBuyTimes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDayBuyTimes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dayBuyTimes, typedOther.dayBuyTimes);
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
    StringBuilder sb = new StringBuilder("SCUpdateTourProp(");
    boolean first = true;

    if (isSetChapterStars()) {
      sb.append("chapterStars:");
      if (this.chapterStars == null) {
        sb.append("null");
      } else {
        sb.append(this.chapterStars);
      }
      first = false;
    }
    if (isSetLeftTourTimes()) {
      if (!first) sb.append(", ");
      sb.append("leftTourTimes:");
      sb.append(this.leftTourTimes);
      first = false;
    }
    if (isSetDayBuyTimes()) {
      if (!first) sb.append(", ");
      sb.append("dayBuyTimes:");
      sb.append(this.dayBuyTimes);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (chapterStars != null) {
      chapterStars.validate();
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

  private static class SCUpdateTourPropStandardSchemeFactory implements SchemeFactory {
    public SCUpdateTourPropStandardScheme getScheme() {
      return new SCUpdateTourPropStandardScheme();
    }
  }

  private static class SCUpdateTourPropStandardScheme extends StandardScheme<SCUpdateTourProp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCUpdateTourProp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHAPTER_STARS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.chapterStars = new ChapterStars();
              struct.chapterStars.read(iprot);
              struct.setChapterStarsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEFT_TOUR_TIMES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leftTourTimes = iprot.readI32();
              struct.setLeftTourTimesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DAY_BUY_TIMES
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.dayBuyTimes = iprot.readI16();
              struct.setDayBuyTimesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCUpdateTourProp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.chapterStars != null) {
        if (struct.isSetChapterStars()) {
          oprot.writeFieldBegin(CHAPTER_STARS_FIELD_DESC);
          struct.chapterStars.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLeftTourTimes()) {
        oprot.writeFieldBegin(LEFT_TOUR_TIMES_FIELD_DESC);
        oprot.writeI32(struct.leftTourTimes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDayBuyTimes()) {
        oprot.writeFieldBegin(DAY_BUY_TIMES_FIELD_DESC);
        oprot.writeI16(struct.dayBuyTimes);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCUpdateTourPropTupleSchemeFactory implements SchemeFactory {
    public SCUpdateTourPropTupleScheme getScheme() {
      return new SCUpdateTourPropTupleScheme();
    }
  }

  private static class SCUpdateTourPropTupleScheme extends TupleScheme<SCUpdateTourProp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCUpdateTourProp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChapterStars()) {
        optionals.set(0);
      }
      if (struct.isSetLeftTourTimes()) {
        optionals.set(1);
      }
      if (struct.isSetDayBuyTimes()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetChapterStars()) {
        struct.chapterStars.write(oprot);
      }
      if (struct.isSetLeftTourTimes()) {
        oprot.writeI32(struct.leftTourTimes);
      }
      if (struct.isSetDayBuyTimes()) {
        oprot.writeI16(struct.dayBuyTimes);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCUpdateTourProp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.chapterStars = new ChapterStars();
        struct.chapterStars.read(iprot);
        struct.setChapterStarsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.leftTourTimes = iprot.readI32();
        struct.setLeftTourTimesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dayBuyTimes = iprot.readI16();
        struct.setDayBuyTimesIsSet(true);
      }
    }
  }

}

