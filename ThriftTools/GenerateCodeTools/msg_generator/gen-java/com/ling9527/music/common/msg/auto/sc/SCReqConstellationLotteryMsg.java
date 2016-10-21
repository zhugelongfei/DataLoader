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

public class SCReqConstellationLotteryMsg implements org.apache.thrift.TBase<SCReqConstellationLotteryMsg, SCReqConstellationLotteryMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCReqConstellationLotteryMsg");

  private static final org.apache.thrift.protocol.TField ITEM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("itemId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("itemList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCReqConstellationLotteryMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCReqConstellationLotteryMsgTupleSchemeFactory());
  }

  public int itemId; // required
  public List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> itemList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_ID((short)1, "itemId"),
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
        case 1: // ITEM_ID
          return ITEM_ID;
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
  private static final int __ITEMID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM_ID, new org.apache.thrift.meta_data.FieldMetaData("itemId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("itemList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.ConstellationLotteryItem.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCReqConstellationLotteryMsg.class, metaDataMap);
  }

  public SCReqConstellationLotteryMsg() {
  }

  public SCReqConstellationLotteryMsg(
    int itemId,
    List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> itemList)
  {
    this();
    this.itemId = itemId;
    setItemIdIsSet(true);
    this.itemList = itemList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCReqConstellationLotteryMsg(SCReqConstellationLotteryMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.itemId = other.itemId;
    if (other.isSetItemList()) {
      List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> __this__itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>();
      for (com.ling9527.music.common.msg.auto.ConstellationLotteryItem other_element : other.itemList) {
        __this__itemList.add(new com.ling9527.music.common.msg.auto.ConstellationLotteryItem(other_element));
      }
      this.itemList = __this__itemList;
    }
  }

  public SCReqConstellationLotteryMsg deepCopy() {
    return new SCReqConstellationLotteryMsg(this);
  }

  @Override
  public void clear() {
    setItemIdIsSet(false);
    this.itemId = 0;
    this.itemList = null;
  }

  public int getItemId() {
    return this.itemId;
  }

  public SCReqConstellationLotteryMsg setItemId(int itemId) {
    this.itemId = itemId;
    setItemIdIsSet(true);
    return this;
  }

  public void unsetItemId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITEMID_ISSET_ID);
  }

  /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemId() {
    return EncodingUtils.testBit(__isset_bitfield, __ITEMID_ISSET_ID);
  }

  public void setItemIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITEMID_ISSET_ID, value);
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

  public SCReqConstellationLotteryMsg setItemList(List<com.ling9527.music.common.msg.auto.ConstellationLotteryItem> itemList) {
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
    case ITEM_ID:
      if (value == null) {
        unsetItemId();
      } else {
        setItemId((Integer)value);
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
    case ITEM_ID:
      return Integer.valueOf(getItemId());

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
    case ITEM_ID:
      return isSetItemId();
    case ITEM_LIST:
      return isSetItemList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCReqConstellationLotteryMsg)
      return this.equals((SCReqConstellationLotteryMsg)that);
    return false;
  }

  public boolean equals(SCReqConstellationLotteryMsg that) {
    if (that == null)
      return false;

    boolean this_present_itemId = true;
    boolean that_present_itemId = true;
    if (this_present_itemId || that_present_itemId) {
      if (!(this_present_itemId && that_present_itemId))
        return false;
      if (this.itemId != that.itemId)
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

  public int compareTo(SCReqConstellationLotteryMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCReqConstellationLotteryMsg typedOther = (SCReqConstellationLotteryMsg)other;

    lastComparison = Boolean.valueOf(isSetItemId()).compareTo(typedOther.isSetItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemId, typedOther.itemId);
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
    StringBuilder sb = new StringBuilder("SCReqConstellationLotteryMsg(");
    boolean first = true;

    sb.append("itemId:");
    sb.append(this.itemId);
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

  private static class SCReqConstellationLotteryMsgStandardSchemeFactory implements SchemeFactory {
    public SCReqConstellationLotteryMsgStandardScheme getScheme() {
      return new SCReqConstellationLotteryMsgStandardScheme();
    }
  }

  private static class SCReqConstellationLotteryMsgStandardScheme extends StandardScheme<SCReqConstellationLotteryMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCReqConstellationLotteryMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.itemId = iprot.readI32();
              struct.setItemIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ITEM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  com.ling9527.music.common.msg.auto.ConstellationLotteryItem _elem10; // required
                  _elem10 = new com.ling9527.music.common.msg.auto.ConstellationLotteryItem();
                  _elem10.read(iprot);
                  struct.itemList.add(_elem10);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCReqConstellationLotteryMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
      oprot.writeI32(struct.itemId);
      oprot.writeFieldEnd();
      if (struct.itemList != null) {
        oprot.writeFieldBegin(ITEM_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.itemList.size()));
          for (com.ling9527.music.common.msg.auto.ConstellationLotteryItem _iter11 : struct.itemList)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCReqConstellationLotteryMsgTupleSchemeFactory implements SchemeFactory {
    public SCReqConstellationLotteryMsgTupleScheme getScheme() {
      return new SCReqConstellationLotteryMsgTupleScheme();
    }
  }

  private static class SCReqConstellationLotteryMsgTupleScheme extends TupleScheme<SCReqConstellationLotteryMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCReqConstellationLotteryMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemId()) {
        optionals.set(0);
      }
      if (struct.isSetItemList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetItemId()) {
        oprot.writeI32(struct.itemId);
      }
      if (struct.isSetItemList()) {
        {
          oprot.writeI32(struct.itemList.size());
          for (com.ling9527.music.common.msg.auto.ConstellationLotteryItem _iter12 : struct.itemList)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCReqConstellationLotteryMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.itemId = iprot.readI32();
        struct.setItemIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.itemList = new ArrayList<com.ling9527.music.common.msg.auto.ConstellationLotteryItem>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            com.ling9527.music.common.msg.auto.ConstellationLotteryItem _elem15; // required
            _elem15 = new com.ling9527.music.common.msg.auto.ConstellationLotteryItem();
            _elem15.read(iprot);
            struct.itemList.add(_elem15);
          }
        }
        struct.setItemListIsSet(true);
      }
    }
  }

}

