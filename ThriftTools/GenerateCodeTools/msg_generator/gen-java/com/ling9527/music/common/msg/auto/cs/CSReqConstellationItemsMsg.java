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

public class CSReqConstellationItemsMsg implements org.apache.thrift.TBase<CSReqConstellationItemsMsg, CSReqConstellationItemsMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSReqConstellationItemsMsg");

  private static final org.apache.thrift.protocol.TField CONSTELLATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("constellationId", org.apache.thrift.protocol.TType.BYTE, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSReqConstellationItemsMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSReqConstellationItemsMsgTupleSchemeFactory());
  }

  public byte constellationId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONSTELLATION_ID((short)1, "constellationId");

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
        case 1: // CONSTELLATION_ID
          return CONSTELLATION_ID;
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
  private static final int __CONSTELLATIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONSTELLATION_ID, new org.apache.thrift.meta_data.FieldMetaData("constellationId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSReqConstellationItemsMsg.class, metaDataMap);
  }

  public CSReqConstellationItemsMsg() {
  }

  public CSReqConstellationItemsMsg(
    byte constellationId)
  {
    this();
    this.constellationId = constellationId;
    setConstellationIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSReqConstellationItemsMsg(CSReqConstellationItemsMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.constellationId = other.constellationId;
  }

  public CSReqConstellationItemsMsg deepCopy() {
    return new CSReqConstellationItemsMsg(this);
  }

  @Override
  public void clear() {
    setConstellationIdIsSet(false);
    this.constellationId = 0;
  }

  public byte getConstellationId() {
    return this.constellationId;
  }

  public CSReqConstellationItemsMsg setConstellationId(byte constellationId) {
    this.constellationId = constellationId;
    setConstellationIdIsSet(true);
    return this;
  }

  public void unsetConstellationId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSTELLATIONID_ISSET_ID);
  }

  /** Returns true if field constellationId is set (has been assigned a value) and false otherwise */
  public boolean isSetConstellationId() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSTELLATIONID_ISSET_ID);
  }

  public void setConstellationIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSTELLATIONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONSTELLATION_ID:
      if (value == null) {
        unsetConstellationId();
      } else {
        setConstellationId((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONSTELLATION_ID:
      return Byte.valueOf(getConstellationId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONSTELLATION_ID:
      return isSetConstellationId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSReqConstellationItemsMsg)
      return this.equals((CSReqConstellationItemsMsg)that);
    return false;
  }

  public boolean equals(CSReqConstellationItemsMsg that) {
    if (that == null)
      return false;

    boolean this_present_constellationId = true;
    boolean that_present_constellationId = true;
    if (this_present_constellationId || that_present_constellationId) {
      if (!(this_present_constellationId && that_present_constellationId))
        return false;
      if (this.constellationId != that.constellationId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSReqConstellationItemsMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSReqConstellationItemsMsg typedOther = (CSReqConstellationItemsMsg)other;

    lastComparison = Boolean.valueOf(isSetConstellationId()).compareTo(typedOther.isSetConstellationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConstellationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.constellationId, typedOther.constellationId);
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
    StringBuilder sb = new StringBuilder("CSReqConstellationItemsMsg(");
    boolean first = true;

    sb.append("constellationId:");
    sb.append(this.constellationId);
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

  private static class CSReqConstellationItemsMsgStandardSchemeFactory implements SchemeFactory {
    public CSReqConstellationItemsMsgStandardScheme getScheme() {
      return new CSReqConstellationItemsMsgStandardScheme();
    }
  }

  private static class CSReqConstellationItemsMsgStandardScheme extends StandardScheme<CSReqConstellationItemsMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSReqConstellationItemsMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONSTELLATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.constellationId = iprot.readByte();
              struct.setConstellationIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSReqConstellationItemsMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CONSTELLATION_ID_FIELD_DESC);
      oprot.writeByte(struct.constellationId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSReqConstellationItemsMsgTupleSchemeFactory implements SchemeFactory {
    public CSReqConstellationItemsMsgTupleScheme getScheme() {
      return new CSReqConstellationItemsMsgTupleScheme();
    }
  }

  private static class CSReqConstellationItemsMsgTupleScheme extends TupleScheme<CSReqConstellationItemsMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSReqConstellationItemsMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConstellationId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetConstellationId()) {
        oprot.writeByte(struct.constellationId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSReqConstellationItemsMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.constellationId = iprot.readByte();
        struct.setConstellationIdIsSet(true);
      }
    }
  }

}
