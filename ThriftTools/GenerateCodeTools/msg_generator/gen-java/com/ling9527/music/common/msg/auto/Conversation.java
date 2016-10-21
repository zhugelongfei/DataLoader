/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto;

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

public class Conversation implements org.apache.thrift.TBase<Conversation, Conversation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Conversation");

  private static final org.apache.thrift.protocol.TField FRIEND_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("friendCharId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField UNREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unreadCount", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastTime", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConversationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConversationTupleSchemeFactory());
  }

  public long friendCharId; // required
  public short unreadCount; // required
  public int lastTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRIEND_CHAR_ID((short)1, "friendCharId"),
    UNREAD_COUNT((short)2, "unreadCount"),
    LAST_TIME((short)3, "lastTime");

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
        case 1: // FRIEND_CHAR_ID
          return FRIEND_CHAR_ID;
        case 2: // UNREAD_COUNT
          return UNREAD_COUNT;
        case 3: // LAST_TIME
          return LAST_TIME;
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
  private static final int __FRIENDCHARID_ISSET_ID = 0;
  private static final int __UNREADCOUNT_ISSET_ID = 1;
  private static final int __LASTTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRIEND_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("friendCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UNREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("unreadCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.LAST_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Conversation.class, metaDataMap);
  }

  public Conversation() {
  }

  public Conversation(
    long friendCharId,
    short unreadCount,
    int lastTime)
  {
    this();
    this.friendCharId = friendCharId;
    setFriendCharIdIsSet(true);
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    this.lastTime = lastTime;
    setLastTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Conversation(Conversation other) {
    __isset_bitfield = other.__isset_bitfield;
    this.friendCharId = other.friendCharId;
    this.unreadCount = other.unreadCount;
    this.lastTime = other.lastTime;
  }

  public Conversation deepCopy() {
    return new Conversation(this);
  }

  @Override
  public void clear() {
    setFriendCharIdIsSet(false);
    this.friendCharId = 0;
    setUnreadCountIsSet(false);
    this.unreadCount = 0;
    setLastTimeIsSet(false);
    this.lastTime = 0;
  }

  public long getFriendCharId() {
    return this.friendCharId;
  }

  public Conversation setFriendCharId(long friendCharId) {
    this.friendCharId = friendCharId;
    setFriendCharIdIsSet(true);
    return this;
  }

  public void unsetFriendCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FRIENDCHARID_ISSET_ID);
  }

  /** Returns true if field friendCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __FRIENDCHARID_ISSET_ID);
  }

  public void setFriendCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FRIENDCHARID_ISSET_ID, value);
  }

  public short getUnreadCount() {
    return this.unreadCount;
  }

  public Conversation setUnreadCount(short unreadCount) {
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    return this;
  }

  public void unsetUnreadCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID);
  }

  /** Returns true if field unreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnreadCount() {
    return EncodingUtils.testBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID);
  }

  public void setUnreadCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID, value);
  }

  public int getLastTime() {
    return this.lastTime;
  }

  public Conversation setLastTime(int lastTime) {
    this.lastTime = lastTime;
    setLastTimeIsSet(true);
    return this;
  }

  public void unsetLastTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTTIME_ISSET_ID);
  }

  /** Returns true if field lastTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTTIME_ISSET_ID);
  }

  public void setLastTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTTIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRIEND_CHAR_ID:
      if (value == null) {
        unsetFriendCharId();
      } else {
        setFriendCharId((Long)value);
      }
      break;

    case UNREAD_COUNT:
      if (value == null) {
        unsetUnreadCount();
      } else {
        setUnreadCount((Short)value);
      }
      break;

    case LAST_TIME:
      if (value == null) {
        unsetLastTime();
      } else {
        setLastTime((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRIEND_CHAR_ID:
      return Long.valueOf(getFriendCharId());

    case UNREAD_COUNT:
      return Short.valueOf(getUnreadCount());

    case LAST_TIME:
      return Integer.valueOf(getLastTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRIEND_CHAR_ID:
      return isSetFriendCharId();
    case UNREAD_COUNT:
      return isSetUnreadCount();
    case LAST_TIME:
      return isSetLastTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Conversation)
      return this.equals((Conversation)that);
    return false;
  }

  public boolean equals(Conversation that) {
    if (that == null)
      return false;

    boolean this_present_friendCharId = true;
    boolean that_present_friendCharId = true;
    if (this_present_friendCharId || that_present_friendCharId) {
      if (!(this_present_friendCharId && that_present_friendCharId))
        return false;
      if (this.friendCharId != that.friendCharId)
        return false;
    }

    boolean this_present_unreadCount = true;
    boolean that_present_unreadCount = true;
    if (this_present_unreadCount || that_present_unreadCount) {
      if (!(this_present_unreadCount && that_present_unreadCount))
        return false;
      if (this.unreadCount != that.unreadCount)
        return false;
    }

    boolean this_present_lastTime = true;
    boolean that_present_lastTime = true;
    if (this_present_lastTime || that_present_lastTime) {
      if (!(this_present_lastTime && that_present_lastTime))
        return false;
      if (this.lastTime != that.lastTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Conversation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Conversation typedOther = (Conversation)other;

    lastComparison = Boolean.valueOf(isSetFriendCharId()).compareTo(typedOther.isSetFriendCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendCharId, typedOther.friendCharId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnreadCount()).compareTo(typedOther.isSetUnreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnreadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unreadCount, typedOther.unreadCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastTime()).compareTo(typedOther.isSetLastTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastTime, typedOther.lastTime);
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
    StringBuilder sb = new StringBuilder("Conversation(");
    boolean first = true;

    sb.append("friendCharId:");
    sb.append(this.friendCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadCount:");
    sb.append(this.unreadCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastTime:");
    sb.append(this.lastTime);
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

  private static class ConversationStandardSchemeFactory implements SchemeFactory {
    public ConversationStandardScheme getScheme() {
      return new ConversationStandardScheme();
    }
  }

  private static class ConversationStandardScheme extends StandardScheme<Conversation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Conversation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRIEND_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.friendCharId = iprot.readI64();
              struct.setFriendCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.unreadCount = iprot.readI16();
              struct.setUnreadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastTime = iprot.readI32();
              struct.setLastTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Conversation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FRIEND_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.friendCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNREAD_COUNT_FIELD_DESC);
      oprot.writeI16(struct.unreadCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_TIME_FIELD_DESC);
      oprot.writeI32(struct.lastTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConversationTupleSchemeFactory implements SchemeFactory {
    public ConversationTupleScheme getScheme() {
      return new ConversationTupleScheme();
    }
  }

  private static class ConversationTupleScheme extends TupleScheme<Conversation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Conversation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFriendCharId()) {
        optionals.set(0);
      }
      if (struct.isSetUnreadCount()) {
        optionals.set(1);
      }
      if (struct.isSetLastTime()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetFriendCharId()) {
        oprot.writeI64(struct.friendCharId);
      }
      if (struct.isSetUnreadCount()) {
        oprot.writeI16(struct.unreadCount);
      }
      if (struct.isSetLastTime()) {
        oprot.writeI32(struct.lastTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Conversation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.friendCharId = iprot.readI64();
        struct.setFriendCharIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.unreadCount = iprot.readI16();
        struct.setUnreadCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastTime = iprot.readI32();
        struct.setLastTimeIsSet(true);
      }
    }
  }

}

