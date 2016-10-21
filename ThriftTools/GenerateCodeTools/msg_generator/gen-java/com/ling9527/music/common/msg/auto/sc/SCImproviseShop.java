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
 * 即兴表演兑换商店信息
 */
public class SCImproviseShop implements org.apache.thrift.TBase<SCImproviseShop, SCImproviseShop._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCImproviseShop");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SHOP_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("shopItems", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCImproviseShopStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCImproviseShopTupleSchemeFactory());
  }

  /**
   * 即兴表演商店版本号
   */
  public int version; // required
  /**
   * 商品信息 key:商品id， val:可兑换次数
   */
  public Map<Integer,Byte> shopItems; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 即兴表演商店版本号
     */
    VERSION((short)1, "version"),
    /**
     * 商品信息 key:商品id， val:可兑换次数
     */
    SHOP_ITEMS((short)2, "shopItems");

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
        case 2: // SHOP_ITEMS
          return SHOP_ITEMS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SHOP_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("shopItems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCImproviseShop.class, metaDataMap);
  }

  public SCImproviseShop() {
  }

  public SCImproviseShop(
    int version,
    Map<Integer,Byte> shopItems)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.shopItems = shopItems;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCImproviseShop(SCImproviseShop other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    if (other.isSetShopItems()) {
      Map<Integer,Byte> __this__shopItems = new HashMap<Integer,Byte>();
      for (Map.Entry<Integer, Byte> other_element : other.shopItems.entrySet()) {

        Integer other_element_key = other_element.getKey();
        Byte other_element_value = other_element.getValue();

        Integer __this__shopItems_copy_key = other_element_key;

        Byte __this__shopItems_copy_value = other_element_value;

        __this__shopItems.put(__this__shopItems_copy_key, __this__shopItems_copy_value);
      }
      this.shopItems = __this__shopItems;
    }
  }

  public SCImproviseShop deepCopy() {
    return new SCImproviseShop(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    this.shopItems = null;
  }

  /**
   * 即兴表演商店版本号
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * 即兴表演商店版本号
   */
  public SCImproviseShop setVersion(int version) {
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

  public int getShopItemsSize() {
    return (this.shopItems == null) ? 0 : this.shopItems.size();
  }

  public void putToShopItems(int key, byte val) {
    if (this.shopItems == null) {
      this.shopItems = new HashMap<Integer,Byte>();
    }
    this.shopItems.put(key, val);
  }

  /**
   * 商品信息 key:商品id， val:可兑换次数
   */
  public Map<Integer,Byte> getShopItems() {
    return this.shopItems;
  }

  /**
   * 商品信息 key:商品id， val:可兑换次数
   */
  public SCImproviseShop setShopItems(Map<Integer,Byte> shopItems) {
    this.shopItems = shopItems;
    return this;
  }

  public void unsetShopItems() {
    this.shopItems = null;
  }

  /** Returns true if field shopItems is set (has been assigned a value) and false otherwise */
  public boolean isSetShopItems() {
    return this.shopItems != null;
  }

  public void setShopItemsIsSet(boolean value) {
    if (!value) {
      this.shopItems = null;
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

    case SHOP_ITEMS:
      if (value == null) {
        unsetShopItems();
      } else {
        setShopItems((Map<Integer,Byte>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Integer.valueOf(getVersion());

    case SHOP_ITEMS:
      return getShopItems();

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
    case SHOP_ITEMS:
      return isSetShopItems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCImproviseShop)
      return this.equals((SCImproviseShop)that);
    return false;
  }

  public boolean equals(SCImproviseShop that) {
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

    boolean this_present_shopItems = true && this.isSetShopItems();
    boolean that_present_shopItems = true && that.isSetShopItems();
    if (this_present_shopItems || that_present_shopItems) {
      if (!(this_present_shopItems && that_present_shopItems))
        return false;
      if (!this.shopItems.equals(that.shopItems))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCImproviseShop other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCImproviseShop typedOther = (SCImproviseShop)other;

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
    lastComparison = Boolean.valueOf(isSetShopItems()).compareTo(typedOther.isSetShopItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShopItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shopItems, typedOther.shopItems);
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
    StringBuilder sb = new StringBuilder("SCImproviseShop(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("shopItems:");
    if (this.shopItems == null) {
      sb.append("null");
    } else {
      sb.append(this.shopItems);
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

  private static class SCImproviseShopStandardSchemeFactory implements SchemeFactory {
    public SCImproviseShopStandardScheme getScheme() {
      return new SCImproviseShopStandardScheme();
    }
  }

  private static class SCImproviseShopStandardScheme extends StandardScheme<SCImproviseShop> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCImproviseShop struct) throws org.apache.thrift.TException {
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
          case 2: // SHOP_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.shopItems = new HashMap<Integer,Byte>(2*_map8.size);
                for (int _i9 = 0; _i9 < _map8.size; ++_i9)
                {
                  int _key10; // required
                  byte _val11; // required
                  _key10 = iprot.readI32();
                  _val11 = iprot.readByte();
                  struct.shopItems.put(_key10, _val11);
                }
                iprot.readMapEnd();
              }
              struct.setShopItemsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCImproviseShop struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      if (struct.shopItems != null) {
        oprot.writeFieldBegin(SHOP_ITEMS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.BYTE, struct.shopItems.size()));
          for (Map.Entry<Integer, Byte> _iter12 : struct.shopItems.entrySet())
          {
            oprot.writeI32(_iter12.getKey());
            oprot.writeByte(_iter12.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCImproviseShopTupleSchemeFactory implements SchemeFactory {
    public SCImproviseShopTupleScheme getScheme() {
      return new SCImproviseShopTupleScheme();
    }
  }

  private static class SCImproviseShopTupleScheme extends TupleScheme<SCImproviseShop> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCImproviseShop struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetShopItems()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetShopItems()) {
        {
          oprot.writeI32(struct.shopItems.size());
          for (Map.Entry<Integer, Byte> _iter13 : struct.shopItems.entrySet())
          {
            oprot.writeI32(_iter13.getKey());
            oprot.writeByte(_iter13.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCImproviseShop struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.BYTE, iprot.readI32());
          struct.shopItems = new HashMap<Integer,Byte>(2*_map14.size);
          for (int _i15 = 0; _i15 < _map14.size; ++_i15)
          {
            int _key16; // required
            byte _val17; // required
            _key16 = iprot.readI32();
            _val17 = iprot.readByte();
            struct.shopItems.put(_key16, _val17);
          }
        }
        struct.setShopItemsIsSet(true);
      }
    }
  }

}

