include "struct.thrift"
include "course.sc.thrift"
namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** �ɾͽ�����Ϣ */
struct AchieveProcessInfo{
	/** �ɾ�����EAchieveType */
	1: byte achieveType
	/** �ɾͽ���(0-10000) */
	2: i16 processRate
	3: bool hasFinishAchieve
}

/** �ɾͽ�����Ϣ */
struct SCAchieveProcessInfo{
	1: list<AchieveProcessInfo> achieveProcessInfos
	2: i32 achieveVersion
}

/** �ɾ���ϸ��Ϣ */
struct AchieveDetailInfo{
	/** �ɾ�id */
	1: i32 achieveId
	/** ��ǰ���� */
	2: i64 curNum
	/** ������ */
	3: i64 maxNum
	/** �Ƿ��Ѿ���ȡ������ */
	4: bool hasGetPrized
}

/** �ɾ���ϸ��Ϣ */
struct SCAchieveDetailInfos{
	/** �ɾ�����EAchieveType */
	1: byte achieveType
	/** �ɾ���ϸ��Ϣ�б� */
	2: list<AchieveDetailInfo> achieveDetailInfos
	3: i32 achieveDetailVersion
}

/** ���³ɾ���ϸ��Ϣ */
struct SCUpdateAchieveDetailInfos{
	/** �ɾ�id��Ӧ������Ϣ */
	1: map<i32, AchieveDetailInfo> updateInfos
	2: SCAchieveProcessInfo achieveProcessInfo
}

/** ���³ɾ��콱״̬ */
struct SCUpdateAchievePrizeStatus{

}
