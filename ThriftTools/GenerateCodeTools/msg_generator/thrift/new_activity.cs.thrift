include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求活动详情 */
struct CSGetActivityDetailMsg{
	1:i32 activityId
}

/** 请求活动列表 */
struct CSGetActivityListMsg{
	/** 活动版本号 */
	1:i32 activityVersion
}

/** 领取活动目标奖励 */
struct CSGetActivityTargetPrizeMsg{
	/** 活动版本号 */
	1:i32 activityVersion
	2:i32 activityId
	/** 目标id */
	3:i32 targetId
}

