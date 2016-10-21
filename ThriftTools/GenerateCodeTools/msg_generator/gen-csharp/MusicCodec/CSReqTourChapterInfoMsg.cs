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
  /// ����Ѳ���½���Ϣ
  /// </summary>
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class CSReqTourChapterInfoMsg : TBase
  {
    private List<short> _chapterIds;
    private short _curChapterId;

    /// <summary>
    /// �½�id
    /// </summary>
    public List<short> ChapterIds
    {
      get
      {
        return _chapterIds;
      }
      set
      {
        __isset.chapterIds = true;
        this._chapterIds = value;
      }
    }

    /// <summary>
    /// ��ǰ�½�id
    /// </summary>
    public short CurChapterId
    {
      get
      {
        return _curChapterId;
      }
      set
      {
        __isset.curChapterId = true;
        this._curChapterId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool chapterIds;
      public bool curChapterId;
    }

    public CSReqTourChapterInfoMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSReqTourChapterInfoMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ChapterIds != null && __isset.chapterIds) {
        field.Name = "chapterIds";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I16, ChapterIds.Count));
          foreach (short _iter3 in ChapterIds)
          {
            oprot.WriteI16(_iter3);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.curChapterId) {
        field.Name = "curChapterId";
        field.Type = TType.I16;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI16(CurChapterId);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}