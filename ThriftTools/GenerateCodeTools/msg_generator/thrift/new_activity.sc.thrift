include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 活动类型信息 */
struct ActivityTypeInfo {
    1:i32 activityId
	/** 活动图标 */
	2:string activityIcon
	/** 是否有活动奖励可领取 */
	3: optional bool hasActivityPrize
	/** 功能按钮 0：不需要显示额外按钮 1：显示充值按钮*/
	4: byte funcButton
}

/** 活动目标状态 */
enum ActivityTargetStatus {
	/** 未开始 */
    STATUS_NOT_START
	/** 进行中 */
	STATUS_DOING
	/** 可领取 */
	STATUS_CAN_GET_PRIZE
	/** 已完成 */
	STATUS_PRIZED
	/** 已结束 */
	STATUS_OVER
}

/** 活动目标信息 */
struct ActivityTargetInfo {
	/** 目标id */
	1:i32 targetId
    /** 目标标题, 有设置值则为分隔标题 */
    2:optional string targetTitle
	/** 目标信息 */
    3:optional string targetInfo
	/** 目标图标 */
	4:optional string icon
	/** 当前进度 */
	5: optional i64 curNum
	/** 最大进度 */
	6: optional i64 maxNum
	/** 活动目标状态 */
	7: optional ActivityTargetStatus targetStatus
	/** 奖励 */
	8: optional struct.PrizeInfo prizeInfos
}

/** 活动详情 */
struct ActivityDetailInfo {
	1:i32 activityId
	/** 标题 */
	2:string activityTitle
	/** 时间描述 */
	3:string timeDesc
	/** 内容说明 */
	4:string content
	/** ui类型 */
	5:i32 uiType
	/** 使用其他UIPackage显示的活动 */
	6:optional string uiPackage
	/** 活动目标列表信息 */
	7:list<ActivityTargetInfo> targetInfos
}

/** 活动列表 */
struct SCActivityListMsg{
	/** 活动版本号 */
	1:i32 activityVersion
	/** 活动列表信息 */
	2: optional list<ActivityTypeInfo> activityTypeInfos
	/** 第一个可领取奖励活动详情 */
	3: optional ActivityDetailInfo firstActivityInfo
}

/** 活动详情 */
struct SCActivityDetailMsg{
	/** 活动详情 */
	1: ActivityDetailInfo activityInfo
}

/** 成功领取活动目标奖励 */
struct SCGetActivityTargetPrizeSucc{
	1:i32 activityId
	/** 目标id */
	2:i32 targetId
}

/** 活动目标进度信息 */
struct ActivityTargetProcessInfo {
	/** 目标id */
	1:i32 targetId
	/** 当前进度 */
	2:i64 curNum
	/** 是否可领取奖励 */
	3: optional bool canGetPrize
}

/** 更新活动目标进度信息 */
struct SCUpdateActivityProcessInfos{
	/** 活动id对应标进度信息 */
	1: map<i32, list<ActivityTargetProcessInfo>> updateInfos
}