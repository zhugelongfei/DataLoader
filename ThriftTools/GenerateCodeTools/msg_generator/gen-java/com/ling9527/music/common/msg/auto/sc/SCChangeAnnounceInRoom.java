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
 * 等待房间修改通告
 */
public class SCChangeAnnounceInRoom implements org.apache.thrift.TBase<SCChangeAnnounceInRoom, SCChangeAnnounceInRoom._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCChangeAnnounceInRoom");

  private static final org.apache.thrift.protocol.TField ANNOUNCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("announceId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ANNOUNCE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("announceIndex", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_MUSIC_MODE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("updateMusicModeInfo", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ANNOUNCE_TIP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("announceTipId", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCChangeAnnounceInRoomStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCChangeAnnounceInRoomTupleSchemeFactory());
  }

  /**
   * 通告id
   */
  public int announceId; // required
  /**
   * 通告索引
   */
  public byte announceIndex; // required
  /**
   * 更新音乐和模式信息
   */
  public SCUpdateRoomMusicMsg updateMusicModeInfo; // required
  /**
   * 通告提示id
   */
  public int announceTipId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 通告id
     */
    ANNOUNCE_ID((short)1, "announceId"),
    /**
     * 通告索引
     */
    ANNOUNCE_INDEX((short)2, "announceIndex"),
    /**
     * 更新音乐和模式信息
     */
    UPDATE_MUSIC_MODE_INFO((short)3, "updateMusicModeInfo"),
    /**
     * 通告提示id
     */
    ANNOUNCE_TIP_ID((short)4, "announceTipId");

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
        case 1: // ANNOUNCE_ID
          return ANNOUNCE_ID;
        case 2: // ANNOUNCE_INDEX
          return ANNOUNCE_INDEX;
        case 3: // UPDATE_MUSIC_MODE_INFO
          return UPDATE_MUSIC_MODE_INFO;
        case 4: // ANNOUNCE_TIP_ID
          return ANNOUNCE_TIP_ID;
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
  private static final int __ANNOUNCEID_ISSET_ID = 0;
  private static final int __ANNOUNCEINDEX_ISSET_ID = 1;
  private static final int __ANNOUNCETIPID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ANNOUNCE_TIP_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANNOUNCE_ID, new org.apache.thrift.meta_data.FieldMetaData("announceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ANNOUNCE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("announceIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.UPDATE_MUSIC_MODE_INFO, new org.apache.thrift.meta_data.FieldMetaData("updateMusicModeInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SCUpdateRoomMusicMsg.class)));
    tmpMap.put(_Fields.ANNOUNCE_TIP_ID, new org.apache.thrift.meta_data.FieldMetaData("announceTipId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCChangeAnnounceInRoom.class, metaDataMap);
  }

  public SCChangeAnnounceInRoom() {
  }

  public SCChangeAnnounceInRoom(
    int announceId,
    byte announceIndex,
    SCUpdateRoomMusicMsg updateMusicModeInfo)
  {
    this();
    this.announceId = announceId;
    setAnnounceIdIsSet(true);
    this.announceIndex = announceIndex;
    setAnnounceIndexIsSet(true);
    this.updateMusicModeInfo = updateMusicModeInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCChangeAnnounceInRoom(SCChangeAnnounceInRoom other) {
    __isset_bitfield = other.__isset_bitfield;
    this.announceId = other.announceId;
    this.announceIndex = other.announceIndex;
    if (other.isSetUpdateMusicModeInfo()) {
      this.updateMusicModeInfo = new SCUpdateRoomMusicMsg(other.updateMusicModeInfo);
    }
    this.announceTipId = other.announceTipId;
  }

  public SCChangeAnnounceInRoom deepCopy() {
    return new SCChangeAnnounceInRoom(this);
  }

  @Override
  public void clear() {
    setAnnounceIdIsSet(false);
    this.announceId = 0;
    setAnnounceIndexIsSet(false);
    this.announceIndex = 0;
    this.updateMusicModeInfo = null;
    setAnnounceTipIdIsSet(false);
    this.announceTipId = 0;
  }

  /**
   * 通告id
   */
  public int getAnnounceId() {
    return this.announceId;
  }

  /**
   * 通告id
   */
  public SCChangeAnnounceInRoom setAnnounceId(int announceId) {
    this.announceId = announceId;
    setAnnounceIdIsSet(true);
    return this;
  }

  public void unsetAnnounceId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ANNOUNCEID_ISSET_ID);
  }

  /** Returns true if field announceId is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnounceId() {
    return EncodingUtils.testBit(__isset_bitfield, __ANNOUNCEID_ISSET_ID);
  }

  public void setAnnounceIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ANNOUNCEID_ISSET_ID, value);
  }

  /**
   * 通告索引
   */
  public byte getAnnounceIndex() {
    return this.announceIndex;
  }

  /**
   * 通告索引
   */
  public SCChangeAnnounceInRoom setAnnounceIndex(byte announceIndex) {
    this.announceIndex = announceIndex;
    setAnnounceIndexIsSet(true);
    return this;
  }

  public void unsetAnnounceIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ANNOUNCEINDEX_ISSET_ID);
  }

  /** Returns true if field announceIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnounceIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __ANNOUNCEINDEX_ISSET_ID);
  }

  public void setAnnounceIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ANNOUNCEINDEX_ISSET_ID, value);
  }

  /**
   * 更新音乐和模式信息
   */
  public SCUpdateRoomMusicMsg getUpdateMusicModeInfo() {
    return this.updateMusicModeInfo;
  }

  /**
   * 更新音乐和模式信息
   */
  public SCChangeAnnounceInRoom setUpdateMusicModeInfo(SCUpdateRoomMusicMsg updateMusicModeInfo) {
    this.updateMusicModeInfo = updateMusicModeInfo;
    return this;
  }

  public void unsetUpdateMusicModeInfo() {
    this.updateMusicModeInfo = null;
  }

  /** Returns true if field updateMusicModeInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateMusicModeInfo() {
    return this.updateMusicModeInfo != null;
  }

  public void setUpdateMusicModeInfoIsSet(boolean value) {
    if (!value) {
      this.updateMusicModeInfo = null;
    }
  }

  /**
   * 通告提示id
   */
  public int getAnnounceTipId() {
    return this.announceTipId;
  }

  /**
   * 通告提示id
   */
  public SCChangeAnnounceInRoom setAnnounceTipId(int announceTipId) {
    this.announceTipId = announceTipId;
    setAnnounceTipIdIsSet(true);
    return this;
  }

  public void unsetAnnounceTipId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ANNOUNCETIPID_ISSET_ID);
  }

  /** Returns true if field announceTipId is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnounceTipId() {
    return EncodingUtils.testBit(__isset_bitfield, __ANNOUNCETIPID_ISSET_ID);
  }

  public void setAnnounceTipIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ANNOUNCETIPID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ANNOUNCE_ID:
      if (value == null) {
        unsetAnnounceId();
      } else {
        setAnnounceId((Integer)value);
      }
      break;

    case ANNOUNCE_INDEX:
      if (value == null) {
        unsetAnnounceIndex();
      } else {
        setAnnounceIndex((Byte)value);
      }
      break;

    case UPDATE_MUSIC_MODE_INFO:
      if (value == null) {
        unsetUpdateMusicModeInfo();
      } else {
        setUpdateMusicModeInfo((SCUpdateRoomMusicMsg)value);
      }
      break;

    case ANNOUNCE_TIP_ID:
      if (value == null) {
        unsetAnnounceTipId();
      } else {
        setAnnounceTipId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ANNOUNCE_ID:
      return Integer.valueOf(getAnnounceId());

    case ANNOUNCE_INDEX:
      return Byte.valueOf(getAnnounceIndex());

    case UPDATE_MUSIC_MODE_INFO:
      return getUpdateMusicModeInfo();

    case ANNOUNCE_TIP_ID:
      return Integer.valueOf(getAnnounceTipId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ANNOUNCE_ID:
      return isSetAnnounceId();
    case ANNOUNCE_INDEX:
      return isSetAnnounceIndex();
    case UPDATE_MUSIC_MODE_INFO:
      return isSetUpdateMusicModeInfo();
    case ANNOUNCE_TIP_ID:
      return isSetAnnounceTipId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCChangeAnnounceInRoom)
      return this.equals((SCChangeAnnounceInRoom)that);
    return false;
  }

  public boolean equals(SCChangeAnnounceInRoom that) {
    if (that == null)
      return false;

    boolean this_present_announceId = true;
    boolean that_present_announceId = true;
    if (this_present_announceId || that_present_announceId) {
      if (!(this_present_announceId && that_present_announceId))
        return false;
      if (this.announceId != that.announceId)
        return false;
    }

    boolean this_present_announceIndex = true;
    boolean that_present_announceIndex = true;
    if (this_present_announceIndex || that_present_announceIndex) {
      if (!(this_present_announceIndex && that_present_announceIndex))
        return false;
      if (this.announceIndex != that.announceIndex)
        return false;
    }

    boolean this_present_updateMusicModeInfo = true && this.isSetUpdateMusicModeInfo();
    boolean that_present_updateMusicModeInfo = true && that.isSetUpdateMusicModeInfo();
    if (this_present_updateMusicModeInfo || that_present_updateMusicModeInfo) {
      if (!(this_present_updateMusicModeInfo && that_present_updateMusicModeInfo))
        return false;
      if (!this.updateMusicModeInfo.equals(that.updateMusicModeInfo))
        return false;
    }

    boolean this_present_announceTipId = true && this.isSetAnnounceTipId();
    boolean that_present_announceTipId = true && that.isSetAnnounceTipId();
    if (this_present_announceTipId || that_present_announceTipId) {
      if (!(this_present_announceTipId && that_present_announceTipId))
        return false;
      if (this.announceTipId != that.announceTipId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCChangeAnnounceInRoom other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCChangeAnnounceInRoom typedOther = (SCChangeAnnounceInRoom)other;

    lastComparison = Boolean.valueOf(isSetAnnounceId()).compareTo(typedOther.isSetAnnounceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnounceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announceId, typedOther.announceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnnounceIndex()).compareTo(typedOther.isSetAnnounceIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnounceIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announceIndex, typedOther.announceIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateMusicModeInfo()).compareTo(typedOther.isSetUpdateMusicModeInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateMusicModeInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateMusicModeInfo, typedOther.updateMusicModeInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnnounceTipId()).compareTo(typedOther.isSetAnnounceTipId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnounceTipId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announceTipId, typedOther.announceTipId);
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
    StringBuilder sb = new StringBuilder("SCChangeAnnounceInRoom(");
    boolean first = true;

    sb.append("announceId:");
    sb.append(this.announceId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("announceIndex:");
    sb.append(this.announceIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateMusicModeInfo:");
    if (this.updateMusicModeInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.updateMusicModeInfo);
    }
    first = false;
    if (isSetAnnounceTipId()) {
      if (!first) sb.append(", ");
      sb.append("announceTipId:");
      sb.append(this.announceTipId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (updateMusicModeInfo != null) {
      updateMusicModeInfo.validate();
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

  private static class SCChangeAnnounceInRoomStandardSchemeFactory implements SchemeFactory {
    public SCChangeAnnounceInRoomStandardScheme getScheme() {
      return new SCChangeAnnounceInRoomStandardScheme();
    }
  }

  private static class SCChangeAnnounceInRoomStandardScheme extends StandardScheme<SCChangeAnnounceInRoom> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCChangeAnnounceInRoom struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANNOUNCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.announceId = iprot.readI32();
              struct.setAnnounceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ANNOUNCE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.announceIndex = iprot.readByte();
              struct.setAnnounceIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE_MUSIC_MODE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.updateMusicModeInfo = new SCUpdateRoomMusicMsg();
              struct.updateMusicModeInfo.read(iprot);
              struct.setUpdateMusicModeInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ANNOUNCE_TIP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.announceTipId = iprot.readI32();
              struct.setAnnounceTipIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCChangeAnnounceInRoom struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ANNOUNCE_ID_FIELD_DESC);
      oprot.writeI32(struct.announceId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ANNOUNCE_INDEX_FIELD_DESC);
      oprot.writeByte(struct.announceIndex);
      oprot.writeFieldEnd();
      if (struct.updateMusicModeInfo != null) {
        oprot.writeFieldBegin(UPDATE_MUSIC_MODE_INFO_FIELD_DESC);
        struct.updateMusicModeInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAnnounceTipId()) {
        oprot.writeFieldBegin(ANNOUNCE_TIP_ID_FIELD_DESC);
        oprot.writeI32(struct.announceTipId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCChangeAnnounceInRoomTupleSchemeFactory implements SchemeFactory {
    public SCChangeAnnounceInRoomTupleScheme getScheme() {
      return new SCChangeAnnounceInRoomTupleScheme();
    }
  }

  private static class SCChangeAnnounceInRoomTupleScheme extends TupleScheme<SCChangeAnnounceInRoom> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCChangeAnnounceInRoom struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAnnounceId()) {
        optionals.set(0);
      }
      if (struct.isSetAnnounceIndex()) {
        optionals.set(1);
      }
      if (struct.isSetUpdateMusicModeInfo()) {
        optionals.set(2);
      }
      if (struct.isSetAnnounceTipId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAnnounceId()) {
        oprot.writeI32(struct.announceId);
      }
      if (struct.isSetAnnounceIndex()) {
        oprot.writeByte(struct.announceIndex);
      }
      if (struct.isSetUpdateMusicModeInfo()) {
        struct.updateMusicModeInfo.write(oprot);
      }
      if (struct.isSetAnnounceTipId()) {
        oprot.writeI32(struct.announceTipId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCChangeAnnounceInRoom struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.announceId = iprot.readI32();
        struct.setAnnounceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.announceIndex = iprot.readByte();
        struct.setAnnounceIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updateMusicModeInfo = new SCUpdateRoomMusicMsg();
        struct.updateMusicModeInfo.read(iprot);
        struct.setUpdateMusicModeInfoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.announceTipId = iprot.readI32();
        struct.setAnnounceTipIdIsSet(true);
      }
    }
  }

}
