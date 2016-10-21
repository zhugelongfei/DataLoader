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
 * 即兴表演信息
 */
public class SCImproviseInfoMsg implements org.apache.thrift.TBase<SCImproviseInfoMsg, SCImproviseInfoMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCImproviseInfoMsg");

  private static final org.apache.thrift.protocol.TField DAILY_LEFT_PLAY_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("dailyLeftPlayCount", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField RAND_TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("randTaskId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FINISH_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("finishStatus", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField PERF_PRIZE_COUPON_FIELD_DESC = new org.apache.thrift.protocol.TField("perfPrizeCoupon", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STAR_LIGHT_LVL_PRIZE_COUPON_FIELD_DESC = new org.apache.thrift.protocol.TField("starLightLvlPrizeCoupon", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField PERF_COUPON_FIELD_DESC = new org.apache.thrift.protocol.TField("perfCoupon", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCImproviseInfoMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCImproviseInfoMsgTupleSchemeFactory());
  }

  /**
   * 进入剩余完成次数
   */
  public short dailyLeftPlayCount; // required
  /**
   * 随机任务id, 为0表示还未领取
   */
  public int randTaskId; // required
  /**
   * 完成状态0-未完成 1-已完成
   */
  public byte finishStatus; // required
  /**
   * 演出奖励
   */
  public int perfPrizeCoupon; // required
  /**
   * 星光等级奖励
   */
  public int starLightLvlPrizeCoupon; // required
  /**
   * 当前演出券
   */
  public int perfCoupon; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 进入剩余完成次数
     */
    DAILY_LEFT_PLAY_COUNT((short)1, "dailyLeftPlayCount"),
    /**
     * 随机任务id, 为0表示还未领取
     */
    RAND_TASK_ID((short)2, "randTaskId"),
    /**
     * 完成状态0-未完成 1-已完成
     */
    FINISH_STATUS((short)3, "finishStatus"),
    /**
     * 演出奖励
     */
    PERF_PRIZE_COUPON((short)4, "perfPrizeCoupon"),
    /**
     * 星光等级奖励
     */
    STAR_LIGHT_LVL_PRIZE_COUPON((short)5, "starLightLvlPrizeCoupon"),
    /**
     * 当前演出券
     */
    PERF_COUPON((short)6, "perfCoupon");

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
        case 1: // DAILY_LEFT_PLAY_COUNT
          return DAILY_LEFT_PLAY_COUNT;
        case 2: // RAND_TASK_ID
          return RAND_TASK_ID;
        case 3: // FINISH_STATUS
          return FINISH_STATUS;
        case 4: // PERF_PRIZE_COUPON
          return PERF_PRIZE_COUPON;
        case 5: // STAR_LIGHT_LVL_PRIZE_COUPON
          return STAR_LIGHT_LVL_PRIZE_COUPON;
        case 6: // PERF_COUPON
          return PERF_COUPON;
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
  private static final int __DAILYLEFTPLAYCOUNT_ISSET_ID = 0;
  private static final int __RANDTASKID_ISSET_ID = 1;
  private static final int __FINISHSTATUS_ISSET_ID = 2;
  private static final int __PERFPRIZECOUPON_ISSET_ID = 3;
  private static final int __STARLIGHTLVLPRIZECOUPON_ISSET_ID = 4;
  private static final int __PERFCOUPON_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DAILY_LEFT_PLAY_COUNT, new org.apache.thrift.meta_data.FieldMetaData("dailyLeftPlayCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.RAND_TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("randTaskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FINISH_STATUS, new org.apache.thrift.meta_data.FieldMetaData("finishStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PERF_PRIZE_COUPON, new org.apache.thrift.meta_data.FieldMetaData("perfPrizeCoupon", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAR_LIGHT_LVL_PRIZE_COUPON, new org.apache.thrift.meta_data.FieldMetaData("starLightLvlPrizeCoupon", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PERF_COUPON, new org.apache.thrift.meta_data.FieldMetaData("perfCoupon", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCImproviseInfoMsg.class, metaDataMap);
  }

  public SCImproviseInfoMsg() {
  }

  public SCImproviseInfoMsg(
    short dailyLeftPlayCount,
    int randTaskId,
    byte finishStatus,
    int perfPrizeCoupon,
    int starLightLvlPrizeCoupon,
    int perfCoupon)
  {
    this();
    this.dailyLeftPlayCount = dailyLeftPlayCount;
    setDailyLeftPlayCountIsSet(true);
    this.randTaskId = randTaskId;
    setRandTaskIdIsSet(true);
    this.finishStatus = finishStatus;
    setFinishStatusIsSet(true);
    this.perfPrizeCoupon = perfPrizeCoupon;
    setPerfPrizeCouponIsSet(true);
    this.starLightLvlPrizeCoupon = starLightLvlPrizeCoupon;
    setStarLightLvlPrizeCouponIsSet(true);
    this.perfCoupon = perfCoupon;
    setPerfCouponIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCImproviseInfoMsg(SCImproviseInfoMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.dailyLeftPlayCount = other.dailyLeftPlayCount;
    this.randTaskId = other.randTaskId;
    this.finishStatus = other.finishStatus;
    this.perfPrizeCoupon = other.perfPrizeCoupon;
    this.starLightLvlPrizeCoupon = other.starLightLvlPrizeCoupon;
    this.perfCoupon = other.perfCoupon;
  }

  public SCImproviseInfoMsg deepCopy() {
    return new SCImproviseInfoMsg(this);
  }

  @Override
  public void clear() {
    setDailyLeftPlayCountIsSet(false);
    this.dailyLeftPlayCount = 0;
    setRandTaskIdIsSet(false);
    this.randTaskId = 0;
    setFinishStatusIsSet(false);
    this.finishStatus = 0;
    setPerfPrizeCouponIsSet(false);
    this.perfPrizeCoupon = 0;
    setStarLightLvlPrizeCouponIsSet(false);
    this.starLightLvlPrizeCoupon = 0;
    setPerfCouponIsSet(false);
    this.perfCoupon = 0;
  }

  /**
   * 进入剩余完成次数
   */
  public short getDailyLeftPlayCount() {
    return this.dailyLeftPlayCount;
  }

  /**
   * 进入剩余完成次数
   */
  public SCImproviseInfoMsg setDailyLeftPlayCount(short dailyLeftPlayCount) {
    this.dailyLeftPlayCount = dailyLeftPlayCount;
    setDailyLeftPlayCountIsSet(true);
    return this;
  }

  public void unsetDailyLeftPlayCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DAILYLEFTPLAYCOUNT_ISSET_ID);
  }

  /** Returns true if field dailyLeftPlayCount is set (has been assigned a value) and false otherwise */
  public boolean isSetDailyLeftPlayCount() {
    return EncodingUtils.testBit(__isset_bitfield, __DAILYLEFTPLAYCOUNT_ISSET_ID);
  }

  public void setDailyLeftPlayCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DAILYLEFTPLAYCOUNT_ISSET_ID, value);
  }

  /**
   * 随机任务id, 为0表示还未领取
   */
  public int getRandTaskId() {
    return this.randTaskId;
  }

  /**
   * 随机任务id, 为0表示还未领取
   */
  public SCImproviseInfoMsg setRandTaskId(int randTaskId) {
    this.randTaskId = randTaskId;
    setRandTaskIdIsSet(true);
    return this;
  }

  public void unsetRandTaskId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RANDTASKID_ISSET_ID);
  }

  /** Returns true if field randTaskId is set (has been assigned a value) and false otherwise */
  public boolean isSetRandTaskId() {
    return EncodingUtils.testBit(__isset_bitfield, __RANDTASKID_ISSET_ID);
  }

  public void setRandTaskIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RANDTASKID_ISSET_ID, value);
  }

  /**
   * 完成状态0-未完成 1-已完成
   */
  public byte getFinishStatus() {
    return this.finishStatus;
  }

  /**
   * 完成状态0-未完成 1-已完成
   */
  public SCImproviseInfoMsg setFinishStatus(byte finishStatus) {
    this.finishStatus = finishStatus;
    setFinishStatusIsSet(true);
    return this;
  }

  public void unsetFinishStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FINISHSTATUS_ISSET_ID);
  }

  /** Returns true if field finishStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetFinishStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __FINISHSTATUS_ISSET_ID);
  }

  public void setFinishStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FINISHSTATUS_ISSET_ID, value);
  }

  /**
   * 演出奖励
   */
  public int getPerfPrizeCoupon() {
    return this.perfPrizeCoupon;
  }

  /**
   * 演出奖励
   */
  public SCImproviseInfoMsg setPerfPrizeCoupon(int perfPrizeCoupon) {
    this.perfPrizeCoupon = perfPrizeCoupon;
    setPerfPrizeCouponIsSet(true);
    return this;
  }

  public void unsetPerfPrizeCoupon() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERFPRIZECOUPON_ISSET_ID);
  }

  /** Returns true if field perfPrizeCoupon is set (has been assigned a value) and false otherwise */
  public boolean isSetPerfPrizeCoupon() {
    return EncodingUtils.testBit(__isset_bitfield, __PERFPRIZECOUPON_ISSET_ID);
  }

  public void setPerfPrizeCouponIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERFPRIZECOUPON_ISSET_ID, value);
  }

  /**
   * 星光等级奖励
   */
  public int getStarLightLvlPrizeCoupon() {
    return this.starLightLvlPrizeCoupon;
  }

  /**
   * 星光等级奖励
   */
  public SCImproviseInfoMsg setStarLightLvlPrizeCoupon(int starLightLvlPrizeCoupon) {
    this.starLightLvlPrizeCoupon = starLightLvlPrizeCoupon;
    setStarLightLvlPrizeCouponIsSet(true);
    return this;
  }

  public void unsetStarLightLvlPrizeCoupon() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARLIGHTLVLPRIZECOUPON_ISSET_ID);
  }

  /** Returns true if field starLightLvlPrizeCoupon is set (has been assigned a value) and false otherwise */
  public boolean isSetStarLightLvlPrizeCoupon() {
    return EncodingUtils.testBit(__isset_bitfield, __STARLIGHTLVLPRIZECOUPON_ISSET_ID);
  }

  public void setStarLightLvlPrizeCouponIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARLIGHTLVLPRIZECOUPON_ISSET_ID, value);
  }

  /**
   * 当前演出券
   */
  public int getPerfCoupon() {
    return this.perfCoupon;
  }

  /**
   * 当前演出券
   */
  public SCImproviseInfoMsg setPerfCoupon(int perfCoupon) {
    this.perfCoupon = perfCoupon;
    setPerfCouponIsSet(true);
    return this;
  }

  public void unsetPerfCoupon() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERFCOUPON_ISSET_ID);
  }

  /** Returns true if field perfCoupon is set (has been assigned a value) and false otherwise */
  public boolean isSetPerfCoupon() {
    return EncodingUtils.testBit(__isset_bitfield, __PERFCOUPON_ISSET_ID);
  }

  public void setPerfCouponIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERFCOUPON_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DAILY_LEFT_PLAY_COUNT:
      if (value == null) {
        unsetDailyLeftPlayCount();
      } else {
        setDailyLeftPlayCount((Short)value);
      }
      break;

    case RAND_TASK_ID:
      if (value == null) {
        unsetRandTaskId();
      } else {
        setRandTaskId((Integer)value);
      }
      break;

    case FINISH_STATUS:
      if (value == null) {
        unsetFinishStatus();
      } else {
        setFinishStatus((Byte)value);
      }
      break;

    case PERF_PRIZE_COUPON:
      if (value == null) {
        unsetPerfPrizeCoupon();
      } else {
        setPerfPrizeCoupon((Integer)value);
      }
      break;

    case STAR_LIGHT_LVL_PRIZE_COUPON:
      if (value == null) {
        unsetStarLightLvlPrizeCoupon();
      } else {
        setStarLightLvlPrizeCoupon((Integer)value);
      }
      break;

    case PERF_COUPON:
      if (value == null) {
        unsetPerfCoupon();
      } else {
        setPerfCoupon((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DAILY_LEFT_PLAY_COUNT:
      return Short.valueOf(getDailyLeftPlayCount());

    case RAND_TASK_ID:
      return Integer.valueOf(getRandTaskId());

    case FINISH_STATUS:
      return Byte.valueOf(getFinishStatus());

    case PERF_PRIZE_COUPON:
      return Integer.valueOf(getPerfPrizeCoupon());

    case STAR_LIGHT_LVL_PRIZE_COUPON:
      return Integer.valueOf(getStarLightLvlPrizeCoupon());

    case PERF_COUPON:
      return Integer.valueOf(getPerfCoupon());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DAILY_LEFT_PLAY_COUNT:
      return isSetDailyLeftPlayCount();
    case RAND_TASK_ID:
      return isSetRandTaskId();
    case FINISH_STATUS:
      return isSetFinishStatus();
    case PERF_PRIZE_COUPON:
      return isSetPerfPrizeCoupon();
    case STAR_LIGHT_LVL_PRIZE_COUPON:
      return isSetStarLightLvlPrizeCoupon();
    case PERF_COUPON:
      return isSetPerfCoupon();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCImproviseInfoMsg)
      return this.equals((SCImproviseInfoMsg)that);
    return false;
  }

  public boolean equals(SCImproviseInfoMsg that) {
    if (that == null)
      return false;

    boolean this_present_dailyLeftPlayCount = true;
    boolean that_present_dailyLeftPlayCount = true;
    if (this_present_dailyLeftPlayCount || that_present_dailyLeftPlayCount) {
      if (!(this_present_dailyLeftPlayCount && that_present_dailyLeftPlayCount))
        return false;
      if (this.dailyLeftPlayCount != that.dailyLeftPlayCount)
        return false;
    }

    boolean this_present_randTaskId = true;
    boolean that_present_randTaskId = true;
    if (this_present_randTaskId || that_present_randTaskId) {
      if (!(this_present_randTaskId && that_present_randTaskId))
        return false;
      if (this.randTaskId != that.randTaskId)
        return false;
    }

    boolean this_present_finishStatus = true;
    boolean that_present_finishStatus = true;
    if (this_present_finishStatus || that_present_finishStatus) {
      if (!(this_present_finishStatus && that_present_finishStatus))
        return false;
      if (this.finishStatus != that.finishStatus)
        return false;
    }

    boolean this_present_perfPrizeCoupon = true;
    boolean that_present_perfPrizeCoupon = true;
    if (this_present_perfPrizeCoupon || that_present_perfPrizeCoupon) {
      if (!(this_present_perfPrizeCoupon && that_present_perfPrizeCoupon))
        return false;
      if (this.perfPrizeCoupon != that.perfPrizeCoupon)
        return false;
    }

    boolean this_present_starLightLvlPrizeCoupon = true;
    boolean that_present_starLightLvlPrizeCoupon = true;
    if (this_present_starLightLvlPrizeCoupon || that_present_starLightLvlPrizeCoupon) {
      if (!(this_present_starLightLvlPrizeCoupon && that_present_starLightLvlPrizeCoupon))
        return false;
      if (this.starLightLvlPrizeCoupon != that.starLightLvlPrizeCoupon)
        return false;
    }

    boolean this_present_perfCoupon = true;
    boolean that_present_perfCoupon = true;
    if (this_present_perfCoupon || that_present_perfCoupon) {
      if (!(this_present_perfCoupon && that_present_perfCoupon))
        return false;
      if (this.perfCoupon != that.perfCoupon)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCImproviseInfoMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCImproviseInfoMsg typedOther = (SCImproviseInfoMsg)other;

    lastComparison = Boolean.valueOf(isSetDailyLeftPlayCount()).compareTo(typedOther.isSetDailyLeftPlayCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDailyLeftPlayCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dailyLeftPlayCount, typedOther.dailyLeftPlayCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRandTaskId()).compareTo(typedOther.isSetRandTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRandTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.randTaskId, typedOther.randTaskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFinishStatus()).compareTo(typedOther.isSetFinishStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFinishStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.finishStatus, typedOther.finishStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPerfPrizeCoupon()).compareTo(typedOther.isSetPerfPrizeCoupon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPerfPrizeCoupon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.perfPrizeCoupon, typedOther.perfPrizeCoupon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStarLightLvlPrizeCoupon()).compareTo(typedOther.isSetStarLightLvlPrizeCoupon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarLightLvlPrizeCoupon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.starLightLvlPrizeCoupon, typedOther.starLightLvlPrizeCoupon);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPerfCoupon()).compareTo(typedOther.isSetPerfCoupon());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPerfCoupon()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.perfCoupon, typedOther.perfCoupon);
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
    StringBuilder sb = new StringBuilder("SCImproviseInfoMsg(");
    boolean first = true;

    sb.append("dailyLeftPlayCount:");
    sb.append(this.dailyLeftPlayCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("randTaskId:");
    sb.append(this.randTaskId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("finishStatus:");
    sb.append(this.finishStatus);
    first = false;
    if (!first) sb.append(", ");
    sb.append("perfPrizeCoupon:");
    sb.append(this.perfPrizeCoupon);
    first = false;
    if (!first) sb.append(", ");
    sb.append("starLightLvlPrizeCoupon:");
    sb.append(this.starLightLvlPrizeCoupon);
    first = false;
    if (!first) sb.append(", ");
    sb.append("perfCoupon:");
    sb.append(this.perfCoupon);
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

  private static class SCImproviseInfoMsgStandardSchemeFactory implements SchemeFactory {
    public SCImproviseInfoMsgStandardScheme getScheme() {
      return new SCImproviseInfoMsgStandardScheme();
    }
  }

  private static class SCImproviseInfoMsgStandardScheme extends StandardScheme<SCImproviseInfoMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCImproviseInfoMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DAILY_LEFT_PLAY_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.dailyLeftPlayCount = iprot.readI16();
              struct.setDailyLeftPlayCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RAND_TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.randTaskId = iprot.readI32();
              struct.setRandTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FINISH_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.finishStatus = iprot.readByte();
              struct.setFinishStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PERF_PRIZE_COUPON
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.perfPrizeCoupon = iprot.readI32();
              struct.setPerfPrizeCouponIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STAR_LIGHT_LVL_PRIZE_COUPON
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.starLightLvlPrizeCoupon = iprot.readI32();
              struct.setStarLightLvlPrizeCouponIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PERF_COUPON
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.perfCoupon = iprot.readI32();
              struct.setPerfCouponIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCImproviseInfoMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DAILY_LEFT_PLAY_COUNT_FIELD_DESC);
      oprot.writeI16(struct.dailyLeftPlayCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RAND_TASK_ID_FIELD_DESC);
      oprot.writeI32(struct.randTaskId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FINISH_STATUS_FIELD_DESC);
      oprot.writeByte(struct.finishStatus);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PERF_PRIZE_COUPON_FIELD_DESC);
      oprot.writeI32(struct.perfPrizeCoupon);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STAR_LIGHT_LVL_PRIZE_COUPON_FIELD_DESC);
      oprot.writeI32(struct.starLightLvlPrizeCoupon);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PERF_COUPON_FIELD_DESC);
      oprot.writeI32(struct.perfCoupon);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCImproviseInfoMsgTupleSchemeFactory implements SchemeFactory {
    public SCImproviseInfoMsgTupleScheme getScheme() {
      return new SCImproviseInfoMsgTupleScheme();
    }
  }

  private static class SCImproviseInfoMsgTupleScheme extends TupleScheme<SCImproviseInfoMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCImproviseInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDailyLeftPlayCount()) {
        optionals.set(0);
      }
      if (struct.isSetRandTaskId()) {
        optionals.set(1);
      }
      if (struct.isSetFinishStatus()) {
        optionals.set(2);
      }
      if (struct.isSetPerfPrizeCoupon()) {
        optionals.set(3);
      }
      if (struct.isSetStarLightLvlPrizeCoupon()) {
        optionals.set(4);
      }
      if (struct.isSetPerfCoupon()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetDailyLeftPlayCount()) {
        oprot.writeI16(struct.dailyLeftPlayCount);
      }
      if (struct.isSetRandTaskId()) {
        oprot.writeI32(struct.randTaskId);
      }
      if (struct.isSetFinishStatus()) {
        oprot.writeByte(struct.finishStatus);
      }
      if (struct.isSetPerfPrizeCoupon()) {
        oprot.writeI32(struct.perfPrizeCoupon);
      }
      if (struct.isSetStarLightLvlPrizeCoupon()) {
        oprot.writeI32(struct.starLightLvlPrizeCoupon);
      }
      if (struct.isSetPerfCoupon()) {
        oprot.writeI32(struct.perfCoupon);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCImproviseInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.dailyLeftPlayCount = iprot.readI16();
        struct.setDailyLeftPlayCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.randTaskId = iprot.readI32();
        struct.setRandTaskIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.finishStatus = iprot.readByte();
        struct.setFinishStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.perfPrizeCoupon = iprot.readI32();
        struct.setPerfPrizeCouponIsSet(true);
      }
      if (incoming.get(4)) {
        struct.starLightLvlPrizeCoupon = iprot.readI32();
        struct.setStarLightLvlPrizeCouponIsSet(true);
      }
      if (incoming.get(5)) {
        struct.perfCoupon = iprot.readI32();
        struct.setPerfCouponIsSet(true);
      }
    }
  }

}
