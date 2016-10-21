include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ���˱�����Ϣ */
struct SCImproviseInfoMsg{
	/** ����ʣ����ɴ��� */
	1: i16 dailyLeftPlayCount
	/** �������id, Ϊ0��ʾ��δ��ȡ */
	2: i32 randTaskId
	/** ���״̬0-δ��� 1-�����*/
	3: byte finishStatus
	/** �ݳ����� */
	4: i32 perfPrizeCoupon
	/** �ǹ�ȼ����� */
	5: i32 starLightLvlPrizeCoupon
	/** ��ǰ�ݳ�ȯ */
	6: i32 perfCoupon
}

/** ���¼��˱���������� */
struct SCUpdateImproviseTaskState {
	/** �������id */
	1: i32 randTaskId
	/** ���״̬0-δ��� 1-�����*/
	2: byte finishStatus
}

/** ���˱���������� */
struct SCImproviseRandTasks{
    /** �������id�б� */
	1: list<i32> randTaskIds
	/** ѡ����������id */
	2: i32 choicedTaskId
	/** �ݳ����� */
	3:i32 perfPrizeCoupon
}

/** �����˱��ݴ�����Ϣ */
struct SCBuyImprovisePlayCountInfo{
	/** ���Ѱ��� */
	1: i32 cost
	/** ���Ӵ��� */
	2: i32 addedCount
	/** ���չ������ */
	3:i32 todayBuyTimes
}

/** �ɹ�����ͨ�����˱��� */
struct SCQuickPassImproviseTaskSucc{
	
}

/** ���˱��ݶһ��̵���Ϣ */
struct SCImproviseShop{
    /** ���˱����̵�汾�� */
	1: i32 version
	/** ��Ʒ��Ϣ key:��Ʒid�� val:�ɶһ����� */
	2: map<i32, byte> shopItems
}

/** �ɹ��һ����˱����̵���Ʒ */
struct SCBuyImproviseShopItemSucc{
    /** ��Ʒid */
	1: i32 shopItemId
}

/** ���ü��˱��ݶһ�������Ϣ */
struct SCResetImproviseShopCost{
	/** ���Ѱ��� */
	1: i32 cost
}

/** �ɹ����ü��˱��ݶһ���Ϣ */
struct SCResetImproviseShopSucc{

}