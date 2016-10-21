include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCSignInStateMsg{
	1: i32 firstDayTimestamp
	2: list<byte> dailyState
	3: list<byte> collectiveState
}

struct SCSignInResultMsg{
	1: bool successful
	2: byte dayIndex
}

struct VipSignAward{
  1:i32 startLevel
  2:i32 endLevel
  3:i32 maleAwardType
  4:i32 maleAwardItemId
  5:i32 maleAwardItemAmount
  6:i32 femaleAwardType
  7:i32 femaleAwardItemId
  8:i32 femaleAwardItemAmount
}

struct ConmmonSignInAward{
  1:i32 dayIndex 
  2:i32 maleAwardType 
  3:i32 maleAwardItemId 
  4:i32 maleAwardItemAmount 
  5:i32 femaleAwardType 
  6:i32 femaleAwardItemId 
  7:i32 femaleAwardItemAmount 
  8:list<VipSignAward> vipAward 
}

struct CollectiveSignInAward{
  1:i32 dayAmount 
  2:i32 maleAwardType 
  3:i32 maleAwardItemId 
  4:i32 maleAwardItemAmount 
  5:i32 femaleAwardType 
  6:i32 femaleAwardItemId 
  7:i32 femaleAwardItemAmount 
  8:list<VipSignAward> vipAward 
}

struct SCSignInAwardsMsg{
	2: list<ConmmonSignInAward> commonAwards
	3: list<CollectiveSignInAward> collectiveAwards
}

/** 签到信息 */
struct SCSignInInfoMsg{
	/** 签到信息版本号 */
	1: i32 version
	/** 签到月份 */
	2: byte month
	/** 累计签到天数 */
	3: byte signInDays
	/** 今天是否签到 */
	4: bool isSignedToday
}

/** 签到成功 */
struct SCSignInSucc{
	/** 签到第几天 */
	1: byte dayIndex
}