include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����ɾͽ�����Ϣ */
struct CSReqAchieveProcessInfo{
	/** �ɾͽ�����Ϣ�汾�� */
	1: i32 achieveVersion
}

/** ����ɾ���ϸ��Ϣ */
struct CSReqAchieveDetailInfo{
	/** �ɾ�����EAchieveType */
	1: byte achieveType
	2: i32 achieveDetailVersion
}

/** ��ȡ�ɾͽ��� */
struct CSGetAchievePrize{
	/** �ɾ�id */
	1: i32 achieveId
}

/** һ����ȡ�ɾͽ��� */
struct CSGetAllAchievePrize{
	/** �ɾ�����EAchieveType */
	1: byte achieveType
}