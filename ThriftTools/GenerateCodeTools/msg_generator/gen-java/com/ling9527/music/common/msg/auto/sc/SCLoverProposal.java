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
 * 情侣求婚
 */
public class SCLoverProposal implements org.apache.thrift.TBase<SCLoverProposal, SCLoverProposal._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCLoverProposal");

  private static final org.apache.thrift.protocol.TField LOVER_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("loverCharId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOVER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("loverName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCLoverProposalStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCLoverProposalTupleSchemeFactory());
  }

  public long loverCharId; // required
  public String loverName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOVER_CHAR_ID((short)1, "loverCharId"),
    LOVER_NAME((short)2, "loverName");

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
        case 1: // LOVER_CHAR_ID
          return LOVER_CHAR_ID;
        case 2: // LOVER_NAME
          return LOVER_NAME;
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
  private static final int __LOVERCHARID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOVER_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("loverCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOVER_NAME, new org.apache.thrift.meta_data.FieldMetaData("loverName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCLoverProposal.class, metaDataMap);
  }

  public SCLoverProposal() {
  }

  public SCLoverProposal(
    long loverCharId,
    String loverName)
  {
    this();
    this.loverCharId = loverCharId;
    setLoverCharIdIsSet(true);
    this.loverName = loverName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCLoverProposal(SCLoverProposal other) {
    __isset_bitfield = other.__isset_bitfield;
    this.loverCharId = other.loverCharId;
    if (other.isSetLoverName()) {
      this.loverName = other.loverName;
    }
  }

  public SCLoverProposal deepCopy() {
    return new SCLoverProposal(this);
  }

  @Override
  public void clear() {
    setLoverCharIdIsSet(false);
    this.loverCharId = 0;
    this.loverName = null;
  }

  public long getLoverCharId() {
    return this.loverCharId;
  }

  public SCLoverProposal setLoverCharId(long loverCharId) {
    this.loverCharId = loverCharId;
    setLoverCharIdIsSet(true);
    return this;
  }

  public void unsetLoverCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOVERCHARID_ISSET_ID);
  }

  /** Returns true if field loverCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetLoverCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __LOVERCHARID_ISSET_ID);
  }

  public void setLoverCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOVERCHARID_ISSET_ID, value);
  }

  public String getLoverName() {
    return this.loverName;
  }

  public SCLoverProposal setLoverName(String loverName) {
    this.loverName = loverName;
    return this;
  }

  public void unsetLoverName() {
    this.loverName = null;
  }

  /** Returns true if field loverName is set (has been assigned a value) and false otherwise */
  public boolean isSetLoverName() {
    return this.loverName != null;
  }

  public void setLoverNameIsSet(boolean value) {
    if (!value) {
      this.loverName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOVER_CHAR_ID:
      if (value == null) {
        unsetLoverCharId();
      } else {
        setLoverCharId((Long)value);
      }
      break;

    case LOVER_NAME:
      if (value == null) {
        unsetLoverName();
      } else {
        setLoverName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOVER_CHAR_ID:
      return Long.valueOf(getLoverCharId());

    case LOVER_NAME:
      return getLoverName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOVER_CHAR_ID:
      return isSetLoverCharId();
    case LOVER_NAME:
      return isSetLoverName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCLoverProposal)
      return this.equals((SCLoverProposal)that);
    return false;
  }

  public boolean equals(SCLoverProposal that) {
    if (that == null)
      return false;

    boolean this_present_loverCharId = true;
    boolean that_present_loverCharId = true;
    if (this_present_loverCharId || that_present_loverCharId) {
      if (!(this_present_loverCharId && that_present_loverCharId))
        return false;
      if (this.loverCharId != that.loverCharId)
        return false;
    }

    boolean this_present_loverName = true && this.isSetLoverName();
    boolean that_present_loverName = true && that.isSetLoverName();
    if (this_present_loverName || that_present_loverName) {
      if (!(this_present_loverName && that_present_loverName))
        return false;
      if (!this.loverName.equals(that.loverName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCLoverProposal other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCLoverProposal typedOther = (SCLoverProposal)other;

    lastComparison = Boolean.valueOf(isSetLoverCharId()).compareTo(typedOther.isSetLoverCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoverCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loverCharId, typedOther.loverCharId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoverName()).compareTo(typedOther.isSetLoverName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoverName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loverName, typedOther.loverName);
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
    StringBuilder sb = new StringBuilder("SCLoverProposal(");
    boolean first = true;

    sb.append("loverCharId:");
    sb.append(this.loverCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("loverName:");
    if (this.loverName == null) {
      sb.append("null");
    } else {
      sb.append(this.loverName);
    }
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

  private static class SCLoverProposalStandardSchemeFactory implements SchemeFactory {
    public SCLoverProposalStandardScheme getScheme() {
      return new SCLoverProposalStandardScheme();
    }
  }

  private static class SCLoverProposalStandardScheme extends StandardScheme<SCLoverProposal> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCLoverProposal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOVER_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.loverCharId = iprot.readI64();
              struct.setLoverCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOVER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.loverName = iprot.readString();
              struct.setLoverNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCLoverProposal struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LOVER_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.loverCharId);
      oprot.writeFieldEnd();
      if (struct.loverName != null) {
        oprot.writeFieldBegin(LOVER_NAME_FIELD_DESC);
        oprot.writeString(struct.loverName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCLoverProposalTupleSchemeFactory implements SchemeFactory {
    public SCLoverProposalTupleScheme getScheme() {
      return new SCLoverProposalTupleScheme();
    }
  }

  private static class SCLoverProposalTupleScheme extends TupleScheme<SCLoverProposal> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCLoverProposal struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLoverCharId()) {
        optionals.set(0);
      }
      if (struct.isSetLoverName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLoverCharId()) {
        oprot.writeI64(struct.loverCharId);
      }
      if (struct.isSetLoverName()) {
        oprot.writeString(struct.loverName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCLoverProposal struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.loverCharId = iprot.readI64();
        struct.setLoverCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.loverName = iprot.readString();
        struct.setLoverNameIsSet(true);
      }
    }
  }

}
