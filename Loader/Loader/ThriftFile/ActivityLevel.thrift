namespace csharp ThriftStruct

/**
 * Autogenerated by program
 *
 * Autho ZhuGeLongFei
 *
 * Do not edit unless you are sure that you know what you are doning
 */

struct ActivityLevel
{
	1:  i32   Level
	2:  i32   Exp
	3:  i32   ActivityNormalShopSale
	4:  i32   ActivityAddDanceReward
	5:  i32   VipPriceSale
}
struct ActivityLevelArray
{
	1:list<ActivityLevel> valueList
}

