/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef EnemyInfo_TYPES_H
#define EnemyInfo_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>


namespace ThriftStruct {

class EnemyInfo;

typedef struct _EnemyInfo__isset {
  _EnemyInfo__isset() : ID(false), Name(false), Type(false), ResId(false), AttackRange(false), MaxBlood(false), Damage(false), Defence(false) {}
  bool ID :1;
  bool Name :1;
  bool Type :1;
  bool ResId :1;
  bool AttackRange :1;
  bool MaxBlood :1;
  bool Damage :1;
  bool Defence :1;
} _EnemyInfo__isset;

class EnemyInfo {
 public:

  EnemyInfo(const EnemyInfo&);
  EnemyInfo& operator=(const EnemyInfo&);
  EnemyInfo() : ID(0), Name(), Type(0), ResId(0), AttackRange(0), MaxBlood(0), Damage(0), Defence(0) {
  }

  virtual ~EnemyInfo() throw();
  int32_t ID;
  std::string Name;
  int32_t Type;
  int32_t ResId;
  int32_t AttackRange;
  int32_t MaxBlood;
  int32_t Damage;
  int32_t Defence;

  _EnemyInfo__isset __isset;

  void __set_ID(const int32_t val);

  void __set_Name(const std::string& val);

  void __set_Type(const int32_t val);

  void __set_ResId(const int32_t val);

  void __set_AttackRange(const int32_t val);

  void __set_MaxBlood(const int32_t val);

  void __set_Damage(const int32_t val);

  void __set_Defence(const int32_t val);

  bool operator == (const EnemyInfo & rhs) const
  {
    if (!(ID == rhs.ID))
      return false;
    if (!(Name == rhs.Name))
      return false;
    if (!(Type == rhs.Type))
      return false;
    if (!(ResId == rhs.ResId))
      return false;
    if (!(AttackRange == rhs.AttackRange))
      return false;
    if (!(MaxBlood == rhs.MaxBlood))
      return false;
    if (!(Damage == rhs.Damage))
      return false;
    if (!(Defence == rhs.Defence))
      return false;
    return true;
  }
  bool operator != (const EnemyInfo &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const EnemyInfo & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(EnemyInfo &a, EnemyInfo &b);

inline std::ostream& operator<<(std::ostream& out, const EnemyInfo& obj)
{
  obj.printTo(out);
  return out;
}

} // namespace

#endif
