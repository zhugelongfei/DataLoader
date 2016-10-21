include "struct.thrift"
include "course.sc.thrift"
namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 成就进度信息 */
struct AchieveProcessInfo{
	/** 成就类型EAchieveType */
	1: byte achieveType
	/** 成就进度(0-10000) */
	2: i16 processRate
	3: bool hasFinishAchieve
}

/** 成就进度信息 */
struct SCAchieveProcessInfo{
	1: list<AchieveProcessInfo> achieveProcessInfos
	2: i32 achieveVersion
}

/** 成就详细信息 */
struct AchieveDetailInfo{
	/** 成就id */
	1: i32 achieveId
	/** 当前进度 */
	2: i64 curNum
	/** 最大进度 */
	3: i64 maxNum
	/** 是否已经领取过奖励 */
	4: bool hasGetPrized
}

/** 成就详细信息 */
struct SCAchieveDetailInfos{
	/** 成就类型EAchieveType */
	1: byte achieveType
	/** 成就详细信息列表 */
	2: list<AchieveDetailInfo> achieveDetailInfos
	3: i32 achieveDetailVersion
}

/** 更新成就详细信息 */
struct SCUpdateAchieveDetailInfos{
	/** 成就id对应更新信息 */
	1: map<i32, AchieveDetailInfo> updateInfos
	2: SCAchieveProcessInfo achieveProcessInfo
}

/** 更新成就领奖状态 */
struct SCUpdateAchievePrizeStatus{

}
