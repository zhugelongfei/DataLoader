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

public class CSMyDonatesMsg implements org.apache.thrift.TBase<CSMyDonatesMsg, CSMyDonatesMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSMyDonatesMsg");

  private static final org.apache.thrift.protocol.TField CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("charId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField START_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("startIndex", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("size", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSMyDonatesMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSMyDonatesMsgTupleSchemeFactory());
  }

  public long charId; // required
  public int startIndex; // required
  public int size; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHAR_ID((short)1, "charId"),
    START_INDEX((short)2, "startIndex"),
    SIZE((short)3, "size");

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
        case 1: // CHAR_ID
          return CHAR_ID;
        case 2: // START_INDEX
          return START_INDEX;
        case 3: // SIZE
          return SIZE;
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
  private static final int __CHARID_ISSET_ID = 0;
  private static final int __STARTINDEX_ISSET_ID = 1;
  private static final int __SIZE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("charId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.START_INDEX, new org.apache.thrift.meta_data.FieldMetaData("startIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SIZE, new org.apache.thrift.meta_data.FieldMetaData("size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSMyDonatesMsg.class, metaDataMap);
  }

  public CSMyDonatesMsg() {
  }

  public CSMyDonatesMsg(
    long charId,
    int startIndex,
    int size)
  {
    this();
    this.charId = charId;
    setCharIdIsSet(true);
    this.startIndex = startIndex;
    setStartIndexIsSet(true);
    this.size = size;
    setSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSMyDonatesMsg(CSMyDonatesMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.charId = other.charId;
    this.startIndex = other.startIndex;
    this.size = other.size;
  }

  public CSMyDonatesMsg deepCopy() {
    return new CSMyDonatesMsg(this);
  }

  @Override
  public void clear() {
    setCharIdIsSet(false);
    this.charId = 0;
    setStartIndexIsSet(false);
    this.startIndex = 0;
    setSizeIsSet(false);
    this.size = 0;
  }

  public long getCharId() {
    return this.charId;
  }

  public CSMyDonatesMsg setCharId(long charId) {
    this.charId = charId;
    setCharIdIsSet(true);
    return this;
  }

  public void unsetCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  /** Returns true if field charId is set (has been assigned a value) and false otherwise */
  public boolean isSetCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  public void setCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARID_ISSET_ID, value);
  }

  public int getStartIndex() {
    return this.startIndex;
  }

  public CSMyDonatesMsg setStartIndex(int startIndex) {
    this.startIndex = startIndex;
    setStartIndexIsSet(true);
    return this;
  }

  public void unsetStartIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTINDEX_ISSET_ID);
  }

  /** Returns true if field startIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetStartIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTINDEX_ISSET_ID);
  }

  public void setStartIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTINDEX_ISSET_ID, value);
  }

  public int getSize() {
    return this.size;
  }

  public CSMyDonatesMsg setSize(int size) {
    this.size = size;
    setSizeIsSet(true);
    return this;
  }

  public void unsetSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  /** Returns true if field size is set (has been assigned a value) and false otherwise */
  public boolean isSetSize() {
    return EncodingUtils.testBit(__isset_bitfield, __SIZE_ISSET_ID);
  }

  public void setSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SIZE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHAR_ID:
      if (value == null) {
        unsetCharId();
      } else {
        setCharId((Long)value);
      }
      break;

    case START_INDEX:
      if (value == null) {
        unsetStartIndex();
      } else {
        setStartIndex((Integer)value);
      }
      break;

    case SIZE:
      if (value == null) {
        unsetSize();
      } else {
        setSize((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHAR_ID:
      return Long.valueOf(getCharId());

    case START_INDEX:
      return Integer.valueOf(getStartIndex());

    case SIZE:
      return Integer.valueOf(getSize());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHAR_ID:
      return isSetCharId();
    case START_INDEX:
      return isSetStartIndex();
    case SIZE:
      return isSetSize();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSMyDonatesMsg)
      return this.equals((CSMyDonatesMsg)that);
    return false;
  }

  public boolean equals(CSMyDonatesMsg that) {
    if (that == null)
      return false;

    boolean this_present_charId = true;
    boolean that_present_charId = true;
    if (this_present_charId || that_present_charId) {
      if (!(this_present_charId && that_present_charId))
        return false;
      if (this.charId != that.charId)
        return false;
    }

    boolean this_present_startIndex = true;
    boolean that_present_startIndex = true;
    if (this_present_startIndex || that_present_startIndex) {
      if (!(this_present_startIndex && that_present_startIndex))
        return false;
      if (this.startIndex != that.startIndex)
        return false;
    }

    boolean this_present_size = true;
    boolean that_present_size = true;
    if (this_present_size || that_present_size) {
      if (!(this_present_size && that_present_size))
        return false;
      if (this.size != that.size)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSMyDonatesMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSMyDonatesMsg typedOther = (CSMyDonatesMsg)other;

    lastComparison = Boolean.valueOf(isSetCharId()).compareTo(typedOther.isSetCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.charId, typedOther.charId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartIndex()).compareTo(typedOther.isSetStartIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startIndex, typedOther.startIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSize()).compareTo(typedOther.isSetSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.size, typedOther.size);
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
    StringBuilder sb = new StringBuilder("CSMyDonatesMsg(");
    boolean first = true;

    sb.append("charId:");
    sb.append(this.charId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startIndex:");
    sb.append(this.startIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("size:");
    sb.append(this.size);
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

  private static class CSMyDonatesMsgStandardSchemeFactory implements SchemeFactory {
    public CSMyDonatesMsgStandardScheme getScheme() {
      return new CSMyDonatesMsgStandardScheme();
    }
  }

  private static class CSMyDonatesMsgStandardScheme extends StandardScheme<CSMyDonatesMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSMyDonatesMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.charId = iprot.readI64();
              struct.setCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.startIndex = iprot.readI32();
              struct.setStartIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.size = iprot.readI32();
              struct.setSizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSMyDonatesMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.charId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_INDEX_FIELD_DESC);
      oprot.writeI32(struct.startIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SIZE_FIELD_DESC);
      oprot.writeI32(struct.size);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSMyDonatesMsgTupleSchemeFactory implements SchemeFactory {
    public CSMyDonatesMsgTupleScheme getScheme() {
      return new CSMyDonatesMsgTupleScheme();
    }
  }

  private static class CSMyDonatesMsgTupleScheme extends TupleScheme<CSMyDonatesMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSMyDonatesMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCharId()) {
        optionals.set(0);
      }
      if (struct.isSetStartIndex()) {
        optionals.set(1);
      }
      if (struct.isSetSize()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCharId()) {
        oprot.writeI64(struct.charId);
      }
      if (struct.isSetStartIndex()) {
        oprot.writeI32(struct.startIndex);
      }
      if (struct.isSetSize()) {
        oprot.writeI32(struct.size);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSMyDonatesMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.charId = iprot.readI64();
        struct.setCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startIndex = iprot.readI32();
        struct.setStartIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.size = iprot.readI32();
        struct.setSizeIsSet(true);
      }
    }
  }

}

