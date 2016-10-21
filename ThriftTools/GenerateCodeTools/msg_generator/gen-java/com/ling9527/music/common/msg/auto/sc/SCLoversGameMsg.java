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

public class SCLoversGameMsg implements org.apache.thrift.TBase<SCLoversGameMsg, SCLoversGameMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCLoversGameMsg");

  private static final org.apache.thrift.protocol.TField AQ_GAME_RESP_FIELD_DESC = new org.apache.thrift.protocol.TField("aqGameResp", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField TOUCH_HEART_GAME_RESP_FIELD_DESC = new org.apache.thrift.protocol.TField("touchHeartGameResp", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField GAME_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("gameIndex", org.apache.thrift.protocol.TType.BYTE, (short)10);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCLoversGameMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCLoversGameMsgTupleSchemeFactory());
  }

  public com.ling9527.music.common.msg.auto.LoversAQGameResp aqGameResp; // optional
  public com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp touchHeartGameResp; // optional
  public byte gameIndex; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AQ_GAME_RESP((short)1, "aqGameResp"),
    TOUCH_HEART_GAME_RESP((short)2, "touchHeartGameResp"),
    GAME_INDEX((short)10, "gameIndex");

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
        case 1: // AQ_GAME_RESP
          return AQ_GAME_RESP;
        case 2: // TOUCH_HEART_GAME_RESP
          return TOUCH_HEART_GAME_RESP;
        case 10: // GAME_INDEX
          return GAME_INDEX;
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
  private static final int __GAMEINDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.AQ_GAME_RESP,_Fields.TOUCH_HEART_GAME_RESP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AQ_GAME_RESP, new org.apache.thrift.meta_data.FieldMetaData("aqGameResp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.LoversAQGameResp.class)));
    tmpMap.put(_Fields.TOUCH_HEART_GAME_RESP, new org.apache.thrift.meta_data.FieldMetaData("touchHeartGameResp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp.class)));
    tmpMap.put(_Fields.GAME_INDEX, new org.apache.thrift.meta_data.FieldMetaData("gameIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCLoversGameMsg.class, metaDataMap);
  }

  public SCLoversGameMsg() {
  }

  public SCLoversGameMsg(
    byte gameIndex)
  {
    this();
    this.gameIndex = gameIndex;
    setGameIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCLoversGameMsg(SCLoversGameMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAqGameResp()) {
      this.aqGameResp = new com.ling9527.music.common.msg.auto.LoversAQGameResp(other.aqGameResp);
    }
    if (other.isSetTouchHeartGameResp()) {
      this.touchHeartGameResp = new com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp(other.touchHeartGameResp);
    }
    this.gameIndex = other.gameIndex;
  }

  public SCLoversGameMsg deepCopy() {
    return new SCLoversGameMsg(this);
  }

  @Override
  public void clear() {
    this.aqGameResp = null;
    this.touchHeartGameResp = null;
    setGameIndexIsSet(false);
    this.gameIndex = 0;
  }

  public com.ling9527.music.common.msg.auto.LoversAQGameResp getAqGameResp() {
    return this.aqGameResp;
  }

  public SCLoversGameMsg setAqGameResp(com.ling9527.music.common.msg.auto.LoversAQGameResp aqGameResp) {
    this.aqGameResp = aqGameResp;
    return this;
  }

  public void unsetAqGameResp() {
    this.aqGameResp = null;
  }

  /** Returns true if field aqGameResp is set (has been assigned a value) and false otherwise */
  public boolean isSetAqGameResp() {
    return this.aqGameResp != null;
  }

  public void setAqGameRespIsSet(boolean value) {
    if (!value) {
      this.aqGameResp = null;
    }
  }

  public com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp getTouchHeartGameResp() {
    return this.touchHeartGameResp;
  }

  public SCLoversGameMsg setTouchHeartGameResp(com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp touchHeartGameResp) {
    this.touchHeartGameResp = touchHeartGameResp;
    return this;
  }

  public void unsetTouchHeartGameResp() {
    this.touchHeartGameResp = null;
  }

  /** Returns true if field touchHeartGameResp is set (has been assigned a value) and false otherwise */
  public boolean isSetTouchHeartGameResp() {
    return this.touchHeartGameResp != null;
  }

  public void setTouchHeartGameRespIsSet(boolean value) {
    if (!value) {
      this.touchHeartGameResp = null;
    }
  }

  public byte getGameIndex() {
    return this.gameIndex;
  }

  public SCLoversGameMsg setGameIndex(byte gameIndex) {
    this.gameIndex = gameIndex;
    setGameIndexIsSet(true);
    return this;
  }

  public void unsetGameIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GAMEINDEX_ISSET_ID);
  }

  /** Returns true if field gameIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetGameIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __GAMEINDEX_ISSET_ID);
  }

  public void setGameIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GAMEINDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AQ_GAME_RESP:
      if (value == null) {
        unsetAqGameResp();
      } else {
        setAqGameResp((com.ling9527.music.common.msg.auto.LoversAQGameResp)value);
      }
      break;

    case TOUCH_HEART_GAME_RESP:
      if (value == null) {
        unsetTouchHeartGameResp();
      } else {
        setTouchHeartGameResp((com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp)value);
      }
      break;

    case GAME_INDEX:
      if (value == null) {
        unsetGameIndex();
      } else {
        setGameIndex((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AQ_GAME_RESP:
      return getAqGameResp();

    case TOUCH_HEART_GAME_RESP:
      return getTouchHeartGameResp();

    case GAME_INDEX:
      return Byte.valueOf(getGameIndex());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AQ_GAME_RESP:
      return isSetAqGameResp();
    case TOUCH_HEART_GAME_RESP:
      return isSetTouchHeartGameResp();
    case GAME_INDEX:
      return isSetGameIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCLoversGameMsg)
      return this.equals((SCLoversGameMsg)that);
    return false;
  }

  public boolean equals(SCLoversGameMsg that) {
    if (that == null)
      return false;

    boolean this_present_aqGameResp = true && this.isSetAqGameResp();
    boolean that_present_aqGameResp = true && that.isSetAqGameResp();
    if (this_present_aqGameResp || that_present_aqGameResp) {
      if (!(this_present_aqGameResp && that_present_aqGameResp))
        return false;
      if (!this.aqGameResp.equals(that.aqGameResp))
        return false;
    }

    boolean this_present_touchHeartGameResp = true && this.isSetTouchHeartGameResp();
    boolean that_present_touchHeartGameResp = true && that.isSetTouchHeartGameResp();
    if (this_present_touchHeartGameResp || that_present_touchHeartGameResp) {
      if (!(this_present_touchHeartGameResp && that_present_touchHeartGameResp))
        return false;
      if (!this.touchHeartGameResp.equals(that.touchHeartGameResp))
        return false;
    }

    boolean this_present_gameIndex = true;
    boolean that_present_gameIndex = true;
    if (this_present_gameIndex || that_present_gameIndex) {
      if (!(this_present_gameIndex && that_present_gameIndex))
        return false;
      if (this.gameIndex != that.gameIndex)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCLoversGameMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCLoversGameMsg typedOther = (SCLoversGameMsg)other;

    lastComparison = Boolean.valueOf(isSetAqGameResp()).compareTo(typedOther.isSetAqGameResp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAqGameResp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aqGameResp, typedOther.aqGameResp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTouchHeartGameResp()).compareTo(typedOther.isSetTouchHeartGameResp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTouchHeartGameResp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.touchHeartGameResp, typedOther.touchHeartGameResp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGameIndex()).compareTo(typedOther.isSetGameIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGameIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gameIndex, typedOther.gameIndex);
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
    StringBuilder sb = new StringBuilder("SCLoversGameMsg(");
    boolean first = true;

    if (isSetAqGameResp()) {
      sb.append("aqGameResp:");
      if (this.aqGameResp == null) {
        sb.append("null");
      } else {
        sb.append(this.aqGameResp);
      }
      first = false;
    }
    if (isSetTouchHeartGameResp()) {
      if (!first) sb.append(", ");
      sb.append("touchHeartGameResp:");
      if (this.touchHeartGameResp == null) {
        sb.append("null");
      } else {
        sb.append(this.touchHeartGameResp);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("gameIndex:");
    sb.append(this.gameIndex);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (aqGameResp != null) {
      aqGameResp.validate();
    }
    if (touchHeartGameResp != null) {
      touchHeartGameResp.validate();
    }
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

  private static class SCLoversGameMsgStandardSchemeFactory implements SchemeFactory {
    public SCLoversGameMsgStandardScheme getScheme() {
      return new SCLoversGameMsgStandardScheme();
    }
  }

  private static class SCLoversGameMsgStandardScheme extends StandardScheme<SCLoversGameMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCLoversGameMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AQ_GAME_RESP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.aqGameResp = new com.ling9527.music.common.msg.auto.LoversAQGameResp();
              struct.aqGameResp.read(iprot);
              struct.setAqGameRespIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOUCH_HEART_GAME_RESP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.touchHeartGameResp = new com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp();
              struct.touchHeartGameResp.read(iprot);
              struct.setTouchHeartGameRespIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // GAME_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.gameIndex = iprot.readByte();
              struct.setGameIndexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCLoversGameMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aqGameResp != null) {
        if (struct.isSetAqGameResp()) {
          oprot.writeFieldBegin(AQ_GAME_RESP_FIELD_DESC);
          struct.aqGameResp.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.touchHeartGameResp != null) {
        if (struct.isSetTouchHeartGameResp()) {
          oprot.writeFieldBegin(TOUCH_HEART_GAME_RESP_FIELD_DESC);
          struct.touchHeartGameResp.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(GAME_INDEX_FIELD_DESC);
      oprot.writeByte(struct.gameIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCLoversGameMsgTupleSchemeFactory implements SchemeFactory {
    public SCLoversGameMsgTupleScheme getScheme() {
      return new SCLoversGameMsgTupleScheme();
    }
  }

  private static class SCLoversGameMsgTupleScheme extends TupleScheme<SCLoversGameMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCLoversGameMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAqGameResp()) {
        optionals.set(0);
      }
      if (struct.isSetTouchHeartGameResp()) {
        optionals.set(1);
      }
      if (struct.isSetGameIndex()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAqGameResp()) {
        struct.aqGameResp.write(oprot);
      }
      if (struct.isSetTouchHeartGameResp()) {
        struct.touchHeartGameResp.write(oprot);
      }
      if (struct.isSetGameIndex()) {
        oprot.writeByte(struct.gameIndex);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCLoversGameMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.aqGameResp = new com.ling9527.music.common.msg.auto.LoversAQGameResp();
        struct.aqGameResp.read(iprot);
        struct.setAqGameRespIsSet(true);
      }
      if (incoming.get(1)) {
        struct.touchHeartGameResp = new com.ling9527.music.common.msg.auto.LoversTouchHeartGameResp();
        struct.touchHeartGameResp.read(iprot);
        struct.setTouchHeartGameRespIsSet(true);
      }
      if (incoming.get(2)) {
        struct.gameIndex = iprot.readByte();
        struct.setGameIndexIsSet(true);
      }
    }
  }

}
