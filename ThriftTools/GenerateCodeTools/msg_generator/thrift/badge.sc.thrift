include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 徽章栏信息 */
struct SCBadgeBagInfo{
	/** 佩戴徽章信息 */
	1: list<struct.BadgeInfo> putOnBadgeInfos
	/** 收藏徽章信息 */ 
	2: list<struct.BadgeInfo> savedBadgeInfos
}

/** 更新徽章信息 */
struct SCUpdateBadgeInfo{
	/** 佩戴徽章信息 */
	1: optional list<struct.BadgeInfo> putOnBadgeInfos
	/** 收藏徽章信息 */ 
	2: optional list<struct.BadgeInfo> savedBadgeInfos
}

/** 增加徽章信息 */
struct SCAddBadgeInfo{
	/** 增加徽章信息 */
	1: list<struct.BadgeInfo> badgeInfos
}

/** 徽章解锁信息 */
struct SCBadgeUnlockInfo{
	/** 徽章栏位 */
	1: i16 position
	/** 解锁提示 */
	2: i32 unlockMsgId
}

/** 房间内广播徽章更新信息 */
struct SCBroadcastBadgeUpdateInfo{
	/** 徽章栏位 */
	1: i16 position
	/** 徽章id，0表示卸下 */
	2: i32 badgeId
	/** 更新的角色id */
	3: i64 charId
}

