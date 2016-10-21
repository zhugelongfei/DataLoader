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

public class BattleDanceGroupData implements org.apache.thrift.TBase<BattleDanceGroupData, BattleDanceGroupData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BattleDanceGroupData");

  private static final org.apache.thrift.protocol.TField NOTES_FIELD_DESC = new org.apache.thrift.protocol.TField("notes", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.BYTE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BattleDanceGroupDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BattleDanceGroupDataTupleSchemeFactory());
  }

  public List<MusicalNote> notes; // required
  public byte index; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTES((short)1, "notes"),
    INDEX((short)2, "index");

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
        case 1: // NOTES
          return NOTES;
        case 2: // INDEX
          return INDEX;
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
  private static final int __INDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOTES, new org.apache.thrift.meta_data.FieldMetaData("notes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MusicalNote.class))));
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BattleDanceGroupData.class, metaDataMap);
  }

  public BattleDanceGroupData() {
  }

  public BattleDanceGroupData(
    List<MusicalNote> notes,
    byte index)
  {
    this();
    this.notes = notes;
    this.index = index;
    setIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BattleDanceGroupData(BattleDanceGroupData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNotes()) {
      List<MusicalNote> __this__notes = new ArrayList<MusicalNote>();
      for (MusicalNote other_element : other.notes) {
        __this__notes.add(new MusicalNote(other_element));
      }
      this.notes = __this__notes;
    }
    this.index = other.index;
  }

  public BattleDanceGroupData deepCopy() {
    return new BattleDanceGroupData(this);
  }

  @Override
  public void clear() {
    this.notes = null;
    setIndexIsSet(false);
    this.index = 0;
  }

  public int getNotesSize() {
    return (this.notes == null) ? 0 : this.notes.size();
  }

  public java.util.Iterator<MusicalNote> getNotesIterator() {
    return (this.notes == null) ? null : this.notes.iterator();
  }

  public void addToNotes(MusicalNote elem) {
    if (this.notes == null) {
      this.notes = new ArrayList<MusicalNote>();
    }
    this.notes.add(elem);
  }

  public List<MusicalNote> getNotes() {
    return this.notes;
  }

  public BattleDanceGroupData setNotes(List<MusicalNote> notes) {
    this.notes = notes;
    return this;
  }

  public void unsetNotes() {
    this.notes = null;
  }

  /** Returns true if field notes is set (has been assigned a value) and false otherwise */
  public boolean isSetNotes() {
    return this.notes != null;
  }

  public void setNotesIsSet(boolean value) {
    if (!value) {
      this.notes = null;
    }
  }

  public byte getIndex() {
    return this.index;
  }

  public BattleDanceGroupData setIndex(byte index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOTES:
      if (value == null) {
        unsetNotes();
      } else {
        setNotes((List<MusicalNote>)value);
      }
      break;

    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOTES:
      return getNotes();

    case INDEX:
      return Byte.valueOf(getIndex());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOTES:
      return isSetNotes();
    case INDEX:
      return isSetIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BattleDanceGroupData)
      return this.equals((BattleDanceGroupData)that);
    return false;
  }

  public boolean equals(BattleDanceGroupData that) {
    if (that == null)
      return false;

    boolean this_present_notes = true && this.isSetNotes();
    boolean that_present_notes = true && that.isSetNotes();
    if (this_present_notes || that_present_notes) {
      if (!(this_present_notes && that_present_notes))
        return false;
      if (!this.notes.equals(that.notes))
        return false;
    }

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BattleDanceGroupData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BattleDanceGroupData typedOther = (BattleDanceGroupData)other;

    lastComparison = Boolean.valueOf(isSetNotes()).compareTo(typedOther.isSetNotes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notes, typedOther.notes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex()).compareTo(typedOther.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, typedOther.index);
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
    StringBuilder sb = new StringBuilder("BattleDanceGroupData(");
    boolean first = true;

    sb.append("notes:");
    if (this.notes == null) {
      sb.append("null");
    } else {
      sb.append(this.notes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("index:");
    sb.append(this.index);
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

  private static class BattleDanceGroupDataStandardSchemeFactory implements SchemeFactory {
    public BattleDanceGroupDataStandardScheme getScheme() {
      return new BattleDanceGroupDataStandardScheme();
    }
  }

  private static class BattleDanceGroupDataStandardScheme extends StandardScheme<BattleDanceGroupData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BattleDanceGroupData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list364 = iprot.readListBegin();
                struct.notes = new ArrayList<MusicalNote>(_list364.size);
                for (int _i365 = 0; _i365 < _list364.size; ++_i365)
                {
                  MusicalNote _elem366; // required
                  _elem366 = new MusicalNote();
                  _elem366.read(iprot);
                  struct.notes.add(_elem366);
                }
                iprot.readListEnd();
              }
              struct.setNotesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.index = iprot.readByte();
              struct.setIndexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BattleDanceGroupData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.notes != null) {
        oprot.writeFieldBegin(NOTES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.notes.size()));
          for (MusicalNote _iter367 : struct.notes)
          {
            _iter367.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeByte(struct.index);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BattleDanceGroupDataTupleSchemeFactory implements SchemeFactory {
    public BattleDanceGroupDataTupleScheme getScheme() {
      return new BattleDanceGroupDataTupleScheme();
    }
  }

  private static class BattleDanceGroupDataTupleScheme extends TupleScheme<BattleDanceGroupData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BattleDanceGroupData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNotes()) {
        optionals.set(0);
      }
      if (struct.isSetIndex()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNotes()) {
        {
          oprot.writeI32(struct.notes.size());
          for (MusicalNote _iter368 : struct.notes)
          {
            _iter368.write(oprot);
          }
        }
      }
      if (struct.isSetIndex()) {
        oprot.writeByte(struct.index);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BattleDanceGroupData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list369 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.notes = new ArrayList<MusicalNote>(_list369.size);
          for (int _i370 = 0; _i370 < _list369.size; ++_i370)
          {
            MusicalNote _elem371; // required
            _elem371 = new MusicalNote();
            _elem371.read(iprot);
            struct.notes.add(_elem371);
          }
        }
        struct.setNotesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.index = iprot.readByte();
        struct.setIndexIsSet(true);
      }
    }
  }

}

