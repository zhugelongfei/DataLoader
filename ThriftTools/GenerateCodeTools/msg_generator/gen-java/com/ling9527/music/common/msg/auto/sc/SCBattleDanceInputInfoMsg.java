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

public class SCBattleDanceInputInfoMsg implements org.apache.thrift.TBase<SCBattleDanceInputInfoMsg, SCBattleDanceInputInfoMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCBattleDanceInputInfoMsg");

  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCBattleDanceInputInfoMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCBattleDanceInputInfoMsgTupleSchemeFactory());
  }

  public List<com.ling9527.music.common.msg.auto.BattleDancePartData> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA((short)1, "data");

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
        case 1: // DATA
          return DATA;
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
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.BattleDancePartData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCBattleDanceInputInfoMsg.class, metaDataMap);
  }

  public SCBattleDanceInputInfoMsg() {
  }

  public SCBattleDanceInputInfoMsg(
    List<com.ling9527.music.common.msg.auto.BattleDancePartData> data)
  {
    this();
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCBattleDanceInputInfoMsg(SCBattleDanceInputInfoMsg other) {
    if (other.isSetData()) {
      List<com.ling9527.music.common.msg.auto.BattleDancePartData> __this__data = new ArrayList<com.ling9527.music.common.msg.auto.BattleDancePartData>();
      for (com.ling9527.music.common.msg.auto.BattleDancePartData other_element : other.data) {
        __this__data.add(new com.ling9527.music.common.msg.auto.BattleDancePartData(other_element));
      }
      this.data = __this__data;
    }
  }

  public SCBattleDanceInputInfoMsg deepCopy() {
    return new SCBattleDanceInputInfoMsg(this);
  }

  @Override
  public void clear() {
    this.data = null;
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.BattleDancePartData> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(com.ling9527.music.common.msg.auto.BattleDancePartData elem) {
    if (this.data == null) {
      this.data = new ArrayList<com.ling9527.music.common.msg.auto.BattleDancePartData>();
    }
    this.data.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.BattleDancePartData> getData() {
    return this.data;
  }

  public SCBattleDanceInputInfoMsg setData(List<com.ling9527.music.common.msg.auto.BattleDancePartData> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<com.ling9527.music.common.msg.auto.BattleDancePartData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCBattleDanceInputInfoMsg)
      return this.equals((SCBattleDanceInputInfoMsg)that);
    return false;
  }

  public boolean equals(SCBattleDanceInputInfoMsg that) {
    if (that == null)
      return false;

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCBattleDanceInputInfoMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCBattleDanceInputInfoMsg typedOther = (SCBattleDanceInputInfoMsg)other;

    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, typedOther.data);
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
    StringBuilder sb = new StringBuilder("SCBattleDanceInputInfoMsg(");
    boolean first = true;

    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
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

  private static class SCBattleDanceInputInfoMsgStandardSchemeFactory implements SchemeFactory {
    public SCBattleDanceInputInfoMsgStandardScheme getScheme() {
      return new SCBattleDanceInputInfoMsgStandardScheme();
    }
  }

  private static class SCBattleDanceInputInfoMsgStandardScheme extends StandardScheme<SCBattleDanceInputInfoMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCBattleDanceInputInfoMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.data = new ArrayList<com.ling9527.music.common.msg.auto.BattleDancePartData>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  com.ling9527.music.common.msg.auto.BattleDancePartData _elem2; // required
                  _elem2 = new com.ling9527.music.common.msg.auto.BattleDancePartData();
                  _elem2.read(iprot);
                  struct.data.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCBattleDanceInputInfoMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.data.size()));
          for (com.ling9527.music.common.msg.auto.BattleDancePartData _iter3 : struct.data)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCBattleDanceInputInfoMsgTupleSchemeFactory implements SchemeFactory {
    public SCBattleDanceInputInfoMsgTupleScheme getScheme() {
      return new SCBattleDanceInputInfoMsgTupleScheme();
    }
  }

  private static class SCBattleDanceInputInfoMsgTupleScheme extends TupleScheme<SCBattleDanceInputInfoMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCBattleDanceInputInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetData()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (com.ling9527.music.common.msg.auto.BattleDancePartData _iter4 : struct.data)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCBattleDanceInputInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.data = new ArrayList<com.ling9527.music.common.msg.auto.BattleDancePartData>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            com.ling9527.music.common.msg.auto.BattleDancePartData _elem7; // required
            _elem7 = new com.ling9527.music.common.msg.auto.BattleDancePartData();
            _elem7.read(iprot);
            struct.data.add(_elem7);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

