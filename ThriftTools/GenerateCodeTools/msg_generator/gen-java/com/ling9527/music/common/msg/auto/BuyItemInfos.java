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

public class BuyItemInfos implements org.apache.thrift.TBase<BuyItemInfos, BuyItemInfos._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuyItemInfos");

  private static final org.apache.thrift.protocol.TField ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("items", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField MONEY_PRIZE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("moneyPrizeList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuyItemInfosStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuyItemInfosTupleSchemeFactory());
  }

  public List<BuyItemInfo> items; // required
  public List<MoneyPrize> moneyPrizeList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEMS((short)1, "items"),
    MONEY_PRIZE_LIST((short)2, "moneyPrizeList");

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
        case 1: // ITEMS
          return ITEMS;
        case 2: // MONEY_PRIZE_LIST
          return MONEY_PRIZE_LIST;
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
    tmpMap.put(_Fields.ITEMS, new org.apache.thrift.meta_data.FieldMetaData("items", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuyItemInfo.class))));
    tmpMap.put(_Fields.MONEY_PRIZE_LIST, new org.apache.thrift.meta_data.FieldMetaData("moneyPrizeList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MoneyPrize.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuyItemInfos.class, metaDataMap);
  }

  public BuyItemInfos() {
  }

  public BuyItemInfos(
    List<BuyItemInfo> items,
    List<MoneyPrize> moneyPrizeList)
  {
    this();
    this.items = items;
    this.moneyPrizeList = moneyPrizeList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuyItemInfos(BuyItemInfos other) {
    if (other.isSetItems()) {
      List<BuyItemInfo> __this__items = new ArrayList<BuyItemInfo>();
      for (BuyItemInfo other_element : other.items) {
        __this__items.add(new BuyItemInfo(other_element));
      }
      this.items = __this__items;
    }
    if (other.isSetMoneyPrizeList()) {
      List<MoneyPrize> __this__moneyPrizeList = new ArrayList<MoneyPrize>();
      for (MoneyPrize other_element : other.moneyPrizeList) {
        __this__moneyPrizeList.add(new MoneyPrize(other_element));
      }
      this.moneyPrizeList = __this__moneyPrizeList;
    }
  }

  public BuyItemInfos deepCopy() {
    return new BuyItemInfos(this);
  }

  @Override
  public void clear() {
    this.items = null;
    this.moneyPrizeList = null;
  }

  public int getItemsSize() {
    return (this.items == null) ? 0 : this.items.size();
  }

  public java.util.Iterator<BuyItemInfo> getItemsIterator() {
    return (this.items == null) ? null : this.items.iterator();
  }

  public void addToItems(BuyItemInfo elem) {
    if (this.items == null) {
      this.items = new ArrayList<BuyItemInfo>();
    }
    this.items.add(elem);
  }

  public List<BuyItemInfo> getItems() {
    return this.items;
  }

  public BuyItemInfos setItems(List<BuyItemInfo> items) {
    this.items = items;
    return this;
  }

  public void unsetItems() {
    this.items = null;
  }

  /** Returns true if field items is set (has been assigned a value) and false otherwise */
  public boolean isSetItems() {
    return this.items != null;
  }

  public void setItemsIsSet(boolean value) {
    if (!value) {
      this.items = null;
    }
  }

  public int getMoneyPrizeListSize() {
    return (this.moneyPrizeList == null) ? 0 : this.moneyPrizeList.size();
  }

  public java.util.Iterator<MoneyPrize> getMoneyPrizeListIterator() {
    return (this.moneyPrizeList == null) ? null : this.moneyPrizeList.iterator();
  }

  public void addToMoneyPrizeList(MoneyPrize elem) {
    if (this.moneyPrizeList == null) {
      this.moneyPrizeList = new ArrayList<MoneyPrize>();
    }
    this.moneyPrizeList.add(elem);
  }

  public List<MoneyPrize> getMoneyPrizeList() {
    return this.moneyPrizeList;
  }

  public BuyItemInfos setMoneyPrizeList(List<MoneyPrize> moneyPrizeList) {
    this.moneyPrizeList = moneyPrizeList;
    return this;
  }

  public void unsetMoneyPrizeList() {
    this.moneyPrizeList = null;
  }

  /** Returns true if field moneyPrizeList is set (has been assigned a value) and false otherwise */
  public boolean isSetMoneyPrizeList() {
    return this.moneyPrizeList != null;
  }

  public void setMoneyPrizeListIsSet(boolean value) {
    if (!value) {
      this.moneyPrizeList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEMS:
      if (value == null) {
        unsetItems();
      } else {
        setItems((List<BuyItemInfo>)value);
      }
      break;

    case MONEY_PRIZE_LIST:
      if (value == null) {
        unsetMoneyPrizeList();
      } else {
        setMoneyPrizeList((List<MoneyPrize>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEMS:
      return getItems();

    case MONEY_PRIZE_LIST:
      return getMoneyPrizeList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEMS:
      return isSetItems();
    case MONEY_PRIZE_LIST:
      return isSetMoneyPrizeList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuyItemInfos)
      return this.equals((BuyItemInfos)that);
    return false;
  }

  public boolean equals(BuyItemInfos that) {
    if (that == null)
      return false;

    boolean this_present_items = true && this.isSetItems();
    boolean that_present_items = true && that.isSetItems();
    if (this_present_items || that_present_items) {
      if (!(this_present_items && that_present_items))
        return false;
      if (!this.items.equals(that.items))
        return false;
    }

    boolean this_present_moneyPrizeList = true && this.isSetMoneyPrizeList();
    boolean that_present_moneyPrizeList = true && that.isSetMoneyPrizeList();
    if (this_present_moneyPrizeList || that_present_moneyPrizeList) {
      if (!(this_present_moneyPrizeList && that_present_moneyPrizeList))
        return false;
      if (!this.moneyPrizeList.equals(that.moneyPrizeList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BuyItemInfos other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BuyItemInfos typedOther = (BuyItemInfos)other;

    lastComparison = Boolean.valueOf(isSetItems()).compareTo(typedOther.isSetItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.items, typedOther.items);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMoneyPrizeList()).compareTo(typedOther.isSetMoneyPrizeList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMoneyPrizeList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.moneyPrizeList, typedOther.moneyPrizeList);
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
    StringBuilder sb = new StringBuilder("BuyItemInfos(");
    boolean first = true;

    sb.append("items:");
    if (this.items == null) {
      sb.append("null");
    } else {
      sb.append(this.items);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("moneyPrizeList:");
    if (this.moneyPrizeList == null) {
      sb.append("null");
    } else {
      sb.append(this.moneyPrizeList);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuyItemInfosStandardSchemeFactory implements SchemeFactory {
    public BuyItemInfosStandardScheme getScheme() {
      return new BuyItemInfosStandardScheme();
    }
  }

  private static class BuyItemInfosStandardScheme extends StandardScheme<BuyItemInfos> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuyItemInfos struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list180 = iprot.readListBegin();
                struct.items = new ArrayList<BuyItemInfo>(_list180.size);
                for (int _i181 = 0; _i181 < _list180.size; ++_i181)
                {
                  BuyItemInfo _elem182; // required
                  _elem182 = new BuyItemInfo();
                  _elem182.read(iprot);
                  struct.items.add(_elem182);
                }
                iprot.readListEnd();
              }
              struct.setItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MONEY_PRIZE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list183 = iprot.readListBegin();
                struct.moneyPrizeList = new ArrayList<MoneyPrize>(_list183.size);
                for (int _i184 = 0; _i184 < _list183.size; ++_i184)
                {
                  MoneyPrize _elem185; // required
                  _elem185 = new MoneyPrize();
                  _elem185.read(iprot);
                  struct.moneyPrizeList.add(_elem185);
                }
                iprot.readListEnd();
              }
              struct.setMoneyPrizeListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuyItemInfos struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.items != null) {
        oprot.writeFieldBegin(ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.items.size()));
          for (BuyItemInfo _iter186 : struct.items)
          {
            _iter186.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.moneyPrizeList != null) {
        oprot.writeFieldBegin(MONEY_PRIZE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.moneyPrizeList.size()));
          for (MoneyPrize _iter187 : struct.moneyPrizeList)
          {
            _iter187.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuyItemInfosTupleSchemeFactory implements SchemeFactory {
    public BuyItemInfosTupleScheme getScheme() {
      return new BuyItemInfosTupleScheme();
    }
  }

  private static class BuyItemInfosTupleScheme extends TupleScheme<BuyItemInfos> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuyItemInfos struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItems()) {
        optionals.set(0);
      }
      if (struct.isSetMoneyPrizeList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetItems()) {
        {
          oprot.writeI32(struct.items.size());
          for (BuyItemInfo _iter188 : struct.items)
          {
            _iter188.write(oprot);
          }
        }
      }
      if (struct.isSetMoneyPrizeList()) {
        {
          oprot.writeI32(struct.moneyPrizeList.size());
          for (MoneyPrize _iter189 : struct.moneyPrizeList)
          {
            _iter189.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuyItemInfos struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list190 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.items = new ArrayList<BuyItemInfo>(_list190.size);
          for (int _i191 = 0; _i191 < _list190.size; ++_i191)
          {
            BuyItemInfo _elem192; // required
            _elem192 = new BuyItemInfo();
            _elem192.read(iprot);
            struct.items.add(_elem192);
          }
        }
        struct.setItemsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list193 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.moneyPrizeList = new ArrayList<MoneyPrize>(_list193.size);
          for (int _i194 = 0; _i194 < _list193.size; ++_i194)
          {
            MoneyPrize _elem195; // required
            _elem195 = new MoneyPrize();
            _elem195.read(iprot);
            struct.moneyPrizeList.add(_elem195);
          }
        }
        struct.setMoneyPrizeListIsSet(true);
      }
    }
  }

}
