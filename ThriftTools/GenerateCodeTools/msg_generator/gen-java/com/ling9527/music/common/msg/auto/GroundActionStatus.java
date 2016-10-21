/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * 广场行为状态
 */
public enum GroundActionStatus implements org.apache.thrift.TEnum {
  /**
   * 空闲
   */
  None(0),
  /**
   * 与其它玩家交互中
   */
  ActionPlayer(1),
  /**
   * 与物体交互中
   */
  ActionObject(2),
  /**
   * 坐在静态物体上
   */
  SitObject(3),
  /**
   * 坐在泉眼上
   */
  SitSpringPoint(4),
  /**
   * 换装中
   */
  ChangeClothes(5),
  /**
   * 正在被其他玩家邀请
   */
  BeinvitedAction(6),
  /**
   * 猜拳中
   */
  FingerGuess(7),
  /**
   * 富豪领舞区
   */
  RichPoint(8),
  /**
   * 人气领舞区
   */
  PopularityPoint(9),
  /**
   * 技术领舞区
   */
  CupPoint(10),
  /**
   * 等级领舞区
   */
  LevelPoint(11),
  /**
   * 烟花区
   */
  FireWorksArea(12),
  /**
   * 温泉中做动作
   */
  ActionInSpring(13);

  private final int value;

  private GroundActionStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static GroundActionStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return None;
      case 1:
        return ActionPlayer;
      case 2:
        return ActionObject;
      case 3:
        return SitObject;
      case 4:
        return SitSpringPoint;
      case 5:
        return ChangeClothes;
      case 6:
        return BeinvitedAction;
      case 7:
        return FingerGuess;
      case 8:
        return RichPoint;
      case 9:
        return PopularityPoint;
      case 10:
        return CupPoint;
      case 11:
        return LevelPoint;
      case 12:
        return FireWorksArea;
      case 13:
        return ActionInSpring;
      default:
        return null;
    }
  }
}
