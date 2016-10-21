include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct CharAndPopularityReward{
	1: i32 level
	/** 奖励 */
	2: optional struct.PrizeInfo prizeInfos
	3: i32 errid
}

struct SCCharAndPopularityRewardsMsg{
	1: i32 type
	2: list<CharAndPopularityReward> rewards
}