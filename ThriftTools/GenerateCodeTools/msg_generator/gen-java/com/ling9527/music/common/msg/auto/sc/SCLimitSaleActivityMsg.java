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

public class SCLimitSaleActivityMsg implements org.apache.thrift.TBase<SCLimitSaleActivityMsg, SCLimitSaleActivityMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCLimitSaleActivityMsg");

  private static final org.apache.thrift.protocol.TField LIMIT_SALE_ACTIVITY_FIELD_DESC = new org.apache.thrift.protocol.TField("limitSaleActivity", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCLimitSaleActivityMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCLimitSaleActivityMsgTupleSchemeFactory());
  }

  public List<com.ling9527.music.common.msg.auto.LimitSaleActivity> limitSaleActivity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LIMIT_SALE_ACTIVITY((short)1, "limitSaleActivity");

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
        case 1: // LIMIT_SALE_ACTIVITY
          return LIMIT_SALE_ACTIVITY;
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
    tmpMap.put(_Fields.LIMIT_SALE_ACTIVITY, new org.apache.thrift.meta_data.FieldMetaData("limitSaleActivity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.LimitSaleActivity.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCLimitSaleActivityMsg.class, metaDataMap);
  }

  public SCLimitSaleActivityMsg() {
  }

  public SCLimitSaleActivityMsg(
    List<com.ling9527.music.common.msg.auto.LimitSaleActivity> limitSaleActivity)
  {
    this();
    this.limitSaleActivity = limitSaleActivity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCLimitSaleActivityMsg(SCLimitSaleActivityMsg other) {
    if (other.isSetLimitSaleActivity()) {
      List<com.ling9527.music.common.msg.auto.LimitSaleActivity> __this__limitSaleActivity = new ArrayList<com.ling9527.music.common.msg.auto.LimitSaleActivity>();
      for (com.ling9527.music.common.msg.auto.LimitSaleActivity other_element : other.limitSaleActivity) {
        __this__limitSaleActivity.add(new com.ling9527.music.common.msg.auto.LimitSaleActivity(other_element));
      }
      this.limitSaleActivity = __this__limitSaleActivity;
    }
  }

  public SCLimitSaleActivityMsg deepCopy() {
    return new SCLimitSaleActivityMsg(this);
  }

  @Override
  public void clear() {
    this.limitSaleActivity = null;
  }

  public int getLimitSaleActivitySize() {
    return (this.limitSaleActivity == null) ? 0 : this.limitSaleActivity.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.LimitSaleActivity> getLimitSaleActivityIterator() {
    return (this.limitSaleActivity == null) ? null : this.limitSaleActivity.iterator();
  }

  public void addToLimitSaleActivity(com.ling9527.music.common.msg.auto.LimitSaleActivity elem) {
    if (this.limitSaleActivity == null) {
      this.limitSaleActivity = new ArrayList<com.ling9527.music.common.msg.auto.LimitSaleActivity>();
    }
    this.limitSaleActivity.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.LimitSaleActivity> getLimitSaleActivity() {
    return this.limitSaleActivity;
  }

  public SCLimitSaleActivityMsg setLimitSaleActivity(List<com.ling9527.music.common.msg.auto.LimitSaleActivity> limitSaleActivity) {
    this.limitSaleActivity = limitSaleActivity;
    return this;
  }

  public void unsetLimitSaleActivity() {
    this.limitSaleActivity = null;
  }

  /** Returns true if field limitSaleActivity is set (has been assigned a value) and false otherwise */
  public boolean isSetLimitSaleActivity() {
    return this.limitSaleActivity != null;
  }

  public void setLimitSaleActivityIsSet(boolean value) {
    if (!value) {
      this.limitSaleActivity = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LIMIT_SALE_ACTIVITY:
      if (value == null) {
        unsetLimitSaleActivity();
      } else {
        setLimitSaleActivity((List<com.ling9527.music.common.msg.auto.LimitSaleActivity>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LIMIT_SALE_ACTIVITY:
      return getLimitSaleActivity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LIMIT_SALE_ACTIVITY:
      return isSetLimitSaleActivity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCLimitSaleActivityMsg)
      return this.equals((SCLimitSaleActivityMsg)that);
    return false;
  }

  public boolean equals(SCLimitSaleActivityMsg that) {
    if (that == null)
      return false;

    boolean this_present_limitSaleActivity = true && this.isSetLimitSaleActivity();
    boolean that_present_limitSaleActivity = true && that.isSetLimitSaleActivity();
    if (this_present_limitSaleActivity || that_present_limitSaleActivity) {
      if (!(this_present_limitSaleActivity && that_present_limitSaleActivity))
        return false;
      if (!this.limitSaleActivity.equals(that.limitSaleActivity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCLimitSaleActivityMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCLimitSaleActivityMsg typedOther = (SCLimitSaleActivityMsg)other;

    lastComparison = Boolean.valueOf(isSetLimitSaleActivity()).compareTo(typedOther.isSetLimitSaleActivity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimitSaleActivity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limitSaleActivity, typedOther.limitSaleActivity);
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
    StringBuilder sb = new StringBuilder("SCLimitSaleActivityMsg(");
    boolean first = true;

    sb.append("limitSaleActivity:");
    if (this.limitSaleActivity == null) {
      sb.append("null");
    } else {
      sb.append(this.limitSaleActivity);
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

  private static class SCLimitSaleActivityMsgStandardSchemeFactory implements SchemeFactory {
    public SCLimitSaleActivityMsgStandardScheme getScheme() {
      return new SCLimitSaleActivityMsgStandardScheme();
    }
  }

  private static class SCLimitSaleActivityMsgStandardScheme extends StandardScheme<SCLimitSaleActivityMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCLimitSaleActivityMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LIMIT_SALE_ACTIVITY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.limitSaleActivity = new ArrayList<com.ling9527.music.common.msg.auto.LimitSaleActivity>(_list56.size);
                for (int _i57 = 0; _i57 < _list56.size; ++_i57)
                {
                  com.ling9527.music.common.msg.auto.LimitSaleActivity _elem58; // required
                  _elem58 = new com.ling9527.music.common.msg.auto.LimitSaleActivity();
                  _elem58.read(iprot);
                  struct.limitSaleActivity.add(_elem58);
                }
                iprot.readListEnd();
              }
              struct.setLimitSaleActivityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCLimitSaleActivityMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.limitSaleActivity != null) {
        oprot.writeFieldBegin(LIMIT_SALE_ACTIVITY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.limitSaleActivity.size()));
          for (com.ling9527.music.common.msg.auto.LimitSaleActivity _iter59 : struct.limitSaleActivity)
          {
            _iter59.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCLimitSaleActivityMsgTupleSchemeFactory implements SchemeFactory {
    public SCLimitSaleActivityMsgTupleScheme getScheme() {
      return new SCLimitSaleActivityMsgTupleScheme();
    }
  }

  private static class SCLimitSaleActivityMsgTupleScheme extends TupleScheme<SCLimitSaleActivityMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCLimitSaleActivityMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLimitSaleActivity()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLimitSaleActivity()) {
        {
          oprot.writeI32(struct.limitSaleActivity.size());
          for (com.ling9527.music.common.msg.auto.LimitSaleActivity _iter60 : struct.limitSaleActivity)
          {
            _iter60.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCLimitSaleActivityMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.limitSaleActivity = new ArrayList<com.ling9527.music.common.msg.auto.LimitSaleActivity>(_list61.size);
          for (int _i62 = 0; _i62 < _list61.size; ++_i62)
          {
            com.ling9527.music.common.msg.auto.LimitSaleActivity _elem63; // required
            _elem63 = new com.ling9527.music.common.msg.auto.LimitSaleActivity();
            _elem63.read(iprot);
            struct.limitSaleActivity.add(_elem63);
          }
        }
        struct.setLimitSaleActivityIsSet(true);
      }
    }
  }

}

