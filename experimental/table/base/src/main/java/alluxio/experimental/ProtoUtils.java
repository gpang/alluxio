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

package alluxio.experimental;

import alluxio.grpc.catalog.Layout;
import alluxio.grpc.catalog.Partition;
import alluxio.grpc.catalog.PartitionInfo;

import com.google.protobuf.InvalidProtocolBufferException;

import java.util.Objects;

/**
 * Protobuf related utils.
 */
public final class ProtoUtils {
  /**
   * @param partition the partition proto
   * @return true if the partition has the hive layout, false otherwise
   */
  public static boolean isHiveLayout(Partition partition) {
    if (!partition.hasLayout()) {
      return false;
    }
    Layout layout = partition.getLayout();
    // TODO(gpang): use a layout registry
    return Objects.equals(layout.getLayoutType(), "hive");
  }

  /**
   * @param partition the partition proto
   * @return the hive-specific partition proto
   */
  public static PartitionInfo extractHiveLayout(Partition partition)
      throws InvalidProtocolBufferException {
    if (!isHiveLayout(partition)) {
      if (partition.hasLayout()) {
        throw new IllegalStateException(
            "Cannot parse hive-layout. layoutType: " + partition.getLayout().getLayoutType());
      } else {
        throw new IllegalStateException("Cannot parse hive-layout from missing layout");
      }
    }
    Layout layout = partition.getLayout();
    if (!layout.hasLayoutData()) {
      throw new IllegalStateException("Cannot parse hive-layout from empty layout data");
    }
    return PartitionInfo.parseFrom(layout.getLayoutData());
  }
}