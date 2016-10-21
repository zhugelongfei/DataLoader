include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct LuckyMoneyReceiverInfo
{
	/** ������Ϣ */
	1: struct.PlayerBaseInfo info
	/** ��ȡ��� */
	2: i32	receiveAmount
	/** ����ʱ��(ms) */
	3: i64 receiveTime	
	/** �Ƿ�������� */
	4: optional bool isBestLuck
}

/** �յ��º�� */
struct SCReceiveLuckyMoney {
}

/** ���º������ */
struct SCUpdateLuckyMoneyCount {
	/** ��ȡ���� */
    1: i16 receiverCount
}

/** �����ȡ��Ϣ */
struct SCLuckyMoneyReceiverInfos {
	/** ��ȡ���� */
    1: i16 receiverCount
	/** ��ǰ���� */
	2: i16 startIndex
	/** ��������Ϣ */
	3: list<LuckyMoneyReceiverInfo> receivers
}

/** �����ϸ��Ϣ */
struct SCLuckyMoneyDetialInfo{
	/** ���ID */
	1: i64	luckyMoneyId
	/** ��������Ϣ */
	2: struct.PlayerBaseInfo sender
	/** �ܸ��� */
	3: i32 totalNumber
	/** �Ѿ���ȡ���� */
	4: i32 receivedNumber
	/** �ܽ�� */
	5: i32 totalAmount
	/** ������� */
	6: string words
	/** ������� */
	7: struct.LuckyMoneyType type
	/** ��������Ϣ */
	8: SCLuckyMoneyReceiverInfos receivers
	/** �Ѿ���ȡ��� */
	9: i32 receiveAmount
}

/** ��������Ļ�����Ϣ */
struct SendLuckyMoneyBasicInfo{
	/** ���ID */
	1: i64 luckyMoneyId
	/** ���� */
	2: i64 date
	/** ������� */
	3: struct.LuckyMoneyType type
	/** �ѷ����� */
	4: i32 sentAmount 
	/** �ܸ��� */
	5: i32 totalAmount
	/** �����ܽ�� */
	6: i32 totalSentAmount
	/** ���˺����������Ϣ */
	7: optional struct.PlayerBaseInfo personalReceiverInfo
}

/** �ҷ����ĺ��������Ϣ */
struct SCSendLuckyMoneyBasicInfo{
	/** ��������������� */
	1: optional i32 totalAmount
	/** ����ܸ��� */
	2: optional i32 totalNumber
	/** ��ǰ���� */
	3: i16 startIndex
	/** �����ĺ��������Ϣ */
	4: list<SendLuckyMoneyBasicInfo> basicInfo
}

/** �յ�����Ļ�����Ϣ*/
struct ReceiveLuckyMoneyBasicInfo{
	/** ���ID */
	1: i64 luckyMoneyId
	/** ��������Ϣ */
	2: struct.PlayerBaseInfo senderInfo
	/** ���� */
	3: i64 date
	/** ������� */
	4: struct.LuckyMoneyType type
	/** �յ���� */
	5: i32 receiveAmount
	/** �Ƿ�������� */
	6: optional bool isBestLuck
}

/** ���յ�����Ļ�����Ϣ */
struct SCReceiveLuckyMoneyBasicInfo{
	/** �յ������������ */
	1: optional i32 totalAmount
	/** ����ܸ��� */
	2: optional i32 totalNumber
	/** ��ǰ���� */
	3: i16 startIndex
	/** �յ�����Ļ�����Ϣ */ 
	4: list<ReceiveLuckyMoneyBasicInfo> basicInfo
}

/** �������� */
struct SCGetLuckyMoneyResult{
	/** �������� */
	1: bool result
	/** �������ϸ��Ϣ */
	2: optional SCLuckyMoneyDetialInfo detialInfo
	/** ������� */
	3: optional i32 receiveAmount
}

/** ������Һ����Ϣ */
struct SCUpdateLuckyMoneyProp{
	/** ��Һ������ */
	1: i32 totalNumber
	/** ���id */
	2: i64 luckyMoneyId
	/** ��������Ϣ */
	3: struct.PlayerBaseInfo senderInfo
	/** ������� */
	4: struct.LuckyMoneyType type
	/** ������� */
	5: string words
}

/** �����������Ϣ */
struct SCFirstLuckyMoneyInfo{
	1: SCUpdateLuckyMoneyProp firstMoneyInfo
}