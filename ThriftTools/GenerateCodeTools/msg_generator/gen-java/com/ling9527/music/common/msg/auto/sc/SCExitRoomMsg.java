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

public class SCExitRoomMsg implements org.apache.thrift.TBase<SCExitRoomMsg, SCExitRoomMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCExitRoomMsg");

  private static final org.apache.thrift.protocol.TField CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("charId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField KICK_OUT_FIELD_DESC = new org.apache.thrift.protocol.TField("kickOut", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCExitRoomMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCExitRoomMsgTupleSchemeFactory());
  }

  public long charId; // required
  public boolean kickOut; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHAR_ID((short)1, "charId"),
    KICK_OUT((short)2, "kickOut");

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
        case 1: // CHAR_ID
          return CHAR_ID;
        case 2: // KICK_OUT
          return KICK_OUT;
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
  private static final int __CHARID_ISSET_ID = 0;
  private static final int __KICKOUT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("charId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.KICK_OUT, new org.apache.thrift.meta_data.FieldMetaData("kickOut", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCExitRoomMsg.class, metaDataMap);
  }

  public SCExitRoomMsg() {
  }

  public SCExitRoomMsg(
    long charId,
    boolean kickOut)
  {
    this();
    this.charId = charId;
    setCharIdIsSet(true);
    this.kickOut = kickOut;
    setKickOutIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCExitRoomMsg(SCExitRoomMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.charId = other.charId;
    this.kickOut = other.kickOut;
  }

  public SCExitRoomMsg deepCopy() {
    return new SCExitRoomMsg(this);
  }

  @Override
  public void clear() {
    setCharIdIsSet(false);
    this.charId = 0;
    setKickOutIsSet(false);
    this.kickOut = false;
  }

  public long getCharId() {
    return this.charId;
  }

  public SCExitRoomMsg setCharId(long charId) {
    this.charId = charId;
    setCharIdIsSet(true);
    return this;
  }

  public void unsetCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  /** Returns true if field charId is set (has been assigned a value) and false otherwise */
  public boolean isSetCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  public void setCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARID_ISSET_ID, value);
  }

  public boolean isKickOut() {
    return this.kickOut;
  }

  public SCExitRoomMsg setKickOut(boolean kickOut) {
    this.kickOut = kickOut;
    setKickOutIsSet(true);
    return this;
  }

  public void unsetKickOut() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __KICKOUT_ISSET_ID);
  }

  /** Returns true if field kickOut is set (has been assigned a value) and false otherwise */
  public boolean isSetKickOut() {
    return EncodingUtils.testBit(__isset_bitfield, __KICKOUT_ISSET_ID);
  }

  public void setKickOutIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __KICKOUT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHAR_ID:
      if (value == null) {
        unsetCharId();
      } else {
        setCharId((Long)value);
      }
      break;

    case KICK_OUT:
      if (value == null) {
        unsetKickOut();
      } else {
        setKickOut((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHAR_ID:
      return Long.valueOf(getCharId());

    case KICK_OUT:
      return Boolean.valueOf(isKickOut());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHAR_ID:
      return isSetCharId();
    case KICK_OUT:
      return isSetKickOut();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCExitRoomMsg)
      return this.equals((SCExitRoomMsg)that);
    return false;
  }

  public boolean equals(SCExitRoomMsg that) {
    if (that == null)
      return false;

    boolean this_present_charId = true;
    boolean that_present_charId = true;
    if (this_present_charId || that_present_charId) {
      if (!(this_present_charId && that_present_charId))
        return false;
      if (this.charId != that.charId)
        return false;
    }

    boolean this_present_kickOut = true;
    boolean that_present_kickOut = true;
    if (this_present_kickOut || that_present_kickOut) {
      if (!(this_present_kickOut && that_present_kickOut))
        return false;
      if (this.kickOut != that.kickOut)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCExitRoomMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCExitRoomMsg typedOther = (SCExitRoomMsg)other;

    lastComparison = Boolean.valueOf(isSetCharId()).compareTo(typedOther.isSetCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.charId, typedOther.charId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKickOut()).compareTo(typedOther.isSetKickOut());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKickOut()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kickOut, typedOther.kickOut);
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
    StringBuilder sb = new StringBuilder("SCExitRoomMsg(");
    boolean first = true;

    sb.append("charId:");
    sb.append(this.charId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("kickOut:");
    sb.append(this.kickOut);
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

  private static class SCExitRoomMsgStandardSchemeFactory implements SchemeFactory {
    public SCExitRoomMsgStandardScheme getScheme() {
      return new SCExitRoomMsgStandardScheme();
    }
  }

  private static class SCExitRoomMsgStandardScheme extends StandardScheme<SCExitRoomMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCExitRoomMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.charId = iprot.readI64();
              struct.setCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KICK_OUT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.kickOut = iprot.readBool();
              struct.setKickOutIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCExitRoomMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.charId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(KICK_OUT_FIELD_DESC);
      oprot.writeBool(struct.kickOut);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCExitRoomMsgTupleSchemeFactory implements SchemeFactory {
    public SCExitRoomMsgTupleScheme getScheme() {
      return new SCExitRoomMsgTupleScheme();
    }
  }

  private static class SCExitRoomMsgTupleScheme extends TupleScheme<SCExitRoomMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCExitRoomMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCharId()) {
        optionals.set(0);
      }
      if (struct.isSetKickOut()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCharId()) {
        oprot.writeI64(struct.charId);
      }
      if (struct.isSetKickOut()) {
        oprot.writeBool(struct.kickOut);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCExitRoomMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.charId = iprot.readI64();
        struct.setCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.kickOut = iprot.readBool();
        struct.setKickOutIsSet(true);
      }
    }
  }

}

