include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//获取连续登录领奖标记
struct CSGetLoginAwardInfoMsg{
	
}

//领取连续登录奖励
struct CSGetLoginAwardMsg{
	1: byte whichDay
}

//使用离线积分兑换点卷
struct CSGetOfflineCouponMsg{
	1: i32 score
}

//发送反馈消息
struct CSSendFeedBackMsg{
	1: string mobile
	2: string email
	3: string content
}

//领取GM补偿
struct CSGetGMPrizeMsg{
	1: struct.PrizeType prizeType
	2: i64 id
	3: i64 param
}

//查询奖励信息
struct CSQueryCommonPrizeMsg{
	1: struct.PrizeFieldInfo prizeFieldInfo
}

struct CSQueryGMActivityMsg{
	
}

struct CSQueryActivityNoticeMsg{
	
}

//使用激活码领奖
struct CSUseActiveCodeMsg{
	1: string code
}

struct CSGetSMSInviteCodeMsg{
	
}

struct CSSaveSMSInviteCodeMsg{
	1: i64 code
	2: i64 mobile
}

struct CSUseSMSInviteCodeMsg{
	1: i64 code
}

struct CSSendSMSValidateCodeMsg{
	1: i64 mobile
}

struct CSGetSMSInvitePrizeMsg{
	1: i64 mobile
	2: string captcharcode
	3: i64 code
}

/** 查询默认彩蛋id */
struct CSQueryDefaultLotteryId{

}

/** 查询可以使用的彩蛋 */
struct CSQueryCanUseLotteryItems{

}

struct CSLotteryMsg{
	1: i32 lotteryItemId
	2: i16 useItemCount
	3: i16 lotteryCount
}

//查看gm活动
struct CSQueryGMActivityInfoMsg{
	1: struct.GMActivityType type
	2: struct.GMActivitySubType subType
}

//查询充值，连登活动信息
struct CSQueryRechargeAndSignInActivityInfoMsg{
	
}


//领取每日竞技活动奖励
struct CSGetGMActivityPrizeMsg{
	1: i16 activityId
}


//取得活动列表
struct CSGetKeyActiveMsg{
}

//兑换钥匙
struct CSExchangeActivityKeyMsg{
	1: i32 id
	2: i32 count
}

struct CSGetActivityPrizeMsg{
	1: struct.GMActivityType type
	2: struct.GMActivitySubType subType
	3: byte index
}

struct CSGetCollectExchangeInfoMsg{
	1: struct.GMActivityType type
	
}


struct CSGetCollectExchangePrizeMsg{
	1: i16 activityId
	2: byte index
	3: i16 count
}

struct CSGetComposeActivityMsg {
	1: byte index
	2: i16  count
	3: byte type
}

struct CSGetComposeActivityDetailMsg {
	1: i16 activityId
	2: byte index
	
}

struct CSComposeActivityVersionMsg{

}

struct CSGetActivityCourseTaskMsg{
	1:i32 courseId
}

struct CSLimitSaleActivityMsg {

}

struct CSLimitSaleActivityItemMsg {
  1:i32 activityId
}


struct CSLimitSaleActivityBuyMsg {
	1:i32 activityId
	2:i32 itemId
	3:i32 count
}

struct CSGetFreeLotteryCountMsg {
	1:struct.LotteryType type
	2:i32 itemId
}

/** 请求首充信息*/
struct CSGetFirstRechargeInfoMsg{
	/** 版本*/
	1:byte version
}
/** 请求获取首充奖励消息*/
struct CSFirstRechargeAwardMsg{

}