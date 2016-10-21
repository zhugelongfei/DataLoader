include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct LuckyMoneyReceiverInfo
{
	/** 基础信息 */
	1: struct.PlayerBaseInfo info
	/** 领取金额 */
	2: i32	receiveAmount
	/** 出手时间(ms) */
	3: i64 receiveTime	
	/** 是否手气最佳 */
	4: optional bool isBestLuck
}

/** 收到新红包 */
struct SCReceiveLuckyMoney {
}

/** 更新红包数量 */
struct SCUpdateLuckyMoneyCount {
	/** 领取数量 */
    1: i16 receiverCount
}

/** 红包领取信息 */
struct SCLuckyMoneyReceiverInfos {
	/** 领取数量 */
    1: i16 receiverCount
	/** 当前索引 */
	2: i16 startIndex
	/** 接受者信息 */
	3: list<LuckyMoneyReceiverInfo> receivers
}

/** 红包详细信息 */
struct SCLuckyMoneyDetialInfo{
	/** 红包ID */
	1: i64	luckyMoneyId
	/** 发送者信息 */
	2: struct.PlayerBaseInfo sender
	/** 总个数 */
	3: i32 totalNumber
	/** 已经领取个数 */
	4: i32 receivedNumber
	/** 总金额 */
	5: i32 totalAmount
	/** 红包寄语 */
	6: string words
	/** 红包类型 */
	7: struct.LuckyMoneyType type
	/** 接受者信息 */
	8: SCLuckyMoneyReceiverInfos receivers
	/** 已经领取金额 */
	9: i32 receiveAmount
}

/** 发出红包的基本信息 */
struct SendLuckyMoneyBasicInfo{
	/** 红包ID */
	1: i64 luckyMoneyId
	/** 日期 */
	2: i64 date
	/** 红包类型 */
	3: struct.LuckyMoneyType type
	/** 已发个数 */
	4: i32 sentAmount 
	/** 总个数 */
	5: i32 totalAmount
	/** 发出总金额 */
	6: i32 totalSentAmount
	/** 个人红包接收者信息 */
	7: optional struct.PlayerBaseInfo personalReceiverInfo
}

/** 我发出的红包基本信息 */
struct SCSendLuckyMoneyBasicInfo{
	/** 发出红包的总数额 */
	1: optional i32 totalAmount
	/** 红包总个数 */
	2: optional i32 totalNumber
	/** 当前索引 */
	3: i16 startIndex
	/** 发出的红包基本信息 */
	4: list<SendLuckyMoneyBasicInfo> basicInfo
}

/** 收到红包的基本信息*/
struct ReceiveLuckyMoneyBasicInfo{
	/** 红包ID */
	1: i64 luckyMoneyId
	/** 发送者信息 */
	2: struct.PlayerBaseInfo senderInfo
	/** 日期 */
	3: i64 date
	/** 红包类型 */
	4: struct.LuckyMoneyType type
	/** 收到金额 */
	5: i32 receiveAmount
	/** 是否手气最佳 */
	6: optional bool isBestLuck
}

/** 我收到红包的基本信息 */
struct SCReceiveLuckyMoneyBasicInfo{
	/** 收到红包的总数额 */
	1: optional i32 totalAmount
	/** 红包总个数 */
	2: optional i32 totalNumber
	/** 当前索引 */
	3: i16 startIndex
	/** 收到红包的基本信息 */ 
	4: list<ReceiveLuckyMoneyBasicInfo> basicInfo
}

/** 抢红包结果 */
struct SCGetLuckyMoneyResult{
	/** 抢红包结果 */
	1: bool result
	/** 抢红包详细信息 */
	2: optional SCLuckyMoneyDetialInfo detialInfo
	/** 抢到金额 */
	3: optional i32 receiveAmount
}

/** 更新玩家红包信息 */
struct SCUpdateLuckyMoneyProp{
	/** 玩家红包数量 */
	1: i32 totalNumber
	/** 红包id */
	2: i64 luckyMoneyId
	/** 发送者信息 */
	3: struct.PlayerBaseInfo senderInfo
	/** 红包类型 */
	4: struct.LuckyMoneyType type
	/** 红包寄语 */
	5: string words
}

/** 最早可领红包信息 */
struct SCFirstLuckyMoneyInfo{
	1: SCUpdateLuckyMoneyProp firstMoneyInfo
}