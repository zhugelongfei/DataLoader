include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

//ping
struct CSClientPingMsg{

}

struct CSPurchaseTokenMsg{
	/** purchase token */
	1: string token
	2: string identifier
	3: string transcationId
}

struct CSRunStateMsg{
	/** 0-background 1-foreground */
	1: byte state
}

struct CSReportChatMsg{
	/** 1-private 2-world 3-speaker */
	1: byte scope
	2: i64 reportedCharId
	3: string content
	4: bool sound
}

struct CSDeviceTokenMsg{
	1: string token
}


/** 剧情播放完成 */
struct CSStoryPlayFinish{
	1: i32 storyId 
}

struct CSGetUrlInfoMsg{

}

struct CSConversionTackingMsg{
	
}

struct CSCheckClientUpdateMsg{
	
}
/**客服端日志消息 */
struct CSClientLogMsg{
  /**引导日志 */
  1: optional struct.GuildeLog guildeLog 
  /** 性能按钮日志*/
  2: optional struct.PerformanceLog performanceLog
  /** 上传照片日志*/
  3: optional struct.UploadPhotoLog uploadPhotoLog

}
/** 客服端请求上传照片 获取token的消息*/
struct CSPictureUploadTokenMsg{

}
/**客服端请求删除照片 获取token的消息 */
struct CSPictureDeleteTokenMsg{
	/** 照片的key*/
	1: string key
}