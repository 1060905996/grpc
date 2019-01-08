// source: grpc_message.proto

package com.pactera.rb.proto;

/**
 * <pre>
 * 机器人反馈接口对象，修改日期20181116
 * 完成后 在grpc_message_pb2_grpc.py 修改 from protos import grpc_message_pb2 as grpc__message__pb2
 * </pre>
 *
 * Protobuf type {@code Robot.RbResponse}
 */
public  final class RbResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Robot.RbResponse)
    RbResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RbResponse.newBuilder() to construct.
  private RbResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RbResponse() {
    key_ = "";
    tts_ = "";
    screenShow_ = "";
    recommendList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    responseType_ = "";
    recommendVagueMsg_ = "";
    events_ = java.util.Collections.emptyList();
    actions_ = java.util.Collections.emptyList();
    path_ = "";
    context_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RbResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tts_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            screenShow_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              recommendList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            recommendList_.add(s);
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            responseType_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            recommendVagueMsg_ = s;
            break;
          }
          case 58: {
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              events_ = new java.util.ArrayList<com.pactera.rb.proto.RbCallBack>();
              mutable_bitField0_ |= 0x00000040;
            }
            events_.add(
                input.readMessage(com.pactera.rb.proto.RbCallBack.parser(), extensionRegistry));
            break;
          }
          case 66: {
            if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
              actions_ = new java.util.ArrayList<com.pactera.rb.proto.RbCallBack>();
              mutable_bitField0_ |= 0x00000080;
            }
            actions_.add(
                input.readMessage(com.pactera.rb.proto.RbCallBack.parser(), extensionRegistry));
            break;
          }
          case 74: {
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            context_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        recommendList_ = recommendList_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        events_ = java.util.Collections.unmodifiableList(events_);
      }
      if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
        actions_ = java.util.Collections.unmodifiableList(actions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pactera.rb.proto.RbResponse.class, com.pactera.rb.proto.RbResponse.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <pre>
   * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TTS_FIELD_NUMBER = 2;
  private volatile java.lang.Object tts_;
  /**
   * <code>string tts = 2;</code>
   */
  public java.lang.String getTts() {
    java.lang.Object ref = tts_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tts_ = s;
      return s;
    }
  }
  /**
   * <code>string tts = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTtsBytes() {
    java.lang.Object ref = tts_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tts_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCREENSHOW_FIELD_NUMBER = 3;
  private volatile java.lang.Object screenShow_;
  /**
   * <code>string screenShow = 3;</code>
   */
  public java.lang.String getScreenShow() {
    java.lang.Object ref = screenShow_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      screenShow_ = s;
      return s;
    }
  }
  /**
   * <code>string screenShow = 3;</code>
   */
  public com.google.protobuf.ByteString
      getScreenShowBytes() {
    java.lang.Object ref = screenShow_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      screenShow_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECOMMENDLIST_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList recommendList_;
  /**
   * <code>repeated string recommendList = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getRecommendListList() {
    return recommendList_;
  }
  /**
   * <code>repeated string recommendList = 4;</code>
   */
  public int getRecommendListCount() {
    return recommendList_.size();
  }
  /**
   * <code>repeated string recommendList = 4;</code>
   */
  public java.lang.String getRecommendList(int index) {
    return recommendList_.get(index);
  }
  /**
   * <code>repeated string recommendList = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRecommendListBytes(int index) {
    return recommendList_.getByteString(index);
  }

  public static final int RESPONSETYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object responseType_;
  /**
   * <code>string responseType = 5;</code>
   */
  public java.lang.String getResponseType() {
    java.lang.Object ref = responseType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseType_ = s;
      return s;
    }
  }
  /**
   * <code>string responseType = 5;</code>
   */
  public com.google.protobuf.ByteString
      getResponseTypeBytes() {
    java.lang.Object ref = responseType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECOMMENDVAGUEMSG_FIELD_NUMBER = 6;
  private volatile java.lang.Object recommendVagueMsg_;
  /**
   * <code>string recommendVagueMsg = 6;</code>
   */
  public java.lang.String getRecommendVagueMsg() {
    java.lang.Object ref = recommendVagueMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recommendVagueMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string recommendVagueMsg = 6;</code>
   */
  public com.google.protobuf.ByteString
      getRecommendVagueMsgBytes() {
    java.lang.Object ref = recommendVagueMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recommendVagueMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTS_FIELD_NUMBER = 7;
  private java.util.List<com.pactera.rb.proto.RbCallBack> events_;
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack events = 7;</code>
   */
  public java.util.List<com.pactera.rb.proto.RbCallBack> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack events = 7;</code>
   */
  public java.util.List<? extends com.pactera.rb.proto.RbCallBackOrBuilder> 
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack events = 7;</code>
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack events = 7;</code>
   */
  public com.pactera.rb.proto.RbCallBack getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack events = 7;</code>
   */
  public com.pactera.rb.proto.RbCallBackOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
  }

  public static final int ACTIONS_FIELD_NUMBER = 8;
  private java.util.List<com.pactera.rb.proto.RbCallBack> actions_;
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack actions = 8;</code>
   */
  public java.util.List<com.pactera.rb.proto.RbCallBack> getActionsList() {
    return actions_;
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack actions = 8;</code>
   */
  public java.util.List<? extends com.pactera.rb.proto.RbCallBackOrBuilder> 
      getActionsOrBuilderList() {
    return actions_;
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack actions = 8;</code>
   */
  public int getActionsCount() {
    return actions_.size();
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack actions = 8;</code>
   */
  public com.pactera.rb.proto.RbCallBack getActions(int index) {
    return actions_.get(index);
  }
  /**
   * <pre>
   *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
   * </pre>
   *
   * <code>repeated .Robot.RbCallBack actions = 8;</code>
   */
  public com.pactera.rb.proto.RbCallBackOrBuilder getActionsOrBuilder(
      int index) {
    return actions_.get(index);
  }

  public static final int PATH_FIELD_NUMBER = 9;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   *新增字段,节点搜索路径
   * </pre>
   *
   * <code>string path = 9;</code>
   */
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *新增字段,节点搜索路径
   * </pre>
   *
   * <code>string path = 9;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTEXT_FIELD_NUMBER = 10;
  private volatile java.lang.Object context_;
  /**
   * <pre>
   *&#47;/新增字段,上下文
   * </pre>
   *
   * <code>string context = 10;</code>
   */
  public java.lang.String getContext() {
    java.lang.Object ref = context_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      context_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *&#47;/新增字段,上下文
   * </pre>
   *
   * <code>string context = 10;</code>
   */
  public com.google.protobuf.ByteString
      getContextBytes() {
    java.lang.Object ref = context_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      context_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (!getTtsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tts_);
    }
    if (!getScreenShowBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, screenShow_);
    }
    for (int i = 0; i < recommendList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, recommendList_.getRaw(i));
    }
    if (!getResponseTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, responseType_);
    }
    if (!getRecommendVagueMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, recommendVagueMsg_);
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(7, events_.get(i));
    }
    for (int i = 0; i < actions_.size(); i++) {
      output.writeMessage(8, actions_.get(i));
    }
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, path_);
    }
    if (!getContextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, context_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (!getTtsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tts_);
    }
    if (!getScreenShowBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, screenShow_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < recommendList_.size(); i++) {
        dataSize += computeStringSizeNoTag(recommendList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRecommendListList().size();
    }
    if (!getResponseTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, responseType_);
    }
    if (!getRecommendVagueMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, recommendVagueMsg_);
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, events_.get(i));
    }
    for (int i = 0; i < actions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, actions_.get(i));
    }
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, path_);
    }
    if (!getContextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, context_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.pactera.rb.proto.RbResponse)) {
      return super.equals(obj);
    }
    com.pactera.rb.proto.RbResponse other = (com.pactera.rb.proto.RbResponse) obj;

    boolean result = true;
    result = result && getKey()
        .equals(other.getKey());
    result = result && getTts()
        .equals(other.getTts());
    result = result && getScreenShow()
        .equals(other.getScreenShow());
    result = result && getRecommendListList()
        .equals(other.getRecommendListList());
    result = result && getResponseType()
        .equals(other.getResponseType());
    result = result && getRecommendVagueMsg()
        .equals(other.getRecommendVagueMsg());
    result = result && getEventsList()
        .equals(other.getEventsList());
    result = result && getActionsList()
        .equals(other.getActionsList());
    result = result && getPath()
        .equals(other.getPath());
    result = result && getContext()
        .equals(other.getContext());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + TTS_FIELD_NUMBER;
    hash = (53 * hash) + getTts().hashCode();
    hash = (37 * hash) + SCREENSHOW_FIELD_NUMBER;
    hash = (53 * hash) + getScreenShow().hashCode();
    if (getRecommendListCount() > 0) {
      hash = (37 * hash) + RECOMMENDLIST_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendListList().hashCode();
    }
    hash = (37 * hash) + RESPONSETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseType().hashCode();
    hash = (37 * hash) + RECOMMENDVAGUEMSG_FIELD_NUMBER;
    hash = (53 * hash) + getRecommendVagueMsg().hashCode();
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    if (getActionsCount() > 0) {
      hash = (37 * hash) + ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActionsList().hashCode();
    }
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getContext().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pactera.rb.proto.RbResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pactera.rb.proto.RbResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pactera.rb.proto.RbResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.pactera.rb.proto.RbResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 机器人反馈接口对象，修改日期20181116
   * 完成后 在grpc_message_pb2_grpc.py 修改 from protos import grpc_message_pb2 as grpc__message__pb2
   * </pre>
   *
   * Protobuf type {@code Robot.RbResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Robot.RbResponse)
      com.pactera.rb.proto.RbResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pactera.rb.proto.RbResponse.class, com.pactera.rb.proto.RbResponse.Builder.class);
    }

    // Construct using com.pactera.rb.proto.RbResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEventsFieldBuilder();
        getActionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      key_ = "";

      tts_ = "";

      screenShow_ = "";

      recommendList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      responseType_ = "";

      recommendVagueMsg_ = "";

      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
      } else {
        eventsBuilder_.clear();
      }
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000080);
      } else {
        actionsBuilder_.clear();
      }
      path_ = "";

      context_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbResponse_descriptor;
    }

    public com.pactera.rb.proto.RbResponse getDefaultInstanceForType() {
      return com.pactera.rb.proto.RbResponse.getDefaultInstance();
    }

    public com.pactera.rb.proto.RbResponse build() {
      com.pactera.rb.proto.RbResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.pactera.rb.proto.RbResponse buildPartial() {
      com.pactera.rb.proto.RbResponse result = new com.pactera.rb.proto.RbResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.key_ = key_;
      result.tts_ = tts_;
      result.screenShow_ = screenShow_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        recommendList_ = recommendList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.recommendList_ = recommendList_;
      result.responseType_ = responseType_;
      result.recommendVagueMsg_ = recommendVagueMsg_;
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
      }
      if (actionsBuilder_ == null) {
        if (((bitField0_ & 0x00000080) == 0x00000080)) {
          actions_ = java.util.Collections.unmodifiableList(actions_);
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.actions_ = actions_;
      } else {
        result.actions_ = actionsBuilder_.build();
      }
      result.path_ = path_;
      result.context_ = context_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.pactera.rb.proto.RbResponse) {
        return mergeFrom((com.pactera.rb.proto.RbResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pactera.rb.proto.RbResponse other) {
      if (other == com.pactera.rb.proto.RbResponse.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (!other.getTts().isEmpty()) {
        tts_ = other.tts_;
        onChanged();
      }
      if (!other.getScreenShow().isEmpty()) {
        screenShow_ = other.screenShow_;
        onChanged();
      }
      if (!other.recommendList_.isEmpty()) {
        if (recommendList_.isEmpty()) {
          recommendList_ = other.recommendList_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureRecommendListIsMutable();
          recommendList_.addAll(other.recommendList_);
        }
        onChanged();
      }
      if (!other.getResponseType().isEmpty()) {
        responseType_ = other.responseType_;
        onChanged();
      }
      if (!other.getRecommendVagueMsg().isEmpty()) {
        recommendVagueMsg_ = other.recommendVagueMsg_;
        onChanged();
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000040);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
          }
        }
      }
      if (actionsBuilder_ == null) {
        if (!other.actions_.isEmpty()) {
          if (actions_.isEmpty()) {
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureActionsIsMutable();
            actions_.addAll(other.actions_);
          }
          onChanged();
        }
      } else {
        if (!other.actions_.isEmpty()) {
          if (actionsBuilder_.isEmpty()) {
            actionsBuilder_.dispose();
            actionsBuilder_ = null;
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000080);
            actionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getActionsFieldBuilder() : null;
          } else {
            actionsBuilder_.addAllMessages(other.actions_);
          }
        }
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getContext().isEmpty()) {
        context_ = other.context_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.pactera.rb.proto.RbResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pactera.rb.proto.RbResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
     * </pre>
     *
     * <code>string key = 1;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
     * </pre>
     *
     * <code>string key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
     * </pre>
     *
     * <code>string key = 1;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
     * </pre>
     *
     * <code>string key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 成员变量都有一个唯一的数字标志(Assigning Tags like =1,2,3)
     * </pre>
     *
     * <code>string key = 1;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tts_ = "";
    /**
     * <code>string tts = 2;</code>
     */
    public java.lang.String getTts() {
      java.lang.Object ref = tts_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tts_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tts = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTtsBytes() {
      java.lang.Object ref = tts_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tts_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tts = 2;</code>
     */
    public Builder setTts(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tts = 2;</code>
     */
    public Builder clearTts() {
      
      tts_ = getDefaultInstance().getTts();
      onChanged();
      return this;
    }
    /**
     * <code>string tts = 2;</code>
     */
    public Builder setTtsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tts_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object screenShow_ = "";
    /**
     * <code>string screenShow = 3;</code>
     */
    public java.lang.String getScreenShow() {
      java.lang.Object ref = screenShow_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        screenShow_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string screenShow = 3;</code>
     */
    public com.google.protobuf.ByteString
        getScreenShowBytes() {
      java.lang.Object ref = screenShow_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        screenShow_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string screenShow = 3;</code>
     */
    public Builder setScreenShow(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      screenShow_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string screenShow = 3;</code>
     */
    public Builder clearScreenShow() {
      
      screenShow_ = getDefaultInstance().getScreenShow();
      onChanged();
      return this;
    }
    /**
     * <code>string screenShow = 3;</code>
     */
    public Builder setScreenShowBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      screenShow_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList recommendList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRecommendListIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        recommendList_ = new com.google.protobuf.LazyStringArrayList(recommendList_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getRecommendListList() {
      return recommendList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public int getRecommendListCount() {
      return recommendList_.size();
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public java.lang.String getRecommendList(int index) {
      return recommendList_.get(index);
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRecommendListBytes(int index) {
      return recommendList_.getByteString(index);
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public Builder setRecommendList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRecommendListIsMutable();
      recommendList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public Builder addRecommendList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRecommendListIsMutable();
      recommendList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public Builder addAllRecommendList(
        java.lang.Iterable<java.lang.String> values) {
      ensureRecommendListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, recommendList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public Builder clearRecommendList() {
      recommendList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendList = 4;</code>
     */
    public Builder addRecommendListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRecommendListIsMutable();
      recommendList_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object responseType_ = "";
    /**
     * <code>string responseType = 5;</code>
     */
    public java.lang.String getResponseType() {
      java.lang.Object ref = responseType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string responseType = 5;</code>
     */
    public com.google.protobuf.ByteString
        getResponseTypeBytes() {
      java.lang.Object ref = responseType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string responseType = 5;</code>
     */
    public Builder setResponseType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      responseType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string responseType = 5;</code>
     */
    public Builder clearResponseType() {
      
      responseType_ = getDefaultInstance().getResponseType();
      onChanged();
      return this;
    }
    /**
     * <code>string responseType = 5;</code>
     */
    public Builder setResponseTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      responseType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object recommendVagueMsg_ = "";
    /**
     * <code>string recommendVagueMsg = 6;</code>
     */
    public java.lang.String getRecommendVagueMsg() {
      java.lang.Object ref = recommendVagueMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recommendVagueMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recommendVagueMsg = 6;</code>
     */
    public com.google.protobuf.ByteString
        getRecommendVagueMsgBytes() {
      java.lang.Object ref = recommendVagueMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recommendVagueMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recommendVagueMsg = 6;</code>
     */
    public Builder setRecommendVagueMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recommendVagueMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recommendVagueMsg = 6;</code>
     */
    public Builder clearRecommendVagueMsg() {
      
      recommendVagueMsg_ = getDefaultInstance().getRecommendVagueMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string recommendVagueMsg = 6;</code>
     */
    public Builder setRecommendVagueMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recommendVagueMsg_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.pactera.rb.proto.RbCallBack> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        events_ = new java.util.ArrayList<com.pactera.rb.proto.RbCallBack>(events_);
        bitField0_ |= 0x00000040;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pactera.rb.proto.RbCallBack, com.pactera.rb.proto.RbCallBack.Builder, com.pactera.rb.proto.RbCallBackOrBuilder> eventsBuilder_;

    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public java.util.List<com.pactera.rb.proto.RbCallBack> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public com.pactera.rb.proto.RbCallBack getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder setEvents(
        int index, com.pactera.rb.proto.RbCallBack value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder setEvents(
        int index, com.pactera.rb.proto.RbCallBack.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder addEvents(com.pactera.rb.proto.RbCallBack value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder addEvents(
        int index, com.pactera.rb.proto.RbCallBack value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder addEvents(
        com.pactera.rb.proto.RbCallBack.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder addEvents(
        int index, com.pactera.rb.proto.RbCallBack.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder addAllEvents(
        java.lang.Iterable<? extends com.pactera.rb.proto.RbCallBack> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public com.pactera.rb.proto.RbCallBack.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public com.pactera.rb.proto.RbCallBackOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public java.util.List<? extends com.pactera.rb.proto.RbCallBackOrBuilder> 
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public com.pactera.rb.proto.RbCallBack.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          com.pactera.rb.proto.RbCallBack.getDefaultInstance());
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public com.pactera.rb.proto.RbCallBack.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, com.pactera.rb.proto.RbCallBack.getDefaultInstance());
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack events = 7;</code>
     */
    public java.util.List<com.pactera.rb.proto.RbCallBack.Builder> 
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pactera.rb.proto.RbCallBack, com.pactera.rb.proto.RbCallBack.Builder, com.pactera.rb.proto.RbCallBackOrBuilder> 
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pactera.rb.proto.RbCallBack, com.pactera.rb.proto.RbCallBack.Builder, com.pactera.rb.proto.RbCallBackOrBuilder>(
                events_,
                ((bitField0_ & 0x00000040) == 0x00000040),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }

    private java.util.List<com.pactera.rb.proto.RbCallBack> actions_ =
      java.util.Collections.emptyList();
    private void ensureActionsIsMutable() {
      if (!((bitField0_ & 0x00000080) == 0x00000080)) {
        actions_ = new java.util.ArrayList<com.pactera.rb.proto.RbCallBack>(actions_);
        bitField0_ |= 0x00000080;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pactera.rb.proto.RbCallBack, com.pactera.rb.proto.RbCallBack.Builder, com.pactera.rb.proto.RbCallBackOrBuilder> actionsBuilder_;

    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public java.util.List<com.pactera.rb.proto.RbCallBack> getActionsList() {
      if (actionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(actions_);
      } else {
        return actionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public int getActionsCount() {
      if (actionsBuilder_ == null) {
        return actions_.size();
      } else {
        return actionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public com.pactera.rb.proto.RbCallBack getActions(int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);
      } else {
        return actionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder setActions(
        int index, com.pactera.rb.proto.RbCallBack value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.set(index, value);
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder setActions(
        int index, com.pactera.rb.proto.RbCallBack.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.set(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder addActions(com.pactera.rb.proto.RbCallBack value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder addActions(
        int index, com.pactera.rb.proto.RbCallBack value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(index, value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder addActions(
        com.pactera.rb.proto.RbCallBack.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder addActions(
        int index, com.pactera.rb.proto.RbCallBack.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder addAllActions(
        java.lang.Iterable<? extends com.pactera.rb.proto.RbCallBack> values) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, actions_);
        onChanged();
      } else {
        actionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder clearActions() {
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
      } else {
        actionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public Builder removeActions(int index) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.remove(index);
        onChanged();
      } else {
        actionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public com.pactera.rb.proto.RbCallBack.Builder getActionsBuilder(
        int index) {
      return getActionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public com.pactera.rb.proto.RbCallBackOrBuilder getActionsOrBuilder(
        int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);  } else {
        return actionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public java.util.List<? extends com.pactera.rb.proto.RbCallBackOrBuilder> 
         getActionsOrBuilderList() {
      if (actionsBuilder_ != null) {
        return actionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(actions_);
      }
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public com.pactera.rb.proto.RbCallBack.Builder addActionsBuilder() {
      return getActionsFieldBuilder().addBuilder(
          com.pactera.rb.proto.RbCallBack.getDefaultInstance());
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public com.pactera.rb.proto.RbCallBack.Builder addActionsBuilder(
        int index) {
      return getActionsFieldBuilder().addBuilder(
          index, com.pactera.rb.proto.RbCallBack.getDefaultInstance());
    }
    /**
     * <pre>
     *等同 List&lt;RbCallBack&gt;, k函数名，v参数 json封装
     * </pre>
     *
     * <code>repeated .Robot.RbCallBack actions = 8;</code>
     */
    public java.util.List<com.pactera.rb.proto.RbCallBack.Builder> 
         getActionsBuilderList() {
      return getActionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.pactera.rb.proto.RbCallBack, com.pactera.rb.proto.RbCallBack.Builder, com.pactera.rb.proto.RbCallBackOrBuilder> 
        getActionsFieldBuilder() {
      if (actionsBuilder_ == null) {
        actionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.pactera.rb.proto.RbCallBack, com.pactera.rb.proto.RbCallBack.Builder, com.pactera.rb.proto.RbCallBackOrBuilder>(
                actions_,
                ((bitField0_ & 0x00000080) == 0x00000080),
                getParentForChildren(),
                isClean());
        actions_ = null;
      }
      return actionsBuilder_;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     *新增字段,节点搜索路径
     * </pre>
     *
     * <code>string path = 9;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *新增字段,节点搜索路径
     * </pre>
     *
     * <code>string path = 9;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *新增字段,节点搜索路径
     * </pre>
     *
     * <code>string path = 9;</code>
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *新增字段,节点搜索路径
     * </pre>
     *
     * <code>string path = 9;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *新增字段,节点搜索路径
     * </pre>
     *
     * <code>string path = 9;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object context_ = "";
    /**
     * <pre>
     *&#47;/新增字段,上下文
     * </pre>
     *
     * <code>string context = 10;</code>
     */
    public java.lang.String getContext() {
      java.lang.Object ref = context_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        context_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *&#47;/新增字段,上下文
     * </pre>
     *
     * <code>string context = 10;</code>
     */
    public com.google.protobuf.ByteString
        getContextBytes() {
      java.lang.Object ref = context_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        context_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47;/新增字段,上下文
     * </pre>
     *
     * <code>string context = 10;</code>
     */
    public Builder setContext(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      context_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47;/新增字段,上下文
     * </pre>
     *
     * <code>string context = 10;</code>
     */
    public Builder clearContext() {
      
      context_ = getDefaultInstance().getContext();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47;/新增字段,上下文
     * </pre>
     *
     * <code>string context = 10;</code>
     */
    public Builder setContextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      context_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Robot.RbResponse)
  }

  // @@protoc_insertion_point(class_scope:Robot.RbResponse)
  private static final com.pactera.rb.proto.RbResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pactera.rb.proto.RbResponse();
  }

  public static com.pactera.rb.proto.RbResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RbResponse>
      PARSER = new com.google.protobuf.AbstractParser<RbResponse>() {
    public RbResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RbResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RbResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RbResponse> getParserForType() {
    return PARSER;
  }

  public com.pactera.rb.proto.RbResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

