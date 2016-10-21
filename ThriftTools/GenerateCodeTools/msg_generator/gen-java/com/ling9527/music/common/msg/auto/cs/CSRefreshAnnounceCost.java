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
 * 请求刷新通告冷却时间消耗
 */
public class CSRefreshAnnounceCost implements org.apache.thrift.TBase<CSRefreshAnnounceCost, CSRefreshAnnounceCost._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSRefreshAnnounceCost");

  private static final org.apache.thrift.protocol.TField ANNOUNCE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("announceIndex", org.apache.thrift.protocol.TType.BYTE, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSRefreshAnnounceCostStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSRefreshAnnounceCostTupleSchemeFactory());
  }

  /**
   * 通告索引
   */
  public byte announceIndex; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 通告索引
     */
    ANNOUNCE_INDEX((short)1, "announceIndex");

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
        case 1: // ANNOUNCE_INDEX
          return ANNOUNCE_INDEX;
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
  private static final int __ANNOUNCEINDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANNOUNCE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("announceIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSRefreshAnnounceCost.class, metaDataMap);
  }

  public CSRefreshAnnounceCost() {
  }

  public CSRefreshAnnounceCost(
    byte announceIndex)
  {
    this();
    this.announceIndex = announceIndex;
    setAnnounceIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSRefreshAnnounceCost(CSRefreshAnnounceCost other) {
    __isset_bitfield = other.__isset_bitfield;
    this.announceIndex = other.announceIndex;
  }

  public CSRefreshAnnounceCost deepCopy() {
    return new CSRefreshAnnounceCost(this);
  }

  @Override
  public void clear() {
    setAnnounceIndexIsSet(false);
    this.announceIndex = 0;
  }

  /**
   * 通告索引
   */
  public byte getAnnounceIndex() {
    return this.announceIndex;
  }

  /**
   * 通告索引
   */
  public CSRefreshAnnounceCost setAnnounceIndex(byte announceIndex) {
    this.announceIndex = announceIndex;
    setAnnounceIndexIsSet(true);
    return this;
  }

  public void unsetAnnounceIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ANNOUNCEINDEX_ISSET_ID);
  }

  /** Returns true if field announceIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnounceIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __ANNOUNCEINDEX_ISSET_ID);
  }

  public void setAnnounceIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ANNOUNCEINDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ANNOUNCE_INDEX:
      if (value == null) {
        unsetAnnounceIndex();
      } else {
        setAnnounceIndex((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ANNOUNCE_INDEX:
      return Byte.valueOf(getAnnounceIndex());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ANNOUNCE_INDEX:
      return isSetAnnounceIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSRefreshAnnounceCost)
      return this.equals((CSRefreshAnnounceCost)that);
    return false;
  }

  public boolean equals(CSRefreshAnnounceCost that) {
    if (that == null)
      return false;

    boolean this_present_announceIndex = true;
    boolean that_present_announceIndex = true;
    if (this_present_announceIndex || that_present_announceIndex) {
      if (!(this_present_announceIndex && that_present_announceIndex))
        return false;
      if (this.announceIndex != that.announceIndex)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSRefreshAnnounceCost other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSRefreshAnnounceCost typedOther = (CSRefreshAnnounceCost)other;

    lastComparison = Boolean.valueOf(isSetAnnounceIndex()).compareTo(typedOther.isSetAnnounceIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnounceIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announceIndex, typedOther.announceIndex);
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
    StringBuilder sb = new StringBuilder("CSRefreshAnnounceCost(");
    boolean first = true;

    sb.append("announceIndex:");
    sb.append(this.announceIndex);
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

  private static class CSRefreshAnnounceCostStandardSchemeFactory implements SchemeFactory {
    public CSRefreshAnnounceCostStandardScheme getScheme() {
      return new CSRefreshAnnounceCostStandardScheme();
    }
  }

  private static class CSRefreshAnnounceCostStandardScheme extends StandardScheme<CSRefreshAnnounceCost> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSRefreshAnnounceCost struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANNOUNCE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.announceIndex = iprot.readByte();
              struct.setAnnounceIndexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSRefreshAnnounceCost struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ANNOUNCE_INDEX_FIELD_DESC);
      oprot.writeByte(struct.announceIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSRefreshAnnounceCostTupleSchemeFactory implements SchemeFactory {
    public CSRefreshAnnounceCostTupleScheme getScheme() {
      return new CSRefreshAnnounceCostTupleScheme();
    }
  }

  private static class CSRefreshAnnounceCostTupleScheme extends TupleScheme<CSRefreshAnnounceCost> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSRefreshAnnounceCost struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAnnounceIndex()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAnnounceIndex()) {
        oprot.writeByte(struct.announceIndex);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSRefreshAnnounceCost struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.announceIndex = iprot.readByte();
        struct.setAnnounceIndexIsSet(true);
      }
    }
  }

}

