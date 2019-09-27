// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface PartitionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.PartitionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);

  /**
   * <code>optional string dbName = 2;</code>
   */
  boolean hasDbName();
  /**
   * <code>optional string dbName = 2;</code>
   */
  java.lang.String getDbName();
  /**
   * <code>optional string dbName = 2;</code>
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string tableName = 3;</code>
   */
  boolean hasTableName();
  /**
   * <code>optional string tableName = 3;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string tableName = 3;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * storage descriptor
   * </pre>
   *
   * <code>optional .alluxio.grpc.catalog.Storage storage = 4;</code>
   */
  boolean hasStorage();
  /**
   * <pre>
   * storage descriptor
   * </pre>
   *
   * <code>optional .alluxio.grpc.catalog.Storage storage = 4;</code>
   */
  alluxio.grpc.catalog.Storage getStorage();
  /**
   * <pre>
   * storage descriptor
   * </pre>
   *
   * <code>optional .alluxio.grpc.catalog.Storage storage = 4;</code>
   */
  alluxio.grpc.catalog.StorageOrBuilder getStorageOrBuilder();

  /**
   * <code>map&lt;string, string&gt; parameters = 5;</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;string, string&gt; parameters = 5;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParameters();
  /**
   * <code>map&lt;string, string&gt; parameters = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParametersMap();
  /**
   * <code>map&lt;string, string&gt; parameters = 5;</code>
   */

  java.lang.String getParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; parameters = 5;</code>
   */

  java.lang.String getParametersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * column statistics for partition
   * </pre>
   *
   * <code>optional .alluxio.grpc.catalog.ColumnStatisticsInfo col_stats = 6;</code>
   */
  boolean hasColStats();
  /**
   * <pre>
   * column statistics for partition
   * </pre>
   *
   * <code>optional .alluxio.grpc.catalog.ColumnStatisticsInfo col_stats = 6;</code>
   */
  alluxio.grpc.catalog.ColumnStatisticsInfo getColStats();
  /**
   * <pre>
   * column statistics for partition
   * </pre>
   *
   * <code>optional .alluxio.grpc.catalog.ColumnStatisticsInfo col_stats = 6;</code>
   */
  alluxio.grpc.catalog.ColumnStatisticsInfoOrBuilder getColStatsOrBuilder();

  /**
   * <pre>
   * a map between file names and its parquet metadata info
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.catalog.ParquetMetadata&gt; file_metadata = 7;</code>
   */
  int getFileMetadataCount();
  /**
   * <pre>
   * a map between file names and its parquet metadata info
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.catalog.ParquetMetadata&gt; file_metadata = 7;</code>
   */
  boolean containsFileMetadata(
      java.lang.String key);
  /**
   * Use {@link #getFileMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, alluxio.grpc.catalog.ParquetMetadata>
  getFileMetadata();
  /**
   * <pre>
   * a map between file names and its parquet metadata info
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.catalog.ParquetMetadata&gt; file_metadata = 7;</code>
   */
  java.util.Map<java.lang.String, alluxio.grpc.catalog.ParquetMetadata>
  getFileMetadataMap();
  /**
   * <pre>
   * a map between file names and its parquet metadata info
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.catalog.ParquetMetadata&gt; file_metadata = 7;</code>
   */

  alluxio.grpc.catalog.ParquetMetadata getFileMetadataOrDefault(
      java.lang.String key,
      alluxio.grpc.catalog.ParquetMetadata defaultValue);
  /**
   * <pre>
   * a map between file names and its parquet metadata info
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.catalog.ParquetMetadata&gt; file_metadata = 7;</code>
   */

  alluxio.grpc.catalog.ParquetMetadata getFileMetadataOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 8;</code>
   */
  java.util.List<alluxio.grpc.catalog.FieldSchema> 
      getColsList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 8;</code>
   */
  alluxio.grpc.catalog.FieldSchema getCols(int index);
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 8;</code>
   */
  int getColsCount();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 8;</code>
   */
  java.util.List<? extends alluxio.grpc.catalog.FieldSchemaOrBuilder> 
      getColsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema cols = 8;</code>
   */
  alluxio.grpc.catalog.FieldSchemaOrBuilder getColsOrBuilder(
      int index);
}