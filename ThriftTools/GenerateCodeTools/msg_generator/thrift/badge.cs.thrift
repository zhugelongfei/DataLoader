include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** �����������Ϣ */
struct CSReqBadgeBagInfo{

}

/** ������½�����Ϣ */
struct CSReqBadgeUnlockInfo{
	/** ������λ */
	1: i16 position
}

/** ж�»��� */
struct CSPutOffBadge{
	/** ������λ */
	1: i16 position
}

/** ���ϻ��� */
struct CSPutOnBadge{
	/** ������λ */
	1: list<i16> positions
}