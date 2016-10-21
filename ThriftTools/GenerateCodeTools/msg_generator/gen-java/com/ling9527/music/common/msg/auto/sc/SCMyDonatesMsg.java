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

public class SCMyDonatesMsg implements org.apache.thrift.TBase<SCMyDonatesMsg, SCMyDonatesMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCMyDonatesMsg");

  private static final org.apache.thrift.protocol.TField DONATES_FIELD_DESC = new org.apache.thrift.protocol.TField("donates", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField START_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("startIndex", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("size", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("charId", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCMyDonatesMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCMyDonatesMsgTupleSchemeFactory());
  }

  public List<com.ling9527.music.common.msg.auto.Donate> donates; // required
  public int startIndex; // required
  public int size; // required
  public long charId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DONATES((short)1, "donates"),
    START_INDEX((short)2, "startIndex"),
    SIZE((short)3, "size"),
    CHAR_ID((short)4, "charId");

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
        case 1: // DONATES
          return DONATES;
        case 2: // START_INDEX
          return START_INDEX;
        case 3: // SIZE
          return SIZE;
        case 4: // CHAR_ID
          return CHAR_ID;
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
  private static final int __STARTINDEX_ISSET_ID = 0;
  private static final int __SIZE_ISSET_ID = 1;
  private static final int __CHARID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DONATES, new org.apache.thrift.meta_data.FieldMetaData("donates", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.Donate.class))));
    tmpMap.put(_Fields.START_INDEX, new org.apache.thrift.meta_data.FieldMetaData("startIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SIZE, new org.apache.thrift.meta_data.FieldMetaData("size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("charId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCMyDonatesMsg.class, metaDataMap);
  }

  public SCMyDonatesMsg() {
  }

  public SCMyDonatesMsg(
    List<com.ling9527.music.common.msg.auto.Donate> donates,
    int startIndex,
    int size,
    long charId)
  {
    this();
    this.donates = donates;
    this.startIndex = startIndex;
    setStartIndexIsSet(true);
    this.size = size;
    setSizeIsSet(true);
    this.charId = charId;
    setCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCMyDonatesMsg(SCMyDonatesMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDonates()) {
      List<com.ling9527.music.common.msg.auto.Donate> __this__donates = new ArrayList<com.ling9527.music.common.msg.auto.Donate>();
      for (com.ling9527.music.common.msg.auto.Donate other_element : other.donates) {
        __this__donates.add(new com.ling9527.music.common.msg.auto.Donate(other_element));
      }
      this.donates = __this__donates;
    }
    this.startIndex = other.startIndex;
    this.size = other.size;
    this.charId = other.charId;
  }

  public SCMyDonatesMsg deepCopy() {
    return new SCMyDonatesMsg(this);
  }

  @Override
  public void clear() {
    this.donates = null;
    setStartIndexIsSet(false);
    this.startIndex = 0;
    setSizeIsSet(false);
    this.size = 0;
    setCharIdIsSet(false);
    this.charId = 0;
  }

  public int getDonatesSize() {
    return (this.donates == null) ? 0 : this.donates.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.Donate> getDonatesIterator() {
    return (this.donates == null) ? null : this.donates.iterator();
  }

  public void addToDonates(com.ling9527.music.common.msg.auto.Donate elem) {
    if (this.donates == null) {
      this.donates = new ArrayList<com.ling9527.music.common.msg.auto.Donate>();
    }
    this.donates.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.Donate> getDonates() {
    return this.donates;
  }

  public SCMyDonatesMsg setDonates(List<com.ling9527.music.common.msg.auto.Donate> donates) {
    this.donates = donates;
    return this;
  }

  public void unsetDonates() {
    this.donates = null;
  }

  /** Returns true if field donates is set (has been assigned a value) and false otherwise */
  public boolean isSetDonates() {
    return this.donates != null;
  }

  public void setDonatesIsSet(boolean value) {
    if (!value) {
      this.donates = null;
    }
  }

  public int getStartIndex() {
    return this.startIndex;
  }

  public SCMyDonatesMsg setStartIndex(int startIndex) {
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

  public SCMyDonatesMsg setSize(int size) {
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

  public long getCharId() {
    return this.charId;
  }

  public SCMyDonatesMsg setCharId(long charId) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DONATES:
      if (value == null) {
        unsetDonates();
      } else {
        setDonates((List<com.ling9527.music.common.msg.auto.Donate>)value);
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

    case CHAR_ID:
      if (value == null) {
        unsetCharId();
      } else {
        setCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DONATES:
      return getDonates();

    case START_INDEX:
      return Integer.valueOf(getStartIndex());

    case SIZE:
      return Integer.valueOf(getSize());

    case CHAR_ID:
      return Long.valueOf(getCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DONATES:
      return isSetDonates();
    case START_INDEX:
      return isSetStartIndex();
    case SIZE:
      return isSetSize();
    case CHAR_ID:
      return isSetCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCMyDonatesMsg)
      return this.equals((SCMyDonatesMsg)that);
    return false;
  }

  public boolean equals(SCMyDonatesMsg that) {
    if (that == null)
      return false;

    boolean this_present_donates = true && this.isSetDonates();
    boolean that_present_donates = true && that.isSetDonates();
    if (this_present_donates || that_present_donates) {
      if (!(this_present_donates && that_present_donates))
        return false;
      if (!this.donates.equals(that.donates))
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

    boolean this_present_charId = true;
    boolean that_present_charId = true;
    if (this_present_charId || that_present_charId) {
      if (!(this_present_charId && that_present_charId))
        return false;
      if (this.charId != that.charId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCMyDonatesMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCMyDonatesMsg typedOther = (SCMyDonatesMsg)other;

    lastComparison = Boolean.valueOf(isSetDonates()).compareTo(typedOther.isSetDonates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDonates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.donates, typedOther.donates);
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
    StringBuilder sb = new StringBuilder("SCMyDonatesMsg(");
    boolean first = true;

    sb.append("donates:");
    if (this.donates == null) {
      sb.append("null");
    } else {
      sb.append(this.donates);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startIndex:");
    sb.append(this.startIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("size:");
    sb.append(this.size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("charId:");
    sb.append(this.charId);
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

  private static class SCMyDonatesMsgStandardSchemeFactory implements SchemeFactory {
    public SCMyDonatesMsgStandardScheme getScheme() {
      return new SCMyDonatesMsgStandardScheme();
    }
  }

  private static class SCMyDonatesMsgStandardScheme extends StandardScheme<SCMyDonatesMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCMyDonatesMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DONATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.donates = new ArrayList<com.ling9527.music.common.msg.auto.Donate>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  com.ling9527.music.common.msg.auto.Donate _elem10; // required
                  _elem10 = new com.ling9527.music.common.msg.auto.Donate();
                  _elem10.read(iprot);
                  struct.donates.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setDonatesIsSet(true);
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
          case 4: // CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.charId = iprot.readI64();
              struct.setCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCMyDonatesMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.donates != null) {
        oprot.writeFieldBegin(DONATES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.donates.size()));
          for (com.ling9527.music.common.msg.auto.Donate _iter11 : struct.donates)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_INDEX_FIELD_DESC);
      oprot.writeI32(struct.startIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SIZE_FIELD_DESC);
      oprot.writeI32(struct.size);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.charId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCMyDonatesMsgTupleSchemeFactory implements SchemeFactory {
    public SCMyDonatesMsgTupleScheme getScheme() {
      return new SCMyDonatesMsgTupleScheme();
    }
  }

  private static class SCMyDonatesMsgTupleScheme extends TupleScheme<SCMyDonatesMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCMyDonatesMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDonates()) {
        optionals.set(0);
      }
      if (struct.isSetStartIndex()) {
        optionals.set(1);
      }
      if (struct.isSetSize()) {
        optionals.set(2);
      }
      if (struct.isSetCharId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDonates()) {
        {
          oprot.writeI32(struct.donates.size());
          for (com.ling9527.music.common.msg.auto.Donate _iter12 : struct.donates)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetStartIndex()) {
        oprot.writeI32(struct.startIndex);
      }
      if (struct.isSetSize()) {
        oprot.writeI32(struct.size);
      }
      if (struct.isSetCharId()) {
        oprot.writeI64(struct.charId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCMyDonatesMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.donates = new ArrayList<com.ling9527.music.common.msg.auto.Donate>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            com.ling9527.music.common.msg.auto.Donate _elem15; // required
            _elem15 = new com.ling9527.music.common.msg.auto.Donate();
            _elem15.read(iprot);
            struct.donates.add(_elem15);
          }
        }
        struct.setDonatesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startIndex = iprot.readI32();
        struct.setStartIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.size = iprot.readI32();
        struct.setSizeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.charId = iprot.readI64();
        struct.setCharIdIsSet(true);
      }
    }
  }

}
