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
 * 其他玩家请求对自己做动作
 */
public class SCBeRequestedRoomActionMsg implements org.apache.thrift.TBase<SCBeRequestedRoomActionMsg, SCBeRequestedRoomActionMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCBeRequestedRoomActionMsg");

  private static final org.apache.thrift.protocol.TField ACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("actionId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SRC_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("srcCharId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCBeRequestedRoomActionMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCBeRequestedRoomActionMsgTupleSchemeFactory());
  }

  public int actionId; // required
  /**
   * 请求动作的角色id
   */
  public long srcCharId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTION_ID((short)1, "actionId"),
    /**
     * 请求动作的角色id
     */
    SRC_CHAR_ID((short)2, "srcCharId");

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
        case 1: // ACTION_ID
          return ACTION_ID;
        case 2: // SRC_CHAR_ID
          return SRC_CHAR_ID;
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
  private static final int __ACTIONID_ISSET_ID = 0;
  private static final int __SRCCHARID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("actionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SRC_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("srcCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCBeRequestedRoomActionMsg.class, metaDataMap);
  }

  public SCBeRequestedRoomActionMsg() {
  }

  public SCBeRequestedRoomActionMsg(
    int actionId,
    long srcCharId)
  {
    this();
    this.actionId = actionId;
    setActionIdIsSet(true);
    this.srcCharId = srcCharId;
    setSrcCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCBeRequestedRoomActionMsg(SCBeRequestedRoomActionMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.actionId = other.actionId;
    this.srcCharId = other.srcCharId;
  }

  public SCBeRequestedRoomActionMsg deepCopy() {
    return new SCBeRequestedRoomActionMsg(this);
  }

  @Override
  public void clear() {
    setActionIdIsSet(false);
    this.actionId = 0;
    setSrcCharIdIsSet(false);
    this.srcCharId = 0;
  }

  public int getActionId() {
    return this.actionId;
  }

  public SCBeRequestedRoomActionMsg setActionId(int actionId) {
    this.actionId = actionId;
    setActionIdIsSet(true);
    return this;
  }

  public void unsetActionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIONID_ISSET_ID);
  }

  /** Returns true if field actionId is set (has been assigned a value) and false otherwise */
  public boolean isSetActionId() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIONID_ISSET_ID);
  }

  public void setActionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIONID_ISSET_ID, value);
  }

  /**
   * 请求动作的角色id
   */
  public long getSrcCharId() {
    return this.srcCharId;
  }

  /**
   * 请求动作的角色id
   */
  public SCBeRequestedRoomActionMsg setSrcCharId(long srcCharId) {
    this.srcCharId = srcCharId;
    setSrcCharIdIsSet(true);
    return this;
  }

  public void unsetSrcCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SRCCHARID_ISSET_ID);
  }

  /** Returns true if field srcCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetSrcCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __SRCCHARID_ISSET_ID);
  }

  public void setSrcCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SRCCHARID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION_ID:
      if (value == null) {
        unsetActionId();
      } else {
        setActionId((Integer)value);
      }
      break;

    case SRC_CHAR_ID:
      if (value == null) {
        unsetSrcCharId();
      } else {
        setSrcCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_ID:
      return Integer.valueOf(getActionId());

    case SRC_CHAR_ID:
      return Long.valueOf(getSrcCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION_ID:
      return isSetActionId();
    case SRC_CHAR_ID:
      return isSetSrcCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCBeRequestedRoomActionMsg)
      return this.equals((SCBeRequestedRoomActionMsg)that);
    return false;
  }

  public boolean equals(SCBeRequestedRoomActionMsg that) {
    if (that == null)
      return false;

    boolean this_present_actionId = true;
    boolean that_present_actionId = true;
    if (this_present_actionId || that_present_actionId) {
      if (!(this_present_actionId && that_present_actionId))
        return false;
      if (this.actionId != that.actionId)
        return false;
    }

    boolean this_present_srcCharId = true;
    boolean that_present_srcCharId = true;
    if (this_present_srcCharId || that_present_srcCharId) {
      if (!(this_present_srcCharId && that_present_srcCharId))
        return false;
      if (this.srcCharId != that.srcCharId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCBeRequestedRoomActionMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCBeRequestedRoomActionMsg typedOther = (SCBeRequestedRoomActionMsg)other;

    lastComparison = Boolean.valueOf(isSetActionId()).compareTo(typedOther.isSetActionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actionId, typedOther.actionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSrcCharId()).compareTo(typedOther.isSetSrcCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrcCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.srcCharId, typedOther.srcCharId);
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
    StringBuilder sb = new StringBuilder("SCBeRequestedRoomActionMsg(");
    boolean first = true;

    sb.append("actionId:");
    sb.append(this.actionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("srcCharId:");
    sb.append(this.srcCharId);
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

  private static class SCBeRequestedRoomActionMsgStandardSchemeFactory implements SchemeFactory {
    public SCBeRequestedRoomActionMsgStandardScheme getScheme() {
      return new SCBeRequestedRoomActionMsgStandardScheme();
    }
  }

  private static class SCBeRequestedRoomActionMsgStandardScheme extends StandardScheme<SCBeRequestedRoomActionMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCBeRequestedRoomActionMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.actionId = iprot.readI32();
              struct.setActionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SRC_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.srcCharId = iprot.readI64();
              struct.setSrcCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCBeRequestedRoomActionMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
      oprot.writeI32(struct.actionId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SRC_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.srcCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCBeRequestedRoomActionMsgTupleSchemeFactory implements SchemeFactory {
    public SCBeRequestedRoomActionMsgTupleScheme getScheme() {
      return new SCBeRequestedRoomActionMsgTupleScheme();
    }
  }

  private static class SCBeRequestedRoomActionMsgTupleScheme extends TupleScheme<SCBeRequestedRoomActionMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCBeRequestedRoomActionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActionId()) {
        optionals.set(0);
      }
      if (struct.isSetSrcCharId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetActionId()) {
        oprot.writeI32(struct.actionId);
      }
      if (struct.isSetSrcCharId()) {
        oprot.writeI64(struct.srcCharId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCBeRequestedRoomActionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.actionId = iprot.readI32();
        struct.setActionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.srcCharId = iprot.readI64();
        struct.setSrcCharIdIsSet(true);
      }
    }
  }

}

