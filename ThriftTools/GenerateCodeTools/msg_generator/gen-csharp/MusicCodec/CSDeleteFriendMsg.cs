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
  /// ͨ��charIdɾ������
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSDeleteFriendMsg : TBase
  {
    private long _friendCharId;

    /// <summary>
    /// ɾ������id
    /// </summary>
    public long FriendCharId
    {
      get
      {
        return _friendCharId;
      }
      set
      {
        __isset.friendCharId = true;
        this._friendCharId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool friendCharId;
    }

    public CSDeleteFriendMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSDeleteFriendMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.friendCharId) {
        field.Name = "friendCharId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(FriendCharId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
