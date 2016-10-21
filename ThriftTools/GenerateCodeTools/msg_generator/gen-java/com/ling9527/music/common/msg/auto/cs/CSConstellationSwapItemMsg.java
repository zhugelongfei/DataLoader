/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto.cs;

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

public class CSConstellationSwapItemMsg implements org.apache.thrift.TBase<CSConstellationSwapItemMsg, CSConstellationSwapItemMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSConstellationSwapItemMsg");

  private static final org.apache.thrift.protocol.TField CONSTELLATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("constellationId", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField STAR_FIELD_DESC = new org.apache.thrift.protocol.TField("star", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField SEX_FIELD_DESC = new org.apache.thrift.protocol.TField("sex", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField ITEM_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("itemIndex", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TARGET_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetCharId", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSConstellationSwapItemMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSConstellationSwapItemMsgTupleSchemeFactory());
  }

  public byte constellationId; // required
  public short star; // required
  public byte sex; // required
  public int itemIndex; // required
  public long targetCharId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONSTELLATION_ID((short)1, "constellationId"),
    STAR((short)2, "star"),
    SEX((short)3, "sex"),
    ITEM_INDEX((short)4, "itemIndex"),
    TARGET_CHAR_ID((short)5, "targetCharId");

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
        case 1: // CONSTELLATION_ID
          return CONSTELLATION_ID;
        case 2: // STAR
          return STAR;
        case 3: // SEX
          return SEX;
        case 4: // ITEM_INDEX
          return ITEM_INDEX;
        case 5: // TARGET_CHAR_ID
          return TARGET_CHAR_ID;
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
  private static final int __CONSTELLATIONID_ISSET_ID = 0;
  private static final int __STAR_ISSET_ID = 1;
  private static final int __SEX_ISSET_ID = 2;
  private static final int __ITEMINDEX_ISSET_ID = 3;
  private static final int __TARGETCHARID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONSTELLATION_ID, new org.apache.thrift.meta_data.FieldMetaData("constellationId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.STAR, new org.apache.thrift.meta_data.FieldMetaData("star", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SEX, new org.apache.thrift.meta_data.FieldMetaData("sex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ITEM_INDEX, new org.apache.thrift.meta_data.FieldMetaData("itemIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TARGET_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("targetCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSConstellationSwapItemMsg.class, metaDataMap);
  }

  public CSConstellationSwapItemMsg() {
  }

  public CSConstellationSwapItemMsg(
    byte constellationId,
    short star,
    byte sex,
    int itemIndex,
    long targetCharId)
  {
    this();
    this.constellationId = constellationId;
    setConstellationIdIsSet(true);
    this.star = star;
    setStarIsSet(true);
    this.sex = sex;
    setSexIsSet(true);
    this.itemIndex = itemIndex;
    setItemIndexIsSet(true);
    this.targetCharId = targetCharId;
    setTargetCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSConstellationSwapItemMsg(CSConstellationSwapItemMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.constellationId = other.constellationId;
    this.star = other.star;
    this.sex = other.sex;
    this.itemIndex = other.itemIndex;
    this.targetCharId = other.targetCharId;
  }

  public CSConstellationSwapItemMsg deepCopy() {
    return new CSConstellationSwapItemMsg(this);
  }

  @Override
  public void clear() {
    setConstellationIdIsSet(false);
    this.constellationId = 0;
    setStarIsSet(false);
    this.star = 0;
    setSexIsSet(false);
    this.sex = 0;
    setItemIndexIsSet(false);
    this.itemIndex = 0;
    setTargetCharIdIsSet(false);
    this.targetCharId = 0;
  }

  public byte getConstellationId() {
    return this.constellationId;
  }

  public CSConstellationSwapItemMsg setConstellationId(byte constellationId) {
    this.constellationId = constellationId;
    setConstellationIdIsSet(true);
    return this;
  }

  public void unsetConstellationId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONSTELLATIONID_ISSET_ID);
  }

  /** Returns true if field constellationId is set (has been assigned a value) and false otherwise */
  public boolean isSetConstellationId() {
    return EncodingUtils.testBit(__isset_bitfield, __CONSTELLATIONID_ISSET_ID);
  }

  public void setConstellationIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONSTELLATIONID_ISSET_ID, value);
  }

  public short getStar() {
    return this.star;
  }

  public CSConstellationSwapItemMsg setStar(short star) {
    this.star = star;
    setStarIsSet(true);
    return this;
  }

  public void unsetStar() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STAR_ISSET_ID);
  }

  /** Returns true if field star is set (has been assigned a value) and false otherwise */
  public boolean isSetStar() {
    return EncodingUtils.testBit(__isset_bitfield, __STAR_ISSET_ID);
  }

  public void setStarIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STAR_ISSET_ID, value);
  }

  public byte getSex() {
    return this.sex;
  }

  public CSConstellationSwapItemMsg setSex(byte sex) {
    this.sex = sex;
    setSexIsSet(true);
    return this;
  }

  public void unsetSex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  /** Returns true if field sex is set (has been assigned a value) and false otherwise */
  public boolean isSetSex() {
    return EncodingUtils.testBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  public void setSexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEX_ISSET_ID, value);
  }

  public int getItemIndex() {
    return this.itemIndex;
  }

  public CSConstellationSwapItemMsg setItemIndex(int itemIndex) {
    this.itemIndex = itemIndex;
    setItemIndexIsSet(true);
    return this;
  }

  public void unsetItemIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITEMINDEX_ISSET_ID);
  }

  /** Returns true if field itemIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetItemIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __ITEMINDEX_ISSET_ID);
  }

  public void setItemIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITEMINDEX_ISSET_ID, value);
  }

  public long getTargetCharId() {
    return this.targetCharId;
  }

  public CSConstellationSwapItemMsg setTargetCharId(long targetCharId) {
    this.targetCharId = targetCharId;
    setTargetCharIdIsSet(true);
    return this;
  }

  public void unsetTargetCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TARGETCHARID_ISSET_ID);
  }

  /** Returns true if field targetCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __TARGETCHARID_ISSET_ID);
  }

  public void setTargetCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TARGETCHARID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONSTELLATION_ID:
      if (value == null) {
        unsetConstellationId();
      } else {
        setConstellationId((Byte)value);
      }
      break;

    case STAR:
      if (value == null) {
        unsetStar();
      } else {
        setStar((Short)value);
      }
      break;

    case SEX:
      if (value == null) {
        unsetSex();
      } else {
        setSex((Byte)value);
      }
      break;

    case ITEM_INDEX:
      if (value == null) {
        unsetItemIndex();
      } else {
        setItemIndex((Integer)value);
      }
      break;

    case TARGET_CHAR_ID:
      if (value == null) {
        unsetTargetCharId();
      } else {
        setTargetCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONSTELLATION_ID:
      return Byte.valueOf(getConstellationId());

    case STAR:
      return Short.valueOf(getStar());

    case SEX:
      return Byte.valueOf(getSex());

    case ITEM_INDEX:
      return Integer.valueOf(getItemIndex());

    case TARGET_CHAR_ID:
      return Long.valueOf(getTargetCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONSTELLATION_ID:
      return isSetConstellationId();
    case STAR:
      return isSetStar();
    case SEX:
      return isSetSex();
    case ITEM_INDEX:
      return isSetItemIndex();
    case TARGET_CHAR_ID:
      return isSetTargetCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSConstellationSwapItemMsg)
      return this.equals((CSConstellationSwapItemMsg)that);
    return false;
  }

  public boolean equals(CSConstellationSwapItemMsg that) {
    if (that == null)
      return false;

    boolean this_present_constellationId = true;
    boolean that_present_constellationId = true;
    if (this_present_constellationId || that_present_constellationId) {
      if (!(this_present_constellationId && that_present_constellationId))
        return false;
      if (this.constellationId != that.constellationId)
        return false;
    }

    boolean this_present_star = true;
    boolean that_present_star = true;
    if (this_present_star || that_present_star) {
      if (!(this_present_star && that_present_star))
        return false;
      if (this.star != that.star)
        return false;
    }

    boolean this_present_sex = true;
    boolean that_present_sex = true;
    if (this_present_sex || that_present_sex) {
      if (!(this_present_sex && that_present_sex))
        return false;
      if (this.sex != that.sex)
        return false;
    }

    boolean this_present_itemIndex = true;
    boolean that_present_itemIndex = true;
    if (this_present_itemIndex || that_present_itemIndex) {
      if (!(this_present_itemIndex && that_present_itemIndex))
        return false;
      if (this.itemIndex != that.itemIndex)
        return false;
    }

    boolean this_present_targetCharId = true;
    boolean that_present_targetCharId = true;
    if (this_present_targetCharId || that_present_targetCharId) {
      if (!(this_present_targetCharId && that_present_targetCharId))
        return false;
      if (this.targetCharId != that.targetCharId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSConstellationSwapItemMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSConstellationSwapItemMsg typedOther = (CSConstellationSwapItemMsg)other;

    lastComparison = Boolean.valueOf(isSetConstellationId()).compareTo(typedOther.isSetConstellationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConstellationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.constellationId, typedOther.constellationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStar()).compareTo(typedOther.isSetStar());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStar()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.star, typedOther.star);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSex()).compareTo(typedOther.isSetSex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sex, typedOther.sex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItemIndex()).compareTo(typedOther.isSetItemIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.itemIndex, typedOther.itemIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetCharId()).compareTo(typedOther.isSetTargetCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetCharId, typedOther.targetCharId);
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
    StringBuilder sb = new StringBuilder("CSConstellationSwapItemMsg(");
    boolean first = true;

    sb.append("constellationId:");
    sb.append(this.constellationId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("star:");
    sb.append(this.star);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sex:");
    sb.append(this.sex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemIndex:");
    sb.append(this.itemIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetCharId:");
    sb.append(this.targetCharId);
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

  private static class CSConstellationSwapItemMsgStandardSchemeFactory implements SchemeFactory {
    public CSConstellationSwapItemMsgStandardScheme getScheme() {
      return new CSConstellationSwapItemMsgStandardScheme();
    }
  }

  private static class CSConstellationSwapItemMsgStandardScheme extends StandardScheme<CSConstellationSwapItemMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSConstellationSwapItemMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONSTELLATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.constellationId = iprot.readByte();
              struct.setConstellationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STAR
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.star = iprot.readI16();
              struct.setStarIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.sex = iprot.readByte();
              struct.setSexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ITEM_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.itemIndex = iprot.readI32();
              struct.setItemIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TARGET_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.targetCharId = iprot.readI64();
              struct.setTargetCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSConstellationSwapItemMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CONSTELLATION_ID_FIELD_DESC);
      oprot.writeByte(struct.constellationId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STAR_FIELD_DESC);
      oprot.writeI16(struct.star);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SEX_FIELD_DESC);
      oprot.writeByte(struct.sex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ITEM_INDEX_FIELD_DESC);
      oprot.writeI32(struct.itemIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TARGET_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.targetCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSConstellationSwapItemMsgTupleSchemeFactory implements SchemeFactory {
    public CSConstellationSwapItemMsgTupleScheme getScheme() {
      return new CSConstellationSwapItemMsgTupleScheme();
    }
  }

  private static class CSConstellationSwapItemMsgTupleScheme extends TupleScheme<CSConstellationSwapItemMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSConstellationSwapItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConstellationId()) {
        optionals.set(0);
      }
      if (struct.isSetStar()) {
        optionals.set(1);
      }
      if (struct.isSetSex()) {
        optionals.set(2);
      }
      if (struct.isSetItemIndex()) {
        optionals.set(3);
      }
      if (struct.isSetTargetCharId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetConstellationId()) {
        oprot.writeByte(struct.constellationId);
      }
      if (struct.isSetStar()) {
        oprot.writeI16(struct.star);
      }
      if (struct.isSetSex()) {
        oprot.writeByte(struct.sex);
      }
      if (struct.isSetItemIndex()) {
        oprot.writeI32(struct.itemIndex);
      }
      if (struct.isSetTargetCharId()) {
        oprot.writeI64(struct.targetCharId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSConstellationSwapItemMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.constellationId = iprot.readByte();
        struct.setConstellationIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.star = iprot.readI16();
        struct.setStarIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sex = iprot.readByte();
        struct.setSexIsSet(true);
      }
      if (incoming.get(3)) {
        struct.itemIndex = iprot.readI32();
        struct.setItemIndexIsSet(true);
      }
      if (incoming.get(4)) {
        struct.targetCharId = iprot.readI64();
        struct.setTargetCharIdIsSet(true);
      }
    }
  }

}
