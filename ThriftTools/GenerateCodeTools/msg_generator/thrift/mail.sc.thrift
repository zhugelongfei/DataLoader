include "struct.thrift"
include "func_struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCDonateOkMsg{
	1:struct.Donate donate
}


struct SCReciveMailMsg{
	1: list<struct.Mail> mails
}
struct SCMyDonatesMsg{
	1:list<struct.Donate> donates
	2:i32 startIndex
	3:i32 size
	4:i64 charId
}
struct SCMyGiftsMsg{
	1:list<struct.Wish> datas
	2:i32 startIndex
	3:i32 size
	4:i64 charId
}

struct SCGetRewardByMailOkMsg{
	1:i64 mailId
}
struct SCMakeWishOkMsg{
	1:struct.Wish wish
}
struct SCWishListMsg{
	1:i64 charId
	2:list<struct.Wish> wishes
	3:i32 startIndex
	4:i32 size
	5:struct.WishType type
}
struct SCDelWishOkMsg{
	1:i64 wishId
}
struct SCOverWishOkMsg{
	1:i64 wishId
	2:i64 charId
}

struct SCNewMailMsg{
	1:struct.Mail mail
}
struct SCShowMailInfoMsg{
	1:string title
	2:string content
	/** 邮件内容多语言提示id，大于0时忽略content */
	3: i32 contentId
	/** 邮件内容多语言提示参数 */
	4: list<string> contentParams
	5:i64 mailId
	6: struct.PrizeInfo prizeInfos
}
struct SCDelMailOkMsg{
	1:i64 mailId
}
struct SCDonteGiftMsg{
	1:i32 itemId
	2:i64 sendCharId
	3:i64 recvCharId
	4:list<struct.FuncParam> funcRespParamList
	5:string content
}
struct SCMailPageSizeMsg{
	1:i32 pageSize
}