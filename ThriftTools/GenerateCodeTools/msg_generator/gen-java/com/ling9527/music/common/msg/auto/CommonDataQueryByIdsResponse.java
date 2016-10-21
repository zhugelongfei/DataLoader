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

/**
 * 请求对应id的信息响应
 */
public class CommonDataQueryByIdsResponse implements org.apache.thrift.TBase<CommonDataQueryByIdsResponse, CommonDataQueryByIdsResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommonDataQueryByIdsResponse");

  private static final org.apache.thrift.protocol.TField FROM_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("fromType", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField MALL_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("mallItems", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField GROUND_ROOM_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("groundRoomInfos", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField DANCE_ROOM_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("danceRoomInfos", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField GUILD_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("guildInfos", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommonDataQueryByIdsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommonDataQueryByIdsResponseTupleSchemeFactory());
  }

  /**
   * 客户端请求的类型
   */
  public short fromType; // optional
  /**
   * 客户端此类缓存信息总版本号
   */
  public short version; // optional
  /**
   * 需要更新的商品信息
   */
  public List<MallItem> mallItems; // optional
  /**
   * 需要更新的温泉广场信息
   */
  public List<GroundRoomInfo> groundRoomInfos; // optional
  /**
   * 需要更新的竞技房间信息
   */
  public List<DanceRoomInfo> danceRoomInfos; // optional
  /**
   * 需要更新的舞团信息
   */
  public List<GuildBaseInfo> guildInfos; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 客户端请求的类型
     */
    FROM_TYPE((short)1, "fromType"),
    /**
     * 客户端此类缓存信息总版本号
     */
    VERSION((short)2, "version"),
    /**
     * 需要更新的商品信息
     */
    MALL_ITEMS((short)3, "mallItems"),
    /**
     * 需要更新的温泉广场信息
     */
    GROUND_ROOM_INFOS((short)4, "groundRoomInfos"),
    /**
     * 需要更新的竞技房间信息
     */
    DANCE_ROOM_INFOS((short)5, "danceRoomInfos"),
    /**
     * 需要更新的舞团信息
     */
    GUILD_INFOS((short)6, "guildInfos");

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
        case 1: // FROM_TYPE
          return FROM_TYPE;
        case 2: // VERSION
          return VERSION;
        case 3: // MALL_ITEMS
          return MALL_ITEMS;
        case 4: // GROUND_ROOM_INFOS
          return GROUND_ROOM_INFOS;
        case 5: // DANCE_ROOM_INFOS
          return DANCE_ROOM_INFOS;
        case 6: // GUILD_INFOS
          return GUILD_INFOS;
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
  private static final int __FROMTYPE_ISSET_ID = 0;
  private static final int __VERSION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.FROM_TYPE,_Fields.VERSION,_Fields.MALL_ITEMS,_Fields.GROUND_ROOM_INFOS,_Fields.DANCE_ROOM_INFOS,_Fields.GUILD_INFOS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FROM_TYPE, new org.apache.thrift.meta_data.FieldMetaData("fromType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.MALL_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("mallItems", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MallItem.class))));
    tmpMap.put(_Fields.GROUND_ROOM_INFOS, new org.apache.thrift.meta_data.FieldMetaData("groundRoomInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GroundRoomInfo.class))));
    tmpMap.put(_Fields.DANCE_ROOM_INFOS, new org.apache.thrift.meta_data.FieldMetaData("danceRoomInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DanceRoomInfo.class))));
    tmpMap.put(_Fields.GUILD_INFOS, new org.apache.thrift.meta_data.FieldMetaData("guildInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GuildBaseInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommonDataQueryByIdsResponse.class, metaDataMap);
  }

  public CommonDataQueryByIdsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommonDataQueryByIdsResponse(CommonDataQueryByIdsResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.fromType = other.fromType;
    this.version = other.version;
    if (other.isSetMallItems()) {
      List<MallItem> __this__mallItems = new ArrayList<MallItem>();
      for (MallItem other_element : other.mallItems) {
        __this__mallItems.add(new MallItem(other_element));
      }
      this.mallItems = __this__mallItems;
    }
    if (other.isSetGroundRoomInfos()) {
      List<GroundRoomInfo> __this__groundRoomInfos = new ArrayList<GroundRoomInfo>();
      for (GroundRoomInfo other_element : other.groundRoomInfos) {
        __this__groundRoomInfos.add(new GroundRoomInfo(other_element));
      }
      this.groundRoomInfos = __this__groundRoomInfos;
    }
    if (other.isSetDanceRoomInfos()) {
      List<DanceRoomInfo> __this__danceRoomInfos = new ArrayList<DanceRoomInfo>();
      for (DanceRoomInfo other_element : other.danceRoomInfos) {
        __this__danceRoomInfos.add(new DanceRoomInfo(other_element));
      }
      this.danceRoomInfos = __this__danceRoomInfos;
    }
    if (other.isSetGuildInfos()) {
      List<GuildBaseInfo> __this__guildInfos = new ArrayList<GuildBaseInfo>();
      for (GuildBaseInfo other_element : other.guildInfos) {
        __this__guildInfos.add(new GuildBaseInfo(other_element));
      }
      this.guildInfos = __this__guildInfos;
    }
  }

  public CommonDataQueryByIdsResponse deepCopy() {
    return new CommonDataQueryByIdsResponse(this);
  }

  @Override
  public void clear() {
    setFromTypeIsSet(false);
    this.fromType = 0;
    setVersionIsSet(false);
    this.version = 0;
    this.mallItems = null;
    this.groundRoomInfos = null;
    this.danceRoomInfos = null;
    this.guildInfos = null;
  }

  /**
   * 客户端请求的类型
   */
  public short getFromType() {
    return this.fromType;
  }

  /**
   * 客户端请求的类型
   */
  public CommonDataQueryByIdsResponse setFromType(short fromType) {
    this.fromType = fromType;
    setFromTypeIsSet(true);
    return this;
  }

  public void unsetFromType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FROMTYPE_ISSET_ID);
  }

  /** Returns true if field fromType is set (has been assigned a value) and false otherwise */
  public boolean isSetFromType() {
    return EncodingUtils.testBit(__isset_bitfield, __FROMTYPE_ISSET_ID);
  }

  public void setFromTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FROMTYPE_ISSET_ID, value);
  }

  /**
   * 客户端此类缓存信息总版本号
   */
  public short getVersion() {
    return this.version;
  }

  /**
   * 客户端此类缓存信息总版本号
   */
  public CommonDataQueryByIdsResponse setVersion(short version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public int getMallItemsSize() {
    return (this.mallItems == null) ? 0 : this.mallItems.size();
  }

  public java.util.Iterator<MallItem> getMallItemsIterator() {
    return (this.mallItems == null) ? null : this.mallItems.iterator();
  }

  public void addToMallItems(MallItem elem) {
    if (this.mallItems == null) {
      this.mallItems = new ArrayList<MallItem>();
    }
    this.mallItems.add(elem);
  }

  /**
   * 需要更新的商品信息
   */
  public List<MallItem> getMallItems() {
    return this.mallItems;
  }

  /**
   * 需要更新的商品信息
   */
  public CommonDataQueryByIdsResponse setMallItems(List<MallItem> mallItems) {
    this.mallItems = mallItems;
    return this;
  }

  public void unsetMallItems() {
    this.mallItems = null;
  }

  /** Returns true if field mallItems is set (has been assigned a value) and false otherwise */
  public boolean isSetMallItems() {
    return this.mallItems != null;
  }

  public void setMallItemsIsSet(boolean value) {
    if (!value) {
      this.mallItems = null;
    }
  }

  public int getGroundRoomInfosSize() {
    return (this.groundRoomInfos == null) ? 0 : this.groundRoomInfos.size();
  }

  public java.util.Iterator<GroundRoomInfo> getGroundRoomInfosIterator() {
    return (this.groundRoomInfos == null) ? null : this.groundRoomInfos.iterator();
  }

  public void addToGroundRoomInfos(GroundRoomInfo elem) {
    if (this.groundRoomInfos == null) {
      this.groundRoomInfos = new ArrayList<GroundRoomInfo>();
    }
    this.groundRoomInfos.add(elem);
  }

  /**
   * 需要更新的温泉广场信息
   */
  public List<GroundRoomInfo> getGroundRoomInfos() {
    return this.groundRoomInfos;
  }

  /**
   * 需要更新的温泉广场信息
   */
  public CommonDataQueryByIdsResponse setGroundRoomInfos(List<GroundRoomInfo> groundRoomInfos) {
    this.groundRoomInfos = groundRoomInfos;
    return this;
  }

  public void unsetGroundRoomInfos() {
    this.groundRoomInfos = null;
  }

  /** Returns true if field groundRoomInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetGroundRoomInfos() {
    return this.groundRoomInfos != null;
  }

  public void setGroundRoomInfosIsSet(boolean value) {
    if (!value) {
      this.groundRoomInfos = null;
    }
  }

  public int getDanceRoomInfosSize() {
    return (this.danceRoomInfos == null) ? 0 : this.danceRoomInfos.size();
  }

  public java.util.Iterator<DanceRoomInfo> getDanceRoomInfosIterator() {
    return (this.danceRoomInfos == null) ? null : this.danceRoomInfos.iterator();
  }

  public void addToDanceRoomInfos(DanceRoomInfo elem) {
    if (this.danceRoomInfos == null) {
      this.danceRoomInfos = new ArrayList<DanceRoomInfo>();
    }
    this.danceRoomInfos.add(elem);
  }

  /**
   * 需要更新的竞技房间信息
   */
  public List<DanceRoomInfo> getDanceRoomInfos() {
    return this.danceRoomInfos;
  }

  /**
   * 需要更新的竞技房间信息
   */
  public CommonDataQueryByIdsResponse setDanceRoomInfos(List<DanceRoomInfo> danceRoomInfos) {
    this.danceRoomInfos = danceRoomInfos;
    return this;
  }

  public void unsetDanceRoomInfos() {
    this.danceRoomInfos = null;
  }

  /** Returns true if field danceRoomInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetDanceRoomInfos() {
    return this.danceRoomInfos != null;
  }

  public void setDanceRoomInfosIsSet(boolean value) {
    if (!value) {
      this.danceRoomInfos = null;
    }
  }

  public int getGuildInfosSize() {
    return (this.guildInfos == null) ? 0 : this.guildInfos.size();
  }

  public java.util.Iterator<GuildBaseInfo> getGuildInfosIterator() {
    return (this.guildInfos == null) ? null : this.guildInfos.iterator();
  }

  public void addToGuildInfos(GuildBaseInfo elem) {
    if (this.guildInfos == null) {
      this.guildInfos = new ArrayList<GuildBaseInfo>();
    }
    this.guildInfos.add(elem);
  }

  /**
   * 需要更新的舞团信息
   */
  public List<GuildBaseInfo> getGuildInfos() {
    return this.guildInfos;
  }

  /**
   * 需要更新的舞团信息
   */
  public CommonDataQueryByIdsResponse setGuildInfos(List<GuildBaseInfo> guildInfos) {
    this.guildInfos = guildInfos;
    return this;
  }

  public void unsetGuildInfos() {
    this.guildInfos = null;
  }

  /** Returns true if field guildInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetGuildInfos() {
    return this.guildInfos != null;
  }

  public void setGuildInfosIsSet(boolean value) {
    if (!value) {
      this.guildInfos = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FROM_TYPE:
      if (value == null) {
        unsetFromType();
      } else {
        setFromType((Short)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Short)value);
      }
      break;

    case MALL_ITEMS:
      if (value == null) {
        unsetMallItems();
      } else {
        setMallItems((List<MallItem>)value);
      }
      break;

    case GROUND_ROOM_INFOS:
      if (value == null) {
        unsetGroundRoomInfos();
      } else {
        setGroundRoomInfos((List<GroundRoomInfo>)value);
      }
      break;

    case DANCE_ROOM_INFOS:
      if (value == null) {
        unsetDanceRoomInfos();
      } else {
        setDanceRoomInfos((List<DanceRoomInfo>)value);
      }
      break;

    case GUILD_INFOS:
      if (value == null) {
        unsetGuildInfos();
      } else {
        setGuildInfos((List<GuildBaseInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FROM_TYPE:
      return Short.valueOf(getFromType());

    case VERSION:
      return Short.valueOf(getVersion());

    case MALL_ITEMS:
      return getMallItems();

    case GROUND_ROOM_INFOS:
      return getGroundRoomInfos();

    case DANCE_ROOM_INFOS:
      return getDanceRoomInfos();

    case GUILD_INFOS:
      return getGuildInfos();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FROM_TYPE:
      return isSetFromType();
    case VERSION:
      return isSetVersion();
    case MALL_ITEMS:
      return isSetMallItems();
    case GROUND_ROOM_INFOS:
      return isSetGroundRoomInfos();
    case DANCE_ROOM_INFOS:
      return isSetDanceRoomInfos();
    case GUILD_INFOS:
      return isSetGuildInfos();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommonDataQueryByIdsResponse)
      return this.equals((CommonDataQueryByIdsResponse)that);
    return false;
  }

  public boolean equals(CommonDataQueryByIdsResponse that) {
    if (that == null)
      return false;

    boolean this_present_fromType = true && this.isSetFromType();
    boolean that_present_fromType = true && that.isSetFromType();
    if (this_present_fromType || that_present_fromType) {
      if (!(this_present_fromType && that_present_fromType))
        return false;
      if (this.fromType != that.fromType)
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_mallItems = true && this.isSetMallItems();
    boolean that_present_mallItems = true && that.isSetMallItems();
    if (this_present_mallItems || that_present_mallItems) {
      if (!(this_present_mallItems && that_present_mallItems))
        return false;
      if (!this.mallItems.equals(that.mallItems))
        return false;
    }

    boolean this_present_groundRoomInfos = true && this.isSetGroundRoomInfos();
    boolean that_present_groundRoomInfos = true && that.isSetGroundRoomInfos();
    if (this_present_groundRoomInfos || that_present_groundRoomInfos) {
      if (!(this_present_groundRoomInfos && that_present_groundRoomInfos))
        return false;
      if (!this.groundRoomInfos.equals(that.groundRoomInfos))
        return false;
    }

    boolean this_present_danceRoomInfos = true && this.isSetDanceRoomInfos();
    boolean that_present_danceRoomInfos = true && that.isSetDanceRoomInfos();
    if (this_present_danceRoomInfos || that_present_danceRoomInfos) {
      if (!(this_present_danceRoomInfos && that_present_danceRoomInfos))
        return false;
      if (!this.danceRoomInfos.equals(that.danceRoomInfos))
        return false;
    }

    boolean this_present_guildInfos = true && this.isSetGuildInfos();
    boolean that_present_guildInfos = true && that.isSetGuildInfos();
    if (this_present_guildInfos || that_present_guildInfos) {
      if (!(this_present_guildInfos && that_present_guildInfos))
        return false;
      if (!this.guildInfos.equals(that.guildInfos))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CommonDataQueryByIdsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CommonDataQueryByIdsResponse typedOther = (CommonDataQueryByIdsResponse)other;

    lastComparison = Boolean.valueOf(isSetFromType()).compareTo(typedOther.isSetFromType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromType, typedOther.fromType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMallItems()).compareTo(typedOther.isSetMallItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMallItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mallItems, typedOther.mallItems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroundRoomInfos()).compareTo(typedOther.isSetGroundRoomInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroundRoomInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groundRoomInfos, typedOther.groundRoomInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDanceRoomInfos()).compareTo(typedOther.isSetDanceRoomInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDanceRoomInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.danceRoomInfos, typedOther.danceRoomInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuildInfos()).compareTo(typedOther.isSetGuildInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuildInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.guildInfos, typedOther.guildInfos);
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
    StringBuilder sb = new StringBuilder("CommonDataQueryByIdsResponse(");
    boolean first = true;

    if (isSetFromType()) {
      sb.append("fromType:");
      sb.append(this.fromType);
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      sb.append(this.version);
      first = false;
    }
    if (isSetMallItems()) {
      if (!first) sb.append(", ");
      sb.append("mallItems:");
      if (this.mallItems == null) {
        sb.append("null");
      } else {
        sb.append(this.mallItems);
      }
      first = false;
    }
    if (isSetGroundRoomInfos()) {
      if (!first) sb.append(", ");
      sb.append("groundRoomInfos:");
      if (this.groundRoomInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.groundRoomInfos);
      }
      first = false;
    }
    if (isSetDanceRoomInfos()) {
      if (!first) sb.append(", ");
      sb.append("danceRoomInfos:");
      if (this.danceRoomInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.danceRoomInfos);
      }
      first = false;
    }
    if (isSetGuildInfos()) {
      if (!first) sb.append(", ");
      sb.append("guildInfos:");
      if (this.guildInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.guildInfos);
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

  private static class CommonDataQueryByIdsResponseStandardSchemeFactory implements SchemeFactory {
    public CommonDataQueryByIdsResponseStandardScheme getScheme() {
      return new CommonDataQueryByIdsResponseStandardScheme();
    }
  }

  private static class CommonDataQueryByIdsResponseStandardScheme extends StandardScheme<CommonDataQueryByIdsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CommonDataQueryByIdsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FROM_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.fromType = iprot.readI16();
              struct.setFromTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.version = iprot.readI16();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MALL_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list700 = iprot.readListBegin();
                struct.mallItems = new ArrayList<MallItem>(_list700.size);
                for (int _i701 = 0; _i701 < _list700.size; ++_i701)
                {
                  MallItem _elem702; // required
                  _elem702 = new MallItem();
                  _elem702.read(iprot);
                  struct.mallItems.add(_elem702);
                }
                iprot.readListEnd();
              }
              struct.setMallItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GROUND_ROOM_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list703 = iprot.readListBegin();
                struct.groundRoomInfos = new ArrayList<GroundRoomInfo>(_list703.size);
                for (int _i704 = 0; _i704 < _list703.size; ++_i704)
                {
                  GroundRoomInfo _elem705; // required
                  _elem705 = new GroundRoomInfo();
                  _elem705.read(iprot);
                  struct.groundRoomInfos.add(_elem705);
                }
                iprot.readListEnd();
              }
              struct.setGroundRoomInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DANCE_ROOM_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list706 = iprot.readListBegin();
                struct.danceRoomInfos = new ArrayList<DanceRoomInfo>(_list706.size);
                for (int _i707 = 0; _i707 < _list706.size; ++_i707)
                {
                  DanceRoomInfo _elem708; // required
                  _elem708 = new DanceRoomInfo();
                  _elem708.read(iprot);
                  struct.danceRoomInfos.add(_elem708);
                }
                iprot.readListEnd();
              }
              struct.setDanceRoomInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GUILD_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list709 = iprot.readListBegin();
                struct.guildInfos = new ArrayList<GuildBaseInfo>(_list709.size);
                for (int _i710 = 0; _i710 < _list709.size; ++_i710)
                {
                  GuildBaseInfo _elem711; // required
                  _elem711 = new GuildBaseInfo();
                  _elem711.read(iprot);
                  struct.guildInfos.add(_elem711);
                }
                iprot.readListEnd();
              }
              struct.setGuildInfosIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CommonDataQueryByIdsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetFromType()) {
        oprot.writeFieldBegin(FROM_TYPE_FIELD_DESC);
        oprot.writeI16(struct.fromType);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVersion()) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI16(struct.version);
        oprot.writeFieldEnd();
      }
      if (struct.mallItems != null) {
        if (struct.isSetMallItems()) {
          oprot.writeFieldBegin(MALL_ITEMS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.mallItems.size()));
            for (MallItem _iter712 : struct.mallItems)
            {
              _iter712.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.groundRoomInfos != null) {
        if (struct.isSetGroundRoomInfos()) {
          oprot.writeFieldBegin(GROUND_ROOM_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.groundRoomInfos.size()));
            for (GroundRoomInfo _iter713 : struct.groundRoomInfos)
            {
              _iter713.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.danceRoomInfos != null) {
        if (struct.isSetDanceRoomInfos()) {
          oprot.writeFieldBegin(DANCE_ROOM_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.danceRoomInfos.size()));
            for (DanceRoomInfo _iter714 : struct.danceRoomInfos)
            {
              _iter714.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.guildInfos != null) {
        if (struct.isSetGuildInfos()) {
          oprot.writeFieldBegin(GUILD_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.guildInfos.size()));
            for (GuildBaseInfo _iter715 : struct.guildInfos)
            {
              _iter715.write(oprot);
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

  private static class CommonDataQueryByIdsResponseTupleSchemeFactory implements SchemeFactory {
    public CommonDataQueryByIdsResponseTupleScheme getScheme() {
      return new CommonDataQueryByIdsResponseTupleScheme();
    }
  }

  private static class CommonDataQueryByIdsResponseTupleScheme extends TupleScheme<CommonDataQueryByIdsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CommonDataQueryByIdsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFromType()) {
        optionals.set(0);
      }
      if (struct.isSetVersion()) {
        optionals.set(1);
      }
      if (struct.isSetMallItems()) {
        optionals.set(2);
      }
      if (struct.isSetGroundRoomInfos()) {
        optionals.set(3);
      }
      if (struct.isSetDanceRoomInfos()) {
        optionals.set(4);
      }
      if (struct.isSetGuildInfos()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetFromType()) {
        oprot.writeI16(struct.fromType);
      }
      if (struct.isSetVersion()) {
        oprot.writeI16(struct.version);
      }
      if (struct.isSetMallItems()) {
        {
          oprot.writeI32(struct.mallItems.size());
          for (MallItem _iter716 : struct.mallItems)
          {
            _iter716.write(oprot);
          }
        }
      }
      if (struct.isSetGroundRoomInfos()) {
        {
          oprot.writeI32(struct.groundRoomInfos.size());
          for (GroundRoomInfo _iter717 : struct.groundRoomInfos)
          {
            _iter717.write(oprot);
          }
        }
      }
      if (struct.isSetDanceRoomInfos()) {
        {
          oprot.writeI32(struct.danceRoomInfos.size());
          for (DanceRoomInfo _iter718 : struct.danceRoomInfos)
          {
            _iter718.write(oprot);
          }
        }
      }
      if (struct.isSetGuildInfos()) {
        {
          oprot.writeI32(struct.guildInfos.size());
          for (GuildBaseInfo _iter719 : struct.guildInfos)
          {
            _iter719.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CommonDataQueryByIdsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.fromType = iprot.readI16();
        struct.setFromTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version = iprot.readI16();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list720 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.mallItems = new ArrayList<MallItem>(_list720.size);
          for (int _i721 = 0; _i721 < _list720.size; ++_i721)
          {
            MallItem _elem722; // required
            _elem722 = new MallItem();
            _elem722.read(iprot);
            struct.mallItems.add(_elem722);
          }
        }
        struct.setMallItemsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list723 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.groundRoomInfos = new ArrayList<GroundRoomInfo>(_list723.size);
          for (int _i724 = 0; _i724 < _list723.size; ++_i724)
          {
            GroundRoomInfo _elem725; // required
            _elem725 = new GroundRoomInfo();
            _elem725.read(iprot);
            struct.groundRoomInfos.add(_elem725);
          }
        }
        struct.setGroundRoomInfosIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list726 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.danceRoomInfos = new ArrayList<DanceRoomInfo>(_list726.size);
          for (int _i727 = 0; _i727 < _list726.size; ++_i727)
          {
            DanceRoomInfo _elem728; // required
            _elem728 = new DanceRoomInfo();
            _elem728.read(iprot);
            struct.danceRoomInfos.add(_elem728);
          }
        }
        struct.setDanceRoomInfosIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list729 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.guildInfos = new ArrayList<GuildBaseInfo>(_list729.size);
          for (int _i730 = 0; _i730 < _list729.size; ++_i730)
          {
            GuildBaseInfo _elem731; // required
            _elem731 = new GuildBaseInfo();
            _elem731.read(iprot);
            struct.guildInfos.add(_elem731);
          }
        }
        struct.setGuildInfosIsSet(true);
      }
    }
  }

}

