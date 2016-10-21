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
 * 排行榜第一名信息
 */
public class SCTopOneRanksMsg implements org.apache.thrift.TBase<SCTopOneRanksMsg, SCTopOneRanksMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCTopOneRanksMsg");

  private static final org.apache.thrift.protocol.TField TOP_ONE_RANK_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("topOneRankInfos", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField VALID_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("validTime", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PANEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("panelId", org.apache.thrift.protocol.TType.BYTE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCTopOneRanksMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCTopOneRanksMsgTupleSchemeFactory());
  }

  /**
   * 排行榜类型 - 上榜玩家信息
   */
  public Map<Short,com.ling9527.music.common.msg.auto.RankInfo> topOneRankInfos; // required
  /**
   * 有效截止时间（从1970.1.1开始的秒数）
   */
  public int validTime; // required
  /**
   * 客户端记录所在面板
   */
  public byte panelId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 排行榜类型 - 上榜玩家信息
     */
    TOP_ONE_RANK_INFOS((short)1, "topOneRankInfos"),
    /**
     * 有效截止时间（从1970.1.1开始的秒数）
     */
    VALID_TIME((short)2, "validTime"),
    /**
     * 客户端记录所在面板
     */
    PANEL_ID((short)3, "panelId");

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
        case 1: // TOP_ONE_RANK_INFOS
          return TOP_ONE_RANK_INFOS;
        case 2: // VALID_TIME
          return VALID_TIME;
        case 3: // PANEL_ID
          return PANEL_ID;
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
  private static final int __VALIDTIME_ISSET_ID = 0;
  private static final int __PANELID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOP_ONE_RANK_INFOS, new org.apache.thrift.meta_data.FieldMetaData("topOneRankInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.RankInfo.class))));
    tmpMap.put(_Fields.VALID_TIME, new org.apache.thrift.meta_data.FieldMetaData("validTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PANEL_ID, new org.apache.thrift.meta_data.FieldMetaData("panelId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCTopOneRanksMsg.class, metaDataMap);
  }

  public SCTopOneRanksMsg() {
  }

  public SCTopOneRanksMsg(
    Map<Short,com.ling9527.music.common.msg.auto.RankInfo> topOneRankInfos,
    int validTime,
    byte panelId)
  {
    this();
    this.topOneRankInfos = topOneRankInfos;
    this.validTime = validTime;
    setValidTimeIsSet(true);
    this.panelId = panelId;
    setPanelIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCTopOneRanksMsg(SCTopOneRanksMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopOneRankInfos()) {
      Map<Short,com.ling9527.music.common.msg.auto.RankInfo> __this__topOneRankInfos = new HashMap<Short,com.ling9527.music.common.msg.auto.RankInfo>();
      for (Map.Entry<Short, com.ling9527.music.common.msg.auto.RankInfo> other_element : other.topOneRankInfos.entrySet()) {

        Short other_element_key = other_element.getKey();
        com.ling9527.music.common.msg.auto.RankInfo other_element_value = other_element.getValue();

        Short __this__topOneRankInfos_copy_key = other_element_key;

        com.ling9527.music.common.msg.auto.RankInfo __this__topOneRankInfos_copy_value = new com.ling9527.music.common.msg.auto.RankInfo(other_element_value);

        __this__topOneRankInfos.put(__this__topOneRankInfos_copy_key, __this__topOneRankInfos_copy_value);
      }
      this.topOneRankInfos = __this__topOneRankInfos;
    }
    this.validTime = other.validTime;
    this.panelId = other.panelId;
  }

  public SCTopOneRanksMsg deepCopy() {
    return new SCTopOneRanksMsg(this);
  }

  @Override
  public void clear() {
    this.topOneRankInfos = null;
    setValidTimeIsSet(false);
    this.validTime = 0;
    setPanelIdIsSet(false);
    this.panelId = 0;
  }

  public int getTopOneRankInfosSize() {
    return (this.topOneRankInfos == null) ? 0 : this.topOneRankInfos.size();
  }

  public void putToTopOneRankInfos(short key, com.ling9527.music.common.msg.auto.RankInfo val) {
    if (this.topOneRankInfos == null) {
      this.topOneRankInfos = new HashMap<Short,com.ling9527.music.common.msg.auto.RankInfo>();
    }
    this.topOneRankInfos.put(key, val);
  }

  /**
   * 排行榜类型 - 上榜玩家信息
   */
  public Map<Short,com.ling9527.music.common.msg.auto.RankInfo> getTopOneRankInfos() {
    return this.topOneRankInfos;
  }

  /**
   * 排行榜类型 - 上榜玩家信息
   */
  public SCTopOneRanksMsg setTopOneRankInfos(Map<Short,com.ling9527.music.common.msg.auto.RankInfo> topOneRankInfos) {
    this.topOneRankInfos = topOneRankInfos;
    return this;
  }

  public void unsetTopOneRankInfos() {
    this.topOneRankInfos = null;
  }

  /** Returns true if field topOneRankInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetTopOneRankInfos() {
    return this.topOneRankInfos != null;
  }

  public void setTopOneRankInfosIsSet(boolean value) {
    if (!value) {
      this.topOneRankInfos = null;
    }
  }

  /**
   * 有效截止时间（从1970.1.1开始的秒数）
   */
  public int getValidTime() {
    return this.validTime;
  }

  /**
   * 有效截止时间（从1970.1.1开始的秒数）
   */
  public SCTopOneRanksMsg setValidTime(int validTime) {
    this.validTime = validTime;
    setValidTimeIsSet(true);
    return this;
  }

  public void unsetValidTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALIDTIME_ISSET_ID);
  }

  /** Returns true if field validTime is set (has been assigned a value) and false otherwise */
  public boolean isSetValidTime() {
    return EncodingUtils.testBit(__isset_bitfield, __VALIDTIME_ISSET_ID);
  }

  public void setValidTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALIDTIME_ISSET_ID, value);
  }

  /**
   * 客户端记录所在面板
   */
  public byte getPanelId() {
    return this.panelId;
  }

  /**
   * 客户端记录所在面板
   */
  public SCTopOneRanksMsg setPanelId(byte panelId) {
    this.panelId = panelId;
    setPanelIdIsSet(true);
    return this;
  }

  public void unsetPanelId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PANELID_ISSET_ID);
  }

  /** Returns true if field panelId is set (has been assigned a value) and false otherwise */
  public boolean isSetPanelId() {
    return EncodingUtils.testBit(__isset_bitfield, __PANELID_ISSET_ID);
  }

  public void setPanelIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PANELID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOP_ONE_RANK_INFOS:
      if (value == null) {
        unsetTopOneRankInfos();
      } else {
        setTopOneRankInfos((Map<Short,com.ling9527.music.common.msg.auto.RankInfo>)value);
      }
      break;

    case VALID_TIME:
      if (value == null) {
        unsetValidTime();
      } else {
        setValidTime((Integer)value);
      }
      break;

    case PANEL_ID:
      if (value == null) {
        unsetPanelId();
      } else {
        setPanelId((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOP_ONE_RANK_INFOS:
      return getTopOneRankInfos();

    case VALID_TIME:
      return Integer.valueOf(getValidTime());

    case PANEL_ID:
      return Byte.valueOf(getPanelId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOP_ONE_RANK_INFOS:
      return isSetTopOneRankInfos();
    case VALID_TIME:
      return isSetValidTime();
    case PANEL_ID:
      return isSetPanelId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCTopOneRanksMsg)
      return this.equals((SCTopOneRanksMsg)that);
    return false;
  }

  public boolean equals(SCTopOneRanksMsg that) {
    if (that == null)
      return false;

    boolean this_present_topOneRankInfos = true && this.isSetTopOneRankInfos();
    boolean that_present_topOneRankInfos = true && that.isSetTopOneRankInfos();
    if (this_present_topOneRankInfos || that_present_topOneRankInfos) {
      if (!(this_present_topOneRankInfos && that_present_topOneRankInfos))
        return false;
      if (!this.topOneRankInfos.equals(that.topOneRankInfos))
        return false;
    }

    boolean this_present_validTime = true;
    boolean that_present_validTime = true;
    if (this_present_validTime || that_present_validTime) {
      if (!(this_present_validTime && that_present_validTime))
        return false;
      if (this.validTime != that.validTime)
        return false;
    }

    boolean this_present_panelId = true;
    boolean that_present_panelId = true;
    if (this_present_panelId || that_present_panelId) {
      if (!(this_present_panelId && that_present_panelId))
        return false;
      if (this.panelId != that.panelId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCTopOneRanksMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCTopOneRanksMsg typedOther = (SCTopOneRanksMsg)other;

    lastComparison = Boolean.valueOf(isSetTopOneRankInfos()).compareTo(typedOther.isSetTopOneRankInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopOneRankInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topOneRankInfos, typedOther.topOneRankInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValidTime()).compareTo(typedOther.isSetValidTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validTime, typedOther.validTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPanelId()).compareTo(typedOther.isSetPanelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPanelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.panelId, typedOther.panelId);
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
    StringBuilder sb = new StringBuilder("SCTopOneRanksMsg(");
    boolean first = true;

    sb.append("topOneRankInfos:");
    if (this.topOneRankInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.topOneRankInfos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("validTime:");
    sb.append(this.validTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("panelId:");
    sb.append(this.panelId);
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

  private static class SCTopOneRanksMsgStandardSchemeFactory implements SchemeFactory {
    public SCTopOneRanksMsgStandardScheme getScheme() {
      return new SCTopOneRanksMsgStandardScheme();
    }
  }

  private static class SCTopOneRanksMsgStandardScheme extends StandardScheme<SCTopOneRanksMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCTopOneRanksMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOP_ONE_RANK_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.topOneRankInfos = new HashMap<Short,com.ling9527.music.common.msg.auto.RankInfo>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  short _key2; // required
                  com.ling9527.music.common.msg.auto.RankInfo _val3; // required
                  _key2 = iprot.readI16();
                  _val3 = new com.ling9527.music.common.msg.auto.RankInfo();
                  _val3.read(iprot);
                  struct.topOneRankInfos.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setTopOneRankInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALID_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.validTime = iprot.readI32();
              struct.setValidTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PANEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.panelId = iprot.readByte();
              struct.setPanelIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCTopOneRanksMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topOneRankInfos != null) {
        oprot.writeFieldBegin(TOP_ONE_RANK_INFOS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.STRUCT, struct.topOneRankInfos.size()));
          for (Map.Entry<Short, com.ling9527.music.common.msg.auto.RankInfo> _iter4 : struct.topOneRankInfos.entrySet())
          {
            oprot.writeI16(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VALID_TIME_FIELD_DESC);
      oprot.writeI32(struct.validTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PANEL_ID_FIELD_DESC);
      oprot.writeByte(struct.panelId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCTopOneRanksMsgTupleSchemeFactory implements SchemeFactory {
    public SCTopOneRanksMsgTupleScheme getScheme() {
      return new SCTopOneRanksMsgTupleScheme();
    }
  }

  private static class SCTopOneRanksMsgTupleScheme extends TupleScheme<SCTopOneRanksMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCTopOneRanksMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTopOneRankInfos()) {
        optionals.set(0);
      }
      if (struct.isSetValidTime()) {
        optionals.set(1);
      }
      if (struct.isSetPanelId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTopOneRankInfos()) {
        {
          oprot.writeI32(struct.topOneRankInfos.size());
          for (Map.Entry<Short, com.ling9527.music.common.msg.auto.RankInfo> _iter5 : struct.topOneRankInfos.entrySet())
          {
            oprot.writeI16(_iter5.getKey());
            _iter5.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetValidTime()) {
        oprot.writeI32(struct.validTime);
      }
      if (struct.isSetPanelId()) {
        oprot.writeByte(struct.panelId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCTopOneRanksMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.topOneRankInfos = new HashMap<Short,com.ling9527.music.common.msg.auto.RankInfo>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            short _key8; // required
            com.ling9527.music.common.msg.auto.RankInfo _val9; // required
            _key8 = iprot.readI16();
            _val9 = new com.ling9527.music.common.msg.auto.RankInfo();
            _val9.read(iprot);
            struct.topOneRankInfos.put(_key8, _val9);
          }
        }
        struct.setTopOneRankInfosIsSet(true);
      }
      if (incoming.get(1)) {
        struct.validTime = iprot.readI32();
        struct.setValidTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.panelId = iprot.readByte();
        struct.setPanelIdIsSet(true);
      }
    }
  }

}

