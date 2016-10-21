include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 训练职业数据 */
struct TrainOccupationData{
    /** 当前等级 */
	1: i32 level
	/** 当前经验值 */
	2: i32 exp
}

/** 训练信息 */
struct SCTrainInfo{
	/** 更新客户端版本号 */
	1: i32 version
    /** 当前星光等级 */
	2: i16 starLvl
    /** 今天剩余训练次数 */
	3: i16 todayLeftTrainCount
	/** 今天购买训练次数 */
	4: i16 todayBuyTrainCount
	/** 各职业ETrainOccupation等级经验数据 */
	5: map<byte, TrainOccupationData> occuptionDatas
}

/** 更新训练次数信息 */
struct SCUpdateTrainCountInfo{
    /** 今天剩余训练次数 */
	1: optional i16 todayLeftTrainCount
	/** 今天购买训练次数 */
	2: optional i16 todayBuyTrainCount
}

/** 训练结果 */
struct SCTrainResultMsg{
    /** 职业ETrainOccupation */
    1: byte occupation
    /** 当前等级 */
	2: i32 level
	/** 增加经验 */
	3: i32 occuptionAddExp
	/** 暴击倍数(需要/100) */
	4: optional i32 critVal
	/** 当前星光等级 */
	5: optional i16 starLvl
}