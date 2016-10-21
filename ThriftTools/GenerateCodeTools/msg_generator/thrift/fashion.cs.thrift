include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����ʱ������Ϣ */
struct CSReqFashionBagInfo{
    /** ����װ������ */
	1: byte style
}

/** Ӧ��ʱ����Ϣ */
struct CSApplyFashionInfo{
    /** ʱ��id */
	1: i32 fashionId
}

/** ɾ��ʱ����Ϣ */
struct CSDelFashionInfo{
	/** ʱ��id */
	1: i32 fashionId
}

/** ����ʱ����Ϣ */
struct CSRenewFashionInfo{
	/** ʱ��id */
	1: i32 fashionId
	/** ��Ч������ 2-�� 3-��*/
	2: byte validTimeType
}