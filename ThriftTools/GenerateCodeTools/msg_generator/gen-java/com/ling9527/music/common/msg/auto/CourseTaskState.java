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

public enum CourseTaskState implements org.apache.thrift.TEnum {
  NotActive(0),
  Active(1),
  Complete(2),
  PRIZED(3),
  Faild(4);

  private final int value;

  private CourseTaskState(int value) {
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
  public static CourseTaskState findByValue(int value) { 
    switch (value) {
      case 0:
        return NotActive;
      case 1:
        return Active;
      case 2:
        return Complete;
      case 3:
        return PRIZED;
      case 4:
        return Faild;
      default:
        return null;
    }
  }
}
