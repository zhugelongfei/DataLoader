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

public class RankInfo implements org.apache.thrift.TBase<RankInfo, RankInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RankInfo");

  private static final org.apache.thrift.protocol.TField POSE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("poseId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PLAYER_BASE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("playerBaseInfos", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField GUILD_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("guildInfo", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RankInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RankInfoTupleSchemeFactory());
  }

  /**
   * 双人榜单动作id
   */
  public int poseId; // optional
  public long score; // required
  public List<PlayerBaseInfo> playerBaseInfos; // required
  public GuildRankInfo guildInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 双人榜单动作id
     */
    POSE_ID((short)1, "poseId"),
    SCORE((short)2, "score"),
    PLAYER_BASE_INFOS((short)3, "playerBaseInfos"),
    GUILD_INFO((short)4, "guildInfo");

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
        case 1: // POSE_ID
          return POSE_ID;
        case 2: // SCORE
          return SCORE;
        case 3: // PLAYER_BASE_INFOS
          return PLAYER_BASE_INFOS;
        case 4: // GUILD_INFO
          return GUILD_INFO;
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
  private static final int __POSEID_ISSET_ID = 0;
  private static final int __SCORE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.POSE_ID,_Fields.GUILD_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POSE_ID, new org.apache.thrift.meta_data.FieldMetaData("poseId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PLAYER_BASE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("playerBaseInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PlayerBaseInfo.class))));
    tmpMap.put(_Fields.GUILD_INFO, new org.apache.thrift.meta_data.FieldMetaData("guildInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GuildRankInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RankInfo.class, metaDataMap);
  }

  public RankInfo() {
  }

  public RankInfo(
    long score,
    List<PlayerBaseInfo> playerBaseInfos)
  {
    this();
    this.score = score;
    setScoreIsSet(true);
    this.playerBaseInfos = playerBaseInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RankInfo(RankInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.poseId = other.poseId;
    this.score = other.score;
    if (other.isSetPlayerBaseInfos()) {
      List<PlayerBaseInfo> __this__playerBaseInfos = new ArrayList<PlayerBaseInfo>();
      for (PlayerBaseInfo other_element : other.playerBaseInfos) {
        __this__playerBaseInfos.add(new PlayerBaseInfo(other_element));
      }
      this.playerBaseInfos = __this__playerBaseInfos;
    }
    if (other.isSetGuildInfo()) {
      this.guildInfo = new GuildRankInfo(other.guildInfo);
    }
  }

  public RankInfo deepCopy() {
    return new RankInfo(this);
  }

  @Override
  public void clear() {
    setPoseIdIsSet(false);
    this.poseId = 0;
    setScoreIsSet(false);
    this.score = 0;
    this.playerBaseInfos = null;
    this.guildInfo = null;
  }

  /**
   * 双人榜单动作id
   */
  public int getPoseId() {
    return this.poseId;
  }

  /**
   * 双人榜单动作id
   */
  public RankInfo setPoseId(int poseId) {
    this.poseId = poseId;
    setPoseIdIsSet(true);
    return this;
  }

  public void unsetPoseId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POSEID_ISSET_ID);
  }

  /** Returns true if field poseId is set (has been assigned a value) and false otherwise */
  public boolean isSetPoseId() {
    return EncodingUtils.testBit(__isset_bitfield, __POSEID_ISSET_ID);
  }

  public void setPoseIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POSEID_ISSET_ID, value);
  }

  public long getScore() {
    return this.score;
  }

  public RankInfo setScore(long score) {
    this.score = score;
    setScoreIsSet(true);
    return this;
  }

  public void unsetScore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  /** Returns true if field score is set (has been assigned a value) and false otherwise */
  public boolean isSetScore() {
    return EncodingUtils.testBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  public void setScoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCORE_ISSET_ID, value);
  }

  public int getPlayerBaseInfosSize() {
    return (this.playerBaseInfos == null) ? 0 : this.playerBaseInfos.size();
  }

  public java.util.Iterator<PlayerBaseInfo> getPlayerBaseInfosIterator() {
    return (this.playerBaseInfos == null) ? null : this.playerBaseInfos.iterator();
  }

  public void addToPlayerBaseInfos(PlayerBaseInfo elem) {
    if (this.playerBaseInfos == null) {
      this.playerBaseInfos = new ArrayList<PlayerBaseInfo>();
    }
    this.playerBaseInfos.add(elem);
  }

  public List<PlayerBaseInfo> getPlayerBaseInfos() {
    return this.playerBaseInfos;
  }

  public RankInfo setPlayerBaseInfos(List<PlayerBaseInfo> playerBaseInfos) {
    this.playerBaseInfos = playerBaseInfos;
    return this;
  }

  public void unsetPlayerBaseInfos() {
    this.playerBaseInfos = null;
  }

  /** Returns true if field playerBaseInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetPlayerBaseInfos() {
    return this.playerBaseInfos != null;
  }

  public void setPlayerBaseInfosIsSet(boolean value) {
    if (!value) {
      this.playerBaseInfos = null;
    }
  }

  public GuildRankInfo getGuildInfo() {
    return this.guildInfo;
  }

  public RankInfo setGuildInfo(GuildRankInfo guildInfo) {
    this.guildInfo = guildInfo;
    return this;
  }

  public void unsetGuildInfo() {
    this.guildInfo = null;
  }

  /** Returns true if field guildInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetGuildInfo() {
    return this.guildInfo != null;
  }

  public void setGuildInfoIsSet(boolean value) {
    if (!value) {
      this.guildInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POSE_ID:
      if (value == null) {
        unsetPoseId();
      } else {
        setPoseId((Integer)value);
      }
      break;

    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((Long)value);
      }
      break;

    case PLAYER_BASE_INFOS:
      if (value == null) {
        unsetPlayerBaseInfos();
      } else {
        setPlayerBaseInfos((List<PlayerBaseInfo>)value);
      }
      break;

    case GUILD_INFO:
      if (value == null) {
        unsetGuildInfo();
      } else {
        setGuildInfo((GuildRankInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POSE_ID:
      return Integer.valueOf(getPoseId());

    case SCORE:
      return Long.valueOf(getScore());

    case PLAYER_BASE_INFOS:
      return getPlayerBaseInfos();

    case GUILD_INFO:
      return getGuildInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POSE_ID:
      return isSetPoseId();
    case SCORE:
      return isSetScore();
    case PLAYER_BASE_INFOS:
      return isSetPlayerBaseInfos();
    case GUILD_INFO:
      return isSetGuildInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RankInfo)
      return this.equals((RankInfo)that);
    return false;
  }

  public boolean equals(RankInfo that) {
    if (that == null)
      return false;

    boolean this_present_poseId = true && this.isSetPoseId();
    boolean that_present_poseId = true && that.isSetPoseId();
    if (this_present_poseId || that_present_poseId) {
      if (!(this_present_poseId && that_present_poseId))
        return false;
      if (this.poseId != that.poseId)
        return false;
    }

    boolean this_present_score = true;
    boolean that_present_score = true;
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (this.score != that.score)
        return false;
    }

    boolean this_present_playerBaseInfos = true && this.isSetPlayerBaseInfos();
    boolean that_present_playerBaseInfos = true && that.isSetPlayerBaseInfos();
    if (this_present_playerBaseInfos || that_present_playerBaseInfos) {
      if (!(this_present_playerBaseInfos && that_present_playerBaseInfos))
        return false;
      if (!this.playerBaseInfos.equals(that.playerBaseInfos))
        return false;
    }

    boolean this_present_guildInfo = true && this.isSetGuildInfo();
    boolean that_present_guildInfo = true && that.isSetGuildInfo();
    if (this_present_guildInfo || that_present_guildInfo) {
      if (!(this_present_guildInfo && that_present_guildInfo))
        return false;
      if (!this.guildInfo.equals(that.guildInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RankInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RankInfo typedOther = (RankInfo)other;

    lastComparison = Boolean.valueOf(isSetPoseId()).compareTo(typedOther.isSetPoseId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoseId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poseId, typedOther.poseId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScore()).compareTo(typedOther.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, typedOther.score);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPlayerBaseInfos()).compareTo(typedOther.isSetPlayerBaseInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlayerBaseInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.playerBaseInfos, typedOther.playerBaseInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuildInfo()).compareTo(typedOther.isSetGuildInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuildInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.guildInfo, typedOther.guildInfo);
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
    StringBuilder sb = new StringBuilder("RankInfo(");
    boolean first = true;

    if (isSetPoseId()) {
      sb.append("poseId:");
      sb.append(this.poseId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("score:");
    sb.append(this.score);
    first = false;
    if (!first) sb.append(", ");
    sb.append("playerBaseInfos:");
    if (this.playerBaseInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.playerBaseInfos);
    }
    first = false;
    if (isSetGuildInfo()) {
      if (!first) sb.append(", ");
      sb.append("guildInfo:");
      if (this.guildInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.guildInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (guildInfo != null) {
      guildInfo.validate();
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

  private static class RankInfoStandardSchemeFactory implements SchemeFactory {
    public RankInfoStandardScheme getScheme() {
      return new RankInfoStandardScheme();
    }
  }

  private static class RankInfoStandardScheme extends StandardScheme<RankInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RankInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POSE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.poseId = iprot.readI32();
              struct.setPoseIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.score = iprot.readI64();
              struct.setScoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PLAYER_BASE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list356 = iprot.readListBegin();
                struct.playerBaseInfos = new ArrayList<PlayerBaseInfo>(_list356.size);
                for (int _i357 = 0; _i357 < _list356.size; ++_i357)
                {
                  PlayerBaseInfo _elem358; // required
                  _elem358 = new PlayerBaseInfo();
                  _elem358.read(iprot);
                  struct.playerBaseInfos.add(_elem358);
                }
                iprot.readListEnd();
              }
              struct.setPlayerBaseInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GUILD_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.guildInfo = new GuildRankInfo();
              struct.guildInfo.read(iprot);
              struct.setGuildInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RankInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetPoseId()) {
        oprot.writeFieldBegin(POSE_ID_FIELD_DESC);
        oprot.writeI32(struct.poseId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SCORE_FIELD_DESC);
      oprot.writeI64(struct.score);
      oprot.writeFieldEnd();
      if (struct.playerBaseInfos != null) {
        oprot.writeFieldBegin(PLAYER_BASE_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.playerBaseInfos.size()));
          for (PlayerBaseInfo _iter359 : struct.playerBaseInfos)
          {
            _iter359.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.guildInfo != null) {
        if (struct.isSetGuildInfo()) {
          oprot.writeFieldBegin(GUILD_INFO_FIELD_DESC);
          struct.guildInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RankInfoTupleSchemeFactory implements SchemeFactory {
    public RankInfoTupleScheme getScheme() {
      return new RankInfoTupleScheme();
    }
  }

  private static class RankInfoTupleScheme extends TupleScheme<RankInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RankInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPoseId()) {
        optionals.set(0);
      }
      if (struct.isSetScore()) {
        optionals.set(1);
      }
      if (struct.isSetPlayerBaseInfos()) {
        optionals.set(2);
      }
      if (struct.isSetGuildInfo()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPoseId()) {
        oprot.writeI32(struct.poseId);
      }
      if (struct.isSetScore()) {
        oprot.writeI64(struct.score);
      }
      if (struct.isSetPlayerBaseInfos()) {
        {
          oprot.writeI32(struct.playerBaseInfos.size());
          for (PlayerBaseInfo _iter360 : struct.playerBaseInfos)
          {
            _iter360.write(oprot);
          }
        }
      }
      if (struct.isSetGuildInfo()) {
        struct.guildInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RankInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.poseId = iprot.readI32();
        struct.setPoseIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.score = iprot.readI64();
        struct.setScoreIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list361 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.playerBaseInfos = new ArrayList<PlayerBaseInfo>(_list361.size);
          for (int _i362 = 0; _i362 < _list361.size; ++_i362)
          {
            PlayerBaseInfo _elem363; // required
            _elem363 = new PlayerBaseInfo();
            _elem363.read(iprot);
            struct.playerBaseInfos.add(_elem363);
          }
        }
        struct.setPlayerBaseInfosIsSet(true);
      }
      if (incoming.get(3)) {
        struct.guildInfo = new GuildRankInfo();
        struct.guildInfo.read(iprot);
        struct.setGuildInfoIsSet(true);
      }
    }
  }

}
