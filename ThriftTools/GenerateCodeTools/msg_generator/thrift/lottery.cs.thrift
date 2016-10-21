include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//ˢ��ͼ��
struct CSRefConstellationItemsMsg{
	1: struct.RefreshType type      //ˢ������ 1�Զ�ˢ�� 2ǿ��ˢ�����Ļ���
	2: byte constellationId		//����id
}

//����������Ʒ�б�
struct CSReqConstellationItemsMsg{
	1: byte constellationId
}

//�һ�xx��λxx��Ʒid
struct CSConstellationSwapItemMsg{
	1: byte constellationId		//����id
  2: i16 star			//��λ
  3: byte sex
  4: i32 itemIndex
  5: i64 targetCharId	// -1 : �һ�  ����Ŀ��charID
}

//ֹͣ����ת��������ȷ����Ʒid
struct CSReqConstellationLotteryMsg{
	1: byte constellationId
	2: i16 count
}


//struct CSConstellationLotteryCostMsg{
//	1: byte priceType
//	2: i32 priceCount
//}

struct CSGetConstellationIdsMsg{
}

struct CSGetTimingLotteryMsg{
}

