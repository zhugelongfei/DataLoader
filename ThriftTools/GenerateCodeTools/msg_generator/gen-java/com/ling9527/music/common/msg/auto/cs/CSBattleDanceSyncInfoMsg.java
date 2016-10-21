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

public class CSBattleDanceSyncInfoMsg implements org.apache.thrift.TBase<CSBattleDanceSyncInfoMsg, CSBattleDanceSyncInfoMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSBattleDanceSyncInfoMsg");

  private static final org.apache.thrift.protocol.TField PART_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("partIndex", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField INPUT_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("inputIndex", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField INPUT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("inputType", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField KEY_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("keyResult", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField INPUT_DATA_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("inputDataIndex", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField CONTINUE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("continueCount", org.apache.thrift.protocol.TType.BYTE, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSBattleDanceSyncInfoMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSBattleDanceSyncInfoMsgTupleSchemeFactory());
  }

  public byte partIndex; // required
  public byte inputIndex; // required
  public byte inputType; // required
  /**
   * 1-miss 2-good 3-great 4-perfect
   */
  public byte keyResult; // required
  public byte inputDataIndex; // required
  public byte continueCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PART_INDEX((short)1, "partIndex"),
    INPUT_INDEX((short)2, "inputIndex"),
    INPUT_TYPE((short)3, "inputType"),
    /**
     * 1-miss 2-good 3-great 4-perfect
     */
    KEY_RESULT((short)4, "keyResult"),
    INPUT_DATA_INDEX((short)5, "inputDataIndex"),
    CONTINUE_COUNT((short)6, "continueCount");

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
        case 1: // PART_INDEX
          return PART_INDEX;
        case 2: // INPUT_INDEX
          return INPUT_INDEX;
        case 3: // INPUT_TYPE
          return INPUT_TYPE;
        case 4: // KEY_RESULT
          return KEY_RESULT;
        case 5: // INPUT_DATA_INDEX
          return INPUT_DATA_INDEX;
        case 6: // CONTINUE_COUNT
          return CONTINUE_COUNT;
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
  private static final int __PARTINDEX_ISSET_ID = 0;
  private static final int __INPUTINDEX_ISSET_ID = 1;
  private static final int __INPUTTYPE_ISSET_ID = 2;
  private static final int __KEYRESULT_ISSET_ID = 3;
  private static final int __INPUTDATAINDEX_ISSET_ID = 4;
  private static final int __CONTINUECOUNT_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PART_INDEX, new org.apache.thrift.meta_data.FieldMetaData("partIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.INPUT_INDEX, new org.apache.thrift.meta_data.FieldMetaData("inputIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.INPUT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("inputType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.KEY_RESULT, new org.apache.thrift.meta_data.FieldMetaData("keyResult", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.INPUT_DATA_INDEX, new org.apache.thrift.meta_data.FieldMetaData("inputDataIndex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CONTINUE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("continueCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSBattleDanceSyncInfoMsg.class, metaDataMap);
  }

  public CSBattleDanceSyncInfoMsg() {
  }

  public CSBattleDanceSyncInfoMsg(
    byte partIndex,
    byte inputIndex,
    byte inputType,
    byte keyResult,
    byte inputDataIndex,
    byte continueCount)
  {
    this();
    this.partIndex = partIndex;
    setPartIndexIsSet(true);
    this.inputIndex = inputIndex;
    setInputIndexIsSet(true);
    this.inputType = inputType;
    setInputTypeIsSet(true);
    this.keyResult = keyResult;
    setKeyResultIsSet(true);
    this.inputDataIndex = inputDataIndex;
    setInputDataIndexIsSet(true);
    this.continueCount = continueCount;
    setContinueCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSBattleDanceSyncInfoMsg(CSBattleDanceSyncInfoMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partIndex = other.partIndex;
    this.inputIndex = other.inputIndex;
    this.inputType = other.inputType;
    this.keyResult = other.keyResult;
    this.inputDataIndex = other.inputDataIndex;
    this.continueCount = other.continueCount;
  }

  public CSBattleDanceSyncInfoMsg deepCopy() {
    return new CSBattleDanceSyncInfoMsg(this);
  }

  @Override
  public void clear() {
    setPartIndexIsSet(false);
    this.partIndex = 0;
    setInputIndexIsSet(false);
    this.inputIndex = 0;
    setInputTypeIsSet(false);
    this.inputType = 0;
    setKeyResultIsSet(false);
    this.keyResult = 0;
    setInputDataIndexIsSet(false);
    this.inputDataIndex = 0;
    setContinueCountIsSet(false);
    this.continueCount = 0;
  }

  public byte getPartIndex() {
    return this.partIndex;
  }

  public CSBattleDanceSyncInfoMsg setPartIndex(byte partIndex) {
    this.partIndex = partIndex;
    setPartIndexIsSet(true);
    return this;
  }

  public void unsetPartIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTINDEX_ISSET_ID);
  }

  /** Returns true if field partIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetPartIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTINDEX_ISSET_ID);
  }

  public void setPartIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTINDEX_ISSET_ID, value);
  }

  public byte getInputIndex() {
    return this.inputIndex;
  }

  public CSBattleDanceSyncInfoMsg setInputIndex(byte inputIndex) {
    this.inputIndex = inputIndex;
    setInputIndexIsSet(true);
    return this;
  }

  public void unsetInputIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INPUTINDEX_ISSET_ID);
  }

  /** Returns true if field inputIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetInputIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __INPUTINDEX_ISSET_ID);
  }

  public void setInputIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INPUTINDEX_ISSET_ID, value);
  }

  public byte getInputType() {
    return this.inputType;
  }

  public CSBattleDanceSyncInfoMsg setInputType(byte inputType) {
    this.inputType = inputType;
    setInputTypeIsSet(true);
    return this;
  }

  public void unsetInputType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INPUTTYPE_ISSET_ID);
  }

  /** Returns true if field inputType is set (has been assigned a value) and false otherwise */
  public boolean isSetInputType() {
    return EncodingUtils.testBit(__isset_bitfield, __INPUTTYPE_ISSET_ID);
  }

  public void setInputTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INPUTTYPE_ISSET_ID, value);
  }

  /**
   * 1-miss 2-good 3-great 4-perfect
   */
  public byte getKeyResult() {
    return this.keyResult;
  }

  /**
   * 1-miss 2-good 3-great 4-perfect
   */
  public CSBattleDanceSyncInfoMsg setKeyResult(byte keyResult) {
    this.keyResult = keyResult;
    setKeyResultIsSet(true);
    return this;
  }

  public void unsetKeyResult() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __KEYRESULT_ISSET_ID);
  }

  /** Returns true if field keyResult is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyResult() {
    return EncodingUtils.testBit(__isset_bitfield, __KEYRESULT_ISSET_ID);
  }

  public void setKeyResultIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __KEYRESULT_ISSET_ID, value);
  }

  public byte getInputDataIndex() {
    return this.inputDataIndex;
  }

  public CSBattleDanceSyncInfoMsg setInputDataIndex(byte inputDataIndex) {
    this.inputDataIndex = inputDataIndex;
    setInputDataIndexIsSet(true);
    return this;
  }

  public void unsetInputDataIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INPUTDATAINDEX_ISSET_ID);
  }

  /** Returns true if field inputDataIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetInputDataIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __INPUTDATAINDEX_ISSET_ID);
  }

  public void setInputDataIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INPUTDATAINDEX_ISSET_ID, value);
  }

  public byte getContinueCount() {
    return this.continueCount;
  }

  public CSBattleDanceSyncInfoMsg setContinueCount(byte continueCount) {
    this.continueCount = continueCount;
    setContinueCountIsSet(true);
    return this;
  }

  public void unsetContinueCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONTINUECOUNT_ISSET_ID);
  }

  /** Returns true if field continueCount is set (has been assigned a value) and false otherwise */
  public boolean isSetContinueCount() {
    return EncodingUtils.testBit(__isset_bitfield, __CONTINUECOUNT_ISSET_ID);
  }

  public void setContinueCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONTINUECOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PART_INDEX:
      if (value == null) {
        unsetPartIndex();
      } else {
        setPartIndex((Byte)value);
      }
      break;

    case INPUT_INDEX:
      if (value == null) {
        unsetInputIndex();
      } else {
        setInputIndex((Byte)value);
      }
      break;

    case INPUT_TYPE:
      if (value == null) {
        unsetInputType();
      } else {
        setInputType((Byte)value);
      }
      break;

    case KEY_RESULT:
      if (value == null) {
        unsetKeyResult();
      } else {
        setKeyResult((Byte)value);
      }
      break;

    case INPUT_DATA_INDEX:
      if (value == null) {
        unsetInputDataIndex();
      } else {
        setInputDataIndex((Byte)value);
      }
      break;

    case CONTINUE_COUNT:
      if (value == null) {
        unsetContinueCount();
      } else {
        setContinueCount((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PART_INDEX:
      return Byte.valueOf(getPartIndex());

    case INPUT_INDEX:
      return Byte.valueOf(getInputIndex());

    case INPUT_TYPE:
      return Byte.valueOf(getInputType());

    case KEY_RESULT:
      return Byte.valueOf(getKeyResult());

    case INPUT_DATA_INDEX:
      return Byte.valueOf(getInputDataIndex());

    case CONTINUE_COUNT:
      return Byte.valueOf(getContinueCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PART_INDEX:
      return isSetPartIndex();
    case INPUT_INDEX:
      return isSetInputIndex();
    case INPUT_TYPE:
      return isSetInputType();
    case KEY_RESULT:
      return isSetKeyResult();
    case INPUT_DATA_INDEX:
      return isSetInputDataIndex();
    case CONTINUE_COUNT:
      return isSetContinueCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSBattleDanceSyncInfoMsg)
      return this.equals((CSBattleDanceSyncInfoMsg)that);
    return false;
  }

  public boolean equals(CSBattleDanceSyncInfoMsg that) {
    if (that == null)
      return false;

    boolean this_present_partIndex = true;
    boolean that_present_partIndex = true;
    if (this_present_partIndex || that_present_partIndex) {
      if (!(this_present_partIndex && that_present_partIndex))
        return false;
      if (this.partIndex != that.partIndex)
        return false;
    }

    boolean this_present_inputIndex = true;
    boolean that_present_inputIndex = true;
    if (this_present_inputIndex || that_present_inputIndex) {
      if (!(this_present_inputIndex && that_present_inputIndex))
        return false;
      if (this.inputIndex != that.inputIndex)
        return false;
    }

    boolean this_present_inputType = true;
    boolean that_present_inputType = true;
    if (this_present_inputType || that_present_inputType) {
      if (!(this_present_inputType && that_present_inputType))
        return false;
      if (this.inputType != that.inputType)
        return false;
    }

    boolean this_present_keyResult = true;
    boolean that_present_keyResult = true;
    if (this_present_keyResult || that_present_keyResult) {
      if (!(this_present_keyResult && that_present_keyResult))
        return false;
      if (this.keyResult != that.keyResult)
        return false;
    }

    boolean this_present_inputDataIndex = true;
    boolean that_present_inputDataIndex = true;
    if (this_present_inputDataIndex || that_present_inputDataIndex) {
      if (!(this_present_inputDataIndex && that_present_inputDataIndex))
        return false;
      if (this.inputDataIndex != that.inputDataIndex)
        return false;
    }

    boolean this_present_continueCount = true;
    boolean that_present_continueCount = true;
    if (this_present_continueCount || that_present_continueCount) {
      if (!(this_present_continueCount && that_present_continueCount))
        return false;
      if (this.continueCount != that.continueCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSBattleDanceSyncInfoMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSBattleDanceSyncInfoMsg typedOther = (CSBattleDanceSyncInfoMsg)other;

    lastComparison = Boolean.valueOf(isSetPartIndex()).compareTo(typedOther.isSetPartIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partIndex, typedOther.partIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputIndex()).compareTo(typedOther.isSetInputIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputIndex, typedOther.inputIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputType()).compareTo(typedOther.isSetInputType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputType, typedOther.inputType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeyResult()).compareTo(typedOther.isSetKeyResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyResult, typedOther.keyResult);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputDataIndex()).compareTo(typedOther.isSetInputDataIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputDataIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputDataIndex, typedOther.inputDataIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContinueCount()).compareTo(typedOther.isSetContinueCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinueCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continueCount, typedOther.continueCount);
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
    StringBuilder sb = new StringBuilder("CSBattleDanceSyncInfoMsg(");
    boolean first = true;

    sb.append("partIndex:");
    sb.append(this.partIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("inputIndex:");
    sb.append(this.inputIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("inputType:");
    sb.append(this.inputType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("keyResult:");
    sb.append(this.keyResult);
    first = false;
    if (!first) sb.append(", ");
    sb.append("inputDataIndex:");
    sb.append(this.inputDataIndex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("continueCount:");
    sb.append(this.continueCount);
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

  private static class CSBattleDanceSyncInfoMsgStandardSchemeFactory implements SchemeFactory {
    public CSBattleDanceSyncInfoMsgStandardScheme getScheme() {
      return new CSBattleDanceSyncInfoMsgStandardScheme();
    }
  }

  private static class CSBattleDanceSyncInfoMsgStandardScheme extends StandardScheme<CSBattleDanceSyncInfoMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSBattleDanceSyncInfoMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PART_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.partIndex = iprot.readByte();
              struct.setPartIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INPUT_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.inputIndex = iprot.readByte();
              struct.setInputIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INPUT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.inputType = iprot.readByte();
              struct.setInputTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // KEY_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.keyResult = iprot.readByte();
              struct.setKeyResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // INPUT_DATA_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.inputDataIndex = iprot.readByte();
              struct.setInputDataIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CONTINUE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.continueCount = iprot.readByte();
              struct.setContinueCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSBattleDanceSyncInfoMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PART_INDEX_FIELD_DESC);
      oprot.writeByte(struct.partIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INPUT_INDEX_FIELD_DESC);
      oprot.writeByte(struct.inputIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INPUT_TYPE_FIELD_DESC);
      oprot.writeByte(struct.inputType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(KEY_RESULT_FIELD_DESC);
      oprot.writeByte(struct.keyResult);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INPUT_DATA_INDEX_FIELD_DESC);
      oprot.writeByte(struct.inputDataIndex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CONTINUE_COUNT_FIELD_DESC);
      oprot.writeByte(struct.continueCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSBattleDanceSyncInfoMsgTupleSchemeFactory implements SchemeFactory {
    public CSBattleDanceSyncInfoMsgTupleScheme getScheme() {
      return new CSBattleDanceSyncInfoMsgTupleScheme();
    }
  }

  private static class CSBattleDanceSyncInfoMsgTupleScheme extends TupleScheme<CSBattleDanceSyncInfoMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSBattleDanceSyncInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPartIndex()) {
        optionals.set(0);
      }
      if (struct.isSetInputIndex()) {
        optionals.set(1);
      }
      if (struct.isSetInputType()) {
        optionals.set(2);
      }
      if (struct.isSetKeyResult()) {
        optionals.set(3);
      }
      if (struct.isSetInputDataIndex()) {
        optionals.set(4);
      }
      if (struct.isSetContinueCount()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPartIndex()) {
        oprot.writeByte(struct.partIndex);
      }
      if (struct.isSetInputIndex()) {
        oprot.writeByte(struct.inputIndex);
      }
      if (struct.isSetInputType()) {
        oprot.writeByte(struct.inputType);
      }
      if (struct.isSetKeyResult()) {
        oprot.writeByte(struct.keyResult);
      }
      if (struct.isSetInputDataIndex()) {
        oprot.writeByte(struct.inputDataIndex);
      }
      if (struct.isSetContinueCount()) {
        oprot.writeByte(struct.continueCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSBattleDanceSyncInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.partIndex = iprot.readByte();
        struct.setPartIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.inputIndex = iprot.readByte();
        struct.setInputIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.inputType = iprot.readByte();
        struct.setInputTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.keyResult = iprot.readByte();
        struct.setKeyResultIsSet(true);
      }
      if (incoming.get(4)) {
        struct.inputDataIndex = iprot.readByte();
        struct.setInputDataIndexIsSet(true);
      }
      if (incoming.get(5)) {
        struct.continueCount = iprot.readByte();
        struct.setContinueCountIsSet(true);
      }
    }
  }

}

