// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface SchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 1;</code>
   */
  java.util.List<alluxio.grpc.catalog.FieldSchema> 
      getColsList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 1;</code>
   */
  alluxio.grpc.catalog.FieldSchema getCols(int index);
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 1;</code>
   */
  int getColsCount();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.catalog.FieldSchemaOrBuilder> 
      getColsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 1;</code>
   */
  alluxio.grpc.catalog.FieldSchemaOrBuilder getColsOrBuilder(
      int index);
}