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

public class FuncRespParam26Old implements org.apache.thrift.TBase<FuncRespParam26Old, FuncRespParam26Old._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FuncRespParam26Old");

  private static final org.apache.thrift.protocol.TField SEND_CHAR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("sendCharName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RECV_CHAR_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("recvCharName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ITEM_PRIZE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("itemPrizeList", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FuncRespParam26OldStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FuncRespParam26OldTupleSchemeFactory());
  }

  public String sendCharName; // required
  public String recvCharName; // required
  public List<com.ling9527.music.common.msg.auto.ItemPrize> itemPrizeList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEND_CHAR_NAME((short)1, "sendCharName"),
    RECV_CHAR_NAME((short)2, "recvCharName"),
    ITEM_PRIZE_LIST((short)3, "itemPrizeList");

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
        case 1: // SEND_CHAR_NAME
          return SEND_CHAR_NAME;
        case 2: // RECV_CHAR_NAME
          return RECV_CHAR_NAME;
        case 3: // ITEM_PRIZE_LIST
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
    tmpMap.put(_Fields.SEND_CHAR_NAME, new org.apache.thrift.meta_data.FieldMetaData("sendCharName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECV_CHAR_NAME, new org.apache.thrift.meta_data.FieldMetaData("recvCharName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITEM_PRIZE_LIST, new org.apache.thrift.meta_data.FieldMetaData("itemPrizeList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.ItemPrize.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FuncRespParam26Old.class, metaDataMap);
  }

  public FuncRespParam26Old() {
  }

  public FuncRespParam26Old(
    String sendCharName,
    String recvCharName,
    List<com.ling9527.music.common.msg.auto.ItemPrize> itemPrizeList)
  {
    this();
    this.sendCharName = sendCharName;
    this.recvCharName = recvCharName;
    this.itemPrizeList = itemPrizeList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FuncRespParam26Old(FuncRespParam26Old other) {
    if (other.isSetSendCharName()) {
      this.sendCharName = other.sendCharName;
    }
    if (other.isSetRecvCharName()) {
      this.recvCharName = other.recvCharName;
    }
    if (other.isSetItemPrizeList()) {
      List<com.ling9527.music.common.msg.auto.ItemPrize> __this__itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>();
      for (com.ling9527.music.common.msg.auto.ItemPrize other_element : other.itemPrizeList) {
        __this__itemPrizeList.add(new com.ling9527.music.common.msg.auto.ItemPrize(other_element));
      }
      this.itemPrizeList = __this__itemPrizeList;
    }
  }

  public FuncRespParam26Old deepCopy() {
    return new FuncRespParam26Old(this);
  }

  @Override
  public void clear() {
    this.sendCharName = null;
    this.recvCharName = null;
    this.itemPrizeList = null;
  }

  public String getSendCharName() {
    return this.sendCharName;
  }

  public FuncRespParam26Old setSendCharName(String sendCharName) {
    this.sendCharName = sendCharName;
    return this;
  }

  public void unsetSendCharName() {
    this.sendCharName = null;
  }

  /** Returns true if field sendCharName is set (has been assigned a value) and false otherwise */
  public boolean isSetSendCharName() {
    return this.sendCharName != null;
  }

  public void setSendCharNameIsSet(boolean value) {
    if (!value) {
      this.sendCharName = null;
    }
  }

  public String getRecvCharName() {
    return this.recvCharName;
  }

  public FuncRespParam26Old setRecvCharName(String recvCharName) {
    this.recvCharName = recvCharName;
    return this;
  }

  public void unsetRecvCharName() {
    this.recvCharName = null;
  }

  /** Returns true if field recvCharName is set (has been assigned a value) and false otherwise */
  public boolean isSetRecvCharName() {
    return this.recvCharName != null;
  }

  public void setRecvCharNameIsSet(boolean value) {
    if (!value) {
      this.recvCharName = null;
    }
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

  public FuncRespParam26Old setItemPrizeList(List<com.ling9527.music.common.msg.auto.ItemPrize> itemPrizeList) {
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
    case SEND_CHAR_NAME:
      if (value == null) {
        unsetSendCharName();
      } else {
        setSendCharName((String)value);
      }
      break;

    case RECV_CHAR_NAME:
      if (value == null) {
        unsetRecvCharName();
      } else {
        setRecvCharName((String)value);
      }
      break;

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
    case SEND_CHAR_NAME:
      return getSendCharName();

    case RECV_CHAR_NAME:
      return getRecvCharName();

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
    case SEND_CHAR_NAME:
      return isSetSendCharName();
    case RECV_CHAR_NAME:
      return isSetRecvCharName();
    case ITEM_PRIZE_LIST:
      return isSetItemPrizeList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FuncRespParam26Old)
      return this.equals((FuncRespParam26Old)that);
    return false;
  }

  public boolean equals(FuncRespParam26Old that) {
    if (that == null)
      return false;

    boolean this_present_sendCharName = true && this.isSetSendCharName();
    boolean that_present_sendCharName = true && that.isSetSendCharName();
    if (this_present_sendCharName || that_present_sendCharName) {
      if (!(this_present_sendCharName && that_present_sendCharName))
        return false;
      if (!this.sendCharName.equals(that.sendCharName))
        return false;
    }

    boolean this_present_recvCharName = true && this.isSetRecvCharName();
    boolean that_present_recvCharName = true && that.isSetRecvCharName();
    if (this_present_recvCharName || that_present_recvCharName) {
      if (!(this_present_recvCharName && that_present_recvCharName))
        return false;
      if (!this.recvCharName.equals(that.recvCharName))
        return false;
    }

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

  public int compareTo(FuncRespParam26Old other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FuncRespParam26Old typedOther = (FuncRespParam26Old)other;

    lastComparison = Boolean.valueOf(isSetSendCharName()).compareTo(typedOther.isSetSendCharName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendCharName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sendCharName, typedOther.sendCharName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecvCharName()).compareTo(typedOther.isSetRecvCharName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecvCharName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recvCharName, typedOther.recvCharName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("FuncRespParam26Old(");
    boolean first = true;

    sb.append("sendCharName:");
    if (this.sendCharName == null) {
      sb.append("null");
    } else {
      sb.append(this.sendCharName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recvCharName:");
    if (this.recvCharName == null) {
      sb.append("null");
    } else {
      sb.append(this.recvCharName);
    }
    first = false;
    if (!first) sb.append(", ");
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

  private static class FuncRespParam26OldStandardSchemeFactory implements SchemeFactory {
    public FuncRespParam26OldStandardScheme getScheme() {
      return new FuncRespParam26OldStandardScheme();
    }
  }

  private static class FuncRespParam26OldStandardScheme extends StandardScheme<FuncRespParam26Old> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FuncRespParam26Old struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEND_CHAR_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sendCharName = iprot.readString();
              struct.setSendCharNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECV_CHAR_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recvCharName = iprot.readString();
              struct.setRecvCharNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ITEM_PRIZE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>(_list32.size);
                for (int _i33 = 0; _i33 < _list32.size; ++_i33)
                {
                  com.ling9527.music.common.msg.auto.ItemPrize _elem34; // required
                  _elem34 = new com.ling9527.music.common.msg.auto.ItemPrize();
                  _elem34.read(iprot);
                  struct.itemPrizeList.add(_elem34);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FuncRespParam26Old struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sendCharName != null) {
        oprot.writeFieldBegin(SEND_CHAR_NAME_FIELD_DESC);
        oprot.writeString(struct.sendCharName);
        oprot.writeFieldEnd();
      }
      if (struct.recvCharName != null) {
        oprot.writeFieldBegin(RECV_CHAR_NAME_FIELD_DESC);
        oprot.writeString(struct.recvCharName);
        oprot.writeFieldEnd();
      }
      if (struct.itemPrizeList != null) {
        oprot.writeFieldBegin(ITEM_PRIZE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.itemPrizeList.size()));
          for (com.ling9527.music.common.msg.auto.ItemPrize _iter35 : struct.itemPrizeList)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FuncRespParam26OldTupleSchemeFactory implements SchemeFactory {
    public FuncRespParam26OldTupleScheme getScheme() {
      return new FuncRespParam26OldTupleScheme();
    }
  }

  private static class FuncRespParam26OldTupleScheme extends TupleScheme<FuncRespParam26Old> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FuncRespParam26Old struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSendCharName()) {
        optionals.set(0);
      }
      if (struct.isSetRecvCharName()) {
        optionals.set(1);
      }
      if (struct.isSetItemPrizeList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSendCharName()) {
        oprot.writeString(struct.sendCharName);
      }
      if (struct.isSetRecvCharName()) {
        oprot.writeString(struct.recvCharName);
      }
      if (struct.isSetItemPrizeList()) {
        {
          oprot.writeI32(struct.itemPrizeList.size());
          for (com.ling9527.music.common.msg.auto.ItemPrize _iter36 : struct.itemPrizeList)
          {
            _iter36.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FuncRespParam26Old struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.sendCharName = iprot.readString();
        struct.setSendCharNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.recvCharName = iprot.readString();
        struct.setRecvCharNameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.itemPrizeList = new ArrayList<com.ling9527.music.common.msg.auto.ItemPrize>(_list37.size);
          for (int _i38 = 0; _i38 < _list37.size; ++_i38)
          {
            com.ling9527.music.common.msg.auto.ItemPrize _elem39; // required
            _elem39 = new com.ling9527.music.common.msg.auto.ItemPrize();
            _elem39.read(iprot);
            struct.itemPrizeList.add(_elem39);
          }
        }
        struct.setItemPrizeListIsSet(true);
      }
    }
  }

}

