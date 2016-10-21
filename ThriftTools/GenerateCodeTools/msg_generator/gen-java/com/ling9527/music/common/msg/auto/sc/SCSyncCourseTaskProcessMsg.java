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

public class SCSyncCourseTaskProcessMsg implements org.apache.thrift.TBase<SCSyncCourseTaskProcessMsg, SCSyncCourseTaskProcessMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCSyncCourseTaskProcessMsg");

  private static final org.apache.thrift.protocol.TField COURSE_TASK_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("courseTaskList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SHELVE_COURSE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("shelveCourseIdList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCSyncCourseTaskProcessMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCSyncCourseTaskProcessMsgTupleSchemeFactory());
  }

  public List<com.ling9527.music.common.msg.auto.CourseTaskData> courseTaskList; // optional
  public List<com.ling9527.music.common.msg.auto.CourseTaskData> shelveCourseIdList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COURSE_TASK_LIST((short)1, "courseTaskList"),
    SHELVE_COURSE_ID_LIST((short)2, "shelveCourseIdList");

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
        case 1: // COURSE_TASK_LIST
          return COURSE_TASK_LIST;
        case 2: // SHELVE_COURSE_ID_LIST
          return SHELVE_COURSE_ID_LIST;
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
  private _Fields optionals[] = {_Fields.COURSE_TASK_LIST,_Fields.SHELVE_COURSE_ID_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COURSE_TASK_LIST, new org.apache.thrift.meta_data.FieldMetaData("courseTaskList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.CourseTaskData.class))));
    tmpMap.put(_Fields.SHELVE_COURSE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("shelveCourseIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.CourseTaskData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCSyncCourseTaskProcessMsg.class, metaDataMap);
  }

  public SCSyncCourseTaskProcessMsg() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCSyncCourseTaskProcessMsg(SCSyncCourseTaskProcessMsg other) {
    if (other.isSetCourseTaskList()) {
      List<com.ling9527.music.common.msg.auto.CourseTaskData> __this__courseTaskList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>();
      for (com.ling9527.music.common.msg.auto.CourseTaskData other_element : other.courseTaskList) {
        __this__courseTaskList.add(new com.ling9527.music.common.msg.auto.CourseTaskData(other_element));
      }
      this.courseTaskList = __this__courseTaskList;
    }
    if (other.isSetShelveCourseIdList()) {
      List<com.ling9527.music.common.msg.auto.CourseTaskData> __this__shelveCourseIdList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>();
      for (com.ling9527.music.common.msg.auto.CourseTaskData other_element : other.shelveCourseIdList) {
        __this__shelveCourseIdList.add(new com.ling9527.music.common.msg.auto.CourseTaskData(other_element));
      }
      this.shelveCourseIdList = __this__shelveCourseIdList;
    }
  }

  public SCSyncCourseTaskProcessMsg deepCopy() {
    return new SCSyncCourseTaskProcessMsg(this);
  }

  @Override
  public void clear() {
    this.courseTaskList = null;
    this.shelveCourseIdList = null;
  }

  public int getCourseTaskListSize() {
    return (this.courseTaskList == null) ? 0 : this.courseTaskList.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.CourseTaskData> getCourseTaskListIterator() {
    return (this.courseTaskList == null) ? null : this.courseTaskList.iterator();
  }

  public void addToCourseTaskList(com.ling9527.music.common.msg.auto.CourseTaskData elem) {
    if (this.courseTaskList == null) {
      this.courseTaskList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>();
    }
    this.courseTaskList.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.CourseTaskData> getCourseTaskList() {
    return this.courseTaskList;
  }

  public SCSyncCourseTaskProcessMsg setCourseTaskList(List<com.ling9527.music.common.msg.auto.CourseTaskData> courseTaskList) {
    this.courseTaskList = courseTaskList;
    return this;
  }

  public void unsetCourseTaskList() {
    this.courseTaskList = null;
  }

  /** Returns true if field courseTaskList is set (has been assigned a value) and false otherwise */
  public boolean isSetCourseTaskList() {
    return this.courseTaskList != null;
  }

  public void setCourseTaskListIsSet(boolean value) {
    if (!value) {
      this.courseTaskList = null;
    }
  }

  public int getShelveCourseIdListSize() {
    return (this.shelveCourseIdList == null) ? 0 : this.shelveCourseIdList.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.CourseTaskData> getShelveCourseIdListIterator() {
    return (this.shelveCourseIdList == null) ? null : this.shelveCourseIdList.iterator();
  }

  public void addToShelveCourseIdList(com.ling9527.music.common.msg.auto.CourseTaskData elem) {
    if (this.shelveCourseIdList == null) {
      this.shelveCourseIdList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>();
    }
    this.shelveCourseIdList.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.CourseTaskData> getShelveCourseIdList() {
    return this.shelveCourseIdList;
  }

  public SCSyncCourseTaskProcessMsg setShelveCourseIdList(List<com.ling9527.music.common.msg.auto.CourseTaskData> shelveCourseIdList) {
    this.shelveCourseIdList = shelveCourseIdList;
    return this;
  }

  public void unsetShelveCourseIdList() {
    this.shelveCourseIdList = null;
  }

  /** Returns true if field shelveCourseIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetShelveCourseIdList() {
    return this.shelveCourseIdList != null;
  }

  public void setShelveCourseIdListIsSet(boolean value) {
    if (!value) {
      this.shelveCourseIdList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COURSE_TASK_LIST:
      if (value == null) {
        unsetCourseTaskList();
      } else {
        setCourseTaskList((List<com.ling9527.music.common.msg.auto.CourseTaskData>)value);
      }
      break;

    case SHELVE_COURSE_ID_LIST:
      if (value == null) {
        unsetShelveCourseIdList();
      } else {
        setShelveCourseIdList((List<com.ling9527.music.common.msg.auto.CourseTaskData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COURSE_TASK_LIST:
      return getCourseTaskList();

    case SHELVE_COURSE_ID_LIST:
      return getShelveCourseIdList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COURSE_TASK_LIST:
      return isSetCourseTaskList();
    case SHELVE_COURSE_ID_LIST:
      return isSetShelveCourseIdList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCSyncCourseTaskProcessMsg)
      return this.equals((SCSyncCourseTaskProcessMsg)that);
    return false;
  }

  public boolean equals(SCSyncCourseTaskProcessMsg that) {
    if (that == null)
      return false;

    boolean this_present_courseTaskList = true && this.isSetCourseTaskList();
    boolean that_present_courseTaskList = true && that.isSetCourseTaskList();
    if (this_present_courseTaskList || that_present_courseTaskList) {
      if (!(this_present_courseTaskList && that_present_courseTaskList))
        return false;
      if (!this.courseTaskList.equals(that.courseTaskList))
        return false;
    }

    boolean this_present_shelveCourseIdList = true && this.isSetShelveCourseIdList();
    boolean that_present_shelveCourseIdList = true && that.isSetShelveCourseIdList();
    if (this_present_shelveCourseIdList || that_present_shelveCourseIdList) {
      if (!(this_present_shelveCourseIdList && that_present_shelveCourseIdList))
        return false;
      if (!this.shelveCourseIdList.equals(that.shelveCourseIdList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCSyncCourseTaskProcessMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCSyncCourseTaskProcessMsg typedOther = (SCSyncCourseTaskProcessMsg)other;

    lastComparison = Boolean.valueOf(isSetCourseTaskList()).compareTo(typedOther.isSetCourseTaskList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCourseTaskList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.courseTaskList, typedOther.courseTaskList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShelveCourseIdList()).compareTo(typedOther.isSetShelveCourseIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShelveCourseIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shelveCourseIdList, typedOther.shelveCourseIdList);
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
    StringBuilder sb = new StringBuilder("SCSyncCourseTaskProcessMsg(");
    boolean first = true;

    if (isSetCourseTaskList()) {
      sb.append("courseTaskList:");
      if (this.courseTaskList == null) {
        sb.append("null");
      } else {
        sb.append(this.courseTaskList);
      }
      first = false;
    }
    if (isSetShelveCourseIdList()) {
      if (!first) sb.append(", ");
      sb.append("shelveCourseIdList:");
      if (this.shelveCourseIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.shelveCourseIdList);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCSyncCourseTaskProcessMsgStandardSchemeFactory implements SchemeFactory {
    public SCSyncCourseTaskProcessMsgStandardScheme getScheme() {
      return new SCSyncCourseTaskProcessMsgStandardScheme();
    }
  }

  private static class SCSyncCourseTaskProcessMsgStandardScheme extends StandardScheme<SCSyncCourseTaskProcessMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COURSE_TASK_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.courseTaskList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  com.ling9527.music.common.msg.auto.CourseTaskData _elem10; // required
                  _elem10 = new com.ling9527.music.common.msg.auto.CourseTaskData();
                  _elem10.read(iprot);
                  struct.courseTaskList.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setCourseTaskListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHELVE_COURSE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.shelveCourseIdList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>(_list11.size);
                for (int _i12 = 0; _i12 < _list11.size; ++_i12)
                {
                  com.ling9527.music.common.msg.auto.CourseTaskData _elem13; // required
                  _elem13 = new com.ling9527.music.common.msg.auto.CourseTaskData();
                  _elem13.read(iprot);
                  struct.shelveCourseIdList.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setShelveCourseIdListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.courseTaskList != null) {
        if (struct.isSetCourseTaskList()) {
          oprot.writeFieldBegin(COURSE_TASK_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.courseTaskList.size()));
            for (com.ling9527.music.common.msg.auto.CourseTaskData _iter14 : struct.courseTaskList)
            {
              _iter14.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.shelveCourseIdList != null) {
        if (struct.isSetShelveCourseIdList()) {
          oprot.writeFieldBegin(SHELVE_COURSE_ID_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.shelveCourseIdList.size()));
            for (com.ling9527.music.common.msg.auto.CourseTaskData _iter15 : struct.shelveCourseIdList)
            {
              _iter15.write(oprot);
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

  private static class SCSyncCourseTaskProcessMsgTupleSchemeFactory implements SchemeFactory {
    public SCSyncCourseTaskProcessMsgTupleScheme getScheme() {
      return new SCSyncCourseTaskProcessMsgTupleScheme();
    }
  }

  private static class SCSyncCourseTaskProcessMsgTupleScheme extends TupleScheme<SCSyncCourseTaskProcessMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCourseTaskList()) {
        optionals.set(0);
      }
      if (struct.isSetShelveCourseIdList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCourseTaskList()) {
        {
          oprot.writeI32(struct.courseTaskList.size());
          for (com.ling9527.music.common.msg.auto.CourseTaskData _iter16 : struct.courseTaskList)
          {
            _iter16.write(oprot);
          }
        }
      }
      if (struct.isSetShelveCourseIdList()) {
        {
          oprot.writeI32(struct.shelveCourseIdList.size());
          for (com.ling9527.music.common.msg.auto.CourseTaskData _iter17 : struct.shelveCourseIdList)
          {
            _iter17.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCSyncCourseTaskProcessMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.courseTaskList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>(_list18.size);
          for (int _i19 = 0; _i19 < _list18.size; ++_i19)
          {
            com.ling9527.music.common.msg.auto.CourseTaskData _elem20; // required
            _elem20 = new com.ling9527.music.common.msg.auto.CourseTaskData();
            _elem20.read(iprot);
            struct.courseTaskList.add(_elem20);
          }
        }
        struct.setCourseTaskListIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.shelveCourseIdList = new ArrayList<com.ling9527.music.common.msg.auto.CourseTaskData>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            com.ling9527.music.common.msg.auto.CourseTaskData _elem23; // required
            _elem23 = new com.ling9527.music.common.msg.auto.CourseTaskData();
            _elem23.read(iprot);
            struct.shelveCourseIdList.add(_elem23);
          }
        }
        struct.setShelveCourseIdListIsSet(true);
      }
    }
  }

}

