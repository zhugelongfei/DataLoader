namespace csharp ThriftStruct

/**
 * Autogenerated by program
 *
 * Autho ZhuGeLongFei
 *
 * Do not edit unless you are sure that you know what you are doning
 */

struct AchievementCfg
{
	1:  i32   Type
	2:  i32   LimitIDMale
	3:  i32   LimitIDFemale
	4:  i32   Scene
}
struct AchievementCfgArray
{
	1:list<AchievementCfg> valueList
}
