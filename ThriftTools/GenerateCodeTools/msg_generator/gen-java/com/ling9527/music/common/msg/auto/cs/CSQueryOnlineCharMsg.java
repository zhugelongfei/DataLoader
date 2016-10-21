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

public class CSQueryOnlineCharMsg implements org.apache.thrift.TBase<CSQueryOnlineCharMsg, CSQueryOnlineCharMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSQueryOnlineCharMsg");

  private static final org.apache.thrift.protocol.TField CHAR_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("charIdList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TID_FIELD_DESC = new org.apache.thrift.protocol.TField("tid", org.apache.thrift.protocol.TType.BYTE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSQueryOnlineCharMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSQueryOnlineCharMsgTupleSchemeFactory());
  }

  public List<Long> charIdList; // required
  public byte tid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHAR_ID_LIST((short)1, "charIdList"),
    TID((short)2, "tid");

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
        case 1: // CHAR_ID_LIST
          return CHAR_ID_LIST;
        case 2: // TID
          return TID;
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
  private static final int __TID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHAR_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("charIdList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.TID, new org.apache.thrift.meta_data.FieldMetaData("tid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSQueryOnlineCharMsg.class, metaDataMap);
  }

  public CSQueryOnlineCharMsg() {
  }

  public CSQueryOnlineCharMsg(
    List<Long> charIdList,
    byte tid)
  {
    this();
    this.charIdList = charIdList;
    this.tid = tid;
    setTidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSQueryOnlineCharMsg(CSQueryOnlineCharMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCharIdList()) {
      List<Long> __this__charIdList = new ArrayList<Long>();
      for (Long other_element : other.charIdList) {
        __this__charIdList.add(other_element);
      }
      this.charIdList = __this__charIdList;
    }
    this.tid = other.tid;
  }

  public CSQueryOnlineCharMsg deepCopy() {
    return new CSQueryOnlineCharMsg(this);
  }

  @Override
  public void clear() {
    this.charIdList = null;
    setTidIsSet(false);
    this.tid = 0;
  }

  public int getCharIdListSize() {
    return (this.charIdList == null) ? 0 : this.charIdList.size();
  }

  public java.util.Iterator<Long> getCharIdListIterator() {
    return (this.charIdList == null) ? null : this.charIdList.iterator();
  }

  public void addToCharIdList(long elem) {
    if (this.charIdList == null) {
      this.charIdList = new ArrayList<Long>();
    }
    this.charIdList.add(elem);
  }

  public List<Long> getCharIdList() {
    return this.charIdList;
  }

  public CSQueryOnlineCharMsg setCharIdList(List<Long> charIdList) {
    this.charIdList = charIdList;
    return this;
  }

  public void unsetCharIdList() {
    this.charIdList = null;
  }

  /** Returns true if field charIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetCharIdList() {
    return this.charIdList != null;
  }

  public void setCharIdListIsSet(boolean value) {
    if (!value) {
      this.charIdList = null;
    }
  }

  public byte getTid() {
    return this.tid;
  }

  public CSQueryOnlineCharMsg setTid(byte tid) {
    this.tid = tid;
    setTidIsSet(true);
    return this;
  }

  public void unsetTid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TID_ISSET_ID);
  }

  /** Returns true if field tid is set (has been assigned a value) and false otherwise */
  public boolean isSetTid() {
    return EncodingUtils.testBit(__isset_bitfield, __TID_ISSET_ID);
  }

  public void setTidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHAR_ID_LIST:
      if (value == null) {
        unsetCharIdList();
      } else {
        setCharIdList((List<Long>)value);
      }
      break;

    case TID:
      if (value == null) {
        unsetTid();
      } else {
        setTid((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHAR_ID_LIST:
      return getCharIdList();

    case TID:
      return Byte.valueOf(getTid());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHAR_ID_LIST:
      return isSetCharIdList();
    case TID:
      return isSetTid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSQueryOnlineCharMsg)
      return this.equals((CSQueryOnlineCharMsg)that);
    return false;
  }

  public boolean equals(CSQueryOnlineCharMsg that) {
    if (that == null)
      return false;

    boolean this_present_charIdList = true && this.isSetCharIdList();
    boolean that_present_charIdList = true && that.isSetCharIdList();
    if (this_present_charIdList || that_present_charIdList) {
      if (!(this_present_charIdList && that_present_charIdList))
        return false;
      if (!this.charIdList.equals(that.charIdList))
        return false;
    }

    boolean this_present_tid = true;
    boolean that_present_tid = true;
    if (this_present_tid || that_present_tid) {
      if (!(this_present_tid && that_present_tid))
        return false;
      if (this.tid != that.tid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSQueryOnlineCharMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSQueryOnlineCharMsg typedOther = (CSQueryOnlineCharMsg)other;

    lastComparison = Boolean.valueOf(isSetCharIdList()).compareTo(typedOther.isSetCharIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.charIdList, typedOther.charIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTid()).compareTo(typedOther.isSetTid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tid, typedOther.tid);
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
    StringBuilder sb = new StringBuilder("CSQueryOnlineCharMsg(");
    boolean first = true;

    sb.append("charIdList:");
    if (this.charIdList == null) {
      sb.append("null");
    } else {
      sb.append(this.charIdList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tid:");
    sb.append(this.tid);
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

  private static class CSQueryOnlineCharMsgStandardSchemeFactory implements SchemeFactory {
    public CSQueryOnlineCharMsgStandardScheme getScheme() {
      return new CSQueryOnlineCharMsgStandardScheme();
    }
  }

  private static class CSQueryOnlineCharMsgStandardScheme extends StandardScheme<CSQueryOnlineCharMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSQueryOnlineCharMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHAR_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.charIdList = new ArrayList<Long>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  long _elem2; // required
                  _elem2 = iprot.readI64();
                  struct.charIdList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setCharIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TID
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.tid = iprot.readByte();
              struct.setTidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSQueryOnlineCharMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.charIdList != null) {
        oprot.writeFieldBegin(CHAR_ID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.charIdList.size()));
          for (long _iter3 : struct.charIdList)
          {
            oprot.writeI64(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TID_FIELD_DESC);
      oprot.writeByte(struct.tid);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSQueryOnlineCharMsgTupleSchemeFactory implements SchemeFactory {
    public CSQueryOnlineCharMsgTupleScheme getScheme() {
      return new CSQueryOnlineCharMsgTupleScheme();
    }
  }

  private static class CSQueryOnlineCharMsgTupleScheme extends TupleScheme<CSQueryOnlineCharMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSQueryOnlineCharMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCharIdList()) {
        optionals.set(0);
      }
      if (struct.isSetTid()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCharIdList()) {
        {
          oprot.writeI32(struct.charIdList.size());
          for (long _iter4 : struct.charIdList)
          {
            oprot.writeI64(_iter4);
          }
        }
      }
      if (struct.isSetTid()) {
        oprot.writeByte(struct.tid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSQueryOnlineCharMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.charIdList = new ArrayList<Long>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            long _elem7; // required
            _elem7 = iprot.readI64();
            struct.charIdList.add(_elem7);
          }
        }
        struct.setCharIdListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tid = iprot.readByte();
        struct.setTidIsSet(true);
      }
    }
  }

}
