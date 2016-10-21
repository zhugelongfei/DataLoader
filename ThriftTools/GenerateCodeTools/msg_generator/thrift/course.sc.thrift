include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.sc

struct SCAllCourseTasksMsg{
	1: list<struct.CourseTaskData> courseTaskList
}

struct SCUpdateCourseTaskMsg{
	1: struct.CourseTaskData taskData
}

struct SCAcceptCourseTaskMsg{
	1: struct.CourseTaskData acceptCourse
}

struct SCDelCourseTaskMsg{
	1: i32 courseId
}

struct SCRefreshRandCourseTaskMsg{
	1: i32 delPreRandCourseId
	2: struct.CourseTaskData newRandTaskData
}

struct SCCompleteCourseTaskResultMsg {
	1: bool result
	2: i32 courseId
}

struct SCRefreshDailyCourseTaskResultMsg{
	1: bool result
	2: i32 oldCourseId
}

struct SCShelveCourseTaskResultMsg {
	1: bool result
	2: i32 courseId
}

struct SCActiveCourseTaskResultMsg{
	1: bool result
	2: i32 courseId
}

struct SCSyncCourseTaskProcessMsg{
	1: optional list<struct.CourseTaskData> courseTaskList
	2: optional list<struct.CourseTaskData> shelveCourseIdList
}

struct SCNextCourseMsg{
	1: i32 curCourseId
	2: struct.CourseTaskData nextCourseTaskData
}


struct SCGuildSyncCourseTaskProcessMsg{
	1: i32 courseId
	2: list<struct.CourseTaskProcess> otherProcessList
}

struct SCChapterBuyTimesResultMsg{
	1: i32 freeTimes
}