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
 * 刷新温泉泉眼
 */
public class SCRefreshSpring implements org.apache.thrift.TBase<SCRefreshSpring, SCRefreshSpring._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCRefreshSpring");

  private static final org.apache.thrift.protocol.TField SPRING_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("springId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SHOW_OR_HIDE_FIELD_DESC = new org.apache.thrift.protocol.TField("showOrHide", org.apache.thrift.protocol.TType.BYTE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCRefreshSpringStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCRefreshSpringTupleSchemeFactory());
  }

  /**
   * 泉眼id
   */
  public int springId; // required
  /**
   * 0-隐藏 1-显示
   */
  public byte showOrHide; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 泉眼id
     */
    SPRING_ID((short)1, "springId"),
    /**
     * 0-隐藏 1-显示
     */
    SHOW_OR_HIDE((short)2, "showOrHide");

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
        case 1: // SPRING_ID
          return SPRING_ID;
        case 2: // SHOW_OR_HIDE
          return SHOW_OR_HIDE;
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
  private static final int __SPRINGID_ISSET_ID = 0;
  private static final int __SHOWORHIDE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SPRING_ID, new org.apache.thrift.meta_data.FieldMetaData("springId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SHOW_OR_HIDE, new org.apache.thrift.meta_data.FieldMetaData("showOrHide", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCRefreshSpring.class, metaDataMap);
  }

  public SCRefreshSpring() {
  }

  public SCRefreshSpring(
    int springId,
    byte showOrHide)
  {
    this();
    this.springId = springId;
    setSpringIdIsSet(true);
    this.showOrHide = showOrHide;
    setShowOrHideIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCRefreshSpring(SCRefreshSpring other) {
    __isset_bitfield = other.__isset_bitfield;
    this.springId = other.springId;
    this.showOrHide = other.showOrHide;
  }

  public SCRefreshSpring deepCopy() {
    return new SCRefreshSpring(this);
  }

  @Override
  public void clear() {
    setSpringIdIsSet(false);
    this.springId = 0;
    setShowOrHideIsSet(false);
    this.showOrHide = 0;
  }

  /**
   * 泉眼id
   */
  public int getSpringId() {
    return this.springId;
  }

  /**
   * 泉眼id
   */
  public SCRefreshSpring setSpringId(int springId) {
    this.springId = springId;
    setSpringIdIsSet(true);
    return this;
  }

  public void unsetSpringId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPRINGID_ISSET_ID);
  }

  /** Returns true if field springId is set (has been assigned a value) and false otherwise */
  public boolean isSetSpringId() {
    return EncodingUtils.testBit(__isset_bitfield, __SPRINGID_ISSET_ID);
  }

  public void setSpringIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPRINGID_ISSET_ID, value);
  }

  /**
   * 0-隐藏 1-显示
   */
  public byte getShowOrHide() {
    return this.showOrHide;
  }

  /**
   * 0-隐藏 1-显示
   */
  public SCRefreshSpring setShowOrHide(byte showOrHide) {
    this.showOrHide = showOrHide;
    setShowOrHideIsSet(true);
    return this;
  }

  public void unsetShowOrHide() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOWORHIDE_ISSET_ID);
  }

  /** Returns true if field showOrHide is set (has been assigned a value) and false otherwise */
  public boolean isSetShowOrHide() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOWORHIDE_ISSET_ID);
  }

  public void setShowOrHideIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOWORHIDE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SPRING_ID:
      if (value == null) {
        unsetSpringId();
      } else {
        setSpringId((Integer)value);
      }
      break;

    case SHOW_OR_HIDE:
      if (value == null) {
        unsetShowOrHide();
      } else {
        setShowOrHide((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SPRING_ID:
      return Integer.valueOf(getSpringId());

    case SHOW_OR_HIDE:
      return Byte.valueOf(getShowOrHide());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SPRING_ID:
      return isSetSpringId();
    case SHOW_OR_HIDE:
      return isSetShowOrHide();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCRefreshSpring)
      return this.equals((SCRefreshSpring)that);
    return false;
  }

  public boolean equals(SCRefreshSpring that) {
    if (that == null)
      return false;

    boolean this_present_springId = true;
    boolean that_present_springId = true;
    if (this_present_springId || that_present_springId) {
      if (!(this_present_springId && that_present_springId))
        return false;
      if (this.springId != that.springId)
        return false;
    }

    boolean this_present_showOrHide = true;
    boolean that_present_showOrHide = true;
    if (this_present_showOrHide || that_present_showOrHide) {
      if (!(this_present_showOrHide && that_present_showOrHide))
        return false;
      if (this.showOrHide != that.showOrHide)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCRefreshSpring other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCRefreshSpring typedOther = (SCRefreshSpring)other;

    lastComparison = Boolean.valueOf(isSetSpringId()).compareTo(typedOther.isSetSpringId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpringId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.springId, typedOther.springId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShowOrHide()).compareTo(typedOther.isSetShowOrHide());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShowOrHide()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.showOrHide, typedOther.showOrHide);
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
    StringBuilder sb = new StringBuilder("SCRefreshSpring(");
    boolean first = true;

    sb.append("springId:");
    sb.append(this.springId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("showOrHide:");
    sb.append(this.showOrHide);
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

  private static class SCRefreshSpringStandardSchemeFactory implements SchemeFactory {
    public SCRefreshSpringStandardScheme getScheme() {
      return new SCRefreshSpringStandardScheme();
    }
  }

  private static class SCRefreshSpringStandardScheme extends StandardScheme<SCRefreshSpring> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCRefreshSpring struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SPRING_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.springId = iprot.readI32();
              struct.setSpringIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHOW_OR_HIDE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.showOrHide = iprot.readByte();
              struct.setShowOrHideIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCRefreshSpring struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SPRING_ID_FIELD_DESC);
      oprot.writeI32(struct.springId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SHOW_OR_HIDE_FIELD_DESC);
      oprot.writeByte(struct.showOrHide);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCRefreshSpringTupleSchemeFactory implements SchemeFactory {
    public SCRefreshSpringTupleScheme getScheme() {
      return new SCRefreshSpringTupleScheme();
    }
  }

  private static class SCRefreshSpringTupleScheme extends TupleScheme<SCRefreshSpring> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCRefreshSpring struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSpringId()) {
        optionals.set(0);
      }
      if (struct.isSetShowOrHide()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSpringId()) {
        oprot.writeI32(struct.springId);
      }
      if (struct.isSetShowOrHide()) {
        oprot.writeByte(struct.showOrHide);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCRefreshSpring struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.springId = iprot.readI32();
        struct.setSpringIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.showOrHide = iprot.readByte();
        struct.setShowOrHideIsSet(true);
      }
    }
  }

}
