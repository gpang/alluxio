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

package alluxio.stress.worker;

import alluxio.Constants;
import alluxio.stress.Summary;
import alluxio.stress.graph.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;

/**
 * The summary for the master stress tests.
 */
public final class WorkerBenchSummary implements Summary {
  private WorkerBenchParameters mParameters;

  private long mDurationMs;
  private long mEndTimeMs;
  private long mIOBytes;
  private List<String> mNodes;
  private Map<String, List<String>> mErrors;

  /**
   * Creates an instance.
   */
  public WorkerBenchSummary() {
    // Default constructor required for json deserialization
  }

  /**
   * Creates an instance.
   *
   * @param mergedTaskResults the merged task result
   * @param nodes the list of nodes
   * @param errors the list of errors
   */
  public WorkerBenchSummary(WorkerBenchTaskResult mergedTaskResults, List<String> nodes,
      Map<String, List<String>> errors) throws DataFormatException {
    mDurationMs = mergedTaskResults.getEndMs() - mergedTaskResults.getRecordStartMs();
    mEndTimeMs = mergedTaskResults.getEndMs();
    mIOBytes = mergedTaskResults.getIOBytes();
    mParameters = mergedTaskResults.getParameters();
    mNodes = nodes;
    mErrors = errors;
  }

  /**
   * @return the throughput (MB/s)
   */
  public float getIOMBps() {
    return ((float) mIOBytes / mDurationMs) * 1000.0f / Constants.MB;
  }

  /**
   * @param ioMBps the throughput (MB / s)
   */
  public void setIOMBps(float ioMBps) {
    // ignore, since this is computed dynamically
  }

  /**
   * @return the duration (in ms)
   */
  public long getDurationMs() {
    return mDurationMs;
  }

  /**
   * @param durationMs the duration (in ms)
   */
  public void setDurationMs(long durationMs) {
    mDurationMs = durationMs;
  }

  /**
   * @return the parameters
   */
  public WorkerBenchParameters getParameters() {
    return mParameters;
  }

  /**
   * @param parameters the parameters
   */
  public void setParameters(WorkerBenchParameters parameters) {
    mParameters = parameters;
  }

  /**
   * @return the list of nodes
   */
  public List<String> getNodes() {
    return mNodes;
  }

  /**
   * @param nodes the list of nodes
   */
  public void setNodes(List<String> nodes) {
    mNodes = nodes;
  }

  /**
   * @return the errors
   */
  public Map<String, List<String>> getErrors() {
    return mErrors;
  }

  /**
   * @param errors the errors
   */
  public void setErrors(Map<String, List<String>> errors) {
    mErrors = errors;
  }

  /**
   * @return the end time (in ms)
   */
  public long getEndTimeMs() {
    return mEndTimeMs;
  }

  /**
   * @param endTimeMs the end time (in ms)
   */
  public void setEndTimeMs(long endTimeMs) {
    mEndTimeMs = endTimeMs;
  }

  private List<String> collectErrors() {
    List<String> errors = new ArrayList<>();
    for (Map.Entry<String, List<String>> entry : mErrors.entrySet()) {
      // add all the errors for this node, with the node appended to prefix
      errors.addAll(entry.getValue().stream().map(err -> entry.getKey() + ": " + err)
          .collect(Collectors.toList()));
    }
    return errors;
  }

  @Override
  public alluxio.stress.GraphGenerator graphGenerator() {
    return new GraphGenerator();
  }

  /**
   * The graph generator for this summary.
   */
  public static final class GraphGenerator extends alluxio.stress.GraphGenerator {
    @Override
    public List<Graph> generate(List<? extends Summary> results) {
      List<Graph> graphs = new ArrayList<>();
      // TODO(gpang): implement graphs
      return graphs;
    }
  }
}
