include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** �����˱�����Ϣ */
struct CSReqImproviseInfoMsg{
	
}

/** �����˱���������� */
struct CSReqImproviseRandTasks{
	
}

/** �����˱��ݴ��� */
struct CSBuyImprovisePlayCount{
	/** 0-�����򻨷� 1-ȷ�Ϲ��� */
	1: byte status
}

/** �������ͨ�����˱��� */
struct CSQuickPassImproviseTask{
	
}

/** �����˱��ݶһ��̵���Ϣ */
struct CSReqImproviseShop{
    /** ���˱����̵�汾�ţ� ��ʼΪ0 */
	1: i32 version
}

/** �һ����˱����̵���Ʒ */
struct CSBuyImproviseShopItem{
	/** ���˱����̵�汾�ţ� ��ʼΪ0 */
	1: i32 version
    /** ��Ʒid */
	2: i32 shopItemId
}

/** ���ü��˱��ݶһ���Ϣ */
struct CSResetImproviseShop{
    /** 0-�������û��� 1-ȷ������ */
	1: byte status
}