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
 * 应用时尚信息
 */
public class CSApplyFashionInfo implements org.apache.thrift.TBase<CSApplyFashionInfo, CSApplyFashionInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSApplyFashionInfo");

  private static final org.apache.thrift.protocol.TField FASHION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fashionId", org.apache.thrift.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSApplyFashionInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSApplyFashionInfoTupleSchemeFactory());
  }

  /**
   * 时尚id
   */
  public int fashionId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 时尚id
     */
    FASHION_ID((short)1, "fashionId");

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
        case 1: // FASHION_ID
          return FASHION_ID;
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
  private static final int __FASHIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FASHION_ID, new org.apache.thrift.meta_data.FieldMetaData("fashionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSApplyFashionInfo.class, metaDataMap);
  }

  public CSApplyFashionInfo() {
  }

  public CSApplyFashionInfo(
    int fashionId)
  {
    this();
    this.fashionId = fashionId;
    setFashionIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSApplyFashionInfo(CSApplyFashionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.fashionId = other.fashionId;
  }

  public CSApplyFashionInfo deepCopy() {
    return new CSApplyFashionInfo(this);
  }

  @Override
  public void clear() {
    setFashionIdIsSet(false);
    this.fashionId = 0;
  }

  /**
   * 时尚id
   */
  public int getFashionId() {
    return this.fashionId;
  }

  /**
   * 时尚id
   */
  public CSApplyFashionInfo setFashionId(int fashionId) {
    this.fashionId = fashionId;
    setFashionIdIsSet(true);
    return this;
  }

  public void unsetFashionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FASHIONID_ISSET_ID);
  }

  /** Returns true if field fashionId is set (has been assigned a value) and false otherwise */
  public boolean isSetFashionId() {
    return EncodingUtils.testBit(__isset_bitfield, __FASHIONID_ISSET_ID);
  }

  public void setFashionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FASHIONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FASHION_ID:
      if (value == null) {
        unsetFashionId();
      } else {
        setFashionId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FASHION_ID:
      return Integer.valueOf(getFashionId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FASHION_ID:
      return isSetFashionId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSApplyFashionInfo)
      return this.equals((CSApplyFashionInfo)that);
    return false;
  }

  public boolean equals(CSApplyFashionInfo that) {
    if (that == null)
      return false;

    boolean this_present_fashionId = true;
    boolean that_present_fashionId = true;
    if (this_present_fashionId || that_present_fashionId) {
      if (!(this_present_fashionId && that_present_fashionId))
        return false;
      if (this.fashionId != that.fashionId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSApplyFashionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSApplyFashionInfo typedOther = (CSApplyFashionInfo)other;

    lastComparison = Boolean.valueOf(isSetFashionId()).compareTo(typedOther.isSetFashionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFashionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fashionId, typedOther.fashionId);
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
    StringBuilder sb = new StringBuilder("CSApplyFashionInfo(");
    boolean first = true;

    sb.append("fashionId:");
    sb.append(this.fashionId);
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

  private static class CSApplyFashionInfoStandardSchemeFactory implements SchemeFactory {
    public CSApplyFashionInfoStandardScheme getScheme() {
      return new CSApplyFashionInfoStandardScheme();
    }
  }

  private static class CSApplyFashionInfoStandardScheme extends StandardScheme<CSApplyFashionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSApplyFashionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FASHION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fashionId = iprot.readI32();
              struct.setFashionIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSApplyFashionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FASHION_ID_FIELD_DESC);
      oprot.writeI32(struct.fashionId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSApplyFashionInfoTupleSchemeFactory implements SchemeFactory {
    public CSApplyFashionInfoTupleScheme getScheme() {
      return new CSApplyFashionInfoTupleScheme();
    }
  }

  private static class CSApplyFashionInfoTupleScheme extends TupleScheme<CSApplyFashionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSApplyFashionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFashionId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFashionId()) {
        oprot.writeI32(struct.fashionId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSApplyFashionInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.fashionId = iprot.readI32();
        struct.setFashionIdIsSet(true);
      }
    }
  }

}
