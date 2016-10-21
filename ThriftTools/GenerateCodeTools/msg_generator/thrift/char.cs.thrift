include "struct.thrift"

namespace csharp MusicCodec
namespace java com.ling9527.music.common.msg.auto.cs

struct CSCreateNewCharMsg{
	/** 0-male 1-female */
	1: byte sex
	/** char model, different from sex */
	2: byte modelId
	/** new char name */
	3: string name
	/** head icon id */
	4: string headIconId
	/** body total adjust value */
	5: byte bodyAdjVal
	6: struct.Constellation constellation
	7: struct.LuckDay luckDay
	/** yyyy-MM-dd */
	8: string birthday
	9: i16 diyId
}

struct CSClickMoveMsg{
	1: double startX
	2: double startY
	3: double startZ
	4: double endX
	5: double endY
	6: double endZ	
}

struct CSRandCharNameMsg{
	/** 0-male 1-female */
	1: byte sex
}

struct CSQueryOnlineCharMsg{
	1: list<i64> charIdList
	2: byte tid
}

struct CSSettingsMsg{
	1: i16 charSwitch
}

struct CSSaveTagIdMsg{
	1: i16 tagId
}

//Appstore评价定时推荐
struct CSAppStoreRateMsg{
  1:	string version;
}

struct CSChangeCharNameMsg{
	1: string name
}

struct CSGetPopLevelPrizeMsg{
	1: i16 popLevel;
}

/** 查询人气等级奖励状态 */
struct CSPopLevelPrizedStatus{
	
}