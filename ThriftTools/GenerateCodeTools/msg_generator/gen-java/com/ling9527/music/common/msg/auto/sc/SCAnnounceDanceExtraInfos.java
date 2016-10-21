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
 * 通告舞蹈额外信息
 */
public class SCAnnounceDanceExtraInfos implements org.apache.thrift.TBase<SCAnnounceDanceExtraInfos, SCAnnounceDanceExtraInfos._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCAnnounceDanceExtraInfos");

  private static final org.apache.thrift.protocol.TField CHEER_PASS_INIT_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("cheerPassInitInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCAnnounceDanceExtraInfosStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCAnnounceDanceExtraInfosTupleSchemeFactory());
  }

  /**
   * 舞蹈欢呼值通关信息
   */
  public com.ling9527.music.common.msg.auto.DanceCheerInitInfo cheerPassInitInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 舞蹈欢呼值通关信息
     */
    CHEER_PASS_INIT_INFO((short)1, "cheerPassInitInfo");

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
        case 1: // CHEER_PASS_INIT_INFO
          return CHEER_PASS_INIT_INFO;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHEER_PASS_INIT_INFO, new org.apache.thrift.meta_data.FieldMetaData("cheerPassInitInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.DanceCheerInitInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCAnnounceDanceExtraInfos.class, metaDataMap);
  }

  public SCAnnounceDanceExtraInfos() {
  }

  public SCAnnounceDanceExtraInfos(
    com.ling9527.music.common.msg.auto.DanceCheerInitInfo cheerPassInitInfo)
  {
    this();
    this.cheerPassInitInfo = cheerPassInitInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCAnnounceDanceExtraInfos(SCAnnounceDanceExtraInfos other) {
    if (other.isSetCheerPassInitInfo()) {
      this.cheerPassInitInfo = new com.ling9527.music.common.msg.auto.DanceCheerInitInfo(other.cheerPassInitInfo);
    }
  }

  public SCAnnounceDanceExtraInfos deepCopy() {
    return new SCAnnounceDanceExtraInfos(this);
  }

  @Override
  public void clear() {
    this.cheerPassInitInfo = null;
  }

  /**
   * 舞蹈欢呼值通关信息
   */
  public com.ling9527.music.common.msg.auto.DanceCheerInitInfo getCheerPassInitInfo() {
    return this.cheerPassInitInfo;
  }

  /**
   * 舞蹈欢呼值通关信息
   */
  public SCAnnounceDanceExtraInfos setCheerPassInitInfo(com.ling9527.music.common.msg.auto.DanceCheerInitInfo cheerPassInitInfo) {
    this.cheerPassInitInfo = cheerPassInitInfo;
    return this;
  }

  public void unsetCheerPassInitInfo() {
    this.cheerPassInitInfo = null;
  }

  /** Returns true if field cheerPassInitInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetCheerPassInitInfo() {
    return this.cheerPassInitInfo != null;
  }

  public void setCheerPassInitInfoIsSet(boolean value) {
    if (!value) {
      this.cheerPassInitInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHEER_PASS_INIT_INFO:
      if (value == null) {
        unsetCheerPassInitInfo();
      } else {
        setCheerPassInitInfo((com.ling9527.music.common.msg.auto.DanceCheerInitInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHEER_PASS_INIT_INFO:
      return getCheerPassInitInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHEER_PASS_INIT_INFO:
      return isSetCheerPassInitInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCAnnounceDanceExtraInfos)
      return this.equals((SCAnnounceDanceExtraInfos)that);
    return false;
  }

  public boolean equals(SCAnnounceDanceExtraInfos that) {
    if (that == null)
      return false;

    boolean this_present_cheerPassInitInfo = true && this.isSetCheerPassInitInfo();
    boolean that_present_cheerPassInitInfo = true && that.isSetCheerPassInitInfo();
    if (this_present_cheerPassInitInfo || that_present_cheerPassInitInfo) {
      if (!(this_present_cheerPassInitInfo && that_present_cheerPassInitInfo))
        return false;
      if (!this.cheerPassInitInfo.equals(that.cheerPassInitInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCAnnounceDanceExtraInfos other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCAnnounceDanceExtraInfos typedOther = (SCAnnounceDanceExtraInfos)other;

    lastComparison = Boolean.valueOf(isSetCheerPassInitInfo()).compareTo(typedOther.isSetCheerPassInitInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheerPassInitInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cheerPassInitInfo, typedOther.cheerPassInitInfo);
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
    StringBuilder sb = new StringBuilder("SCAnnounceDanceExtraInfos(");
    boolean first = true;

    sb.append("cheerPassInitInfo:");
    if (this.cheerPassInitInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.cheerPassInitInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (cheerPassInitInfo != null) {
      cheerPassInitInfo.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCAnnounceDanceExtraInfosStandardSchemeFactory implements SchemeFactory {
    public SCAnnounceDanceExtraInfosStandardScheme getScheme() {
      return new SCAnnounceDanceExtraInfosStandardScheme();
    }
  }

  private static class SCAnnounceDanceExtraInfosStandardScheme extends StandardScheme<SCAnnounceDanceExtraInfos> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCAnnounceDanceExtraInfos struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHEER_PASS_INIT_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cheerPassInitInfo = new com.ling9527.music.common.msg.auto.DanceCheerInitInfo();
              struct.cheerPassInitInfo.read(iprot);
              struct.setCheerPassInitInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCAnnounceDanceExtraInfos struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cheerPassInitInfo != null) {
        oprot.writeFieldBegin(CHEER_PASS_INIT_INFO_FIELD_DESC);
        struct.cheerPassInitInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCAnnounceDanceExtraInfosTupleSchemeFactory implements SchemeFactory {
    public SCAnnounceDanceExtraInfosTupleScheme getScheme() {
      return new SCAnnounceDanceExtraInfosTupleScheme();
    }
  }

  private static class SCAnnounceDanceExtraInfosTupleScheme extends TupleScheme<SCAnnounceDanceExtraInfos> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCAnnounceDanceExtraInfos struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCheerPassInitInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCheerPassInitInfo()) {
        struct.cheerPassInitInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCAnnounceDanceExtraInfos struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.cheerPassInitInfo = new com.ling9527.music.common.msg.auto.DanceCheerInitInfo();
        struct.cheerPassInitInfo.read(iprot);
        struct.setCheerPassInitInfoIsSet(true);
      }
    }
  }

}
