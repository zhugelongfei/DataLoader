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

public class SCPicActionResultMsg implements org.apache.thrift.TBase<SCPicActionResultMsg, SCPicActionResultMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCPicActionResultMsg");

  private static final org.apache.thrift.protocol.TField PIC_FIELD_DESC = new org.apache.thrift.protocol.TField("pic", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField PIC_THUM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("picThumId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCPicActionResultMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCPicActionResultMsgTupleSchemeFactory());
  }

  public String pic; // required
  /**
   * 
   * @see com.ling9527.music.common.msg.auto.PicAction
   */
  public com.ling9527.music.common.msg.auto.PicAction action; // required
  public byte state; // required
  /**
   * 缩略图id
   */
  public String picThumId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PIC((short)1, "pic"),
    /**
     * 
     * @see com.ling9527.music.common.msg.auto.PicAction
     */
    ACTION((short)2, "action"),
    STATE((short)3, "state"),
    /**
     * 缩略图id
     */
    PIC_THUM_ID((short)4, "picThumId");

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
        case 1: // PIC
          return PIC;
        case 2: // ACTION
          return ACTION;
        case 3: // STATE
          return STATE;
        case 4: // PIC_THUM_ID
          return PIC_THUM_ID;
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
  private static final int __STATE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PIC_THUM_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PIC, new org.apache.thrift.meta_data.FieldMetaData("pic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.ling9527.music.common.msg.auto.PicAction.class)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.PIC_THUM_ID, new org.apache.thrift.meta_data.FieldMetaData("picThumId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCPicActionResultMsg.class, metaDataMap);
  }

  public SCPicActionResultMsg() {
  }

  public SCPicActionResultMsg(
    String pic,
    com.ling9527.music.common.msg.auto.PicAction action,
    byte state)
  {
    this();
    this.pic = pic;
    this.action = action;
    this.state = state;
    setStateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCPicActionResultMsg(SCPicActionResultMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPic()) {
      this.pic = other.pic;
    }
    if (other.isSetAction()) {
      this.action = other.action;
    }
    this.state = other.state;
    if (other.isSetPicThumId()) {
      this.picThumId = other.picThumId;
    }
  }

  public SCPicActionResultMsg deepCopy() {
    return new SCPicActionResultMsg(this);
  }

  @Override
  public void clear() {
    this.pic = null;
    this.action = null;
    setStateIsSet(false);
    this.state = 0;
    this.picThumId = null;
  }

  public String getPic() {
    return this.pic;
  }

  public SCPicActionResultMsg setPic(String pic) {
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
  public SCPicActionResultMsg setAction(com.ling9527.music.common.msg.auto.PicAction action) {
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

  public byte getState() {
    return this.state;
  }

  public SCPicActionResultMsg setState(byte state) {
    this.state = state;
    setStateIsSet(true);
    return this;
  }

  public void unsetState() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATE_ISSET_ID);
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return EncodingUtils.testBit(__isset_bitfield, __STATE_ISSET_ID);
  }

  public void setStateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATE_ISSET_ID, value);
  }

  /**
   * 缩略图id
   */
  public String getPicThumId() {
    return this.picThumId;
  }

  /**
   * 缩略图id
   */
  public SCPicActionResultMsg setPicThumId(String picThumId) {
    this.picThumId = picThumId;
    return this;
  }

  public void unsetPicThumId() {
    this.picThumId = null;
  }

  /** Returns true if field picThumId is set (has been assigned a value) and false otherwise */
  public boolean isSetPicThumId() {
    return this.picThumId != null;
  }

  public void setPicThumIdIsSet(boolean value) {
    if (!value) {
      this.picThumId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PIC:
      if (value == null) {
        unsetPic();
      } else {
        setPic((String)value);
      }
      break;

    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((com.ling9527.music.common.msg.auto.PicAction)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((Byte)value);
      }
      break;

    case PIC_THUM_ID:
      if (value == null) {
        unsetPicThumId();
      } else {
        setPicThumId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PIC:
      return getPic();

    case ACTION:
      return getAction();

    case STATE:
      return Byte.valueOf(getState());

    case PIC_THUM_ID:
      return getPicThumId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PIC:
      return isSetPic();
    case ACTION:
      return isSetAction();
    case STATE:
      return isSetState();
    case PIC_THUM_ID:
      return isSetPicThumId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCPicActionResultMsg)
      return this.equals((SCPicActionResultMsg)that);
    return false;
  }

  public boolean equals(SCPicActionResultMsg that) {
    if (that == null)
      return false;

    boolean this_present_pic = true && this.isSetPic();
    boolean that_present_pic = true && that.isSetPic();
    if (this_present_pic || that_present_pic) {
      if (!(this_present_pic && that_present_pic))
        return false;
      if (!this.pic.equals(that.pic))
        return false;
    }

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_state = true;
    boolean that_present_state = true;
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (this.state != that.state)
        return false;
    }

    boolean this_present_picThumId = true && this.isSetPicThumId();
    boolean that_present_picThumId = true && that.isSetPicThumId();
    if (this_present_picThumId || that_present_picThumId) {
      if (!(this_present_picThumId && that_present_picThumId))
        return false;
      if (!this.picThumId.equals(that.picThumId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCPicActionResultMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCPicActionResultMsg typedOther = (SCPicActionResultMsg)other;

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
    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, typedOther.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPicThumId()).compareTo(typedOther.isSetPicThumId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPicThumId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.picThumId, typedOther.picThumId);
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
    StringBuilder sb = new StringBuilder("SCPicActionResultMsg(");
    boolean first = true;

    sb.append("pic:");
    if (this.pic == null) {
      sb.append("null");
    } else {
      sb.append(this.pic);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    sb.append(this.state);
    first = false;
    if (isSetPicThumId()) {
      if (!first) sb.append(", ");
      sb.append("picThumId:");
      if (this.picThumId == null) {
        sb.append("null");
      } else {
        sb.append(this.picThumId);
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

  private static class SCPicActionResultMsgStandardSchemeFactory implements SchemeFactory {
    public SCPicActionResultMsgStandardScheme getScheme() {
      return new SCPicActionResultMsgStandardScheme();
    }
  }

  private static class SCPicActionResultMsgStandardScheme extends StandardScheme<SCPicActionResultMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCPicActionResultMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pic = iprot.readString();
              struct.setPicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = com.ling9527.music.common.msg.auto.PicAction.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.state = iprot.readByte();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PIC_THUM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.picThumId = iprot.readString();
              struct.setPicThumIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCPicActionResultMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pic != null) {
        oprot.writeFieldBegin(PIC_FIELD_DESC);
        oprot.writeString(struct.pic);
        oprot.writeFieldEnd();
      }
      if (struct.action != null) {
        oprot.writeFieldBegin(ACTION_FIELD_DESC);
        oprot.writeI32(struct.action.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeByte(struct.state);
      oprot.writeFieldEnd();
      if (struct.picThumId != null) {
        if (struct.isSetPicThumId()) {
          oprot.writeFieldBegin(PIC_THUM_ID_FIELD_DESC);
          oprot.writeString(struct.picThumId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCPicActionResultMsgTupleSchemeFactory implements SchemeFactory {
    public SCPicActionResultMsgTupleScheme getScheme() {
      return new SCPicActionResultMsgTupleScheme();
    }
  }

  private static class SCPicActionResultMsgTupleScheme extends TupleScheme<SCPicActionResultMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCPicActionResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPic()) {
        optionals.set(0);
      }
      if (struct.isSetAction()) {
        optionals.set(1);
      }
      if (struct.isSetState()) {
        optionals.set(2);
      }
      if (struct.isSetPicThumId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPic()) {
        oprot.writeString(struct.pic);
      }
      if (struct.isSetAction()) {
        oprot.writeI32(struct.action.getValue());
      }
      if (struct.isSetState()) {
        oprot.writeByte(struct.state);
      }
      if (struct.isSetPicThumId()) {
        oprot.writeString(struct.picThumId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCPicActionResultMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.pic = iprot.readString();
        struct.setPicIsSet(true);
      }
      if (incoming.get(1)) {
        struct.action = com.ling9527.music.common.msg.auto.PicAction.findByValue(iprot.readI32());
        struct.setActionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.state = iprot.readByte();
        struct.setStateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.picThumId = iprot.readString();
        struct.setPicThumIdIsSet(true);
      }
    }
  }

}
