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
 * 成就进度信息
 */
public class SCAchieveProcessInfo implements org.apache.thrift.TBase<SCAchieveProcessInfo, SCAchieveProcessInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCAchieveProcessInfo");

  private static final org.apache.thrift.protocol.TField ACHIEVE_PROCESS_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("achieveProcessInfos", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ACHIEVE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("achieveVersion", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCAchieveProcessInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCAchieveProcessInfoTupleSchemeFactory());
  }

  public List<AchieveProcessInfo> achieveProcessInfos; // required
  public int achieveVersion; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACHIEVE_PROCESS_INFOS((short)1, "achieveProcessInfos"),
    ACHIEVE_VERSION((short)2, "achieveVersion");

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
        case 1: // ACHIEVE_PROCESS_INFOS
          return ACHIEVE_PROCESS_INFOS;
        case 2: // ACHIEVE_VERSION
          return ACHIEVE_VERSION;
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
  private static final int __ACHIEVEVERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACHIEVE_PROCESS_INFOS, new org.apache.thrift.meta_data.FieldMetaData("achieveProcessInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AchieveProcessInfo.class))));
    tmpMap.put(_Fields.ACHIEVE_VERSION, new org.apache.thrift.meta_data.FieldMetaData("achieveVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCAchieveProcessInfo.class, metaDataMap);
  }

  public SCAchieveProcessInfo() {
  }

  public SCAchieveProcessInfo(
    List<AchieveProcessInfo> achieveProcessInfos,
    int achieveVersion)
  {
    this();
    this.achieveProcessInfos = achieveProcessInfos;
    this.achieveVersion = achieveVersion;
    setAchieveVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCAchieveProcessInfo(SCAchieveProcessInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAchieveProcessInfos()) {
      List<AchieveProcessInfo> __this__achieveProcessInfos = new ArrayList<AchieveProcessInfo>();
      for (AchieveProcessInfo other_element : other.achieveProcessInfos) {
        __this__achieveProcessInfos.add(new AchieveProcessInfo(other_element));
      }
      this.achieveProcessInfos = __this__achieveProcessInfos;
    }
    this.achieveVersion = other.achieveVersion;
  }

  public SCAchieveProcessInfo deepCopy() {
    return new SCAchieveProcessInfo(this);
  }

  @Override
  public void clear() {
    this.achieveProcessInfos = null;
    setAchieveVersionIsSet(false);
    this.achieveVersion = 0;
  }

  public int getAchieveProcessInfosSize() {
    return (this.achieveProcessInfos == null) ? 0 : this.achieveProcessInfos.size();
  }

  public java.util.Iterator<AchieveProcessInfo> getAchieveProcessInfosIterator() {
    return (this.achieveProcessInfos == null) ? null : this.achieveProcessInfos.iterator();
  }

  public void addToAchieveProcessInfos(AchieveProcessInfo elem) {
    if (this.achieveProcessInfos == null) {
      this.achieveProcessInfos = new ArrayList<AchieveProcessInfo>();
    }
    this.achieveProcessInfos.add(elem);
  }

  public List<AchieveProcessInfo> getAchieveProcessInfos() {
    return this.achieveProcessInfos;
  }

  public SCAchieveProcessInfo setAchieveProcessInfos(List<AchieveProcessInfo> achieveProcessInfos) {
    this.achieveProcessInfos = achieveProcessInfos;
    return this;
  }

  public void unsetAchieveProcessInfos() {
    this.achieveProcessInfos = null;
  }

  /** Returns true if field achieveProcessInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetAchieveProcessInfos() {
    return this.achieveProcessInfos != null;
  }

  public void setAchieveProcessInfosIsSet(boolean value) {
    if (!value) {
      this.achieveProcessInfos = null;
    }
  }

  public int getAchieveVersion() {
    return this.achieveVersion;
  }

  public SCAchieveProcessInfo setAchieveVersion(int achieveVersion) {
    this.achieveVersion = achieveVersion;
    setAchieveVersionIsSet(true);
    return this;
  }

  public void unsetAchieveVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACHIEVEVERSION_ISSET_ID);
  }

  /** Returns true if field achieveVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetAchieveVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __ACHIEVEVERSION_ISSET_ID);
  }

  public void setAchieveVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACHIEVEVERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACHIEVE_PROCESS_INFOS:
      if (value == null) {
        unsetAchieveProcessInfos();
      } else {
        setAchieveProcessInfos((List<AchieveProcessInfo>)value);
      }
      break;

    case ACHIEVE_VERSION:
      if (value == null) {
        unsetAchieveVersion();
      } else {
        setAchieveVersion((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACHIEVE_PROCESS_INFOS:
      return getAchieveProcessInfos();

    case ACHIEVE_VERSION:
      return Integer.valueOf(getAchieveVersion());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACHIEVE_PROCESS_INFOS:
      return isSetAchieveProcessInfos();
    case ACHIEVE_VERSION:
      return isSetAchieveVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCAchieveProcessInfo)
      return this.equals((SCAchieveProcessInfo)that);
    return false;
  }

  public boolean equals(SCAchieveProcessInfo that) {
    if (that == null)
      return false;

    boolean this_present_achieveProcessInfos = true && this.isSetAchieveProcessInfos();
    boolean that_present_achieveProcessInfos = true && that.isSetAchieveProcessInfos();
    if (this_present_achieveProcessInfos || that_present_achieveProcessInfos) {
      if (!(this_present_achieveProcessInfos && that_present_achieveProcessInfos))
        return false;
      if (!this.achieveProcessInfos.equals(that.achieveProcessInfos))
        return false;
    }

    boolean this_present_achieveVersion = true;
    boolean that_present_achieveVersion = true;
    if (this_present_achieveVersion || that_present_achieveVersion) {
      if (!(this_present_achieveVersion && that_present_achieveVersion))
        return false;
      if (this.achieveVersion != that.achieveVersion)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCAchieveProcessInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCAchieveProcessInfo typedOther = (SCAchieveProcessInfo)other;

    lastComparison = Boolean.valueOf(isSetAchieveProcessInfos()).compareTo(typedOther.isSetAchieveProcessInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAchieveProcessInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.achieveProcessInfos, typedOther.achieveProcessInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAchieveVersion()).compareTo(typedOther.isSetAchieveVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAchieveVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.achieveVersion, typedOther.achieveVersion);
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
    StringBuilder sb = new StringBuilder("SCAchieveProcessInfo(");
    boolean first = true;

    sb.append("achieveProcessInfos:");
    if (this.achieveProcessInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.achieveProcessInfos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("achieveVersion:");
    sb.append(this.achieveVersion);
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

  private static class SCAchieveProcessInfoStandardSchemeFactory implements SchemeFactory {
    public SCAchieveProcessInfoStandardScheme getScheme() {
      return new SCAchieveProcessInfoStandardScheme();
    }
  }

  private static class SCAchieveProcessInfoStandardScheme extends StandardScheme<SCAchieveProcessInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCAchieveProcessInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACHIEVE_PROCESS_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.achieveProcessInfos = new ArrayList<AchieveProcessInfo>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  AchieveProcessInfo _elem2; // required
                  _elem2 = new AchieveProcessInfo();
                  _elem2.read(iprot);
                  struct.achieveProcessInfos.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setAchieveProcessInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACHIEVE_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.achieveVersion = iprot.readI32();
              struct.setAchieveVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCAchieveProcessInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.achieveProcessInfos != null) {
        oprot.writeFieldBegin(ACHIEVE_PROCESS_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.achieveProcessInfos.size()));
          for (AchieveProcessInfo _iter3 : struct.achieveProcessInfos)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ACHIEVE_VERSION_FIELD_DESC);
      oprot.writeI32(struct.achieveVersion);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCAchieveProcessInfoTupleSchemeFactory implements SchemeFactory {
    public SCAchieveProcessInfoTupleScheme getScheme() {
      return new SCAchieveProcessInfoTupleScheme();
    }
  }

  private static class SCAchieveProcessInfoTupleScheme extends TupleScheme<SCAchieveProcessInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCAchieveProcessInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAchieveProcessInfos()) {
        optionals.set(0);
      }
      if (struct.isSetAchieveVersion()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAchieveProcessInfos()) {
        {
          oprot.writeI32(struct.achieveProcessInfos.size());
          for (AchieveProcessInfo _iter4 : struct.achieveProcessInfos)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetAchieveVersion()) {
        oprot.writeI32(struct.achieveVersion);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCAchieveProcessInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.achieveProcessInfos = new ArrayList<AchieveProcessInfo>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            AchieveProcessInfo _elem7; // required
            _elem7 = new AchieveProcessInfo();
            _elem7.read(iprot);
            struct.achieveProcessInfos.add(_elem7);
          }
        }
        struct.setAchieveProcessInfosIsSet(true);
      }
      if (incoming.get(1)) {
        struct.achieveVersion = iprot.readI32();
        struct.setAchieveVersionIsSet(true);
      }
    }
  }

}
