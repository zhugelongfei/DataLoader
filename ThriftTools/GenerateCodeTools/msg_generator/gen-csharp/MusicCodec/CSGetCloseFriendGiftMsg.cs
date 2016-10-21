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
  /// ��ȡ���ѽ���
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSGetCloseFriendGiftMsg : TBase
  {
    private long _charId;
    private byte _closeLvl;

    /// <summary>
    /// ����id
    /// </summary>
    public long CharId
    {
      get
      {
        return _charId;
      }
      set
      {
        __isset.charId = true;
        this._charId = value;
      }
    }

    /// <summary>
    /// ��ȡ�����ѹ�ϵ�ȼ�
    /// </summary>
    public byte CloseLvl
    {
      get
      {
        return _closeLvl;
      }
      set
      {
        __isset.closeLvl = true;
        this._closeLvl = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool charId;
      public bool closeLvl;
    }

    public CSGetCloseFriendGiftMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSGetCloseFriendGiftMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.charId) {
        field.Name = "charId";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CharId);
        oprot.WriteFieldEnd();
      }
      if (__isset.closeLvl) {
        field.Name = "closeLvl";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(CloseLvl);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}