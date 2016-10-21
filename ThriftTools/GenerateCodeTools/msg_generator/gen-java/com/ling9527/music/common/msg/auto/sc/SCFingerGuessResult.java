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
 * 猜拳游戏结果（游戏双方接收）
 */
public class SCFingerGuessResult implements org.apache.thrift.TBase<SCFingerGuessResult, SCFingerGuessResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCFingerGuessResult");

  private static final org.apache.thrift.protocol.TField RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("result", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField AWARD_EXP_FIELD_DESC = new org.apache.thrift.protocol.TField("awardExp", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ACTION_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("actionIndex", org.apache.thrift.protocol.TType.BYTE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCFingerGuessResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCFingerGuessResultTupleSchemeFactory());
  }

  /**
   * 0-输 1-赢 2-平局
   */
  public byte result; // required
  /**
   * 奖励经验
   */
  public int awardExp; // required
  /**
   * 色子随到面 0 - 5
   */
  public byte actionIndex; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 0-输 1-赢 2-平局
     */
    RESULT((short)1, "result"),
    /**
     * 奖励经验
     */
    AWARD_EXP((short)2, "awardExp"),
    /**
     * 色子随到面 0 - 5
     */
    ACTION_INDEX((short)3, "actionIndex");

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
        case 1: // RESULT
          return RESULT;
        case 2: // AWARD_EXP
          return AWARD_EXP;
        case 3: // ACTION_INDEX
          return ACTION_INDEX;
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
  private static final int __RESULT_ISSET_ID = 0;
  private static final int __AWARDEXP_ISSET_ID = 1;
  private static final int __ACTIONINDEX_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ACTION_INDEX};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT, new org.apache.thrift.meta_data.FieldMetaData("result", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.AWARD_EXP, new org.apache.thrift.meta_data.FieldMetaData("awardExp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACTION_INDEX, new org.apache.thrift.meta_data.FieldMetaData("actionIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCFingerGuessResult.class, metaDataMap);
  }

  public SCFingerGuessResult() {
  }

  public SCFingerGuessResult(
    byte result,
    int awardExp)
  {
    this();
    this.result = result;
    setResultIsSet(true);
    this.awardExp = awardExp;
    setAwardExpIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCFingerGuessResult(SCFingerGuessResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.result = other.result;
    this.awardExp = other.awardExp;
    this.actionIndex = other.actionIndex;
  }

  public SCFingerGuessResult deepCopy() {
    return new SCFingerGuessResult(this);
  }

  @Override
  public void clear() {
    setResultIsSet(false);
    this.result = 0;
    setAwardExpIsSet(false);
    this.awardExp = 0;
    setActionIndexIsSet(false);
    this.actionIndex = 0;
  }

  /**
   * 0-输 1-赢 2-平局
   */
  public byte getResult() {
    return this.result;
  }

  /**
   * 0-输 1-赢 2-平局
   */
  public SCFingerGuessResult setResult(byte result) {
    this.result = result;
    setResultIsSet(true);
    return this;
  }

  public void unsetResult() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return EncodingUtils.testBit(__isset_bitfield, __RESULT_ISSET_ID);
  }

  public void setResultIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESULT_ISSET_ID, value);
  }

  /**
   * 奖励经验
   */
  public int getAwardExp() {
    return this.awardExp;
  }

  /**
   * 奖励经验
   */
  public SCFingerGuessResult setAwardExp(int awardExp) {
    this.awardExp = awardExp;
    setAwardExpIsSet(true);
    return this;
  }

  public void unsetAwardExp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AWARDEXP_ISSET_ID);
  }

  /** Returns true if field awardExp is set (has been assigned a value) and false otherwise */
  public boolean isSetAwardExp() {
    return EncodingUtils.testBit(__isset_bitfield, __AWARDEXP_ISSET_ID);
  }

  public void setAwardExpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AWARDEXP_ISSET_ID, value);
  }

  /**
   * 色子随到面 0 - 5
   */
  public byte getActionIndex() {
    return this.actionIndex;
  }

  /**
   * 色子随到面 0 - 5
   */
  public SCFingerGuessResult setActionIndex(byte actionIndex) {
    this.actionIndex = actionIndex;
    setActionIndexIsSet(true);
    return this;
  }

  public void unsetActionIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACTIONINDEX_ISSET_ID);
  }

  /** Returns true if field actionIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetActionIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __ACTIONINDEX_ISSET_ID);
  }

  public void setActionIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACTIONINDEX_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((Byte)value);
      }
      break;

    case AWARD_EXP:
      if (value == null) {
        unsetAwardExp();
      } else {
        setAwardExp((Integer)value);
      }
      break;

    case ACTION_INDEX:
      if (value == null) {
        unsetActionIndex();
      } else {
        setActionIndex((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT:
      return Byte.valueOf(getResult());

    case AWARD_EXP:
      return Integer.valueOf(getAwardExp());

    case ACTION_INDEX:
      return Byte.valueOf(getActionIndex());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT:
      return isSetResult();
    case AWARD_EXP:
      return isSetAwardExp();
    case ACTION_INDEX:
      return isSetActionIndex();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCFingerGuessResult)
      return this.equals((SCFingerGuessResult)that);
    return false;
  }

  public boolean equals(SCFingerGuessResult that) {
    if (that == null)
      return false;

    boolean this_present_result = true;
    boolean that_present_result = true;
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (this.result != that.result)
        return false;
    }

    boolean this_present_awardExp = true;
    boolean that_present_awardExp = true;
    if (this_present_awardExp || that_present_awardExp) {
      if (!(this_present_awardExp && that_present_awardExp))
        return false;
      if (this.awardExp != that.awardExp)
        return false;
    }

    boolean this_present_actionIndex = true && this.isSetActionIndex();
    boolean that_present_actionIndex = true && that.isSetActionIndex();
    if (this_present_actionIndex || that_present_actionIndex) {
      if (!(this_present_actionIndex && that_present_actionIndex))
        return false;
      if (this.actionIndex != that.actionIndex)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCFingerGuessResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCFingerGuessResult typedOther = (SCFingerGuessResult)other;

    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAwardExp()).compareTo(typedOther.isSetAwardExp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAwardExp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.awardExp, typedOther.awardExp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActionIndex()).compareTo(typedOther.isSetActionIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActionIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actionIndex, typedOther.actionIndex);
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
    StringBuilder sb = new StringBuilder("SCFingerGuessResult(");
    boolean first = true;

    sb.append("result:");
    sb.append(this.result);
    first = false;
    if (!first) sb.append(", ");
    sb.append("awardExp:");
    sb.append(this.awardExp);
    first = false;
    if (isSetActionIndex()) {
      if (!first) sb.append(", ");
      sb.append("actionIndex:");
      sb.append(this.actionIndex);
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

  private static class SCFingerGuessResultStandardSchemeFactory implements SchemeFactory {
    public SCFingerGuessResultStandardScheme getScheme() {
      return new SCFingerGuessResultStandardScheme();
    }
  }

  private static class SCFingerGuessResultStandardScheme extends StandardScheme<SCFingerGuessResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCFingerGuessResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.result = iprot.readByte();
              struct.setResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AWARD_EXP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.awardExp = iprot.readI32();
              struct.setAwardExpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTION_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.actionIndex = iprot.readByte();
              struct.setActionIndexIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCFingerGuessResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      oprot.writeByte(struct.result);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AWARD_EXP_FIELD_DESC);
      oprot.writeI32(struct.awardExp);
      oprot.writeFieldEnd();
      if (struct.isSetActionIndex()) {
        oprot.writeFieldBegin(ACTION_INDEX_FIELD_DESC);
        oprot.writeByte(struct.actionIndex);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCFingerGuessResultTupleSchemeFactory implements SchemeFactory {
    public SCFingerGuessResultTupleScheme getScheme() {
      return new SCFingerGuessResultTupleScheme();
    }
  }

  private static class SCFingerGuessResultTupleScheme extends TupleScheme<SCFingerGuessResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCFingerGuessResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResult()) {
        optionals.set(0);
      }
      if (struct.isSetAwardExp()) {
        optionals.set(1);
      }
      if (struct.isSetActionIndex()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetResult()) {
        oprot.writeByte(struct.result);
      }
      if (struct.isSetAwardExp()) {
        oprot.writeI32(struct.awardExp);
      }
      if (struct.isSetActionIndex()) {
        oprot.writeByte(struct.actionIndex);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCFingerGuessResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.result = iprot.readByte();
        struct.setResultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.awardExp = iprot.readI32();
        struct.setAwardExpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.actionIndex = iprot.readByte();
        struct.setActionIndexIsSet(true);
      }
    }
  }

}
