include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����Ѳ���½���Ϣ */
struct CSReqTourChapterInfoMsg{
	/** �½�id */
	1: list<i16> chapterIds
	/** ��ǰ�½�id */
	2: i16 curChapterId
}

/** ����Ѳ�ݹؿ���ϸ��Ϣ */
struct CSReqTourRaidDetailMsg{
	/** �½�id */
	1: i16 chapterId
	/** �ؿ�id */
	2: i16 raidId
}

/** ����Ѳ�ݹؿ���Ϣ */
struct CSUpdateRoomTourRaidMsg{
	/** Ѳ������ 0-��ͨ 1-���� 2-���ֲ� */
	1: byte tourRaidType
	/** �ؿ�id */
	2: i16 raidId
}

/** ��ѯѲ����������״̬��Ϣ */
struct CSGetTourStarPrizeStatus{
    /** ����������Ϣ�汾�ţ� Ĭ��0 */
	1: i32 version
	/** �½�id */
	2: i16 chapterId
}

/** ��ȡѲ���������� */
struct CSGetTourStarPrizeMsg{
	/** ��ȡ���������� */
	1: i32 stars
	/** �½�id */
	2: i16 chapterId
}

/** Ѳ�ݲ������� */
struct CSStepInTourTrap{
	/** �ͷŵļ���id */
	1: i32 skillId
}

/** ������Ѳ�ݴ��� */
struct CSReqBuyTourTimes{
}