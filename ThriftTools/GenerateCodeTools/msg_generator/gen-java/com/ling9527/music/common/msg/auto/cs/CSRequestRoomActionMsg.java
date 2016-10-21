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
 * 请求对房间内的成员做动作
 */
public class CSRequestRoomActionMsg implements org.apache.thrift.TBase<CSRequestRoomActionMsg, CSRequestRoomActionMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSRequestRoomActionMsg");

  private static final org.apache.thrift.protocol.TField ACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("actionId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetCharId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSRequestRoomActionMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSRequestRoomActionMsgTupleSchemeFactory());
  }

  public int actionId; // required
  /**
   * 动作目标角色id
   */
  public long targetCharId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTION_ID((short)1, "actionId"),
    /**
     * 动作目标角色id
     */
    TARGET_CHAR_ID((short)2, "targetCharId");

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
        case 2: // TARGET_CHAR_ID
          return TARGET_CHAR_ID;
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
  private static final int __TARGETCHARID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("actionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TARGET_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("targetCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSRequestRoomActionMsg.class, metaDataMap);
  }

  public CSRequestRoomActionMsg() {
  }

  public CSRequestRoomActionMsg(
    int actionId,
    long targetCharId)
  {
    this();
    this.actionId = actionId;
    setActionIdIsSet(true);
    this.targetCharId = targetCharId;
    setTargetCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSRequestRoomActionMsg(CSRequestRoomActionMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.actionId = other.actionId;
    this.targetCharId = other.targetCharId;
  }

  public CSRequestRoomActionMsg deepCopy() {
    return new CSRequestRoomActionMsg(this);
  }

  @Override
  public void clear() {
    setActionIdIsSet(false);
    this.actionId = 0;
    setTargetCharIdIsSet(false);
    this.targetCharId = 0;
  }

  public int getActionId() {
    return this.actionId;
  }

  public CSRequestRoomActionMsg setActionId(int actionId) {
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
   * 动作目标角色id
   */
  public long getTargetCharId() {
    return this.targetCharId;
  }

  /**
   * 动作目标角色id
   */
  public CSRequestRoomActionMsg setTargetCharId(long targetCharId) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION_ID:
      if (value == null) {
        unsetActionId();
      } else {
        setActionId((Integer)value);
      }
      break;

    case TARGET_CHAR_ID:
      if (value == null) {
        unsetTargetCharId();
      } else {
        setTargetCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION_ID:
      return Integer.valueOf(getActionId());

    case TARGET_CHAR_ID:
      return Long.valueOf(getTargetCharId());

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
    case TARGET_CHAR_ID:
      return isSetTargetCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSRequestRoomActionMsg)
      return this.equals((CSRequestRoomActionMsg)that);
    return false;
  }

  public boolean equals(CSRequestRoomActionMsg that) {
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

    boolean this_present_targetCharId = true;
    boolean that_present_targetCharId = true;
    if (this_present_targetCharId || that_present_targetCharId) {
      if (!(this_present_targetCharId && that_present_targetCharId))
        return false;
      if (this.targetCharId != that.targetCharId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSRequestRoomActionMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSRequestRoomActionMsg typedOther = (CSRequestRoomActionMsg)other;

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
    StringBuilder sb = new StringBuilder("CSRequestRoomActionMsg(");
    boolean first = true;

    sb.append("actionId:");
    sb.append(this.actionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetCharId:");
    sb.append(this.targetCharId);
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

  private static class CSRequestRoomActionMsgStandardSchemeFactory implements SchemeFactory {
    public CSRequestRoomActionMsgStandardScheme getScheme() {
      return new CSRequestRoomActionMsgStandardScheme();
    }
  }

  private static class CSRequestRoomActionMsgStandardScheme extends StandardScheme<CSRequestRoomActionMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSRequestRoomActionMsg struct) throws org.apache.thrift.TException {
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
          case 2: // TARGET_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.targetCharId = iprot.readI64();
              struct.setTargetCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSRequestRoomActionMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACTION_ID_FIELD_DESC);
      oprot.writeI32(struct.actionId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TARGET_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.targetCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSRequestRoomActionMsgTupleSchemeFactory implements SchemeFactory {
    public CSRequestRoomActionMsgTupleScheme getScheme() {
      return new CSRequestRoomActionMsgTupleScheme();
    }
  }

  private static class CSRequestRoomActionMsgTupleScheme extends TupleScheme<CSRequestRoomActionMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSRequestRoomActionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActionId()) {
        optionals.set(0);
      }
      if (struct.isSetTargetCharId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetActionId()) {
        oprot.writeI32(struct.actionId);
      }
      if (struct.isSetTargetCharId()) {
        oprot.writeI64(struct.targetCharId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSRequestRoomActionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.actionId = iprot.readI32();
        struct.setActionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.targetCharId = iprot.readI64();
        struct.setTargetCharIdIsSet(true);
      }
    }
  }

}

