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
 * 系统功能开关
 */
public enum ESystemSwitch implements org.apache.thrift.TEnum {
  /**
   * 客户端推送
   */
  NotificationPush(0),
  /**
   * 系统设置
   */
  SystemSettings(1),
  WebRecharge(2),
  Activity(3),
  StarPan(4),
  RechargeCheckTempAccount(5),
  Ask(6),
  Lottery(7),
  appstore(8),
  ConstellationSwap(9),
  VIP(10),
  RechargeAward(11),
  FPSCheck(12),
  ObserverLoadMusic(13),
  Guild(15),
  RechargeRecord(16),
  ScoreMallCheckCode(17),
  LoversMode(18),
  WeddingRoom(19),
  CloseFriend(20),
  Lover(21),
  SocreMall(22),
  DanceItem(23),
  PointWall(24),
  LimitBuy(25),
  FruitSlot(26),
  PicReview(27),
  ChatCD(28),
  PassModeMatchRoom(29),
  DMBanner(30),
  PassMode(31),
  Max(32);

  private final int value;

  private ESystemSwitch(int value) {
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
  public static ESystemSwitch findByValue(int value) { 
    switch (value) {
      case 0:
        return NotificationPush;
      case 1:
        return SystemSettings;
      case 2:
        return WebRecharge;
      case 3:
        return Activity;
      case 4:
        return StarPan;
      case 5:
        return RechargeCheckTempAccount;
      case 6:
        return Ask;
      case 7:
        return Lottery;
      case 8:
        return appstore;
      case 9:
        return ConstellationSwap;
      case 10:
        return VIP;
      case 11:
        return RechargeAward;
      case 12:
        return FPSCheck;
      case 13:
        return ObserverLoadMusic;
      case 15:
        return Guild;
      case 16:
        return RechargeRecord;
      case 17:
        return ScoreMallCheckCode;
      case 18:
        return LoversMode;
      case 19:
        return WeddingRoom;
      case 20:
        return CloseFriend;
      case 21:
        return Lover;
      case 22:
        return SocreMall;
      case 23:
        return DanceItem;
      case 24:
        return PointWall;
      case 25:
        return LimitBuy;
      case 26:
        return FruitSlot;
      case 27:
        return PicReview;
      case 28:
        return ChatCD;
      case 29:
        return PassModeMatchRoom;
      case 30:
        return DMBanner;
      case 31:
        return PassMode;
      case 32:
        return Max;
      default:
        return null;
    }
  }
}