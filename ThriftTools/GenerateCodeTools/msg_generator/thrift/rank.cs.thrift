include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 查询排行榜第一名信息 */
struct CSQueryTopOneRanksMsg{
    /** 排行榜类型 */
	1: list<i16> rankTypes
	/** 客户端记录所在面板 */
	2: byte panelId
}

/** 查询排行榜信息 */
struct CSQueryRankListMsg{
	1: i16 rankType
	2: i16 startRank
	/** limit 50 */
	3: i16 endRank
	4: optional struct.RankMusicQueryParam muiscQueryParam
}

/** 膜拜排行榜上榜玩家 */
struct CSWorshipOnRankMsg{
    /** 上榜类型 */
	1: i16 rankType
    /** 上榜第一个玩家角色id */
	2: i64 onRankFirstPlayerId
	/** 上榜第二个玩家角色id（双人榜单） */
	3: optional i64 onRankSecondPlayerId
}

/** 请求已膜拜上榜玩家信息 */
struct CSQueryWorshipOnRankInfos{
}

/** 查询上榜的信息 */
struct CSQueryOnRankInfoMsg{
	1: i64 charId
}