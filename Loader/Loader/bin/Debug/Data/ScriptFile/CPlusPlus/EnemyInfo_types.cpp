/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "EnemyInfo_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace ThriftStruct {


EnemyInfo::~EnemyInfo() throw() {
}


void EnemyInfo::__set_ID(const int32_t val) {
  this->ID = val;
}

void EnemyInfo::__set_Name(const std::string& val) {
  this->Name = val;
}

void EnemyInfo::__set_Type(const int32_t val) {
  this->Type = val;
}

void EnemyInfo::__set_ResId(const int32_t val) {
  this->ResId = val;
}

void EnemyInfo::__set_AttackRange(const int32_t val) {
  this->AttackRange = val;
}

void EnemyInfo::__set_MaxBlood(const int32_t val) {
  this->MaxBlood = val;
}

void EnemyInfo::__set_Damage(const int32_t val) {
  this->Damage = val;
}

void EnemyInfo::__set_Defence(const int32_t val) {
  this->Defence = val;
}

uint32_t EnemyInfo::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->ID);
          this->__isset.ID = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->Name);
          this->__isset.Name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->Type);
          this->__isset.Type = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->ResId);
          this->__isset.ResId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->AttackRange);
          this->__isset.AttackRange = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->MaxBlood);
          this->__isset.MaxBlood = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->Damage);
          this->__isset.Damage = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->Defence);
          this->__isset.Defence = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t EnemyInfo::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("EnemyInfo");

  xfer += oprot->writeFieldBegin("ID", ::apache::thrift::protocol::T_I32, 1);
  xfer += oprot->writeI32(this->ID);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("Name", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->Name);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("Type", ::apache::thrift::protocol::T_I32, 3);
  xfer += oprot->writeI32(this->Type);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("ResId", ::apache::thrift::protocol::T_I32, 4);
  xfer += oprot->writeI32(this->ResId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("AttackRange", ::apache::thrift::protocol::T_I32, 5);
  xfer += oprot->writeI32(this->AttackRange);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("MaxBlood", ::apache::thrift::protocol::T_I32, 6);
  xfer += oprot->writeI32(this->MaxBlood);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("Damage", ::apache::thrift::protocol::T_I32, 7);
  xfer += oprot->writeI32(this->Damage);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("Defence", ::apache::thrift::protocol::T_I32, 8);
  xfer += oprot->writeI32(this->Defence);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(EnemyInfo &a, EnemyInfo &b) {
  using ::std::swap;
  swap(a.ID, b.ID);
  swap(a.Name, b.Name);
  swap(a.Type, b.Type);
  swap(a.ResId, b.ResId);
  swap(a.AttackRange, b.AttackRange);
  swap(a.MaxBlood, b.MaxBlood);
  swap(a.Damage, b.Damage);
  swap(a.Defence, b.Defence);
  swap(a.__isset, b.__isset);
}

EnemyInfo::EnemyInfo(const EnemyInfo& other0) {
  ID = other0.ID;
  Name = other0.Name;
  Type = other0.Type;
  ResId = other0.ResId;
  AttackRange = other0.AttackRange;
  MaxBlood = other0.MaxBlood;
  Damage = other0.Damage;
  Defence = other0.Defence;
  __isset = other0.__isset;
}
EnemyInfo& EnemyInfo::operator=(const EnemyInfo& other1) {
  ID = other1.ID;
  Name = other1.Name;
  Type = other1.Type;
  ResId = other1.ResId;
  AttackRange = other1.AttackRange;
  MaxBlood = other1.MaxBlood;
  Damage = other1.Damage;
  Defence = other1.Defence;
  __isset = other1.__isset;
  return *this;
}
void EnemyInfo::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "EnemyInfo(";
  out << "ID=" << to_string(ID);
  out << ", " << "Name=" << to_string(Name);
  out << ", " << "Type=" << to_string(Type);
  out << ", " << "ResId=" << to_string(ResId);
  out << ", " << "AttackRange=" << to_string(AttackRange);
  out << ", " << "MaxBlood=" << to_string(MaxBlood);
  out << ", " << "Damage=" << to_string(Damage);
  out << ", " << "Defence=" << to_string(Defence);
  out << ")";
}

} // namespace
