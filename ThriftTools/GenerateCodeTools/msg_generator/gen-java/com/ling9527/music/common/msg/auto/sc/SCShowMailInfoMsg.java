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

public class SCShowMailInfoMsg implements org.apache.thrift.TBase<SCShowMailInfoMsg, SCShowMailInfoMsg._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCShowMailInfoMsg");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("contentId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CONTENT_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("contentParams", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField MAIL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("mailId", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField PRIZE_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("prizeInfos", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCShowMailInfoMsgStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCShowMailInfoMsgTupleSchemeFactory());
  }

  public String title; // required
  public String content; // required
  /**
   * 邮件内容多语言提示id，大于0时忽略content
   */
  public int contentId; // required
  /**
   * 邮件内容多语言提示参数
   */
  public List<String> contentParams; // required
  public long mailId; // required
  public com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    CONTENT((short)2, "content"),
    /**
     * 邮件内容多语言提示id，大于0时忽略content
     */
    CONTENT_ID((short)3, "contentId"),
    /**
     * 邮件内容多语言提示参数
     */
    CONTENT_PARAMS((short)4, "contentParams"),
    MAIL_ID((short)5, "mailId"),
    PRIZE_INFOS((short)6, "prizeInfos");

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
        case 1: // TITLE
          return TITLE;
        case 2: // CONTENT
          return CONTENT;
        case 3: // CONTENT_ID
          return CONTENT_ID;
        case 4: // CONTENT_PARAMS
          return CONTENT_PARAMS;
        case 5: // MAIL_ID
          return MAIL_ID;
        case 6: // PRIZE_INFOS
          return PRIZE_INFOS;
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
  private static final int __CONTENTID_ISSET_ID = 0;
  private static final int __MAILID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT_ID, new org.apache.thrift.meta_data.FieldMetaData("contentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CONTENT_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("contentParams", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.MAIL_ID, new org.apache.thrift.meta_data.FieldMetaData("mailId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRIZE_INFOS, new org.apache.thrift.meta_data.FieldMetaData("prizeInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ling9527.music.common.msg.auto.PrizeInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCShowMailInfoMsg.class, metaDataMap);
  }

  public SCShowMailInfoMsg() {
  }

  public SCShowMailInfoMsg(
    String title,
    String content,
    int contentId,
    List<String> contentParams,
    long mailId,
    com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos)
  {
    this();
    this.title = title;
    this.content = content;
    this.contentId = contentId;
    setContentIdIsSet(true);
    this.contentParams = contentParams;
    this.mailId = mailId;
    setMailIdIsSet(true);
    this.prizeInfos = prizeInfos;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCShowMailInfoMsg(SCShowMailInfoMsg other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
    this.contentId = other.contentId;
    if (other.isSetContentParams()) {
      List<String> __this__contentParams = new ArrayList<String>();
      for (String other_element : other.contentParams) {
        __this__contentParams.add(other_element);
      }
      this.contentParams = __this__contentParams;
    }
    this.mailId = other.mailId;
    if (other.isSetPrizeInfos()) {
      this.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo(other.prizeInfos);
    }
  }

  public SCShowMailInfoMsg deepCopy() {
    return new SCShowMailInfoMsg(this);
  }

  @Override
  public void clear() {
    this.title = null;
    this.content = null;
    setContentIdIsSet(false);
    this.contentId = 0;
    this.contentParams = null;
    setMailIdIsSet(false);
    this.mailId = 0;
    this.prizeInfos = null;
  }

  public String getTitle() {
    return this.title;
  }

  public SCShowMailInfoMsg setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getContent() {
    return this.content;
  }

  public SCShowMailInfoMsg setContent(String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  /**
   * 邮件内容多语言提示id，大于0时忽略content
   */
  public int getContentId() {
    return this.contentId;
  }

  /**
   * 邮件内容多语言提示id，大于0时忽略content
   */
  public SCShowMailInfoMsg setContentId(int contentId) {
    this.contentId = contentId;
    setContentIdIsSet(true);
    return this;
  }

  public void unsetContentId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONTENTID_ISSET_ID);
  }

  /** Returns true if field contentId is set (has been assigned a value) and false otherwise */
  public boolean isSetContentId() {
    return EncodingUtils.testBit(__isset_bitfield, __CONTENTID_ISSET_ID);
  }

  public void setContentIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONTENTID_ISSET_ID, value);
  }

  public int getContentParamsSize() {
    return (this.contentParams == null) ? 0 : this.contentParams.size();
  }

  public java.util.Iterator<String> getContentParamsIterator() {
    return (this.contentParams == null) ? null : this.contentParams.iterator();
  }

  public void addToContentParams(String elem) {
    if (this.contentParams == null) {
      this.contentParams = new ArrayList<String>();
    }
    this.contentParams.add(elem);
  }

  /**
   * 邮件内容多语言提示参数
   */
  public List<String> getContentParams() {
    return this.contentParams;
  }

  /**
   * 邮件内容多语言提示参数
   */
  public SCShowMailInfoMsg setContentParams(List<String> contentParams) {
    this.contentParams = contentParams;
    return this;
  }

  public void unsetContentParams() {
    this.contentParams = null;
  }

  /** Returns true if field contentParams is set (has been assigned a value) and false otherwise */
  public boolean isSetContentParams() {
    return this.contentParams != null;
  }

  public void setContentParamsIsSet(boolean value) {
    if (!value) {
      this.contentParams = null;
    }
  }

  public long getMailId() {
    return this.mailId;
  }

  public SCShowMailInfoMsg setMailId(long mailId) {
    this.mailId = mailId;
    setMailIdIsSet(true);
    return this;
  }

  public void unsetMailId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAILID_ISSET_ID);
  }

  /** Returns true if field mailId is set (has been assigned a value) and false otherwise */
  public boolean isSetMailId() {
    return EncodingUtils.testBit(__isset_bitfield, __MAILID_ISSET_ID);
  }

  public void setMailIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAILID_ISSET_ID, value);
  }

  public com.ling9527.music.common.msg.auto.PrizeInfo getPrizeInfos() {
    return this.prizeInfos;
  }

  public SCShowMailInfoMsg setPrizeInfos(com.ling9527.music.common.msg.auto.PrizeInfo prizeInfos) {
    this.prizeInfos = prizeInfos;
    return this;
  }

  public void unsetPrizeInfos() {
    this.prizeInfos = null;
  }

  /** Returns true if field prizeInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetPrizeInfos() {
    return this.prizeInfos != null;
  }

  public void setPrizeInfosIsSet(boolean value) {
    if (!value) {
      this.prizeInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((String)value);
      }
      break;

    case CONTENT_ID:
      if (value == null) {
        unsetContentId();
      } else {
        setContentId((Integer)value);
      }
      break;

    case CONTENT_PARAMS:
      if (value == null) {
        unsetContentParams();
      } else {
        setContentParams((List<String>)value);
      }
      break;

    case MAIL_ID:
      if (value == null) {
        unsetMailId();
      } else {
        setMailId((Long)value);
      }
      break;

    case PRIZE_INFOS:
      if (value == null) {
        unsetPrizeInfos();
      } else {
        setPrizeInfos((com.ling9527.music.common.msg.auto.PrizeInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case CONTENT:
      return getContent();

    case CONTENT_ID:
      return Integer.valueOf(getContentId());

    case CONTENT_PARAMS:
      return getContentParams();

    case MAIL_ID:
      return Long.valueOf(getMailId());

    case PRIZE_INFOS:
      return getPrizeInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TITLE:
      return isSetTitle();
    case CONTENT:
      return isSetContent();
    case CONTENT_ID:
      return isSetContentId();
    case CONTENT_PARAMS:
      return isSetContentParams();
    case MAIL_ID:
      return isSetMailId();
    case PRIZE_INFOS:
      return isSetPrizeInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCShowMailInfoMsg)
      return this.equals((SCShowMailInfoMsg)that);
    return false;
  }

  public boolean equals(SCShowMailInfoMsg that) {
    if (that == null)
      return false;

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_contentId = true;
    boolean that_present_contentId = true;
    if (this_present_contentId || that_present_contentId) {
      if (!(this_present_contentId && that_present_contentId))
        return false;
      if (this.contentId != that.contentId)
        return false;
    }

    boolean this_present_contentParams = true && this.isSetContentParams();
    boolean that_present_contentParams = true && that.isSetContentParams();
    if (this_present_contentParams || that_present_contentParams) {
      if (!(this_present_contentParams && that_present_contentParams))
        return false;
      if (!this.contentParams.equals(that.contentParams))
        return false;
    }

    boolean this_present_mailId = true;
    boolean that_present_mailId = true;
    if (this_present_mailId || that_present_mailId) {
      if (!(this_present_mailId && that_present_mailId))
        return false;
      if (this.mailId != that.mailId)
        return false;
    }

    boolean this_present_prizeInfos = true && this.isSetPrizeInfos();
    boolean that_present_prizeInfos = true && that.isSetPrizeInfos();
    if (this_present_prizeInfos || that_present_prizeInfos) {
      if (!(this_present_prizeInfos && that_present_prizeInfos))
        return false;
      if (!this.prizeInfos.equals(that.prizeInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCShowMailInfoMsg other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCShowMailInfoMsg typedOther = (SCShowMailInfoMsg)other;

    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(typedOther.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, typedOther.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(typedOther.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, typedOther.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContentId()).compareTo(typedOther.isSetContentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentId, typedOther.contentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContentParams()).compareTo(typedOther.isSetContentParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentParams, typedOther.contentParams);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMailId()).compareTo(typedOther.isSetMailId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMailId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mailId, typedOther.mailId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrizeInfos()).compareTo(typedOther.isSetPrizeInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrizeInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prizeInfos, typedOther.prizeInfos);
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
    StringBuilder sb = new StringBuilder("SCShowMailInfoMsg(");
    boolean first = true;

    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentId:");
    sb.append(this.contentId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentParams:");
    if (this.contentParams == null) {
      sb.append("null");
    } else {
      sb.append(this.contentParams);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mailId:");
    sb.append(this.mailId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("prizeInfos:");
    if (this.prizeInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.prizeInfos);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (prizeInfos != null) {
      prizeInfos.validate();
    }
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

  private static class SCShowMailInfoMsgStandardSchemeFactory implements SchemeFactory {
    public SCShowMailInfoMsgStandardScheme getScheme() {
      return new SCShowMailInfoMsgStandardScheme();
    }
  }

  private static class SCShowMailInfoMsgStandardScheme extends StandardScheme<SCShowMailInfoMsg> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCShowMailInfoMsg struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.contentId = iprot.readI32();
              struct.setContentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONTENT_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.contentParams = new ArrayList<String>(_list32.size);
                for (int _i33 = 0; _i33 < _list32.size; ++_i33)
                {
                  String _elem34; // required
                  _elem34 = iprot.readString();
                  struct.contentParams.add(_elem34);
                }
                iprot.readListEnd();
              }
              struct.setContentParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAIL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.mailId = iprot.readI64();
              struct.setMailIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRIZE_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo();
              struct.prizeInfos.read(iprot);
              struct.setPrizeInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCShowMailInfoMsg struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CONTENT_ID_FIELD_DESC);
      oprot.writeI32(struct.contentId);
      oprot.writeFieldEnd();
      if (struct.contentParams != null) {
        oprot.writeFieldBegin(CONTENT_PARAMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.contentParams.size()));
          for (String _iter35 : struct.contentParams)
          {
            oprot.writeString(_iter35);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MAIL_ID_FIELD_DESC);
      oprot.writeI64(struct.mailId);
      oprot.writeFieldEnd();
      if (struct.prizeInfos != null) {
        oprot.writeFieldBegin(PRIZE_INFOS_FIELD_DESC);
        struct.prizeInfos.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCShowMailInfoMsgTupleSchemeFactory implements SchemeFactory {
    public SCShowMailInfoMsgTupleScheme getScheme() {
      return new SCShowMailInfoMsgTupleScheme();
    }
  }

  private static class SCShowMailInfoMsgTupleScheme extends TupleScheme<SCShowMailInfoMsg> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCShowMailInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetContent()) {
        optionals.set(1);
      }
      if (struct.isSetContentId()) {
        optionals.set(2);
      }
      if (struct.isSetContentParams()) {
        optionals.set(3);
      }
      if (struct.isSetMailId()) {
        optionals.set(4);
      }
      if (struct.isSetPrizeInfos()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetContentId()) {
        oprot.writeI32(struct.contentId);
      }
      if (struct.isSetContentParams()) {
        {
          oprot.writeI32(struct.contentParams.size());
          for (String _iter36 : struct.contentParams)
          {
            oprot.writeString(_iter36);
          }
        }
      }
      if (struct.isSetMailId()) {
        oprot.writeI64(struct.mailId);
      }
      if (struct.isSetPrizeInfos()) {
        struct.prizeInfos.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCShowMailInfoMsg struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.contentId = iprot.readI32();
        struct.setContentIdIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.contentParams = new ArrayList<String>(_list37.size);
          for (int _i38 = 0; _i38 < _list37.size; ++_i38)
          {
            String _elem39; // required
            _elem39 = iprot.readString();
            struct.contentParams.add(_elem39);
          }
        }
        struct.setContentParamsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.mailId = iprot.readI64();
        struct.setMailIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.prizeInfos = new com.ling9527.music.common.msg.auto.PrizeInfo();
        struct.prizeInfos.read(iprot);
        struct.setPrizeInfosIsSet(true);
      }
    }
  }

}
