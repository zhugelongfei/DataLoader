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

public enum MallShowIndex implements org.apache.thrift.TEnum {
  NEW(0),
  CLOTHING(1),
  ACCESSORY(2),
  PROP(3),
  VIP(4),
  POINT(5),
  GIFT(6),
  MAX(7);

  private final int value;

  private MallShowIndex(int value) {
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
  public static MallShowIndex findByValue(int value) { 
    switch (value) {
      case 0:
        return NEW;
      case 1:
        return CLOTHING;
      case 2:
        return ACCESSORY;
      case 3:
        return PROP;
      case 4:
        return VIP;
      case 5:
        return POINT;
      case 6:
        return GIFT;
      case 7:
        return MAX;
      default:
        return null;
    }
  }
}
