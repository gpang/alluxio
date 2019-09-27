// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

/**
 * Protobuf type {@code alluxio.grpc.catalog.Layout}
 */
public  final class Layout extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.catalog.Layout)
    LayoutOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Layout.newBuilder() to construct.
  private Layout(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Layout() {
    layoutType_ = "";
    layoutData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Layout(
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
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            layoutType_ = bs;
            break;
          }
          case 18: {
            alluxio.grpc.catalog.LayoutSpec.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = layoutSpec_.toBuilder();
            }
            layoutSpec_ = input.readMessage(alluxio.grpc.catalog.LayoutSpec.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(layoutSpec_);
              layoutSpec_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            bitField0_ |= 0x00000004;
            layoutData_ = input.readBytes();
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
    return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_Layout_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_Layout_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.catalog.Layout.class, alluxio.grpc.catalog.Layout.Builder.class);
  }

  private int bitField0_;
  public static final int LAYOUTTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object layoutType_;
  /**
   * <code>optional string layoutType = 1;</code>
   */
  public boolean hasLayoutType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string layoutType = 1;</code>
   */
  public java.lang.String getLayoutType() {
    java.lang.Object ref = layoutType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        layoutType_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string layoutType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLayoutTypeBytes() {
    java.lang.Object ref = layoutType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      layoutType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAYOUTSPEC_FIELD_NUMBER = 2;
  private alluxio.grpc.catalog.LayoutSpec layoutSpec_;
  /**
   * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
   */
  public boolean hasLayoutSpec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
   */
  public alluxio.grpc.catalog.LayoutSpec getLayoutSpec() {
    return layoutSpec_ == null ? alluxio.grpc.catalog.LayoutSpec.getDefaultInstance() : layoutSpec_;
  }
  /**
   * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
   */
  public alluxio.grpc.catalog.LayoutSpecOrBuilder getLayoutSpecOrBuilder() {
    return layoutSpec_ == null ? alluxio.grpc.catalog.LayoutSpec.getDefaultInstance() : layoutSpec_;
  }

  public static final int LAYOUTDATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString layoutData_;
  /**
   * <code>optional bytes layoutData = 3;</code>
   */
  public boolean hasLayoutData() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional bytes layoutData = 3;</code>
   */
  public com.google.protobuf.ByteString getLayoutData() {
    return layoutData_;
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
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, layoutType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getLayoutSpec());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(3, layoutData_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, layoutType_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLayoutSpec());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, layoutData_);
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
    if (!(obj instanceof alluxio.grpc.catalog.Layout)) {
      return super.equals(obj);
    }
    alluxio.grpc.catalog.Layout other = (alluxio.grpc.catalog.Layout) obj;

    boolean result = true;
    result = result && (hasLayoutType() == other.hasLayoutType());
    if (hasLayoutType()) {
      result = result && getLayoutType()
          .equals(other.getLayoutType());
    }
    result = result && (hasLayoutSpec() == other.hasLayoutSpec());
    if (hasLayoutSpec()) {
      result = result && getLayoutSpec()
          .equals(other.getLayoutSpec());
    }
    result = result && (hasLayoutData() == other.hasLayoutData());
    if (hasLayoutData()) {
      result = result && getLayoutData()
          .equals(other.getLayoutData());
    }
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
    if (hasLayoutType()) {
      hash = (37 * hash) + LAYOUTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getLayoutType().hashCode();
    }
    if (hasLayoutSpec()) {
      hash = (37 * hash) + LAYOUTSPEC_FIELD_NUMBER;
      hash = (53 * hash) + getLayoutSpec().hashCode();
    }
    if (hasLayoutData()) {
      hash = (37 * hash) + LAYOUTDATA_FIELD_NUMBER;
      hash = (53 * hash) + getLayoutData().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.catalog.Layout parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.catalog.Layout parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.Layout parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.Layout parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.catalog.Layout prototype) {
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
   * Protobuf type {@code alluxio.grpc.catalog.Layout}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.catalog.Layout)
      alluxio.grpc.catalog.LayoutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_Layout_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_Layout_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.catalog.Layout.class, alluxio.grpc.catalog.Layout.Builder.class);
    }

    // Construct using alluxio.grpc.catalog.Layout.newBuilder()
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
        getLayoutSpecFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      layoutType_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (layoutSpecBuilder_ == null) {
        layoutSpec_ = null;
      } else {
        layoutSpecBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      layoutData_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_Layout_descriptor;
    }

    public alluxio.grpc.catalog.Layout getDefaultInstanceForType() {
      return alluxio.grpc.catalog.Layout.getDefaultInstance();
    }

    public alluxio.grpc.catalog.Layout build() {
      alluxio.grpc.catalog.Layout result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.catalog.Layout buildPartial() {
      alluxio.grpc.catalog.Layout result = new alluxio.grpc.catalog.Layout(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.layoutType_ = layoutType_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      if (layoutSpecBuilder_ == null) {
        result.layoutSpec_ = layoutSpec_;
      } else {
        result.layoutSpec_ = layoutSpecBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.layoutData_ = layoutData_;
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
      if (other instanceof alluxio.grpc.catalog.Layout) {
        return mergeFrom((alluxio.grpc.catalog.Layout)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.catalog.Layout other) {
      if (other == alluxio.grpc.catalog.Layout.getDefaultInstance()) return this;
      if (other.hasLayoutType()) {
        bitField0_ |= 0x00000001;
        layoutType_ = other.layoutType_;
        onChanged();
      }
      if (other.hasLayoutSpec()) {
        mergeLayoutSpec(other.getLayoutSpec());
      }
      if (other.hasLayoutData()) {
        setLayoutData(other.getLayoutData());
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
      alluxio.grpc.catalog.Layout parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.catalog.Layout) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object layoutType_ = "";
    /**
     * <code>optional string layoutType = 1;</code>
     */
    public boolean hasLayoutType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string layoutType = 1;</code>
     */
    public java.lang.String getLayoutType() {
      java.lang.Object ref = layoutType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          layoutType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string layoutType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLayoutTypeBytes() {
      java.lang.Object ref = layoutType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        layoutType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string layoutType = 1;</code>
     */
    public Builder setLayoutType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      layoutType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string layoutType = 1;</code>
     */
    public Builder clearLayoutType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      layoutType_ = getDefaultInstance().getLayoutType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string layoutType = 1;</code>
     */
    public Builder setLayoutTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      layoutType_ = value;
      onChanged();
      return this;
    }

    private alluxio.grpc.catalog.LayoutSpec layoutSpec_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.catalog.LayoutSpec, alluxio.grpc.catalog.LayoutSpec.Builder, alluxio.grpc.catalog.LayoutSpecOrBuilder> layoutSpecBuilder_;
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public boolean hasLayoutSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public alluxio.grpc.catalog.LayoutSpec getLayoutSpec() {
      if (layoutSpecBuilder_ == null) {
        return layoutSpec_ == null ? alluxio.grpc.catalog.LayoutSpec.getDefaultInstance() : layoutSpec_;
      } else {
        return layoutSpecBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public Builder setLayoutSpec(alluxio.grpc.catalog.LayoutSpec value) {
      if (layoutSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        layoutSpec_ = value;
        onChanged();
      } else {
        layoutSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public Builder setLayoutSpec(
        alluxio.grpc.catalog.LayoutSpec.Builder builderForValue) {
      if (layoutSpecBuilder_ == null) {
        layoutSpec_ = builderForValue.build();
        onChanged();
      } else {
        layoutSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public Builder mergeLayoutSpec(alluxio.grpc.catalog.LayoutSpec value) {
      if (layoutSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002) &&
            layoutSpec_ != null &&
            layoutSpec_ != alluxio.grpc.catalog.LayoutSpec.getDefaultInstance()) {
          layoutSpec_ =
            alluxio.grpc.catalog.LayoutSpec.newBuilder(layoutSpec_).mergeFrom(value).buildPartial();
        } else {
          layoutSpec_ = value;
        }
        onChanged();
      } else {
        layoutSpecBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public Builder clearLayoutSpec() {
      if (layoutSpecBuilder_ == null) {
        layoutSpec_ = null;
        onChanged();
      } else {
        layoutSpecBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public alluxio.grpc.catalog.LayoutSpec.Builder getLayoutSpecBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLayoutSpecFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    public alluxio.grpc.catalog.LayoutSpecOrBuilder getLayoutSpecOrBuilder() {
      if (layoutSpecBuilder_ != null) {
        return layoutSpecBuilder_.getMessageOrBuilder();
      } else {
        return layoutSpec_ == null ?
            alluxio.grpc.catalog.LayoutSpec.getDefaultInstance() : layoutSpec_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.catalog.LayoutSpec layoutSpec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.catalog.LayoutSpec, alluxio.grpc.catalog.LayoutSpec.Builder, alluxio.grpc.catalog.LayoutSpecOrBuilder> 
        getLayoutSpecFieldBuilder() {
      if (layoutSpecBuilder_ == null) {
        layoutSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.catalog.LayoutSpec, alluxio.grpc.catalog.LayoutSpec.Builder, alluxio.grpc.catalog.LayoutSpecOrBuilder>(
                getLayoutSpec(),
                getParentForChildren(),
                isClean());
        layoutSpec_ = null;
      }
      return layoutSpecBuilder_;
    }

    private com.google.protobuf.ByteString layoutData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes layoutData = 3;</code>
     */
    public boolean hasLayoutData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes layoutData = 3;</code>
     */
    public com.google.protobuf.ByteString getLayoutData() {
      return layoutData_;
    }
    /**
     * <code>optional bytes layoutData = 3;</code>
     */
    public Builder setLayoutData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      layoutData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes layoutData = 3;</code>
     */
    public Builder clearLayoutData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      layoutData_ = getDefaultInstance().getLayoutData();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.catalog.Layout)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.catalog.Layout)
  private static final alluxio.grpc.catalog.Layout DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.catalog.Layout();
  }

  public static alluxio.grpc.catalog.Layout getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Layout>
      PARSER = new com.google.protobuf.AbstractParser<Layout>() {
    public Layout parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Layout(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Layout> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Layout> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.catalog.Layout getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
