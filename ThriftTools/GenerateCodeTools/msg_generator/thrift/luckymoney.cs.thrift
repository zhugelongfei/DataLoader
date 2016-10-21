include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ���󷢺�� */
struct CSReqMakeLuckyMoney{
	/** �������С */
	1: i32 luckyMoneyAmount
	/** ������� */
	2: i32 luckyMoneyNumber
	/** ������� */
	3: struct.LuckyMoneyType luckyMoneyType
	/** ������� */
	4: string words
	/** �պ����ɫid */
	5: optional i64 charId
	/** ��������*/
	6: i32 currenyAmount
}

/** ������������Ϣ */
struct CSReqFirstLuckyMoneyInfo{

}

/** ��������� */
struct CSReqGetLuckyMoney{
	/** ���ID */
	1: i64 luckyMoneyID
}

/** �����ҷ����ĺ�� */
struct CSReqLuckyMoneySend{
	/** ��ǰ���� */
	1: i16 startIndex
}

/** �������յ��ĺ�� */
struct CSReqLuckyMoneyReceive{
	/** ��ǰ���� */
	1: i16 startIndex
}

/** ��������ϸ��Ϣ */
struct CSReqLuckyMoneyDetial{
	/** ���ID */
	1: i64 luckyMoneyID
}

/** ��������ȡ��Ϣ */
struct CSReqLuckyMoneyReceivers {
	/** ���ID */
	1: i64 luckyMoneyID
    /** ��ǰ���� */
	2: i16 startIndex
}