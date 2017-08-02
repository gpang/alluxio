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

package alluxio.master.file;

import alluxio.security.authentication.CustomFramedTransport;
import alluxio.thrift.FileSystemMasterClientService;

import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.transport.TSaslServerTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is a Thrift processor for file system master RPCs invoked by an Alluxio client.
 */
public final class FileSystemMasterClientServiceProcessor
    extends FileSystemMasterClientService.Processor {
  private static final Logger LOG =
      LoggerFactory.getLogger(FileSystemMasterClientServiceProcessor.class);

  /**
   * Creates a new instance of {@link FileSystemMasterClientServiceProcessor}.
   *
   * @param handler the handler for the processor
   */
  FileSystemMasterClientServiceProcessor(FileSystemMasterClientService.Iface handler) {
    super(handler);
  }

  @Override
  public boolean process(TProtocol in, TProtocol out) throws TException {
    TTransport transport = in.getTransport();
    LOG.info("process transport: {}", transport);
    if (transport instanceof TSaslServerTransport) {
      transport = ((TSaslServerTransport) transport).getUnderlyingTransport();
    } else if (transport instanceof CustomFramedTransport) {
      transport = ((CustomFramedTransport) transport).getUnderlyingTransport();
    }
    if (transport instanceof TSocket) {
      String ip = ((TSocket) transport).getSocket().getInetAddress().toString();
      // TODO(gpang): how to pass this ip to the RPC handler? thread local?
      LOG.info("process ip: {}", ip);
    } else {
      LOG.info("process ip: null");
    }
    return super.process(in, out);
  }
}
