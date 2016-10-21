include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSReqCourseTaskInfosMsg{
    /** 任务类型 0-主线 1-日常 */
	1: byte taskType
}

struct CSCompleteCourseTaskMsg{
	1: i32 courseId
}

struct CSRefreshRandCourseTaskMsg{

}

struct CSRefreshDailyCourseTaskMsg{
	1: i32 courseId
}

struct CSShelveCourseTaskMsg{
	1: i32 courseId
}

struct CSSyncCourseTaskProcessMsg{
	
}

struct CSActiveCourseTaskMsg{
	1: i32 courseId
}

struct CSQueryNextCourseMsg{
	1: i32 curCourseId
}

struct CSClickDiyButtonMsg{
	
}

struct CSChapterOperInfoMsg{
	1:struct.ChapterOperType operType
}