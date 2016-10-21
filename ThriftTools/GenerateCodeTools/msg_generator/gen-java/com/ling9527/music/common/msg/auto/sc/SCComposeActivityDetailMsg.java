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

public class SCComposeActivityDetailMsg implements org.apache.thrift.TBase<SCComposeActivityDetailMsg, SCComposeActivityDetailMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCComposeActivityDetailMsg");

  private static final org.apache.thrift.protocol.TField ACTIVITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("activityId", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField DETAIL_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("detailInfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCComposeActivityDetailMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCComposeActivityDetailMsgTupleSchemeFactory());
  }

  public short activityId; // required
  public com.ling9527.music.common.msg.auto.ComposeActivityDetail detailInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTIVITY_ID((short)1, "activityId"),
    DETAIL_INFO((short)2, "detailInfo");

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
        case 1: // ACTIVITY_ID
          return ACTIVITY_ID;
        case 2: // DETAIL_INFO
          return DETAIL_INFO;
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
  private static final int __ACTIVITYID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTIVITY_ID, new org.apache.thrift.meta_data.FieldMetaData("activityId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.DETAIL_INFO, new org.apache.thrift.meta_data.FieldMetaData("detailInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.ComposeActivityDetail.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCComposeActivityDetailMsg.class, metaDataMap);
  }

  public SCComposeActivityDetailMsg() {
  }

  public SCComposeActivityDetailMsg(
    short activityId,
    com.ling9527.music.common.msg.auto.ComposeActivityDetail detailInfo)
  {
    this();
    this.activityId = activityId;
    setActivityIdIsSet(true);
    this.detailInfo = detailInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCComposeActivityDetailMsg(SCComposeActivityDetailMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.activityId = other.activityId;
    if (other.isSetDetailInfo()) {
      this.detailInfo = new com.ling9527.music.common.msg.auto.ComposeActivityDetail(other.detailInfo);
    }
  }

  public SCComposeActivityDetailMsg deepCopy() {
    return new SCComposeActivityDetailMsg(this);
  }

  @Override
  public void clear() {
    setActivityIdIsSet(false);
    this.activityId = 0;
    this.detailInfo = null;
  }

  public short getActivityId() {
    return this.activityId;
  }

  public SCComposeActivityDetailMsg setActivityId(short activityId) {
    this.activityId = activityId;
    setActivityIdIsSet(true);
    return this;
  }

  public void unsetActivityId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIVITYID_ISSET_ID);
  }

  /** Returns true if field activityId is set (has been assigned a value) and false otherwise */
  public boolean isSetActivityId() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIVITYID_ISSET_ID);
  }

  public void setActivityIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIVITYID_ISSET_ID, value);
  }

  public com.ling9527.music.common.msg.auto.ComposeActivityDetail getDetailInfo() {
    return this.detailInfo;
  }

  public SCComposeActivityDetailMsg setDetailInfo(com.ling9527.music.common.msg.auto.ComposeActivityDetail detailInfo) {
    this.detailInfo = detailInfo;
    return this;
  }

  public void unsetDetailInfo() {
    this.detailInfo = null;
  }

  /** Returns true if field detailInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetDetailInfo() {
    return this.detailInfo != null;
  }

  public void setDetailInfoIsSet(boolean value) {
    if (!value) {
      this.detailInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTIVITY_ID:
      if (value == null) {
        unsetActivityId();
      } else {
        setActivityId((Short)value);
      }
      break;

    case DETAIL_INFO:
      if (value == null) {
        unsetDetailInfo();
      } else {
        setDetailInfo((com.ling9527.music.common.msg.auto.ComposeActivityDetail)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTIVITY_ID:
      return Short.valueOf(getActivityId());

    case DETAIL_INFO:
      return getDetailInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTIVITY_ID:
      return isSetActivityId();
    case DETAIL_INFO:
      return isSetDetailInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCComposeActivityDetailMsg)
      return this.equals((SCComposeActivityDetailMsg)that);
    return false;
  }

  public boolean equals(SCComposeActivityDetailMsg that) {
    if (that == null)
      return false;

    boolean this_present_activityId = true;
    boolean that_present_activityId = true;
    if (this_present_activityId || that_present_activityId) {
      if (!(this_present_activityId && that_present_activityId))
        return false;
      if (this.activityId != that.activityId)
        return false;
    }

    boolean this_present_detailInfo = true && this.isSetDetailInfo();
    boolean that_present_detailInfo = true && that.isSetDetailInfo();
    if (this_present_detailInfo || that_present_detailInfo) {
      if (!(this_present_detailInfo && that_present_detailInfo))
        return false;
      if (!this.detailInfo.equals(that.detailInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCComposeActivityDetailMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCComposeActivityDetailMsg typedOther = (SCComposeActivityDetailMsg)other;

    lastComparison = Boolean.valueOf(isSetActivityId()).compareTo(typedOther.isSetActivityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActivityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activityId, typedOther.activityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetailInfo()).compareTo(typedOther.isSetDetailInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetailInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.detailInfo, typedOther.detailInfo);
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
    StringBuilder sb = new StringBuilder("SCComposeActivityDetailMsg(");
    boolean first = true;

    sb.append("activityId:");
    sb.append(this.activityId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("detailInfo:");
    if (this.detailInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.detailInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (detailInfo != null) {
      detailInfo.validate();
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

  private static class SCComposeActivityDetailMsgStandardSchemeFactory implements SchemeFactory {
    public SCComposeActivityDetailMsgStandardScheme getScheme() {
      return new SCComposeActivityDetailMsgStandardScheme();
    }
  }

  private static class SCComposeActivityDetailMsgStandardScheme extends StandardScheme<SCComposeActivityDetailMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCComposeActivityDetailMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTIVITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.activityId = iprot.readI16();
              struct.setActivityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DETAIL_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.detailInfo = new com.ling9527.music.common.msg.auto.ComposeActivityDetail();
              struct.detailInfo.read(iprot);
              struct.setDetailInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCComposeActivityDetailMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ACTIVITY_ID_FIELD_DESC);
      oprot.writeI16(struct.activityId);
      oprot.writeFieldEnd();
      if (struct.detailInfo != null) {
        oprot.writeFieldBegin(DETAIL_INFO_FIELD_DESC);
        struct.detailInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCComposeActivityDetailMsgTupleSchemeFactory implements SchemeFactory {
    public SCComposeActivityDetailMsgTupleScheme getScheme() {
      return new SCComposeActivityDetailMsgTupleScheme();
    }
  }

  private static class SCComposeActivityDetailMsgTupleScheme extends TupleScheme<SCComposeActivityDetailMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCComposeActivityDetailMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActivityId()) {
        optionals.set(0);
      }
      if (struct.isSetDetailInfo()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetActivityId()) {
        oprot.writeI16(struct.activityId);
      }
      if (struct.isSetDetailInfo()) {
        struct.detailInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCComposeActivityDetailMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.activityId = iprot.readI16();
        struct.setActivityIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.detailInfo = new com.ling9527.music.common.msg.auto.ComposeActivityDetail();
        struct.detailInfo.read(iprot);
        struct.setDetailInfoIsSet(true);
      }
    }
  }

}
