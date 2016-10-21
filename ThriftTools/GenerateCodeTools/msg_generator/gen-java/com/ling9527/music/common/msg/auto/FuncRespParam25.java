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

public class FuncRespParam25 implements org.apache.thrift.TBase<FuncRespParam25, FuncRespParam25._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FuncRespParam25");

  private static final org.apache.thrift.protocol.TField ITEM_PRIZE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("itemPrizeList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FuncRespParam25StandardSchemeFactory());
    schemes.put(TupleScheme.class, new FuncRespParam25TupleSchemeFactory());
  }

  public List<com.ling9527.music.common.msg.auto.ItemPrize> itemPrizeList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ITEM_PRIZE_LIST((short)1, "itemPrizeList");

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
        case 1: // ITEM_PRIZE_LIST
          return ITEM_PRIZE_LIST;
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
    tmpMap.put(_Fields.ITEM_PRIZE_LIST, new org.apache.thrift.meta_data.FieldMetaData("itemPrizeList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.ItemPrize.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FuncRespParam25.class, metaDataMap);
  }

  public FuncRespParam25() {
  }

  public FuncRespParam25(
    List<com.ling9527.music.common.msg.auto.ItemPrize> itemPrizeList)
  {
    this();
    this.itemPrizeList = itemPrizeList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FuncRespParam25(FuncRespParam25 other) {
    if (other.isSetItemPrizeList()) {
      List<com.ling9527.music.common.msg.auto.ItemPrize> __this__itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>();
      for (com.ling9527.music.common.msg.auto.ItemPrize other_element : other.itemPrizeList) {
        __this__itemPrizeList.add(new com.ling9527.music.common.msg.auto.ItemPrize(other_element));
      }
      this.itemPrizeList = __this__itemPrizeList;
    }
  }

  public FuncRespParam25 deepCopy() {
    return new FuncRespParam25(this);
  }

  @Override
  public void clear() {
    this.itemPrizeList = null;
  }

  public int getItemPrizeListSize() {
    return (this.itemPrizeList == null) ? 0 : this.itemPrizeList.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.ItemPrize> getItemPrizeListIterator() {
    return (this.itemPrizeList == null) ? null : this.itemPrizeList.iterator();
  }

  public void addToItemPrizeList(com.ling9527.music.common.msg.auto.ItemPrize elem) {
    if (this.itemPrizeList == null) {
      this.itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>();
    }
    this.itemPrizeList.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.ItemPrize> getItemPrizeList() {
    return this.itemPrizeList;
  }

  public FuncRespParam25 setItemPrizeList(List<com.ling9527.music.common.msg.auto.ItemPrize> itemPrizeList) {
    this.itemPrizeList = itemPrizeList;
    return this;
  }

  public void unsetItemPrizeList() {
    this.itemPrizeList = null;
  }

  /** Returns true if field itemPrizeList is set (has been assigned a value) and false otherwise */
  public boolean isSetItemPrizeList() {
    return this.itemPrizeList != null;
  }

  public void setItemPrizeListIsSet(boolean value) {
    if (!value) {
      this.itemPrizeList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM_PRIZE_LIST:
      if (value == null) {
        unsetItemPrizeList();
      } else {
        setItemPrizeList((List<com.ling9527.music.common.msg.auto.ItemPrize>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_PRIZE_LIST:
      return getItemPrizeList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM_PRIZE_LIST:
      return isSetItemPrizeList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FuncRespParam25)
      return this.equals((FuncRespParam25)that);
    return false;
  }

  public boolean equals(FuncRespParam25 that) {
    if (that == null)
      return false;

    boolean this_present_itemPrizeList = true && this.isSetItemPrizeList();
    boolean that_present_itemPrizeList = true && that.isSetItemPrizeList();
    if (this_present_itemPrizeList || that_present_itemPrizeList) {
      if (!(this_present_itemPrizeList && that_present_itemPrizeList))
        return false;
      if (!this.itemPrizeList.equals(that.itemPrizeList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(FuncRespParam25 other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FuncRespParam25 typedOther = (FuncRespParam25)other;

    lastComparison = Boolean.valueOf(isSetItemPrizeList()).compareTo(typedOther.isSetItemPrizeList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemPrizeList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemPrizeList, typedOther.itemPrizeList);
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
    StringBuilder sb = new StringBuilder("FuncRespParam25(");
    boolean first = true;

    sb.append("itemPrizeList:");
    if (this.itemPrizeList == null) {
      sb.append("null");
    } else {
      sb.append(this.itemPrizeList);
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

  private static class FuncRespParam25StandardSchemeFactory implements SchemeFactory {
    public FuncRespParam25StandardScheme getScheme() {
      return new FuncRespParam25StandardScheme();
    }
  }

  private static class FuncRespParam25StandardScheme extends StandardScheme<FuncRespParam25> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FuncRespParam25 struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_PRIZE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  com.ling9527.music.common.msg.auto.ItemPrize _elem18; // required
                  _elem18 = new com.ling9527.music.common.msg.auto.ItemPrize();
                  _elem18.read(iprot);
                  struct.itemPrizeList.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setItemPrizeListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FuncRespParam25 struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.itemPrizeList != null) {
        oprot.writeFieldBegin(ITEM_PRIZE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.itemPrizeList.size()));
          for (com.ling9527.music.common.msg.auto.ItemPrize _iter19 : struct.itemPrizeList)
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

  private static class FuncRespParam25TupleSchemeFactory implements SchemeFactory {
    public FuncRespParam25TupleScheme getScheme() {
      return new FuncRespParam25TupleScheme();
    }
  }

  private static class FuncRespParam25TupleScheme extends TupleScheme<FuncRespParam25> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FuncRespParam25 struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemPrizeList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetItemPrizeList()) {
        {
          oprot.writeI32(struct.itemPrizeList.size());
          for (com.ling9527.music.common.msg.auto.ItemPrize _iter20 : struct.itemPrizeList)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FuncRespParam25 struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            com.ling9527.music.common.msg.auto.ItemPrize _elem23; // required
            _elem23 = new com.ling9527.music.common.msg.auto.ItemPrize();
            _elem23.read(iprot);
            struct.itemPrizeList.add(_elem23);
          }
        }
        struct.setItemPrizeListIsSet(true);
      }
    }
  }

}

