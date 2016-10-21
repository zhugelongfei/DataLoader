include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 排行榜第一名信息 */
struct SCTopOneRanksMsg{
    /** 排行榜类型 - 上榜玩家信息 */
	1: map<i16, struct.RankInfo> topOneRankInfos
	/** 有效截止时间（从1970.1.1开始的秒数） */
	2: i32 validTime
	/** 客户端记录所在面板 */
	3: byte panelId
}

/** 排行榜信息 */
struct SCRankListMsg{
	1: i16 rankType
	2: list<struct.RankInfo> rankInfoList
	3: optional i32 selfRank
	4: optional i64 selfScore
	5: i32 startRank
	6: i32 endRank
	7: i32 rankCount
	8: optional struct.RankMusicQueryParam muiscQueryParam
	/** 有效截止时间（从1970.1.1开始的秒数） */
	9: i32 validTime
}

/** 成功膜拜排行榜上榜玩家 */
struct SCWorshipOnRankSucc{
    /** 上榜第一个玩家角色id */
	1: i64 onRankFirstPlayerId
	/** 上榜第二个玩家角色id(双人榜单) */
	2: optional i64 onRankSecondPlayerId
}

/** 双人榜玩家信息 */
struct DoubleRankPlayInfo{
    /** 上榜第一个玩家角色id */
	1: i64 onRankFirstPlayerId
	/** 上榜第二个玩家角色id */
	2: i64 onRankSecondPlayerId
}

/** 已膜拜上榜玩家信息 */
struct SCWorshipOnRankInfos{
    /** 单人榜膜拜过的玩家角色id */
	1: list<i64> singleRankPlayerIds
	/** 双人榜膜拜过的玩家角色id */
	2: list<DoubleRankPlayInfo> doubleRankPlayerIds
	/** 有效截止时间（从1970.1.1开始的秒数） */
	3: i32 validTime
}

/** 上榜信息*/
struct OnRankInfo {
    /** 今日之星排名，未上榜为0， 下同 */
    1: i16 todayRank
	/** 周榜排名*/
	2: i16 weekRank
	/** 总榜排名*/
	3: i16 totalRank
}

/** 上排行榜的排名信息 */
struct SCOnRankInfoMsg{
	1: i64 charId
	/** 上榜信息<排行榜类型ERankingType，排名信息> */
	2: optional map<byte, OnRankInfo> onRankInfos
}