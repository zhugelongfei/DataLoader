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
  public partial class CSReqCourseTaskInfosMsg : TBase
  {
    private byte _taskType;

    /// <summary>
    /// 任务类型 0-主线 1-日常
    /// </summary>
    public byte TaskType
    {
      get
      {
        return _taskType;
      }
      set
      {
        __isset.taskType = true;
        this._taskType = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool taskType;
    }

    public CSReqCourseTaskInfosMsg() {
    }

    public void Read (TProtocol iprot)
    {
ClientLog.Instance.LogError("This function is deleted.");
}

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("CSReqCourseTaskInfosMsg");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.taskType) {
        field.Name = "taskType";
        field.Type = TType.Byte;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteByte(TaskType);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    


  }

}
