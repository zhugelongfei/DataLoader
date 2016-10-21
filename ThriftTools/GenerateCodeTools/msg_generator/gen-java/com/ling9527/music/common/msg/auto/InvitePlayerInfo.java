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

public class InvitePlayerInfo implements org.apache.thrift.TBase<InvitePlayerInfo, InvitePlayerInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InvitePlayerInfo");

  private static final org.apache.thrift.protocol.TField SEX_FIELD_DESC = new org.apache.thrift.protocol.TField("sex", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField CHAR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("charId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HEAD_ICON_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("headIconId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RELATION_FIELD_DESC = new org.apache.thrift.protocol.TField("relation", org.apache.thrift.protocol.TType.BYTE, (short)5);
  private static final org.apache.thrift.protocol.TField NAME_HEAD_FASHION_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("nameHeadFashionIds", org.apache.thrift.protocol.TType.MAP, (short)6);
  private static final org.apache.thrift.protocol.TField VIP_LVL_FIELD_DESC = new org.apache.thrift.protocol.TField("vipLvl", org.apache.thrift.protocol.TType.BYTE, (short)7);
  private static final org.apache.thrift.protocol.TField TAG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tagId", org.apache.thrift.protocol.TType.I16, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InvitePlayerInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InvitePlayerInfoTupleSchemeFactory());
  }

  public byte sex; // required
  public long charId; // required
  public String name; // required
  public String headIconId; // required
  public byte relation; // required
  /**
   * 使用中的名字和头像框时尚id key:style val:id
   */
  public Map<Byte,Integer> nameHeadFashionIds; // required
  public byte vipLvl; // required
  public short tagId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEX((short)1, "sex"),
    CHAR_ID((short)2, "charId"),
    NAME((short)3, "name"),
    HEAD_ICON_ID((short)4, "headIconId"),
    RELATION((short)5, "relation"),
    /**
     * 使用中的名字和头像框时尚id key:style val:id
     */
    NAME_HEAD_FASHION_IDS((short)6, "nameHeadFashionIds"),
    VIP_LVL((short)7, "vipLvl"),
    TAG_ID((short)8, "tagId");

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
        case 1: // SEX
          return SEX;
        case 2: // CHAR_ID
          return CHAR_ID;
        case 3: // NAME
          return NAME;
        case 4: // HEAD_ICON_ID
          return HEAD_ICON_ID;
        case 5: // RELATION
          return RELATION;
        case 6: // NAME_HEAD_FASHION_IDS
          return NAME_HEAD_FASHION_IDS;
        case 7: // VIP_LVL
          return VIP_LVL;
        case 8: // TAG_ID
          return TAG_ID;
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
  private static final int __SEX_ISSET_ID = 0;
  private static final int __CHARID_ISSET_ID = 1;
  private static final int __RELATION_ISSET_ID = 2;
  private static final int __VIPLVL_ISSET_ID = 3;
  private static final int __TAGID_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEX, new org.apache.thrift.meta_data.FieldMetaData("sex", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.CHAR_ID, new org.apache.thrift.meta_data.FieldMetaData("charId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEAD_ICON_ID, new org.apache.thrift.meta_data.FieldMetaData("headIconId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RELATION, new org.apache.thrift.meta_data.FieldMetaData("relation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.NAME_HEAD_FASHION_IDS, new org.apache.thrift.meta_data.FieldMetaData("nameHeadFashionIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.VIP_LVL, new org.apache.thrift.meta_data.FieldMetaData("vipLvl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.TAG_ID, new org.apache.thrift.meta_data.FieldMetaData("tagId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InvitePlayerInfo.class, metaDataMap);
  }

  public InvitePlayerInfo() {
  }

  public InvitePlayerInfo(
    byte sex,
    long charId,
    String name,
    String headIconId,
    byte relation,
    Map<Byte,Integer> nameHeadFashionIds,
    byte vipLvl,
    short tagId)
  {
    this();
    this.sex = sex;
    setSexIsSet(true);
    this.charId = charId;
    setCharIdIsSet(true);
    this.name = name;
    this.headIconId = headIconId;
    this.relation = relation;
    setRelationIsSet(true);
    this.nameHeadFashionIds = nameHeadFashionIds;
    this.vipLvl = vipLvl;
    setVipLvlIsSet(true);
    this.tagId = tagId;
    setTagIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InvitePlayerInfo(InvitePlayerInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sex = other.sex;
    this.charId = other.charId;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetHeadIconId()) {
      this.headIconId = other.headIconId;
    }
    this.relation = other.relation;
    if (other.isSetNameHeadFashionIds()) {
      Map<Byte,Integer> __this__nameHeadFashionIds = new HashMap<Byte,Integer>();
      for (Map.Entry<Byte, Integer> other_element : other.nameHeadFashionIds.entrySet()) {

        Byte other_element_key = other_element.getKey();
        Integer other_element_value = other_element.getValue();

        Byte __this__nameHeadFashionIds_copy_key = other_element_key;

        Integer __this__nameHeadFashionIds_copy_value = other_element_value;

        __this__nameHeadFashionIds.put(__this__nameHeadFashionIds_copy_key, __this__nameHeadFashionIds_copy_value);
      }
      this.nameHeadFashionIds = __this__nameHeadFashionIds;
    }
    this.vipLvl = other.vipLvl;
    this.tagId = other.tagId;
  }

  public InvitePlayerInfo deepCopy() {
    return new InvitePlayerInfo(this);
  }

  @Override
  public void clear() {
    setSexIsSet(false);
    this.sex = 0;
    setCharIdIsSet(false);
    this.charId = 0;
    this.name = null;
    this.headIconId = null;
    setRelationIsSet(false);
    this.relation = 0;
    this.nameHeadFashionIds = null;
    setVipLvlIsSet(false);
    this.vipLvl = 0;
    setTagIdIsSet(false);
    this.tagId = 0;
  }

  public byte getSex() {
    return this.sex;
  }

  public InvitePlayerInfo setSex(byte sex) {
    this.sex = sex;
    setSexIsSet(true);
    return this;
  }

  public void unsetSex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  /** Returns true if field sex is set (has been assigned a value) and false otherwise */
  public boolean isSetSex() {
    return EncodingUtils.testBit(__isset_bitfield, __SEX_ISSET_ID);
  }

  public void setSexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEX_ISSET_ID, value);
  }

  public long getCharId() {
    return this.charId;
  }

  public InvitePlayerInfo setCharId(long charId) {
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

  public String getName() {
    return this.name;
  }

  public InvitePlayerInfo setName(String name) {
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

  public String getHeadIconId() {
    return this.headIconId;
  }

  public InvitePlayerInfo setHeadIconId(String headIconId) {
    this.headIconId = headIconId;
    return this;
  }

  public void unsetHeadIconId() {
    this.headIconId = null;
  }

  /** Returns true if field headIconId is set (has been assigned a value) and false otherwise */
  public boolean isSetHeadIconId() {
    return this.headIconId != null;
  }

  public void setHeadIconIdIsSet(boolean value) {
    if (!value) {
      this.headIconId = null;
    }
  }

  public byte getRelation() {
    return this.relation;
  }

  public InvitePlayerInfo setRelation(byte relation) {
    this.relation = relation;
    setRelationIsSet(true);
    return this;
  }

  public void unsetRelation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RELATION_ISSET_ID);
  }

  /** Returns true if field relation is set (has been assigned a value) and false otherwise */
  public boolean isSetRelation() {
    return EncodingUtils.testBit(__isset_bitfield, __RELATION_ISSET_ID);
  }

  public void setRelationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RELATION_ISSET_ID, value);
  }

  public int getNameHeadFashionIdsSize() {
    return (this.nameHeadFashionIds == null) ? 0 : this.nameHeadFashionIds.size();
  }

  public void putToNameHeadFashionIds(byte key, int val) {
    if (this.nameHeadFashionIds == null) {
      this.nameHeadFashionIds = new HashMap<Byte,Integer>();
    }
    this.nameHeadFashionIds.put(key, val);
  }

  /**
   * 使用中的名字和头像框时尚id key:style val:id
   */
  public Map<Byte,Integer> getNameHeadFashionIds() {
    return this.nameHeadFashionIds;
  }

  /**
   * 使用中的名字和头像框时尚id key:style val:id
   */
  public InvitePlayerInfo setNameHeadFashionIds(Map<Byte,Integer> nameHeadFashionIds) {
    this.nameHeadFashionIds = nameHeadFashionIds;
    return this;
  }

  public void unsetNameHeadFashionIds() {
    this.nameHeadFashionIds = null;
  }

  /** Returns true if field nameHeadFashionIds is set (has been assigned a value) and false otherwise */
  public boolean isSetNameHeadFashionIds() {
    return this.nameHeadFashionIds != null;
  }

  public void setNameHeadFashionIdsIsSet(boolean value) {
    if (!value) {
      this.nameHeadFashionIds = null;
    }
  }

  public byte getVipLvl() {
    return this.vipLvl;
  }

  public InvitePlayerInfo setVipLvl(byte vipLvl) {
    this.vipLvl = vipLvl;
    setVipLvlIsSet(true);
    return this;
  }

  public void unsetVipLvl() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIPLVL_ISSET_ID);
  }

  /** Returns true if field vipLvl is set (has been assigned a value) and false otherwise */
  public boolean isSetVipLvl() {
    return EncodingUtils.testBit(__isset_bitfield, __VIPLVL_ISSET_ID);
  }

  public void setVipLvlIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIPLVL_ISSET_ID, value);
  }

  public short getTagId() {
    return this.tagId;
  }

  public InvitePlayerInfo setTagId(short tagId) {
    this.tagId = tagId;
    setTagIdIsSet(true);
    return this;
  }

  public void unsetTagId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TAGID_ISSET_ID);
  }

  /** Returns true if field tagId is set (has been assigned a value) and false otherwise */
  public boolean isSetTagId() {
    return EncodingUtils.testBit(__isset_bitfield, __TAGID_ISSET_ID);
  }

  public void setTagIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TAGID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SEX:
      if (value == null) {
        unsetSex();
      } else {
        setSex((Byte)value);
      }
      break;

    case CHAR_ID:
      if (value == null) {
        unsetCharId();
      } else {
        setCharId((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case HEAD_ICON_ID:
      if (value == null) {
        unsetHeadIconId();
      } else {
        setHeadIconId((String)value);
      }
      break;

    case RELATION:
      if (value == null) {
        unsetRelation();
      } else {
        setRelation((Byte)value);
      }
      break;

    case NAME_HEAD_FASHION_IDS:
      if (value == null) {
        unsetNameHeadFashionIds();
      } else {
        setNameHeadFashionIds((Map<Byte,Integer>)value);
      }
      break;

    case VIP_LVL:
      if (value == null) {
        unsetVipLvl();
      } else {
        setVipLvl((Byte)value);
      }
      break;

    case TAG_ID:
      if (value == null) {
        unsetTagId();
      } else {
        setTagId((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SEX:
      return Byte.valueOf(getSex());

    case CHAR_ID:
      return Long.valueOf(getCharId());

    case NAME:
      return getName();

    case HEAD_ICON_ID:
      return getHeadIconId();

    case RELATION:
      return Byte.valueOf(getRelation());

    case NAME_HEAD_FASHION_IDS:
      return getNameHeadFashionIds();

    case VIP_LVL:
      return Byte.valueOf(getVipLvl());

    case TAG_ID:
      return Short.valueOf(getTagId());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SEX:
      return isSetSex();
    case CHAR_ID:
      return isSetCharId();
    case NAME:
      return isSetName();
    case HEAD_ICON_ID:
      return isSetHeadIconId();
    case RELATION:
      return isSetRelation();
    case NAME_HEAD_FASHION_IDS:
      return isSetNameHeadFashionIds();
    case VIP_LVL:
      return isSetVipLvl();
    case TAG_ID:
      return isSetTagId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InvitePlayerInfo)
      return this.equals((InvitePlayerInfo)that);
    return false;
  }

  public boolean equals(InvitePlayerInfo that) {
    if (that == null)
      return false;

    boolean this_present_sex = true;
    boolean that_present_sex = true;
    if (this_present_sex || that_present_sex) {
      if (!(this_present_sex && that_present_sex))
        return false;
      if (this.sex != that.sex)
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

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_headIconId = true && this.isSetHeadIconId();
    boolean that_present_headIconId = true && that.isSetHeadIconId();
    if (this_present_headIconId || that_present_headIconId) {
      if (!(this_present_headIconId && that_present_headIconId))
        return false;
      if (!this.headIconId.equals(that.headIconId))
        return false;
    }

    boolean this_present_relation = true;
    boolean that_present_relation = true;
    if (this_present_relation || that_present_relation) {
      if (!(this_present_relation && that_present_relation))
        return false;
      if (this.relation != that.relation)
        return false;
    }

    boolean this_present_nameHeadFashionIds = true && this.isSetNameHeadFashionIds();
    boolean that_present_nameHeadFashionIds = true && that.isSetNameHeadFashionIds();
    if (this_present_nameHeadFashionIds || that_present_nameHeadFashionIds) {
      if (!(this_present_nameHeadFashionIds && that_present_nameHeadFashionIds))
        return false;
      if (!this.nameHeadFashionIds.equals(that.nameHeadFashionIds))
        return false;
    }

    boolean this_present_vipLvl = true;
    boolean that_present_vipLvl = true;
    if (this_present_vipLvl || that_present_vipLvl) {
      if (!(this_present_vipLvl && that_present_vipLvl))
        return false;
      if (this.vipLvl != that.vipLvl)
        return false;
    }

    boolean this_present_tagId = true;
    boolean that_present_tagId = true;
    if (this_present_tagId || that_present_tagId) {
      if (!(this_present_tagId && that_present_tagId))
        return false;
      if (this.tagId != that.tagId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(InvitePlayerInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InvitePlayerInfo typedOther = (InvitePlayerInfo)other;

    lastComparison = Boolean.valueOf(isSetSex()).compareTo(typedOther.isSetSex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sex, typedOther.sex);
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
    lastComparison = Boolean.valueOf(isSetHeadIconId()).compareTo(typedOther.isSetHeadIconId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeadIconId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headIconId, typedOther.headIconId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRelation()).compareTo(typedOther.isSetRelation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relation, typedOther.relation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNameHeadFashionIds()).compareTo(typedOther.isSetNameHeadFashionIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNameHeadFashionIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nameHeadFashionIds, typedOther.nameHeadFashionIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVipLvl()).compareTo(typedOther.isSetVipLvl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVipLvl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vipLvl, typedOther.vipLvl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTagId()).compareTo(typedOther.isSetTagId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tagId, typedOther.tagId);
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
    StringBuilder sb = new StringBuilder("InvitePlayerInfo(");
    boolean first = true;

    sb.append("sex:");
    sb.append(this.sex);
    first = false;
    if (!first) sb.append(", ");
    sb.append("charId:");
    sb.append(this.charId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("headIconId:");
    if (this.headIconId == null) {
      sb.append("null");
    } else {
      sb.append(this.headIconId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("relation:");
    sb.append(this.relation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nameHeadFashionIds:");
    if (this.nameHeadFashionIds == null) {
      sb.append("null");
    } else {
      sb.append(this.nameHeadFashionIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("vipLvl:");
    sb.append(this.vipLvl);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tagId:");
    sb.append(this.tagId);
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

  private static class InvitePlayerInfoStandardSchemeFactory implements SchemeFactory {
    public InvitePlayerInfoStandardScheme getScheme() {
      return new InvitePlayerInfoStandardScheme();
    }
  }

  private static class InvitePlayerInfoStandardScheme extends StandardScheme<InvitePlayerInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InvitePlayerInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEX
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.sex = iprot.readByte();
              struct.setSexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHAR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.charId = iprot.readI64();
              struct.setCharIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HEAD_ICON_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.headIconId = iprot.readString();
              struct.setHeadIconIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RELATION
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.relation = iprot.readByte();
              struct.setRelationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NAME_HEAD_FASHION_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map282 = iprot.readMapBegin();
                struct.nameHeadFashionIds = new HashMap<Byte,Integer>(2*_map282.size);
                for (int _i283 = 0; _i283 < _map282.size; ++_i283)
                {
                  byte _key284; // required
                  int _val285; // required
                  _key284 = iprot.readByte();
                  _val285 = iprot.readI32();
                  struct.nameHeadFashionIds.put(_key284, _val285);
                }
                iprot.readMapEnd();
              }
              struct.setNameHeadFashionIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // VIP_LVL
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.vipLvl = iprot.readByte();
              struct.setVipLvlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TAG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.tagId = iprot.readI16();
              struct.setTagIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InvitePlayerInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SEX_FIELD_DESC);
      oprot.writeByte(struct.sex);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHAR_ID_FIELD_DESC);
      oprot.writeI64(struct.charId);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.headIconId != null) {
        oprot.writeFieldBegin(HEAD_ICON_ID_FIELD_DESC);
        oprot.writeString(struct.headIconId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RELATION_FIELD_DESC);
      oprot.writeByte(struct.relation);
      oprot.writeFieldEnd();
      if (struct.nameHeadFashionIds != null) {
        oprot.writeFieldBegin(NAME_HEAD_FASHION_IDS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.BYTE, org.apache.thrift.protocol.TType.I32, struct.nameHeadFashionIds.size()));
          for (Map.Entry<Byte, Integer> _iter286 : struct.nameHeadFashionIds.entrySet())
          {
            oprot.writeByte(_iter286.getKey());
            oprot.writeI32(_iter286.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VIP_LVL_FIELD_DESC);
      oprot.writeByte(struct.vipLvl);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TAG_ID_FIELD_DESC);
      oprot.writeI16(struct.tagId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InvitePlayerInfoTupleSchemeFactory implements SchemeFactory {
    public InvitePlayerInfoTupleScheme getScheme() {
      return new InvitePlayerInfoTupleScheme();
    }
  }

  private static class InvitePlayerInfoTupleScheme extends TupleScheme<InvitePlayerInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InvitePlayerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSex()) {
        optionals.set(0);
      }
      if (struct.isSetCharId()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetHeadIconId()) {
        optionals.set(3);
      }
      if (struct.isSetRelation()) {
        optionals.set(4);
      }
      if (struct.isSetNameHeadFashionIds()) {
        optionals.set(5);
      }
      if (struct.isSetVipLvl()) {
        optionals.set(6);
      }
      if (struct.isSetTagId()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetSex()) {
        oprot.writeByte(struct.sex);
      }
      if (struct.isSetCharId()) {
        oprot.writeI64(struct.charId);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetHeadIconId()) {
        oprot.writeString(struct.headIconId);
      }
      if (struct.isSetRelation()) {
        oprot.writeByte(struct.relation);
      }
      if (struct.isSetNameHeadFashionIds()) {
        {
          oprot.writeI32(struct.nameHeadFashionIds.size());
          for (Map.Entry<Byte, Integer> _iter287 : struct.nameHeadFashionIds.entrySet())
          {
            oprot.writeByte(_iter287.getKey());
            oprot.writeI32(_iter287.getValue());
          }
        }
      }
      if (struct.isSetVipLvl()) {
        oprot.writeByte(struct.vipLvl);
      }
      if (struct.isSetTagId()) {
        oprot.writeI16(struct.tagId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InvitePlayerInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.sex = iprot.readByte();
        struct.setSexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.charId = iprot.readI64();
        struct.setCharIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.headIconId = iprot.readString();
        struct.setHeadIconIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.relation = iprot.readByte();
        struct.setRelationIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map288 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.BYTE, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.nameHeadFashionIds = new HashMap<Byte,Integer>(2*_map288.size);
          for (int _i289 = 0; _i289 < _map288.size; ++_i289)
          {
            byte _key290; // required
            int _val291; // required
            _key290 = iprot.readByte();
            _val291 = iprot.readI32();
            struct.nameHeadFashionIds.put(_key290, _val291);
          }
        }
        struct.setNameHeadFashionIdsIsSet(true);
      }
      if (incoming.get(6)) {
        struct.vipLvl = iprot.readByte();
        struct.setVipLvlIsSet(true);
      }
      if (incoming.get(7)) {
        struct.tagId = iprot.readI16();
        struct.setTagIdIsSet(true);
      }
    }
  }

}

