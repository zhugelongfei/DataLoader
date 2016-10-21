include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** �������� */
struct CSGetActivityDetailMsg{
	1:i32 activityId
}

/** �����б� */
struct CSGetActivityListMsg{
	/** ��汾�� */
	1:i32 activityVersion
}

/** ��ȡ�Ŀ�꽱�� */
struct CSGetActivityTargetPrizeMsg{
	/** ��汾�� */
	1:i32 activityVersion
	2:i32 activityId
	/** Ŀ��id */
	3:i32 targetId
}

