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
 * 竞技房间信息
 */
public class SCDanceRoomInfosMsg implements org.apache.thrift.TBase<SCDanceRoomInfosMsg, SCDanceRoomInfosMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCDanceRoomInfosMsg");

  private static final org.apache.thrift.protocol.TField DANCE_ROOM_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("danceRoomCount", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField CUR_WAIT_ROOM_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("curWaitRoomCount", org.apache.thrift.protocol.TType.I16, (short)4);
  private static final org.apache.thrift.protocol.TField QUERY_STYLE_FIELD_DESC = new org.apache.thrift.protocol.TField("queryStyle", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField DANCE_ROOM_PAGE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("danceRoomPageInfos", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCDanceRoomInfosMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCDanceRoomInfosMsgTupleSchemeFactory());
  }

  public short danceRoomCount; // required
  /**
   * 
   * @see com.ling9527.music.common.msg.auto.RoomChannel
   */
  public com.ling9527.music.common.msg.auto.RoomChannel channel; // required
  public byte mode; // required
  public short curWaitRoomCount; // required
  /**
   * 0-全部 1-附近
   */
  public byte queryStyle; // required
  /**
   * 竞技房间分页信息
   */
  public com.ling9527.music.common.msg.auto.CommonDataPageInfos danceRoomPageInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DANCE_ROOM_COUNT((short)1, "danceRoomCount"),
    /**
     * 
     * @see com.ling9527.music.common.msg.auto.RoomChannel
     */
    CHANNEL((short)2, "channel"),
    MODE((short)3, "mode"),
    CUR_WAIT_ROOM_COUNT((short)4, "curWaitRoomCount"),
    /**
     * 0-全部 1-附近
     */
    QUERY_STYLE((short)5, "queryStyle"),
    /**
     * 竞技房间分页信息
     */
    DANCE_ROOM_PAGE_INFOS((short)6, "danceRoomPageInfos");

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
        case 1: // DANCE_ROOM_COUNT
          return DANCE_ROOM_COUNT;
        case 2: // CHANNEL
          return CHANNEL;
        case 3: // MODE
          return MODE;
        case 4: // CUR_WAIT_ROOM_COUNT
          return CUR_WAIT_ROOM_COUNT;
        case 5: // QUERY_STYLE
          return QUERY_STYLE;
        case 6: // DANCE_ROOM_PAGE_INFOS
          return DANCE_ROOM_PAGE_INFOS;
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
  private static final int __DANCEROOMCOUNT_ISSET_ID = 0;
  private static final int __MODE_ISSET_ID = 1;
  private static final int __CURWAITROOMCOUNT_ISSET_ID = 2;
  private static final int __QUERYSTYLE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DANCE_ROOM_COUNT, new org.apache.thrift.meta_data.FieldMetaData("danceRoomCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.RoomChannel.class)));
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CUR_WAIT_ROOM_COUNT, new org.apache.thrift.meta_data.FieldMetaData("curWaitRoomCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.QUERY_STYLE, new org.apache.thrift.meta_data.FieldMetaData("queryStyle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.DANCE_ROOM_PAGE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("danceRoomPageInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.CommonDataPageInfos.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCDanceRoomInfosMsg.class, metaDataMap);
  }

  public SCDanceRoomInfosMsg() {
  }

  public SCDanceRoomInfosMsg(
    short danceRoomCount,
    com.ling9527.music.common.msg.auto.RoomChannel channel,
    byte mode,
    short curWaitRoomCount,
    byte queryStyle,
    com.ling9527.music.common.msg.auto.CommonDataPageInfos danceRoomPageInfos)
  {
    this();
    this.danceRoomCount = danceRoomCount;
    setDanceRoomCountIsSet(true);
    this.channel = channel;
    this.mode = mode;
    setModeIsSet(true);
    this.curWaitRoomCount = curWaitRoomCount;
    setCurWaitRoomCountIsSet(true);
    this.queryStyle = queryStyle;
    setQueryStyleIsSet(true);
    this.danceRoomPageInfos = danceRoomPageInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCDanceRoomInfosMsg(SCDanceRoomInfosMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.danceRoomCount = other.danceRoomCount;
    if (other.isSetChannel()) {
      this.channel = other.channel;
    }
    this.mode = other.mode;
    this.curWaitRoomCount = other.curWaitRoomCount;
    this.queryStyle = other.queryStyle;
    if (other.isSetDanceRoomPageInfos()) {
      this.danceRoomPageInfos = new com.ling9527.music.common.msg.auto.CommonDataPageInfos(other.danceRoomPageInfos);
    }
  }

  public SCDanceRoomInfosMsg deepCopy() {
    return new SCDanceRoomInfosMsg(this);
  }

  @Override
  public void clear() {
    setDanceRoomCountIsSet(false);
    this.danceRoomCount = 0;
    this.channel = null;
    setModeIsSet(false);
    this.mode = 0;
    setCurWaitRoomCountIsSet(false);
    this.curWaitRoomCount = 0;
    setQueryStyleIsSet(false);
    this.queryStyle = 0;
    this.danceRoomPageInfos = null;
  }

  public short getDanceRoomCount() {
    return this.danceRoomCount;
  }

  public SCDanceRoomInfosMsg setDanceRoomCount(short danceRoomCount) {
    this.danceRoomCount = danceRoomCount;
    setDanceRoomCountIsSet(true);
    return this;
  }

  public void unsetDanceRoomCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DANCEROOMCOUNT_ISSET_ID);
  }

  /** Returns true if field danceRoomCount is set (has been assigned a value) and false otherwise */
  public boolean isSetDanceRoomCount() {
    return EncodingUtils.testBit(__isset_bitfield, __DANCEROOMCOUNT_ISSET_ID);
  }

  public void setDanceRoomCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DANCEROOMCOUNT_ISSET_ID, value);
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.RoomChannel
   */
  public com.ling9527.music.common.msg.auto.RoomChannel getChannel() {
    return this.channel;
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.RoomChannel
   */
  public SCDanceRoomInfosMsg setChannel(com.ling9527.music.common.msg.auto.RoomChannel channel) {
    this.channel = channel;
    return this;
  }

  public void unsetChannel() {
    this.channel = null;
  }

  /** Returns true if field channel is set (has been assigned a value) and false otherwise */
  public boolean isSetChannel() {
    return this.channel != null;
  }

  public void setChannelIsSet(boolean value) {
    if (!value) {
      this.channel = null;
    }
  }

  public byte getMode() {
    return this.mode;
  }

  public SCDanceRoomInfosMsg setMode(byte mode) {
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

  public short getCurWaitRoomCount() {
    return this.curWaitRoomCount;
  }

  public SCDanceRoomInfosMsg setCurWaitRoomCount(short curWaitRoomCount) {
    this.curWaitRoomCount = curWaitRoomCount;
    setCurWaitRoomCountIsSet(true);
    return this;
  }

  public void unsetCurWaitRoomCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURWAITROOMCOUNT_ISSET_ID);
  }

  /** Returns true if field curWaitRoomCount is set (has been assigned a value) and false otherwise */
  public boolean isSetCurWaitRoomCount() {
    return EncodingUtils.testBit(__isset_bitfield, __CURWAITROOMCOUNT_ISSET_ID);
  }

  public void setCurWaitRoomCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURWAITROOMCOUNT_ISSET_ID, value);
  }

  /**
   * 0-全部 1-附近
   */
  public byte getQueryStyle() {
    return this.queryStyle;
  }

  /**
   * 0-全部 1-附近
   */
  public SCDanceRoomInfosMsg setQueryStyle(byte queryStyle) {
    this.queryStyle = queryStyle;
    setQueryStyleIsSet(true);
    return this;
  }

  public void unsetQueryStyle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUERYSTYLE_ISSET_ID);
  }

  /** Returns true if field queryStyle is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryStyle() {
    return EncodingUtils.testBit(__isset_bitfield, __QUERYSTYLE_ISSET_ID);
  }

  public void setQueryStyleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUERYSTYLE_ISSET_ID, value);
  }

  /**
   * 竞技房间分页信息
   */
  public com.ling9527.music.common.msg.auto.CommonDataPageInfos getDanceRoomPageInfos() {
    return this.danceRoomPageInfos;
  }

  /**
   * 竞技房间分页信息
   */
  public SCDanceRoomInfosMsg setDanceRoomPageInfos(com.ling9527.music.common.msg.auto.CommonDataPageInfos danceRoomPageInfos) {
    this.danceRoomPageInfos = danceRoomPageInfos;
    return this;
  }

  public void unsetDanceRoomPageInfos() {
    this.danceRoomPageInfos = null;
  }

  /** Returns true if field danceRoomPageInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetDanceRoomPageInfos() {
    return this.danceRoomPageInfos != null;
  }

  public void setDanceRoomPageInfosIsSet(boolean value) {
    if (!value) {
      this.danceRoomPageInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DANCE_ROOM_COUNT:
      if (value == null) {
        unsetDanceRoomCount();
      } else {
        setDanceRoomCount((Short)value);
      }
      break;

    case CHANNEL:
      if (value == null) {
        unsetChannel();
      } else {
        setChannel((com.ling9527.music.common.msg.auto.RoomChannel)value);
      }
      break;

    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((Byte)value);
      }
      break;

    case CUR_WAIT_ROOM_COUNT:
      if (value == null) {
        unsetCurWaitRoomCount();
      } else {
        setCurWaitRoomCount((Short)value);
      }
      break;

    case QUERY_STYLE:
      if (value == null) {
        unsetQueryStyle();
      } else {
        setQueryStyle((Byte)value);
      }
      break;

    case DANCE_ROOM_PAGE_INFOS:
      if (value == null) {
        unsetDanceRoomPageInfos();
      } else {
        setDanceRoomPageInfos((com.ling9527.music.common.msg.auto.CommonDataPageInfos)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DANCE_ROOM_COUNT:
      return Short.valueOf(getDanceRoomCount());

    case CHANNEL:
      return getChannel();

    case MODE:
      return Byte.valueOf(getMode());

    case CUR_WAIT_ROOM_COUNT:
      return Short.valueOf(getCurWaitRoomCount());

    case QUERY_STYLE:
      return Byte.valueOf(getQueryStyle());

    case DANCE_ROOM_PAGE_INFOS:
      return getDanceRoomPageInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DANCE_ROOM_COUNT:
      return isSetDanceRoomCount();
    case CHANNEL:
      return isSetChannel();
    case MODE:
      return isSetMode();
    case CUR_WAIT_ROOM_COUNT:
      return isSetCurWaitRoomCount();
    case QUERY_STYLE:
      return isSetQueryStyle();
    case DANCE_ROOM_PAGE_INFOS:
      return isSetDanceRoomPageInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCDanceRoomInfosMsg)
      return this.equals((SCDanceRoomInfosMsg)that);
    return false;
  }

  public boolean equals(SCDanceRoomInfosMsg that) {
    if (that == null)
      return false;

    boolean this_present_danceRoomCount = true;
    boolean that_present_danceRoomCount = true;
    if (this_present_danceRoomCount || that_present_danceRoomCount) {
      if (!(this_present_danceRoomCount && that_present_danceRoomCount))
        return false;
      if (this.danceRoomCount != that.danceRoomCount)
        return false;
    }

    boolean this_present_channel = true && this.isSetChannel();
    boolean that_present_channel = true && that.isSetChannel();
    if (this_present_channel || that_present_channel) {
      if (!(this_present_channel && that_present_channel))
        return false;
      if (!this.channel.equals(that.channel))
        return false;
    }

    boolean this_present_mode = true;
    boolean that_present_mode = true;
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (this.mode != that.mode)
        return false;
    }

    boolean this_present_curWaitRoomCount = true;
    boolean that_present_curWaitRoomCount = true;
    if (this_present_curWaitRoomCount || that_present_curWaitRoomCount) {
      if (!(this_present_curWaitRoomCount && that_present_curWaitRoomCount))
        return false;
      if (this.curWaitRoomCount != that.curWaitRoomCount)
        return false;
    }

    boolean this_present_queryStyle = true;
    boolean that_present_queryStyle = true;
    if (this_present_queryStyle || that_present_queryStyle) {
      if (!(this_present_queryStyle && that_present_queryStyle))
        return false;
      if (this.queryStyle != that.queryStyle)
        return false;
    }

    boolean this_present_danceRoomPageInfos = true && this.isSetDanceRoomPageInfos();
    boolean that_present_danceRoomPageInfos = true && that.isSetDanceRoomPageInfos();
    if (this_present_danceRoomPageInfos || that_present_danceRoomPageInfos) {
      if (!(this_present_danceRoomPageInfos && that_present_danceRoomPageInfos))
        return false;
      if (!this.danceRoomPageInfos.equals(that.danceRoomPageInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCDanceRoomInfosMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCDanceRoomInfosMsg typedOther = (SCDanceRoomInfosMsg)other;

    lastComparison = Boolean.valueOf(isSetDanceRoomCount()).compareTo(typedOther.isSetDanceRoomCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDanceRoomCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.danceRoomCount, typedOther.danceRoomCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChannel()).compareTo(typedOther.isSetChannel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channel, typedOther.channel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetCurWaitRoomCount()).compareTo(typedOther.isSetCurWaitRoomCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurWaitRoomCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.curWaitRoomCount, typedOther.curWaitRoomCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryStyle()).compareTo(typedOther.isSetQueryStyle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryStyle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryStyle, typedOther.queryStyle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDanceRoomPageInfos()).compareTo(typedOther.isSetDanceRoomPageInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDanceRoomPageInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.danceRoomPageInfos, typedOther.danceRoomPageInfos);
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
    StringBuilder sb = new StringBuilder("SCDanceRoomInfosMsg(");
    boolean first = true;

    sb.append("danceRoomCount:");
    sb.append(this.danceRoomCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("channel:");
    if (this.channel == null) {
      sb.append("null");
    } else {
      sb.append(this.channel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mode:");
    sb.append(this.mode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("curWaitRoomCount:");
    sb.append(this.curWaitRoomCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryStyle:");
    sb.append(this.queryStyle);
    first = false;
    if (!first) sb.append(", ");
    sb.append("danceRoomPageInfos:");
    if (this.danceRoomPageInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.danceRoomPageInfos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (danceRoomPageInfos != null) {
      danceRoomPageInfos.validate();
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

  private static class SCDanceRoomInfosMsgStandardSchemeFactory implements SchemeFactory {
    public SCDanceRoomInfosMsgStandardScheme getScheme() {
      return new SCDanceRoomInfosMsgStandardScheme();
    }
  }

  private static class SCDanceRoomInfosMsgStandardScheme extends StandardScheme<SCDanceRoomInfosMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCDanceRoomInfosMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DANCE_ROOM_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.danceRoomCount = iprot.readI16();
              struct.setDanceRoomCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHANNEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.channel = com.ling9527.music.common.msg.auto.RoomChannel.findByValue(iprot.readI32());
              struct.setChannelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.mode = iprot.readByte();
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CUR_WAIT_ROOM_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.curWaitRoomCount = iprot.readI16();
              struct.setCurWaitRoomCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // QUERY_STYLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.queryStyle = iprot.readByte();
              struct.setQueryStyleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DANCE_ROOM_PAGE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.danceRoomPageInfos = new com.ling9527.music.common.msg.auto.CommonDataPageInfos();
              struct.danceRoomPageInfos.read(iprot);
              struct.setDanceRoomPageInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCDanceRoomInfosMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DANCE_ROOM_COUNT_FIELD_DESC);
      oprot.writeI16(struct.danceRoomCount);
      oprot.writeFieldEnd();
      if (struct.channel != null) {
        oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
        oprot.writeI32(struct.channel.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MODE_FIELD_DESC);
      oprot.writeByte(struct.mode);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CUR_WAIT_ROOM_COUNT_FIELD_DESC);
      oprot.writeI16(struct.curWaitRoomCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUERY_STYLE_FIELD_DESC);
      oprot.writeByte(struct.queryStyle);
      oprot.writeFieldEnd();
      if (struct.danceRoomPageInfos != null) {
        oprot.writeFieldBegin(DANCE_ROOM_PAGE_INFOS_FIELD_DESC);
        struct.danceRoomPageInfos.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCDanceRoomInfosMsgTupleSchemeFactory implements SchemeFactory {
    public SCDanceRoomInfosMsgTupleScheme getScheme() {
      return new SCDanceRoomInfosMsgTupleScheme();
    }
  }

  private static class SCDanceRoomInfosMsgTupleScheme extends TupleScheme<SCDanceRoomInfosMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCDanceRoomInfosMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDanceRoomCount()) {
        optionals.set(0);
      }
      if (struct.isSetChannel()) {
        optionals.set(1);
      }
      if (struct.isSetMode()) {
        optionals.set(2);
      }
      if (struct.isSetCurWaitRoomCount()) {
        optionals.set(3);
      }
      if (struct.isSetQueryStyle()) {
        optionals.set(4);
      }
      if (struct.isSetDanceRoomPageInfos()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetDanceRoomCount()) {
        oprot.writeI16(struct.danceRoomCount);
      }
      if (struct.isSetChannel()) {
        oprot.writeI32(struct.channel.getValue());
      }
      if (struct.isSetMode()) {
        oprot.writeByte(struct.mode);
      }
      if (struct.isSetCurWaitRoomCount()) {
        oprot.writeI16(struct.curWaitRoomCount);
      }
      if (struct.isSetQueryStyle()) {
        oprot.writeByte(struct.queryStyle);
      }
      if (struct.isSetDanceRoomPageInfos()) {
        struct.danceRoomPageInfos.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCDanceRoomInfosMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.danceRoomCount = iprot.readI16();
        struct.setDanceRoomCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.channel = com.ling9527.music.common.msg.auto.RoomChannel.findByValue(iprot.readI32());
        struct.setChannelIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mode = iprot.readByte();
        struct.setModeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.curWaitRoomCount = iprot.readI16();
        struct.setCurWaitRoomCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.queryStyle = iprot.readByte();
        struct.setQueryStyleIsSet(true);
      }
      if (incoming.get(5)) {
        struct.danceRoomPageInfos = new com.ling9527.music.common.msg.auto.CommonDataPageInfos();
        struct.danceRoomPageInfos.read(iprot);
        struct.setDanceRoomPageInfosIsSet(true);
      }
    }
  }

}

