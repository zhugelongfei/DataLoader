include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求徽章栏信息 */
struct CSReqBadgeBagInfo{

}

/** 请求徽章解锁信息 */
struct CSReqBadgeUnlockInfo{
	/** 徽章栏位 */
	1: i16 position
}

/** 卸下徽章 */
struct CSPutOffBadge{
	/** 徽章栏位 */
	1: i16 position
}

/** 穿上徽章 */
struct CSPutOnBadge{
	/** 徽章栏位 */
	1: list<i16> positions
}