/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

namespace MusicCodec
{
  /// <summary>
  /// 玩家事件通知类型
  /// </summary>
  public enum PlayerEventNoticeType
  {
    /// <summary>
    /// 主线任务新完成
    /// </summary>
    MAIN_TASK_FINISH = 0,
    /// <summary>
    /// 日常任务新完成
    /// </summary>
    DAILY_TASK_FINISH = 1,
    /// <summary>
    /// 随机任务新完成
    /// </summary>
    RAND_TASK_FINISH = 2,
    /// <summary>
    /// 成就新完成
    /// </summary>
    ACHIEVE_FINISH = 3,
    /// <summary>
    /// 新邮件
    /// </summary>
    NEW_MAIL = 4,
    /// <summary>
    /// 新通知
    /// </summary>
    NEW_NOTIFICATION = 5,
  }
}
