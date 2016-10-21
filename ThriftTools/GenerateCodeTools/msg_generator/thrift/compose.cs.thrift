include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** ����ϳ���Ϣ */
struct CSReqComposeInfo{
    /** �ϳ����� 0-�ճ� 1-� */
    1: byte type
    /** 1-��װ 2-��Ʒ 3-���� */
    2: byte itemType
	/** �汾�ţ���0��ʼ */
	3: optional i32 version
}

/** ����ϳɵ��� */
struct CSReqComposeItem{
	/** 0-7�� 1-30�� 2-���� */
	1: byte validTimeType
	2: i32 itemId
}

/** ����������� */
struct CSReqEvolveItem{
	/** 0-7�� 1-30�� 2-���� */
	1: byte validTimeType
	2: i64 instanceId
}
