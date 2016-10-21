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
 * 查询巡演星数奖励状态信息
 */
public class CSGetTourStarPrizeStatus implements org.apache.thrift.TBase<CSGetTourStarPrizeStatus, CSGetTourStarPrizeStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSGetTourStarPrizeStatus");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHAPTER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chapterId", org.apache.thrift.protocol.TType.I16, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSGetTourStarPrizeStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSGetTourStarPrizeStatusTupleSchemeFactory());
  }

  /**
   * 星数奖励信息版本号， 默认0
   */
  public int version; // required
  /**
   * 章节id
   */
  public short chapterId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 星数奖励信息版本号， 默认0
     */
    VERSION((short)1, "version"),
    /**
     * 章节id
     */
    CHAPTER_ID((short)2, "chapterId");

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
        case 1: // VERSION
          return VERSION;
        case 2: // CHAPTER_ID
          return CHAPTER_ID;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __CHAPTERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHAPTER_ID, new org.apache.thrift.meta_data.FieldMetaData("chapterId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSGetTourStarPrizeStatus.class, metaDataMap);
  }

  public CSGetTourStarPrizeStatus() {
  }

  public CSGetTourStarPrizeStatus(
    int version,
    short chapterId)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.chapterId = chapterId;
    setChapterIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSGetTourStarPrizeStatus(CSGetTourStarPrizeStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    this.chapterId = other.chapterId;
  }

  public CSGetTourStarPrizeStatus deepCopy() {
    return new CSGetTourStarPrizeStatus(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    setChapterIdIsSet(false);
    this.chapterId = 0;
  }

  /**
   * 星数奖励信息版本号， 默认0
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * 星数奖励信息版本号， 默认0
   */
  public CSGetTourStarPrizeStatus setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  /**
   * 章节id
   */
  public short getChapterId() {
    return this.chapterId;
  }

  /**
   * 章节id
   */
  public CSGetTourStarPrizeStatus setChapterId(short chapterId) {
    this.chapterId = chapterId;
    setChapterIdIsSet(true);
    return this;
  }

  public void unsetChapterId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHAPTERID_ISSET_ID);
  }

  /** Returns true if field chapterId is set (has been assigned a value) and false otherwise */
  public boolean isSetChapterId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHAPTERID_ISSET_ID);
  }

  public void setChapterIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHAPTERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case CHAPTER_ID:
      if (value == null) {
        unsetChapterId();
      } else {
        setChapterId((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Integer.valueOf(getVersion());

    case CHAPTER_ID:
      return Short.valueOf(getChapterId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case CHAPTER_ID:
      return isSetChapterId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSGetTourStarPrizeStatus)
      return this.equals((CSGetTourStarPrizeStatus)that);
    return false;
  }

  public boolean equals(CSGetTourStarPrizeStatus that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_chapterId = true;
    boolean that_present_chapterId = true;
    if (this_present_chapterId || that_present_chapterId) {
      if (!(this_present_chapterId && that_present_chapterId))
        return false;
      if (this.chapterId != that.chapterId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSGetTourStarPrizeStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSGetTourStarPrizeStatus typedOther = (CSGetTourStarPrizeStatus)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChapterId()).compareTo(typedOther.isSetChapterId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChapterId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chapterId, typedOther.chapterId);
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
    StringBuilder sb = new StringBuilder("CSGetTourStarPrizeStatus(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("chapterId:");
    sb.append(this.chapterId);
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

  private static class CSGetTourStarPrizeStatusStandardSchemeFactory implements SchemeFactory {
    public CSGetTourStarPrizeStatusStandardScheme getScheme() {
      return new CSGetTourStarPrizeStatusStandardScheme();
    }
  }

  private static class CSGetTourStarPrizeStatusStandardScheme extends StandardScheme<CSGetTourStarPrizeStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSGetTourStarPrizeStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHAPTER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.chapterId = iprot.readI16();
              struct.setChapterIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSGetTourStarPrizeStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHAPTER_ID_FIELD_DESC);
      oprot.writeI16(struct.chapterId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSGetTourStarPrizeStatusTupleSchemeFactory implements SchemeFactory {
    public CSGetTourStarPrizeStatusTupleScheme getScheme() {
      return new CSGetTourStarPrizeStatusTupleScheme();
    }
  }

  private static class CSGetTourStarPrizeStatusTupleScheme extends TupleScheme<CSGetTourStarPrizeStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSGetTourStarPrizeStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetChapterId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetChapterId()) {
        oprot.writeI16(struct.chapterId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSGetTourStarPrizeStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.chapterId = iprot.readI16();
        struct.setChapterIdIsSet(true);
      }
    }
  }

}

