/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "AchievementCfg_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace ThriftStruct {


AchievementCfg::~AchievementCfg() throw() {
}


void AchievementCfg::__set_Type(const int32_t val) {
  this->Type = val;
}

void AchievementCfg::__set_LimitIDMale(const int32_t val) {
  this->LimitIDMale = val;
}

void AchievementCfg::__set_LimitIDFemale(const int32_t val) {
  this->LimitIDFemale = val;
}

void AchievementCfg::__set_Scene(const int32_t val) {
  this->Scene = val;
}

uint32_t AchievementCfg::read(::apache::thrift::protocol::TProtocol* iprot) {

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
          xfer += iprot->readI32(this->Type);
          this->__isset.Type = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->LimitIDMale);
          this->__isset.LimitIDMale = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->LimitIDFemale);
          this->__isset.LimitIDFemale = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->Scene);
          this->__isset.Scene = true;
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

uint32_t AchievementCfg::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("AchievementCfg");

  xfer += oprot->writeFieldBegin("Type", ::apache::thrift::protocol::T_I32, 1);
  xfer += oprot->writeI32(this->Type);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("LimitIDMale", ::apache::thrift::protocol::T_I32, 2);
  xfer += oprot->writeI32(this->LimitIDMale);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("LimitIDFemale", ::apache::thrift::protocol::T_I32, 3);
  xfer += oprot->writeI32(this->LimitIDFemale);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("Scene", ::apache::thrift::protocol::T_I32, 4);
  xfer += oprot->writeI32(this->Scene);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(AchievementCfg &a, AchievementCfg &b) {
  using ::std::swap;
  swap(a.Type, b.Type);
  swap(a.LimitIDMale, b.LimitIDMale);
  swap(a.LimitIDFemale, b.LimitIDFemale);
  swap(a.Scene, b.Scene);
  swap(a.__isset, b.__isset);
}

AchievementCfg::AchievementCfg(const AchievementCfg& other0) {
  Type = other0.Type;
  LimitIDMale = other0.LimitIDMale;
  LimitIDFemale = other0.LimitIDFemale;
  Scene = other0.Scene;
  __isset = other0.__isset;
}
AchievementCfg& AchievementCfg::operator=(const AchievementCfg& other1) {
  Type = other1.Type;
  LimitIDMale = other1.LimitIDMale;
  LimitIDFemale = other1.LimitIDFemale;
  Scene = other1.Scene;
  __isset = other1.__isset;
  return *this;
}
void AchievementCfg::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "AchievementCfg(";
  out << "Type=" << to_string(Type);
  out << ", " << "LimitIDMale=" << to_string(LimitIDMale);
  out << ", " << "LimitIDFemale=" << to_string(LimitIDFemale);
  out << ", " << "Scene=" << to_string(Scene);
  out << ")";
}

} // namespace
