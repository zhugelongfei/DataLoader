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

public class GameNotice implements org.apache.thrift.TBase<GameNotice, GameNotice._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GameNotice");

  private static final org.apache.thrift.protocol.TField PAGE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("pageUrl", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BUTTON_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("buttonName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DETAIL_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("detailUrl", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GameNoticeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GameNoticeTupleSchemeFactory());
  }

  public String pageUrl; // required
  public String buttonName; // required
  public String detailUrl; // required
  public String name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PAGE_URL((short)1, "pageUrl"),
    BUTTON_NAME((short)2, "buttonName"),
    DETAIL_URL((short)3, "detailUrl"),
    NAME((short)4, "name");

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
        case 1: // PAGE_URL
          return PAGE_URL;
        case 2: // BUTTON_NAME
          return BUTTON_NAME;
        case 3: // DETAIL_URL
          return DETAIL_URL;
        case 4: // NAME
          return NAME;
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
    tmpMap.put(_Fields.PAGE_URL, new org.apache.thrift.meta_data.FieldMetaData("pageUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUTTON_NAME, new org.apache.thrift.meta_data.FieldMetaData("buttonName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETAIL_URL, new org.apache.thrift.meta_data.FieldMetaData("detailUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GameNotice.class, metaDataMap);
  }

  public GameNotice() {
  }

  public GameNotice(
    String pageUrl,
    String buttonName,
    String detailUrl,
    String name)
  {
    this();
    this.pageUrl = pageUrl;
    this.buttonName = buttonName;
    this.detailUrl = detailUrl;
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GameNotice(GameNotice other) {
    if (other.isSetPageUrl()) {
      this.pageUrl = other.pageUrl;
    }
    if (other.isSetButtonName()) {
      this.buttonName = other.buttonName;
    }
    if (other.isSetDetailUrl()) {
      this.detailUrl = other.detailUrl;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
  }

  public GameNotice deepCopy() {
    return new GameNotice(this);
  }

  @Override
  public void clear() {
    this.pageUrl = null;
    this.buttonName = null;
    this.detailUrl = null;
    this.name = null;
  }

  public String getPageUrl() {
    return this.pageUrl;
  }

  public GameNotice setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  public void unsetPageUrl() {
    this.pageUrl = null;
  }

  /** Returns true if field pageUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetPageUrl() {
    return this.pageUrl != null;
  }

  public void setPageUrlIsSet(boolean value) {
    if (!value) {
      this.pageUrl = null;
    }
  }

  public String getButtonName() {
    return this.buttonName;
  }

  public GameNotice setButtonName(String buttonName) {
    this.buttonName = buttonName;
    return this;
  }

  public void unsetButtonName() {
    this.buttonName = null;
  }

  /** Returns true if field buttonName is set (has been assigned a value) and false otherwise */
  public boolean isSetButtonName() {
    return this.buttonName != null;
  }

  public void setButtonNameIsSet(boolean value) {
    if (!value) {
      this.buttonName = null;
    }
  }

  public String getDetailUrl() {
    return this.detailUrl;
  }

  public GameNotice setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
    return this;
  }

  public void unsetDetailUrl() {
    this.detailUrl = null;
  }

  /** Returns true if field detailUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetDetailUrl() {
    return this.detailUrl != null;
  }

  public void setDetailUrlIsSet(boolean value) {
    if (!value) {
      this.detailUrl = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public GameNotice setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PAGE_URL:
      if (value == null) {
        unsetPageUrl();
      } else {
        setPageUrl((String)value);
      }
      break;

    case BUTTON_NAME:
      if (value == null) {
        unsetButtonName();
      } else {
        setButtonName((String)value);
      }
      break;

    case DETAIL_URL:
      if (value == null) {
        unsetDetailUrl();
      } else {
        setDetailUrl((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PAGE_URL:
      return getPageUrl();

    case BUTTON_NAME:
      return getButtonName();

    case DETAIL_URL:
      return getDetailUrl();

    case NAME:
      return getName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PAGE_URL:
      return isSetPageUrl();
    case BUTTON_NAME:
      return isSetButtonName();
    case DETAIL_URL:
      return isSetDetailUrl();
    case NAME:
      return isSetName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GameNotice)
      return this.equals((GameNotice)that);
    return false;
  }

  public boolean equals(GameNotice that) {
    if (that == null)
      return false;

    boolean this_present_pageUrl = true && this.isSetPageUrl();
    boolean that_present_pageUrl = true && that.isSetPageUrl();
    if (this_present_pageUrl || that_present_pageUrl) {
      if (!(this_present_pageUrl && that_present_pageUrl))
        return false;
      if (!this.pageUrl.equals(that.pageUrl))
        return false;
    }

    boolean this_present_buttonName = true && this.isSetButtonName();
    boolean that_present_buttonName = true && that.isSetButtonName();
    if (this_present_buttonName || that_present_buttonName) {
      if (!(this_present_buttonName && that_present_buttonName))
        return false;
      if (!this.buttonName.equals(that.buttonName))
        return false;
    }

    boolean this_present_detailUrl = true && this.isSetDetailUrl();
    boolean that_present_detailUrl = true && that.isSetDetailUrl();
    if (this_present_detailUrl || that_present_detailUrl) {
      if (!(this_present_detailUrl && that_present_detailUrl))
        return false;
      if (!this.detailUrl.equals(that.detailUrl))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GameNotice other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GameNotice typedOther = (GameNotice)other;

    lastComparison = Boolean.valueOf(isSetPageUrl()).compareTo(typedOther.isSetPageUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPageUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pageUrl, typedOther.pageUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetButtonName()).compareTo(typedOther.isSetButtonName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetButtonName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buttonName, typedOther.buttonName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetailUrl()).compareTo(typedOther.isSetDetailUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetailUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.detailUrl, typedOther.detailUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
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
    StringBuilder sb = new StringBuilder("GameNotice(");
    boolean first = true;

    sb.append("pageUrl:");
    if (this.pageUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.pageUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buttonName:");
    if (this.buttonName == null) {
      sb.append("null");
    } else {
      sb.append(this.buttonName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("detailUrl:");
    if (this.detailUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.detailUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
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

  private static class GameNoticeStandardSchemeFactory implements SchemeFactory {
    public GameNoticeStandardScheme getScheme() {
      return new GameNoticeStandardScheme();
    }
  }

  private static class GameNoticeStandardScheme extends StandardScheme<GameNotice> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GameNotice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PAGE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pageUrl = iprot.readString();
              struct.setPageUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUTTON_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buttonName = iprot.readString();
              struct.setButtonNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DETAIL_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.detailUrl = iprot.readString();
              struct.setDetailUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GameNotice struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pageUrl != null) {
        oprot.writeFieldBegin(PAGE_URL_FIELD_DESC);
        oprot.writeString(struct.pageUrl);
        oprot.writeFieldEnd();
      }
      if (struct.buttonName != null) {
        oprot.writeFieldBegin(BUTTON_NAME_FIELD_DESC);
        oprot.writeString(struct.buttonName);
        oprot.writeFieldEnd();
      }
      if (struct.detailUrl != null) {
        oprot.writeFieldBegin(DETAIL_URL_FIELD_DESC);
        oprot.writeString(struct.detailUrl);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GameNoticeTupleSchemeFactory implements SchemeFactory {
    public GameNoticeTupleScheme getScheme() {
      return new GameNoticeTupleScheme();
    }
  }

  private static class GameNoticeTupleScheme extends TupleScheme<GameNotice> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GameNotice struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPageUrl()) {
        optionals.set(0);
      }
      if (struct.isSetButtonName()) {
        optionals.set(1);
      }
      if (struct.isSetDetailUrl()) {
        optionals.set(2);
      }
      if (struct.isSetName()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPageUrl()) {
        oprot.writeString(struct.pageUrl);
      }
      if (struct.isSetButtonName()) {
        oprot.writeString(struct.buttonName);
      }
      if (struct.isSetDetailUrl()) {
        oprot.writeString(struct.detailUrl);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GameNotice struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.pageUrl = iprot.readString();
        struct.setPageUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.buttonName = iprot.readString();
        struct.setButtonNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.detailUrl = iprot.readString();
        struct.setDetailUrlIsSet(true);
      }
      if (incoming.get(3)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
    }
  }

}

