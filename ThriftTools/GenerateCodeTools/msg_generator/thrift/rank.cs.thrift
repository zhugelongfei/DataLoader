include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ��ѯ���а��һ����Ϣ */
struct CSQueryTopOneRanksMsg{
    /** ���а����� */
	1: list<i16> rankTypes
	/** �ͻ��˼�¼������� */
	2: byte panelId
}

/** ��ѯ���а���Ϣ */
struct CSQueryRankListMsg{
	1: i16 rankType
	2: i16 startRank
	/** limit 50 */
	3: i16 endRank
	4: optional struct.RankMusicQueryParam muiscQueryParam
}

/** Ĥ�����а��ϰ���� */
struct CSWorshipOnRankMsg{
    /** �ϰ����� */
	1: i16 rankType
    /** �ϰ��һ����ҽ�ɫid */
	2: i64 onRankFirstPlayerId
	/** �ϰ�ڶ�����ҽ�ɫid��˫�˰񵥣� */
	3: optional i64 onRankSecondPlayerId
}

/** ������Ĥ���ϰ������Ϣ */
struct CSQueryWorshipOnRankInfos{
}

/** ��ѯ�ϰ����Ϣ */
struct CSQueryOnRankInfoMsg{
	1: i64 charId
}