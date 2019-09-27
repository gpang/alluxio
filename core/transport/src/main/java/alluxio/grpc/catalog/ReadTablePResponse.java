// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

/**
 * Protobuf type {@code alluxio.grpc.catalog.ReadTablePResponse}
 */
public  final class ReadTablePResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.catalog.ReadTablePResponse)
    ReadTablePResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadTablePResponse.newBuilder() to construct.
  private ReadTablePResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadTablePResponse() {
    partitions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReadTablePResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              partitions_ = new java.util.ArrayList<alluxio.grpc.catalog.PartitionInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            partitions_.add(
                input.readMessage(alluxio.grpc.catalog.PartitionInfo.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        partitions_ = java.util.Collections.unmodifiableList(partitions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_ReadTablePResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_ReadTablePResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.catalog.ReadTablePResponse.class, alluxio.grpc.catalog.ReadTablePResponse.Builder.class);
  }

  public static final int PARTITIONS_FIELD_NUMBER = 1;
  private java.util.List<alluxio.grpc.catalog.PartitionInfo> partitions_;
  /**
   * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
   */
  public java.util.List<alluxio.grpc.catalog.PartitionInfo> getPartitionsList() {
    return partitions_;
  }
  /**
   * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
   */
  public java.util.List<? extends alluxio.grpc.catalog.PartitionInfoOrBuilder> 
      getPartitionsOrBuilderList() {
    return partitions_;
  }
  /**
   * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
   */
  public int getPartitionsCount() {
    return partitions_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
   */
  public alluxio.grpc.catalog.PartitionInfo getPartitions(int index) {
    return partitions_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
   */
  public alluxio.grpc.catalog.PartitionInfoOrBuilder getPartitionsOrBuilder(
      int index) {
    return partitions_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getPartitionsCount(); i++) {
      if (!getPartitions(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < partitions_.size(); i++) {
      output.writeMessage(1, partitions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < partitions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, partitions_.get(i));
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
    if (!(obj instanceof alluxio.grpc.catalog.ReadTablePResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.catalog.ReadTablePResponse other = (alluxio.grpc.catalog.ReadTablePResponse) obj;

    boolean result = true;
    result = result && getPartitionsList()
        .equals(other.getPartitionsList());
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
    if (getPartitionsCount() > 0) {
      hash = (37 * hash) + PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.ReadTablePResponse parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.catalog.ReadTablePResponse prototype) {
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
   * Protobuf type {@code alluxio.grpc.catalog.ReadTablePResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.catalog.ReadTablePResponse)
      alluxio.grpc.catalog.ReadTablePResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_ReadTablePResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_ReadTablePResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.catalog.ReadTablePResponse.class, alluxio.grpc.catalog.ReadTablePResponse.Builder.class);
    }

    // Construct using alluxio.grpc.catalog.ReadTablePResponse.newBuilder()
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
        getPartitionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        partitionsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_ReadTablePResponse_descriptor;
    }

    public alluxio.grpc.catalog.ReadTablePResponse getDefaultInstanceForType() {
      return alluxio.grpc.catalog.ReadTablePResponse.getDefaultInstance();
    }

    public alluxio.grpc.catalog.ReadTablePResponse build() {
      alluxio.grpc.catalog.ReadTablePResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.catalog.ReadTablePResponse buildPartial() {
      alluxio.grpc.catalog.ReadTablePResponse result = new alluxio.grpc.catalog.ReadTablePResponse(this);
      int from_bitField0_ = bitField0_;
      if (partitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          partitions_ = java.util.Collections.unmodifiableList(partitions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.partitions_ = partitions_;
      } else {
        result.partitions_ = partitionsBuilder_.build();
      }
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
      if (other instanceof alluxio.grpc.catalog.ReadTablePResponse) {
        return mergeFrom((alluxio.grpc.catalog.ReadTablePResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.catalog.ReadTablePResponse other) {
      if (other == alluxio.grpc.catalog.ReadTablePResponse.getDefaultInstance()) return this;
      if (partitionsBuilder_ == null) {
        if (!other.partitions_.isEmpty()) {
          if (partitions_.isEmpty()) {
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartitionsIsMutable();
            partitions_.addAll(other.partitions_);
          }
          onChanged();
        }
      } else {
        if (!other.partitions_.isEmpty()) {
          if (partitionsBuilder_.isEmpty()) {
            partitionsBuilder_.dispose();
            partitionsBuilder_ = null;
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partitionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartitionsFieldBuilder() : null;
          } else {
            partitionsBuilder_.addAllMessages(other.partitions_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      for (int i = 0; i < getPartitionsCount(); i++) {
        if (!getPartitions(i).isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.catalog.ReadTablePResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.catalog.ReadTablePResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<alluxio.grpc.catalog.PartitionInfo> partitions_ =
      java.util.Collections.emptyList();
    private void ensurePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        partitions_ = new java.util.ArrayList<alluxio.grpc.catalog.PartitionInfo>(partitions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.catalog.PartitionInfo, alluxio.grpc.catalog.PartitionInfo.Builder, alluxio.grpc.catalog.PartitionInfoOrBuilder> partitionsBuilder_;

    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public java.util.List<alluxio.grpc.catalog.PartitionInfo> getPartitionsList() {
      if (partitionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partitions_);
      } else {
        return partitionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public int getPartitionsCount() {
      if (partitionsBuilder_ == null) {
        return partitions_.size();
      } else {
        return partitionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public alluxio.grpc.catalog.PartitionInfo getPartitions(int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);
      } else {
        return partitionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder setPartitions(
        int index, alluxio.grpc.catalog.PartitionInfo value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.set(index, value);
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder setPartitions(
        int index, alluxio.grpc.catalog.PartitionInfo.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.set(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder addPartitions(alluxio.grpc.catalog.PartitionInfo value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder addPartitions(
        int index, alluxio.grpc.catalog.PartitionInfo value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(index, value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder addPartitions(
        alluxio.grpc.catalog.PartitionInfo.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder addPartitions(
        int index, alluxio.grpc.catalog.PartitionInfo.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder addAllPartitions(
        java.lang.Iterable<? extends alluxio.grpc.catalog.PartitionInfo> values) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, partitions_);
        onChanged();
      } else {
        partitionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder clearPartitions() {
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partitionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public Builder removePartitions(int index) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.remove(index);
        onChanged();
      } else {
        partitionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public alluxio.grpc.catalog.PartitionInfo.Builder getPartitionsBuilder(
        int index) {
      return getPartitionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public alluxio.grpc.catalog.PartitionInfoOrBuilder getPartitionsOrBuilder(
        int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);  } else {
        return partitionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public java.util.List<? extends alluxio.grpc.catalog.PartitionInfoOrBuilder> 
         getPartitionsOrBuilderList() {
      if (partitionsBuilder_ != null) {
        return partitionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partitions_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public alluxio.grpc.catalog.PartitionInfo.Builder addPartitionsBuilder() {
      return getPartitionsFieldBuilder().addBuilder(
          alluxio.grpc.catalog.PartitionInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public alluxio.grpc.catalog.PartitionInfo.Builder addPartitionsBuilder(
        int index) {
      return getPartitionsFieldBuilder().addBuilder(
          index, alluxio.grpc.catalog.PartitionInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.catalog.PartitionInfo partitions = 1;</code>
     */
    public java.util.List<alluxio.grpc.catalog.PartitionInfo.Builder> 
         getPartitionsBuilderList() {
      return getPartitionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.catalog.PartitionInfo, alluxio.grpc.catalog.PartitionInfo.Builder, alluxio.grpc.catalog.PartitionInfoOrBuilder> 
        getPartitionsFieldBuilder() {
      if (partitionsBuilder_ == null) {
        partitionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.catalog.PartitionInfo, alluxio.grpc.catalog.PartitionInfo.Builder, alluxio.grpc.catalog.PartitionInfoOrBuilder>(
                partitions_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        partitions_ = null;
      }
      return partitionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.catalog.ReadTablePResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.catalog.ReadTablePResponse)
  private static final alluxio.grpc.catalog.ReadTablePResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.catalog.ReadTablePResponse();
  }

  public static alluxio.grpc.catalog.ReadTablePResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ReadTablePResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadTablePResponse>() {
    public ReadTablePResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReadTablePResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadTablePResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadTablePResponse> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.catalog.ReadTablePResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

