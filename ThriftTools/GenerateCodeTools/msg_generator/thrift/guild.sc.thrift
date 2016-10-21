include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 舞团信息 */
struct SCGuildListResultMsg{
	1: struct.GuildSortType queryType;
	/** 舞团分页信息 */
	2: struct.CommonDataPageInfos guildPageInfos
}

/** 对应id的舞团信息 */
struct SCQueryGuildByIdsResponse{
	/** 请求对应id的信息响应 */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
}

/** 我的舞团信息 */
struct SCMyGuildInfoResultMsg{
	1: struct.GuildBaseInfo myGuildInfo;
}

/** 舞团商店消息*/
struct SCGuildShopMsg{
	1: list<struct.GuildShopItem> items
	2: i32	version
	3: i32	startIndex
	4: i32	totalCount
}
/** 购买商品成功 */
struct SCGuildBuyItemSucc{
	1: i32 	id
	2: i32 amountLeft
}

//查询舞团团员列表
struct SCGuildMemListResultMsg{
	1: i64 guildId;
	2: i32 startIndex;
	3: i16 count;
	4: list<struct.GuildMemInfo> memList;
	5: i16 totalCount;
}

//团长查询申请列表返回
struct SCApplyListResultMsg{
	1: i32 startIndex;
	2: i16 count;
	3: list<struct.GuildMemInfo> memList;
	4: i16 totalCount;
}

//新成员加入舞团信息，广播给帮会所有人
struct SCGuildMemberJoinMsg{
 1: struct.GuildMemInfo memInfo;
}

//舞团人员退出消息
struct SCGuildMemberQuitMsg{
	1: i64 charId;
	2: struct.GuildQuitReason reason;
}
struct SCApplyGuildResultMsg{
	1: i64 guildId;
	2: byte errorCode;
}

struct SCGuildTransferLeaderMsg{
	1: i64 sourceCharId;
	2: i64 targetCharId
}

struct SCGuildUpdateMemberStatusMsg{
	 1: struct.GuildMemInfo memInfo;
}

struct SCUpdateGuildPropertyMsg{
	1: optional i32		donateValue
	2: optional struct.GuildDegree		degree
	3: optional i32		guildGold
	4: optional i32		lastSignInTime
	5: optional i32		memHonor
	6: optional i32		signDays
	7: optional bool	hasSigned
	8: optional i32		weekContribution
	9: optional	i32		donateTimes
}

struct SCUpdateGuildBaseInfoMsg{
	1: optional string guildName
	2: optional struct.GuildMemInfo leaderInfo
	3: optional string guildIcon
	4: optional string noticeBoard
	5: optional i16 memberCount
	6: optional i16 averageLevel
	7: optional i64 popularityCount
	8: optional i32 vipExpCount
	9: optional i16 limitCount
	10: optional i32		honor
	11: optional i32		level
	12: optional i32		assistantCount
	13: optional binary flags
	14: optional list<byte> byteDayLoopCounterList
	15: optional list<i16> shortDayLoopCounterList
	16: optional list<i32> intDayLoopCounterList
	17: optional list<i32> intCounterList
	18: optional i32		guildExp
	19: optional i32		honorLevel
}

struct SCGuildLevelUpMsg{
	1: byte sourceLevel
	2: byte currentLevel
}
struct SCGuildHonorLevelUpMsg{
	1: byte sourceLevel
	2: byte currentLevel
}

struct SCGuildTaskListMsg{
	1: list<struct.CourseTaskData> tasks
}
struct SCGuildAcceptTaskIdsMsg{
	1: list<i32> canAccpetList
}
struct SCAcceptGuildTaskMsg{
}

struct SCFinishGuildTaskMsg{
}

struct SCTakeGuildRewardMsg{
	1: byte type
	2: i32 failedReason
}
struct SCAllGuildRewardsMsg{
	/** 奖励 */
	1: optional struct.PrizeInfo prizeInfos
	2: byte type
}

struct SCUpdateGuildDegree{
	/** 角色ID */
	1: i64 charId
	/** 职位 */
	2: struct.GuildDegree degree
}