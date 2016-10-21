include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** Today has not get login award. */
struct SCNewLoginAwardMsg{
	1: byte whichDay
}

struct SCGetLoginAwardInfoResultMsg{
	1: byte continueLoginDays
	2: i16 awardFlag
}

struct SCGetLoginAwardResultMsg{
	1: byte whichDay
}

struct SCGetOfflineCouponResultMsg{
	1: i32 coupon
}

struct SCSendFeedBackResultMsg{

}
//GM补偿列表
struct SCNewGMPrizesMsg{
	1: list<struct.PrizeFieldInfo> prizeFieldInfos
}

struct SCUserPrizeInfosMsg{
	1: struct.PrizeFieldInfo prizeFieldInfos
	2: struct.UserPrizeInfo prize
}

struct SCGMActivityListMsg{
	1: struct.RechargeAndSignInfo activity
}

struct SCGetGMActivityPrizeResultMsg{
	1: i16 activityId
}

struct SCActivityNoticeMsg{
	1: string title
	2: string content
	3: i64 version
	4: list<struct.GameNotice> notices
}

struct SCActiveUseCodeResultMsg{
	1: bool result
}

struct SCGetSMSInviteCodeMsg{
	1: i64 code
}

struct SCUseSMSInviteCodeMsg{
	1: i64 mobile
}

struct SCLotteryResultMsg{
	1: struct.PrizeInfo prizeInfos
	2: list<struct.ConstellationLotteryItem> itemList
}

struct SCGetGMActivityInfoMsg{
	1: list<struct.GMActivityInfo> gmActivityInfos
}

struct SCGetGMActivityPrizeMsg{
	1: bool result
}

struct SCNewAwardNotificationMsg{
	1: byte type
}

//取得活动列表返回
struct SCGetKeyActiveMsg{
	1: list<struct.ActiveKeyData> activeKeyList
}

struct SCActivityUpdateMsg{
	1: list<struct.GMActivityType> typeList
}


struct SCCollectExcharngeActivityInfoMsg{
	1: struct.CollectExchangeInfo activitys
}

struct SCGetCollectExchangePrizeResultMsg{
	1: i16 activityId
	2: byte index
	3: bool result
	4: i32 exchangedCount
	5: i32 exchangeTotalCount
	6: i32 dayExchangedCount
	7: i32 datExchangeTotalCount
}


struct SCComposeActivityVesionMsg {
  1:i32 activityVersion
  2:i32 activityCount 
}

struct SCComposeActivityMsg {
    1:list<struct.ComposeActivity> activityList
    2:i16 activityCount
	3:i32 activityVersion
	4:byte index 
	5:i16 count
}

struct SCComposeActivityDetailMsg {
	1:i16 activityId
    //2:list<struct.ComposeActivityDetail> composeAcitivityDetailInfos
	2:struct.ComposeActivityDetail detailInfo
}

struct SCGetActivityCourseTaskResultMsg{
	1:i32 courseId
	2:byte result
}


struct SCLimitSaleActivityMsg {
   1:list<struct.LimitSaleActivity> limitSaleActivity
}

struct SCLimitSaleActivityItemMsg {
   1:list<struct.LimitSaleItem> limitSaleItems
}


struct SCLimitSaleActivityBuyMsg {
	1:byte status
}

struct SCGetFreeLotteryCountMsg{
	1:struct.LotteryType type
	2:i32 itemId
	3:i32 count
}

struct SCStartFreeLotteryMsg{
	1:struct.LotteryType type
	2:i32 itemId
	3:i32 count
}

struct TimingLottery{
	1:struct.LotteryType type
	2:i32 maleItem
	3:i32 femaleItem
	4:string startDate
	5:string endDate
	6:list<struct.LimitSaleTime> timeRange
}

struct SCGetTimingLotteryMsg{
	1:list<TimingLottery> timingLotterys
}

/** 彩蛋信息 */
struct LotteryItemInfo{
	1: i32 itemId
	2: optional byte currencyType
	3: optional i32 cost
}

/** 可以使用的彩蛋信息 */
struct SCCanUseLotteryItems{
	1: list<LotteryItemInfo> lotteryInfos
}

/** 默认彩蛋id信息 */
struct SCDefaultLotteryId{
	1: LotteryItemInfo defaultItemInfo
}
/**首充返回消息 */
struct SCFirstRechargeInfo{
	/**领取状态 true:领取 false:未领取 */
	1: struct.FirstRechargeAwardState state
	/** 首充奖励*/
	2: struct.PrizeInfo prizeInfo
	/** 版本号*/
	3: byte version
	/** 活动信息描述*/
	4: string desc
	/**特效ID */
	5: i32 specialId

}
/** 领取首充返回消息*/
struct SCGetFirstRechargePrizeSucc{
	/** 领取状态*/
	1: struct.FirstRechargeAwardState state
	/** 是否是领取奖励*/
	2: bool isPrize
}