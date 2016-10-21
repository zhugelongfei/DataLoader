include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ���а��һ����Ϣ */
struct SCTopOneRanksMsg{
    /** ���а����� - �ϰ������Ϣ */
	1: map<i16, struct.RankInfo> topOneRankInfos
	/** ��Ч��ֹʱ�䣨��1970.1.1��ʼ�������� */
	2: i32 validTime
	/** �ͻ��˼�¼������� */
	3: byte panelId
}

/** ���а���Ϣ */
struct SCRankListMsg{
	1: i16 rankType
	2: list<struct.RankInfo> rankInfoList
	3: optional i32 selfRank
	4: optional i64 selfScore
	5: i32 startRank
	6: i32 endRank
	7: i32 rankCount
	8: optional struct.RankMusicQueryParam muiscQueryParam
	/** ��Ч��ֹʱ�䣨��1970.1.1��ʼ�������� */
	9: i32 validTime
}

/** �ɹ�Ĥ�����а��ϰ���� */
struct SCWorshipOnRankSucc{
    /** �ϰ��һ����ҽ�ɫid */
	1: i64 onRankFirstPlayerId
	/** �ϰ�ڶ�����ҽ�ɫid(˫�˰�) */
	2: optional i64 onRankSecondPlayerId
}

/** ˫�˰������Ϣ */
struct DoubleRankPlayInfo{
    /** �ϰ��һ����ҽ�ɫid */
	1: i64 onRankFirstPlayerId
	/** �ϰ�ڶ�����ҽ�ɫid */
	2: i64 onRankSecondPlayerId
}

/** ��Ĥ���ϰ������Ϣ */
struct SCWorshipOnRankInfos{
    /** ���˰�Ĥ�ݹ�����ҽ�ɫid */
	1: list<i64> singleRankPlayerIds
	/** ˫�˰�Ĥ�ݹ�����ҽ�ɫid */
	2: list<DoubleRankPlayInfo> doubleRankPlayerIds
	/** ��Ч��ֹʱ�䣨��1970.1.1��ʼ�������� */
	3: i32 validTime
}

/** �ϰ���Ϣ*/
struct OnRankInfo {
    /** ����֮��������δ�ϰ�Ϊ0�� ��ͬ */
    1: i16 todayRank
	/** �ܰ�����*/
	2: i16 weekRank
	/** �ܰ�����*/
	3: i16 totalRank
}

/** �����а��������Ϣ */
struct SCOnRankInfoMsg{
	1: i64 charId
	/** �ϰ���Ϣ<���а�����ERankingType��������Ϣ> */
	2: optional map<byte, OnRankInfo> onRankInfos
}