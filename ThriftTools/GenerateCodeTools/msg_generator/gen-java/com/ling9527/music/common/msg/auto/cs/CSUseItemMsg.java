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

public class CSUseItemMsg implements org.apache.thrift.TBase<CSUseItemMsg, CSUseItemMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSUseItemMsg");

  private static final org.apache.thrift.protocol.TField INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_CHAR_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("targetCharIds", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FUNC_REQ_PARAM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("funcReqParamList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSUseItemMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSUseItemMsgTupleSchemeFactory());
  }

  public long instanceId; // required
  public List<Long> targetCharIds; // required
  public List<com.ling9527.music.common.msg.auto.FuncParam> funcReqParamList; // required
  public int count; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INSTANCE_ID((short)1, "instanceId"),
    TARGET_CHAR_IDS((short)2, "targetCharIds"),
    FUNC_REQ_PARAM_LIST((short)3, "funcReqParamList"),
    COUNT((short)4, "count");

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
        case 1: // INSTANCE_ID
          return INSTANCE_ID;
        case 2: // TARGET_CHAR_IDS
          return TARGET_CHAR_IDS;
        case 3: // FUNC_REQ_PARAM_LIST
          return FUNC_REQ_PARAM_LIST;
        case 4: // COUNT
          return COUNT;
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
  private static final int __INSTANCEID_ISSET_ID = 0;
  private static final int __COUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("instanceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TARGET_CHAR_IDS, new org.apache.thrift.meta_data.FieldMetaData("targetCharIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.FUNC_REQ_PARAM_LIST, new org.apache.thrift.meta_data.FieldMetaData("funcReqParamList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.FuncParam.class))));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSUseItemMsg.class, metaDataMap);
  }

  public CSUseItemMsg() {
  }

  public CSUseItemMsg(
    long instanceId,
    List<Long> targetCharIds,
    List<com.ling9527.music.common.msg.auto.FuncParam> funcReqParamList,
    int count)
  {
    this();
    this.instanceId = instanceId;
    setInstanceIdIsSet(true);
    this.targetCharIds = targetCharIds;
    this.funcReqParamList = funcReqParamList;
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSUseItemMsg(CSUseItemMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.instanceId = other.instanceId;
    if (other.isSetTargetCharIds()) {
      List<Long> __this__targetCharIds = new ArrayList<Long>();
      for (Long other_element : other.targetCharIds) {
        __this__targetCharIds.add(other_element);
      }
      this.targetCharIds = __this__targetCharIds;
    }
    if (other.isSetFuncReqParamList()) {
      List<com.ling9527.music.common.msg.auto.FuncParam> __this__funcReqParamList = new ArrayList<com.ling9527.music.common.msg.auto.FuncParam>();
      for (com.ling9527.music.common.msg.auto.FuncParam other_element : other.funcReqParamList) {
        __this__funcReqParamList.add(new com.ling9527.music.common.msg.auto.FuncParam(other_element));
      }
      this.funcReqParamList = __this__funcReqParamList;
    }
    this.count = other.count;
  }

  public CSUseItemMsg deepCopy() {
    return new CSUseItemMsg(this);
  }

  @Override
  public void clear() {
    setInstanceIdIsSet(false);
    this.instanceId = 0;
    this.targetCharIds = null;
    this.funcReqParamList = null;
    setCountIsSet(false);
    this.count = 0;
  }

  public long getInstanceId() {
    return this.instanceId;
  }

  public CSUseItemMsg setInstanceId(long instanceId) {
    this.instanceId = instanceId;
    setInstanceIdIsSet(true);
    return this;
  }

  public void unsetInstanceId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INSTANCEID_ISSET_ID);
  }

  /** Returns true if field instanceId is set (has been assigned a value) and false otherwise */
  public boolean isSetInstanceId() {
    return EncodingUtils.testBit(__isset_bitfield, __INSTANCEID_ISSET_ID);
  }

  public void setInstanceIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INSTANCEID_ISSET_ID, value);
  }

  public int getTargetCharIdsSize() {
    return (this.targetCharIds == null) ? 0 : this.targetCharIds.size();
  }

  public java.util.Iterator<Long> getTargetCharIdsIterator() {
    return (this.targetCharIds == null) ? null : this.targetCharIds.iterator();
  }

  public void addToTargetCharIds(long elem) {
    if (this.targetCharIds == null) {
      this.targetCharIds = new ArrayList<Long>();
    }
    this.targetCharIds.add(elem);
  }

  public List<Long> getTargetCharIds() {
    return this.targetCharIds;
  }

  public CSUseItemMsg setTargetCharIds(List<Long> targetCharIds) {
    this.targetCharIds = targetCharIds;
    return this;
  }

  public void unsetTargetCharIds() {
    this.targetCharIds = null;
  }

  /** Returns true if field targetCharIds is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetCharIds() {
    return this.targetCharIds != null;
  }

  public void setTargetCharIdsIsSet(boolean value) {
    if (!value) {
      this.targetCharIds = null;
    }
  }

  public int getFuncReqParamListSize() {
    return (this.funcReqParamList == null) ? 0 : this.funcReqParamList.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.FuncParam> getFuncReqParamListIterator() {
    return (this.funcReqParamList == null) ? null : this.funcReqParamList.iterator();
  }

  public void addToFuncReqParamList(com.ling9527.music.common.msg.auto.FuncParam elem) {
    if (this.funcReqParamList == null) {
      this.funcReqParamList = new ArrayList<com.ling9527.music.common.msg.auto.FuncParam>();
    }
    this.funcReqParamList.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.FuncParam> getFuncReqParamList() {
    return this.funcReqParamList;
  }

  public CSUseItemMsg setFuncReqParamList(List<com.ling9527.music.common.msg.auto.FuncParam> funcReqParamList) {
    this.funcReqParamList = funcReqParamList;
    return this;
  }

  public void unsetFuncReqParamList() {
    this.funcReqParamList = null;
  }

  /** Returns true if field funcReqParamList is set (has been assigned a value) and false otherwise */
  public boolean isSetFuncReqParamList() {
    return this.funcReqParamList != null;
  }

  public void setFuncReqParamListIsSet(boolean value) {
    if (!value) {
      this.funcReqParamList = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public CSUseItemMsg setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INSTANCE_ID:
      if (value == null) {
        unsetInstanceId();
      } else {
        setInstanceId((Long)value);
      }
      break;

    case TARGET_CHAR_IDS:
      if (value == null) {
        unsetTargetCharIds();
      } else {
        setTargetCharIds((List<Long>)value);
      }
      break;

    case FUNC_REQ_PARAM_LIST:
      if (value == null) {
        unsetFuncReqParamList();
      } else {
        setFuncReqParamList((List<com.ling9527.music.common.msg.auto.FuncParam>)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INSTANCE_ID:
      return Long.valueOf(getInstanceId());

    case TARGET_CHAR_IDS:
      return getTargetCharIds();

    case FUNC_REQ_PARAM_LIST:
      return getFuncReqParamList();

    case COUNT:
      return Integer.valueOf(getCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INSTANCE_ID:
      return isSetInstanceId();
    case TARGET_CHAR_IDS:
      return isSetTargetCharIds();
    case FUNC_REQ_PARAM_LIST:
      return isSetFuncReqParamList();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSUseItemMsg)
      return this.equals((CSUseItemMsg)that);
    return false;
  }

  public boolean equals(CSUseItemMsg that) {
    if (that == null)
      return false;

    boolean this_present_instanceId = true;
    boolean that_present_instanceId = true;
    if (this_present_instanceId || that_present_instanceId) {
      if (!(this_present_instanceId && that_present_instanceId))
        return false;
      if (this.instanceId != that.instanceId)
        return false;
    }

    boolean this_present_targetCharIds = true && this.isSetTargetCharIds();
    boolean that_present_targetCharIds = true && that.isSetTargetCharIds();
    if (this_present_targetCharIds || that_present_targetCharIds) {
      if (!(this_present_targetCharIds && that_present_targetCharIds))
        return false;
      if (!this.targetCharIds.equals(that.targetCharIds))
        return false;
    }

    boolean this_present_funcReqParamList = true && this.isSetFuncReqParamList();
    boolean that_present_funcReqParamList = true && that.isSetFuncReqParamList();
    if (this_present_funcReqParamList || that_present_funcReqParamList) {
      if (!(this_present_funcReqParamList && that_present_funcReqParamList))
        return false;
      if (!this.funcReqParamList.equals(that.funcReqParamList))
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSUseItemMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSUseItemMsg typedOther = (CSUseItemMsg)other;

    lastComparison = Boolean.valueOf(isSetInstanceId()).compareTo(typedOther.isSetInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceId, typedOther.instanceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetCharIds()).compareTo(typedOther.isSetTargetCharIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetCharIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetCharIds, typedOther.targetCharIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFuncReqParamList()).compareTo(typedOther.isSetFuncReqParamList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFuncReqParamList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.funcReqParamList, typedOther.funcReqParamList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(typedOther.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, typedOther.count);
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
    StringBuilder sb = new StringBuilder("CSUseItemMsg(");
    boolean first = true;

    sb.append("instanceId:");
    sb.append(this.instanceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetCharIds:");
    if (this.targetCharIds == null) {
      sb.append("null");
    } else {
      sb.append(this.targetCharIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("funcReqParamList:");
    if (this.funcReqParamList == null) {
      sb.append("null");
    } else {
      sb.append(this.funcReqParamList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
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

  private static class CSUseItemMsgStandardSchemeFactory implements SchemeFactory {
    public CSUseItemMsgStandardScheme getScheme() {
      return new CSUseItemMsgStandardScheme();
    }
  }

  private static class CSUseItemMsgStandardScheme extends StandardScheme<CSUseItemMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSUseItemMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.instanceId = iprot.readI64();
              struct.setInstanceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET_CHAR_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.targetCharIds = new ArrayList<Long>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  long _elem18; // required
                  _elem18 = iprot.readI64();
                  struct.targetCharIds.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setTargetCharIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FUNC_REQ_PARAM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.funcReqParamList = new ArrayList<com.ling9527.music.common.msg.auto.FuncParam>(_list19.size);
                for (int _i20 = 0; _i20 < _list19.size; ++_i20)
                {
                  com.ling9527.music.common.msg.auto.FuncParam _elem21; // required
                  _elem21 = new com.ling9527.music.common.msg.auto.FuncParam();
                  _elem21.read(iprot);
                  struct.funcReqParamList.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setFuncReqParamListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSUseItemMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INSTANCE_ID_FIELD_DESC);
      oprot.writeI64(struct.instanceId);
      oprot.writeFieldEnd();
      if (struct.targetCharIds != null) {
        oprot.writeFieldBegin(TARGET_CHAR_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.targetCharIds.size()));
          for (long _iter22 : struct.targetCharIds)
          {
            oprot.writeI64(_iter22);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.funcReqParamList != null) {
        oprot.writeFieldBegin(FUNC_REQ_PARAM_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.funcReqParamList.size()));
          for (com.ling9527.music.common.msg.auto.FuncParam _iter23 : struct.funcReqParamList)
          {
            _iter23.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSUseItemMsgTupleSchemeFactory implements SchemeFactory {
    public CSUseItemMsgTupleScheme getScheme() {
      return new CSUseItemMsgTupleScheme();
    }
  }

  private static class CSUseItemMsgTupleScheme extends TupleScheme<CSUseItemMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSUseItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInstanceId()) {
        optionals.set(0);
      }
      if (struct.isSetTargetCharIds()) {
        optionals.set(1);
      }
      if (struct.isSetFuncReqParamList()) {
        optionals.set(2);
      }
      if (struct.isSetCount()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetInstanceId()) {
        oprot.writeI64(struct.instanceId);
      }
      if (struct.isSetTargetCharIds()) {
        {
          oprot.writeI32(struct.targetCharIds.size());
          for (long _iter24 : struct.targetCharIds)
          {
            oprot.writeI64(_iter24);
          }
        }
      }
      if (struct.isSetFuncReqParamList()) {
        {
          oprot.writeI32(struct.funcReqParamList.size());
          for (com.ling9527.music.common.msg.auto.FuncParam _iter25 : struct.funcReqParamList)
          {
            _iter25.write(oprot);
          }
        }
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSUseItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.instanceId = iprot.readI64();
        struct.setInstanceIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.targetCharIds = new ArrayList<Long>(_list26.size);
          for (int _i27 = 0; _i27 < _list26.size; ++_i27)
          {
            long _elem28; // required
            _elem28 = iprot.readI64();
            struct.targetCharIds.add(_elem28);
          }
        }
        struct.setTargetCharIdsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.funcReqParamList = new ArrayList<com.ling9527.music.common.msg.auto.FuncParam>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            com.ling9527.music.common.msg.auto.FuncParam _elem31; // required
            _elem31 = new com.ling9527.music.common.msg.auto.FuncParam();
            _elem31.read(iprot);
            struct.funcReqParamList.add(_elem31);
          }
        }
        struct.setFuncReqParamListIsSet(true);
      }
      if (incoming.get(3)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
    }
  }

}

