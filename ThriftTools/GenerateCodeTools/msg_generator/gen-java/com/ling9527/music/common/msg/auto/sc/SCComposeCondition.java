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
 * 合成条件信息
 */
public class SCComposeCondition implements org.apache.thrift.TBase<SCComposeCondition, SCComposeCondition._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCComposeCondition");

  private static final org.apache.thrift.protocol.TField ITEM_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("itemType", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField COND_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("condInfos", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCComposeConditionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCComposeConditionTupleSchemeFactory());
  }

  /**
   * 1-服装 2-饰品 3-道具
   */
  public byte itemType; // required
  /**
   * key-messageId val-条件信息
   */
  public Map<Integer,ComposeCondInfo> condInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 1-服装 2-饰品 3-道具
     */
    ITEM_TYPE((short)1, "itemType"),
    /**
     * key-messageId val-条件信息
     */
    COND_INFOS((short)2, "condInfos");

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
        case 1: // ITEM_TYPE
          return ITEM_TYPE;
        case 2: // COND_INFOS
          return COND_INFOS;
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
  private static final int __ITEMTYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM_TYPE, new org.apache.thrift.meta_data.FieldMetaData("itemType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.COND_INFOS, new org.apache.thrift.meta_data.FieldMetaData("condInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ComposeCondInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCComposeCondition.class, metaDataMap);
  }

  public SCComposeCondition() {
  }

  public SCComposeCondition(
    byte itemType,
    Map<Integer,ComposeCondInfo> condInfos)
  {
    this();
    this.itemType = itemType;
    setItemTypeIsSet(true);
    this.condInfos = condInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCComposeCondition(SCComposeCondition other) {
    __isset_bitfield = other.__isset_bitfield;
    this.itemType = other.itemType;
    if (other.isSetCondInfos()) {
      Map<Integer,ComposeCondInfo> __this__condInfos = new HashMap<Integer,ComposeCondInfo>();
      for (Map.Entry<Integer, ComposeCondInfo> other_element : other.condInfos.entrySet()) {

        Integer other_element_key = other_element.getKey();
        ComposeCondInfo other_element_value = other_element.getValue();

        Integer __this__condInfos_copy_key = other_element_key;

        ComposeCondInfo __this__condInfos_copy_value = new ComposeCondInfo(other_element_value);

        __this__condInfos.put(__this__condInfos_copy_key, __this__condInfos_copy_value);
      }
      this.condInfos = __this__condInfos;
    }
  }

  public SCComposeCondition deepCopy() {
    return new SCComposeCondition(this);
  }

  @Override
  public void clear() {
    setItemTypeIsSet(false);
    this.itemType = 0;
    this.condInfos = null;
  }

  /**
   * 1-服装 2-饰品 3-道具
   */
  public byte getItemType() {
    return this.itemType;
  }

  /**
   * 1-服装 2-饰品 3-道具
   */
  public SCComposeCondition setItemType(byte itemType) {
    this.itemType = itemType;
    setItemTypeIsSet(true);
    return this;
  }

  public void unsetItemType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITEMTYPE_ISSET_ID);
  }

  /** Returns true if field itemType is set (has been assigned a value) and false otherwise */
  public boolean isSetItemType() {
    return EncodingUtils.testBit(__isset_bitfield, __ITEMTYPE_ISSET_ID);
  }

  public void setItemTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITEMTYPE_ISSET_ID, value);
  }

  public int getCondInfosSize() {
    return (this.condInfos == null) ? 0 : this.condInfos.size();
  }

  public void putToCondInfos(int key, ComposeCondInfo val) {
    if (this.condInfos == null) {
      this.condInfos = new HashMap<Integer,ComposeCondInfo>();
    }
    this.condInfos.put(key, val);
  }

  /**
   * key-messageId val-条件信息
   */
  public Map<Integer,ComposeCondInfo> getCondInfos() {
    return this.condInfos;
  }

  /**
   * key-messageId val-条件信息
   */
  public SCComposeCondition setCondInfos(Map<Integer,ComposeCondInfo> condInfos) {
    this.condInfos = condInfos;
    return this;
  }

  public void unsetCondInfos() {
    this.condInfos = null;
  }

  /** Returns true if field condInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetCondInfos() {
    return this.condInfos != null;
  }

  public void setCondInfosIsSet(boolean value) {
    if (!value) {
      this.condInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM_TYPE:
      if (value == null) {
        unsetItemType();
      } else {
        setItemType((Byte)value);
      }
      break;

    case COND_INFOS:
      if (value == null) {
        unsetCondInfos();
      } else {
        setCondInfos((Map<Integer,ComposeCondInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM_TYPE:
      return Byte.valueOf(getItemType());

    case COND_INFOS:
      return getCondInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM_TYPE:
      return isSetItemType();
    case COND_INFOS:
      return isSetCondInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCComposeCondition)
      return this.equals((SCComposeCondition)that);
    return false;
  }

  public boolean equals(SCComposeCondition that) {
    if (that == null)
      return false;

    boolean this_present_itemType = true;
    boolean that_present_itemType = true;
    if (this_present_itemType || that_present_itemType) {
      if (!(this_present_itemType && that_present_itemType))
        return false;
      if (this.itemType != that.itemType)
        return false;
    }

    boolean this_present_condInfos = true && this.isSetCondInfos();
    boolean that_present_condInfos = true && that.isSetCondInfos();
    if (this_present_condInfos || that_present_condInfos) {
      if (!(this_present_condInfos && that_present_condInfos))
        return false;
      if (!this.condInfos.equals(that.condInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCComposeCondition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCComposeCondition typedOther = (SCComposeCondition)other;

    lastComparison = Boolean.valueOf(isSetItemType()).compareTo(typedOther.isSetItemType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemType, typedOther.itemType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCondInfos()).compareTo(typedOther.isSetCondInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCondInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.condInfos, typedOther.condInfos);
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
    StringBuilder sb = new StringBuilder("SCComposeCondition(");
    boolean first = true;

    sb.append("itemType:");
    sb.append(this.itemType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("condInfos:");
    if (this.condInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.condInfos);
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

  private static class SCComposeConditionStandardSchemeFactory implements SchemeFactory {
    public SCComposeConditionStandardScheme getScheme() {
      return new SCComposeConditionStandardScheme();
    }
  }

  private static class SCComposeConditionStandardScheme extends StandardScheme<SCComposeCondition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCComposeCondition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.itemType = iprot.readByte();
              struct.setItemTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COND_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.condInfos = new HashMap<Integer,ComposeCondInfo>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  int _key2; // required
                  ComposeCondInfo _val3; // required
                  _key2 = iprot.readI32();
                  _val3 = new ComposeCondInfo();
                  _val3.read(iprot);
                  struct.condInfos.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setCondInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCComposeCondition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ITEM_TYPE_FIELD_DESC);
      oprot.writeByte(struct.itemType);
      oprot.writeFieldEnd();
      if (struct.condInfos != null) {
        oprot.writeFieldBegin(COND_INFOS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.condInfos.size()));
          for (Map.Entry<Integer, ComposeCondInfo> _iter4 : struct.condInfos.entrySet())
          {
            oprot.writeI32(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCComposeConditionTupleSchemeFactory implements SchemeFactory {
    public SCComposeConditionTupleScheme getScheme() {
      return new SCComposeConditionTupleScheme();
    }
  }

  private static class SCComposeConditionTupleScheme extends TupleScheme<SCComposeCondition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCComposeCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItemType()) {
        optionals.set(0);
      }
      if (struct.isSetCondInfos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetItemType()) {
        oprot.writeByte(struct.itemType);
      }
      if (struct.isSetCondInfos()) {
        {
          oprot.writeI32(struct.condInfos.size());
          for (Map.Entry<Integer, ComposeCondInfo> _iter5 : struct.condInfos.entrySet())
          {
            oprot.writeI32(_iter5.getKey());
            _iter5.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCComposeCondition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.itemType = iprot.readByte();
        struct.setItemTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.condInfos = new HashMap<Integer,ComposeCondInfo>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            int _key8; // required
            ComposeCondInfo _val9; // required
            _key8 = iprot.readI32();
            _val9 = new ComposeCondInfo();
            _val9.read(iprot);
            struct.condInfos.put(_key8, _val9);
          }
        }
        struct.setCondInfosIsSet(true);
      }
    }
  }

}

