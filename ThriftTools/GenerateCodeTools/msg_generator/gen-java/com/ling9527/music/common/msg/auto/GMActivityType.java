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

public enum GMActivityType implements org.apache.thrift.TEnum {
  DANCECOMPETION(0),
  EXCHANGE(1),
  SPECIALTIMELOGIN(2),
  FIRSTRECHARGE(3),
  RECHARGE(4),
  CONTIREACHGE(5),
  CONSUME(6),
  LOGINCONTINUE(7),
  LOGINCOUNT(8),
  COLLECT_EXCHARNGE(9);

  private final int value;

  private GMActivityType(int value) {
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
  public static GMActivityType findByValue(int value) { 
    switch (value) {
      case 0:
        return DANCECOMPETION;
      case 1:
        return EXCHANGE;
      case 2:
        return SPECIALTIMELOGIN;
      case 3:
        return FIRSTRECHARGE;
      case 4:
        return RECHARGE;
      case 5:
        return CONTIREACHGE;
      case 6:
        return CONSUME;
      case 7:
        return LOGINCONTINUE;
      case 8:
        return LOGINCOUNT;
      case 9:
        return COLLECT_EXCHARNGE;
      default:
        return null;
    }
  }
}