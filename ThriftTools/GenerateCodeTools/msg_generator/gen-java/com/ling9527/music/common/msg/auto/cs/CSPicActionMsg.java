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

public class CSPicActionMsg implements org.apache.thrift.TBase<CSPicActionMsg, CSPicActionMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CSPicActionMsg");

  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PIC_FIELD_DESC = new org.apache.thrift.protocol.TField("pic", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("charId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CSPicActionMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CSPicActionMsgTupleSchemeFactory());
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PicAction
   */
  public com.ling9527.music.common.msg.auto.PicAction action; // required
  public String pic; // required
  public long charId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see com.ling9527.music.common.msg.auto.PicAction
     */
    ACTION((short)1, "action"),
    PIC((short)2, "pic"),
    CHAR_ID((short)3, "charId");

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
        case 1: // ACTION
          return ACTION;
        case 2: // PIC
          return PIC;
        case 3: // CHAR_ID
          return CHAR_ID;
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
  private static final int __CHARID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.PicAction.class)));
    tmpMap.put(_Fields.PIC, new org.apache.thrift.meta_data.FieldMetaData("pic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("charId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CSPicActionMsg.class, metaDataMap);
  }

  public CSPicActionMsg() {
  }

  public CSPicActionMsg(
    com.ling9527.music.common.msg.auto.PicAction action,
    String pic,
    long charId)
  {
    this();
    this.action = action;
    this.pic = pic;
    this.charId = charId;
    setCharIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CSPicActionMsg(CSPicActionMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAction()) {
      this.action = other.action;
    }
    if (other.isSetPic()) {
      this.pic = other.pic;
    }
    this.charId = other.charId;
  }

  public CSPicActionMsg deepCopy() {
    return new CSPicActionMsg(this);
  }

  @Override
  public void clear() {
    this.action = null;
    this.pic = null;
    setCharIdIsSet(false);
    this.charId = 0;
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PicAction
   */
  public com.ling9527.music.common.msg.auto.PicAction getAction() {
    return this.action;
  }

  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PicAction
   */
  public CSPicActionMsg setAction(com.ling9527.music.common.msg.auto.PicAction action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public String getPic() {
    return this.pic;
  }

  public CSPicActionMsg setPic(String pic) {
    this.pic = pic;
    return this;
  }

  public void unsetPic() {
    this.pic = null;
  }

  /** Returns true if field pic is set (has been assigned a value) and false otherwise */
  public boolean isSetPic() {
    return this.pic != null;
  }

  public void setPicIsSet(boolean value) {
    if (!value) {
      this.pic = null;
    }
  }

  public long getCharId() {
    return this.charId;
  }

  public CSPicActionMsg setCharId(long charId) {
    this.charId = charId;
    setCharIdIsSet(true);
    return this;
  }

  public void unsetCharId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  /** Returns true if field charId is set (has been assigned a value) and false otherwise */
  public boolean isSetCharId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHARID_ISSET_ID);
  }

  public void setCharIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHARID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((com.ling9527.music.common.msg.auto.PicAction)value);
      }
      break;

    case PIC:
      if (value == null) {
        unsetPic();
      } else {
        setPic((String)value);
      }
      break;

    case CHAR_ID:
      if (value == null) {
        unsetCharId();
      } else {
        setCharId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION:
      return getAction();

    case PIC:
      return getPic();

    case CHAR_ID:
      return Long.valueOf(getCharId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION:
      return isSetAction();
    case PIC:
      return isSetPic();
    case CHAR_ID:
      return isSetCharId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CSPicActionMsg)
      return this.equals((CSPicActionMsg)that);
    return false;
  }

  public boolean equals(CSPicActionMsg that) {
    if (that == null)
      return false;

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_pic = true && this.isSetPic();
    boolean that_present_pic = true && that.isSetPic();
    if (this_present_pic || that_present_pic) {
      if (!(this_present_pic && that_present_pic))
        return false;
      if (!this.pic.equals(that.pic))
        return false;
    }

    boolean this_present_charId = true;
    boolean that_present_charId = true;
    if (this_present_charId || that_present_charId) {
      if (!(this_present_charId && that_present_charId))
        return false;
      if (this.charId != that.charId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CSPicActionMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CSPicActionMsg typedOther = (CSPicActionMsg)other;

    lastComparison = Boolean.valueOf(isSetAction()).compareTo(typedOther.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, typedOther.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPic()).compareTo(typedOther.isSetPic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pic, typedOther.pic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCharId()).compareTo(typedOther.isSetCharId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.charId, typedOther.charId);
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
    StringBuilder sb = new StringBuilder("CSPicActionMsg(");
    boolean first = true;

    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pic:");
    if (this.pic == null) {
      sb.append("null");
    } else {
      sb.append(this.pic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("charId:");
    sb.append(this.charId);
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

  private static class CSPicActionMsgStandardSchemeFactory implements SchemeFactory {
    public CSPicActionMsgStandardScheme getScheme() {
      return new CSPicActionMsgStandardScheme();
    }
  }

  private static class CSPicActionMsgStandardScheme extends StandardScheme<CSPicActionMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CSPicActionMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = com.ling9527.music.common.msg.auto.PicAction.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pic = iprot.readString();
              struct.setPicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.charId = iprot.readI64();
              struct.setCharIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CSPicActionMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action != null) {
        oprot.writeFieldBegin(ACTION_FIELD_DESC);
        oprot.writeI32(struct.action.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.pic != null) {
        oprot.writeFieldBegin(PIC_FIELD_DESC);
        oprot.writeString(struct.pic);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.charId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CSPicActionMsgTupleSchemeFactory implements SchemeFactory {
    public CSPicActionMsgTupleScheme getScheme() {
      return new CSPicActionMsgTupleScheme();
    }
  }

  private static class CSPicActionMsgTupleScheme extends TupleScheme<CSPicActionMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CSPicActionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAction()) {
        optionals.set(0);
      }
      if (struct.isSetPic()) {
        optionals.set(1);
      }
      if (struct.isSetCharId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAction()) {
        oprot.writeI32(struct.action.getValue());
      }
      if (struct.isSetPic()) {
        oprot.writeString(struct.pic);
      }
      if (struct.isSetCharId()) {
        oprot.writeI64(struct.charId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CSPicActionMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.action = com.ling9527.music.common.msg.auto.PicAction.findByValue(iprot.readI32());
        struct.setActionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.pic = iprot.readString();
        struct.setPicIsSet(true);
      }
      if (incoming.get(2)) {
        struct.charId = iprot.readI64();
        struct.setCharIdIsSet(true);
      }
    }
  }

}

