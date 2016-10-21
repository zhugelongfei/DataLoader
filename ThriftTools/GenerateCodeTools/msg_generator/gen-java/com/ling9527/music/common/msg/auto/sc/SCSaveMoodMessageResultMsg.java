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
 * 修改密友或情侣间的宣言
 */
public class SCSaveMoodMessageResultMsg implements org.apache.thrift.TBase<SCSaveMoodMessageResultMsg, SCSaveMoodMessageResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCSaveMoodMessageResultMsg");

  private static final org.apache.thrift.protocol.TField TEXT_WORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("textWords", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SOUND_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("soundId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TO_CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toCharId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField IS_SELF_FIELD_DESC = new org.apache.thrift.protocol.TField("isSelf", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCSaveMoodMessageResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCSaveMoodMessageResultMsgTupleSchemeFactory());
  }

  public String textWords; // required
  public String soundId; // required
  public long toCharId; // required
  public boolean isSelf; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXT_WORDS((short)1, "textWords"),
    SOUND_ID((short)2, "soundId"),
    TO_CHAR_ID((short)3, "toCharId"),
    IS_SELF((short)4, "isSelf");

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
        case 1: // TEXT_WORDS
          return TEXT_WORDS;
        case 2: // SOUND_ID
          return SOUND_ID;
        case 3: // TO_CHAR_ID
          return TO_CHAR_ID;
        case 4: // IS_SELF
          return IS_SELF;
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
  private static final int __TOCHARID_ISSET_ID = 0;
  private static final int __ISSELF_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEXT_WORDS, new org.apache.thrift.meta_data.FieldMetaData("textWords", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOUND_ID, new org.apache.thrift.meta_data.FieldMetaData("soundId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("toCharId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_SELF, new org.apache.thrift.meta_data.FieldMetaData("isSelf", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCSaveMoodMessageResultMsg.class, metaDataMap);
  }

  public SCSaveMoodMessageResultMsg() {
  }

  public SCSaveMoodMessageResultMsg(
    String textWords,
    String soundId,
    long toCharId,
    boolean isSelf)
  {
    this();
    this.textWords = textWords;
    this.soundId = soundId;
    this.toCharId = toCharId;
    setToCharIdIsSet(true);
    this.isSelf = isSelf;
    setIsSelfIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCSaveMoodMessageResultMsg(SCSaveMoodMessageResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTextWords()) {
      this.textWords = other.textWords;
    }
    if (other.isSetSoundId()) {
      this.soundId = other.soundId;
    }
    this.toCharId = other.toCharId;
    this.isSelf = other.isSelf;
  }

  public SCSaveMoodMessageResultMsg deepCopy() {
    return new SCSaveMoodMessageResultMsg(this);
  }

  @Override
  public void clear() {
    this.textWords = null;
    this.soundId = null;
    setToCharIdIsSet(false);
    this.toCharId = 0;
    setIsSelfIsSet(false);
    this.isSelf = false;
  }

  public String getTextWords() {
    return this.textWords;
  }

  public SCSaveMoodMessageResultMsg setTextWords(String textWords) {
    this.textWords = textWords;
    return this;
  }

  public void unsetTextWords() {
    this.textWords = null;
  }

  /** Returns true if field textWords is set (has been assigned a value) and false otherwise */
  public boolean isSetTextWords() {
    return this.textWords != null;
  }

  public void setTextWordsIsSet(boolean value) {
    if (!value) {
      this.textWords = null;
    }
  }

  public String getSoundId() {
    return this.soundId;
  }

  public SCSaveMoodMessageResultMsg setSoundId(String soundId) {
    this.soundId = soundId;
    return this;
  }

  public void unsetSoundId() {
    this.soundId = null;
  }

  /** Returns true if field soundId is set (has been assigned a value) and false otherwise */
  public boolean isSetSoundId() {
    return this.soundId != null;
  }

  public void setSoundIdIsSet(boolean value) {
    if (!value) {
      this.soundId = null;
    }
  }

  public long getToCharId() {
    return this.toCharId;
  }

  public SCSaveMoodMessageResultMsg setToCharId(long toCharId) {
    this.toCharId = toCharId;
    setToCharIdIsSet(true);
    return this;
  }

  public void unsetToCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOCHARID_ISSET_ID);
  }

  /** Returns true if field toCharId is set (has been assigned a value) and false otherwise */
  public boolean isSetToCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __TOCHARID_ISSET_ID);
  }

  public void setToCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOCHARID_ISSET_ID, value);
  }

  public boolean isIsSelf() {
    return this.isSelf;
  }

  public SCSaveMoodMessageResultMsg setIsSelf(boolean isSelf) {
    this.isSelf = isSelf;
    setIsSelfIsSet(true);
    return this;
  }

  public void unsetIsSelf() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSELF_ISSET_ID);
  }

  /** Returns true if field isSelf is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSelf() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSELF_ISSET_ID);
  }

  public void setIsSelfIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSELF_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEXT_WORDS:
      if (value == null) {
        unsetTextWords();
      } else {
        setTextWords((String)value);
      }
      break;

    case SOUND_ID:
      if (value == null) {
        unsetSoundId();
      } else {
        setSoundId((String)value);
      }
      break;

    case TO_CHAR_ID:
      if (value == null) {
        unsetToCharId();
      } else {
        setToCharId((Long)value);
      }
      break;

    case IS_SELF:
      if (value == null) {
        unsetIsSelf();
      } else {
        setIsSelf((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEXT_WORDS:
      return getTextWords();

    case SOUND_ID:
      return getSoundId();

    case TO_CHAR_ID:
      return Long.valueOf(getToCharId());

    case IS_SELF:
      return Boolean.valueOf(isIsSelf());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEXT_WORDS:
      return isSetTextWords();
    case SOUND_ID:
      return isSetSoundId();
    case TO_CHAR_ID:
      return isSetToCharId();
    case IS_SELF:
      return isSetIsSelf();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCSaveMoodMessageResultMsg)
      return this.equals((SCSaveMoodMessageResultMsg)that);
    return false;
  }

  public boolean equals(SCSaveMoodMessageResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_textWords = true && this.isSetTextWords();
    boolean that_present_textWords = true && that.isSetTextWords();
    if (this_present_textWords || that_present_textWords) {
      if (!(this_present_textWords && that_present_textWords))
        return false;
      if (!this.textWords.equals(that.textWords))
        return false;
    }

    boolean this_present_soundId = true && this.isSetSoundId();
    boolean that_present_soundId = true && that.isSetSoundId();
    if (this_present_soundId || that_present_soundId) {
      if (!(this_present_soundId && that_present_soundId))
        return false;
      if (!this.soundId.equals(that.soundId))
        return false;
    }

    boolean this_present_toCharId = true;
    boolean that_present_toCharId = true;
    if (this_present_toCharId || that_present_toCharId) {
      if (!(this_present_toCharId && that_present_toCharId))
        return false;
      if (this.toCharId != that.toCharId)
        return false;
    }

    boolean this_present_isSelf = true;
    boolean that_present_isSelf = true;
    if (this_present_isSelf || that_present_isSelf) {
      if (!(this_present_isSelf && that_present_isSelf))
        return false;
      if (this.isSelf != that.isSelf)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCSaveMoodMessageResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCSaveMoodMessageResultMsg typedOther = (SCSaveMoodMessageResultMsg)other;

    lastComparison = Boolean.valueOf(isSetTextWords()).compareTo(typedOther.isSetTextWords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextWords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textWords, typedOther.textWords);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSoundId()).compareTo(typedOther.isSetSoundId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSoundId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.soundId, typedOther.soundId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToCharId()).compareTo(typedOther.isSetToCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toCharId, typedOther.toCharId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSelf()).compareTo(typedOther.isSetIsSelf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSelf()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSelf, typedOther.isSelf);
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
    StringBuilder sb = new StringBuilder("SCSaveMoodMessageResultMsg(");
    boolean first = true;

    sb.append("textWords:");
    if (this.textWords == null) {
      sb.append("null");
    } else {
      sb.append(this.textWords);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("soundId:");
    if (this.soundId == null) {
      sb.append("null");
    } else {
      sb.append(this.soundId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toCharId:");
    sb.append(this.toCharId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isSelf:");
    sb.append(this.isSelf);
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

  private static class SCSaveMoodMessageResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCSaveMoodMessageResultMsgStandardScheme getScheme() {
      return new SCSaveMoodMessageResultMsgStandardScheme();
    }
  }

  private static class SCSaveMoodMessageResultMsgStandardScheme extends StandardScheme<SCSaveMoodMessageResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCSaveMoodMessageResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEXT_WORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.textWords = iprot.readString();
              struct.setTextWordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOUND_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.soundId = iprot.readString();
              struct.setSoundIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TO_CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.toCharId = iprot.readI64();
              struct.setToCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_SELF
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSelf = iprot.readBool();
              struct.setIsSelfIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCSaveMoodMessageResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.textWords != null) {
        oprot.writeFieldBegin(TEXT_WORDS_FIELD_DESC);
        oprot.writeString(struct.textWords);
        oprot.writeFieldEnd();
      }
      if (struct.soundId != null) {
        oprot.writeFieldBegin(SOUND_ID_FIELD_DESC);
        oprot.writeString(struct.soundId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TO_CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.toCharId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_SELF_FIELD_DESC);
      oprot.writeBool(struct.isSelf);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCSaveMoodMessageResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCSaveMoodMessageResultMsgTupleScheme getScheme() {
      return new SCSaveMoodMessageResultMsgTupleScheme();
    }
  }

  private static class SCSaveMoodMessageResultMsgTupleScheme extends TupleScheme<SCSaveMoodMessageResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCSaveMoodMessageResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTextWords()) {
        optionals.set(0);
      }
      if (struct.isSetSoundId()) {
        optionals.set(1);
      }
      if (struct.isSetToCharId()) {
        optionals.set(2);
      }
      if (struct.isSetIsSelf()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTextWords()) {
        oprot.writeString(struct.textWords);
      }
      if (struct.isSetSoundId()) {
        oprot.writeString(struct.soundId);
      }
      if (struct.isSetToCharId()) {
        oprot.writeI64(struct.toCharId);
      }
      if (struct.isSetIsSelf()) {
        oprot.writeBool(struct.isSelf);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCSaveMoodMessageResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.textWords = iprot.readString();
        struct.setTextWordsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.soundId = iprot.readString();
        struct.setSoundIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.toCharId = iprot.readI64();
        struct.setToCharIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isSelf = iprot.readBool();
        struct.setIsSelfIsSet(true);
      }
    }
  }

}
