include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** ʱ����Ϣ */
struct FashionInfo{
    /** ʱ��id */
	1: i32 fashionId
	/** ʱ��id��Ч��(������ǰʣ����)�� <=0Ϊ���� */
	2: i32 validTime
}

/** ʱ������Ϣ */
struct SCFashionBagInfo{
    /** ����װ������ */
	1: byte style
	/** ������������ʱ����Ϣ */
	2: list<FashionInfo> fashionInfos
	/** ��ǰ����ʹ�õ�ʱ��id */
	3: optional i32 curUsedFashionId
}

/** Ӧ��ʱ����Ϣ�ɹ� */
struct SCApplyFashionInfoSucc{
    /** ʱ��id */
	1: i32 fashionId
	/** ���Խ�ɫid */
	2: optional i64 fromCharId
}

/** ����ʱ����Ϣ */
struct SCAddFashionInfo{
	1: list<FashionInfo> fashionInfos
}

/** ɾ��ʱ����Ϣ�ɹ� */
struct SCDelFashionSucc{
	/** ʱ��id */
	1: i32 fashionId
}

/** ����ʱ����Ϣ�ɹ� */
struct SCRenewFashionSucc{
	/** ʱ��id */
	1: i32 fashionId
	/** ����ʱ��(��λ:��) */
	2: i32 validTime
}