include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求成就进度信息 */
struct CSReqAchieveProcessInfo{
	/** 成就进度信息版本号 */
	1: i32 achieveVersion
}

/** 请求成就详细信息 */
struct CSReqAchieveDetailInfo{
	/** 成就类型EAchieveType */
	1: byte achieveType
	2: i32 achieveDetailVersion
}

/** 领取成就奖励 */
struct CSGetAchievePrize{
	/** 成就id */
	1: i32 achieveId
}

/** 一键领取成就奖励 */
struct CSGetAllAchievePrize{
	/** 成就类型EAchieveType */
	1: byte achieveType
}