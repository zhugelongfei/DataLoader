include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 查看对应vip等级奖励信息 */
struct CSVipLevelPrizeMsg{
    /** vip等级 */
	1: byte vipLvl;
}

/** 领取对应vip等级奖励 */
struct CSGetVipLevelPrizeMsg{
    /** vip等级 */
	1: byte vipLvl;
}

