include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs


/** 查询商店物品*/
struct CSQueryGuildShop{
	1:i32	version
	2:i32 	startIndex
	3:i32 	size
}
/** 购买商品 */
struct CSBuyGuildItem{
	1: i32	itemId
}
/** 请求刷新商店列表*/
struct CSRefreshGuildShop{
	1: i32	startIndex
	2: i32	size
}

/** 一键处理所有舞团申请*/
struct CSHandleAllGuildApply{
	1: bool		allow
}

/** 查询所有舞团列表页号条件 */
struct CSQueryGuildListMsg{
	/** 分页信息查询参数 */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
	3: struct.GuildSortType queryType;
}

/** 请求对应id的舞团信息 */
struct CSQueryGuildByIdsMsg{
	/** 请求对应id的信息参数 */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
}

/** 查询我的舞团信息 */
struct CSQueryMyGuildInfoMsg{

}

/** 查询舞团团员列表 */
struct CSQueryGuildMemListMsg{
	1: i64 guildId;
	2: i32 startIndex;
	3: i16 count;
}

//团长查询申请列表
struct CSQueryApplyListMsg{
	1: i32 startIndex;
	2: i16 count;
}

//团长允许申请加入
struct CSAllowJoinGuildMsg{
	1: i64 allowCharId;
}


//团长修改公告
struct CSModifyNoticeMsg{
	1: optional string noticeBoard;
	2: optional string headIcon
}

//团长转让团长
struct CSTransferDegreeMsg{
	1: i64 transferCharId;
}

//团长踢出成员
struct CSGuildKickPlayerMsg{
	1: i64 kickCharId;
}

//加入申请舞团

struct CSAddApplyListMsg{
	1: i64 guildId;
}

//团员退出舞团
struct CSQuitGuildMsg{
	
}


//创建帮会
struct CSGuildCreateMsg{
	1: string guildName;
	2: string guildIcon;
	3: string noticeBoard;
}



struct CSMyApplyGuildListMsg{
}

//团长拒绝玩家申请
struct CSGuildReuseApplyMsg{
	1: i64 charId;
}

//取消申请舞团
struct CSGuildRemoveApplyMsg{
	1: i64 guildId;
}

//邀请玩家加入舞团,发通知给邀请的玩家
struct CSInviteJoinGuildMsg{
	1: i64 charId;
}

//被邀请的玩家同意加入舞团
struct CSAgreeJoinGuildMsg{
	1: i64 guildId;
	2: byte agreeType;
}
//签到消息
struct CSGuildSignInMsg{

}
/** 捐赠消息 */
struct CSGuildDonateMsg{
	1:i32		gold
	2:i32		bindDiamond
}
//膜拜玩家
struct CSGuildWorshipMsg{
	1:i64 worshipPlayerId
}

struct CSSearchGuildListMsg{
	1:string	guildName
}

struct CSGuildWorldInviteMsg{
}

struct CSChangeGuildNameMsg{
	1: string guildName
}

struct CSGuildTaskListMsg{
}
struct CSGuildAcceptTaskIdsMsg{
}
struct CSAcceptGuildTaskMsg{
}

struct CSFinishGuildTaskMsg{
}

struct CSTakeGuildRewardMsg{
	1: byte type
}
struct CSAllGuildRewardsMsg{
	1: byte type
}

/** 请求授权副团长 */
struct CSReqAppointGuildDeputy{
	1: i64 charId
}
/** 请求撤销副团长 */
struct CSReqCancleGuildDeputy{
	1: i64 charId
}