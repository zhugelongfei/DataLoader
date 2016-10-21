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
 * 当前可引导id
 */
public class SCCurrentNoviceGuide implements org.apache.thrift.TBase<SCCurrentNoviceGuide, SCCurrentNoviceGuide._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCCurrentNoviceGuide");

  private static final org.apache.thrift.protocol.TField NOVICE_GUIDE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("noviceGuideId", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCCurrentNoviceGuideStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCCurrentNoviceGuideTupleSchemeFactory());
  }

  /**
   * 当前可引导id
   */
  public int noviceGuideId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 当前可引导id
     */
    NOVICE_GUIDE_ID((short)1, "noviceGuideId");

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
        case 1: // NOVICE_GUIDE_ID
          return NOVICE_GUIDE_ID;
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
  private static final int __NOVICEGUIDEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOVICE_GUIDE_ID, new org.apache.thrift.meta_data.FieldMetaData("noviceGuideId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCCurrentNoviceGuide.class, metaDataMap);
  }

  public SCCurrentNoviceGuide() {
  }

  public SCCurrentNoviceGuide(
    int noviceGuideId)
  {
    this();
    this.noviceGuideId = noviceGuideId;
    setNoviceGuideIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCCurrentNoviceGuide(SCCurrentNoviceGuide other) {
    __isset_bitfield = other.__isset_bitfield;
    this.noviceGuideId = other.noviceGuideId;
  }

  public SCCurrentNoviceGuide deepCopy() {
    return new SCCurrentNoviceGuide(this);
  }

  @Override
  public void clear() {
    setNoviceGuideIdIsSet(false);
    this.noviceGuideId = 0;
  }

  /**
   * 当前可引导id
   */
  public int getNoviceGuideId() {
    return this.noviceGuideId;
  }

  /**
   * 当前可引导id
   */
  public SCCurrentNoviceGuide setNoviceGuideId(int noviceGuideId) {
    this.noviceGuideId = noviceGuideId;
    setNoviceGuideIdIsSet(true);
    return this;
  }

  public void unsetNoviceGuideId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOVICEGUIDEID_ISSET_ID);
  }

  /** Returns true if field noviceGuideId is set (has been assigned a value) and false otherwise */
  public boolean isSetNoviceGuideId() {
    return EncodingUtils.testBit(__isset_bitfield, __NOVICEGUIDEID_ISSET_ID);
  }

  public void setNoviceGuideIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOVICEGUIDEID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOVICE_GUIDE_ID:
      if (value == null) {
        unsetNoviceGuideId();
      } else {
        setNoviceGuideId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOVICE_GUIDE_ID:
      return Integer.valueOf(getNoviceGuideId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOVICE_GUIDE_ID:
      return isSetNoviceGuideId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCCurrentNoviceGuide)
      return this.equals((SCCurrentNoviceGuide)that);
    return false;
  }

  public boolean equals(SCCurrentNoviceGuide that) {
    if (that == null)
      return false;

    boolean this_present_noviceGuideId = true;
    boolean that_present_noviceGuideId = true;
    if (this_present_noviceGuideId || that_present_noviceGuideId) {
      if (!(this_present_noviceGuideId && that_present_noviceGuideId))
        return false;
      if (this.noviceGuideId != that.noviceGuideId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCCurrentNoviceGuide other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCCurrentNoviceGuide typedOther = (SCCurrentNoviceGuide)other;

    lastComparison = Boolean.valueOf(isSetNoviceGuideId()).compareTo(typedOther.isSetNoviceGuideId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoviceGuideId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noviceGuideId, typedOther.noviceGuideId);
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
    StringBuilder sb = new StringBuilder("SCCurrentNoviceGuide(");
    boolean first = true;

    sb.append("noviceGuideId:");
    sb.append(this.noviceGuideId);
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

  private static class SCCurrentNoviceGuideStandardSchemeFactory implements SchemeFactory {
    public SCCurrentNoviceGuideStandardScheme getScheme() {
      return new SCCurrentNoviceGuideStandardScheme();
    }
  }

  private static class SCCurrentNoviceGuideStandardScheme extends StandardScheme<SCCurrentNoviceGuide> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCCurrentNoviceGuide struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOVICE_GUIDE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.noviceGuideId = iprot.readI32();
              struct.setNoviceGuideIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCCurrentNoviceGuide struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NOVICE_GUIDE_ID_FIELD_DESC);
      oprot.writeI32(struct.noviceGuideId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCCurrentNoviceGuideTupleSchemeFactory implements SchemeFactory {
    public SCCurrentNoviceGuideTupleScheme getScheme() {
      return new SCCurrentNoviceGuideTupleScheme();
    }
  }

  private static class SCCurrentNoviceGuideTupleScheme extends TupleScheme<SCCurrentNoviceGuide> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCCurrentNoviceGuide struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNoviceGuideId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNoviceGuideId()) {
        oprot.writeI32(struct.noviceGuideId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCCurrentNoviceGuide struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.noviceGuideId = iprot.readI32();
        struct.setNoviceGuideIdIsSet(true);
      }
    }
  }

}
