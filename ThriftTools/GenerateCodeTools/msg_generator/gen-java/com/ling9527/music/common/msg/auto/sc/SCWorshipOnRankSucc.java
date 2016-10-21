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
 * 成功膜拜排行榜上榜玩家
 */
public class SCWorshipOnRankSucc implements org.apache.thrift.TBase<SCWorshipOnRankSucc, SCWorshipOnRankSucc._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCWorshipOnRankSucc");

  private static final org.apache.thrift.protocol.TField ON_RANK_FIRST_PLAYER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("onRankFirstPlayerId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ON_RANK_SECOND_PLAYER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("onRankSecondPlayerId", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCWorshipOnRankSuccStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCWorshipOnRankSuccTupleSchemeFactory());
  }

  /**
   * 上榜第一个玩家角色id
   */
  public long onRankFirstPlayerId; // required
  /**
   * 上榜第二个玩家角色id(双人榜单)
   */
  public long onRankSecondPlayerId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 上榜第一个玩家角色id
     */
    ON_RANK_FIRST_PLAYER_ID((short)1, "onRankFirstPlayerId"),
    /**
     * 上榜第二个玩家角色id(双人榜单)
     */
    ON_RANK_SECOND_PLAYER_ID((short)2, "onRankSecondPlayerId");

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
        case 1: // ON_RANK_FIRST_PLAYER_ID
          return ON_RANK_FIRST_PLAYER_ID;
        case 2: // ON_RANK_SECOND_PLAYER_ID
          return ON_RANK_SECOND_PLAYER_ID;
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
  private static final int __ONRANKFIRSTPLAYERID_ISSET_ID = 0;
  private static final int __ONRANKSECONDPLAYERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ON_RANK_SECOND_PLAYER_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ON_RANK_FIRST_PLAYER_ID, new org.apache.thrift.meta_data.FieldMetaData("onRankFirstPlayerId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ON_RANK_SECOND_PLAYER_ID, new org.apache.thrift.meta_data.FieldMetaData("onRankSecondPlayerId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCWorshipOnRankSucc.class, metaDataMap);
  }

  public SCWorshipOnRankSucc() {
  }

  public SCWorshipOnRankSucc(
    long onRankFirstPlayerId)
  {
    this();
    this.onRankFirstPlayerId = onRankFirstPlayerId;
    setOnRankFirstPlayerIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCWorshipOnRankSucc(SCWorshipOnRankSucc other) {
    __isset_bitfield = other.__isset_bitfield;
    this.onRankFirstPlayerId = other.onRankFirstPlayerId;
    this.onRankSecondPlayerId = other.onRankSecondPlayerId;
  }

  public SCWorshipOnRankSucc deepCopy() {
    return new SCWorshipOnRankSucc(this);
  }

  @Override
  public void clear() {
    setOnRankFirstPlayerIdIsSet(false);
    this.onRankFirstPlayerId = 0;
    setOnRankSecondPlayerIdIsSet(false);
    this.onRankSecondPlayerId = 0;
  }

  /**
   * 上榜第一个玩家角色id
   */
  public long getOnRankFirstPlayerId() {
    return this.onRankFirstPlayerId;
  }

  /**
   * 上榜第一个玩家角色id
   */
  public SCWorshipOnRankSucc setOnRankFirstPlayerId(long onRankFirstPlayerId) {
    this.onRankFirstPlayerId = onRankFirstPlayerId;
    setOnRankFirstPlayerIdIsSet(true);
    return this;
  }

  public void unsetOnRankFirstPlayerId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ONRANKFIRSTPLAYERID_ISSET_ID);
  }

  /** Returns true if field onRankFirstPlayerId is set (has been assigned a value) and false otherwise */
  public boolean isSetOnRankFirstPlayerId() {
    return EncodingUtils.testBit(__isset_bitfield, __ONRANKFIRSTPLAYERID_ISSET_ID);
  }

  public void setOnRankFirstPlayerIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ONRANKFIRSTPLAYERID_ISSET_ID, value);
  }

  /**
   * 上榜第二个玩家角色id(双人榜单)
   */
  public long getOnRankSecondPlayerId() {
    return this.onRankSecondPlayerId;
  }

  /**
   * 上榜第二个玩家角色id(双人榜单)
   */
  public SCWorshipOnRankSucc setOnRankSecondPlayerId(long onRankSecondPlayerId) {
    this.onRankSecondPlayerId = onRankSecondPlayerId;
    setOnRankSecondPlayerIdIsSet(true);
    return this;
  }

  public void unsetOnRankSecondPlayerId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ONRANKSECONDPLAYERID_ISSET_ID);
  }

  /** Returns true if field onRankSecondPlayerId is set (has been assigned a value) and false otherwise */
  public boolean isSetOnRankSecondPlayerId() {
    return EncodingUtils.testBit(__isset_bitfield, __ONRANKSECONDPLAYERID_ISSET_ID);
  }

  public void setOnRankSecondPlayerIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ONRANKSECONDPLAYERID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ON_RANK_FIRST_PLAYER_ID:
      if (value == null) {
        unsetOnRankFirstPlayerId();
      } else {
        setOnRankFirstPlayerId((Long)value);
      }
      break;

    case ON_RANK_SECOND_PLAYER_ID:
      if (value == null) {
        unsetOnRankSecondPlayerId();
      } else {
        setOnRankSecondPlayerId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ON_RANK_FIRST_PLAYER_ID:
      return Long.valueOf(getOnRankFirstPlayerId());

    case ON_RANK_SECOND_PLAYER_ID:
      return Long.valueOf(getOnRankSecondPlayerId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ON_RANK_FIRST_PLAYER_ID:
      return isSetOnRankFirstPlayerId();
    case ON_RANK_SECOND_PLAYER_ID:
      return isSetOnRankSecondPlayerId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCWorshipOnRankSucc)
      return this.equals((SCWorshipOnRankSucc)that);
    return false;
  }

  public boolean equals(SCWorshipOnRankSucc that) {
    if (that == null)
      return false;

    boolean this_present_onRankFirstPlayerId = true;
    boolean that_present_onRankFirstPlayerId = true;
    if (this_present_onRankFirstPlayerId || that_present_onRankFirstPlayerId) {
      if (!(this_present_onRankFirstPlayerId && that_present_onRankFirstPlayerId))
        return false;
      if (this.onRankFirstPlayerId != that.onRankFirstPlayerId)
        return false;
    }

    boolean this_present_onRankSecondPlayerId = true && this.isSetOnRankSecondPlayerId();
    boolean that_present_onRankSecondPlayerId = true && that.isSetOnRankSecondPlayerId();
    if (this_present_onRankSecondPlayerId || that_present_onRankSecondPlayerId) {
      if (!(this_present_onRankSecondPlayerId && that_present_onRankSecondPlayerId))
        return false;
      if (this.onRankSecondPlayerId != that.onRankSecondPlayerId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCWorshipOnRankSucc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCWorshipOnRankSucc typedOther = (SCWorshipOnRankSucc)other;

    lastComparison = Boolean.valueOf(isSetOnRankFirstPlayerId()).compareTo(typedOther.isSetOnRankFirstPlayerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnRankFirstPlayerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onRankFirstPlayerId, typedOther.onRankFirstPlayerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOnRankSecondPlayerId()).compareTo(typedOther.isSetOnRankSecondPlayerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOnRankSecondPlayerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.onRankSecondPlayerId, typedOther.onRankSecondPlayerId);
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
    StringBuilder sb = new StringBuilder("SCWorshipOnRankSucc(");
    boolean first = true;

    sb.append("onRankFirstPlayerId:");
    sb.append(this.onRankFirstPlayerId);
    first = false;
    if (isSetOnRankSecondPlayerId()) {
      if (!first) sb.append(", ");
      sb.append("onRankSecondPlayerId:");
      sb.append(this.onRankSecondPlayerId);
      first = false;
    }
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

  private static class SCWorshipOnRankSuccStandardSchemeFactory implements SchemeFactory {
    public SCWorshipOnRankSuccStandardScheme getScheme() {
      return new SCWorshipOnRankSuccStandardScheme();
    }
  }

  private static class SCWorshipOnRankSuccStandardScheme extends StandardScheme<SCWorshipOnRankSucc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCWorshipOnRankSucc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ON_RANK_FIRST_PLAYER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.onRankFirstPlayerId = iprot.readI64();
              struct.setOnRankFirstPlayerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ON_RANK_SECOND_PLAYER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.onRankSecondPlayerId = iprot.readI64();
              struct.setOnRankSecondPlayerIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCWorshipOnRankSucc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ON_RANK_FIRST_PLAYER_ID_FIELD_DESC);
      oprot.writeI64(struct.onRankFirstPlayerId);
      oprot.writeFieldEnd();
      if (struct.isSetOnRankSecondPlayerId()) {
        oprot.writeFieldBegin(ON_RANK_SECOND_PLAYER_ID_FIELD_DESC);
        oprot.writeI64(struct.onRankSecondPlayerId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCWorshipOnRankSuccTupleSchemeFactory implements SchemeFactory {
    public SCWorshipOnRankSuccTupleScheme getScheme() {
      return new SCWorshipOnRankSuccTupleScheme();
    }
  }

  private static class SCWorshipOnRankSuccTupleScheme extends TupleScheme<SCWorshipOnRankSucc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCWorshipOnRankSucc struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOnRankFirstPlayerId()) {
        optionals.set(0);
      }
      if (struct.isSetOnRankSecondPlayerId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOnRankFirstPlayerId()) {
        oprot.writeI64(struct.onRankFirstPlayerId);
      }
      if (struct.isSetOnRankSecondPlayerId()) {
        oprot.writeI64(struct.onRankSecondPlayerId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCWorshipOnRankSucc struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.onRankFirstPlayerId = iprot.readI64();
        struct.setOnRankFirstPlayerIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.onRankSecondPlayerId = iprot.readI64();
        struct.setOnRankSecondPlayerIdIsSet(true);
      }
    }
  }

}

