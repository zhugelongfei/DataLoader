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
  /// 动感模式输入数据， 由一系列的输入片段组成，适用于T台，写真等特殊玩法
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class SCGenerateDynamicInputMsg : TBase
  {
    private List<MusicCodec.DynamicSegmentInputs> _inputMusicGroups;

    /// <summary>
    /// 输入音乐id序列
    /// </summary>
    public List<MusicCodec.DynamicSegmentInputs> InputMusicGroups
    {
      get
      {
        return _inputMusicGroups;
      }
      set
      {
        __isset.inputMusicGroups = true;
        this._inputMusicGroups = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool inputMusicGroups;
    }

    public SCGenerateDynamicInputMsg() {
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
                InputMusicGroups = new List<MusicCodec.DynamicSegmentInputs>();
                TList _list44 = iprot.ReadListBegin();
                for( int _i45 = 0; _i45 < _list44.Count; ++_i45)
                {
                  MusicCodec.DynamicSegmentInputs _elem46 = new MusicCodec.DynamicSegmentInputs();
                  _elem46 = new MusicCodec.DynamicSegmentInputs();
                  _elem46.Read(iprot);
                  InputMusicGroups.Add(_elem46);
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
ClientLog.Instance.LogError("This function is deleted.");
}

    


  }

}
