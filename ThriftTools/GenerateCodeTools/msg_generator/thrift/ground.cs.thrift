include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ��ѯ�㳡���� */
struct CSQueryGroundRooms{
	/** 0-ȫ�� 1-���� */
	1: byte queryType
	/** ������Ϣ��ѯ���� */
	2: struct.CommonDataPageInfoQueryParam pageInfoQueryParam
}

/** �����Ӧid�Ĺ㳡��Ϣ */
struct CSQueryGroundRoomByIdsMsg{
	/** �����Ӧid����Ϣ���� */
	1: struct.CommonDataQueryByIdsParam queryByIdsParam
}

/** �л��㳡���� */
struct CSChangeGroundArea{
	/** Ŀ������GroundPlayerStatus */
	1: byte targetGroundStatus
	/** �µ����� */
	2: double posX
	3: double posY
	4: double posZ
}

/** ����㳡��Ϊ״̬ */
struct CSEnterGroundActionStatus{
	/** ��Ϊ״̬GroundActionStatus */
	1: byte actionStatus
	/** �㳡����id */
	2: optional i32 objId
	/** �㳡�������� */
	3: optional i32 objParam
}

/** ����㳡��������������Ϣ */
struct CSReqGroundActionOpenInfo{

}

/** �����ȭ��Ϸ */
struct CSInviteFingerGuess{
	1: i64 targetCharId
}

/** ��Ӧ��ȭ���� */
struct CSRespInviteFingerGuess{
	1: i64 srcCharId
	2: bool isAgreed
}

/** ��ȭ��Ϸ���� */
struct CSFingerGuessChoice{
    /** 0-ʯͷ 1-���� 2-�� */
    1: byte choice
}

/** �㳡�赸��ʹ������ */
struct CSUseChampagne{
    /** ����id */
    1: i32 ChampagneId
}

/** �����������*/
struct CSReqUnlockAction{
    /** ����ID */
    1: i32 actionId
}

/** ������̻� */
struct CSReqLightFireWorks{
	/** �̻�����λ�� */
	1: byte location
	/** �̻����� */
	2: i32 itemId
}
