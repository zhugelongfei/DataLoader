/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ling9527.music.common.msg.auto.sc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SCUpdateRoomScene implements org.apache.thrift.TBase<SCUpdateRoomScene, SCUpdateRoomScene._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCUpdateRoomScene");

  private static final org.apache.thrift.protocol.TField ACTIVE_WAITING_SCENE_FIELD_DESC = new org.apache.thrift.protocol.TField("activeWaitingScene", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ACTIVE_STARTING_SCENE_FIELD_DESC = new org.apache.thrift.protocol.TField("activeStartingScene", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCUpdateRoomSceneStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCUpdateRoomSceneTupleSchemeFactory());
  }

  /**
   * 等待场景-现在等待场景不可选，预留
   */
  public List<Integer> activeWaitingScene; // optional
  /**
   * 开始场景
   */
  public List<Integer> activeStartingScene; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 等待场景-现在等待场景不可选，预留
     */
    ACTIVE_WAITING_SCENE((short)1, "activeWaitingScene"),
    /**
     * 开始场景
     */
    ACTIVE_STARTING_SCENE((short)2, "activeStartingScene");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACTIVE_WAITING_SCENE
          return ACTIVE_WAITING_SCENE;
        case 2: // ACTIVE_STARTING_SCENE
          return ACTIVE_STARTING_SCENE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.ACTIVE_WAITING_SCENE,_Fields.ACTIVE_STARTING_SCENE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTIVE_WAITING_SCENE, new org.apache.thrift.meta_data.FieldMetaData("activeWaitingScene", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.ACTIVE_STARTING_SCENE, new org.apache.thrift.meta_data.FieldMetaData("activeStartingScene", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCUpdateRoomScene.class, metaDataMap);
  }

  public SCUpdateRoomScene() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCUpdateRoomScene(SCUpdateRoomScene other) {
    if (other.isSetActiveWaitingScene()) {
      List<Integer> __this__activeWaitingScene = new ArrayList<Integer>();
      for (Integer other_element : other.activeWaitingScene) {
        __this__activeWaitingScene.add(other_element);
      }
      this.activeWaitingScene = __this__activeWaitingScene;
    }
    if (other.isSetActiveStartingScene()) {
      List<Integer> __this__activeStartingScene = new ArrayList<Integer>();
      for (Integer other_element : other.activeStartingScene) {
        __this__activeStartingScene.add(other_element);
      }
      this.activeStartingScene = __this__activeStartingScene;
    }
  }

  public SCUpdateRoomScene deepCopy() {
    return new SCUpdateRoomScene(this);
  }

  @Override
  public void clear() {
    this.activeWaitingScene = null;
    this.activeStartingScene = null;
  }

  public int getActiveWaitingSceneSize() {
    return (this.activeWaitingScene == null) ? 0 : this.activeWaitingScene.size();
  }

  public java.util.Iterator<Integer> getActiveWaitingSceneIterator() {
    return (this.activeWaitingScene == null) ? null : this.activeWaitingScene.iterator();
  }

  public void addToActiveWaitingScene(int elem) {
    if (this.activeWaitingScene == null) {
      this.activeWaitingScene = new ArrayList<Integer>();
    }
    this.activeWaitingScene.add(elem);
  }

  /**
   * 等待场景-现在等待场景不可选，预留
   */
  public List<Integer> getActiveWaitingScene() {
    return this.activeWaitingScene;
  }

  /**
   * 等待场景-现在等待场景不可选，预留
   */
  public SCUpdateRoomScene setActiveWaitingScene(List<Integer> activeWaitingScene) {
    this.activeWaitingScene = activeWaitingScene;
    return this;
  }

  public void unsetActiveWaitingScene() {
    this.activeWaitingScene = null;
  }

  /** Returns true if field activeWaitingScene is set (has been assigned a value) and false otherwise */
  public boolean isSetActiveWaitingScene() {
    return this.activeWaitingScene != null;
  }

  public void setActiveWaitingSceneIsSet(boolean value) {
    if (!value) {
      this.activeWaitingScene = null;
    }
  }

  public int getActiveStartingSceneSize() {
    return (this.activeStartingScene == null) ? 0 : this.activeStartingScene.size();
  }

  public java.util.Iterator<Integer> getActiveStartingSceneIterator() {
    return (this.activeStartingScene == null) ? null : this.activeStartingScene.iterator();
  }

  public void addToActiveStartingScene(int elem) {
    if (this.activeStartingScene == null) {
      this.activeStartingScene = new ArrayList<Integer>();
    }
    this.activeStartingScene.add(elem);
  }

  /**
   * 开始场景
   */
  public List<Integer> getActiveStartingScene() {
    return this.activeStartingScene;
  }

  /**
   * 开始场景
   */
  public SCUpdateRoomScene setActiveStartingScene(List<Integer> activeStartingScene) {
    this.activeStartingScene = activeStartingScene;
    return this;
  }

  public void unsetActiveStartingScene() {
    this.activeStartingScene = null;
  }

  /** Returns true if field activeStartingScene is set (has been assigned a value) and false otherwise */
  public boolean isSetActiveStartingScene() {
    return this.activeStartingScene != null;
  }

  public void setActiveStartingSceneIsSet(boolean value) {
    if (!value) {
      this.activeStartingScene = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTIVE_WAITING_SCENE:
      if (value == null) {
        unsetActiveWaitingScene();
      } else {
        setActiveWaitingScene((List<Integer>)value);
      }
      break;

    case ACTIVE_STARTING_SCENE:
      if (value == null) {
        unsetActiveStartingScene();
      } else {
        setActiveStartingScene((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTIVE_WAITING_SCENE:
      return getActiveWaitingScene();

    case ACTIVE_STARTING_SCENE:
      return getActiveStartingScene();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTIVE_WAITING_SCENE:
      return isSetActiveWaitingScene();
    case ACTIVE_STARTING_SCENE:
      return isSetActiveStartingScene();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCUpdateRoomScene)
      return this.equals((SCUpdateRoomScene)that);
    return false;
  }

  public boolean equals(SCUpdateRoomScene that) {
    if (that == null)
      return false;

    boolean this_present_activeWaitingScene = true && this.isSetActiveWaitingScene();
    boolean that_present_activeWaitingScene = true && that.isSetActiveWaitingScene();
    if (this_present_activeWaitingScene || that_present_activeWaitingScene) {
      if (!(this_present_activeWaitingScene && that_present_activeWaitingScene))
        return false;
      if (!this.activeWaitingScene.equals(that.activeWaitingScene))
        return false;
    }

    boolean this_present_activeStartingScene = true && this.isSetActiveStartingScene();
    boolean that_present_activeStartingScene = true && that.isSetActiveStartingScene();
    if (this_present_activeStartingScene || that_present_activeStartingScene) {
      if (!(this_present_activeStartingScene && that_present_activeStartingScene))
        return false;
      if (!this.activeStartingScene.equals(that.activeStartingScene))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SCUpdateRoomScene other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SCUpdateRoomScene typedOther = (SCUpdateRoomScene)other;

    lastComparison = Boolean.valueOf(isSetActiveWaitingScene()).compareTo(typedOther.isSetActiveWaitingScene());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActiveWaitingScene()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activeWaitingScene, typedOther.activeWaitingScene);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActiveStartingScene()).compareTo(typedOther.isSetActiveStartingScene());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActiveStartingScene()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activeStartingScene, typedOther.activeStartingScene);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SCUpdateRoomScene(");
    boolean first = true;

    if (isSetActiveWaitingScene()) {
      sb.append("activeWaitingScene:");
      if (this.activeWaitingScene == null) {
        sb.append("null");
      } else {
        sb.append(this.activeWaitingScene);
      }
      first = false;
    }
    if (isSetActiveStartingScene()) {
      if (!first) sb.append(", ");
      sb.append("activeStartingScene:");
      if (this.activeStartingScene == null) {
        sb.append("null");
      } else {
        sb.append(this.activeStartingScene);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCUpdateRoomSceneStandardSchemeFactory implements SchemeFactory {
    public SCUpdateRoomSceneStandardScheme getScheme() {
      return new SCUpdateRoomSceneStandardScheme();
    }
  }

  private static class SCUpdateRoomSceneStandardScheme extends StandardScheme<SCUpdateRoomScene> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCUpdateRoomScene struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTIVE_WAITING_SCENE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.activeWaitingScene = new ArrayList<Integer>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  int _elem42; // required
                  _elem42 = iprot.readI32();
                  struct.activeWaitingScene.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setActiveWaitingSceneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTIVE_STARTING_SCENE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list43 = iprot.readListBegin();
                struct.activeStartingScene = new ArrayList<Integer>(_list43.size);
                for (int _i44 = 0; _i44 < _list43.size; ++_i44)
                {
                  int _elem45; // required
                  _elem45 = iprot.readI32();
                  struct.activeStartingScene.add(_elem45);
                }
                iprot.readListEnd();
              }
              struct.setActiveStartingSceneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCUpdateRoomScene struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.activeWaitingScene != null) {
        if (struct.isSetActiveWaitingScene()) {
          oprot.writeFieldBegin(ACTIVE_WAITING_SCENE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.activeWaitingScene.size()));
            for (int _iter46 : struct.activeWaitingScene)
            {
              oprot.writeI32(_iter46);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.activeStartingScene != null) {
        if (struct.isSetActiveStartingScene()) {
          oprot.writeFieldBegin(ACTIVE_STARTING_SCENE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.activeStartingScene.size()));
            for (int _iter47 : struct.activeStartingScene)
            {
              oprot.writeI32(_iter47);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCUpdateRoomSceneTupleSchemeFactory implements SchemeFactory {
    public SCUpdateRoomSceneTupleScheme getScheme() {
      return new SCUpdateRoomSceneTupleScheme();
    }
  }

  private static class SCUpdateRoomSceneTupleScheme extends TupleScheme<SCUpdateRoomScene> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCUpdateRoomScene struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetActiveWaitingScene()) {
        optionals.set(0);
      }
      if (struct.isSetActiveStartingScene()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetActiveWaitingScene()) {
        {
          oprot.writeI32(struct.activeWaitingScene.size());
          for (int _iter48 : struct.activeWaitingScene)
          {
            oprot.writeI32(_iter48);
          }
        }
      }
      if (struct.isSetActiveStartingScene()) {
        {
          oprot.writeI32(struct.activeStartingScene.size());
          for (int _iter49 : struct.activeStartingScene)
          {
            oprot.writeI32(_iter49);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCUpdateRoomScene struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list50 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.activeWaitingScene = new ArrayList<Integer>(_list50.size);
          for (int _i51 = 0; _i51 < _list50.size; ++_i51)
          {
            int _elem52; // required
            _elem52 = iprot.readI32();
            struct.activeWaitingScene.add(_elem52);
          }
        }
        struct.setActiveWaitingSceneIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list53 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.activeStartingScene = new ArrayList<Integer>(_list53.size);
          for (int _i54 = 0; _i54 < _list53.size; ++_i54)
          {
            int _elem55; // required
            _elem55 = iprot.readI32();
            struct.activeStartingScene.add(_elem55);
          }
        }
        struct.setActiveStartingSceneIsSet(true);
      }
    }
  }

}
