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

public enum OperType implements org.apache.thrift.TEnum {
  VERSION_CHECK(0),
  CHANGE_AVATAR(1),
  ADJUST_AVATAR(2),
  BUF_FROM_SHOPCART(3),
  SAVE_FAVORITES(4),
  PUT_FAVORITES(5),
  GET_GM_PRIZE(6),
  QUERY_IAP(7),
  RECHARGE(8),
  SEND_VOICE_MAIL(9);

  private final int value;

  private OperType(int value) {
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
  public static OperType findByValue(int value) { 
    switch (value) {
      case 0:
        return VERSION_CHECK;
      case 1:
        return CHANGE_AVATAR;
      case 2:
        return ADJUST_AVATAR;
      case 3:
        return BUF_FROM_SHOPCART;
      case 4:
        return SAVE_FAVORITES;
      case 5:
        return PUT_FAVORITES;
      case 6:
        return GET_GM_PRIZE;
      case 7:
        return QUERY_IAP;
      case 8:
        return RECHARGE;
      case 9:
        return SEND_VOICE_MAIL;
      default:
        return null;
    }
  }
}
