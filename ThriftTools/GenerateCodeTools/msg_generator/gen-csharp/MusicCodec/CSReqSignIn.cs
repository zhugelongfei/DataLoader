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
  /// ����ǩ��
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSReqSignIn : TBase
  {
    private byte _month;
    private byte _dayIndex;

    /// <summary>
    /// ǩ���·�
    /// </summary>
    public byte Month
    {
      get
      {
        return _month;
      }
      set
      {
        __isset.month = true;
        this._month = value;
      }
    }

    /// <summary>
    /// ǩ���ڼ���
    /// </summary>
    public byte DayIndex
    {
      get
      {
        return _dayIndex;
      }
      set
      {
        __isset.dayIndex = true;
        this._dayIndex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool month;
      public bool dayIndex;
    }

    public CSReqSignIn() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSReqSignIn");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.month) {
        field.Name = "month";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Month);
        oprot.WriteFieldEnd();
      }
      if (__isset.dayIndex) {
        field.Name = "dayIndex";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(DayIndex);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}