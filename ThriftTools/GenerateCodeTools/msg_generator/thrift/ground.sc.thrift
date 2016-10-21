include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** �㳡������Ϣ */
struct SCGroundRoomInfos{
	/** 0-ȫ�� 1-���� */
	1: byte queryType
	/** �㳡��ҳ��Ϣ */
	2: struct.CommonDataPageInfos groundRoomPageInfos
}

/** ��Ӧid�Ĺ㳡��Ϣ */
struct SCQueryGroundRoomByIdsResponse{
	/** �����Ӧid����Ϣ��Ӧ */
	1: struct.CommonDataQueryByIdsResponse queryByIdsResponse
}

/** ������ҹ㳡����״̬ */
struct SCUpdateGroundArea{
	1: i64 charId
	/** ����GroundPlayerStatus */
	2: byte groundStatus
	/** �µ����� */
	3: double posX
	4: double posY
	5: double posZ
}

/** ����㳡��Ϊ״̬ */
struct SCEnterGroundActionStatus{
	1: i64 charId
	/** ��Ϊ״̬GroundActionStatus */
	2: byte actionStatus
	/** �㳡����id */
	3: optional i32 objId
	/** �㳡�������� */
	4: optional i32 objParam
}

/** �㳡��������������Ϣ */
struct GroundRoomAction
{
	/** ��������id */
	1: byte id;
	/** �Ƿ���� */
	2: bool isOpen;
}

/** ���¹㳡��������������Ϣ */
struct SCUpdateGroundActionInfo{
	/** ���ŵĹ㳡����������Ϣ */
	1: list<GroundRoomAction> actionOpenInfos
}

/** ������Ȫ�㳡������Ϣ */
struct SCUpdateSpringReward{
	/** �ܹ���þ��� */
	1: optional i32 rewardExp
	/** �ܹ��������ֵ */
	2: optional i32 rewardSweet
	/** �ܹ���ý�� */
	3: optional i32 rewardCoin
}

/** ˢ����ȪȪ�� */
struct SCRefreshSpring{
	/** Ȫ��id */
	1: i32 springId
	/** 0-���� 1-��ʾ */
	2: byte showOrHide
}

/** �������ȭ��Ϸ */
struct SCBeInvitedFingerGuess{
	1: i64 srcCharId
}

/** ��ʼ��ȭ��Ϸ */
struct SCStartFingerGuess{
    /** �����߽�ɫid */
    1: i64 inviterCharId
	/** �������߽�ɫid */
    2: i64 beInvitedCharId
}

/** ��ȭ��Ϸ��ɣ��㲥�����������ˣ� */
struct SCFingerGuessFinish{
	/** �����߽�ɫid */
    1: i64 inviterCharId
	/** �����߳�ȭ0-ʯͷ 1-���� 2-�� */
    2: byte inviterChoice
	/** �������߽�ɫid */
    3: i64 beInvitedCharId
	/** �������߳�ȭ0-ʯͷ 1-���� 2-�� */
    4: byte beInvitedChoice
	/** ����id */
	5: optional i32 actionId	
}

/** ��ȭ��Ϸ�������Ϸ˫�����գ� */
struct SCFingerGuessResult{
	/** 0-�� 1-Ӯ 2-ƽ�� */
	1: byte result
	/** �������� */
    2: i32 awardExp
	/** ɫ���浽�� 0 - 5 */
	3: optional byte actionIndex	
}

/** ���¹㳡�赸������ֵ */
struct SCUpdateGroundHotBar{
    1: i32 hotVal
}

/** �㳡�赸��ʹ�����ĳɹ� */
struct SCUseChampagneSucc {
    1: i64 usedCharId
    /** ����id */
    2: i32 ChampagneId
    /** ���µ�����ֵ */
    3: i32 hotVal
}

/** ��Ȫ�㳡���������ɹ� */
struct SCReqUnlockActionSucc{
    /** ����id */
    1: i32 actionId
}

/** ����Ȫʣ��ʱ����Ϣ */
struct SCSpringLeftTimes{
	/** ���Ӿ���ʣ��ʱ�� */
	1: optional i32 expLeftTime
	/** ��������ֵʣ��ʱ�� */
	2: optional i32 sweetLeftTime
	/** �赸�����ӽ��ʣ��ʱ�� */
	3: optional i32 coinLeftTime
}

/** ����������Ȫ״̬ */
struct SCUpdateSpringLover{
	/** ����״̬ */
	1: struct.LoverSpringStatus status
	/** ʣ������ֵ�ӳ�ʱ�� */
	2: optional i32 sweetLeftTime
}

/** ���̻�ɹ� */
struct SCLightFireWorksSucc{
	/** �̻�����id */
	1: i32 fireworkItemId
	/**������Ч-���̻�ص� */
	2: byte location
	/** ������ */
	3: i64 sender;
}