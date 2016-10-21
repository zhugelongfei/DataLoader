include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

//服务器通用返回消息，带参数
struct SCSystemInfoMsg{
	1: i32 tipId
	2: list<string> argv
}

//ping响应
struct SCServerPingMsg{

}

/** 播放剧情的类型 */
enum PlayStoryType{
    /** 任务 */
	Task
	/** 巡演 */
	Tour
}

/** 播放剧情 */
struct SCPlayStoryMsg{
	1: i32 storyId
	2: PlayStoryType playType
	/** 播放完返回ui id */
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

/** 全服公告 */
struct SCWorldNoticeMsg{
	1: list<WorldNotice> worldNotices
	2: optional byte type
}

struct SCUrlInfoMsg{
	1: list<struct.URLInfo> urlInfoList
}
/** 充值记录*/
struct SCRechargeResultMsg{
	/**充值订单号 */
	1: string transcationId
	/**订单状态 1-succ 0-fail */
	2: byte state
	/**价格档位 */
	3: i32 priceId
	/**交易结束时间 */
	4: i64 time
	/** 价格*/
	5: double price
}

/** 言论回收消息 */
struct SCRetrieveWordsMsg{
	1: i64 charId;
}

/** 系统功能开关 */
enum ESystemSwitch{
	/** 客户端推送 */
	NotificationPush = 0
	/** 系统设置 */
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

/** 服务器返回图片上传时请求的token*/
struct SCPictureTokenMsg{
	/** 需要返回的token*/
	1: string token
	/** token存活时间载 单位为秒*/
	2: i32 timestamp
}
/** 请求删除照片后，返回的token的消息*/
struct SCPictureDeleteTokenMsg{
	/** 返回的token*/
	1: string  token
	/**key  */
	2: string key
}

