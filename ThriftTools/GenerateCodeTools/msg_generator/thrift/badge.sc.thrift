include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ��������Ϣ */
struct SCBadgeBagInfo{
	/** ���������Ϣ */
	1: list<struct.BadgeInfo> putOnBadgeInfos
	/** �ղػ�����Ϣ */ 
	2: list<struct.BadgeInfo> savedBadgeInfos
}

/** ���»�����Ϣ */
struct SCUpdateBadgeInfo{
	/** ���������Ϣ */
	1: optional list<struct.BadgeInfo> putOnBadgeInfos
	/** �ղػ�����Ϣ */ 
	2: optional list<struct.BadgeInfo> savedBadgeInfos
}

/** ���ӻ�����Ϣ */
struct SCAddBadgeInfo{
	/** ���ӻ�����Ϣ */
	1: list<struct.BadgeInfo> badgeInfos
}

/** ���½�����Ϣ */
struct SCBadgeUnlockInfo{
	/** ������λ */
	1: i16 position
	/** ������ʾ */
	2: i32 unlockMsgId
}

/** �����ڹ㲥���¸�����Ϣ */
struct SCBroadcastBadgeUpdateInfo{
	/** ������λ */
	1: i16 position
	/** ����id��0��ʾж�� */
	2: i32 badgeId
	/** ���µĽ�ɫid */
	3: i64 charId
}

