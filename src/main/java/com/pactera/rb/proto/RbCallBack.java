// source: grpc_message.proto

package com.pactera.rb.proto;

/**
 * <pre>
 * 定义Inner Class回调函数对象
 * </pre>
 *
 * Protobuf type {@code Robot.RbCallBack}
 */
public  final class RbCallBack extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Robot.RbCallBack)
    RbCallBackOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RbCallBack.newBuilder() to construct.
  private RbCallBack(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RbCallBack() {
    func_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RbCallBack(
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

            func_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              params_ = com.google.protobuf.MapField.newMapField(
                  ParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            params__ = input.readMessage(
                ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            params_.getMutableMap().put(
                params__.getKey(), params__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbCallBack_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbCallBack_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.pactera.rb.proto.RbCallBack.class, com.pactera.rb.proto.RbCallBack.Builder.class);
  }

  private int bitField0_;
  public static final int FUNC_FIELD_NUMBER = 1;
  private volatile java.lang.Object func_;
  /**
   * <pre>
   *函数名
   * </pre>
   *
   * <code>string func = 1;</code>
   */
  public java.lang.String getFunc() {
    java.lang.Object ref = func_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      func_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *函数名
   * </pre>
   *
   * <code>string func = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFuncBytes() {
    java.lang.Object ref = func_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      func_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMS_FIELD_NUMBER = 2;
  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.pactera.rb.proto.RobotProto.internal_static_Robot_RbCallBack_ParamsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> params_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   * <pre>
   *参数Map,k=paramName,v=paramValue
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public boolean containsParams(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getParams() {
    return getParamsMap();
  }
  /**
   * <pre>
   *参数Map,k=paramName,v=paramValue
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   * <pre>
   *参数Map,k=paramName,v=paramValue
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public java.lang.String getParamsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   *参数Map,k=paramName,v=paramValue
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public java.lang.String getParamsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getFuncBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, func_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParams(),
        ParamsDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFuncBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, func_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      params__ = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, params__);
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
    if (!(obj instanceof com.pactera.rb.proto.RbCallBack)) {
      return super.equals(obj);
    }
    com.pactera.rb.proto.RbCallBack other = (com.pactera.rb.proto.RbCallBack) obj;

    boolean result = true;
    result = result && getFunc()
        .equals(other.getFunc());
    result = result && internalGetParams().equals(
        other.internalGetParams());
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
    hash = (37 * hash) + FUNC_FIELD_NUMBER;
    hash = (53 * hash) + getFunc().hashCode();
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.pactera.rb.proto.RbCallBack parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbCallBack parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.pactera.rb.proto.RbCallBack parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.pactera.rb.proto.RbCallBack parseFrom(
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
  public static Builder newBuilder(com.pactera.rb.proto.RbCallBack prototype) {
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
   * 定义Inner Class回调函数对象
   * </pre>
   *
   * Protobuf type {@code Robot.RbCallBack}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Robot.RbCallBack)
      com.pactera.rb.proto.RbCallBackOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbCallBack_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbCallBack_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.pactera.rb.proto.RbCallBack.class, com.pactera.rb.proto.RbCallBack.Builder.class);
    }

    // Construct using com.pactera.rb.proto.RbCallBack.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      func_ = "";

      internalGetMutableParams().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.pactera.rb.proto.RobotProto.internal_static_Robot_RbCallBack_descriptor;
    }

    public com.pactera.rb.proto.RbCallBack getDefaultInstanceForType() {
      return com.pactera.rb.proto.RbCallBack.getDefaultInstance();
    }

    public com.pactera.rb.proto.RbCallBack build() {
      com.pactera.rb.proto.RbCallBack result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.pactera.rb.proto.RbCallBack buildPartial() {
      com.pactera.rb.proto.RbCallBack result = new com.pactera.rb.proto.RbCallBack(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.func_ = func_;
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
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
      if (other instanceof com.pactera.rb.proto.RbCallBack) {
        return mergeFrom((com.pactera.rb.proto.RbCallBack)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.pactera.rb.proto.RbCallBack other) {
      if (other == com.pactera.rb.proto.RbCallBack.getDefaultInstance()) return this;
      if (!other.getFunc().isEmpty()) {
        func_ = other.func_;
        onChanged();
      }
      internalGetMutableParams().mergeFrom(
          other.internalGetParams());
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
      com.pactera.rb.proto.RbCallBack parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.pactera.rb.proto.RbCallBack) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object func_ = "";
    /**
     * <pre>
     *函数名
     * </pre>
     *
     * <code>string func = 1;</code>
     */
    public java.lang.String getFunc() {
      java.lang.Object ref = func_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        func_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *函数名
     * </pre>
     *
     * <code>string func = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFuncBytes() {
      java.lang.Object ref = func_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        func_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *函数名
     * </pre>
     *
     * <code>string func = 1;</code>
     */
    public Builder setFunc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      func_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *函数名
     * </pre>
     *
     * <code>string func = 1;</code>
     */
    public Builder clearFunc() {
      
      func_ = getDefaultInstance().getFunc();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *函数名
     * </pre>
     *
     * <code>string func = 1;</code>
     */
    public Builder setFuncBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      func_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> params_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableParams() {
      onChanged();;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public boolean containsParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
      return getParamsMap();
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public java.lang.String getParamsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public java.lang.String getParamsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      internalGetMutableParams().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public Builder removeParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableParams().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */
    public Builder putParams(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableParams().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     *参数Map,k=paramName,v=paramValue
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public Builder putAllParams(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableParams().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:Robot.RbCallBack)
  }

  // @@protoc_insertion_point(class_scope:Robot.RbCallBack)
  private static final com.pactera.rb.proto.RbCallBack DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.pactera.rb.proto.RbCallBack();
  }

  public static com.pactera.rb.proto.RbCallBack getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RbCallBack>
      PARSER = new com.google.protobuf.AbstractParser<RbCallBack>() {
    public RbCallBack parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RbCallBack(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RbCallBack> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RbCallBack> getParserForType() {
    return PARSER;
  }

  public com.pactera.rb.proto.RbCallBack getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

