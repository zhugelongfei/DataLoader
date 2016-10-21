include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求巡演章节信息 */
struct CSReqTourChapterInfoMsg{
	/** 章节id */
	1: list<i16> chapterIds
	/** 当前章节id */
	2: i16 curChapterId
}

/** 请求巡演关卡详细信息 */
struct CSReqTourRaidDetailMsg{
	/** 章节id */
	1: i16 chapterId
	/** 关卡id */
	2: i16 raidId
}

/** 更新巡演关卡信息 */
struct CSUpdateRoomTourRaidMsg{
	/** 巡演类型 0-普通 1-困难 2-俱乐部 */
	1: byte tourRaidType
	/** 关卡id */
	2: i16 raidId
}

/** 查询巡演星数奖励状态信息 */
struct CSGetTourStarPrizeStatus{
    /** 星数奖励信息版本号， 默认0 */
	1: i32 version
	/** 章节id */
	2: i16 chapterId
}

/** 领取巡演星数奖励 */
struct CSGetTourStarPrizeMsg{
	/** 领取奖励的星数 */
	1: i32 stars
	/** 章节id */
	2: i16 chapterId
}

/** 巡演踩中陷阱 */
struct CSStepInTourTrap{
	/** 释放的技能id */
	1: i32 skillId
}

/** 请求购买巡演次数 */
struct CSReqBuyTourTimes{
}