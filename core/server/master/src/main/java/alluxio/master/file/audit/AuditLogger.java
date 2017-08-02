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

package alluxio.master.file.audit;

import alluxio.master.file.meta.Inode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AuditLogger {
  private static final Logger LOG = LoggerFactory.getLogger(AuditLogger.class);

  private final boolean mEnabled;

  /**
   * Constructs a new {@link AuditLogger}.
   */
  public AuditLogger() {
    mEnabled = LOG.isInfoEnabled();
  }

  public boolean isEnabled() {
    return mEnabled;
  }

  public void log(boolean authorized, String user, String remoteAddress, String command,
      String srcPath, Inode srcInode, String dstPath) {
    if (!mEnabled) {
      return;
    }
    // TODO(gpang): cache instance to prevent many object creation?
    StringBuilder sb = new StringBuilder();
    sb.append("allowed=").append(authorized).append('\t');
    sb.append("user=").append(user).append('\t');
    // TODO(gpang): how to get remote ip from thrift?
    sb.append("ip=").append(remoteAddress).append('\t');
    sb.append("cmd=").append(command).append('\t');
    // TODO(gpang): escape characters, like tab?
    sb.append("src=").append(srcPath).append('\t');
    sb.append("dst=").append(dstPath);
    if (srcInode != null) {
      sb.append('\t').append("perm=").append(srcInode.getOwner()).append(':')
          .append(srcInode.getGroup()).append(':').append(srcInode.getMode());
    }
    // TODO(gpang): look into async logger
    LOG.info(sb.toString());
  }
}
