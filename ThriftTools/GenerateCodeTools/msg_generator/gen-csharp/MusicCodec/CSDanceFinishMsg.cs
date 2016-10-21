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
  /// Finsh dancing, notice server to broadcast ranking.
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSDanceFinishMsg : TBase
  {
    private int _totalMark;
    private MusicCodec.DanceGrade _danceGrade;

    public int TotalMark
    {
      get
      {
        return _totalMark;
      }
      set
      {
        __isset.totalMark = true;
        this._totalMark = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="MusicCodec.DanceGrade"/>
    /// </summary>
    public MusicCodec.DanceGrade DanceGrade
    {
      get
      {
        return _danceGrade;
      }
      set
      {
        __isset.danceGrade = true;
        this._danceGrade = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool totalMark;
      public bool danceGrade;
    }

    public CSDanceFinishMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSDanceFinishMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.totalMark) {
        field.Name = "totalMark";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(TotalMark);
        oprot.WriteFieldEnd();
      }
      if (__isset.danceGrade) {
        field.Name = "danceGrade";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)DanceGrade);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}