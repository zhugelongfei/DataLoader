include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

/** 请求时尚栏信息 */
struct CSReqFashionBagInfo{
    /** 个性装扮类型 */
	1: byte style
}

/** 应用时尚信息 */
struct CSApplyFashionInfo{
    /** 时尚id */
	1: i32 fashionId
}

/** 删除时尚信息 */
struct CSDelFashionInfo{
	/** 时尚id */
	1: i32 fashionId
}

/** 续费时尚信息 */
struct CSRenewFashionInfo{
	/** 时尚id */
	1: i32 fashionId
	/** 有效期类型 2-周 3-月*/
	2: byte validTimeType
}