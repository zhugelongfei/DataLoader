include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

/** 时尚信息 */
struct FashionInfo{
    /** 时尚id */
	1: i32 fashionId
	/** 时尚id有效期(截至当前剩余秒)， <=0为永久 */
	2: i32 validTime
}

/** 时尚栏信息 */
struct SCFashionBagInfo{
    /** 个性装扮类型 */
	1: byte style
	/** 该类型下所有时尚信息 */
	2: list<FashionInfo> fashionInfos
	/** 当前类型使用的时尚id */
	3: optional i32 curUsedFashionId
}

/** 应用时尚信息成功 */
struct SCApplyFashionInfoSucc{
    /** 时尚id */
	1: i32 fashionId
	/** 来自角色id */
	2: optional i64 fromCharId
}

/** 增加时尚信息 */
struct SCAddFashionInfo{
	1: list<FashionInfo> fashionInfos
}

/** 删除时尚信息成功 */
struct SCDelFashionSucc{
	/** 时尚id */
	1: i32 fashionId
}

/** 续费时尚信息成功 */
struct SCRenewFashionSucc{
	/** 时尚id */
	1: i32 fashionId
	/** 到期时间(单位:秒) */
	2: i32 validTime
}