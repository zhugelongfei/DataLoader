include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** �������Ϣ */
struct ActivityTypeInfo {
    1:i32 activityId
	/** �ͼ�� */
	2:string activityIcon
	/** �Ƿ��л��������ȡ */
	3: optional bool hasActivityPrize
	/** ���ܰ�ť 0������Ҫ��ʾ���ⰴť 1����ʾ��ֵ��ť*/
	4: byte funcButton
}

/** �Ŀ��״̬ */
enum ActivityTargetStatus {
	/** δ��ʼ */
    STATUS_NOT_START
	/** ������ */
	STATUS_DOING
	/** ����ȡ */
	STATUS_CAN_GET_PRIZE
	/** ����� */
	STATUS_PRIZED
	/** �ѽ��� */
	STATUS_OVER
}

/** �Ŀ����Ϣ */
struct ActivityTargetInfo {
	/** Ŀ��id */
	1:i32 targetId
    /** Ŀ�����, ������ֵ��Ϊ�ָ����� */
    2:optional string targetTitle
	/** Ŀ����Ϣ */
    3:optional string targetInfo
	/** Ŀ��ͼ�� */
	4:optional string icon
	/** ��ǰ���� */
	5: optional i64 curNum
	/** ������ */
	6: optional i64 maxNum
	/** �Ŀ��״̬ */
	7: optional ActivityTargetStatus targetStatus
	/** ���� */
	8: optional struct.PrizeInfo prizeInfos
}

/** ����� */
struct ActivityDetailInfo {
	1:i32 activityId
	/** ���� */
	2:string activityTitle
	/** ʱ������ */
	3:string timeDesc
	/** ����˵�� */
	4:string content
	/** ui���� */
	5:i32 uiType
	/** ʹ������UIPackage��ʾ�Ļ */
	6:optional string uiPackage
	/** �Ŀ���б���Ϣ */
	7:list<ActivityTargetInfo> targetInfos
}

/** ��б� */
struct SCActivityListMsg{
	/** ��汾�� */
	1:i32 activityVersion
	/** ��б���Ϣ */
	2: optional list<ActivityTypeInfo> activityTypeInfos
	/** ��һ������ȡ��������� */
	3: optional ActivityDetailInfo firstActivityInfo
}

/** ����� */
struct SCActivityDetailMsg{
	/** ����� */
	1: ActivityDetailInfo activityInfo
}

/** �ɹ���ȡ�Ŀ�꽱�� */
struct SCGetActivityTargetPrizeSucc{
	1:i32 activityId
	/** Ŀ��id */
	2:i32 targetId
}

/** �Ŀ�������Ϣ */
struct ActivityTargetProcessInfo {
	/** Ŀ��id */
	1:i32 targetId
	/** ��ǰ���� */
	2:i64 curNum
	/** �Ƿ����ȡ���� */
	3: optional bool canGetPrize
}

/** ���»Ŀ�������Ϣ */
struct SCUpdateActivityProcessInfos{
	/** �id��Ӧ�������Ϣ */
	1: map<i32, list<ActivityTargetProcessInfo>> updateInfos
}