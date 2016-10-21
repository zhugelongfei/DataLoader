include "struct.thrift"
namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ͨ����Ϣ */
struct SCAllAnnounceInfos{
	1: i32 announceVersion
	2: byte availableTimes
	3: i32 announceGold
	4: list<struct.AnnounceData> announceList
	/** �´�ˢ��ʱ��(HHmm)*/
	5: i16 nextRefreshTime
}

/** ����ͨ��������� */
struct SCAddAnnounceCost{
	1: i32 amount
	2: i32 totalPrice
	3: i32 buyTimes
}

/** ˢ��ͨ����ȴʱ������ */
struct SCRefreshAnnounceCost{
	1: i32 refreshTimes
	2: i32 cost
}

/** ˢ��ͨ���̵����� */
struct SCRefreshAnnounceShopCost{
	1: i32 refreshTimes
	2: i32 cost
}

/** ˢ��ͨ��ɹ� */
struct SCRefreshAnnounceSucc{
	/** ͨ������ */
	1:byte announceIndex
}

/** ͨ���̵���Ʒ��Ϣ*/
struct SCAnnounceShopItems{
	/** ͨ���̵�汾 */
	1: i32	shopVersion
	/** key : ��Ʒid ,val: ��Ʒ���� */
	2: list<struct.ItemObject> items
	/** ˢ������ */
	3: i32	refreshCost
	/** ʣ�����ˢ�´���*/
	4: i16 leftFreeTimes
}

/** ����ͨ������ɹ� */
struct SCAddAnnounceTimesSucc{
	1: i32	amount
}

/** ˢ���̵�ɹ� */
struct SCRefreshAnnounceShopSucc{
	/** key : ��Ʒid ,val: ��Ʒ���� */
	1: list<struct.ItemObject> items
	/** �´�ˢ�µ����� */
	2: i32	refreshCost
	/** ʣ�����ˢ�´���*/
	3: i16 leftFreeTimes
}
/** ������Ʒ�ɹ� */
struct SCBuyAnnounceItemSucc{
	/** ��Ʒid */
	1: i32 id
}

/** ͨ���赸������Ϣ */
struct SCAnnounceDanceExtraInfos{
	/** �赸����ֵͨ����Ϣ */
	1: struct.DanceCheerInitInfo cheerPassInitInfo
}

/** ͨ��ͬ������ֵ */
struct SCSyncAnnounceCheerInfo{
	/** ͬ������ֵ��Ϣ */
    1: struct.SyncDanceCheerInfo syncDanceCheerInfo
	/** �Ƿ񴥷������淨 */
    2: optional bool hasSpecialVal
}

/** ͨ��ͨ����Ϣ */
struct AnnouncePassInfo{
    /** ͨ��id */
	1: i32 announceId
	/** ͨ������ */
	2: byte announceIndex
	/** ͨ�صȼ� 0-δͨ�� 1-3 s, ss, sss */
	3: byte passRank
	/** ͨ��������Ϣ */
	4: list<struct.PassCheerCondResult> condResultList
	/** ���� */
	5: optional struct.PrizeInfo prizeInfos
	/** ���⽱�� */
	6: optional struct.PrizeInfo extraPrizeInfos
	/** ÿ����Ա�Ļ���ֵ��� */
	7: optional list<struct.DanceCheerValResult> cheerValResults
}

/** ����ͨ����Ϣ */
struct SCUpdateAnnounceInfos{
	/** ͨ��id */
	1: optional i32 announceId;
	/** ͨ������ */
	2: optional byte announceIndex
	/** ʣ����� */
	3: optional i32 leftTimes
	/** ͨ����ȴʱ��(����1970.1.1������) */
	4: optional i32 coldDown
	/** ͨ����ʾid */
	5: optional i32 announceTipId;
}

/** ��ʼͨ��showTime */
struct SCStartAnnounceShowTime{
	
}