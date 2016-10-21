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

public enum PointOrderStatus implements org.apache.thrift.TEnum {
  INIT(0),
  SUCCESS(1),
  RECHARGE_FAILE(2),
  SEND_MAIL_FAILE(3),
  DISCARD(4),
  APPEAL(5),
  DEALED(6),
  SEND_CHECK_CODE_FAILE(7);

  private final int value;

  private PointOrderStatus(int value) {
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
  public static PointOrderStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return INIT;
      case 1:
        return SUCCESS;
      case 2:
        return RECHARGE_FAILE;
      case 3:
        return SEND_MAIL_FAILE;
      case 4:
        return DISCARD;
      case 5:
        return APPEAL;
      case 6:
        return DEALED;
      case 7:
        return SEND_CHECK_CODE_FAILE;
      default:
        return null;
    }
  }
}
