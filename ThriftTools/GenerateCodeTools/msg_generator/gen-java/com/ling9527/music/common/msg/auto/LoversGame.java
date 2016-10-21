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

public class LoversGame implements org.apache.thrift.TBase<LoversGame, LoversGame._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LoversGame");

  private static final org.apache.thrift.protocol.TField GAME_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("gameType", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField GAME_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gameId", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField AQ_INDEX_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("aqIndexMap", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField ANSWER_INDEX_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("answerIndexList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LoversGameStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LoversGameTupleSchemeFactory());
  }

  public byte gameType; // required
  public short gameId; // required
  public Map<Long,Byte> aqIndexMap; // optional
  public List<Byte> answerIndexList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GAME_TYPE((short)1, "gameType"),
    GAME_ID((short)2, "gameId"),
    AQ_INDEX_MAP((short)3, "aqIndexMap"),
    ANSWER_INDEX_LIST((short)4, "answerIndexList");

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
        case 1: // GAME_TYPE
          return GAME_TYPE;
        case 2: // GAME_ID
          return GAME_ID;
        case 3: // AQ_INDEX_MAP
          return AQ_INDEX_MAP;
        case 4: // ANSWER_INDEX_LIST
          return ANSWER_INDEX_LIST;
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
  private static final int __GAMETYPE_ISSET_ID = 0;
  private static final int __GAMEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.AQ_INDEX_MAP,_Fields.ANSWER_INDEX_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GAME_TYPE, new org.apache.thrift.meta_data.FieldMetaData("gameType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.GAME_ID, new org.apache.thrift.meta_data.FieldMetaData("gameId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.AQ_INDEX_MAP, new org.apache.thrift.meta_data.FieldMetaData("aqIndexMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE))));
    tmpMap.put(_Fields.ANSWER_INDEX_LIST, new org.apache.thrift.meta_data.FieldMetaData("answerIndexList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LoversGame.class, metaDataMap);
  }

  public LoversGame() {
  }

  public LoversGame(
    byte gameType,
    short gameId)
  {
    this();
    this.gameType = gameType;
    setGameTypeIsSet(true);
    this.gameId = gameId;
    setGameIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LoversGame(LoversGame other) {
    __isset_bitfield = other.__isset_bitfield;
    this.gameType = other.gameType;
    this.gameId = other.gameId;
    if (other.isSetAqIndexMap()) {
      Map<Long,Byte> __this__aqIndexMap = new HashMap<Long,Byte>();
      for (Map.Entry<Long, Byte> other_element : other.aqIndexMap.entrySet()) {

        Long other_element_key = other_element.getKey();
        Byte other_element_value = other_element.getValue();

        Long __this__aqIndexMap_copy_key = other_element_key;

        Byte __this__aqIndexMap_copy_value = other_element_value;

        __this__aqIndexMap.put(__this__aqIndexMap_copy_key, __this__aqIndexMap_copy_value);
      }
      this.aqIndexMap = __this__aqIndexMap;
    }
    if (other.isSetAnswerIndexList()) {
      List<Byte> __this__answerIndexList = new ArrayList<Byte>();
      for (Byte other_element : other.answerIndexList) {
        __this__answerIndexList.add(other_element);
      }
      this.answerIndexList = __this__answerIndexList;
    }
  }

  public LoversGame deepCopy() {
    return new LoversGame(this);
  }

  @Override
  public void clear() {
    setGameTypeIsSet(false);
    this.gameType = 0;
    setGameIdIsSet(false);
    this.gameId = 0;
    this.aqIndexMap = null;
    this.answerIndexList = null;
  }

  public byte getGameType() {
    return this.gameType;
  }

  public LoversGame setGameType(byte gameType) {
    this.gameType = gameType;
    setGameTypeIsSet(true);
    return this;
  }

  public void unsetGameType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GAMETYPE_ISSET_ID);
  }

  /** Returns true if field gameType is set (has been assigned a value) and false otherwise */
  public boolean isSetGameType() {
    return EncodingUtils.testBit(__isset_bitfield, __GAMETYPE_ISSET_ID);
  }

  public void setGameTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GAMETYPE_ISSET_ID, value);
  }

  public short getGameId() {
    return this.gameId;
  }

  public LoversGame setGameId(short gameId) {
    this.gameId = gameId;
    setGameIdIsSet(true);
    return this;
  }

  public void unsetGameId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GAMEID_ISSET_ID);
  }

  /** Returns true if field gameId is set (has been assigned a value) and false otherwise */
  public boolean isSetGameId() {
    return EncodingUtils.testBit(__isset_bitfield, __GAMEID_ISSET_ID);
  }

  public void setGameIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GAMEID_ISSET_ID, value);
  }

  public int getAqIndexMapSize() {
    return (this.aqIndexMap == null) ? 0 : this.aqIndexMap.size();
  }

  public void putToAqIndexMap(long key, byte val) {
    if (this.aqIndexMap == null) {
      this.aqIndexMap = new HashMap<Long,Byte>();
    }
    this.aqIndexMap.put(key, val);
  }

  public Map<Long,Byte> getAqIndexMap() {
    return this.aqIndexMap;
  }

  public LoversGame setAqIndexMap(Map<Long,Byte> aqIndexMap) {
    this.aqIndexMap = aqIndexMap;
    return this;
  }

  public void unsetAqIndexMap() {
    this.aqIndexMap = null;
  }

  /** Returns true if field aqIndexMap is set (has been assigned a value) and false otherwise */
  public boolean isSetAqIndexMap() {
    return this.aqIndexMap != null;
  }

  public void setAqIndexMapIsSet(boolean value) {
    if (!value) {
      this.aqIndexMap = null;
    }
  }

  public int getAnswerIndexListSize() {
    return (this.answerIndexList == null) ? 0 : this.answerIndexList.size();
  }

  public java.util.Iterator<Byte> getAnswerIndexListIterator() {
    return (this.answerIndexList == null) ? null : this.answerIndexList.iterator();
  }

  public void addToAnswerIndexList(byte elem) {
    if (this.answerIndexList == null) {
      this.answerIndexList = new ArrayList<Byte>();
    }
    this.answerIndexList.add(elem);
  }

  public List<Byte> getAnswerIndexList() {
    return this.answerIndexList;
  }

  public LoversGame setAnswerIndexList(List<Byte> answerIndexList) {
    this.answerIndexList = answerIndexList;
    return this;
  }

  public void unsetAnswerIndexList() {
    this.answerIndexList = null;
  }

  /** Returns true if field answerIndexList is set (has been assigned a value) and false otherwise */
  public boolean isSetAnswerIndexList() {
    return this.answerIndexList != null;
  }

  public void setAnswerIndexListIsSet(boolean value) {
    if (!value) {
      this.answerIndexList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GAME_TYPE:
      if (value == null) {
        unsetGameType();
      } else {
        setGameType((Byte)value);
      }
      break;

    case GAME_ID:
      if (value == null) {
        unsetGameId();
      } else {
        setGameId((Short)value);
      }
      break;

    case AQ_INDEX_MAP:
      if (value == null) {
        unsetAqIndexMap();
      } else {
        setAqIndexMap((Map<Long,Byte>)value);
      }
      break;

    case ANSWER_INDEX_LIST:
      if (value == null) {
        unsetAnswerIndexList();
      } else {
        setAnswerIndexList((List<Byte>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GAME_TYPE:
      return Byte.valueOf(getGameType());

    case GAME_ID:
      return Short.valueOf(getGameId());

    case AQ_INDEX_MAP:
      return getAqIndexMap();

    case ANSWER_INDEX_LIST:
      return getAnswerIndexList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GAME_TYPE:
      return isSetGameType();
    case GAME_ID:
      return isSetGameId();
    case AQ_INDEX_MAP:
      return isSetAqIndexMap();
    case ANSWER_INDEX_LIST:
      return isSetAnswerIndexList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LoversGame)
      return this.equals((LoversGame)that);
    return false;
  }

  public boolean equals(LoversGame that) {
    if (that == null)
      return false;

    boolean this_present_gameType = true;
    boolean that_present_gameType = true;
    if (this_present_gameType || that_present_gameType) {
      if (!(this_present_gameType && that_present_gameType))
        return false;
      if (this.gameType != that.gameType)
        return false;
    }

    boolean this_present_gameId = true;
    boolean that_present_gameId = true;
    if (this_present_gameId || that_present_gameId) {
      if (!(this_present_gameId && that_present_gameId))
        return false;
      if (this.gameId != that.gameId)
        return false;
    }

    boolean this_present_aqIndexMap = true && this.isSetAqIndexMap();
    boolean that_present_aqIndexMap = true && that.isSetAqIndexMap();
    if (this_present_aqIndexMap || that_present_aqIndexMap) {
      if (!(this_present_aqIndexMap && that_present_aqIndexMap))
        return false;
      if (!this.aqIndexMap.equals(that.aqIndexMap))
        return false;
    }

    boolean this_present_answerIndexList = true && this.isSetAnswerIndexList();
    boolean that_present_answerIndexList = true && that.isSetAnswerIndexList();
    if (this_present_answerIndexList || that_present_answerIndexList) {
      if (!(this_present_answerIndexList && that_present_answerIndexList))
        return false;
      if (!this.answerIndexList.equals(that.answerIndexList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LoversGame other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LoversGame typedOther = (LoversGame)other;

    lastComparison = Boolean.valueOf(isSetGameType()).compareTo(typedOther.isSetGameType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGameType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gameType, typedOther.gameType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGameId()).compareTo(typedOther.isSetGameId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGameId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gameId, typedOther.gameId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAqIndexMap()).compareTo(typedOther.isSetAqIndexMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAqIndexMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aqIndexMap, typedOther.aqIndexMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnswerIndexList()).compareTo(typedOther.isSetAnswerIndexList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnswerIndexList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.answerIndexList, typedOther.answerIndexList);
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
    StringBuilder sb = new StringBuilder("LoversGame(");
    boolean first = true;

    sb.append("gameType:");
    sb.append(this.gameType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gameId:");
    sb.append(this.gameId);
    first = false;
    if (isSetAqIndexMap()) {
      if (!first) sb.append(", ");
      sb.append("aqIndexMap:");
      if (this.aqIndexMap == null) {
        sb.append("null");
      } else {
        sb.append(this.aqIndexMap);
      }
      first = false;
    }
    if (isSetAnswerIndexList()) {
      if (!first) sb.append(", ");
      sb.append("answerIndexList:");
      if (this.answerIndexList == null) {
        sb.append("null");
      } else {
        sb.append(this.answerIndexList);
      }
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

  private static class LoversGameStandardSchemeFactory implements SchemeFactory {
    public LoversGameStandardScheme getScheme() {
      return new LoversGameStandardScheme();
    }
  }

  private static class LoversGameStandardScheme extends StandardScheme<LoversGame> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LoversGame struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GAME_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.gameType = iprot.readByte();
              struct.setGameTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GAME_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.gameId = iprot.readI16();
              struct.setGameIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AQ_INDEX_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map486 = iprot.readMapBegin();
                struct.aqIndexMap = new HashMap<Long,Byte>(2*_map486.size);
                for (int _i487 = 0; _i487 < _map486.size; ++_i487)
                {
                  long _key488; // required
                  byte _val489; // required
                  _key488 = iprot.readI64();
                  _val489 = iprot.readByte();
                  struct.aqIndexMap.put(_key488, _val489);
                }
                iprot.readMapEnd();
              }
              struct.setAqIndexMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ANSWER_INDEX_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list490 = iprot.readListBegin();
                struct.answerIndexList = new ArrayList<Byte>(_list490.size);
                for (int _i491 = 0; _i491 < _list490.size; ++_i491)
                {
                  byte _elem492; // required
                  _elem492 = iprot.readByte();
                  struct.answerIndexList.add(_elem492);
                }
                iprot.readListEnd();
              }
              struct.setAnswerIndexListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LoversGame struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(GAME_TYPE_FIELD_DESC);
      oprot.writeByte(struct.gameType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GAME_ID_FIELD_DESC);
      oprot.writeI16(struct.gameId);
      oprot.writeFieldEnd();
      if (struct.aqIndexMap != null) {
        if (struct.isSetAqIndexMap()) {
          oprot.writeFieldBegin(AQ_INDEX_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.BYTE, struct.aqIndexMap.size()));
            for (Map.Entry<Long, Byte> _iter493 : struct.aqIndexMap.entrySet())
            {
              oprot.writeI64(_iter493.getKey());
              oprot.writeByte(_iter493.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.answerIndexList != null) {
        if (struct.isSetAnswerIndexList()) {
          oprot.writeFieldBegin(ANSWER_INDEX_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, struct.answerIndexList.size()));
            for (byte _iter494 : struct.answerIndexList)
            {
              oprot.writeByte(_iter494);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LoversGameTupleSchemeFactory implements SchemeFactory {
    public LoversGameTupleScheme getScheme() {
      return new LoversGameTupleScheme();
    }
  }

  private static class LoversGameTupleScheme extends TupleScheme<LoversGame> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LoversGame struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGameType()) {
        optionals.set(0);
      }
      if (struct.isSetGameId()) {
        optionals.set(1);
      }
      if (struct.isSetAqIndexMap()) {
        optionals.set(2);
      }
      if (struct.isSetAnswerIndexList()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetGameType()) {
        oprot.writeByte(struct.gameType);
      }
      if (struct.isSetGameId()) {
        oprot.writeI16(struct.gameId);
      }
      if (struct.isSetAqIndexMap()) {
        {
          oprot.writeI32(struct.aqIndexMap.size());
          for (Map.Entry<Long, Byte> _iter495 : struct.aqIndexMap.entrySet())
          {
            oprot.writeI64(_iter495.getKey());
            oprot.writeByte(_iter495.getValue());
          }
        }
      }
      if (struct.isSetAnswerIndexList()) {
        {
          oprot.writeI32(struct.answerIndexList.size());
          for (byte _iter496 : struct.answerIndexList)
          {
            oprot.writeByte(_iter496);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LoversGame struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.gameType = iprot.readByte();
        struct.setGameTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.gameId = iprot.readI16();
        struct.setGameIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map497 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.BYTE, iprot.readI32());
          struct.aqIndexMap = new HashMap<Long,Byte>(2*_map497.size);
          for (int _i498 = 0; _i498 < _map497.size; ++_i498)
          {
            long _key499; // required
            byte _val500; // required
            _key499 = iprot.readI64();
            _val500 = iprot.readByte();
            struct.aqIndexMap.put(_key499, _val500);
          }
        }
        struct.setAqIndexMapIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list501 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BYTE, iprot.readI32());
          struct.answerIndexList = new ArrayList<Byte>(_list501.size);
          for (int _i502 = 0; _i502 < _list501.size; ++_i502)
          {
            byte _elem503; // required
            _elem503 = iprot.readByte();
            struct.answerIndexList.add(_elem503);
          }
        }
        struct.setAnswerIndexListIsSet(true);
      }
    }
  }

}

