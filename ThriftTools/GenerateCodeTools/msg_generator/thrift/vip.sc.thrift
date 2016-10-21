include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** vip�ȼ�������Ϣ */
struct SCVipLevelPrizeMsg{
	/** vip�ȼ� */
	1: byte vipLvl;
	/** ���� */
	2: optional struct.PrizeInfo prizeInfos
}
/** ��ȡ��Ӧvip�ȼ�������Ϣ */
struct SCVipGetLevelPrizeMsg{
    /** vip�ȼ� */
	1: byte vipLvl;
	/** 0 -- ʧ�� 1 -- �ɹ� */
    2: byte result;  
}

/** vip�ȼ����� */
struct SCVipLevelUpMsg{
	1: byte sourceLevel
	2: byte currentLevel
}

/** ����Vip�ȼ�������Ϣ(Ԥ��) */
struct SCVipPrizeUpdateMsg{
    /** �ܹ���ȡ����vip�ȼ� */
	1: list<byte> levelPrizeList
}

/** vip��¼��ʾ */
struct SCVipEnterNotice{
	1: i32 scope
	2: i32 messageId
	3: list<string> argv
}