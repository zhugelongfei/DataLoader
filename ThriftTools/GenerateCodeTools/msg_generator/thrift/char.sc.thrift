include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

// �����½�ɫ��Ϣ
struct SCCreateNewCharMsg{
	
}

struct SCCreateCharResultMsg{
	/** 0-fail 1-succ */
	1: byte result
	/** 0-name duplicate 1-other reason */
	2: byte errorCode
}

struct SCNewCharRandNameMsg{
	/** new char name */
	1: string name
}

struct SCUpdateCharPropertyMsg{
	1: optional i32 ib
	2: optional i32 gold
	3: optional i32 point
	4: optional i64 popularity
	5: optional i32 exp
	6: optional i32 cup
	7: optional i32 praise
	8: optional i32 freeIb
	9: optional list<byte> byteCounterList
	10: optional list<i16> shortCounterList
	11: optional list<i32> intCounterList
	12: optional i32 rechargeIb
	13: optional list<i32> intDayLoopCounterList
	14: optional binary flags
	15: optional i32 activeVal
	16: optional byte activeLevel
	17: optional list<i16> shortDayLoopCounterList
	18: optional list<byte> byteDayLoopCounterList
	19: optional i32 largesse
	20: optional i32 charm
	22: optional byte vipLevel
	23: optional i32 totalRecharge
	24: optional i16 tagId
	25: optional i32 nonPointIb
	26: optional string bindEmail
	27: optional i32 friendType
	28: optional i32 skinColor
	29: optional i32 starLights
	31: optional i16 dailyLeftImproviseCount
	32: optional i32 improviseCoupon
	33: optional i32 starLightLvlPrizeCoupon
	/** ����������һ������ֵ���� */
	34: optional byte incTouchLoveTimes
	/** ��ǰ����ֵ */
	35: optional i32 loverVal
	36: optional i32 announceIb
	37: optional i32 guildGold
	/** ��ǰʱ��ֵ */
	38: optional i32 fashionVal
}

/** ������ui״̬ */
enum ActivityUIStatus {
    /** �޽��� */
    NO_PRIZE
	/** �н����� ��Ҫ�Զ��� */
	PRIZE_AND_NEED_AUTO_OPEN
	/** �н����� �����Զ��� */
	PRIZE_AND_CANT_AUTO_OPEN
}

struct SCUserInfoMsg{
	1: byte sex
	2: i64 charId
	3: i64 accountId
	4: string	name
	5: i32 ib
	6: i32 gold
	7: string headIconId
	8: byte bodyAdjVal
	9: byte modelId
	10: byte vipLevel
	11: i32 point
	12: optional binary flags
	13: struct.Constellation constellation
	14: struct.LuckDay luckDay
	15: optional list<byte> byteCounterList
	16: optional list<i16> shortCounterList
	17: optional list<i32> intCounterList
	18: i16 level
	19: i32 exp
	20: byte stature
	21: string cookie
	22: i16 popularityLevel
	23: i64 popularityTotal
	24: bool newClientVersion
	25: bool tempUser
	26: i32 cup
	29: i32 freeIb
	30: i32 rechargeIb
	31: optional list<i32> intDayLoopCounterList
	32: i32 vipDiamond
	//33: i32 vipExpireTime
	34: optional list<i16> shortDayLoopCounterList
	35: optional list<byte> byteDayLoopCounterList
	36: i32 activeVal
	37: byte activeLevel
	40: i32 totalRecharge
	41: i16 tagId
	42: i32 awordVersion
	43: i64 guildId;
	44: string guildName
	45: i32 mailPageSize
	46: i32 nonPointIb
	47: string bindEmail
	48: i32 friendType
	49: i32 skinColor
	50: i16 starLightLevel
	51: i32 starLights
	/** ��ҵ�ǰ��Ϸ��id */
	52: string gameServerId
	/** ��ҵ�ǰ��Ϸ���� */
	53: string gameServerName
	/** ����Ļ��� */
	54: list<struct.BadgeInfo> putOnBadges
	/** ʹ���е�ʱ��id, key:style val:id */
	55: map<byte, i32> usedFashionIds
	/** ����ֵ*/
	56: i32 largesse
	/** ����ֵ*/
	57: i32 charm
	/** �Ƿ��Ѿ�ǩ�� */
	58: bool hasSign
	/** ����ְλ */
	59: struct.GuildDegree guildDegree
	/** �����״̬ */
	60: optional ActivityUIStatus activityUIStatus
}

struct SCClickMoveMsg{
    1: i64 charId
	2: double startX
	3: double startY
	4: double startZ
	5: double endX
	6: double endY
	7: double endZ	
}

struct SCStatureModifyMsg{
	1: byte stature
}

struct SCPopularityLevelUpMsg{
	1: i16 sourceLevel
	2: i16 currentLevel
}

struct SCLevelUpMsg{
	1: i16 sourceLevel
	2: i16 currentLevel
}

struct SCBindUserNameMsg{
	1: string name
}
struct SCActiveLevelUpMsg{
	1: byte sourceLevel
	2: byte currentLevel
}

struct SCAppStoreRateMsg{
}

/** ��ȡ����������� */
struct SCGetPopLevelPrizeResult{
	1: optional i32 errorId;
	/** ���� */
	2: optional struct.PrizeInfo prizeInfos
}

/** ����¼�֪ͨ���� */
enum PlayerEventNoticeType {
	/** ������������� */
	MAIN_TASK_FINISH
	 /** �ճ���������� */
	DAILY_TASK_FINISH
	 /** ������������ */
	RAND_TASK_FINISH
	 /** �ɾ������ */
	 ACHIEVE_FINISH
	 /** ���ʼ� */
	 NEW_MAIL
	 /** ��֪ͨ */
	 NEW_NOTIFICATION
}
 
/** ��������¼�֪ͨ */
struct SCUpdatePlayerEventNotice{
    /** �¼�֪ͨ <PlayerEventNoticeType, ����> */
	1: map<byte, i16> eventNoticeInfos
}

/** �����ȼ�����״̬ */
struct SCPopLevelPrizedStatus{
    /** ���콱�ȼ� */
	1: set<byte> prizedLvls
}