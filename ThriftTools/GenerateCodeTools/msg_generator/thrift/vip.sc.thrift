include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** vip等级奖励信息 */
struct SCVipLevelPrizeMsg{
	/** vip等级 */
	1: byte vipLvl;
	/** 奖励 */
	2: optional struct.PrizeInfo prizeInfos
}
/** 领取对应vip等级返回信息 */
struct SCVipGetLevelPrizeMsg{
    /** vip等级 */
	1: byte vipLvl;
	/** 0 -- 失败 1 -- 成功 */
    2: byte result;  
}

/** vip等级升级 */
struct SCVipLevelUpMsg{
	1: byte sourceLevel
	2: byte currentLevel
}

/** 更新Vip等级奖励信息(预留) */
struct SCVipPrizeUpdateMsg{
    /** 能够领取奖励vip等级 */
	1: list<byte> levelPrizeList
}

/** vip登录提示 */
struct SCVipEnterNotice{
	1: i32 scope
	2: i32 messageId
	3: list<string> argv
}