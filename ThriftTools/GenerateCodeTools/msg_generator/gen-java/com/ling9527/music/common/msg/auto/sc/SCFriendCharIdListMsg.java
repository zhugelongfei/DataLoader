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
 * 好友charId列表
 */
public class SCFriendCharIdListMsg implements org.apache.thrift.TBase<SCFriendCharIdListMsg, SCFriendCharIdListMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCFriendCharIdListMsg");

  private static final org.apache.thrift.protocol.TField FRIEND_CHAR_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("friendCharIdList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCFriendCharIdListMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCFriendCharIdListMsgTupleSchemeFactory());
  }

  public List<Long> friendCharIdList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRIEND_CHAR_ID_LIST((short)2, "friendCharIdList");

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
        case 2: // FRIEND_CHAR_ID_LIST
          return FRIEND_CHAR_ID_LIST;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRIEND_CHAR_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("friendCharIdList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCFriendCharIdListMsg.class, metaDataMap);
  }

  public SCFriendCharIdListMsg() {
  }

  public SCFriendCharIdListMsg(
    List<Long> friendCharIdList)
  {
    this();
    this.friendCharIdList = friendCharIdList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCFriendCharIdListMsg(SCFriendCharIdListMsg other) {
    if (other.isSetFriendCharIdList()) {
      List<Long> __this__friendCharIdList = new ArrayList<Long>();
      for (Long other_element : other.friendCharIdList) {
        __this__friendCharIdList.add(other_element);
      }
      this.friendCharIdList = __this__friendCharIdList;
    }
  }

  public SCFriendCharIdListMsg deepCopy() {
    return new SCFriendCharIdListMsg(this);
  }

  @Override
  public void clear() {
    this.friendCharIdList = null;
  }

  public int getFriendCharIdListSize() {
    return (this.friendCharIdList == null) ? 0 : this.friendCharIdList.size();
  }

  public java.util.Iterator<Long> getFriendCharIdListIterator() {
    return (this.friendCharIdList == null) ? null : this.friendCharIdList.iterator();
  }

  public void addToFriendCharIdList(long elem) {
    if (this.friendCharIdList == null) {
      this.friendCharIdList = new ArrayList<Long>();
    }
    this.friendCharIdList.add(elem);
  }

  public List<Long> getFriendCharIdList() {
    return this.friendCharIdList;
  }

  public SCFriendCharIdListMsg setFriendCharIdList(List<Long> friendCharIdList) {
    this.friendCharIdList = friendCharIdList;
    return this;
  }

  public void unsetFriendCharIdList() {
    this.friendCharIdList = null;
  }

  /** Returns true if field friendCharIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendCharIdList() {
    return this.friendCharIdList != null;
  }

  public void setFriendCharIdListIsSet(boolean value) {
    if (!value) {
      this.friendCharIdList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRIEND_CHAR_ID_LIST:
      if (value == null) {
        unsetFriendCharIdList();
      } else {
        setFriendCharIdList((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRIEND_CHAR_ID_LIST:
      return getFriendCharIdList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRIEND_CHAR_ID_LIST:
      return isSetFriendCharIdList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCFriendCharIdListMsg)
      return this.equals((SCFriendCharIdListMsg)that);
    return false;
  }

  public boolean equals(SCFriendCharIdListMsg that) {
    if (that == null)
      return false;

    boolean this_present_friendCharIdList = true && this.isSetFriendCharIdList();
    boolean that_present_friendCharIdList = true && that.isSetFriendCharIdList();
    if (this_present_friendCharIdList || that_present_friendCharIdList) {
      if (!(this_present_friendCharIdList && that_present_friendCharIdList))
        return false;
      if (!this.friendCharIdList.equals(that.friendCharIdList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCFriendCharIdListMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCFriendCharIdListMsg typedOther = (SCFriendCharIdListMsg)other;

    lastComparison = Boolean.valueOf(isSetFriendCharIdList()).compareTo(typedOther.isSetFriendCharIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendCharIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendCharIdList, typedOther.friendCharIdList);
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
    StringBuilder sb = new StringBuilder("SCFriendCharIdListMsg(");
    boolean first = true;

    sb.append("friendCharIdList:");
    if (this.friendCharIdList == null) {
      sb.append("null");
    } else {
      sb.append(this.friendCharIdList);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCFriendCharIdListMsgStandardSchemeFactory implements SchemeFactory {
    public SCFriendCharIdListMsgStandardScheme getScheme() {
      return new SCFriendCharIdListMsgStandardScheme();
    }
  }

  private static class SCFriendCharIdListMsgStandardScheme extends StandardScheme<SCFriendCharIdListMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCFriendCharIdListMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // FRIEND_CHAR_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.friendCharIdList = new ArrayList<Long>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  long _elem10; // required
                  _elem10 = iprot.readI64();
                  struct.friendCharIdList.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setFriendCharIdListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCFriendCharIdListMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.friendCharIdList != null) {
        oprot.writeFieldBegin(FRIEND_CHAR_ID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.friendCharIdList.size()));
          for (long _iter11 : struct.friendCharIdList)
          {
            oprot.writeI64(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCFriendCharIdListMsgTupleSchemeFactory implements SchemeFactory {
    public SCFriendCharIdListMsgTupleScheme getScheme() {
      return new SCFriendCharIdListMsgTupleScheme();
    }
  }

  private static class SCFriendCharIdListMsgTupleScheme extends TupleScheme<SCFriendCharIdListMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCFriendCharIdListMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFriendCharIdList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFriendCharIdList()) {
        {
          oprot.writeI32(struct.friendCharIdList.size());
          for (long _iter12 : struct.friendCharIdList)
          {
            oprot.writeI64(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCFriendCharIdListMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.friendCharIdList = new ArrayList<Long>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            long _elem15; // required
            _elem15 = iprot.readI64();
            struct.friendCharIdList.add(_elem15);
          }
        }
        struct.setFriendCharIdListIsSet(true);
      }
    }
  }

}
