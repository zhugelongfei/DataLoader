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
 * 传统模式输入数据， 由传统模式输入id和关键点序列组成
 */
public class SCGenerateTraditionalInputMsg implements org.apache.thrift.TBase<SCGenerateTraditionalInputMsg, SCGenerateTraditionalInputMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCGenerateTraditionalInputMsg");

  private static final org.apache.thrift.protocol.TField INPUT_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("inputInfos", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCGenerateTraditionalInputMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCGenerateTraditionalInputMsgTupleSchemeFactory());
  }

  /**
   * 一组输入片段序列
   */
  public List<com.ling9527.music.common.msg.auto.TradSegmentInput> inputInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 一组输入片段序列
     */
    INPUT_INFOS((short)1, "inputInfos");

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
        case 1: // INPUT_INFOS
          return INPUT_INFOS;
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
    tmpMap.put(_Fields.INPUT_INFOS, new org.apache.thrift.meta_data.FieldMetaData("inputInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.TradSegmentInput.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCGenerateTraditionalInputMsg.class, metaDataMap);
  }

  public SCGenerateTraditionalInputMsg() {
  }

  public SCGenerateTraditionalInputMsg(
    List<com.ling9527.music.common.msg.auto.TradSegmentInput> inputInfos)
  {
    this();
    this.inputInfos = inputInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCGenerateTraditionalInputMsg(SCGenerateTraditionalInputMsg other) {
    if (other.isSetInputInfos()) {
      List<com.ling9527.music.common.msg.auto.TradSegmentInput> __this__inputInfos = new ArrayList<com.ling9527.music.common.msg.auto.TradSegmentInput>();
      for (com.ling9527.music.common.msg.auto.TradSegmentInput other_element : other.inputInfos) {
        __this__inputInfos.add(new com.ling9527.music.common.msg.auto.TradSegmentInput(other_element));
      }
      this.inputInfos = __this__inputInfos;
    }
  }

  public SCGenerateTraditionalInputMsg deepCopy() {
    return new SCGenerateTraditionalInputMsg(this);
  }

  @Override
  public void clear() {
    this.inputInfos = null;
  }

  public int getInputInfosSize() {
    return (this.inputInfos == null) ? 0 : this.inputInfos.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.TradSegmentInput> getInputInfosIterator() {
    return (this.inputInfos == null) ? null : this.inputInfos.iterator();
  }

  public void addToInputInfos(com.ling9527.music.common.msg.auto.TradSegmentInput elem) {
    if (this.inputInfos == null) {
      this.inputInfos = new ArrayList<com.ling9527.music.common.msg.auto.TradSegmentInput>();
    }
    this.inputInfos.add(elem);
  }

  /**
   * 一组输入片段序列
   */
  public List<com.ling9527.music.common.msg.auto.TradSegmentInput> getInputInfos() {
    return this.inputInfos;
  }

  /**
   * 一组输入片段序列
   */
  public SCGenerateTraditionalInputMsg setInputInfos(List<com.ling9527.music.common.msg.auto.TradSegmentInput> inputInfos) {
    this.inputInfos = inputInfos;
    return this;
  }

  public void unsetInputInfos() {
    this.inputInfos = null;
  }

  /** Returns true if field inputInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetInputInfos() {
    return this.inputInfos != null;
  }

  public void setInputInfosIsSet(boolean value) {
    if (!value) {
      this.inputInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INPUT_INFOS:
      if (value == null) {
        unsetInputInfos();
      } else {
        setInputInfos((List<com.ling9527.music.common.msg.auto.TradSegmentInput>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INPUT_INFOS:
      return getInputInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INPUT_INFOS:
      return isSetInputInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCGenerateTraditionalInputMsg)
      return this.equals((SCGenerateTraditionalInputMsg)that);
    return false;
  }

  public boolean equals(SCGenerateTraditionalInputMsg that) {
    if (that == null)
      return false;

    boolean this_present_inputInfos = true && this.isSetInputInfos();
    boolean that_present_inputInfos = true && that.isSetInputInfos();
    if (this_present_inputInfos || that_present_inputInfos) {
      if (!(this_present_inputInfos && that_present_inputInfos))
        return false;
      if (!this.inputInfos.equals(that.inputInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCGenerateTraditionalInputMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCGenerateTraditionalInputMsg typedOther = (SCGenerateTraditionalInputMsg)other;

    lastComparison = Boolean.valueOf(isSetInputInfos()).compareTo(typedOther.isSetInputInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputInfos, typedOther.inputInfos);
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
    StringBuilder sb = new StringBuilder("SCGenerateTraditionalInputMsg(");
    boolean first = true;

    sb.append("inputInfos:");
    if (this.inputInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.inputInfos);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCGenerateTraditionalInputMsgStandardSchemeFactory implements SchemeFactory {
    public SCGenerateTraditionalInputMsgStandardScheme getScheme() {
      return new SCGenerateTraditionalInputMsgStandardScheme();
    }
  }

  private static class SCGenerateTraditionalInputMsgStandardScheme extends StandardScheme<SCGenerateTraditionalInputMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCGenerateTraditionalInputMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INPUT_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list96 = iprot.readListBegin();
                struct.inputInfos = new ArrayList<com.ling9527.music.common.msg.auto.TradSegmentInput>(_list96.size);
                for (int _i97 = 0; _i97 < _list96.size; ++_i97)
                {
                  com.ling9527.music.common.msg.auto.TradSegmentInput _elem98; // required
                  _elem98 = new com.ling9527.music.common.msg.auto.TradSegmentInput();
                  _elem98.read(iprot);
                  struct.inputInfos.add(_elem98);
                }
                iprot.readListEnd();
              }
              struct.setInputInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCGenerateTraditionalInputMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.inputInfos != null) {
        oprot.writeFieldBegin(INPUT_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.inputInfos.size()));
          for (com.ling9527.music.common.msg.auto.TradSegmentInput _iter99 : struct.inputInfos)
          {
            _iter99.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCGenerateTraditionalInputMsgTupleSchemeFactory implements SchemeFactory {
    public SCGenerateTraditionalInputMsgTupleScheme getScheme() {
      return new SCGenerateTraditionalInputMsgTupleScheme();
    }
  }

  private static class SCGenerateTraditionalInputMsgTupleScheme extends TupleScheme<SCGenerateTraditionalInputMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCGenerateTraditionalInputMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInputInfos()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetInputInfos()) {
        {
          oprot.writeI32(struct.inputInfos.size());
          for (com.ling9527.music.common.msg.auto.TradSegmentInput _iter100 : struct.inputInfos)
          {
            _iter100.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCGenerateTraditionalInputMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list101 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.inputInfos = new ArrayList<com.ling9527.music.common.msg.auto.TradSegmentInput>(_list101.size);
          for (int _i102 = 0; _i102 < _list101.size; ++_i102)
          {
            com.ling9527.music.common.msg.auto.TradSegmentInput _elem103; // required
            _elem103 = new com.ling9527.music.common.msg.auto.TradSegmentInput();
            _elem103.read(iprot);
            struct.inputInfos.add(_elem103);
          }
        }
        struct.setInputInfosIsSet(true);
      }
    }
  }

}

