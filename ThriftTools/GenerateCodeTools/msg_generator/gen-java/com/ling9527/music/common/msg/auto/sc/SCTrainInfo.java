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
 * 训练信息
 */
public class SCTrainInfo implements org.apache.thrift.TBase<SCTrainInfo, SCTrainInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCTrainInfo");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STAR_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("starLvl", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField TODAY_LEFT_TRAIN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("todayLeftTrainCount", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField TODAY_BUY_TRAIN_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("todayBuyTrainCount", org.apache.thrift.protocol.TType.I16, (short)4);
  private static final org.apache.thrift.protocol.TField OCCUPTION_DATAS_FIELD_DESC = new org.apache.thrift.protocol.TField("occuptionDatas", org.apache.thrift.protocol.TType.MAP, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCTrainInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCTrainInfoTupleSchemeFactory());
  }

  /**
   * 更新客户端版本号
   */
  public int version; // required
  /**
   * 当前星光等级
   */
  public short starLvl; // required
  /**
   * 今天剩余训练次数
   */
  public short todayLeftTrainCount; // required
  /**
   * 今天购买训练次数
   */
  public short todayBuyTrainCount; // required
  /**
   * 各职业ETrainOccupation等级经验数据
   */
  public Map<Byte,TrainOccupationData> occuptionDatas; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 更新客户端版本号
     */
    VERSION((short)1, "version"),
    /**
     * 当前星光等级
     */
    STAR_LVL((short)2, "starLvl"),
    /**
     * 今天剩余训练次数
     */
    TODAY_LEFT_TRAIN_COUNT((short)3, "todayLeftTrainCount"),
    /**
     * 今天购买训练次数
     */
    TODAY_BUY_TRAIN_COUNT((short)4, "todayBuyTrainCount"),
    /**
     * 各职业ETrainOccupation等级经验数据
     */
    OCCUPTION_DATAS((short)5, "occuptionDatas");

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
        case 1: // VERSION
          return VERSION;
        case 2: // STAR_LVL
          return STAR_LVL;
        case 3: // TODAY_LEFT_TRAIN_COUNT
          return TODAY_LEFT_TRAIN_COUNT;
        case 4: // TODAY_BUY_TRAIN_COUNT
          return TODAY_BUY_TRAIN_COUNT;
        case 5: // OCCUPTION_DATAS
          return OCCUPTION_DATAS;
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
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __STARLVL_ISSET_ID = 1;
  private static final int __TODAYLEFTTRAINCOUNT_ISSET_ID = 2;
  private static final int __TODAYBUYTRAINCOUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STAR_LVL, new org.apache.thrift.meta_data.FieldMetaData("starLvl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.TODAY_LEFT_TRAIN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("todayLeftTrainCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.TODAY_BUY_TRAIN_COUNT, new org.apache.thrift.meta_data.FieldMetaData("todayBuyTrainCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.OCCUPTION_DATAS, new org.apache.thrift.meta_data.FieldMetaData("occuptionDatas", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TrainOccupationData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCTrainInfo.class, metaDataMap);
  }

  public SCTrainInfo() {
  }

  public SCTrainInfo(
    int version,
    short starLvl,
    short todayLeftTrainCount,
    short todayBuyTrainCount,
    Map<Byte,TrainOccupationData> occuptionDatas)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.starLvl = starLvl;
    setStarLvlIsSet(true);
    this.todayLeftTrainCount = todayLeftTrainCount;
    setTodayLeftTrainCountIsSet(true);
    this.todayBuyTrainCount = todayBuyTrainCount;
    setTodayBuyTrainCountIsSet(true);
    this.occuptionDatas = occuptionDatas;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCTrainInfo(SCTrainInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    this.starLvl = other.starLvl;
    this.todayLeftTrainCount = other.todayLeftTrainCount;
    this.todayBuyTrainCount = other.todayBuyTrainCount;
    if (other.isSetOccuptionDatas()) {
      Map<Byte,TrainOccupationData> __this__occuptionDatas = new HashMap<Byte,TrainOccupationData>();
      for (Map.Entry<Byte, TrainOccupationData> other_element : other.occuptionDatas.entrySet()) {

        Byte other_element_key = other_element.getKey();
        TrainOccupationData other_element_value = other_element.getValue();

        Byte __this__occuptionDatas_copy_key = other_element_key;

        TrainOccupationData __this__occuptionDatas_copy_value = new TrainOccupationData(other_element_value);

        __this__occuptionDatas.put(__this__occuptionDatas_copy_key, __this__occuptionDatas_copy_value);
      }
      this.occuptionDatas = __this__occuptionDatas;
    }
  }

  public SCTrainInfo deepCopy() {
    return new SCTrainInfo(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    setStarLvlIsSet(false);
    this.starLvl = 0;
    setTodayLeftTrainCountIsSet(false);
    this.todayLeftTrainCount = 0;
    setTodayBuyTrainCountIsSet(false);
    this.todayBuyTrainCount = 0;
    this.occuptionDatas = null;
  }

  /**
   * 更新客户端版本号
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * 更新客户端版本号
   */
  public SCTrainInfo setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  /**
   * 当前星光等级
   */
  public short getStarLvl() {
    return this.starLvl;
  }

  /**
   * 当前星光等级
   */
  public SCTrainInfo setStarLvl(short starLvl) {
    this.starLvl = starLvl;
    setStarLvlIsSet(true);
    return this;
  }

  public void unsetStarLvl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARLVL_ISSET_ID);
  }

  /** Returns true if field starLvl is set (has been assigned a value) and false otherwise */
  public boolean isSetStarLvl() {
    return EncodingUtils.testBit(__isset_bitfield, __STARLVL_ISSET_ID);
  }

  public void setStarLvlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARLVL_ISSET_ID, value);
  }

  /**
   * 今天剩余训练次数
   */
  public short getTodayLeftTrainCount() {
    return this.todayLeftTrainCount;
  }

  /**
   * 今天剩余训练次数
   */
  public SCTrainInfo setTodayLeftTrainCount(short todayLeftTrainCount) {
    this.todayLeftTrainCount = todayLeftTrainCount;
    setTodayLeftTrainCountIsSet(true);
    return this;
  }

  public void unsetTodayLeftTrainCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TODAYLEFTTRAINCOUNT_ISSET_ID);
  }

  /** Returns true if field todayLeftTrainCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTodayLeftTrainCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TODAYLEFTTRAINCOUNT_ISSET_ID);
  }

  public void setTodayLeftTrainCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TODAYLEFTTRAINCOUNT_ISSET_ID, value);
  }

  /**
   * 今天购买训练次数
   */
  public short getTodayBuyTrainCount() {
    return this.todayBuyTrainCount;
  }

  /**
   * 今天购买训练次数
   */
  public SCTrainInfo setTodayBuyTrainCount(short todayBuyTrainCount) {
    this.todayBuyTrainCount = todayBuyTrainCount;
    setTodayBuyTrainCountIsSet(true);
    return this;
  }

  public void unsetTodayBuyTrainCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TODAYBUYTRAINCOUNT_ISSET_ID);
  }

  /** Returns true if field todayBuyTrainCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTodayBuyTrainCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TODAYBUYTRAINCOUNT_ISSET_ID);
  }

  public void setTodayBuyTrainCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TODAYBUYTRAINCOUNT_ISSET_ID, value);
  }

  public int getOccuptionDatasSize() {
    return (this.occuptionDatas == null) ? 0 : this.occuptionDatas.size();
  }

  public void putToOccuptionDatas(byte key, TrainOccupationData val) {
    if (this.occuptionDatas == null) {
      this.occuptionDatas = new HashMap<Byte,TrainOccupationData>();
    }
    this.occuptionDatas.put(key, val);
  }

  /**
   * 各职业ETrainOccupation等级经验数据
   */
  public Map<Byte,TrainOccupationData> getOccuptionDatas() {
    return this.occuptionDatas;
  }

  /**
   * 各职业ETrainOccupation等级经验数据
   */
  public SCTrainInfo setOccuptionDatas(Map<Byte,TrainOccupationData> occuptionDatas) {
    this.occuptionDatas = occuptionDatas;
    return this;
  }

  public void unsetOccuptionDatas() {
    this.occuptionDatas = null;
  }

  /** Returns true if field occuptionDatas is set (has been assigned a value) and false otherwise */
  public boolean isSetOccuptionDatas() {
    return this.occuptionDatas != null;
  }

  public void setOccuptionDatasIsSet(boolean value) {
    if (!value) {
      this.occuptionDatas = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case STAR_LVL:
      if (value == null) {
        unsetStarLvl();
      } else {
        setStarLvl((Short)value);
      }
      break;

    case TODAY_LEFT_TRAIN_COUNT:
      if (value == null) {
        unsetTodayLeftTrainCount();
      } else {
        setTodayLeftTrainCount((Short)value);
      }
      break;

    case TODAY_BUY_TRAIN_COUNT:
      if (value == null) {
        unsetTodayBuyTrainCount();
      } else {
        setTodayBuyTrainCount((Short)value);
      }
      break;

    case OCCUPTION_DATAS:
      if (value == null) {
        unsetOccuptionDatas();
      } else {
        setOccuptionDatas((Map<Byte,TrainOccupationData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Integer.valueOf(getVersion());

    case STAR_LVL:
      return Short.valueOf(getStarLvl());

    case TODAY_LEFT_TRAIN_COUNT:
      return Short.valueOf(getTodayLeftTrainCount());

    case TODAY_BUY_TRAIN_COUNT:
      return Short.valueOf(getTodayBuyTrainCount());

    case OCCUPTION_DATAS:
      return getOccuptionDatas();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case STAR_LVL:
      return isSetStarLvl();
    case TODAY_LEFT_TRAIN_COUNT:
      return isSetTodayLeftTrainCount();
    case TODAY_BUY_TRAIN_COUNT:
      return isSetTodayBuyTrainCount();
    case OCCUPTION_DATAS:
      return isSetOccuptionDatas();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCTrainInfo)
      return this.equals((SCTrainInfo)that);
    return false;
  }

  public boolean equals(SCTrainInfo that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_starLvl = true;
    boolean that_present_starLvl = true;
    if (this_present_starLvl || that_present_starLvl) {
      if (!(this_present_starLvl && that_present_starLvl))
        return false;
      if (this.starLvl != that.starLvl)
        return false;
    }

    boolean this_present_todayLeftTrainCount = true;
    boolean that_present_todayLeftTrainCount = true;
    if (this_present_todayLeftTrainCount || that_present_todayLeftTrainCount) {
      if (!(this_present_todayLeftTrainCount && that_present_todayLeftTrainCount))
        return false;
      if (this.todayLeftTrainCount != that.todayLeftTrainCount)
        return false;
    }

    boolean this_present_todayBuyTrainCount = true;
    boolean that_present_todayBuyTrainCount = true;
    if (this_present_todayBuyTrainCount || that_present_todayBuyTrainCount) {
      if (!(this_present_todayBuyTrainCount && that_present_todayBuyTrainCount))
        return false;
      if (this.todayBuyTrainCount != that.todayBuyTrainCount)
        return false;
    }

    boolean this_present_occuptionDatas = true && this.isSetOccuptionDatas();
    boolean that_present_occuptionDatas = true && that.isSetOccuptionDatas();
    if (this_present_occuptionDatas || that_present_occuptionDatas) {
      if (!(this_present_occuptionDatas && that_present_occuptionDatas))
        return false;
      if (!this.occuptionDatas.equals(that.occuptionDatas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCTrainInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCTrainInfo typedOther = (SCTrainInfo)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStarLvl()).compareTo(typedOther.isSetStarLvl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStarLvl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.starLvl, typedOther.starLvl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTodayLeftTrainCount()).compareTo(typedOther.isSetTodayLeftTrainCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTodayLeftTrainCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.todayLeftTrainCount, typedOther.todayLeftTrainCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTodayBuyTrainCount()).compareTo(typedOther.isSetTodayBuyTrainCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTodayBuyTrainCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.todayBuyTrainCount, typedOther.todayBuyTrainCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOccuptionDatas()).compareTo(typedOther.isSetOccuptionDatas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOccuptionDatas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.occuptionDatas, typedOther.occuptionDatas);
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
    StringBuilder sb = new StringBuilder("SCTrainInfo(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("starLvl:");
    sb.append(this.starLvl);
    first = false;
    if (!first) sb.append(", ");
    sb.append("todayLeftTrainCount:");
    sb.append(this.todayLeftTrainCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("todayBuyTrainCount:");
    sb.append(this.todayBuyTrainCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("occuptionDatas:");
    if (this.occuptionDatas == null) {
      sb.append("null");
    } else {
      sb.append(this.occuptionDatas);
    }
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

  private static class SCTrainInfoStandardSchemeFactory implements SchemeFactory {
    public SCTrainInfoStandardScheme getScheme() {
      return new SCTrainInfoStandardScheme();
    }
  }

  private static class SCTrainInfoStandardScheme extends StandardScheme<SCTrainInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCTrainInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = iprot.readI32();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STAR_LVL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.starLvl = iprot.readI16();
              struct.setStarLvlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TODAY_LEFT_TRAIN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.todayLeftTrainCount = iprot.readI16();
              struct.setTodayLeftTrainCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TODAY_BUY_TRAIN_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.todayBuyTrainCount = iprot.readI16();
              struct.setTodayBuyTrainCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OCCUPTION_DATAS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.occuptionDatas = new HashMap<Byte,TrainOccupationData>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  byte _key2; // required
                  TrainOccupationData _val3; // required
                  _key2 = iprot.readByte();
                  _val3 = new TrainOccupationData();
                  _val3.read(iprot);
                  struct.occuptionDatas.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setOccuptionDatasIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCTrainInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STAR_LVL_FIELD_DESC);
      oprot.writeI16(struct.starLvl);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TODAY_LEFT_TRAIN_COUNT_FIELD_DESC);
      oprot.writeI16(struct.todayLeftTrainCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TODAY_BUY_TRAIN_COUNT_FIELD_DESC);
      oprot.writeI16(struct.todayBuyTrainCount);
      oprot.writeFieldEnd();
      if (struct.occuptionDatas != null) {
        oprot.writeFieldBegin(OCCUPTION_DATAS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.BYTE, org.apache.thrift.protocol.TType.STRUCT, struct.occuptionDatas.size()));
          for (Map.Entry<Byte, TrainOccupationData> _iter4 : struct.occuptionDatas.entrySet())
          {
            oprot.writeByte(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCTrainInfoTupleSchemeFactory implements SchemeFactory {
    public SCTrainInfoTupleScheme getScheme() {
      return new SCTrainInfoTupleScheme();
    }
  }

  private static class SCTrainInfoTupleScheme extends TupleScheme<SCTrainInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCTrainInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetStarLvl()) {
        optionals.set(1);
      }
      if (struct.isSetTodayLeftTrainCount()) {
        optionals.set(2);
      }
      if (struct.isSetTodayBuyTrainCount()) {
        optionals.set(3);
      }
      if (struct.isSetOccuptionDatas()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetStarLvl()) {
        oprot.writeI16(struct.starLvl);
      }
      if (struct.isSetTodayLeftTrainCount()) {
        oprot.writeI16(struct.todayLeftTrainCount);
      }
      if (struct.isSetTodayBuyTrainCount()) {
        oprot.writeI16(struct.todayBuyTrainCount);
      }
      if (struct.isSetOccuptionDatas()) {
        {
          oprot.writeI32(struct.occuptionDatas.size());
          for (Map.Entry<Byte, TrainOccupationData> _iter5 : struct.occuptionDatas.entrySet())
          {
            oprot.writeByte(_iter5.getKey());
            _iter5.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCTrainInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.starLvl = iprot.readI16();
        struct.setStarLvlIsSet(true);
      }
      if (incoming.get(2)) {
        struct.todayLeftTrainCount = iprot.readI16();
        struct.setTodayLeftTrainCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.todayBuyTrainCount = iprot.readI16();
        struct.setTodayBuyTrainCountIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.BYTE, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.occuptionDatas = new HashMap<Byte,TrainOccupationData>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            byte _key8; // required
            TrainOccupationData _val9; // required
            _key8 = iprot.readByte();
            _val9 = new TrainOccupationData();
            _val9.read(iprot);
            struct.occuptionDatas.put(_key8, _val9);
          }
        }
        struct.setOccuptionDatasIsSet(true);
      }
    }
  }

}
