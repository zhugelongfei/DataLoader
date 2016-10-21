include "struct.thrift"
include "invite.sc.thrift"
namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** Ѳ���½ڹؿ���Ϣ */
struct TourChapterRaidInfo {
	/** �ؿ�id */
	1: i16 raidId
	/** ͨ�صȼ� 0-δͨ�� 1-3 s, ss, sss */
	2: byte passRank
}

/** Ѳ���½���Ϣ */
struct TourChapterInfo {
	/** �½�id */
	1: i16 chapterId
	/** �Ѽ���ؿ���Ϣ */
	3: list<TourChapterRaidInfo> activeRaidInfos
}

/** Ѳ���½���Ϣ */
struct SCTourChapterInfoMsg{
	/** �½���Ϣ */
	1: list<TourChapterInfo> chapterInfos
	/** ��ǰ�½�id */
	2: i16 curChapterId
	/** ʣ��Ѳ�ݴ��� */
	3: i32 leftTourTimes
	/** �����ѹ������ */
	4: i16	dayBuyTimes
}

/** ����Ѳ�ݹؿ���Ϣ */
struct SCUpdateTourRaidMsg{
	/** �½�id */
	1: i16 chapterId
	/** ��Ҫ���¼���ؿ���Ϣ */
	2: list<TourChapterRaidInfo> updateActiveRaidInfos
}

/** Ѳ�ݹؿ���ϸ��Ϣ */
struct SCTourRaidDetailMsg{
	/** �½�id */
	1: i16 chapterId
	/** �ؿ�id */
	2: i16 raidId
	/** ����id */
	3: i32 musicId
	/** 1s��ͨͨ��������Ϣ */
	4: list<struct.PassCond> oneSPassConds
	/** 2s��ͨͨ��������Ϣ */
	5: list<struct.PassCond> twoSPassConds
	/** 3s��ͨͨ��������Ϣ */
	6: list<struct.PassCond> threeSPassConds
	/** ����ͨ��������Ϣ */
	7: list<struct.PassCond> extraPassConds
	/** ͨ�ؽ��� */
	8: optional struct.PrizeInfo prizeInfos
	/** ���⽱�� */
	9: optional struct.PrizeInfo extraPrizeInfos
	/** ���ܽ��е���ʾid */
	10: optional i32 cantPlayTipId
	/** ���ܽ��е���ʾ���� */
	11: optional list<string> cantPlayTipArgvs
	/** 3sͨ�أ� ���ܽ��йؿ���ʾ */
	12: optional i32 allPassTipId
}

/** ����Ѳ�ݷ�����Ϣ */
struct SCUpdateRoomTourRaidMsg{
	/** �½�id */
	1: i16 chapterId
	/** �ؿ�id */	
    2: i16 raidId
	/** �������ֺ�ģʽ��Ϣ */
	3: invite.sc.SCUpdateRoomMusicMsg updateMusicModeInfo
}

/** Ѳ���赸ͨ����Ϣ */
struct SCTourDancePassInfoMsg{
	/** �½�id */
	1: i16 chapterId
	/** �ؿ�id */
	2: i16 raidId
	/** �赸����ֵͨ����Ϣ */
	3: struct.DanceCheerInitInfo cheerPassInitInfo
}

/** Ѳ���赸ͨ�ؽ�� */
struct TourDancePassResult{
	/** �Ƿ�Ѳ��ͨ�أ� Ϊfalse����ʧ�� */
    1: bool canPassTour
    /** �Ƿ���ʾ��ȡ������ť */
    2: bool canAcceptPrize
	/** �½�id */
	3: i16 chapterId
	/** �ؿ�id */
	5: i16 raidId
	/** ͨ�صȼ� 0-δͨ�� 1-3 s, ss, sss */
	6: byte passRank
	/** 1sͨ��������Ϣ */
	7: struct.PassCheerCondResult basicPassCondResult
	/** ����ͨ��������Ϣ */
	8: optional struct.PassCheerCondResult extraPassCondResult
	/** ͨ�ؽ��� */
	9: optional struct.PrizeInfo prizeInfos
	10: optional list<struct.DanceCheerValResult> cheerValResults
	/** ���⽱�� */
	11: optional struct.PrizeInfo extraPrizeInfos
}

/** Ѳ���赸ͬ������ֵ */
struct SCSyncTourDanceCheerInfo{
	/** ͬ������ֵ��Ϣ */
    1: struct.SyncDanceCheerInfo syncDanceCheerInfo
}

/** Ѳ����������״̬��Ϣ */
struct TourStarPrizeStatus{
    1: i32 stars
	2: byte getStatus
	/** ���� */
	3: optional struct.PrizeInfo prizeInfos
}

/** Ѳ����������״̬��Ϣ */
struct SCTourStarPrizeStatus{
     /** ����������Ϣ�汾�ţ��н�������ʱ���� */
	1: i32 version
	/** ��������״̬��Ϣ */
	2: list<TourStarPrizeStatus> prizedStatuss;
	/** �½�id */
	3: i16 chapterId
	/** ��õ����� */
	4: i32 curStars
}

/** ������ȡѲ����������״̬ */
struct SCUpdateTourStarPrizeStatus{
	/** ��ȡ���������� */
	1: i32 stars
	/** �½�id */
	2: i16 chapterId
}


/** ����Э��Ѳ��״̬ */
struct SCUpdateAssistTourStatusMsg{
	1: map<i64, byte> updateAssistStatuss
}

/** ���鲥��״̬ */
enum StoryPlayStatus {
	/** ������ */
	PLAYING = 0
	/** ������� */
	FINISH
}

/** Ѳ�ݾ��鲥��״̬ */
struct SCTourStoryPlayStatus{
    /** 0-������ 1-������� */
    1: StoryPlayStatus status
	2: i64 charId
}

/** �ȴ�������Ѳ�ݾ��鲥�� */
struct SCWaitTourStoryPlay{

}
/** �½ڻ������ */
struct ChapterStars{
	/** �½�id */
	1: i16 chapterId
	/** ������� */
	2: i32 stars
}

/** ����Ѳ��������Ϣ */
struct SCUpdateTourProp{
	/** �½ڻ������ */
	1: optional ChapterStars chapterStars
	/** ʣ��Ѳ�ݴ��� */
	2: optional i32 leftTourTimes
	/** �����ѹ������ */
	3:	optional i16 dayBuyTimes
}

