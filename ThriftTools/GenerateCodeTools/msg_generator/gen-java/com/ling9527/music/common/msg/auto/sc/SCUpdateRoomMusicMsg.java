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

public class SCUpdateRoomMusicMsg implements org.apache.thrift.TBase<SCUpdateRoomMusicMsg, SCUpdateRoomMusicMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCUpdateRoomMusicMsg");

  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField SONG_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("songLvl", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField SONG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("songId", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField PSWD_FIELD_DESC = new org.apache.thrift.protocol.TField("pswd", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stageId", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCUpdateRoomMusicMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCUpdateRoomMusicMsgTupleSchemeFactory());
  }

  public byte mode; // optional
  public byte songLvl; // optional
  public short songId; // optional
  public String pswd; // optional
  public int stageId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MODE((short)1, "mode"),
    SONG_LVL((short)2, "songLvl"),
    SONG_ID((short)3, "songId"),
    PSWD((short)4, "pswd"),
    STAGE_ID((short)5, "stageId");

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
        case 1: // MODE
          return MODE;
        case 2: // SONG_LVL
          return SONG_LVL;
        case 3: // SONG_ID
          return SONG_ID;
        case 4: // PSWD
          return PSWD;
        case 5: // STAGE_ID
          return STAGE_ID;
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
  private static final int __MODE_ISSET_ID = 0;
  private static final int __SONGLVL_ISSET_ID = 1;
  private static final int __SONGID_ISSET_ID = 2;
  private static final int __STAGEID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.MODE,_Fields.SONG_LVL,_Fields.SONG_ID,_Fields.PSWD,_Fields.STAGE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.SONG_LVL, new org.apache.thrift.meta_data.FieldMetaData("songLvl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.SONG_ID, new org.apache.thrift.meta_data.FieldMetaData("songId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.PSWD, new org.apache.thrift.meta_data.FieldMetaData("pswd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("stageId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCUpdateRoomMusicMsg.class, metaDataMap);
  }

  public SCUpdateRoomMusicMsg() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCUpdateRoomMusicMsg(SCUpdateRoomMusicMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.mode = other.mode;
    this.songLvl = other.songLvl;
    this.songId = other.songId;
    if (other.isSetPswd()) {
      this.pswd = other.pswd;
    }
    this.stageId = other.stageId;
  }

  public SCUpdateRoomMusicMsg deepCopy() {
    return new SCUpdateRoomMusicMsg(this);
  }

  @Override
  public void clear() {
    setModeIsSet(false);
    this.mode = 0;
    setSongLvlIsSet(false);
    this.songLvl = 0;
    setSongIdIsSet(false);
    this.songId = 0;
    this.pswd = null;
    setStageIdIsSet(false);
    this.stageId = 0;
  }

  public byte getMode() {
    return this.mode;
  }

  public SCUpdateRoomMusicMsg setMode(byte mode) {
    this.mode = mode;
    setModeIsSet(true);
    return this;
  }

  public void unsetMode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MODE_ISSET_ID);
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return EncodingUtils.testBit(__isset_bitfield, __MODE_ISSET_ID);
  }

  public void setModeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MODE_ISSET_ID, value);
  }

  public byte getSongLvl() {
    return this.songLvl;
  }

  public SCUpdateRoomMusicMsg setSongLvl(byte songLvl) {
    this.songLvl = songLvl;
    setSongLvlIsSet(true);
    return this;
  }

  public void unsetSongLvl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SONGLVL_ISSET_ID);
  }

  /** Returns true if field songLvl is set (has been assigned a value) and false otherwise */
  public boolean isSetSongLvl() {
    return EncodingUtils.testBit(__isset_bitfield, __SONGLVL_ISSET_ID);
  }

  public void setSongLvlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SONGLVL_ISSET_ID, value);
  }

  public short getSongId() {
    return this.songId;
  }

  public SCUpdateRoomMusicMsg setSongId(short songId) {
    this.songId = songId;
    setSongIdIsSet(true);
    return this;
  }

  public void unsetSongId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SONGID_ISSET_ID);
  }

  /** Returns true if field songId is set (has been assigned a value) and false otherwise */
  public boolean isSetSongId() {
    return EncodingUtils.testBit(__isset_bitfield, __SONGID_ISSET_ID);
  }

  public void setSongIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SONGID_ISSET_ID, value);
  }

  public String getPswd() {
    return this.pswd;
  }

  public SCUpdateRoomMusicMsg setPswd(String pswd) {
    this.pswd = pswd;
    return this;
  }

  public void unsetPswd() {
    this.pswd = null;
  }

  /** Returns true if field pswd is set (has been assigned a value) and false otherwise */
  public boolean isSetPswd() {
    return this.pswd != null;
  }

  public void setPswdIsSet(boolean value) {
    if (!value) {
      this.pswd = null;
    }
  }

  public int getStageId() {
    return this.stageId;
  }

  public SCUpdateRoomMusicMsg setStageId(int stageId) {
    this.stageId = stageId;
    setStageIdIsSet(true);
    return this;
  }

  public void unsetStageId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STAGEID_ISSET_ID);
  }

  /** Returns true if field stageId is set (has been assigned a value) and false otherwise */
  public boolean isSetStageId() {
    return EncodingUtils.testBit(__isset_bitfield, __STAGEID_ISSET_ID);
  }

  public void setStageIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STAGEID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((Byte)value);
      }
      break;

    case SONG_LVL:
      if (value == null) {
        unsetSongLvl();
      } else {
        setSongLvl((Byte)value);
      }
      break;

    case SONG_ID:
      if (value == null) {
        unsetSongId();
      } else {
        setSongId((Short)value);
      }
      break;

    case PSWD:
      if (value == null) {
        unsetPswd();
      } else {
        setPswd((String)value);
      }
      break;

    case STAGE_ID:
      if (value == null) {
        unsetStageId();
      } else {
        setStageId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MODE:
      return Byte.valueOf(getMode());

    case SONG_LVL:
      return Byte.valueOf(getSongLvl());

    case SONG_ID:
      return Short.valueOf(getSongId());

    case PSWD:
      return getPswd();

    case STAGE_ID:
      return Integer.valueOf(getStageId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MODE:
      return isSetMode();
    case SONG_LVL:
      return isSetSongLvl();
    case SONG_ID:
      return isSetSongId();
    case PSWD:
      return isSetPswd();
    case STAGE_ID:
      return isSetStageId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCUpdateRoomMusicMsg)
      return this.equals((SCUpdateRoomMusicMsg)that);
    return false;
  }

  public boolean equals(SCUpdateRoomMusicMsg that) {
    if (that == null)
      return false;

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (this.mode != that.mode)
        return false;
    }

    boolean this_present_songLvl = true && this.isSetSongLvl();
    boolean that_present_songLvl = true && that.isSetSongLvl();
    if (this_present_songLvl || that_present_songLvl) {
      if (!(this_present_songLvl && that_present_songLvl))
        return false;
      if (this.songLvl != that.songLvl)
        return false;
    }

    boolean this_present_songId = true && this.isSetSongId();
    boolean that_present_songId = true && that.isSetSongId();
    if (this_present_songId || that_present_songId) {
      if (!(this_present_songId && that_present_songId))
        return false;
      if (this.songId != that.songId)
        return false;
    }

    boolean this_present_pswd = true && this.isSetPswd();
    boolean that_present_pswd = true && that.isSetPswd();
    if (this_present_pswd || that_present_pswd) {
      if (!(this_present_pswd && that_present_pswd))
        return false;
      if (!this.pswd.equals(that.pswd))
        return false;
    }

    boolean this_present_stageId = true && this.isSetStageId();
    boolean that_present_stageId = true && that.isSetStageId();
    if (this_present_stageId || that_present_stageId) {
      if (!(this_present_stageId && that_present_stageId))
        return false;
      if (this.stageId != that.stageId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCUpdateRoomMusicMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCUpdateRoomMusicMsg typedOther = (SCUpdateRoomMusicMsg)other;

    lastComparison = Boolean.valueOf(isSetMode()).compareTo(typedOther.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, typedOther.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSongLvl()).compareTo(typedOther.isSetSongLvl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSongLvl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.songLvl, typedOther.songLvl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSongId()).compareTo(typedOther.isSetSongId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSongId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.songId, typedOther.songId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPswd()).compareTo(typedOther.isSetPswd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPswd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pswd, typedOther.pswd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStageId()).compareTo(typedOther.isSetStageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stageId, typedOther.stageId);
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
    StringBuilder sb = new StringBuilder("SCUpdateRoomMusicMsg(");
    boolean first = true;

    if (isSetMode()) {
      sb.append("mode:");
      sb.append(this.mode);
      first = false;
    }
    if (isSetSongLvl()) {
      if (!first) sb.append(", ");
      sb.append("songLvl:");
      sb.append(this.songLvl);
      first = false;
    }
    if (isSetSongId()) {
      if (!first) sb.append(", ");
      sb.append("songId:");
      sb.append(this.songId);
      first = false;
    }
    if (isSetPswd()) {
      if (!first) sb.append(", ");
      sb.append("pswd:");
      if (this.pswd == null) {
        sb.append("null");
      } else {
        sb.append(this.pswd);
      }
      first = false;
    }
    if (isSetStageId()) {
      if (!first) sb.append(", ");
      sb.append("stageId:");
      sb.append(this.stageId);
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

  private static class SCUpdateRoomMusicMsgStandardSchemeFactory implements SchemeFactory {
    public SCUpdateRoomMusicMsgStandardScheme getScheme() {
      return new SCUpdateRoomMusicMsgStandardScheme();
    }
  }

  private static class SCUpdateRoomMusicMsgStandardScheme extends StandardScheme<SCUpdateRoomMusicMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCUpdateRoomMusicMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.mode = iprot.readByte();
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SONG_LVL
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.songLvl = iprot.readByte();
              struct.setSongLvlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SONG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.songId = iprot.readI16();
              struct.setSongIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PSWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pswd = iprot.readString();
              struct.setPswdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stageId = iprot.readI32();
              struct.setStageIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCUpdateRoomMusicMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetMode()) {
        oprot.writeFieldBegin(MODE_FIELD_DESC);
        oprot.writeByte(struct.mode);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSongLvl()) {
        oprot.writeFieldBegin(SONG_LVL_FIELD_DESC);
        oprot.writeByte(struct.songLvl);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSongId()) {
        oprot.writeFieldBegin(SONG_ID_FIELD_DESC);
        oprot.writeI16(struct.songId);
        oprot.writeFieldEnd();
      }
      if (struct.pswd != null) {
        if (struct.isSetPswd()) {
          oprot.writeFieldBegin(PSWD_FIELD_DESC);
          oprot.writeString(struct.pswd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStageId()) {
        oprot.writeFieldBegin(STAGE_ID_FIELD_DESC);
        oprot.writeI32(struct.stageId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCUpdateRoomMusicMsgTupleSchemeFactory implements SchemeFactory {
    public SCUpdateRoomMusicMsgTupleScheme getScheme() {
      return new SCUpdateRoomMusicMsgTupleScheme();
    }
  }

  private static class SCUpdateRoomMusicMsgTupleScheme extends TupleScheme<SCUpdateRoomMusicMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCUpdateRoomMusicMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMode()) {
        optionals.set(0);
      }
      if (struct.isSetSongLvl()) {
        optionals.set(1);
      }
      if (struct.isSetSongId()) {
        optionals.set(2);
      }
      if (struct.isSetPswd()) {
        optionals.set(3);
      }
      if (struct.isSetStageId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMode()) {
        oprot.writeByte(struct.mode);
      }
      if (struct.isSetSongLvl()) {
        oprot.writeByte(struct.songLvl);
      }
      if (struct.isSetSongId()) {
        oprot.writeI16(struct.songId);
      }
      if (struct.isSetPswd()) {
        oprot.writeString(struct.pswd);
      }
      if (struct.isSetStageId()) {
        oprot.writeI32(struct.stageId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCUpdateRoomMusicMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.mode = iprot.readByte();
        struct.setModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.songLvl = iprot.readByte();
        struct.setSongLvlIsSet(true);
      }
      if (incoming.get(2)) {
        struct.songId = iprot.readI16();
        struct.setSongIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pswd = iprot.readString();
        struct.setPswdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.stageId = iprot.readI32();
        struct.setStageIdIsSet(true);
      }
    }
  }

}

