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

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSSetRoomMusicMsg : TBase
  {
    private byte _mode;
    private byte _songLvl;
    private short _songId;
    private string _pswd;
    private int _stageId;

    public byte Mode
    {
      get
      {
        return _mode;
      }
      set
      {
        __isset.mode = true;
        this._mode = value;
      }
    }

    public byte SongLvl
    {
      get
      {
        return _songLvl;
      }
      set
      {
        __isset.songLvl = true;
        this._songLvl = value;
      }
    }

    public short SongId
    {
      get
      {
        return _songId;
      }
      set
      {
        __isset.songId = true;
        this._songId = value;
      }
    }

    public string Pswd
    {
      get
      {
        return _pswd;
      }
      set
      {
        __isset.pswd = true;
        this._pswd = value;
      }
    }

    public int StageId
    {
      get
      {
        return _stageId;
      }
      set
      {
        __isset.stageId = true;
        this._stageId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool mode;
      public bool songLvl;
      public bool songId;
      public bool pswd;
      public bool stageId;
    }

    public CSSetRoomMusicMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSSetRoomMusicMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.mode) {
        field.Name = "mode";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Mode);
        oprot.WriteFieldEnd();
      }
      if (__isset.songLvl) {
        field.Name = "songLvl";
        field.Type = TType.Byte;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(SongLvl);
        oprot.WriteFieldEnd();
      }
      if (__isset.songId) {
        field.Name = "songId";
        field.Type = TType.I16;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(SongId);
        oprot.WriteFieldEnd();
      }
      if (Pswd != null && __isset.pswd) {
        field.Name = "pswd";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Pswd);
        oprot.WriteFieldEnd();
      }
      if (__isset.stageId) {
        field.Name = "stageId";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(StageId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
