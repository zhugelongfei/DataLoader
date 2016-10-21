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

/**
 * 广场房间信息
 */
public class GroundRoomInfo implements org.apache.thrift.TBase<GroundRoomInfo, GroundRoomInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GroundRoomInfo");

  private static final org.apache.thrift.protocol.TField LOCK_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("lockState", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ROOM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("roomId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LEADER_BASE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("leaderBaseInfo", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField CUR_MALE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("curMaleCount", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField CUR_FEMALE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("curFemaleCount", org.apache.thrift.protocol.TType.BYTE, (short)6);
  private static final org.apache.thrift.protocol.TField MAX_MEMEBER_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("maxMemeberCount", org.apache.thrift.protocol.TType.BYTE, (short)7);
  private static final org.apache.thrift.protocol.TField IS_STICK_FIELD_DESC = new org.apache.thrift.protocol.TField("isStick", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GroundRoomInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GroundRoomInfoTupleSchemeFactory());
  }

  /**
   * 0-无密码 1-有密码
   */
  public byte lockState; // required
  public int roomId; // required
  public String title; // required
  public PlayerBaseInfo leaderBaseInfo; // required
  public byte curMaleCount; // required
  public byte curFemaleCount; // required
  public byte maxMemeberCount; // required
  public boolean isStick; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 0-无密码 1-有密码
     */
    LOCK_STATE((short)1, "lockState"),
    ROOM_ID((short)2, "roomId"),
    TITLE((short)3, "title"),
    LEADER_BASE_INFO((short)4, "leaderBaseInfo"),
    CUR_MALE_COUNT((short)5, "curMaleCount"),
    CUR_FEMALE_COUNT((short)6, "curFemaleCount"),
    MAX_MEMEBER_COUNT((short)7, "maxMemeberCount"),
    IS_STICK((short)8, "isStick");

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
        case 1: // LOCK_STATE
          return LOCK_STATE;
        case 2: // ROOM_ID
          return ROOM_ID;
        case 3: // TITLE
          return TITLE;
        case 4: // LEADER_BASE_INFO
          return LEADER_BASE_INFO;
        case 5: // CUR_MALE_COUNT
          return CUR_MALE_COUNT;
        case 6: // CUR_FEMALE_COUNT
          return CUR_FEMALE_COUNT;
        case 7: // MAX_MEMEBER_COUNT
          return MAX_MEMEBER_COUNT;
        case 8: // IS_STICK
          return IS_STICK;
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
  private static final int __LOCKSTATE_ISSET_ID = 0;
  private static final int __ROOMID_ISSET_ID = 1;
  private static final int __CURMALECOUNT_ISSET_ID = 2;
  private static final int __CURFEMALECOUNT_ISSET_ID = 3;
  private static final int __MAXMEMEBERCOUNT_ISSET_ID = 4;
  private static final int __ISSTICK_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCK_STATE, new org.apache.thrift.meta_data.FieldMetaData("lockState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ROOM_ID, new org.apache.thrift.meta_data.FieldMetaData("roomId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LEADER_BASE_INFO, new org.apache.thrift.meta_data.FieldMetaData("leaderBaseInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PlayerBaseInfo.class)));
    tmpMap.put(_Fields.CUR_MALE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("curMaleCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CUR_FEMALE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("curFemaleCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.MAX_MEMEBER_COUNT, new org.apache.thrift.meta_data.FieldMetaData("maxMemeberCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.IS_STICK, new org.apache.thrift.meta_data.FieldMetaData("isStick", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GroundRoomInfo.class, metaDataMap);
  }

  public GroundRoomInfo() {
  }

  public GroundRoomInfo(
    byte lockState,
    int roomId,
    String title,
    PlayerBaseInfo leaderBaseInfo,
    byte curMaleCount,
    byte curFemaleCount,
    byte maxMemeberCount,
    boolean isStick)
  {
    this();
    this.lockState = lockState;
    setLockStateIsSet(true);
    this.roomId = roomId;
    setRoomIdIsSet(true);
    this.title = title;
    this.leaderBaseInfo = leaderBaseInfo;
    this.curMaleCount = curMaleCount;
    setCurMaleCountIsSet(true);
    this.curFemaleCount = curFemaleCount;
    setCurFemaleCountIsSet(true);
    this.maxMemeberCount = maxMemeberCount;
    setMaxMemeberCountIsSet(true);
    this.isStick = isStick;
    setIsStickIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroundRoomInfo(GroundRoomInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.lockState = other.lockState;
    this.roomId = other.roomId;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetLeaderBaseInfo()) {
      this.leaderBaseInfo = new PlayerBaseInfo(other.leaderBaseInfo);
    }
    this.curMaleCount = other.curMaleCount;
    this.curFemaleCount = other.curFemaleCount;
    this.maxMemeberCount = other.maxMemeberCount;
    this.isStick = other.isStick;
  }

  public GroundRoomInfo deepCopy() {
    return new GroundRoomInfo(this);
  }

  @Override
  public void clear() {
    setLockStateIsSet(false);
    this.lockState = 0;
    setRoomIdIsSet(false);
    this.roomId = 0;
    this.title = null;
    this.leaderBaseInfo = null;
    setCurMaleCountIsSet(false);
    this.curMaleCount = 0;
    setCurFemaleCountIsSet(false);
    this.curFemaleCount = 0;
    setMaxMemeberCountIsSet(false);
    this.maxMemeberCount = 0;
    setIsStickIsSet(false);
    this.isStick = false;
  }

  /**
   * 0-无密码 1-有密码
   */
  public byte getLockState() {
    return this.lockState;
  }

  /**
   * 0-无密码 1-有密码
   */
  public GroundRoomInfo setLockState(byte lockState) {
    this.lockState = lockState;
    setLockStateIsSet(true);
    return this;
  }

  public void unsetLockState() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCKSTATE_ISSET_ID);
  }

  /** Returns true if field lockState is set (has been assigned a value) and false otherwise */
  public boolean isSetLockState() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCKSTATE_ISSET_ID);
  }

  public void setLockStateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCKSTATE_ISSET_ID, value);
  }

  public int getRoomId() {
    return this.roomId;
  }

  public GroundRoomInfo setRoomId(int roomId) {
    this.roomId = roomId;
    setRoomIdIsSet(true);
    return this;
  }

  public void unsetRoomId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROOMID_ISSET_ID);
  }

  /** Returns true if field roomId is set (has been assigned a value) and false otherwise */
  public boolean isSetRoomId() {
    return EncodingUtils.testBit(__isset_bitfield, __ROOMID_ISSET_ID);
  }

  public void setRoomIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROOMID_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public GroundRoomInfo setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public PlayerBaseInfo getLeaderBaseInfo() {
    return this.leaderBaseInfo;
  }

  public GroundRoomInfo setLeaderBaseInfo(PlayerBaseInfo leaderBaseInfo) {
    this.leaderBaseInfo = leaderBaseInfo;
    return this;
  }

  public void unsetLeaderBaseInfo() {
    this.leaderBaseInfo = null;
  }

  /** Returns true if field leaderBaseInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetLeaderBaseInfo() {
    return this.leaderBaseInfo != null;
  }

  public void setLeaderBaseInfoIsSet(boolean value) {
    if (!value) {
      this.leaderBaseInfo = null;
    }
  }

  public byte getCurMaleCount() {
    return this.curMaleCount;
  }

  public GroundRoomInfo setCurMaleCount(byte curMaleCount) {
    this.curMaleCount = curMaleCount;
    setCurMaleCountIsSet(true);
    return this;
  }

  public void unsetCurMaleCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURMALECOUNT_ISSET_ID);
  }

  /** Returns true if field curMaleCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCurMaleCount() {
    return EncodingUtils.testBit(__isset_bitfield, __CURMALECOUNT_ISSET_ID);
  }

  public void setCurMaleCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURMALECOUNT_ISSET_ID, value);
  }

  public byte getCurFemaleCount() {
    return this.curFemaleCount;
  }

  public GroundRoomInfo setCurFemaleCount(byte curFemaleCount) {
    this.curFemaleCount = curFemaleCount;
    setCurFemaleCountIsSet(true);
    return this;
  }

  public void unsetCurFemaleCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURFEMALECOUNT_ISSET_ID);
  }

  /** Returns true if field curFemaleCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCurFemaleCount() {
    return EncodingUtils.testBit(__isset_bitfield, __CURFEMALECOUNT_ISSET_ID);
  }

  public void setCurFemaleCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURFEMALECOUNT_ISSET_ID, value);
  }

  public byte getMaxMemeberCount() {
    return this.maxMemeberCount;
  }

  public GroundRoomInfo setMaxMemeberCount(byte maxMemeberCount) {
    this.maxMemeberCount = maxMemeberCount;
    setMaxMemeberCountIsSet(true);
    return this;
  }

  public void unsetMaxMemeberCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXMEMEBERCOUNT_ISSET_ID);
  }

  /** Returns true if field maxMemeberCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxMemeberCount() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXMEMEBERCOUNT_ISSET_ID);
  }

  public void setMaxMemeberCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXMEMEBERCOUNT_ISSET_ID, value);
  }

  public boolean isIsStick() {
    return this.isStick;
  }

  public GroundRoomInfo setIsStick(boolean isStick) {
    this.isStick = isStick;
    setIsStickIsSet(true);
    return this;
  }

  public void unsetIsStick() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSTICK_ISSET_ID);
  }

  /** Returns true if field isStick is set (has been assigned a value) and false otherwise */
  public boolean isSetIsStick() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSTICK_ISSET_ID);
  }

  public void setIsStickIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSTICK_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOCK_STATE:
      if (value == null) {
        unsetLockState();
      } else {
        setLockState((Byte)value);
      }
      break;

    case ROOM_ID:
      if (value == null) {
        unsetRoomId();
      } else {
        setRoomId((Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case LEADER_BASE_INFO:
      if (value == null) {
        unsetLeaderBaseInfo();
      } else {
        setLeaderBaseInfo((PlayerBaseInfo)value);
      }
      break;

    case CUR_MALE_COUNT:
      if (value == null) {
        unsetCurMaleCount();
      } else {
        setCurMaleCount((Byte)value);
      }
      break;

    case CUR_FEMALE_COUNT:
      if (value == null) {
        unsetCurFemaleCount();
      } else {
        setCurFemaleCount((Byte)value);
      }
      break;

    case MAX_MEMEBER_COUNT:
      if (value == null) {
        unsetMaxMemeberCount();
      } else {
        setMaxMemeberCount((Byte)value);
      }
      break;

    case IS_STICK:
      if (value == null) {
        unsetIsStick();
      } else {
        setIsStick((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCK_STATE:
      return Byte.valueOf(getLockState());

    case ROOM_ID:
      return Integer.valueOf(getRoomId());

    case TITLE:
      return getTitle();

    case LEADER_BASE_INFO:
      return getLeaderBaseInfo();

    case CUR_MALE_COUNT:
      return Byte.valueOf(getCurMaleCount());

    case CUR_FEMALE_COUNT:
      return Byte.valueOf(getCurFemaleCount());

    case MAX_MEMEBER_COUNT:
      return Byte.valueOf(getMaxMemeberCount());

    case IS_STICK:
      return Boolean.valueOf(isIsStick());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOCK_STATE:
      return isSetLockState();
    case ROOM_ID:
      return isSetRoomId();
    case TITLE:
      return isSetTitle();
    case LEADER_BASE_INFO:
      return isSetLeaderBaseInfo();
    case CUR_MALE_COUNT:
      return isSetCurMaleCount();
    case CUR_FEMALE_COUNT:
      return isSetCurFemaleCount();
    case MAX_MEMEBER_COUNT:
      return isSetMaxMemeberCount();
    case IS_STICK:
      return isSetIsStick();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GroundRoomInfo)
      return this.equals((GroundRoomInfo)that);
    return false;
  }

  public boolean equals(GroundRoomInfo that) {
    if (that == null)
      return false;

    boolean this_present_lockState = true;
    boolean that_present_lockState = true;
    if (this_present_lockState || that_present_lockState) {
      if (!(this_present_lockState && that_present_lockState))
        return false;
      if (this.lockState != that.lockState)
        return false;
    }

    boolean this_present_roomId = true;
    boolean that_present_roomId = true;
    if (this_present_roomId || that_present_roomId) {
      if (!(this_present_roomId && that_present_roomId))
        return false;
      if (this.roomId != that.roomId)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_leaderBaseInfo = true && this.isSetLeaderBaseInfo();
    boolean that_present_leaderBaseInfo = true && that.isSetLeaderBaseInfo();
    if (this_present_leaderBaseInfo || that_present_leaderBaseInfo) {
      if (!(this_present_leaderBaseInfo && that_present_leaderBaseInfo))
        return false;
      if (!this.leaderBaseInfo.equals(that.leaderBaseInfo))
        return false;
    }

    boolean this_present_curMaleCount = true;
    boolean that_present_curMaleCount = true;
    if (this_present_curMaleCount || that_present_curMaleCount) {
      if (!(this_present_curMaleCount && that_present_curMaleCount))
        return false;
      if (this.curMaleCount != that.curMaleCount)
        return false;
    }

    boolean this_present_curFemaleCount = true;
    boolean that_present_curFemaleCount = true;
    if (this_present_curFemaleCount || that_present_curFemaleCount) {
      if (!(this_present_curFemaleCount && that_present_curFemaleCount))
        return false;
      if (this.curFemaleCount != that.curFemaleCount)
        return false;
    }

    boolean this_present_maxMemeberCount = true;
    boolean that_present_maxMemeberCount = true;
    if (this_present_maxMemeberCount || that_present_maxMemeberCount) {
      if (!(this_present_maxMemeberCount && that_present_maxMemeberCount))
        return false;
      if (this.maxMemeberCount != that.maxMemeberCount)
        return false;
    }

    boolean this_present_isStick = true;
    boolean that_present_isStick = true;
    if (this_present_isStick || that_present_isStick) {
      if (!(this_present_isStick && that_present_isStick))
        return false;
      if (this.isStick != that.isStick)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GroundRoomInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GroundRoomInfo typedOther = (GroundRoomInfo)other;

    lastComparison = Boolean.valueOf(isSetLockState()).compareTo(typedOther.isSetLockState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLockState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lockState, typedOther.lockState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoomId()).compareTo(typedOther.isSetRoomId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoomId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roomId, typedOther.roomId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(typedOther.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, typedOther.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeaderBaseInfo()).compareTo(typedOther.isSetLeaderBaseInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeaderBaseInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leaderBaseInfo, typedOther.leaderBaseInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurMaleCount()).compareTo(typedOther.isSetCurMaleCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurMaleCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.curMaleCount, typedOther.curMaleCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurFemaleCount()).compareTo(typedOther.isSetCurFemaleCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurFemaleCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.curFemaleCount, typedOther.curFemaleCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxMemeberCount()).compareTo(typedOther.isSetMaxMemeberCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxMemeberCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxMemeberCount, typedOther.maxMemeberCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsStick()).compareTo(typedOther.isSetIsStick());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsStick()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isStick, typedOther.isStick);
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
    StringBuilder sb = new StringBuilder("GroundRoomInfo(");
    boolean first = true;

    sb.append("lockState:");
    sb.append(this.lockState);
    first = false;
    if (!first) sb.append(", ");
    sb.append("roomId:");
    sb.append(this.roomId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("leaderBaseInfo:");
    if (this.leaderBaseInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.leaderBaseInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("curMaleCount:");
    sb.append(this.curMaleCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("curFemaleCount:");
    sb.append(this.curFemaleCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxMemeberCount:");
    sb.append(this.maxMemeberCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isStick:");
    sb.append(this.isStick);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (leaderBaseInfo != null) {
      leaderBaseInfo.validate();
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

  private static class GroundRoomInfoStandardSchemeFactory implements SchemeFactory {
    public GroundRoomInfoStandardScheme getScheme() {
      return new GroundRoomInfoStandardScheme();
    }
  }

  private static class GroundRoomInfoStandardScheme extends StandardScheme<GroundRoomInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GroundRoomInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCK_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.lockState = iprot.readByte();
              struct.setLockStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROOM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.roomId = iprot.readI32();
              struct.setRoomIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LEADER_BASE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.leaderBaseInfo = new PlayerBaseInfo();
              struct.leaderBaseInfo.read(iprot);
              struct.setLeaderBaseInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CUR_MALE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.curMaleCount = iprot.readByte();
              struct.setCurMaleCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CUR_FEMALE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.curFemaleCount = iprot.readByte();
              struct.setCurFemaleCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MAX_MEMEBER_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.maxMemeberCount = iprot.readByte();
              struct.setMaxMemeberCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // IS_STICK
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isStick = iprot.readBool();
              struct.setIsStickIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GroundRoomInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LOCK_STATE_FIELD_DESC);
      oprot.writeByte(struct.lockState);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ROOM_ID_FIELD_DESC);
      oprot.writeI32(struct.roomId);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.leaderBaseInfo != null) {
        oprot.writeFieldBegin(LEADER_BASE_INFO_FIELD_DESC);
        struct.leaderBaseInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CUR_MALE_COUNT_FIELD_DESC);
      oprot.writeByte(struct.curMaleCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CUR_FEMALE_COUNT_FIELD_DESC);
      oprot.writeByte(struct.curFemaleCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_MEMEBER_COUNT_FIELD_DESC);
      oprot.writeByte(struct.maxMemeberCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_STICK_FIELD_DESC);
      oprot.writeBool(struct.isStick);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroundRoomInfoTupleSchemeFactory implements SchemeFactory {
    public GroundRoomInfoTupleScheme getScheme() {
      return new GroundRoomInfoTupleScheme();
    }
  }

  private static class GroundRoomInfoTupleScheme extends TupleScheme<GroundRoomInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GroundRoomInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLockState()) {
        optionals.set(0);
      }
      if (struct.isSetRoomId()) {
        optionals.set(1);
      }
      if (struct.isSetTitle()) {
        optionals.set(2);
      }
      if (struct.isSetLeaderBaseInfo()) {
        optionals.set(3);
      }
      if (struct.isSetCurMaleCount()) {
        optionals.set(4);
      }
      if (struct.isSetCurFemaleCount()) {
        optionals.set(5);
      }
      if (struct.isSetMaxMemeberCount()) {
        optionals.set(6);
      }
      if (struct.isSetIsStick()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetLockState()) {
        oprot.writeByte(struct.lockState);
      }
      if (struct.isSetRoomId()) {
        oprot.writeI32(struct.roomId);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetLeaderBaseInfo()) {
        struct.leaderBaseInfo.write(oprot);
      }
      if (struct.isSetCurMaleCount()) {
        oprot.writeByte(struct.curMaleCount);
      }
      if (struct.isSetCurFemaleCount()) {
        oprot.writeByte(struct.curFemaleCount);
      }
      if (struct.isSetMaxMemeberCount()) {
        oprot.writeByte(struct.maxMemeberCount);
      }
      if (struct.isSetIsStick()) {
        oprot.writeBool(struct.isStick);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GroundRoomInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.lockState = iprot.readByte();
        struct.setLockStateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.roomId = iprot.readI32();
        struct.setRoomIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.leaderBaseInfo = new PlayerBaseInfo();
        struct.leaderBaseInfo.read(iprot);
        struct.setLeaderBaseInfoIsSet(true);
      }
      if (incoming.get(4)) {
        struct.curMaleCount = iprot.readByte();
        struct.setCurMaleCountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.curFemaleCount = iprot.readByte();
        struct.setCurFemaleCountIsSet(true);
      }
      if (incoming.get(6)) {
        struct.maxMemeberCount = iprot.readByte();
        struct.setMaxMemeberCountIsSet(true);
      }
      if (incoming.get(7)) {
        struct.isStick = iprot.readBool();
        struct.setIsStickIsSet(true);
      }
    }
  }

}
