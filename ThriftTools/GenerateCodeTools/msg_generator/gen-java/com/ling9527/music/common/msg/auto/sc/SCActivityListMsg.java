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
 * 活动列表
 */
public class SCActivityListMsg implements org.apache.thrift.TBase<SCActivityListMsg, SCActivityListMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCActivityListMsg");

  private static final org.apache.thrift.protocol.TField ACTIVITY_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("activityVersion", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACTIVITY_TYPE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("activityTypeInfos", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FIRST_ACTIVITY_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("firstActivityInfo", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCActivityListMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCActivityListMsgTupleSchemeFactory());
  }

  /**
   * 活动版本号
   */
  public int activityVersion; // required
  /**
   * 活动列表信息
   */
  public List<ActivityTypeInfo> activityTypeInfos; // optional
  /**
   * 第一个可领取奖励活动详情
   */
  public ActivityDetailInfo firstActivityInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 活动版本号
     */
    ACTIVITY_VERSION((short)1, "activityVersion"),
    /**
     * 活动列表信息
     */
    ACTIVITY_TYPE_INFOS((short)2, "activityTypeInfos"),
    /**
     * 第一个可领取奖励活动详情
     */
    FIRST_ACTIVITY_INFO((short)3, "firstActivityInfo");

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
        case 1: // ACTIVITY_VERSION
          return ACTIVITY_VERSION;
        case 2: // ACTIVITY_TYPE_INFOS
          return ACTIVITY_TYPE_INFOS;
        case 3: // FIRST_ACTIVITY_INFO
          return FIRST_ACTIVITY_INFO;
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
  private static final int __ACTIVITYVERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ACTIVITY_TYPE_INFOS,_Fields.FIRST_ACTIVITY_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTIVITY_VERSION, new org.apache.thrift.meta_data.FieldMetaData("activityVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACTIVITY_TYPE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("activityTypeInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ActivityTypeInfo.class))));
    tmpMap.put(_Fields.FIRST_ACTIVITY_INFO, new org.apache.thrift.meta_data.FieldMetaData("firstActivityInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ActivityDetailInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCActivityListMsg.class, metaDataMap);
  }

  public SCActivityListMsg() {
  }

  public SCActivityListMsg(
    int activityVersion)
  {
    this();
    this.activityVersion = activityVersion;
    setActivityVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCActivityListMsg(SCActivityListMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.activityVersion = other.activityVersion;
    if (other.isSetActivityTypeInfos()) {
      List<ActivityTypeInfo> __this__activityTypeInfos = new ArrayList<ActivityTypeInfo>();
      for (ActivityTypeInfo other_element : other.activityTypeInfos) {
        __this__activityTypeInfos.add(new ActivityTypeInfo(other_element));
      }
      this.activityTypeInfos = __this__activityTypeInfos;
    }
    if (other.isSetFirstActivityInfo()) {
      this.firstActivityInfo = new ActivityDetailInfo(other.firstActivityInfo);
    }
  }

  public SCActivityListMsg deepCopy() {
    return new SCActivityListMsg(this);
  }

  @Override
  public void clear() {
    setActivityVersionIsSet(false);
    this.activityVersion = 0;
    this.activityTypeInfos = null;
    this.firstActivityInfo = null;
  }

  /**
   * 活动版本号
   */
  public int getActivityVersion() {
    return this.activityVersion;
  }

  /**
   * 活动版本号
   */
  public SCActivityListMsg setActivityVersion(int activityVersion) {
    this.activityVersion = activityVersion;
    setActivityVersionIsSet(true);
    return this;
  }

  public void unsetActivityVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIVITYVERSION_ISSET_ID);
  }

  /** Returns true if field activityVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIVITYVERSION_ISSET_ID);
  }

  public void setActivityVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIVITYVERSION_ISSET_ID, value);
  }

  public int getActivityTypeInfosSize() {
    return (this.activityTypeInfos == null) ? 0 : this.activityTypeInfos.size();
  }

  public java.util.Iterator<ActivityTypeInfo> getActivityTypeInfosIterator() {
    return (this.activityTypeInfos == null) ? null : this.activityTypeInfos.iterator();
  }

  public void addToActivityTypeInfos(ActivityTypeInfo elem) {
    if (this.activityTypeInfos == null) {
      this.activityTypeInfos = new ArrayList<ActivityTypeInfo>();
    }
    this.activityTypeInfos.add(elem);
  }

  /**
   * 活动列表信息
   */
  public List<ActivityTypeInfo> getActivityTypeInfos() {
    return this.activityTypeInfos;
  }

  /**
   * 活动列表信息
   */
  public SCActivityListMsg setActivityTypeInfos(List<ActivityTypeInfo> activityTypeInfos) {
    this.activityTypeInfos = activityTypeInfos;
    return this;
  }

  public void unsetActivityTypeInfos() {
    this.activityTypeInfos = null;
  }

  /** Returns true if field activityTypeInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityTypeInfos() {
    return this.activityTypeInfos != null;
  }

  public void setActivityTypeInfosIsSet(boolean value) {
    if (!value) {
      this.activityTypeInfos = null;
    }
  }

  /**
   * 第一个可领取奖励活动详情
   */
  public ActivityDetailInfo getFirstActivityInfo() {
    return this.firstActivityInfo;
  }

  /**
   * 第一个可领取奖励活动详情
   */
  public SCActivityListMsg setFirstActivityInfo(ActivityDetailInfo firstActivityInfo) {
    this.firstActivityInfo = firstActivityInfo;
    return this;
  }

  public void unsetFirstActivityInfo() {
    this.firstActivityInfo = null;
  }

  /** Returns true if field firstActivityInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstActivityInfo() {
    return this.firstActivityInfo != null;
  }

  public void setFirstActivityInfoIsSet(boolean value) {
    if (!value) {
      this.firstActivityInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTIVITY_VERSION:
      if (value == null) {
        unsetActivityVersion();
      } else {
        setActivityVersion((Integer)value);
      }
      break;

    case ACTIVITY_TYPE_INFOS:
      if (value == null) {
        unsetActivityTypeInfos();
      } else {
        setActivityTypeInfos((List<ActivityTypeInfo>)value);
      }
      break;

    case FIRST_ACTIVITY_INFO:
      if (value == null) {
        unsetFirstActivityInfo();
      } else {
        setFirstActivityInfo((ActivityDetailInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTIVITY_VERSION:
      return Integer.valueOf(getActivityVersion());

    case ACTIVITY_TYPE_INFOS:
      return getActivityTypeInfos();

    case FIRST_ACTIVITY_INFO:
      return getFirstActivityInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTIVITY_VERSION:
      return isSetActivityVersion();
    case ACTIVITY_TYPE_INFOS:
      return isSetActivityTypeInfos();
    case FIRST_ACTIVITY_INFO:
      return isSetFirstActivityInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCActivityListMsg)
      return this.equals((SCActivityListMsg)that);
    return false;
  }

  public boolean equals(SCActivityListMsg that) {
    if (that == null)
      return false;

    boolean this_present_activityVersion = true;
    boolean that_present_activityVersion = true;
    if (this_present_activityVersion || that_present_activityVersion) {
      if (!(this_present_activityVersion && that_present_activityVersion))
        return false;
      if (this.activityVersion != that.activityVersion)
        return false;
    }

    boolean this_present_activityTypeInfos = true && this.isSetActivityTypeInfos();
    boolean that_present_activityTypeInfos = true && that.isSetActivityTypeInfos();
    if (this_present_activityTypeInfos || that_present_activityTypeInfos) {
      if (!(this_present_activityTypeInfos && that_present_activityTypeInfos))
        return false;
      if (!this.activityTypeInfos.equals(that.activityTypeInfos))
        return false;
    }

    boolean this_present_firstActivityInfo = true && this.isSetFirstActivityInfo();
    boolean that_present_firstActivityInfo = true && that.isSetFirstActivityInfo();
    if (this_present_firstActivityInfo || that_present_firstActivityInfo) {
      if (!(this_present_firstActivityInfo && that_present_firstActivityInfo))
        return false;
      if (!this.firstActivityInfo.equals(that.firstActivityInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCActivityListMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCActivityListMsg typedOther = (SCActivityListMsg)other;

    lastComparison = Boolean.valueOf(isSetActivityVersion()).compareTo(typedOther.isSetActivityVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityVersion, typedOther.activityVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActivityTypeInfos()).compareTo(typedOther.isSetActivityTypeInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityTypeInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityTypeInfos, typedOther.activityTypeInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirstActivityInfo()).compareTo(typedOther.isSetFirstActivityInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstActivityInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstActivityInfo, typedOther.firstActivityInfo);
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
    StringBuilder sb = new StringBuilder("SCActivityListMsg(");
    boolean first = true;

    sb.append("activityVersion:");
    sb.append(this.activityVersion);
    first = false;
    if (isSetActivityTypeInfos()) {
      if (!first) sb.append(", ");
      sb.append("activityTypeInfos:");
      if (this.activityTypeInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.activityTypeInfos);
      }
      first = false;
    }
    if (isSetFirstActivityInfo()) {
      if (!first) sb.append(", ");
      sb.append("firstActivityInfo:");
      if (this.firstActivityInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.firstActivityInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (firstActivityInfo != null) {
      firstActivityInfo.validate();
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

  private static class SCActivityListMsgStandardSchemeFactory implements SchemeFactory {
    public SCActivityListMsgStandardScheme getScheme() {
      return new SCActivityListMsgStandardScheme();
    }
  }

  private static class SCActivityListMsgStandardScheme extends StandardScheme<SCActivityListMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCActivityListMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTIVITY_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.activityVersion = iprot.readI32();
              struct.setActivityVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTIVITY_TYPE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.activityTypeInfos = new ArrayList<ActivityTypeInfo>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  ActivityTypeInfo _elem10; // required
                  _elem10 = new ActivityTypeInfo();
                  _elem10.read(iprot);
                  struct.activityTypeInfos.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setActivityTypeInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIRST_ACTIVITY_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.firstActivityInfo = new ActivityDetailInfo();
              struct.firstActivityInfo.read(iprot);
              struct.setFirstActivityInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCActivityListMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACTIVITY_VERSION_FIELD_DESC);
      oprot.writeI32(struct.activityVersion);
      oprot.writeFieldEnd();
      if (struct.activityTypeInfos != null) {
        if (struct.isSetActivityTypeInfos()) {
          oprot.writeFieldBegin(ACTIVITY_TYPE_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.activityTypeInfos.size()));
            for (ActivityTypeInfo _iter11 : struct.activityTypeInfos)
            {
              _iter11.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.firstActivityInfo != null) {
        if (struct.isSetFirstActivityInfo()) {
          oprot.writeFieldBegin(FIRST_ACTIVITY_INFO_FIELD_DESC);
          struct.firstActivityInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCActivityListMsgTupleSchemeFactory implements SchemeFactory {
    public SCActivityListMsgTupleScheme getScheme() {
      return new SCActivityListMsgTupleScheme();
    }
  }

  private static class SCActivityListMsgTupleScheme extends TupleScheme<SCActivityListMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCActivityListMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActivityVersion()) {
        optionals.set(0);
      }
      if (struct.isSetActivityTypeInfos()) {
        optionals.set(1);
      }
      if (struct.isSetFirstActivityInfo()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetActivityVersion()) {
        oprot.writeI32(struct.activityVersion);
      }
      if (struct.isSetActivityTypeInfos()) {
        {
          oprot.writeI32(struct.activityTypeInfos.size());
          for (ActivityTypeInfo _iter12 : struct.activityTypeInfos)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetFirstActivityInfo()) {
        struct.firstActivityInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCActivityListMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.activityVersion = iprot.readI32();
        struct.setActivityVersionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.activityTypeInfos = new ArrayList<ActivityTypeInfo>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            ActivityTypeInfo _elem15; // required
            _elem15 = new ActivityTypeInfo();
            _elem15.read(iprot);
            struct.activityTypeInfos.add(_elem15);
          }
        }
        struct.setActivityTypeInfosIsSet(true);
      }
      if (incoming.get(2)) {
        struct.firstActivityInfo = new ActivityDetailInfo();
        struct.firstActivityInfo.read(iprot);
        struct.setFirstActivityInfoIsSet(true);
      }
    }
  }

}

