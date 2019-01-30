// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface OpenFilePOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.OpenFilePOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.file.ReadPType readType = 1;</code>
   */
  boolean hasReadType();
  /**
   * <code>optional .alluxio.grpc.file.ReadPType readType = 1;</code>
   */
  alluxio.grpc.ReadPType getReadType();

  /**
   * <code>optional int32 maxUfsReadConcurrency = 2;</code>
   */
  boolean hasMaxUfsReadConcurrency();
  /**
   * <code>optional int32 maxUfsReadConcurrency = 2;</code>
   */
  int getMaxUfsReadConcurrency();

  /**
   * <code>optional string fileReadLocationPolicy = 3;</code>
   */
  boolean hasFileReadLocationPolicy();
  /**
   * <code>optional string fileReadLocationPolicy = 3;</code>
   */
  java.lang.String getFileReadLocationPolicy();
  /**
   * <code>optional string fileReadLocationPolicy = 3;</code>
   */
  com.google.protobuf.ByteString
      getFileReadLocationPolicyBytes();

  /**
   * <code>optional int32 hashingNumberOfShards = 4;</code>
   */
  boolean hasHashingNumberOfShards();
  /**
   * <code>optional int32 hashingNumberOfShards = 4;</code>
   */
  int getHashingNumberOfShards();

  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 5;</code>
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 5;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 5;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}