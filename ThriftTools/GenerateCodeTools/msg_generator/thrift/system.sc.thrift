include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

//������ͨ�÷�����Ϣ��������
struct SCSystemInfoMsg{
	1: i32 tipId
	2: list<string> argv
}

//ping��Ӧ
struct SCServerPingMsg{

}

/** ���ž�������� */
enum PlayStoryType{
    /** ���� */
	Task
	/** Ѳ�� */
	Tour
}

/** ���ž��� */
struct SCPlayStoryMsg{
	1: i32 storyId
	2: PlayStoryType playType
	/** �����귵��ui id */
	3: optional i32 returnUI
}

struct SCGameNoticeMsg{
	1: string noticeInfo
}


struct SCServerInfoMsg{
	1: i16 maleNum
	2: i16 femaleNum
	3: i32 activitySwitch
	4: i16 marketSwitch
	5: i64 systemSwitch
	6: byte voiceServerId
	7: i32 serverTime
	8: i64 rankSwitch
} 


struct SCOperResultMsg{
	1: byte operType
	/** 0-fail 1-succ */
	2: byte result
	/** if fail, the reason info */
	3: i32 langId
}

struct SCCheckClientVersionMsg{
	1: struct.VersionUpdateType versionType
	2: string tipInfo
}

struct SCServerMessageMsg{
	1: string content
	2: byte staySecond
	3: byte boxType
}

struct WorldNotice {
	1: i32 messageId
	2: list<string> argv
}

/** ȫ������ */
struct SCWorldNoticeMsg{
	1: list<WorldNotice> worldNotices
	2: optional byte type
}

struct SCUrlInfoMsg{
	1: list<struct.URLInfo> urlInfoList
}
/** ��ֵ��¼*/
struct SCRechargeResultMsg{
	/**��ֵ������ */
	1: string transcationId
	/**����״̬ 1-succ 0-fail */
	2: byte state
	/**�۸�λ */
	3: i32 priceId
	/**���׽���ʱ�� */
	4: i64 time
	/** �۸�*/
	5: double price
}

/** ���ۻ�����Ϣ */
struct SCRetrieveWordsMsg{
	1: i64 charId;
}

/** ϵͳ���ܿ��� */
enum ESystemSwitch{
	/** �ͻ������� */
	NotificationPush = 0
	/** ϵͳ���� */
	SystemSettings = 1 
	WebRecharge = 2
	Activity = 3
	StarPan = 4
	RechargeCheckTempAccount = 5
	Ask = 6
	Lottery = 7
	appstore = 8
	ConstellationSwap = 9
	VIP = 10
	RechargeAward = 11
	FPSCheck = 12
	ObserverLoadMusic = 13
	Guild = 15
	RechargeRecord = 16
	ScoreMallCheckCode = 17
	LoversMode = 18
	WeddingRoom = 19
	CloseFriend = 20
	Lover = 21
	SocreMall = 22,
	DanceItem = 23,
	PointWall = 24,
	LimitBuy = 25,
	FruitSlot = 26,
	PicReview = 27,
	ChatCD = 28,
	PassModeMatchRoom = 29,
	DMBanner = 30,
	PassMode = 31,
	Max,
}

/** ����������ͼƬ�ϴ�ʱ�����token*/
struct SCPictureTokenMsg{
	/** ��Ҫ���ص�token*/
	1: string token
	/** token���ʱ���� ��λΪ��*/
	2: i32 timestamp
}
/** ����ɾ����Ƭ�󣬷��ص�token����Ϣ*/
struct SCPictureDeleteTokenMsg{
	/** ���ص�token*/
	1: string  token
	/**key  */
	2: string key
}

