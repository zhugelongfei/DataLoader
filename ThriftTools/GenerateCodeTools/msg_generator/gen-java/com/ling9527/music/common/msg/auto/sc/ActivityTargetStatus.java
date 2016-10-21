/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto.sc;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * 活动目标状态
 */
public enum ActivityTargetStatus implements org.apache.thrift.TEnum {
  /**
   * 未开始
   */
  STATUS_NOT_START(0),
  /**
   * 进行中
   */
  STATUS_DOING(1),
  /**
   * 可领取
   */
  STATUS_CAN_GET_PRIZE(2),
  /**
   * 已完成
   */
  STATUS_PRIZED(3),
  /**
   * 已结束
   */
  STATUS_OVER(4);

  private final int value;

  private ActivityTargetStatus(int value) {
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
  public static ActivityTargetStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return STATUS_NOT_START;
      case 1:
        return STATUS_DOING;
      case 2:
        return STATUS_CAN_GET_PRIZE;
      case 3:
        return STATUS_PRIZED;
      case 4:
        return STATUS_OVER;
      default:
        return null;
    }
  }
}