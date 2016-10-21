namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto

struct TransactionInfo {
	1: string identifier
	2: string token
	3: i32 quantity
	4: i64 accountID
	5: string serverName
	6: string lineName
	7: i32 status
	8: string info
	9: string time
	10: string transactionIdentfier
}

struct RechargeInfo {
	1: list<TransactionInfo> dicInfo
}

