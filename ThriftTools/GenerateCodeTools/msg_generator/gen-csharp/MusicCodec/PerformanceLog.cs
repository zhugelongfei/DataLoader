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
  /// ���ܰ�ť��־
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class PerformanceLog : TBase
  {
    private string _scene;
    private int _sceneId;
    private int _close;

    /// <summary>
    /// ���ʱ���ڳ��������䡢��Ϸ��
    /// </summary>
    public string Scene
    {
      get
      {
        return _scene;
      }
      set
      {
        __isset.scene = true;
        this._scene = value;
      }
    }

    /// <summary>
    /// �����ι�������ʱ���¼�ؿ�ID������������¼����ID��
    /// </summary>
    public int SceneId
    {
      get
      {
        return _sceneId;
      }
      set
      {
        __isset.sceneId = true;
        this._sceneId = value;
      }
    }

    /// <summary>
    /// 0��������1���ر�
    /// </summary>
    public int Close
    {
      get
      {
        return _close;
      }
      set
      {
        __isset.close = true;
        this._close = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool scene;
      public bool sceneId;
      public bool close;
    }

    public PerformanceLog() {
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
            if (field.Type == TType.String) {
              Scene = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              SceneId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Close = iprot.ReadI32();
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
      TStruct struc = new TStruct("PerformanceLog");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Scene != null && __isset.scene) {
        field.Name = "scene";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Scene);
        oprot.WriteFieldEnd();
      }
      if (__isset.sceneId) {
        field.Name = "sceneId";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(SceneId);
        oprot.WriteFieldEnd();
      }
      if (__isset.close) {
        field.Name = "close";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Close);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("PerformanceLog(");
      sb.Append("Scene: ");
      sb.Append(Scene);
      sb.Append(",SceneId: ");
      sb.Append(SceneId);
      sb.Append(",Close: ");
      sb.Append(Close);
      sb.Append(")");
      return sb.ToString();
    }

  }

}