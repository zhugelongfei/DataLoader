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
  public partial class TransactionInfo : TBase
  {
    private string _identifier;
    private string _token;
    private int _quantity;
    private long _accountID;
    private string _serverName;
    private string _lineName;
    private int _status;
    private string _info;
    private string _time;
    private string _transactionIdentfier;

    public string Identifier
    {
      get
      {
        return _identifier;
      }
      set
      {
        __isset.identifier = true;
        this._identifier = value;
      }
    }

    public string Token
    {
      get
      {
        return _token;
      }
      set
      {
        __isset.token = true;
        this._token = value;
      }
    }

    public int Quantity
    {
      get
      {
        return _quantity;
      }
      set
      {
        __isset.quantity = true;
        this._quantity = value;
      }
    }

    public long AccountID
    {
      get
      {
        return _accountID;
      }
      set
      {
        __isset.accountID = true;
        this._accountID = value;
      }
    }

    public string ServerName
    {
      get
      {
        return _serverName;
      }
      set
      {
        __isset.serverName = true;
        this._serverName = value;
      }
    }

    public string LineName
    {
      get
      {
        return _lineName;
      }
      set
      {
        __isset.lineName = true;
        this._lineName = value;
      }
    }

    public int Status
    {
      get
      {
        return _status;
      }
      set
      {
        __isset.status = true;
        this._status = value;
      }
    }

    public string Info
    {
      get
      {
        return _info;
      }
      set
      {
        __isset.info = true;
        this._info = value;
      }
    }

    public string Time
    {
      get
      {
        return _time;
      }
      set
      {
        __isset.time = true;
        this._time = value;
      }
    }

    public string TransactionIdentfier
    {
      get
      {
        return _transactionIdentfier;
      }
      set
      {
        __isset.transactionIdentfier = true;
        this._transactionIdentfier = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool identifier;
      public bool token;
      public bool quantity;
      public bool accountID;
      public bool serverName;
      public bool lineName;
      public bool status;
      public bool info;
      public bool time;
      public bool transactionIdentfier;
    }

    public TransactionInfo() {
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
              Identifier = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Token = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Quantity = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              AccountID = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              ServerName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              LineName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              Status = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              Info = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.String) {
              Time = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              TransactionIdentfier = iprot.ReadString();
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
      TStruct struc = new TStruct("TransactionInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Identifier != null && __isset.identifier) {
        field.Name = "identifier";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Identifier);
        oprot.WriteFieldEnd();
      }
      if (Token != null && __isset.token) {
        field.Name = "token";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Token);
        oprot.WriteFieldEnd();
      }
      if (__isset.quantity) {
        field.Name = "quantity";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Quantity);
        oprot.WriteFieldEnd();
      }
      if (__isset.accountID) {
        field.Name = "accountID";
        field.Type = TType.I64;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(AccountID);
        oprot.WriteFieldEnd();
      }
      if (ServerName != null && __isset.serverName) {
        field.Name = "serverName";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ServerName);
        oprot.WriteFieldEnd();
      }
      if (LineName != null && __isset.lineName) {
        field.Name = "lineName";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(LineName);
        oprot.WriteFieldEnd();
      }
      if (__isset.status) {
        field.Name = "status";
        field.Type = TType.I32;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Status);
        oprot.WriteFieldEnd();
      }
      if (Info != null && __isset.info) {
        field.Name = "info";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Info);
        oprot.WriteFieldEnd();
      }
      if (Time != null && __isset.time) {
        field.Name = "time";
        field.Type = TType.String;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Time);
        oprot.WriteFieldEnd();
      }
      if (TransactionIdentfier != null && __isset.transactionIdentfier) {
        field.Name = "transactionIdentfier";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(TransactionIdentfier);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("TransactionInfo(");
      sb.Append("Identifier: ");
      sb.Append(Identifier);
      sb.Append(",Token: ");
      sb.Append(Token);
      sb.Append(",Quantity: ");
      sb.Append(Quantity);
      sb.Append(",AccountID: ");
      sb.Append(AccountID);
      sb.Append(",ServerName: ");
      sb.Append(ServerName);
      sb.Append(",LineName: ");
      sb.Append(LineName);
      sb.Append(",Status: ");
      sb.Append(Status);
      sb.Append(",Info: ");
      sb.Append(Info);
      sb.Append(",Time: ");
      sb.Append(Time);
      sb.Append(",TransactionIdentfier: ");
      sb.Append(TransactionIdentfier);
      sb.Append(")");
      return sb.ToString();
    }

  }

}