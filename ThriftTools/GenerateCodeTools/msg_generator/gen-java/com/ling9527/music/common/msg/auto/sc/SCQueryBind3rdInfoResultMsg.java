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

public class SCQueryBind3rdInfoResultMsg implements org.apache.thrift.TBase<SCQueryBind3rdInfoResultMsg, SCQueryBind3rdInfoResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCQueryBind3rdInfoResultMsg");

  private static final org.apache.thrift.protocol.TField BIND_ACCOUNT_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("bindAccountIds", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BIND_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("bindType", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCQueryBind3rdInfoResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCQueryBind3rdInfoResultMsgTupleSchemeFactory());
  }

  public Map<Long,Long> bindAccountIds; // required
  public int index; // required
  /**
   * 
   * @see com.ling9527.music.common.msg.auto.BindAccountType
   */
  public com.ling9527.music.common.msg.auto.BindAccountType bindType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BIND_ACCOUNT_IDS((short)1, "bindAccountIds"),
    INDEX((short)2, "index"),
    /**
     * 
     * @see com.ling9527.music.common.msg.auto.BindAccountType
     */
    BIND_TYPE((short)3, "bindType");

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
        case 1: // BIND_ACCOUNT_IDS
          return BIND_ACCOUNT_IDS;
        case 2: // INDEX
          return INDEX;
        case 3: // BIND_TYPE
          return BIND_TYPE;
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
  private static final int __INDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BIND_ACCOUNT_IDS, new org.apache.thrift.meta_data.FieldMetaData("bindAccountIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BIND_TYPE, new org.apache.thrift.meta_data.FieldMetaData("bindType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.BindAccountType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCQueryBind3rdInfoResultMsg.class, metaDataMap);
  }

  public SCQueryBind3rdInfoResultMsg() {
  }

  public SCQueryBind3rdInfoResultMsg(
    Map<Long,Long> bindAccountIds,
    int index,
    com.ling9527.music.common.msg.auto.BindAccountType bindType)
  {
    this();
    this.bindAccountIds = bindAccountIds;
    this.index = index;
    setIndexIsSet(true);
    this.bindType = bindType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCQueryBind3rdInfoResultMsg(SCQueryBind3rdInfoResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBindAccountIds()) {
      Map<Long,Long> __this__bindAccountIds = new HashMap<Long,Long>();
      for (Map.Entry<Long, Long> other_element : other.bindAccountIds.entrySet()) {

        Long other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        Long __this__bindAccountIds_copy_key = other_element_key;

        Long __this__bindAccountIds_copy_value = other_element_value;

        __this__bindAccountIds.put(__this__bindAccountIds_copy_key, __this__bindAccountIds_copy_value);
      }
      this.bindAccountIds = __this__bindAccountIds;
    }
    this.index = other.index;
    if (other.isSetBindType()) {
      this.bindType = other.bindType;
    }
  }

  public SCQueryBind3rdInfoResultMsg deepCopy() {
    return new SCQueryBind3rdInfoResultMsg(this);
  }

  @Override
  public void clear() {
    this.bindAccountIds = null;
    setIndexIsSet(false);
    this.index = 0;
    this.bindType = null;
  }

  public int getBindAccountIdsSize() {
    return (this.bindAccountIds == null) ? 0 : this.bindAccountIds.size();
  }

  public void putToBindAccountIds(long key, long val) {
    if (this.bindAccountIds == null) {
      this.bindAccountIds = new HashMap<Long,Long>();
    }
    this.bindAccountIds.put(key, val);
  }

  public Map<Long,Long> getBindAccountIds() {
    return this.bindAccountIds;
  }

  public SCQueryBind3rdInfoResultMsg setBindAccountIds(Map<Long,Long> bindAccountIds) {
    this.bindAccountIds = bindAccountIds;
    return this;
  }

  public void unsetBindAccountIds() {
    this.bindAccountIds = null;
  }

  /** Returns true if field bindAccountIds is set (has been assigned a value) and false otherwise */
  public boolean isSetBindAccountIds() {
    return this.bindAccountIds != null;
  }

  public void setBindAccountIdsIsSet(boolean value) {
    if (!value) {
      this.bindAccountIds = null;
    }
  }

  public int getIndex() {
    return this.index;
  }

  public SCQueryBind3rdInfoResultMsg setIndex(int index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INDEX_ISSET_ID, value);
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.BindAccountType
   */
  public com.ling9527.music.common.msg.auto.BindAccountType getBindType() {
    return this.bindType;
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.BindAccountType
   */
  public SCQueryBind3rdInfoResultMsg setBindType(com.ling9527.music.common.msg.auto.BindAccountType bindType) {
    this.bindType = bindType;
    return this;
  }

  public void unsetBindType() {
    this.bindType = null;
  }

  /** Returns true if field bindType is set (has been assigned a value) and false otherwise */
  public boolean isSetBindType() {
    return this.bindType != null;
  }

  public void setBindTypeIsSet(boolean value) {
    if (!value) {
      this.bindType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BIND_ACCOUNT_IDS:
      if (value == null) {
        unsetBindAccountIds();
      } else {
        setBindAccountIds((Map<Long,Long>)value);
      }
      break;

    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((Integer)value);
      }
      break;

    case BIND_TYPE:
      if (value == null) {
        unsetBindType();
      } else {
        setBindType((com.ling9527.music.common.msg.auto.BindAccountType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BIND_ACCOUNT_IDS:
      return getBindAccountIds();

    case INDEX:
      return Integer.valueOf(getIndex());

    case BIND_TYPE:
      return getBindType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BIND_ACCOUNT_IDS:
      return isSetBindAccountIds();
    case INDEX:
      return isSetIndex();
    case BIND_TYPE:
      return isSetBindType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCQueryBind3rdInfoResultMsg)
      return this.equals((SCQueryBind3rdInfoResultMsg)that);
    return false;
  }

  public boolean equals(SCQueryBind3rdInfoResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_bindAccountIds = true && this.isSetBindAccountIds();
    boolean that_present_bindAccountIds = true && that.isSetBindAccountIds();
    if (this_present_bindAccountIds || that_present_bindAccountIds) {
      if (!(this_present_bindAccountIds && that_present_bindAccountIds))
        return false;
      if (!this.bindAccountIds.equals(that.bindAccountIds))
        return false;
    }

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    boolean this_present_bindType = true && this.isSetBindType();
    boolean that_present_bindType = true && that.isSetBindType();
    if (this_present_bindType || that_present_bindType) {
      if (!(this_present_bindType && that_present_bindType))
        return false;
      if (!this.bindType.equals(that.bindType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCQueryBind3rdInfoResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCQueryBind3rdInfoResultMsg typedOther = (SCQueryBind3rdInfoResultMsg)other;

    lastComparison = Boolean.valueOf(isSetBindAccountIds()).compareTo(typedOther.isSetBindAccountIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBindAccountIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bindAccountIds, typedOther.bindAccountIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIndex()).compareTo(typedOther.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, typedOther.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBindType()).compareTo(typedOther.isSetBindType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBindType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bindType, typedOther.bindType);
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
    StringBuilder sb = new StringBuilder("SCQueryBind3rdInfoResultMsg(");
    boolean first = true;

    sb.append("bindAccountIds:");
    if (this.bindAccountIds == null) {
      sb.append("null");
    } else {
      sb.append(this.bindAccountIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bindType:");
    if (this.bindType == null) {
      sb.append("null");
    } else {
      sb.append(this.bindType);
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

  private static class SCQueryBind3rdInfoResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCQueryBind3rdInfoResultMsgStandardScheme getScheme() {
      return new SCQueryBind3rdInfoResultMsgStandardScheme();
    }
  }

  private static class SCQueryBind3rdInfoResultMsgStandardScheme extends StandardScheme<SCQueryBind3rdInfoResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCQueryBind3rdInfoResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BIND_ACCOUNT_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map44 = iprot.readMapBegin();
                struct.bindAccountIds = new HashMap<Long,Long>(2*_map44.size);
                for (int _i45 = 0; _i45 < _map44.size; ++_i45)
                {
                  long _key46; // required
                  long _val47; // required
                  _key46 = iprot.readI64();
                  _val47 = iprot.readI64();
                  struct.bindAccountIds.put(_key46, _val47);
                }
                iprot.readMapEnd();
              }
              struct.setBindAccountIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index = iprot.readI32();
              struct.setIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BIND_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bindType = com.ling9527.music.common.msg.auto.BindAccountType.findByValue(iprot.readI32());
              struct.setBindTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCQueryBind3rdInfoResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bindAccountIds != null) {
        oprot.writeFieldBegin(BIND_ACCOUNT_IDS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.I64, struct.bindAccountIds.size()));
          for (Map.Entry<Long, Long> _iter48 : struct.bindAccountIds.entrySet())
          {
            oprot.writeI64(_iter48.getKey());
            oprot.writeI64(_iter48.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeI32(struct.index);
      oprot.writeFieldEnd();
      if (struct.bindType != null) {
        oprot.writeFieldBegin(BIND_TYPE_FIELD_DESC);
        oprot.writeI32(struct.bindType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCQueryBind3rdInfoResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCQueryBind3rdInfoResultMsgTupleScheme getScheme() {
      return new SCQueryBind3rdInfoResultMsgTupleScheme();
    }
  }

  private static class SCQueryBind3rdInfoResultMsgTupleScheme extends TupleScheme<SCQueryBind3rdInfoResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCQueryBind3rdInfoResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBindAccountIds()) {
        optionals.set(0);
      }
      if (struct.isSetIndex()) {
        optionals.set(1);
      }
      if (struct.isSetBindType()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBindAccountIds()) {
        {
          oprot.writeI32(struct.bindAccountIds.size());
          for (Map.Entry<Long, Long> _iter49 : struct.bindAccountIds.entrySet())
          {
            oprot.writeI64(_iter49.getKey());
            oprot.writeI64(_iter49.getValue());
          }
        }
      }
      if (struct.isSetIndex()) {
        oprot.writeI32(struct.index);
      }
      if (struct.isSetBindType()) {
        oprot.writeI32(struct.bindType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCQueryBind3rdInfoResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map50 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.bindAccountIds = new HashMap<Long,Long>(2*_map50.size);
          for (int _i51 = 0; _i51 < _map50.size; ++_i51)
          {
            long _key52; // required
            long _val53; // required
            _key52 = iprot.readI64();
            _val53 = iprot.readI64();
            struct.bindAccountIds.put(_key52, _val53);
          }
        }
        struct.setBindAccountIdsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.index = iprot.readI32();
        struct.setIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bindType = com.ling9527.music.common.msg.auto.BindAccountType.findByValue(iprot.readI32());
        struct.setBindTypeIsSet(true);
      }
    }
  }

}
