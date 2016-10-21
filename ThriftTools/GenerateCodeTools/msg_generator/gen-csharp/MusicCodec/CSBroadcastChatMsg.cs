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
  /// 聊天广播
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSBroadcastChatMsg : TBase
  {
    private byte _scope;
    private string _content;
    private string _soundNameKey;
    private int _sendAutoSpeakerIndex;

    /// <summary>
    /// 聊天类型的索引
    /// </summary>
    public byte Scope
    {
      get
      {
        return _scope;
      }
      set
      {
        __isset.scope = true;
        this._scope = value;
      }
    }

    /// <summary>
    /// 聊天内容
    /// </summary>
    public string Content
    {
      get
      {
        return _content;
      }
      set
      {
        __isset.content = true;
        this._content = value;
      }
    }

    /// <summary>
    /// 语音聊天key
    /// </summary>
    public string SoundNameKey
    {
      get
      {
        return _soundNameKey;
      }
      set
      {
        __isset.soundNameKey = true;
        this._soundNameKey = value;
      }
    }

    /// <summary>
    /// 自动喇叭索引
    /// </summary>
    public int SendAutoSpeakerIndex
    {
      get
      {
        return _sendAutoSpeakerIndex;
      }
      set
      {
        __isset.sendAutoSpeakerIndex = true;
        this._sendAutoSpeakerIndex = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool scope;
      public bool content;
      public bool soundNameKey;
      public bool sendAutoSpeakerIndex;
    }

    public CSBroadcastChatMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSBroadcastChatMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.scope) {
        field.Name = "scope";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(Scope);
        oprot.WriteFieldEnd();
      }
      if (Content != null && __isset.content) {
        field.Name = "content";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Content);
        oprot.WriteFieldEnd();
      }
      if (SoundNameKey != null && __isset.soundNameKey) {
        field.Name = "soundNameKey";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SoundNameKey);
        oprot.WriteFieldEnd();
      }
      if (__isset.sendAutoSpeakerIndex) {
        field.Name = "sendAutoSpeakerIndex";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(SendAutoSpeakerIndex);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
