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

public class SCLotteryResultMsg implements org.apache.thrift.TBase<SCLotteryResultMsg, SCLotteryResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCLotteryResultMsg");

  private static final org.apache.thrift.protocol.TField PRIZE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("prizeInfos", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("itemList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCLotteryResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCLotteryResultMsgTupleSchemeFactory());
  }

  public com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos; // required
  public List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> itemList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIZE_INFOS((short)1, "prizeInfos"),
    ITEM_LIST((short)2, "itemList");

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
        case 1: // PRIZE_INFOS
          return PRIZE_INFOS;
        case 2: // ITEM_LIST
          return ITEM_LIST;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIZE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("prizeInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.PrizeInfo.class)));
    tmpMap.put(_Fields.ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("itemList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.ConstellationLotteryItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCLotteryResultMsg.class, metaDataMap);
  }

  public SCLotteryResultMsg() {
  }

  public SCLotteryResultMsg(
    com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos,
    List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> itemList)
  {
    this();
    this.prizeInfos = prizeInfos;
    this.itemList = itemList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCLotteryResultMsg(SCLotteryResultMsg other) {
    if (other.isSetPrizeInfos()) {
      this.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo(other.prizeInfos);
    }
    if (other.isSetItemList()) {
      List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> __this__itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>();
      for (com.ling9527.music.common.msg.auto.ConstellationLotteryItem other_element : other.itemList) {
        __this__itemList.add(new com.ling9527.music.common.msg.auto.ConstellationLotteryItem(other_element));
      }
      this.itemList = __this__itemList;
    }
  }

  public SCLotteryResultMsg deepCopy() {
    return new SCLotteryResultMsg(this);
  }

  @Override
  public void clear() {
    this.prizeInfos = null;
    this.itemList = null;
  }

  public com.ling9527.music.common.msg.auto.PrizeInfo getPrizeInfos() {
    return this.prizeInfos;
  }

  public SCLotteryResultMsg setPrizeInfos(com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos) {
    this.prizeInfos = prizeInfos;
    return this;
  }

  public void unsetPrizeInfos() {
    this.prizeInfos = null;
  }

  /** Returns true if field prizeInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetPrizeInfos() {
    return this.prizeInfos != null;
  }

  public void setPrizeInfosIsSet(boolean value) {
    if (!value) {
      this.prizeInfos = null;
    }
  }

  public int getItemListSize() {
    return (this.itemList == null) ? 0 : this.itemList.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> getItemListIterator() {
    return (this.itemList == null) ? null : this.itemList.iterator();
  }

  public void addToItemList(com.ling9527.music.common.msg.auto.ConstellationLotteryItem elem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>();
    }
    this.itemList.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> getItemList() {
    return this.itemList;
  }

  public SCLotteryResultMsg setItemList(List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> itemList) {
    this.itemList = itemList;
    return this;
  }

  public void unsetItemList() {
    this.itemList = null;
  }

  /** Returns true if field itemList is set (has been assigned a value) and false otherwise */
  public boolean isSetItemList() {
    return this.itemList != null;
  }

  public void setItemListIsSet(boolean value) {
    if (!value) {
      this.itemList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRIZE_INFOS:
      if (value == null) {
        unsetPrizeInfos();
      } else {
        setPrizeInfos((com.ling9527.music.common.msg.auto.PrizeInfo)value);
      }
      break;

    case ITEM_LIST:
      if (value == null) {
        unsetItemList();
      } else {
        setItemList((List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRIZE_INFOS:
      return getPrizeInfos();

    case ITEM_LIST:
      return getItemList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRIZE_INFOS:
      return isSetPrizeInfos();
    case ITEM_LIST:
      return isSetItemList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCLotteryResultMsg)
      return this.equals((SCLotteryResultMsg)that);
    return false;
  }

  public boolean equals(SCLotteryResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_prizeInfos = true && this.isSetPrizeInfos();
    boolean that_present_prizeInfos = true && that.isSetPrizeInfos();
    if (this_present_prizeInfos || that_present_prizeInfos) {
      if (!(this_present_prizeInfos && that_present_prizeInfos))
        return false;
      if (!this.prizeInfos.equals(that.prizeInfos))
        return false;
    }

    boolean this_present_itemList = true && this.isSetItemList();
    boolean that_present_itemList = true && that.isSetItemList();
    if (this_present_itemList || that_present_itemList) {
      if (!(this_present_itemList && that_present_itemList))
        return false;
      if (!this.itemList.equals(that.itemList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCLotteryResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCLotteryResultMsg typedOther = (SCLotteryResultMsg)other;

    lastComparison = Boolean.valueOf(isSetPrizeInfos()).compareTo(typedOther.isSetPrizeInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrizeInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prizeInfos, typedOther.prizeInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItemList()).compareTo(typedOther.isSetItemList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemList, typedOther.itemList);
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
    StringBuilder sb = new StringBuilder("SCLotteryResultMsg(");
    boolean first = true;

    sb.append("prizeInfos:");
    if (this.prizeInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.prizeInfos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemList:");
    if (this.itemList == null) {
      sb.append("null");
    } else {
      sb.append(this.itemList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (prizeInfos != null) {
      prizeInfos.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCLotteryResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCLotteryResultMsgStandardScheme getScheme() {
      return new SCLotteryResultMsgStandardScheme();
    }
  }

  private static class SCLotteryResultMsgStandardScheme extends StandardScheme<SCLotteryResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCLotteryResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRIZE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo();
              struct.prizeInfos.read(iprot);
              struct.setPrizeInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ITEM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  com.ling9527.music.common.msg.auto.ConstellationLotteryItem _elem18; // required
                  _elem18 = new com.ling9527.music.common.msg.auto.ConstellationLotteryItem();
                  _elem18.read(iprot);
                  struct.itemList.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setItemListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCLotteryResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.prizeInfos != null) {
        oprot.writeFieldBegin(PRIZE_INFOS_FIELD_DESC);
        struct.prizeInfos.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.itemList != null) {
        oprot.writeFieldBegin(ITEM_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.itemList.size()));
          for (com.ling9527.music.common.msg.auto.ConstellationLotteryItem _iter19 : struct.itemList)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCLotteryResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCLotteryResultMsgTupleScheme getScheme() {
      return new SCLotteryResultMsgTupleScheme();
    }
  }

  private static class SCLotteryResultMsgTupleScheme extends TupleScheme<SCLotteryResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCLotteryResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPrizeInfos()) {
        optionals.set(0);
      }
      if (struct.isSetItemList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPrizeInfos()) {
        struct.prizeInfos.write(oprot);
      }
      if (struct.isSetItemList()) {
        {
          oprot.writeI32(struct.itemList.size());
          for (com.ling9527.music.common.msg.auto.ConstellationLotteryItem _iter20 : struct.itemList)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCLotteryResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo();
        struct.prizeInfos.read(iprot);
        struct.setPrizeInfosIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            com.ling9527.music.common.msg.auto.ConstellationLotteryItem _elem23; // required
            _elem23 = new com.ling9527.music.common.msg.auto.ConstellationLotteryItem();
            _elem23.read(iprot);
            struct.itemList.add(_elem23);
          }
        }
        struct.setItemListIsSet(true);
      }
    }
  }

}

