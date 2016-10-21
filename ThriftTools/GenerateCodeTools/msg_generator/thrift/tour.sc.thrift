include "struct.thrift"
include "invite.sc.thrift"
namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 巡演章节关卡信息 */
struct TourChapterRaidInfo {
	/** 关卡id */
	1: i16 raidId
	/** 通关等级 0-未通关 1-3 s, ss, sss */
	2: byte passRank
}

/** 巡演章节信息 */
struct TourChapterInfo {
	/** 章节id */
	1: i16 chapterId
	/** 已激活关卡信息 */
	3: list<TourChapterRaidInfo> activeRaidInfos
}

/** 巡演章节信息 */
struct SCTourChapterInfoMsg{
	/** 章节信息 */
	1: list<TourChapterInfo> chapterInfos
	/** 当前章节id */
	2: i16 curChapterId
	/** 剩余巡演次数 */
	3: i32 leftTourTimes
	/** 今日已购买次数 */
	4: i16	dayBuyTimes
}

/** 更新巡演关卡信息 */
struct SCUpdateTourRaidMsg{
	/** 章节id */
	1: i16 chapterId
	/** 需要更新激活关卡信息 */
	2: list<TourChapterRaidInfo> updateActiveRaidInfos
}

/** 巡演关卡详细信息 */
struct SCTourRaidDetailMsg{
	/** 章节id */
	1: i16 chapterId
	/** 关卡id */
	2: i16 raidId
	/** 音乐id */
	3: i32 musicId
	/** 1s普通通关条件信息 */
	4: list<struct.PassCond> oneSPassConds
	/** 2s普通通关条件信息 */
	5: list<struct.PassCond> twoSPassConds
	/** 3s普通通关条件信息 */
	6: list<struct.PassCond> threeSPassConds
	/** 额外通关条件信息 */
	7: list<struct.PassCond> extraPassConds
	/** 通关奖励 */
	8: optional struct.PrizeInfo prizeInfos
	/** 额外奖励 */
	9: optional struct.PrizeInfo extraPrizeInfos
	/** 不能进行的提示id */
	10: optional i32 cantPlayTipId
	/** 不能进行的提示参数 */
	11: optional list<string> cantPlayTipArgvs
	/** 3s通关， 不能进行关卡提示 */
	12: optional i32 allPassTipId
}

/** 更新巡演房间信息 */
struct SCUpdateRoomTourRaidMsg{
	/** 章节id */
	1: i16 chapterId
	/** 关卡id */	
    2: i16 raidId
	/** 更新音乐和模式信息 */
	3: invite.sc.SCUpdateRoomMusicMsg updateMusicModeInfo
}

/** 巡演舞蹈通关信息 */
struct SCTourDancePassInfoMsg{
	/** 章节id */
	1: i16 chapterId
	/** 关卡id */
	2: i16 raidId
	/** 舞蹈欢呼值通关信息 */
	3: struct.DanceCheerInitInfo cheerPassInitInfo
}

/** 巡演舞蹈通关结果 */
struct TourDancePassResult{
	/** 是否巡演通关， 为false立即失败 */
    1: bool canPassTour
    /** 是否显示领取奖励按钮 */
    2: bool canAcceptPrize
	/** 章节id */
	3: i16 chapterId
	/** 关卡id */
	5: i16 raidId
	/** 通关等级 0-未通关 1-3 s, ss, sss */
	6: byte passRank
	/** 1s通关条件信息 */
	7: struct.PassCheerCondResult basicPassCondResult
	/** 额外通关条件信息 */
	8: optional struct.PassCheerCondResult extraPassCondResult
	/** 通关奖励 */
	9: optional struct.PrizeInfo prizeInfos
	10: optional list<struct.DanceCheerValResult> cheerValResults
	/** 额外奖励 */
	11: optional struct.PrizeInfo extraPrizeInfos
}

/** 巡演舞蹈同步欢呼值 */
struct SCSyncTourDanceCheerInfo{
	/** 同步欢呼值信息 */
    1: struct.SyncDanceCheerInfo syncDanceCheerInfo
}

/** 巡演星数奖励状态信息 */
struct TourStarPrizeStatus{
    1: i32 stars
	2: byte getStatus
	/** 奖励 */
	3: optional struct.PrizeInfo prizeInfos
}

/** 巡演星数奖励状态信息 */
struct SCTourStarPrizeStatus{
     /** 星数奖励信息版本号，有奖励翻倍时更新 */
	1: i32 version
	/** 星数奖励状态信息 */
	2: list<TourStarPrizeStatus> prizedStatuss;
	/** 章节id */
	3: i16 chapterId
	/** 获得的星数 */
	4: i32 curStars
}

/** 更新领取巡演星数奖励状态 */
struct SCUpdateTourStarPrizeStatus{
	/** 领取奖励的星数 */
	1: i32 stars
	/** 章节id */
	2: i16 chapterId
}


/** 更新协助巡演状态 */
struct SCUpdateAssistTourStatusMsg{
	1: map<i64, byte> updateAssistStatuss
}

/** 剧情播放状态 */
enum StoryPlayStatus {
	/** 播放中 */
	PLAYING = 0
	/** 播放完成 */
	FINISH
}

/** 巡演剧情播放状态 */
struct SCTourStoryPlayStatus{
    /** 0-播放中 1-播放完成 */
    1: StoryPlayStatus status
	2: i64 charId
}

/** 等待其他人巡演剧情播放 */
struct SCWaitTourStoryPlay{

}
/** 章节获得星数 */
struct ChapterStars{
	/** 章节id */
	1: i16 chapterId
	/** 获得星数 */
	2: i32 stars
}

/** 更新巡演属性信息 */
struct SCUpdateTourProp{
	/** 章节获得星数 */
	1: optional ChapterStars chapterStars
	/** 剩余巡演次数 */
	2: optional i32 leftTourTimes
	/** 今日已购买次数 */
	3:	optional i16 dayBuyTimes
}

