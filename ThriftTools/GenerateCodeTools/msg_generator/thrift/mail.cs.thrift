include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSDonateMsg{
	1:i64 reciveCharId
	2:list<struct.BuyItemInfo> donateItems
	3: optional string content	
	/** 是否来自礼物商城 */
	4: optional bool isGiftMarket
	/** 是否来自限时商城 */
	5: optional bool isLimitMarket
}

struct CSQueryReciveMailMsg{
	1:i64 currentMailId
	2:i32 pageSize
}
struct CSShowMailInfoMsg{
	1:i64 mailId
}
struct CSMyDonatesMsg{
	1:i64 charId
	2:i32 startIndex
	3:i32 size
}
struct CSMyGiftsMsg{
	1:i64 charId
	2:i32 startIndex
	3:i32 size
}

struct CSGetRewardByMailMsg{
	1: i64 mailId
}

struct CSMakeWishMsg{
	1:list<struct.BuyItemInfo> items
}
struct CSQueryWishMsg{
	1:i64 charId
	/** o is not over,1 is over */
	2:struct.WishType type
	3:i32 startIndex
	4:i32 size
}

struct CSDelWishMsg{
	1:i64 wishId
}
struct CSOverWishMsg{
	1:i64 charId
	2:i64 wishId
}
struct CSRequestHelpWishMsg{
	1:i64 charId
	2:i64 wishId
	3:string charName
}
struct CSDelMailMsg{
	1:i64 mailId
}
struct CSGetMailPageSizeMsg{
}
