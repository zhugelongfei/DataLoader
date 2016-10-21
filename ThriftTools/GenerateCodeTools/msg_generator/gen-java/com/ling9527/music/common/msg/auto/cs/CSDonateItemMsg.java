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

public class CSDonateItemMsg implements org.apache.thrift.TBase<CSDonateItemMsg, CSDonateItemMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSDonateItemMsg");

  private static final org.apache.thrift.protocol.TField INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetCharId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSDonateItemMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSDonateItemMsgTupleSchemeFactory());
  }

  public long instanceId; // required
  public long targetCharId; // required
  public int count; // required
  public String content; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INSTANCE_ID((short)1, "instanceId"),
    TARGET_CHAR_ID((short)2, "targetCharId"),
    COUNT((short)4, "count"),
    CONTENT((short)5, "content");

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
        case 2: // TARGET_CHAR_ID
          return TARGET_CHAR_ID;
        case 4: // COUNT
          return COUNT;
        case 5: // CONTENT
          return CONTENT;
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
  private static final int __TARGETCHARID_ISSET_ID = 1;
  private static final int __COUNT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("instanceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TARGET_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("targetCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSDonateItemMsg.class, metaDataMap);
  }

  public CSDonateItemMsg() {
  }

  public CSDonateItemMsg(
    long instanceId,
    long targetCharId,
    int count,
    String content)
  {
    this();
    this.instanceId = instanceId;
    setInstanceIdIsSet(true);
    this.targetCharId = targetCharId;
    setTargetCharIdIsSet(true);
    this.count = count;
    setCountIsSet(true);
    this.content = content;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSDonateItemMsg(CSDonateItemMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.instanceId = other.instanceId;
    this.targetCharId = other.targetCharId;
    this.count = other.count;
    if (other.isSetContent()) {
      this.content = other.content;
    }
  }

  public CSDonateItemMsg deepCopy() {
    return new CSDonateItemMsg(this);
  }

  @Override
  public void clear() {
    setInstanceIdIsSet(false);
    this.instanceId = 0;
    setTargetCharIdIsSet(false);
    this.targetCharId = 0;
    setCountIsSet(false);
    this.count = 0;
    this.content = null;
  }

  public long getInstanceId() {
    return this.instanceId;
  }

  public CSDonateItemMsg setInstanceId(long instanceId) {
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

  public long getTargetCharId() {
    return this.targetCharId;
  }

  public CSDonateItemMsg setTargetCharId(long targetCharId) {
    this.targetCharId = targetCharId;
    setTargetCharIdIsSet(true);
    return this;
  }

  public void unsetTargetCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TARGETCHARID_ISSET_ID);
  }

  /** Returns true if field targetCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __TARGETCHARID_ISSET_ID);
  }

  public void setTargetCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TARGETCHARID_ISSET_ID, value);
  }

  public int getCount() {
    return this.count;
  }

  public CSDonateItemMsg setCount(int count) {
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

  public String getContent() {
    return this.content;
  }

  public CSDonateItemMsg setContent(String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
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

    case TARGET_CHAR_ID:
      if (value == null) {
        unsetTargetCharId();
      } else {
        setTargetCharId((Long)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INSTANCE_ID:
      return Long.valueOf(getInstanceId());

    case TARGET_CHAR_ID:
      return Long.valueOf(getTargetCharId());

    case COUNT:
      return Integer.valueOf(getCount());

    case CONTENT:
      return getContent();

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
    case TARGET_CHAR_ID:
      return isSetTargetCharId();
    case COUNT:
      return isSetCount();
    case CONTENT:
      return isSetContent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSDonateItemMsg)
      return this.equals((CSDonateItemMsg)that);
    return false;
  }

  public boolean equals(CSDonateItemMsg that) {
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

    boolean this_present_targetCharId = true;
    boolean that_present_targetCharId = true;
    if (this_present_targetCharId || that_present_targetCharId) {
      if (!(this_present_targetCharId && that_present_targetCharId))
        return false;
      if (this.targetCharId != that.targetCharId)
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

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSDonateItemMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSDonateItemMsg typedOther = (CSDonateItemMsg)other;

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
    lastComparison = Boolean.valueOf(isSetTargetCharId()).compareTo(typedOther.isSetTargetCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetCharId, typedOther.targetCharId);
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
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(typedOther.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, typedOther.content);
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
    StringBuilder sb = new StringBuilder("CSDonateItemMsg(");
    boolean first = true;

    sb.append("instanceId:");
    sb.append(this.instanceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetCharId:");
    sb.append(this.targetCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
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

  private static class CSDonateItemMsgStandardSchemeFactory implements SchemeFactory {
    public CSDonateItemMsgStandardScheme getScheme() {
      return new CSDonateItemMsgStandardScheme();
    }
  }

  private static class CSDonateItemMsgStandardScheme extends StandardScheme<CSDonateItemMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSDonateItemMsg struct) throws org.apache.thrift.TException {
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
          case 2: // TARGET_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.targetCharId = iprot.readI64();
              struct.setTargetCharIdIsSet(true);
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
          case 5: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSDonateItemMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INSTANCE_ID_FIELD_DESC);
      oprot.writeI64(struct.instanceId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TARGET_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.targetCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSDonateItemMsgTupleSchemeFactory implements SchemeFactory {
    public CSDonateItemMsgTupleScheme getScheme() {
      return new CSDonateItemMsgTupleScheme();
    }
  }

  private static class CSDonateItemMsgTupleScheme extends TupleScheme<CSDonateItemMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSDonateItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInstanceId()) {
        optionals.set(0);
      }
      if (struct.isSetTargetCharId()) {
        optionals.set(1);
      }
      if (struct.isSetCount()) {
        optionals.set(2);
      }
      if (struct.isSetContent()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetInstanceId()) {
        oprot.writeI64(struct.instanceId);
      }
      if (struct.isSetTargetCharId()) {
        oprot.writeI64(struct.targetCharId);
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSDonateItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.instanceId = iprot.readI64();
        struct.setInstanceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.targetCharId = iprot.readI64();
        struct.setTargetCharIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
    }
  }

}
