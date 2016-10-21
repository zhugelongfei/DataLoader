include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ����̬��Ϣ */
struct SCWeddingNotices{
	/** ����̬��ҳ��Ϣ */
	1: struct.CommonDataPageInfos wedNoticePageInfos
	/** ��ǰ�Լ��Ƿ��л鷿 */
	2: optional bool hasWeddingRoom
}

/** ����̬ף���»���޳ɹ� */
struct SCDynamicWeddingBlessSucc{
	/** ���ɽ�ɫid */
	1: i64 bridegroomId
	/** �����ɫid */
	2: i64 brideId
	/** ��ǰף��ֵ */
	3: i32 blessVal
}

/** �»������Ϣ */
struct SCNewlyWedsInfo{
	/** ���ɽ�ɫid */
	1: i64 bridegroomId
	/** �����ɫid */
	2: i64 brideId
	/** ף��ֵ */
	3: i32 weddingbless
	/** ף��ֵ���� */
	4: i32 weddingblessRank
}

/** ���񷿼���Ϣ */
struct SCWeddingRoomInfos{
	/** ���񷿼��ҳ��Ϣ */
	1: struct.CommonDataPageInfos wedRoomPageInfos
}

/** ������ɹ� */
struct SCReqWeddingSucc{
	/** �鷿id */
	1: i32 roomId
}

/** ������� */
struct SCLoverProposal {
	1: i64 loverCharId
	2: string loverName
}

/** �����ö��Լ��Ļ���̬�ɹ� */
struct SCTopSelfWeddingNoticeSucc{
	/** �ö�ʱ��(/1000) */
	1: i32 topTime
}

/** ��ʼ������һ�� */
struct SCWeddingStepMsg {
	1: struct.WeddingStep nextWeddingStep;
	/** �����������ҽ�ɫid, ����Ϊ�����򻷽ڲŷ��� Ϊ0���Ҳ������ʱ�׸�npc */
	2: optional i64 loveBallReceiveCharId
}

/** �����л�ɹ� */
struct SCWeddingThankSucc{
	1: i32 itemId
	2: i16 itemCount
	3: i64 charId
	/** ִ�е���Ч���� */
	4: list<struct.FuncParam> funcParams
	5: string content
}

/** ����ף���ɹ� */
struct SCWeddingBlessSucc {
    /** ��ǰף��ֵ */
	1: i32 blessVal
	/** ��������� */
	2: string fromCharName
}

/** ������̻� */
struct SCWedFireworks {
	/** �̻�id */
	1: i32 fireworksId
	/** ���̻��ɫ�� */
	2: string charName
	/** �Ҹ�ֵ*/
	3: i32 blessVal
}