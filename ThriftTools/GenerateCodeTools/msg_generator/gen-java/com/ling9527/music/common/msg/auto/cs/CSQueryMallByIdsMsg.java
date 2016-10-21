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
 * 请求对应商品id的商品信息
 */
public class CSQueryMallByIdsMsg implements org.apache.thrift.TBase<CSQueryMallByIdsMsg, CSQueryMallByIdsMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSQueryMallByIdsMsg");

  private static final org.apache.thrift.protocol.TField QUERY_BY_IDS_PARAM_FIELD_DESC = new org.apache.thrift.protocol.TField("queryByIdsParam", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField IS_LIMIT_MALL_FIELD_DESC = new org.apache.thrift.protocol.TField("isLimitMall", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSQueryMallByIdsMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSQueryMallByIdsMsgTupleSchemeFactory());
  }

  /**
   * 请求对应id的信息参数
   */
  public com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam queryByIdsParam; // required
  /**
   * 是否限时商城
   */
  public boolean isLimitMall; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 请求对应id的信息参数
     */
    QUERY_BY_IDS_PARAM((short)1, "queryByIdsParam"),
    /**
     * 是否限时商城
     */
    IS_LIMIT_MALL((short)2, "isLimitMall");

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
        case 1: // QUERY_BY_IDS_PARAM
          return QUERY_BY_IDS_PARAM;
        case 2: // IS_LIMIT_MALL
          return IS_LIMIT_MALL;
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
  private static final int __ISLIMITMALL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.IS_LIMIT_MALL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_BY_IDS_PARAM, new org.apache.thrift.meta_data.FieldMetaData("queryByIdsParam", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam.class)));
    tmpMap.put(_Fields.IS_LIMIT_MALL, new org.apache.thrift.meta_data.FieldMetaData("isLimitMall", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSQueryMallByIdsMsg.class, metaDataMap);
  }

  public CSQueryMallByIdsMsg() {
  }

  public CSQueryMallByIdsMsg(
    com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam queryByIdsParam)
  {
    this();
    this.queryByIdsParam = queryByIdsParam;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSQueryMallByIdsMsg(CSQueryMallByIdsMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQueryByIdsParam()) {
      this.queryByIdsParam = new com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam(other.queryByIdsParam);
    }
    this.isLimitMall = other.isLimitMall;
  }

  public CSQueryMallByIdsMsg deepCopy() {
    return new CSQueryMallByIdsMsg(this);
  }

  @Override
  public void clear() {
    this.queryByIdsParam = null;
    setIsLimitMallIsSet(false);
    this.isLimitMall = false;
  }

  /**
   * 请求对应id的信息参数
   */
  public com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam getQueryByIdsParam() {
    return this.queryByIdsParam;
  }

  /**
   * 请求对应id的信息参数
   */
  public CSQueryMallByIdsMsg setQueryByIdsParam(com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam queryByIdsParam) {
    this.queryByIdsParam = queryByIdsParam;
    return this;
  }

  public void unsetQueryByIdsParam() {
    this.queryByIdsParam = null;
  }

  /** Returns true if field queryByIdsParam is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryByIdsParam() {
    return this.queryByIdsParam != null;
  }

  public void setQueryByIdsParamIsSet(boolean value) {
    if (!value) {
      this.queryByIdsParam = null;
    }
  }

  /**
   * 是否限时商城
   */
  public boolean isIsLimitMall() {
    return this.isLimitMall;
  }

  /**
   * 是否限时商城
   */
  public CSQueryMallByIdsMsg setIsLimitMall(boolean isLimitMall) {
    this.isLimitMall = isLimitMall;
    setIsLimitMallIsSet(true);
    return this;
  }

  public void unsetIsLimitMall() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID);
  }

  /** Returns true if field isLimitMall is set (has been assigned a value) and false otherwise */
  public boolean isSetIsLimitMall() {
    return EncodingUtils.testBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID);
  }

  public void setIsLimitMallIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISLIMITMALL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_BY_IDS_PARAM:
      if (value == null) {
        unsetQueryByIdsParam();
      } else {
        setQueryByIdsParam((com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam)value);
      }
      break;

    case IS_LIMIT_MALL:
      if (value == null) {
        unsetIsLimitMall();
      } else {
        setIsLimitMall((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_BY_IDS_PARAM:
      return getQueryByIdsParam();

    case IS_LIMIT_MALL:
      return Boolean.valueOf(isIsLimitMall());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_BY_IDS_PARAM:
      return isSetQueryByIdsParam();
    case IS_LIMIT_MALL:
      return isSetIsLimitMall();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSQueryMallByIdsMsg)
      return this.equals((CSQueryMallByIdsMsg)that);
    return false;
  }

  public boolean equals(CSQueryMallByIdsMsg that) {
    if (that == null)
      return false;

    boolean this_present_queryByIdsParam = true && this.isSetQueryByIdsParam();
    boolean that_present_queryByIdsParam = true && that.isSetQueryByIdsParam();
    if (this_present_queryByIdsParam || that_present_queryByIdsParam) {
      if (!(this_present_queryByIdsParam && that_present_queryByIdsParam))
        return false;
      if (!this.queryByIdsParam.equals(that.queryByIdsParam))
        return false;
    }

    boolean this_present_isLimitMall = true && this.isSetIsLimitMall();
    boolean that_present_isLimitMall = true && that.isSetIsLimitMall();
    if (this_present_isLimitMall || that_present_isLimitMall) {
      if (!(this_present_isLimitMall && that_present_isLimitMall))
        return false;
      if (this.isLimitMall != that.isLimitMall)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSQueryMallByIdsMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSQueryMallByIdsMsg typedOther = (CSQueryMallByIdsMsg)other;

    lastComparison = Boolean.valueOf(isSetQueryByIdsParam()).compareTo(typedOther.isSetQueryByIdsParam());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryByIdsParam()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryByIdsParam, typedOther.queryByIdsParam);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsLimitMall()).compareTo(typedOther.isSetIsLimitMall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsLimitMall()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isLimitMall, typedOther.isLimitMall);
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
    StringBuilder sb = new StringBuilder("CSQueryMallByIdsMsg(");
    boolean first = true;

    sb.append("queryByIdsParam:");
    if (this.queryByIdsParam == null) {
      sb.append("null");
    } else {
      sb.append(this.queryByIdsParam);
    }
    first = false;
    if (isSetIsLimitMall()) {
      if (!first) sb.append(", ");
      sb.append("isLimitMall:");
      sb.append(this.isLimitMall);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (queryByIdsParam != null) {
      queryByIdsParam.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CSQueryMallByIdsMsgStandardSchemeFactory implements SchemeFactory {
    public CSQueryMallByIdsMsgStandardScheme getScheme() {
      return new CSQueryMallByIdsMsgStandardScheme();
    }
  }

  private static class CSQueryMallByIdsMsgStandardScheme extends StandardScheme<CSQueryMallByIdsMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSQueryMallByIdsMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUERY_BY_IDS_PARAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.queryByIdsParam = new com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam();
              struct.queryByIdsParam.read(iprot);
              struct.setQueryByIdsParamIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_LIMIT_MALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isLimitMall = iprot.readBool();
              struct.setIsLimitMallIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSQueryMallByIdsMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queryByIdsParam != null) {
        oprot.writeFieldBegin(QUERY_BY_IDS_PARAM_FIELD_DESC);
        struct.queryByIdsParam.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsLimitMall()) {
        oprot.writeFieldBegin(IS_LIMIT_MALL_FIELD_DESC);
        oprot.writeBool(struct.isLimitMall);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSQueryMallByIdsMsgTupleSchemeFactory implements SchemeFactory {
    public CSQueryMallByIdsMsgTupleScheme getScheme() {
      return new CSQueryMallByIdsMsgTupleScheme();
    }
  }

  private static class CSQueryMallByIdsMsgTupleScheme extends TupleScheme<CSQueryMallByIdsMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSQueryMallByIdsMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQueryByIdsParam()) {
        optionals.set(0);
      }
      if (struct.isSetIsLimitMall()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetQueryByIdsParam()) {
        struct.queryByIdsParam.write(oprot);
      }
      if (struct.isSetIsLimitMall()) {
        oprot.writeBool(struct.isLimitMall);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSQueryMallByIdsMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.queryByIdsParam = new com.ling9527.music.common.msg.auto.CommonDataQueryByIdsParam();
        struct.queryByIdsParam.read(iprot);
        struct.setQueryByIdsParamIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isLimitMall = iprot.readBool();
        struct.setIsLimitMallIsSet(true);
      }
    }
  }

}
