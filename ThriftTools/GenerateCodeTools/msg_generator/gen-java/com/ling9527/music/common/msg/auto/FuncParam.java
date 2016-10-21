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

public class FuncParam implements org.apache.thrift.TBase<FuncParam, FuncParam._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FuncParam");

  private static final org.apache.thrift.protocol.TField FUNC_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("funcId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARAM_FIELD_DESC = new org.apache.thrift.protocol.TField("param", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FuncParamStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FuncParamTupleSchemeFactory());
  }

  public int funcId; // required
  public ByteBuffer param; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FUNC_ID((short)1, "funcId"),
    PARAM((short)2, "param");

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
        case 1: // FUNC_ID
          return FUNC_ID;
        case 2: // PARAM
          return PARAM;
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
  private static final int __FUNCID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FUNC_ID, new org.apache.thrift.meta_data.FieldMetaData("funcId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARAM, new org.apache.thrift.meta_data.FieldMetaData("param", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FuncParam.class, metaDataMap);
  }

  public FuncParam() {
  }

  public FuncParam(
    int funcId,
    ByteBuffer param)
  {
    this();
    this.funcId = funcId;
    setFuncIdIsSet(true);
    this.param = param;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FuncParam(FuncParam other) {
    __isset_bitfield = other.__isset_bitfield;
    this.funcId = other.funcId;
    if (other.isSetParam()) {
      this.param = org.apache.thrift.TBaseHelper.copyBinary(other.param);
;
    }
  }

  public FuncParam deepCopy() {
    return new FuncParam(this);
  }

  @Override
  public void clear() {
    setFuncIdIsSet(false);
    this.funcId = 0;
    this.param = null;
  }

  public int getFuncId() {
    return this.funcId;
  }

  public FuncParam setFuncId(int funcId) {
    this.funcId = funcId;
    setFuncIdIsSet(true);
    return this;
  }

  public void unsetFuncId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FUNCID_ISSET_ID);
  }

  /** Returns true if field funcId is set (has been assigned a value) and false otherwise */
  public boolean isSetFuncId() {
    return EncodingUtils.testBit(__isset_bitfield, __FUNCID_ISSET_ID);
  }

  public void setFuncIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FUNCID_ISSET_ID, value);
  }

  public byte[] getParam() {
    setParam(org.apache.thrift.TBaseHelper.rightSize(param));
    return param == null ? null : param.array();
  }

  public ByteBuffer bufferForParam() {
    return param;
  }

  public FuncParam setParam(byte[] param) {
    setParam(param == null ? (ByteBuffer)null : ByteBuffer.wrap(param));
    return this;
  }

  public FuncParam setParam(ByteBuffer param) {
    this.param = param;
    return this;
  }

  public void unsetParam() {
    this.param = null;
  }

  /** Returns true if field param is set (has been assigned a value) and false otherwise */
  public boolean isSetParam() {
    return this.param != null;
  }

  public void setParamIsSet(boolean value) {
    if (!value) {
      this.param = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FUNC_ID:
      if (value == null) {
        unsetFuncId();
      } else {
        setFuncId((Integer)value);
      }
      break;

    case PARAM:
      if (value == null) {
        unsetParam();
      } else {
        setParam((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FUNC_ID:
      return Integer.valueOf(getFuncId());

    case PARAM:
      return getParam();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FUNC_ID:
      return isSetFuncId();
    case PARAM:
      return isSetParam();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FuncParam)
      return this.equals((FuncParam)that);
    return false;
  }

  public boolean equals(FuncParam that) {
    if (that == null)
      return false;

    boolean this_present_funcId = true;
    boolean that_present_funcId = true;
    if (this_present_funcId || that_present_funcId) {
      if (!(this_present_funcId && that_present_funcId))
        return false;
      if (this.funcId != that.funcId)
        return false;
    }

    boolean this_present_param = true && this.isSetParam();
    boolean that_present_param = true && that.isSetParam();
    if (this_present_param || that_present_param) {
      if (!(this_present_param && that_present_param))
        return false;
      if (!this.param.equals(that.param))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(FuncParam other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FuncParam typedOther = (FuncParam)other;

    lastComparison = Boolean.valueOf(isSetFuncId()).compareTo(typedOther.isSetFuncId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFuncId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.funcId, typedOther.funcId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParam()).compareTo(typedOther.isSetParam());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParam()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.param, typedOther.param);
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
    StringBuilder sb = new StringBuilder("FuncParam(");
    boolean first = true;

    sb.append("funcId:");
    sb.append(this.funcId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("param:");
    if (this.param == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.param, sb);
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

  private static class FuncParamStandardSchemeFactory implements SchemeFactory {
    public FuncParamStandardScheme getScheme() {
      return new FuncParamStandardScheme();
    }
  }

  private static class FuncParamStandardScheme extends StandardScheme<FuncParam> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FuncParam struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FUNC_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.funcId = iprot.readI32();
              struct.setFuncIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.param = iprot.readBinary();
              struct.setParamIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FuncParam struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FUNC_ID_FIELD_DESC);
      oprot.writeI32(struct.funcId);
      oprot.writeFieldEnd();
      if (struct.param != null) {
        oprot.writeFieldBegin(PARAM_FIELD_DESC);
        oprot.writeBinary(struct.param);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FuncParamTupleSchemeFactory implements SchemeFactory {
    public FuncParamTupleScheme getScheme() {
      return new FuncParamTupleScheme();
    }
  }

  private static class FuncParamTupleScheme extends TupleScheme<FuncParam> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FuncParam struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFuncId()) {
        optionals.set(0);
      }
      if (struct.isSetParam()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFuncId()) {
        oprot.writeI32(struct.funcId);
      }
      if (struct.isSetParam()) {
        oprot.writeBinary(struct.param);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FuncParam struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.funcId = iprot.readI32();
        struct.setFuncIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.param = iprot.readBinary();
        struct.setParamIsSet(true);
      }
    }
  }

}
