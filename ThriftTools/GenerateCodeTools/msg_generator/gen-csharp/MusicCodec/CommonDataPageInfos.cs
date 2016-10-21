/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace MusicCodec
{

  /// <summary>
  /// 游戏数据分页信息
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CommonDataPageInfos : TBase
  {
    private List<CommonDataPageIds> _pageIds;
    private int _totalSize;
    private short _version;
    private List<MallItem> _updateMallItems;
    private List<GroundRoomInfo> _updateGroundRoomInfos;
    private List<DanceRoomInfo> _updateDanceRoomInfos;
    private List<GuildBaseInfo> _updateGuildInfos;
    private List<WeddingNotice> _updateWeddingNotices;
    private List<WeddingRoomInfo> _updateWeddingRoomInfos;

    public List<CommonDataPageIds> PageIds
    {
      get
      {
        return _pageIds;
      }
      set
      {
        __isset.pageIds = true;
        this._pageIds = value;
      }
    }

    /// <summary>
    /// 信息总数
    /// </summary>
    public int TotalSize
    {
      get
      {
        return _totalSize;
      }
      set
      {
        __isset.totalSize = true;
        this._totalSize = value;
      }
    }

    /// <summary>
    /// 此类信息总版本号
    /// </summary>
    public short Version
    {
      get
      {
        return _version;
      }
      set
      {
        __isset.version = true;
        this._version = value;
      }
    }

    /// <summary>
    /// 从未发给客户端的，或者需要更新的商品信息
    /// </summary>
    public List<MallItem> UpdateMallItems
    {
      get
      {
        return _updateMallItems;
      }
      set
      {
        __isset.updateMallItems = true;
        this._updateMallItems = value;
      }
    }

    /// <summary>
    /// 需要更新的温泉广场信息
    /// </summary>
    public List<GroundRoomInfo> UpdateGroundRoomInfos
    {
      get
      {
        return _updateGroundRoomInfos;
      }
      set
      {
        __isset.updateGroundRoomInfos = true;
        this._updateGroundRoomInfos = value;
      }
    }

    /// <summary>
    /// 需要更新的竞技房间信息
    /// </summary>
    public List<DanceRoomInfo> UpdateDanceRoomInfos
    {
      get
      {
        return _updateDanceRoomInfos;
      }
      set
      {
        __isset.updateDanceRoomInfos = true;
        this._updateDanceRoomInfos = value;
      }
    }

    /// <summary>
    /// 需要更新的舞团信息
    /// </summary>
    public List<GuildBaseInfo> UpdateGuildInfos
    {
      get
      {
        return _updateGuildInfos;
      }
      set
      {
        __isset.updateGuildInfos = true;
        this._updateGuildInfos = value;
      }
    }

    /// <summary>
    /// 需要更新的婚礼动态信息
    /// </summary>
    public List<WeddingNotice> UpdateWeddingNotices
    {
      get
      {
        return _updateWeddingNotices;
      }
      set
      {
        __isset.updateWeddingNotices = true;
        this._updateWeddingNotices = value;
      }
    }

    /// <summary>
    /// 需要更新的婚房信息
    /// </summary>
    public List<WeddingRoomInfo> UpdateWeddingRoomInfos
    {
      get
      {
        return _updateWeddingRoomInfos;
      }
      set
      {
        __isset.updateWeddingRoomInfos = true;
        this._updateWeddingRoomInfos = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool pageIds;
      public bool totalSize;
      public bool version;
      public bool updateMallItems;
      public bool updateGroundRoomInfos;
      public bool updateDanceRoomInfos;
      public bool updateGuildInfos;
      public bool updateWeddingNotices;
      public bool updateWeddingRoomInfos;
    }

    public CommonDataPageInfos() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.List) {
              {
                PageIds = new List<CommonDataPageIds>();
                TList _list322 = iprot.ReadListBegin();
                for( int _i323 = 0; _i323 < _list322.Count; ++_i323)
                {
                  CommonDataPageIds _elem324 = new CommonDataPageIds();
                  _elem324 = new CommonDataPageIds();
                  _elem324.Read(iprot);
                  PageIds.Add(_elem324);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              TotalSize = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I16) {
              Version = iprot.ReadI16();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.List) {
              {
                UpdateMallItems = new List<MallItem>();
                TList _list325 = iprot.ReadListBegin();
                for( int _i326 = 0; _i326 < _list325.Count; ++_i326)
                {
                  MallItem _elem327 = new MallItem();
                  _elem327 = new MallItem();
                  _elem327.Read(iprot);
                  UpdateMallItems.Add(_elem327);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.List) {
              {
                UpdateGroundRoomInfos = new List<GroundRoomInfo>();
                TList _list328 = iprot.ReadListBegin();
                for( int _i329 = 0; _i329 < _list328.Count; ++_i329)
                {
                  GroundRoomInfo _elem330 = new GroundRoomInfo();
                  _elem330 = new GroundRoomInfo();
                  _elem330.Read(iprot);
                  UpdateGroundRoomInfos.Add(_elem330);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.List) {
              {
                UpdateDanceRoomInfos = new List<DanceRoomInfo>();
                TList _list331 = iprot.ReadListBegin();
                for( int _i332 = 0; _i332 < _list331.Count; ++_i332)
                {
                  DanceRoomInfo _elem333 = new DanceRoomInfo();
                  _elem333 = new DanceRoomInfo();
                  _elem333.Read(iprot);
                  UpdateDanceRoomInfos.Add(_elem333);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.List) {
              {
                UpdateGuildInfos = new List<GuildBaseInfo>();
                TList _list334 = iprot.ReadListBegin();
                for( int _i335 = 0; _i335 < _list334.Count; ++_i335)
                {
                  GuildBaseInfo _elem336 = new GuildBaseInfo();
                  _elem336 = new GuildBaseInfo();
                  _elem336.Read(iprot);
                  UpdateGuildInfos.Add(_elem336);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.List) {
              {
                UpdateWeddingNotices = new List<WeddingNotice>();
                TList _list337 = iprot.ReadListBegin();
                for( int _i338 = 0; _i338 < _list337.Count; ++_i338)
                {
                  WeddingNotice _elem339 = new WeddingNotice();
                  _elem339 = new WeddingNotice();
                  _elem339.Read(iprot);
                  UpdateWeddingNotices.Add(_elem339);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.List) {
              {
                UpdateWeddingRoomInfos = new List<WeddingRoomInfo>();
                TList _list340 = iprot.ReadListBegin();
                for( int _i341 = 0; _i341 < _list340.Count; ++_i341)
                {
                  WeddingRoomInfo _elem342 = new WeddingRoomInfo();
                  _elem342 = new WeddingRoomInfo();
                  _elem342.Read(iprot);
                  UpdateWeddingRoomInfos.Add(_elem342);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CommonDataPageInfos");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (PageIds != null && __isset.pageIds) {
        field.Name = "pageIds";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, PageIds.Count));
          foreach (CommonDataPageIds _iter343 in PageIds)
          {
            _iter343.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.totalSize) {
        field.Name = "totalSize";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(TotalSize);
        oprot.WriteFieldEnd();
      }
      if (__isset.version) {
        field.Name = "version";
        field.Type = TType.I16;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(Version);
        oprot.WriteFieldEnd();
      }
      if (UpdateMallItems != null && __isset.updateMallItems) {
        field.Name = "updateMallItems";
        field.Type = TType.List;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, UpdateMallItems.Count));
          foreach (MallItem _iter344 in UpdateMallItems)
          {
            _iter344.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (UpdateGroundRoomInfos != null && __isset.updateGroundRoomInfos) {
        field.Name = "updateGroundRoomInfos";
        field.Type = TType.List;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, UpdateGroundRoomInfos.Count));
          foreach (GroundRoomInfo _iter345 in UpdateGroundRoomInfos)
          {
            _iter345.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (UpdateDanceRoomInfos != null && __isset.updateDanceRoomInfos) {
        field.Name = "updateDanceRoomInfos";
        field.Type = TType.List;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, UpdateDanceRoomInfos.Count));
          foreach (DanceRoomInfo _iter346 in UpdateDanceRoomInfos)
          {
            _iter346.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (UpdateGuildInfos != null && __isset.updateGuildInfos) {
        field.Name = "updateGuildInfos";
        field.Type = TType.List;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, UpdateGuildInfos.Count));
          foreach (GuildBaseInfo _iter347 in UpdateGuildInfos)
          {
            _iter347.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (UpdateWeddingNotices != null && __isset.updateWeddingNotices) {
        field.Name = "updateWeddingNotices";
        field.Type = TType.List;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, UpdateWeddingNotices.Count));
          foreach (WeddingNotice _iter348 in UpdateWeddingNotices)
          {
            _iter348.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (UpdateWeddingRoomInfos != null && __isset.updateWeddingRoomInfos) {
        field.Name = "updateWeddingRoomInfos";
        field.Type = TType.List;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, UpdateWeddingRoomInfos.Count));
          foreach (WeddingRoomInfo _iter349 in UpdateWeddingRoomInfos)
          {
            _iter349.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("CommonDataPageInfos(");
      sb.Append("PageIds: ");
      sb.Append(PageIds);
      sb.Append(",TotalSize: ");
      sb.Append(TotalSize);
      sb.Append(",Version: ");
      sb.Append(Version);
      sb.Append(",UpdateMallItems: ");
      sb.Append(UpdateMallItems);
      sb.Append(",UpdateGroundRoomInfos: ");
      sb.Append(UpdateGroundRoomInfos);
      sb.Append(",UpdateDanceRoomInfos: ");
      sb.Append(UpdateDanceRoomInfos);
      sb.Append(",UpdateGuildInfos: ");
      sb.Append(UpdateGuildInfos);
      sb.Append(",UpdateWeddingNotices: ");
      sb.Append(UpdateWeddingNotices);
      sb.Append(",UpdateWeddingRoomInfos: ");
      sb.Append(UpdateWeddingRoomInfos);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
