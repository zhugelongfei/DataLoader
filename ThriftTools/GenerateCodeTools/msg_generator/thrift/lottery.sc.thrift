include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

//������Ʒ�б�
struct SCConstellationItemsMsg{
	1: byte constellationId
	2: list<struct.ConstellationData> dataList
}

//�һ����
struct SCConstellationSwapItemMsg{
	1: bool result
}


struct SCReqConstellationLotteryMsg{
	1:i32 itemId
	2: list<struct.ConstellationLotteryItem> itemList
}

struct SCGetConstellationIdsMsg{
	1:byte currentConstellationId
	2:list<byte> constellationIds
}