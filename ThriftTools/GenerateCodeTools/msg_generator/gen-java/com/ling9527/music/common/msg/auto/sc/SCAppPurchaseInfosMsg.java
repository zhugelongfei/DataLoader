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
 * 套餐信息
 */
public class SCAppPurchaseInfosMsg implements org.apache.thrift.TBase<SCAppPurchaseInfosMsg, SCAppPurchaseInfosMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCAppPurchaseInfosMsg");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField PURCHASE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("purchaseInfos", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FIRST_RECHARGE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("firstRechargeInfo", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCAppPurchaseInfosMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCAppPurchaseInfosMsgTupleSchemeFactory());
  }

  /**
   * 版本
   */
  public byte version; // required
  /**
   * 套餐信息
   */
  public List<com.ling9527.music.common.msg.auto.InAppPurchaseInfo> purchaseInfos; // required
  /**
   * 首充信息
   */
  public List<Integer> firstRechargeInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 版本
     */
    VERSION((short)1, "version"),
    /**
     * 套餐信息
     */
    PURCHASE_INFOS((short)2, "purchaseInfos"),
    /**
     * 首充信息
     */
    FIRST_RECHARGE_INFO((short)3, "firstRechargeInfo");

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
        case 2: // PURCHASE_INFOS
          return PURCHASE_INFOS;
        case 3: // FIRST_RECHARGE_INFO
          return FIRST_RECHARGE_INFO;
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
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.FIRST_RECHARGE_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PURCHASE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("purchaseInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.InAppPurchaseInfo.class))));
    tmpMap.put(_Fields.FIRST_RECHARGE_INFO, new org.apache.thrift.meta_data.FieldMetaData("firstRechargeInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCAppPurchaseInfosMsg.class, metaDataMap);
  }

  public SCAppPurchaseInfosMsg() {
  }

  public SCAppPurchaseInfosMsg(
    byte version,
    List<com.ling9527.music.common.msg.auto.InAppPurchaseInfo> purchaseInfos)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.purchaseInfos = purchaseInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCAppPurchaseInfosMsg(SCAppPurchaseInfosMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    if (other.isSetPurchaseInfos()) {
      List<com.ling9527.music.common.msg.auto.InAppPurchaseInfo> __this__purchaseInfos = new ArrayList<com.ling9527.music.common.msg.auto.InAppPurchaseInfo>();
      for (com.ling9527.music.common.msg.auto.InAppPurchaseInfo other_element : other.purchaseInfos) {
        __this__purchaseInfos.add(new com.ling9527.music.common.msg.auto.InAppPurchaseInfo(other_element));
      }
      this.purchaseInfos = __this__purchaseInfos;
    }
    if (other.isSetFirstRechargeInfo()) {
      List<Integer> __this__firstRechargeInfo = new ArrayList<Integer>();
      for (Integer other_element : other.firstRechargeInfo) {
        __this__firstRechargeInfo.add(other_element);
      }
      this.firstRechargeInfo = __this__firstRechargeInfo;
    }
  }

  public SCAppPurchaseInfosMsg deepCopy() {
    return new SCAppPurchaseInfosMsg(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    this.purchaseInfos = null;
    this.firstRechargeInfo = null;
  }

  /**
   * 版本
   */
  public byte getVersion() {
    return this.version;
  }

  /**
   * 版本
   */
  public SCAppPurchaseInfosMsg setVersion(byte version) {
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

  public int getPurchaseInfosSize() {
    return (this.purchaseInfos == null) ? 0 : this.purchaseInfos.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.InAppPurchaseInfo> getPurchaseInfosIterator() {
    return (this.purchaseInfos == null) ? null : this.purchaseInfos.iterator();
  }

  public void addToPurchaseInfos(com.ling9527.music.common.msg.auto.InAppPurchaseInfo elem) {
    if (this.purchaseInfos == null) {
      this.purchaseInfos = new ArrayList<com.ling9527.music.common.msg.auto.InAppPurchaseInfo>();
    }
    this.purchaseInfos.add(elem);
  }

  /**
   * 套餐信息
   */
  public List<com.ling9527.music.common.msg.auto.InAppPurchaseInfo> getPurchaseInfos() {
    return this.purchaseInfos;
  }

  /**
   * 套餐信息
   */
  public SCAppPurchaseInfosMsg setPurchaseInfos(List<com.ling9527.music.common.msg.auto.InAppPurchaseInfo> purchaseInfos) {
    this.purchaseInfos = purchaseInfos;
    return this;
  }

  public void unsetPurchaseInfos() {
    this.purchaseInfos = null;
  }

  /** Returns true if field purchaseInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetPurchaseInfos() {
    return this.purchaseInfos != null;
  }

  public void setPurchaseInfosIsSet(boolean value) {
    if (!value) {
      this.purchaseInfos = null;
    }
  }

  public int getFirstRechargeInfoSize() {
    return (this.firstRechargeInfo == null) ? 0 : this.firstRechargeInfo.size();
  }

  public java.util.Iterator<Integer> getFirstRechargeInfoIterator() {
    return (this.firstRechargeInfo == null) ? null : this.firstRechargeInfo.iterator();
  }

  public void addToFirstRechargeInfo(int elem) {
    if (this.firstRechargeInfo == null) {
      this.firstRechargeInfo = new ArrayList<Integer>();
    }
    this.firstRechargeInfo.add(elem);
  }

  /**
   * 首充信息
   */
  public List<Integer> getFirstRechargeInfo() {
    return this.firstRechargeInfo;
  }

  /**
   * 首充信息
   */
  public SCAppPurchaseInfosMsg setFirstRechargeInfo(List<Integer> firstRechargeInfo) {
    this.firstRechargeInfo = firstRechargeInfo;
    return this;
  }

  public void unsetFirstRechargeInfo() {
    this.firstRechargeInfo = null;
  }

  /** Returns true if field firstRechargeInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetFirstRechargeInfo() {
    return this.firstRechargeInfo != null;
  }

  public void setFirstRechargeInfoIsSet(boolean value) {
    if (!value) {
      this.firstRechargeInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Byte)value);
      }
      break;

    case PURCHASE_INFOS:
      if (value == null) {
        unsetPurchaseInfos();
      } else {
        setPurchaseInfos((List<com.ling9527.music.common.msg.auto.InAppPurchaseInfo>)value);
      }
      break;

    case FIRST_RECHARGE_INFO:
      if (value == null) {
        unsetFirstRechargeInfo();
      } else {
        setFirstRechargeInfo((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Byte.valueOf(getVersion());

    case PURCHASE_INFOS:
      return getPurchaseInfos();

    case FIRST_RECHARGE_INFO:
      return getFirstRechargeInfo();

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
    case PURCHASE_INFOS:
      return isSetPurchaseInfos();
    case FIRST_RECHARGE_INFO:
      return isSetFirstRechargeInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCAppPurchaseInfosMsg)
      return this.equals((SCAppPurchaseInfosMsg)that);
    return false;
  }

  public boolean equals(SCAppPurchaseInfosMsg that) {
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

    boolean this_present_purchaseInfos = true && this.isSetPurchaseInfos();
    boolean that_present_purchaseInfos = true && that.isSetPurchaseInfos();
    if (this_present_purchaseInfos || that_present_purchaseInfos) {
      if (!(this_present_purchaseInfos && that_present_purchaseInfos))
        return false;
      if (!this.purchaseInfos.equals(that.purchaseInfos))
        return false;
    }

    boolean this_present_firstRechargeInfo = true && this.isSetFirstRechargeInfo();
    boolean that_present_firstRechargeInfo = true && that.isSetFirstRechargeInfo();
    if (this_present_firstRechargeInfo || that_present_firstRechargeInfo) {
      if (!(this_present_firstRechargeInfo && that_present_firstRechargeInfo))
        return false;
      if (!this.firstRechargeInfo.equals(that.firstRechargeInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCAppPurchaseInfosMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCAppPurchaseInfosMsg typedOther = (SCAppPurchaseInfosMsg)other;

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
    lastComparison = Boolean.valueOf(isSetPurchaseInfos()).compareTo(typedOther.isSetPurchaseInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPurchaseInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.purchaseInfos, typedOther.purchaseInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFirstRechargeInfo()).compareTo(typedOther.isSetFirstRechargeInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFirstRechargeInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.firstRechargeInfo, typedOther.firstRechargeInfo);
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
    StringBuilder sb = new StringBuilder("SCAppPurchaseInfosMsg(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("purchaseInfos:");
    if (this.purchaseInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.purchaseInfos);
    }
    first = false;
    if (isSetFirstRechargeInfo()) {
      if (!first) sb.append(", ");
      sb.append("firstRechargeInfo:");
      if (this.firstRechargeInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.firstRechargeInfo);
      }
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

  private static class SCAppPurchaseInfosMsgStandardSchemeFactory implements SchemeFactory {
    public SCAppPurchaseInfosMsgStandardScheme getScheme() {
      return new SCAppPurchaseInfosMsgStandardScheme();
    }
  }

  private static class SCAppPurchaseInfosMsgStandardScheme extends StandardScheme<SCAppPurchaseInfosMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCAppPurchaseInfosMsg struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.version = iprot.readByte();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PURCHASE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.purchaseInfos = new ArrayList<com.ling9527.music.common.msg.auto.InAppPurchaseInfo>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  com.ling9527.music.common.msg.auto.InAppPurchaseInfo _elem10; // required
                  _elem10 = new com.ling9527.music.common.msg.auto.InAppPurchaseInfo();
                  _elem10.read(iprot);
                  struct.purchaseInfos.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setPurchaseInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FIRST_RECHARGE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.firstRechargeInfo = new ArrayList<Integer>(_list11.size);
                for (int _i12 = 0; _i12 < _list11.size; ++_i12)
                {
                  int _elem13; // required
                  _elem13 = iprot.readI32();
                  struct.firstRechargeInfo.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setFirstRechargeInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCAppPurchaseInfosMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeByte(struct.version);
      oprot.writeFieldEnd();
      if (struct.purchaseInfos != null) {
        oprot.writeFieldBegin(PURCHASE_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.purchaseInfos.size()));
          for (com.ling9527.music.common.msg.auto.InAppPurchaseInfo _iter14 : struct.purchaseInfos)
          {
            _iter14.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.firstRechargeInfo != null) {
        if (struct.isSetFirstRechargeInfo()) {
          oprot.writeFieldBegin(FIRST_RECHARGE_INFO_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.firstRechargeInfo.size()));
            for (int _iter15 : struct.firstRechargeInfo)
            {
              oprot.writeI32(_iter15);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCAppPurchaseInfosMsgTupleSchemeFactory implements SchemeFactory {
    public SCAppPurchaseInfosMsgTupleScheme getScheme() {
      return new SCAppPurchaseInfosMsgTupleScheme();
    }
  }

  private static class SCAppPurchaseInfosMsgTupleScheme extends TupleScheme<SCAppPurchaseInfosMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCAppPurchaseInfosMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetPurchaseInfos()) {
        optionals.set(1);
      }
      if (struct.isSetFirstRechargeInfo()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVersion()) {
        oprot.writeByte(struct.version);
      }
      if (struct.isSetPurchaseInfos()) {
        {
          oprot.writeI32(struct.purchaseInfos.size());
          for (com.ling9527.music.common.msg.auto.InAppPurchaseInfo _iter16 : struct.purchaseInfos)
          {
            _iter16.write(oprot);
          }
        }
      }
      if (struct.isSetFirstRechargeInfo()) {
        {
          oprot.writeI32(struct.firstRechargeInfo.size());
          for (int _iter17 : struct.firstRechargeInfo)
          {
            oprot.writeI32(_iter17);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCAppPurchaseInfosMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.version = iprot.readByte();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.purchaseInfos = new ArrayList<com.ling9527.music.common.msg.auto.InAppPurchaseInfo>(_list18.size);
          for (int _i19 = 0; _i19 < _list18.size; ++_i19)
          {
            com.ling9527.music.common.msg.auto.InAppPurchaseInfo _elem20; // required
            _elem20 = new com.ling9527.music.common.msg.auto.InAppPurchaseInfo();
            _elem20.read(iprot);
            struct.purchaseInfos.add(_elem20);
          }
        }
        struct.setPurchaseInfosIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.firstRechargeInfo = new ArrayList<Integer>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            int _elem23; // required
            _elem23 = iprot.readI32();
            struct.firstRechargeInfo.add(_elem23);
          }
        }
        struct.setFirstRechargeInfoIsSet(true);
      }
    }
  }

}

