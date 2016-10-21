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

public class MusicRankPrize implements org.apache.thrift.TBase<MusicRankPrize, MusicRankPrize._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MusicRankPrize");

  private static final org.apache.thrift.protocol.TField RANK_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("rankDesc", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BUY_ITEM_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("buyItemInfos", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MusicRankPrizeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MusicRankPrizeTupleSchemeFactory());
  }

  public String rankDesc; // required
  public BuyItemInfos buyItemInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RANK_DESC((short)1, "rankDesc"),
    BUY_ITEM_INFOS((short)2, "buyItemInfos");

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
        case 1: // RANK_DESC
          return RANK_DESC;
        case 2: // BUY_ITEM_INFOS
          return BUY_ITEM_INFOS;
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
    tmpMap.put(_Fields.RANK_DESC, new org.apache.thrift.meta_data.FieldMetaData("rankDesc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUY_ITEM_INFOS, new org.apache.thrift.meta_data.FieldMetaData("buyItemInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuyItemInfos.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MusicRankPrize.class, metaDataMap);
  }

  public MusicRankPrize() {
  }

  public MusicRankPrize(
    String rankDesc,
    BuyItemInfos buyItemInfos)
  {
    this();
    this.rankDesc = rankDesc;
    this.buyItemInfos = buyItemInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MusicRankPrize(MusicRankPrize other) {
    if (other.isSetRankDesc()) {
      this.rankDesc = other.rankDesc;
    }
    if (other.isSetBuyItemInfos()) {
      this.buyItemInfos = new BuyItemInfos(other.buyItemInfos);
    }
  }

  public MusicRankPrize deepCopy() {
    return new MusicRankPrize(this);
  }

  @Override
  public void clear() {
    this.rankDesc = null;
    this.buyItemInfos = null;
  }

  public String getRankDesc() {
    return this.rankDesc;
  }

  public MusicRankPrize setRankDesc(String rankDesc) {
    this.rankDesc = rankDesc;
    return this;
  }

  public void unsetRankDesc() {
    this.rankDesc = null;
  }

  /** Returns true if field rankDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetRankDesc() {
    return this.rankDesc != null;
  }

  public void setRankDescIsSet(boolean value) {
    if (!value) {
      this.rankDesc = null;
    }
  }

  public BuyItemInfos getBuyItemInfos() {
    return this.buyItemInfos;
  }

  public MusicRankPrize setBuyItemInfos(BuyItemInfos buyItemInfos) {
    this.buyItemInfos = buyItemInfos;
    return this;
  }

  public void unsetBuyItemInfos() {
    this.buyItemInfos = null;
  }

  /** Returns true if field buyItemInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetBuyItemInfos() {
    return this.buyItemInfos != null;
  }

  public void setBuyItemInfosIsSet(boolean value) {
    if (!value) {
      this.buyItemInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RANK_DESC:
      if (value == null) {
        unsetRankDesc();
      } else {
        setRankDesc((String)value);
      }
      break;

    case BUY_ITEM_INFOS:
      if (value == null) {
        unsetBuyItemInfos();
      } else {
        setBuyItemInfos((BuyItemInfos)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RANK_DESC:
      return getRankDesc();

    case BUY_ITEM_INFOS:
      return getBuyItemInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RANK_DESC:
      return isSetRankDesc();
    case BUY_ITEM_INFOS:
      return isSetBuyItemInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MusicRankPrize)
      return this.equals((MusicRankPrize)that);
    return false;
  }

  public boolean equals(MusicRankPrize that) {
    if (that == null)
      return false;

    boolean this_present_rankDesc = true && this.isSetRankDesc();
    boolean that_present_rankDesc = true && that.isSetRankDesc();
    if (this_present_rankDesc || that_present_rankDesc) {
      if (!(this_present_rankDesc && that_present_rankDesc))
        return false;
      if (!this.rankDesc.equals(that.rankDesc))
        return false;
    }

    boolean this_present_buyItemInfos = true && this.isSetBuyItemInfos();
    boolean that_present_buyItemInfos = true && that.isSetBuyItemInfos();
    if (this_present_buyItemInfos || that_present_buyItemInfos) {
      if (!(this_present_buyItemInfos && that_present_buyItemInfos))
        return false;
      if (!this.buyItemInfos.equals(that.buyItemInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(MusicRankPrize other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MusicRankPrize typedOther = (MusicRankPrize)other;

    lastComparison = Boolean.valueOf(isSetRankDesc()).compareTo(typedOther.isSetRankDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRankDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rankDesc, typedOther.rankDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuyItemInfos()).compareTo(typedOther.isSetBuyItemInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuyItemInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buyItemInfos, typedOther.buyItemInfos);
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
    StringBuilder sb = new StringBuilder("MusicRankPrize(");
    boolean first = true;

    sb.append("rankDesc:");
    if (this.rankDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.rankDesc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buyItemInfos:");
    if (this.buyItemInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.buyItemInfos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buyItemInfos != null) {
      buyItemInfos.validate();
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

  private static class MusicRankPrizeStandardSchemeFactory implements SchemeFactory {
    public MusicRankPrizeStandardScheme getScheme() {
      return new MusicRankPrizeStandardScheme();
    }
  }

  private static class MusicRankPrizeStandardScheme extends StandardScheme<MusicRankPrize> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MusicRankPrize struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RANK_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rankDesc = iprot.readString();
              struct.setRankDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUY_ITEM_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buyItemInfos = new BuyItemInfos();
              struct.buyItemInfos.read(iprot);
              struct.setBuyItemInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MusicRankPrize struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.rankDesc != null) {
        oprot.writeFieldBegin(RANK_DESC_FIELD_DESC);
        oprot.writeString(struct.rankDesc);
        oprot.writeFieldEnd();
      }
      if (struct.buyItemInfos != null) {
        oprot.writeFieldBegin(BUY_ITEM_INFOS_FIELD_DESC);
        struct.buyItemInfos.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MusicRankPrizeTupleSchemeFactory implements SchemeFactory {
    public MusicRankPrizeTupleScheme getScheme() {
      return new MusicRankPrizeTupleScheme();
    }
  }

  private static class MusicRankPrizeTupleScheme extends TupleScheme<MusicRankPrize> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MusicRankPrize struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRankDesc()) {
        optionals.set(0);
      }
      if (struct.isSetBuyItemInfos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRankDesc()) {
        oprot.writeString(struct.rankDesc);
      }
      if (struct.isSetBuyItemInfos()) {
        struct.buyItemInfos.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MusicRankPrize struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.rankDesc = iprot.readString();
        struct.setRankDescIsSet(true);
      }
      if (incoming.get(1)) {
        struct.buyItemInfos = new BuyItemInfos();
        struct.buyItemInfos.read(iprot);
        struct.setBuyItemInfosIsSet(true);
      }
    }
  }

}

