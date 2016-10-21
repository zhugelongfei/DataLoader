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

public class SCGuildSyncCourseTaskProcessMsg implements org.apache.thrift.TBase<SCGuildSyncCourseTaskProcessMsg, SCGuildSyncCourseTaskProcessMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCGuildSyncCourseTaskProcessMsg");

  private static final org.apache.thrift.protocol.TField COURSE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("courseId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OTHER_PROCESS_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("otherProcessList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCGuildSyncCourseTaskProcessMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCGuildSyncCourseTaskProcessMsgTupleSchemeFactory());
  }

  public int courseId; // required
  public List<com.ling9527.music.common.msg.auto.CourseTaskProcess> otherProcessList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COURSE_ID((short)1, "courseId"),
    OTHER_PROCESS_LIST((short)2, "otherProcessList");

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
        case 1: // COURSE_ID
          return COURSE_ID;
        case 2: // OTHER_PROCESS_LIST
          return OTHER_PROCESS_LIST;
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
  private static final int __COURSEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COURSE_ID, new org.apache.thrift.meta_data.FieldMetaData("courseId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OTHER_PROCESS_LIST, new org.apache.thrift.meta_data.FieldMetaData("otherProcessList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.CourseTaskProcess.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCGuildSyncCourseTaskProcessMsg.class, metaDataMap);
  }

  public SCGuildSyncCourseTaskProcessMsg() {
  }

  public SCGuildSyncCourseTaskProcessMsg(
    int courseId,
    List<com.ling9527.music.common.msg.auto.CourseTaskProcess> otherProcessList)
  {
    this();
    this.courseId = courseId;
    setCourseIdIsSet(true);
    this.otherProcessList = otherProcessList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCGuildSyncCourseTaskProcessMsg(SCGuildSyncCourseTaskProcessMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    this.courseId = other.courseId;
    if (other.isSetOtherProcessList()) {
      List<com.ling9527.music.common.msg.auto.CourseTaskProcess> __this__otherProcessList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskProcess>();
      for (com.ling9527.music.common.msg.auto.CourseTaskProcess other_element : other.otherProcessList) {
        __this__otherProcessList.add(new com.ling9527.music.common.msg.auto.CourseTaskProcess(other_element));
      }
      this.otherProcessList = __this__otherProcessList;
    }
  }

  public SCGuildSyncCourseTaskProcessMsg deepCopy() {
    return new SCGuildSyncCourseTaskProcessMsg(this);
  }

  @Override
  public void clear() {
    setCourseIdIsSet(false);
    this.courseId = 0;
    this.otherProcessList = null;
  }

  public int getCourseId() {
    return this.courseId;
  }

  public SCGuildSyncCourseTaskProcessMsg setCourseId(int courseId) {
    this.courseId = courseId;
    setCourseIdIsSet(true);
    return this;
  }

  public void unsetCourseId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COURSEID_ISSET_ID);
  }

  /** Returns true if field courseId is set (has been assigned a value) and false otherwise */
  public boolean isSetCourseId() {
    return EncodingUtils.testBit(__isset_bitfield, __COURSEID_ISSET_ID);
  }

  public void setCourseIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COURSEID_ISSET_ID, value);
  }

  public int getOtherProcessListSize() {
    return (this.otherProcessList == null) ? 0 : this.otherProcessList.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.CourseTaskProcess> getOtherProcessListIterator() {
    return (this.otherProcessList == null) ? null : this.otherProcessList.iterator();
  }

  public void addToOtherProcessList(com.ling9527.music.common.msg.auto.CourseTaskProcess elem) {
    if (this.otherProcessList == null) {
      this.otherProcessList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskProcess>();
    }
    this.otherProcessList.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.CourseTaskProcess> getOtherProcessList() {
    return this.otherProcessList;
  }

  public SCGuildSyncCourseTaskProcessMsg setOtherProcessList(List<com.ling9527.music.common.msg.auto.CourseTaskProcess> otherProcessList) {
    this.otherProcessList = otherProcessList;
    return this;
  }

  public void unsetOtherProcessList() {
    this.otherProcessList = null;
  }

  /** Returns true if field otherProcessList is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherProcessList() {
    return this.otherProcessList != null;
  }

  public void setOtherProcessListIsSet(boolean value) {
    if (!value) {
      this.otherProcessList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COURSE_ID:
      if (value == null) {
        unsetCourseId();
      } else {
        setCourseId((Integer)value);
      }
      break;

    case OTHER_PROCESS_LIST:
      if (value == null) {
        unsetOtherProcessList();
      } else {
        setOtherProcessList((List<com.ling9527.music.common.msg.auto.CourseTaskProcess>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COURSE_ID:
      return Integer.valueOf(getCourseId());

    case OTHER_PROCESS_LIST:
      return getOtherProcessList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COURSE_ID:
      return isSetCourseId();
    case OTHER_PROCESS_LIST:
      return isSetOtherProcessList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCGuildSyncCourseTaskProcessMsg)
      return this.equals((SCGuildSyncCourseTaskProcessMsg)that);
    return false;
  }

  public boolean equals(SCGuildSyncCourseTaskProcessMsg that) {
    if (that == null)
      return false;

    boolean this_present_courseId = true;
    boolean that_present_courseId = true;
    if (this_present_courseId || that_present_courseId) {
      if (!(this_present_courseId && that_present_courseId))
        return false;
      if (this.courseId != that.courseId)
        return false;
    }

    boolean this_present_otherProcessList = true && this.isSetOtherProcessList();
    boolean that_present_otherProcessList = true && that.isSetOtherProcessList();
    if (this_present_otherProcessList || that_present_otherProcessList) {
      if (!(this_present_otherProcessList && that_present_otherProcessList))
        return false;
      if (!this.otherProcessList.equals(that.otherProcessList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCGuildSyncCourseTaskProcessMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCGuildSyncCourseTaskProcessMsg typedOther = (SCGuildSyncCourseTaskProcessMsg)other;

    lastComparison = Boolean.valueOf(isSetCourseId()).compareTo(typedOther.isSetCourseId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCourseId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.courseId, typedOther.courseId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOtherProcessList()).compareTo(typedOther.isSetOtherProcessList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherProcessList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otherProcessList, typedOther.otherProcessList);
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
    StringBuilder sb = new StringBuilder("SCGuildSyncCourseTaskProcessMsg(");
    boolean first = true;

    sb.append("courseId:");
    sb.append(this.courseId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("otherProcessList:");
    if (this.otherProcessList == null) {
      sb.append("null");
    } else {
      sb.append(this.otherProcessList);
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

  private static class SCGuildSyncCourseTaskProcessMsgStandardSchemeFactory implements SchemeFactory {
    public SCGuildSyncCourseTaskProcessMsgStandardScheme getScheme() {
      return new SCGuildSyncCourseTaskProcessMsgStandardScheme();
    }
  }

  private static class SCGuildSyncCourseTaskProcessMsgStandardScheme extends StandardScheme<SCGuildSyncCourseTaskProcessMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCGuildSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COURSE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.courseId = iprot.readI32();
              struct.setCourseIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OTHER_PROCESS_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.otherProcessList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskProcess>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  com.ling9527.music.common.msg.auto.CourseTaskProcess _elem26; // required
                  _elem26 = new com.ling9527.music.common.msg.auto.CourseTaskProcess();
                  _elem26.read(iprot);
                  struct.otherProcessList.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setOtherProcessListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCGuildSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COURSE_ID_FIELD_DESC);
      oprot.writeI32(struct.courseId);
      oprot.writeFieldEnd();
      if (struct.otherProcessList != null) {
        oprot.writeFieldBegin(OTHER_PROCESS_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.otherProcessList.size()));
          for (com.ling9527.music.common.msg.auto.CourseTaskProcess _iter27 : struct.otherProcessList)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCGuildSyncCourseTaskProcessMsgTupleSchemeFactory implements SchemeFactory {
    public SCGuildSyncCourseTaskProcessMsgTupleScheme getScheme() {
      return new SCGuildSyncCourseTaskProcessMsgTupleScheme();
    }
  }

  private static class SCGuildSyncCourseTaskProcessMsgTupleScheme extends TupleScheme<SCGuildSyncCourseTaskProcessMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCGuildSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCourseId()) {
        optionals.set(0);
      }
      if (struct.isSetOtherProcessList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCourseId()) {
        oprot.writeI32(struct.courseId);
      }
      if (struct.isSetOtherProcessList()) {
        {
          oprot.writeI32(struct.otherProcessList.size());
          for (com.ling9527.music.common.msg.auto.CourseTaskProcess _iter28 : struct.otherProcessList)
          {
            _iter28.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCGuildSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.courseId = iprot.readI32();
        struct.setCourseIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.otherProcessList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskProcess>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            com.ling9527.music.common.msg.auto.CourseTaskProcess _elem31; // required
            _elem31 = new com.ling9527.music.common.msg.auto.CourseTaskProcess();
            _elem31.read(iprot);
            struct.otherProcessList.add(_elem31);
          }
        }
        struct.setOtherProcessListIsSet(true);
      }
    }
  }

}
