include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** �鿴��Ӧvip�ȼ�������Ϣ */
struct CSVipLevelPrizeMsg{
    /** vip�ȼ� */
	1: byte vipLvl;
}

/** ��ȡ��Ӧvip�ȼ����� */
struct CSGetVipLevelPrizeMsg{
    /** vip�ȼ� */
	1: byte vipLvl;
}

