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
  /// 摸一摸其他玩家
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSTouchFriendMsg : TBase
  {
    private byte _touchPosition;
    private long _targetCharid;
    private byte _isTodayFirst;

    /// <summary>
    /// 摸身体部位
    /// </summary>
    public byte TouchPosition
    {
      get
      {
        return _touchPosition;
      }
      set
      {
        __isset.touchPosition = true;
        this._touchPosition = value;
      }
    }

    public long TargetCharid
    {
      get
      {
        return _targetCharid;
      }
      set
      {
        __isset.targetCharid = true;
        this._targetCharid = value;
      }
    }

    /// <summary>
    /// 是否今天第一次摸 0-否 1-是
    /// </summary>
    public byte IsTodayFirst
    {
      get
      {
        return _isTodayFirst;
      }
      set
      {
        __isset.isTodayFirst = true;
        this._isTodayFirst = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool touchPosition;
      public bool targetCharid;
      public bool isTodayFirst;
    }

    public CSTouchFriendMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSTouchFriendMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.touchPosition) {
        field.Name = "touchPosition";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(TouchPosition);
        oprot.WriteFieldEnd();
      }
      if (__isset.targetCharid) {
        field.Name = "targetCharid";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(TargetCharid);
        oprot.WriteFieldEnd();
      }
      if (__isset.isTodayFirst) {
        field.Name = "isTodayFirst";
        field.Type = TType.Byte;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(IsTodayFirst);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
