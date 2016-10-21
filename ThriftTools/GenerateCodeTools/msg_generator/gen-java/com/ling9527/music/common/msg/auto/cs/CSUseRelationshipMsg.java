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
 * 使用密友或情侣间的关系等级称呼
 */
public class CSUseRelationshipMsg implements org.apache.thrift.TBase<CSUseRelationshipMsg, CSUseRelationshipMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSUseRelationshipMsg");

  private static final org.apache.thrift.protocol.TField RELATIONSHIP_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("relationshipLvl", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField TO_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toCharId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSUseRelationshipMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSUseRelationshipMsgTupleSchemeFactory());
  }

  public byte relationshipLvl; // required
  public long toCharId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RELATIONSHIP_LVL((short)1, "relationshipLvl"),
    TO_CHAR_ID((short)2, "toCharId");

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
        case 1: // RELATIONSHIP_LVL
          return RELATIONSHIP_LVL;
        case 2: // TO_CHAR_ID
          return TO_CHAR_ID;
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
  private static final int __RELATIONSHIPLVL_ISSET_ID = 0;
  private static final int __TOCHARID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RELATIONSHIP_LVL, new org.apache.thrift.meta_data.FieldMetaData("relationshipLvl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.TO_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("toCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSUseRelationshipMsg.class, metaDataMap);
  }

  public CSUseRelationshipMsg() {
  }

  public CSUseRelationshipMsg(
    byte relationshipLvl,
    long toCharId)
  {
    this();
    this.relationshipLvl = relationshipLvl;
    setRelationshipLvlIsSet(true);
    this.toCharId = toCharId;
    setToCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSUseRelationshipMsg(CSUseRelationshipMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.relationshipLvl = other.relationshipLvl;
    this.toCharId = other.toCharId;
  }

  public CSUseRelationshipMsg deepCopy() {
    return new CSUseRelationshipMsg(this);
  }

  @Override
  public void clear() {
    setRelationshipLvlIsSet(false);
    this.relationshipLvl = 0;
    setToCharIdIsSet(false);
    this.toCharId = 0;
  }

  public byte getRelationshipLvl() {
    return this.relationshipLvl;
  }

  public CSUseRelationshipMsg setRelationshipLvl(byte relationshipLvl) {
    this.relationshipLvl = relationshipLvl;
    setRelationshipLvlIsSet(true);
    return this;
  }

  public void unsetRelationshipLvl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RELATIONSHIPLVL_ISSET_ID);
  }

  /** Returns true if field relationshipLvl is set (has been assigned a value) and false otherwise */
  public boolean isSetRelationshipLvl() {
    return EncodingUtils.testBit(__isset_bitfield, __RELATIONSHIPLVL_ISSET_ID);
  }

  public void setRelationshipLvlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RELATIONSHIPLVL_ISSET_ID, value);
  }

  public long getToCharId() {
    return this.toCharId;
  }

  public CSUseRelationshipMsg setToCharId(long toCharId) {
    this.toCharId = toCharId;
    setToCharIdIsSet(true);
    return this;
  }

  public void unsetToCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOCHARID_ISSET_ID);
  }

  /** Returns true if field toCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetToCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __TOCHARID_ISSET_ID);
  }

  public void setToCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOCHARID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RELATIONSHIP_LVL:
      if (value == null) {
        unsetRelationshipLvl();
      } else {
        setRelationshipLvl((Byte)value);
      }
      break;

    case TO_CHAR_ID:
      if (value == null) {
        unsetToCharId();
      } else {
        setToCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RELATIONSHIP_LVL:
      return Byte.valueOf(getRelationshipLvl());

    case TO_CHAR_ID:
      return Long.valueOf(getToCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RELATIONSHIP_LVL:
      return isSetRelationshipLvl();
    case TO_CHAR_ID:
      return isSetToCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSUseRelationshipMsg)
      return this.equals((CSUseRelationshipMsg)that);
    return false;
  }

  public boolean equals(CSUseRelationshipMsg that) {
    if (that == null)
      return false;

    boolean this_present_relationshipLvl = true;
    boolean that_present_relationshipLvl = true;
    if (this_present_relationshipLvl || that_present_relationshipLvl) {
      if (!(this_present_relationshipLvl && that_present_relationshipLvl))
        return false;
      if (this.relationshipLvl != that.relationshipLvl)
        return false;
    }

    boolean this_present_toCharId = true;
    boolean that_present_toCharId = true;
    if (this_present_toCharId || that_present_toCharId) {
      if (!(this_present_toCharId && that_present_toCharId))
        return false;
      if (this.toCharId != that.toCharId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSUseRelationshipMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSUseRelationshipMsg typedOther = (CSUseRelationshipMsg)other;

    lastComparison = Boolean.valueOf(isSetRelationshipLvl()).compareTo(typedOther.isSetRelationshipLvl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelationshipLvl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relationshipLvl, typedOther.relationshipLvl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToCharId()).compareTo(typedOther.isSetToCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toCharId, typedOther.toCharId);
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
    StringBuilder sb = new StringBuilder("CSUseRelationshipMsg(");
    boolean first = true;

    sb.append("relationshipLvl:");
    sb.append(this.relationshipLvl);
    first = false;
    if (!first) sb.append(", ");
    sb.append("toCharId:");
    sb.append(this.toCharId);
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

  private static class CSUseRelationshipMsgStandardSchemeFactory implements SchemeFactory {
    public CSUseRelationshipMsgStandardScheme getScheme() {
      return new CSUseRelationshipMsgStandardScheme();
    }
  }

  private static class CSUseRelationshipMsgStandardScheme extends StandardScheme<CSUseRelationshipMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSUseRelationshipMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RELATIONSHIP_LVL
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.relationshipLvl = iprot.readByte();
              struct.setRelationshipLvlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TO_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.toCharId = iprot.readI64();
              struct.setToCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSUseRelationshipMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RELATIONSHIP_LVL_FIELD_DESC);
      oprot.writeByte(struct.relationshipLvl);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TO_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.toCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSUseRelationshipMsgTupleSchemeFactory implements SchemeFactory {
    public CSUseRelationshipMsgTupleScheme getScheme() {
      return new CSUseRelationshipMsgTupleScheme();
    }
  }

  private static class CSUseRelationshipMsgTupleScheme extends TupleScheme<CSUseRelationshipMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSUseRelationshipMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRelationshipLvl()) {
        optionals.set(0);
      }
      if (struct.isSetToCharId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRelationshipLvl()) {
        oprot.writeByte(struct.relationshipLvl);
      }
      if (struct.isSetToCharId()) {
        oprot.writeI64(struct.toCharId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSUseRelationshipMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.relationshipLvl = iprot.readByte();
        struct.setRelationshipLvlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.toCharId = iprot.readI64();
        struct.setToCharIdIsSet(true);
      }
    }
  }

}

