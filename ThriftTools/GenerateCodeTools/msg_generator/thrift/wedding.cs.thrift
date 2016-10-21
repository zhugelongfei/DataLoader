include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ��ѯ����̬��Ϣ */
struct CSQueryWeddingNotices{
	/** ��ҳ��Ϣ��ѯ���� */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
}

/** �����ö��Լ��Ļ���̬ */
struct CSReqTopSelfWeddingNotice{

}

/** ����ף���»���� */
struct CSReqWedingBless{
	/** ���ɽ�ɫid */
	1: i64 bridegroomId
	/** �����ɫid */
	2: i64 brideId
}

/** ��ѯ�»������Ϣ */
struct CSQueryNewlyWedsInfo{
	/** ���ɽ�ɫid */
	1: i64 bridegroomId
	/** �����ɫid */
	2: i64 brideId
}

/** ��ѯ���񷿼� */
struct CSQueryWeddingRooms{
	/** ��ҳ��Ϣ��ѯ���� */
	1: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
}

/** ��Ӧ��� */
struct CSAcceptLoverProposal{
	1: i64 loverCharId
	2: bool isAccept
}

/** ��ɻ�����Դ���� */
struct CSFinishLoadWeddingResourceMsg {

}

/** ��ʼ������һ�� */
struct CSNextWeddingStepMsg {
  1: struct.WeddingStep nextWeddingStep;
}

/** �����л */
struct CSWeddingThank {
	/** ÿλ��лϲ�ǵ�λid */
	1: i32 candyBagId
	/** ��л�� */
	2: string thankContent
}

/** ���������̻� */
struct CSReqWedFireworks {
	/** �̻�id */
	1: i32 fireworksId
}