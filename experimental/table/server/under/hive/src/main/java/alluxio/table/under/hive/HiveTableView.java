/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.table.under.hive;

import alluxio.grpc.FieldSchema;
import alluxio.grpc.FileStatistics;
import alluxio.grpc.PartitionInfo;
import alluxio.grpc.TableViewInfo;
import alluxio.table.common.TableView;

import java.util.List;
import java.util.Map;

/**
 * Hive table view implementation.
 */
public class HiveTableView implements TableView {
  private final HiveTable mTable;
  private final String mBaseLocation;
  private final Map<String, FileStatistics> mStatistics;
  private final List<FieldSchema> mPartitionCols;
  private final List<PartitionInfo> mPartitions;

  /**
   * Creates a new instance.
   *
   * @param table the hive table
   * @param baseLocation the base location
   * @param statistics the table statistics
   * @param partitionCols partition columns
   * @param partitions partitions
   */
  public HiveTableView(HiveTable table, String baseLocation,
      Map<String, FileStatistics> statistics,
      List<FieldSchema> partitionCols,
      List<PartitionInfo> partitions) {
    mTable = table;
    mBaseLocation = baseLocation;
    mStatistics = statistics;
    mPartitionCols = partitionCols;
    mPartitions = partitions;
  }

  @Override
  public String getBaseLocation() {
    return mBaseLocation;
  }

  @Override
  public Map<String, FileStatistics> getStatistics() {
    return mStatistics;
  }

  @Override
  public List<PartitionInfo> getPartitions() {
    return mPartitions;
  }

  @Override
  public List<FieldSchema> getPartitionCols() {
    return mPartitionCols;
  }

  @Override
  public TableViewInfo toProto(String viewName) {
    TableViewInfo.Builder builder = TableViewInfo.newBuilder()
        .setViewName(viewName)
        .setViewType("todo: hive parquet");

    // add the clustered columns
    for (FieldSchema column : mPartitionCols) {
      builder.addClusteredColumns(column);
    }
    return builder.build();
  }
}
