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

public class SCSyncBodyAvatarMsg implements org.apache.thrift.TBase<SCSyncBodyAvatarMsg, SCSyncBodyAvatarMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCSyncBodyAvatarMsg");

  private static final org.apache.thrift.protocol.TField BODY_AVATARS_FIELD_DESC = new org.apache.thrift.protocol.TField("bodyAvatars", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCSyncBodyAvatarMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCSyncBodyAvatarMsgTupleSchemeFactory());
  }

  public List<com.ling9527.music.common.msg.auto.AvatarItemInfo> bodyAvatars; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BODY_AVATARS((short)1, "bodyAvatars");

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
        case 1: // BODY_AVATARS
          return BODY_AVATARS;
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
    tmpMap.put(_Fields.BODY_AVATARS, new org.apache.thrift.meta_data.FieldMetaData("bodyAvatars", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.AvatarItemInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCSyncBodyAvatarMsg.class, metaDataMap);
  }

  public SCSyncBodyAvatarMsg() {
  }

  public SCSyncBodyAvatarMsg(
    List<com.ling9527.music.common.msg.auto.AvatarItemInfo> bodyAvatars)
  {
    this();
    this.bodyAvatars = bodyAvatars;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCSyncBodyAvatarMsg(SCSyncBodyAvatarMsg other) {
    if (other.isSetBodyAvatars()) {
      List<com.ling9527.music.common.msg.auto.AvatarItemInfo> __this__bodyAvatars = new ArrayList<com.ling9527.music.common.msg.auto.AvatarItemInfo>();
      for (com.ling9527.music.common.msg.auto.AvatarItemInfo other_element : other.bodyAvatars) {
        __this__bodyAvatars.add(new com.ling9527.music.common.msg.auto.AvatarItemInfo(other_element));
      }
      this.bodyAvatars = __this__bodyAvatars;
    }
  }

  public SCSyncBodyAvatarMsg deepCopy() {
    return new SCSyncBodyAvatarMsg(this);
  }

  @Override
  public void clear() {
    this.bodyAvatars = null;
  }

  public int getBodyAvatarsSize() {
    return (this.bodyAvatars == null) ? 0 : this.bodyAvatars.size();
  }

  public java.util.Iterator<com.ling9527.music.common.msg.auto.AvatarItemInfo> getBodyAvatarsIterator() {
    return (this.bodyAvatars == null) ? null : this.bodyAvatars.iterator();
  }

  public void addToBodyAvatars(com.ling9527.music.common.msg.auto.AvatarItemInfo elem) {
    if (this.bodyAvatars == null) {
      this.bodyAvatars = new ArrayList<com.ling9527.music.common.msg.auto.AvatarItemInfo>();
    }
    this.bodyAvatars.add(elem);
  }

  public List<com.ling9527.music.common.msg.auto.AvatarItemInfo> getBodyAvatars() {
    return this.bodyAvatars;
  }

  public SCSyncBodyAvatarMsg setBodyAvatars(List<com.ling9527.music.common.msg.auto.AvatarItemInfo> bodyAvatars) {
    this.bodyAvatars = bodyAvatars;
    return this;
  }

  public void unsetBodyAvatars() {
    this.bodyAvatars = null;
  }

  /** Returns true if field bodyAvatars is set (has been assigned a value) and false otherwise */
  public boolean isSetBodyAvatars() {
    return this.bodyAvatars != null;
  }

  public void setBodyAvatarsIsSet(boolean value) {
    if (!value) {
      this.bodyAvatars = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BODY_AVATARS:
      if (value == null) {
        unsetBodyAvatars();
      } else {
        setBodyAvatars((List<com.ling9527.music.common.msg.auto.AvatarItemInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BODY_AVATARS:
      return getBodyAvatars();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BODY_AVATARS:
      return isSetBodyAvatars();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCSyncBodyAvatarMsg)
      return this.equals((SCSyncBodyAvatarMsg)that);
    return false;
  }

  public boolean equals(SCSyncBodyAvatarMsg that) {
    if (that == null)
      return false;

    boolean this_present_bodyAvatars = true && this.isSetBodyAvatars();
    boolean that_present_bodyAvatars = true && that.isSetBodyAvatars();
    if (this_present_bodyAvatars || that_present_bodyAvatars) {
      if (!(this_present_bodyAvatars && that_present_bodyAvatars))
        return false;
      if (!this.bodyAvatars.equals(that.bodyAvatars))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCSyncBodyAvatarMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCSyncBodyAvatarMsg typedOther = (SCSyncBodyAvatarMsg)other;

    lastComparison = Boolean.valueOf(isSetBodyAvatars()).compareTo(typedOther.isSetBodyAvatars());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBodyAvatars()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bodyAvatars, typedOther.bodyAvatars);
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
    StringBuilder sb = new StringBuilder("SCSyncBodyAvatarMsg(");
    boolean first = true;

    sb.append("bodyAvatars:");
    if (this.bodyAvatars == null) {
      sb.append("null");
    } else {
      sb.append(this.bodyAvatars);
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

  private static class SCSyncBodyAvatarMsgStandardSchemeFactory implements SchemeFactory {
    public SCSyncBodyAvatarMsgStandardScheme getScheme() {
      return new SCSyncBodyAvatarMsgStandardScheme();
    }
  }

  private static class SCSyncBodyAvatarMsgStandardScheme extends StandardScheme<SCSyncBodyAvatarMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCSyncBodyAvatarMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BODY_AVATARS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.bodyAvatars = new ArrayList<com.ling9527.music.common.msg.auto.AvatarItemInfo>(_list80.size);
                for (int _i81 = 0; _i81 < _list80.size; ++_i81)
                {
                  com.ling9527.music.common.msg.auto.AvatarItemInfo _elem82; // required
                  _elem82 = new com.ling9527.music.common.msg.auto.AvatarItemInfo();
                  _elem82.read(iprot);
                  struct.bodyAvatars.add(_elem82);
                }
                iprot.readListEnd();
              }
              struct.setBodyAvatarsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCSyncBodyAvatarMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.bodyAvatars != null) {
        oprot.writeFieldBegin(BODY_AVATARS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.bodyAvatars.size()));
          for (com.ling9527.music.common.msg.auto.AvatarItemInfo _iter83 : struct.bodyAvatars)
          {
            _iter83.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCSyncBodyAvatarMsgTupleSchemeFactory implements SchemeFactory {
    public SCSyncBodyAvatarMsgTupleScheme getScheme() {
      return new SCSyncBodyAvatarMsgTupleScheme();
    }
  }

  private static class SCSyncBodyAvatarMsgTupleScheme extends TupleScheme<SCSyncBodyAvatarMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCSyncBodyAvatarMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBodyAvatars()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetBodyAvatars()) {
        {
          oprot.writeI32(struct.bodyAvatars.size());
          for (com.ling9527.music.common.msg.auto.AvatarItemInfo _iter84 : struct.bodyAvatars)
          {
            _iter84.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCSyncBodyAvatarMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.bodyAvatars = new ArrayList<com.ling9527.music.common.msg.auto.AvatarItemInfo>(_list85.size);
          for (int _i86 = 0; _i86 < _list85.size; ++_i86)
          {
            com.ling9527.music.common.msg.auto.AvatarItemInfo _elem87; // required
            _elem87 = new com.ling9527.music.common.msg.auto.AvatarItemInfo();
            _elem87.read(iprot);
            struct.bodyAvatars.add(_elem87);
          }
        }
        struct.setBodyAvatarsIsSet(true);
      }
    }
  }

}

