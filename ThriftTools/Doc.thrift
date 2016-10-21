// include struct.thrift
namespace java com.yufei.com
namespace csharp ThriftCode

enum Numberz
{
  ONE = 1,
  TWO,
  THREE,
  FIVE = 5,
  SIX,
  EIGHT = 8
}

typedef i64 UserId

exception Bonk
{
  1:string message,
  2:i32 type,
  3:byte bytetest
}
