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
 * 查询游戏线信息
 */
public class SCGameLineInfo implements org.apache.thrift.TBase<SCGameLineInfo, SCGameLineInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCGameLineInfo");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GAME_LINE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("gameLineInfos", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCGameLineInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCGameLineInfoTupleSchemeFactory());
  }

  /**
   * 版本号
   */
  public int version; // required
  public List<GameLineInfo> gameLineInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 版本号
     */
    VERSION((short)1, "version"),
    GAME_LINE_INFOS((short)2, "gameLineInfos");

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
        case 2: // GAME_LINE_INFOS
          return GAME_LINE_INFOS;
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
    tmpMap.put(_Fields.GAME_LINE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("gameLineInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GameLineInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCGameLineInfo.class, metaDataMap);
  }

  public SCGameLineInfo() {
  }

  public SCGameLineInfo(
    int version,
    List<GameLineInfo> gameLineInfos)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.gameLineInfos = gameLineInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCGameLineInfo(SCGameLineInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.version = other.version;
    if (other.isSetGameLineInfos()) {
      List<GameLineInfo> __this__gameLineInfos = new ArrayList<GameLineInfo>();
      for (GameLineInfo other_element : other.gameLineInfos) {
        __this__gameLineInfos.add(new GameLineInfo(other_element));
      }
      this.gameLineInfos = __this__gameLineInfos;
    }
  }

  public SCGameLineInfo deepCopy() {
    return new SCGameLineInfo(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    this.gameLineInfos = null;
  }

  /**
   * 版本号
   */
  public int getVersion() {
    return this.version;
  }

  /**
   * 版本号
   */
  public SCGameLineInfo setVersion(int version) {
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

  public int getGameLineInfosSize() {
    return (this.gameLineInfos == null) ? 0 : this.gameLineInfos.size();
  }

  public java.util.Iterator<GameLineInfo> getGameLineInfosIterator() {
    return (this.gameLineInfos == null) ? null : this.gameLineInfos.iterator();
  }

  public void addToGameLineInfos(GameLineInfo elem) {
    if (this.gameLineInfos == null) {
      this.gameLineInfos = new ArrayList<GameLineInfo>();
    }
    this.gameLineInfos.add(elem);
  }

  public List<GameLineInfo> getGameLineInfos() {
    return this.gameLineInfos;
  }

  public SCGameLineInfo setGameLineInfos(List<GameLineInfo> gameLineInfos) {
    this.gameLineInfos = gameLineInfos;
    return this;
  }

  public void unsetGameLineInfos() {
    this.gameLineInfos = null;
  }

  /** Returns true if field gameLineInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetGameLineInfos() {
    return this.gameLineInfos != null;
  }

  public void setGameLineInfosIsSet(boolean value) {
    if (!value) {
      this.gameLineInfos = null;
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

    case GAME_LINE_INFOS:
      if (value == null) {
        unsetGameLineInfos();
      } else {
        setGameLineInfos((List<GameLineInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return Integer.valueOf(getVersion());

    case GAME_LINE_INFOS:
      return getGameLineInfos();

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
    case GAME_LINE_INFOS:
      return isSetGameLineInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCGameLineInfo)
      return this.equals((SCGameLineInfo)that);
    return false;
  }

  public boolean equals(SCGameLineInfo that) {
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

    boolean this_present_gameLineInfos = true && this.isSetGameLineInfos();
    boolean that_present_gameLineInfos = true && that.isSetGameLineInfos();
    if (this_present_gameLineInfos || that_present_gameLineInfos) {
      if (!(this_present_gameLineInfos && that_present_gameLineInfos))
        return false;
      if (!this.gameLineInfos.equals(that.gameLineInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCGameLineInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCGameLineInfo typedOther = (SCGameLineInfo)other;

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
    lastComparison = Boolean.valueOf(isSetGameLineInfos()).compareTo(typedOther.isSetGameLineInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGameLineInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gameLineInfos, typedOther.gameLineInfos);
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
    StringBuilder sb = new StringBuilder("SCGameLineInfo(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gameLineInfos:");
    if (this.gameLineInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.gameLineInfos);
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

  private static class SCGameLineInfoStandardSchemeFactory implements SchemeFactory {
    public SCGameLineInfoStandardScheme getScheme() {
      return new SCGameLineInfoStandardScheme();
    }
  }

  private static class SCGameLineInfoStandardScheme extends StandardScheme<SCGameLineInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCGameLineInfo struct) throws org.apache.thrift.TException {
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
          case 2: // GAME_LINE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.gameLineInfos = new ArrayList<GameLineInfo>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  GameLineInfo _elem10; // required
                  _elem10 = new GameLineInfo();
                  _elem10.read(iprot);
                  struct.gameLineInfos.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setGameLineInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCGameLineInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(struct.version);
      oprot.writeFieldEnd();
      if (struct.gameLineInfos != null) {
        oprot.writeFieldBegin(GAME_LINE_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.gameLineInfos.size()));
          for (GameLineInfo _iter11 : struct.gameLineInfos)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCGameLineInfoTupleSchemeFactory implements SchemeFactory {
    public SCGameLineInfoTupleScheme getScheme() {
      return new SCGameLineInfoTupleScheme();
    }
  }

  private static class SCGameLineInfoTupleScheme extends TupleScheme<SCGameLineInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCGameLineInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetGameLineInfos()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version);
      }
      if (struct.isSetGameLineInfos()) {
        {
          oprot.writeI32(struct.gameLineInfos.size());
          for (GameLineInfo _iter12 : struct.gameLineInfos)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCGameLineInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.version = iprot.readI32();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.gameLineInfos = new ArrayList<GameLineInfo>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            GameLineInfo _elem15; // required
            _elem15 = new GameLineInfo();
            _elem15.read(iprot);
            struct.gameLineInfos.add(_elem15);
          }
        }
        struct.setGameLineInfosIsSet(true);
      }
    }
  }

}
