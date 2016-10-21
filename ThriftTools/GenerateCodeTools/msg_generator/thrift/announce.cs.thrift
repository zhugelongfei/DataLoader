include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����ͨ����Ϣ */
struct CSReqAnnounceInfoMsg{
	1: i32 announceVersion
}

/** ����ʼͨ�� */
struct CSReqStartAnnounce{
	/** ͨ������ */
	1:byte announceIndex
}

/** ����ˢ��ͨ����ȴʱ�� */
struct CSRefreshAnnounceMsg{
	/** ͨ������ */
	1:byte announceIndex
}

/** ��������ͨ����� */
struct CSAddAnnounceTimesMsg{
}

/** ����ˢ��ͨ���̵� */
struct CSRefreshAnnounceShopMsg{
}

/** ����ˢ��ͨ���̵����� */
struct CSRefreshAnnounceShopCost{
}
/** ����ͨ���̵���Ʒ */
struct CSReqAnnounceShopItems{
	/** �̵���Ʒ�汾 */
	1:i32	version
}
/** ����ˢ��ͨ����ȴʱ������ */
struct CSRefreshAnnounceCost{
	/** ͨ������ */
	1:byte announceIndex
}

/** ������ͨ���̵���Ʒ */
struct CSBuyAnnounceShopItem{
	/** ����id */
	1: i32	index
}

/** ��������ͨ��������� */
struct CSAddAnnounceCost{
}

/** ������ټ���ͨ�淿�� */
struct CSQuickJoinAnnounceRoom{
	/** ͨ������ */
	1:byte announceIndex
}

/** ͨ�������淨ֵ */
struct CSAnnounceSpecialVal{
	/** �����淨ֵ(�ٷ��Ƶķ���) */
	1: i16 specialVal
}

/** ����ʼͨ��showTime */
struct CSReqStartAnnounceShowTime{
	
}
