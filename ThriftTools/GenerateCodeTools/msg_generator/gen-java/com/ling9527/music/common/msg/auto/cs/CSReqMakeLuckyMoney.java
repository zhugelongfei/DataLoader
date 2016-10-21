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

/**
 * 请求发红包
 */
public class CSReqMakeLuckyMoney implements org.apache.thrift.TBase<CSReqMakeLuckyMoney, CSReqMakeLuckyMoney._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSReqMakeLuckyMoney");

  private static final org.apache.thrift.protocol.TField LUCKY_MONEY_AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("luckyMoneyAmount", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LUCKY_MONEY_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("luckyMoneyNumber", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LUCKY_MONEY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("luckyMoneyType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField WORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("words", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("charId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField CURRENY_AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("currenyAmount", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSReqMakeLuckyMoneyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSReqMakeLuckyMoneyTupleSchemeFactory());
  }

  /**
   * 红包金额大小
   */
  public int luckyMoneyAmount; // required
  /**
   * 红包个数
   */
  public int luckyMoneyNumber; // required
  /**
   * 红包类型
   * 
   * @see com.ling9527.music.common.msg.auto.LuckyMoneyType
   */
  public com.ling9527.music.common.msg.auto.LuckyMoneyType luckyMoneyType; // required
  /**
   * 红包寄语
   */
  public String words; // required
  /**
   * 收红包角色id
   */
  public long charId; // optional
  /**
   * 货币数量
   */
  public int currenyAmount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 红包金额大小
     */
    LUCKY_MONEY_AMOUNT((short)1, "luckyMoneyAmount"),
    /**
     * 红包个数
     */
    LUCKY_MONEY_NUMBER((short)2, "luckyMoneyNumber"),
    /**
     * 红包类型
     * 
     * @see com.ling9527.music.common.msg.auto.LuckyMoneyType
     */
    LUCKY_MONEY_TYPE((short)3, "luckyMoneyType"),
    /**
     * 红包寄语
     */
    WORDS((short)4, "words"),
    /**
     * 收红包角色id
     */
    CHAR_ID((short)5, "charId"),
    /**
     * 货币数量
     */
    CURRENY_AMOUNT((short)6, "currenyAmount");

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
        case 1: // LUCKY_MONEY_AMOUNT
          return LUCKY_MONEY_AMOUNT;
        case 2: // LUCKY_MONEY_NUMBER
          return LUCKY_MONEY_NUMBER;
        case 3: // LUCKY_MONEY_TYPE
          return LUCKY_MONEY_TYPE;
        case 4: // WORDS
          return WORDS;
        case 5: // CHAR_ID
          return CHAR_ID;
        case 6: // CURRENY_AMOUNT
          return CURRENY_AMOUNT;
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
  private static final int __LUCKYMONEYAMOUNT_ISSET_ID = 0;
  private static final int __LUCKYMONEYNUMBER_ISSET_ID = 1;
  private static final int __CHARID_ISSET_ID = 2;
  private static final int __CURRENYAMOUNT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CHAR_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LUCKY_MONEY_AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("luckyMoneyAmount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LUCKY_MONEY_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("luckyMoneyNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LUCKY_MONEY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("luckyMoneyType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.LuckyMoneyType.class)));
    tmpMap.put(_Fields.WORDS, new org.apache.thrift.meta_data.FieldMetaData("words", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("charId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CURRENY_AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("currenyAmount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSReqMakeLuckyMoney.class, metaDataMap);
  }

  public CSReqMakeLuckyMoney() {
  }

  public CSReqMakeLuckyMoney(
    int luckyMoneyAmount,
    int luckyMoneyNumber,
    com.ling9527.music.common.msg.auto.LuckyMoneyType luckyMoneyType,
    String words,
    int currenyAmount)
  {
    this();
    this.luckyMoneyAmount = luckyMoneyAmount;
    setLuckyMoneyAmountIsSet(true);
    this.luckyMoneyNumber = luckyMoneyNumber;
    setLuckyMoneyNumberIsSet(true);
    this.luckyMoneyType = luckyMoneyType;
    this.words = words;
    this.currenyAmount = currenyAmount;
    setCurrenyAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSReqMakeLuckyMoney(CSReqMakeLuckyMoney other) {
    __isset_bitfield = other.__isset_bitfield;
    this.luckyMoneyAmount = other.luckyMoneyAmount;
    this.luckyMoneyNumber = other.luckyMoneyNumber;
    if (other.isSetLuckyMoneyType()) {
      this.luckyMoneyType = other.luckyMoneyType;
    }
    if (other.isSetWords()) {
      this.words = other.words;
    }
    this.charId = other.charId;
    this.currenyAmount = other.currenyAmount;
  }

  public CSReqMakeLuckyMoney deepCopy() {
    return new CSReqMakeLuckyMoney(this);
  }

  @Override
  public void clear() {
    setLuckyMoneyAmountIsSet(false);
    this.luckyMoneyAmount = 0;
    setLuckyMoneyNumberIsSet(false);
    this.luckyMoneyNumber = 0;
    this.luckyMoneyType = null;
    this.words = null;
    setCharIdIsSet(false);
    this.charId = 0;
    setCurrenyAmountIsSet(false);
    this.currenyAmount = 0;
  }

  /**
   * 红包金额大小
   */
  public int getLuckyMoneyAmount() {
    return this.luckyMoneyAmount;
  }

  /**
   * 红包金额大小
   */
  public CSReqMakeLuckyMoney setLuckyMoneyAmount(int luckyMoneyAmount) {
    this.luckyMoneyAmount = luckyMoneyAmount;
    setLuckyMoneyAmountIsSet(true);
    return this;
  }

  public void unsetLuckyMoneyAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LUCKYMONEYAMOUNT_ISSET_ID);
  }

  /** Returns true if field luckyMoneyAmount is set (has been assigned a value) and false otherwise */
  public boolean isSetLuckyMoneyAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __LUCKYMONEYAMOUNT_ISSET_ID);
  }

  public void setLuckyMoneyAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LUCKYMONEYAMOUNT_ISSET_ID, value);
  }

  /**
   * 红包个数
   */
  public int getLuckyMoneyNumber() {
    return this.luckyMoneyNumber;
  }

  /**
   * 红包个数
   */
  public CSReqMakeLuckyMoney setLuckyMoneyNumber(int luckyMoneyNumber) {
    this.luckyMoneyNumber = luckyMoneyNumber;
    setLuckyMoneyNumberIsSet(true);
    return this;
  }

  public void unsetLuckyMoneyNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LUCKYMONEYNUMBER_ISSET_ID);
  }

  /** Returns true if field luckyMoneyNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetLuckyMoneyNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __LUCKYMONEYNUMBER_ISSET_ID);
  }

  public void setLuckyMoneyNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LUCKYMONEYNUMBER_ISSET_ID, value);
  }

  /**
   * 红包类型
   * 
   * @see com.ling9527.music.common.msg.auto.LuckyMoneyType
   */
  public com.ling9527.music.common.msg.auto.LuckyMoneyType getLuckyMoneyType() {
    return this.luckyMoneyType;
  }

  /**
   * 红包类型
   * 
   * @see com.ling9527.music.common.msg.auto.LuckyMoneyType
   */
  public CSReqMakeLuckyMoney setLuckyMoneyType(com.ling9527.music.common.msg.auto.LuckyMoneyType luckyMoneyType) {
    this.luckyMoneyType = luckyMoneyType;
    return this;
  }

  public void unsetLuckyMoneyType() {
    this.luckyMoneyType = null;
  }

  /** Returns true if field luckyMoneyType is set (has been assigned a value) and false otherwise */
  public boolean isSetLuckyMoneyType() {
    return this.luckyMoneyType != null;
  }

  public void setLuckyMoneyTypeIsSet(boolean value) {
    if (!value) {
      this.luckyMoneyType = null;
    }
  }

  /**
   * 红包寄语
   */
  public String getWords() {
    return this.words;
  }

  /**
   * 红包寄语
   */
  public CSReqMakeLuckyMoney setWords(String words) {
    this.words = words;
    return this;
  }

  public void unsetWords() {
    this.words = null;
  }

  /** Returns true if field words is set (has been assigned a value) and false otherwise */
  public boolean isSetWords() {
    return this.words != null;
  }

  public void setWordsIsSet(boolean value) {
    if (!value) {
      this.words = null;
    }
  }

  /**
   * 收红包角色id
   */
  public long getCharId() {
    return this.charId;
  }

  /**
   * 收红包角色id
   */
  public CSReqMakeLuckyMoney setCharId(long charId) {
    this.charId = charId;
    setCharIdIsSet(true);
    return this;
  }

  public void unsetCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  /** Returns true if field charId is set (has been assigned a value) and false otherwise */
  public boolean isSetCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  public void setCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARID_ISSET_ID, value);
  }

  /**
   * 货币数量
   */
  public int getCurrenyAmount() {
    return this.currenyAmount;
  }

  /**
   * 货币数量
   */
  public CSReqMakeLuckyMoney setCurrenyAmount(int currenyAmount) {
    this.currenyAmount = currenyAmount;
    setCurrenyAmountIsSet(true);
    return this;
  }

  public void unsetCurrenyAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURRENYAMOUNT_ISSET_ID);
  }

  /** Returns true if field currenyAmount is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrenyAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __CURRENYAMOUNT_ISSET_ID);
  }

  public void setCurrenyAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURRENYAMOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LUCKY_MONEY_AMOUNT:
      if (value == null) {
        unsetLuckyMoneyAmount();
      } else {
        setLuckyMoneyAmount((Integer)value);
      }
      break;

    case LUCKY_MONEY_NUMBER:
      if (value == null) {
        unsetLuckyMoneyNumber();
      } else {
        setLuckyMoneyNumber((Integer)value);
      }
      break;

    case LUCKY_MONEY_TYPE:
      if (value == null) {
        unsetLuckyMoneyType();
      } else {
        setLuckyMoneyType((com.ling9527.music.common.msg.auto.LuckyMoneyType)value);
      }
      break;

    case WORDS:
      if (value == null) {
        unsetWords();
      } else {
        setWords((String)value);
      }
      break;

    case CHAR_ID:
      if (value == null) {
        unsetCharId();
      } else {
        setCharId((Long)value);
      }
      break;

    case CURRENY_AMOUNT:
      if (value == null) {
        unsetCurrenyAmount();
      } else {
        setCurrenyAmount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LUCKY_MONEY_AMOUNT:
      return Integer.valueOf(getLuckyMoneyAmount());

    case LUCKY_MONEY_NUMBER:
      return Integer.valueOf(getLuckyMoneyNumber());

    case LUCKY_MONEY_TYPE:
      return getLuckyMoneyType();

    case WORDS:
      return getWords();

    case CHAR_ID:
      return Long.valueOf(getCharId());

    case CURRENY_AMOUNT:
      return Integer.valueOf(getCurrenyAmount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LUCKY_MONEY_AMOUNT:
      return isSetLuckyMoneyAmount();
    case LUCKY_MONEY_NUMBER:
      return isSetLuckyMoneyNumber();
    case LUCKY_MONEY_TYPE:
      return isSetLuckyMoneyType();
    case WORDS:
      return isSetWords();
    case CHAR_ID:
      return isSetCharId();
    case CURRENY_AMOUNT:
      return isSetCurrenyAmount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSReqMakeLuckyMoney)
      return this.equals((CSReqMakeLuckyMoney)that);
    return false;
  }

  public boolean equals(CSReqMakeLuckyMoney that) {
    if (that == null)
      return false;

    boolean this_present_luckyMoneyAmount = true;
    boolean that_present_luckyMoneyAmount = true;
    if (this_present_luckyMoneyAmount || that_present_luckyMoneyAmount) {
      if (!(this_present_luckyMoneyAmount && that_present_luckyMoneyAmount))
        return false;
      if (this.luckyMoneyAmount != that.luckyMoneyAmount)
        return false;
    }

    boolean this_present_luckyMoneyNumber = true;
    boolean that_present_luckyMoneyNumber = true;
    if (this_present_luckyMoneyNumber || that_present_luckyMoneyNumber) {
      if (!(this_present_luckyMoneyNumber && that_present_luckyMoneyNumber))
        return false;
      if (this.luckyMoneyNumber != that.luckyMoneyNumber)
        return false;
    }

    boolean this_present_luckyMoneyType = true && this.isSetLuckyMoneyType();
    boolean that_present_luckyMoneyType = true && that.isSetLuckyMoneyType();
    if (this_present_luckyMoneyType || that_present_luckyMoneyType) {
      if (!(this_present_luckyMoneyType && that_present_luckyMoneyType))
        return false;
      if (!this.luckyMoneyType.equals(that.luckyMoneyType))
        return false;
    }

    boolean this_present_words = true && this.isSetWords();
    boolean that_present_words = true && that.isSetWords();
    if (this_present_words || that_present_words) {
      if (!(this_present_words && that_present_words))
        return false;
      if (!this.words.equals(that.words))
        return false;
    }

    boolean this_present_charId = true && this.isSetCharId();
    boolean that_present_charId = true && that.isSetCharId();
    if (this_present_charId || that_present_charId) {
      if (!(this_present_charId && that_present_charId))
        return false;
      if (this.charId != that.charId)
        return false;
    }

    boolean this_present_currenyAmount = true;
    boolean that_present_currenyAmount = true;
    if (this_present_currenyAmount || that_present_currenyAmount) {
      if (!(this_present_currenyAmount && that_present_currenyAmount))
        return false;
      if (this.currenyAmount != that.currenyAmount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSReqMakeLuckyMoney other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSReqMakeLuckyMoney typedOther = (CSReqMakeLuckyMoney)other;

    lastComparison = Boolean.valueOf(isSetLuckyMoneyAmount()).compareTo(typedOther.isSetLuckyMoneyAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuckyMoneyAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.luckyMoneyAmount, typedOther.luckyMoneyAmount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLuckyMoneyNumber()).compareTo(typedOther.isSetLuckyMoneyNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuckyMoneyNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.luckyMoneyNumber, typedOther.luckyMoneyNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLuckyMoneyType()).compareTo(typedOther.isSetLuckyMoneyType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuckyMoneyType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.luckyMoneyType, typedOther.luckyMoneyType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWords()).compareTo(typedOther.isSetWords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.words, typedOther.words);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCharId()).compareTo(typedOther.isSetCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.charId, typedOther.charId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrenyAmount()).compareTo(typedOther.isSetCurrenyAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrenyAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currenyAmount, typedOther.currenyAmount);
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
    StringBuilder sb = new StringBuilder("CSReqMakeLuckyMoney(");
    boolean first = true;

    sb.append("luckyMoneyAmount:");
    sb.append(this.luckyMoneyAmount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("luckyMoneyNumber:");
    sb.append(this.luckyMoneyNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("luckyMoneyType:");
    if (this.luckyMoneyType == null) {
      sb.append("null");
    } else {
      sb.append(this.luckyMoneyType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("words:");
    if (this.words == null) {
      sb.append("null");
    } else {
      sb.append(this.words);
    }
    first = false;
    if (isSetCharId()) {
      if (!first) sb.append(", ");
      sb.append("charId:");
      sb.append(this.charId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("currenyAmount:");
    sb.append(this.currenyAmount);
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

  private static class CSReqMakeLuckyMoneyStandardSchemeFactory implements SchemeFactory {
    public CSReqMakeLuckyMoneyStandardScheme getScheme() {
      return new CSReqMakeLuckyMoneyStandardScheme();
    }
  }

  private static class CSReqMakeLuckyMoneyStandardScheme extends StandardScheme<CSReqMakeLuckyMoney> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSReqMakeLuckyMoney struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LUCKY_MONEY_AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.luckyMoneyAmount = iprot.readI32();
              struct.setLuckyMoneyAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LUCKY_MONEY_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.luckyMoneyNumber = iprot.readI32();
              struct.setLuckyMoneyNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LUCKY_MONEY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.luckyMoneyType = com.ling9527.music.common.msg.auto.LuckyMoneyType.findByValue(iprot.readI32());
              struct.setLuckyMoneyTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.words = iprot.readString();
              struct.setWordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.charId = iprot.readI64();
              struct.setCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CURRENY_AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.currenyAmount = iprot.readI32();
              struct.setCurrenyAmountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSReqMakeLuckyMoney struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LUCKY_MONEY_AMOUNT_FIELD_DESC);
      oprot.writeI32(struct.luckyMoneyAmount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LUCKY_MONEY_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.luckyMoneyNumber);
      oprot.writeFieldEnd();
      if (struct.luckyMoneyType != null) {
        oprot.writeFieldBegin(LUCKY_MONEY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.luckyMoneyType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.words != null) {
        oprot.writeFieldBegin(WORDS_FIELD_DESC);
        oprot.writeString(struct.words);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCharId()) {
        oprot.writeFieldBegin(CHAR_ID_FIELD_DESC);
        oprot.writeI64(struct.charId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CURRENY_AMOUNT_FIELD_DESC);
      oprot.writeI32(struct.currenyAmount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSReqMakeLuckyMoneyTupleSchemeFactory implements SchemeFactory {
    public CSReqMakeLuckyMoneyTupleScheme getScheme() {
      return new CSReqMakeLuckyMoneyTupleScheme();
    }
  }

  private static class CSReqMakeLuckyMoneyTupleScheme extends TupleScheme<CSReqMakeLuckyMoney> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSReqMakeLuckyMoney struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLuckyMoneyAmount()) {
        optionals.set(0);
      }
      if (struct.isSetLuckyMoneyNumber()) {
        optionals.set(1);
      }
      if (struct.isSetLuckyMoneyType()) {
        optionals.set(2);
      }
      if (struct.isSetWords()) {
        optionals.set(3);
      }
      if (struct.isSetCharId()) {
        optionals.set(4);
      }
      if (struct.isSetCurrenyAmount()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetLuckyMoneyAmount()) {
        oprot.writeI32(struct.luckyMoneyAmount);
      }
      if (struct.isSetLuckyMoneyNumber()) {
        oprot.writeI32(struct.luckyMoneyNumber);
      }
      if (struct.isSetLuckyMoneyType()) {
        oprot.writeI32(struct.luckyMoneyType.getValue());
      }
      if (struct.isSetWords()) {
        oprot.writeString(struct.words);
      }
      if (struct.isSetCharId()) {
        oprot.writeI64(struct.charId);
      }
      if (struct.isSetCurrenyAmount()) {
        oprot.writeI32(struct.currenyAmount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSReqMakeLuckyMoney struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.luckyMoneyAmount = iprot.readI32();
        struct.setLuckyMoneyAmountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.luckyMoneyNumber = iprot.readI32();
        struct.setLuckyMoneyNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.luckyMoneyType = com.ling9527.music.common.msg.auto.LuckyMoneyType.findByValue(iprot.readI32());
        struct.setLuckyMoneyTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.words = iprot.readString();
        struct.setWordsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.charId = iprot.readI64();
        struct.setCharIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.currenyAmount = iprot.readI32();
        struct.setCurrenyAmountIsSet(true);
      }
    }
  }

}
