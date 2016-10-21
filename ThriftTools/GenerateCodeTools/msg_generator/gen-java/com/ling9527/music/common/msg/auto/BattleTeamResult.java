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

public class BattleTeamResult implements org.apache.thrift.TBase<BattleTeamResult, BattleTeamResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BattleTeamResult");

  private static final org.apache.thrift.protocol.TField TEAM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("teamId", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField GRADE_FIELD_DESC = new org.apache.thrift.protocol.TField("grade", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField TOP_FIELD_DESC = new org.apache.thrift.protocol.TField("top", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BattleTeamResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BattleTeamResultTupleSchemeFactory());
  }

  public byte teamId; // required
  public byte grade; // required
  public byte top; // required
  public List<BattleTeamMemberInfo> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEAM_ID((short)1, "teamId"),
    GRADE((short)2, "grade"),
    TOP((short)3, "top"),
    DATA((short)4, "data");

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
        case 1: // TEAM_ID
          return TEAM_ID;
        case 2: // GRADE
          return GRADE;
        case 3: // TOP
          return TOP;
        case 4: // DATA
          return DATA;
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
  private static final int __TEAMID_ISSET_ID = 0;
  private static final int __GRADE_ISSET_ID = 1;
  private static final int __TOP_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEAM_ID, new org.apache.thrift.meta_data.FieldMetaData("teamId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.GRADE, new org.apache.thrift.meta_data.FieldMetaData("grade", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.TOP, new org.apache.thrift.meta_data.FieldMetaData("top", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BattleTeamMemberInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BattleTeamResult.class, metaDataMap);
  }

  public BattleTeamResult() {
  }

  public BattleTeamResult(
    byte teamId,
    byte grade,
    byte top,
    List<BattleTeamMemberInfo> data)
  {
    this();
    this.teamId = teamId;
    setTeamIdIsSet(true);
    this.grade = grade;
    setGradeIsSet(true);
    this.top = top;
    setTopIsSet(true);
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BattleTeamResult(BattleTeamResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.teamId = other.teamId;
    this.grade = other.grade;
    this.top = other.top;
    if (other.isSetData()) {
      List<BattleTeamMemberInfo> __this__data = new ArrayList<BattleTeamMemberInfo>();
      for (BattleTeamMemberInfo other_element : other.data) {
        __this__data.add(new BattleTeamMemberInfo(other_element));
      }
      this.data = __this__data;
    }
  }

  public BattleTeamResult deepCopy() {
    return new BattleTeamResult(this);
  }

  @Override
  public void clear() {
    setTeamIdIsSet(false);
    this.teamId = 0;
    setGradeIsSet(false);
    this.grade = 0;
    setTopIsSet(false);
    this.top = 0;
    this.data = null;
  }

  public byte getTeamId() {
    return this.teamId;
  }

  public BattleTeamResult setTeamId(byte teamId) {
    this.teamId = teamId;
    setTeamIdIsSet(true);
    return this;
  }

  public void unsetTeamId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TEAMID_ISSET_ID);
  }

  /** Returns true if field teamId is set (has been assigned a value) and false otherwise */
  public boolean isSetTeamId() {
    return EncodingUtils.testBit(__isset_bitfield, __TEAMID_ISSET_ID);
  }

  public void setTeamIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TEAMID_ISSET_ID, value);
  }

  public byte getGrade() {
    return this.grade;
  }

  public BattleTeamResult setGrade(byte grade) {
    this.grade = grade;
    setGradeIsSet(true);
    return this;
  }

  public void unsetGrade() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GRADE_ISSET_ID);
  }

  /** Returns true if field grade is set (has been assigned a value) and false otherwise */
  public boolean isSetGrade() {
    return EncodingUtils.testBit(__isset_bitfield, __GRADE_ISSET_ID);
  }

  public void setGradeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GRADE_ISSET_ID, value);
  }

  public byte getTop() {
    return this.top;
  }

  public BattleTeamResult setTop(byte top) {
    this.top = top;
    setTopIsSet(true);
    return this;
  }

  public void unsetTop() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOP_ISSET_ID);
  }

  /** Returns true if field top is set (has been assigned a value) and false otherwise */
  public boolean isSetTop() {
    return EncodingUtils.testBit(__isset_bitfield, __TOP_ISSET_ID);
  }

  public void setTopIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOP_ISSET_ID, value);
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<BattleTeamMemberInfo> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(BattleTeamMemberInfo elem) {
    if (this.data == null) {
      this.data = new ArrayList<BattleTeamMemberInfo>();
    }
    this.data.add(elem);
  }

  public List<BattleTeamMemberInfo> getData() {
    return this.data;
  }

  public BattleTeamResult setData(List<BattleTeamMemberInfo> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEAM_ID:
      if (value == null) {
        unsetTeamId();
      } else {
        setTeamId((Byte)value);
      }
      break;

    case GRADE:
      if (value == null) {
        unsetGrade();
      } else {
        setGrade((Byte)value);
      }
      break;

    case TOP:
      if (value == null) {
        unsetTop();
      } else {
        setTop((Byte)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<BattleTeamMemberInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEAM_ID:
      return Byte.valueOf(getTeamId());

    case GRADE:
      return Byte.valueOf(getGrade());

    case TOP:
      return Byte.valueOf(getTop());

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEAM_ID:
      return isSetTeamId();
    case GRADE:
      return isSetGrade();
    case TOP:
      return isSetTop();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BattleTeamResult)
      return this.equals((BattleTeamResult)that);
    return false;
  }

  public boolean equals(BattleTeamResult that) {
    if (that == null)
      return false;

    boolean this_present_teamId = true;
    boolean that_present_teamId = true;
    if (this_present_teamId || that_present_teamId) {
      if (!(this_present_teamId && that_present_teamId))
        return false;
      if (this.teamId != that.teamId)
        return false;
    }

    boolean this_present_grade = true;
    boolean that_present_grade = true;
    if (this_present_grade || that_present_grade) {
      if (!(this_present_grade && that_present_grade))
        return false;
      if (this.grade != that.grade)
        return false;
    }

    boolean this_present_top = true;
    boolean that_present_top = true;
    if (this_present_top || that_present_top) {
      if (!(this_present_top && that_present_top))
        return false;
      if (this.top != that.top)
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BattleTeamResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BattleTeamResult typedOther = (BattleTeamResult)other;

    lastComparison = Boolean.valueOf(isSetTeamId()).compareTo(typedOther.isSetTeamId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTeamId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.teamId, typedOther.teamId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrade()).compareTo(typedOther.isSetGrade());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrade()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grade, typedOther.grade);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTop()).compareTo(typedOther.isSetTop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.top, typedOther.top);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, typedOther.data);
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
    StringBuilder sb = new StringBuilder("BattleTeamResult(");
    boolean first = true;

    sb.append("teamId:");
    sb.append(this.teamId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("grade:");
    sb.append(this.grade);
    first = false;
    if (!first) sb.append(", ");
    sb.append("top:");
    sb.append(this.top);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
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

  private static class BattleTeamResultStandardSchemeFactory implements SchemeFactory {
    public BattleTeamResultStandardScheme getScheme() {
      return new BattleTeamResultStandardScheme();
    }
  }

  private static class BattleTeamResultStandardScheme extends StandardScheme<BattleTeamResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BattleTeamResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEAM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.teamId = iprot.readByte();
              struct.setTeamIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GRADE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.grade = iprot.readByte();
              struct.setGradeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOP
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.top = iprot.readByte();
              struct.setTopIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list82 = iprot.readListBegin();
                struct.data = new ArrayList<BattleTeamMemberInfo>(_list82.size);
                for (int _i83 = 0; _i83 < _list82.size; ++_i83)
                {
                  BattleTeamMemberInfo _elem84; // required
                  _elem84 = new BattleTeamMemberInfo();
                  _elem84.read(iprot);
                  struct.data.add(_elem84);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BattleTeamResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TEAM_ID_FIELD_DESC);
      oprot.writeByte(struct.teamId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GRADE_FIELD_DESC);
      oprot.writeByte(struct.grade);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TOP_FIELD_DESC);
      oprot.writeByte(struct.top);
      oprot.writeFieldEnd();
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.data.size()));
          for (BattleTeamMemberInfo _iter85 : struct.data)
          {
            _iter85.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BattleTeamResultTupleSchemeFactory implements SchemeFactory {
    public BattleTeamResultTupleScheme getScheme() {
      return new BattleTeamResultTupleScheme();
    }
  }

  private static class BattleTeamResultTupleScheme extends TupleScheme<BattleTeamResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BattleTeamResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTeamId()) {
        optionals.set(0);
      }
      if (struct.isSetGrade()) {
        optionals.set(1);
      }
      if (struct.isSetTop()) {
        optionals.set(2);
      }
      if (struct.isSetData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTeamId()) {
        oprot.writeByte(struct.teamId);
      }
      if (struct.isSetGrade()) {
        oprot.writeByte(struct.grade);
      }
      if (struct.isSetTop()) {
        oprot.writeByte(struct.top);
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (BattleTeamMemberInfo _iter86 : struct.data)
          {
            _iter86.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BattleTeamResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.teamId = iprot.readByte();
        struct.setTeamIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.grade = iprot.readByte();
        struct.setGradeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.top = iprot.readByte();
        struct.setTopIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list87 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.data = new ArrayList<BattleTeamMemberInfo>(_list87.size);
          for (int _i88 = 0; _i88 < _list87.size; ++_i88)
          {
            BattleTeamMemberInfo _elem89; // required
            _elem89 = new BattleTeamMemberInfo();
            _elem89.read(iprot);
            struct.data.add(_elem89);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}
