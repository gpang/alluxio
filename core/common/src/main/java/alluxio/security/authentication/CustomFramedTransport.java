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

package alluxio.security.authentication;

import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportFactory;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public final class CustomFramedTransport extends TFramedTransport {
  private final TTransport mTransport;

  public CustomFramedTransport(TTransport transport, int maxLength) {
    super(transport, maxLength);
    mTransport = transport;
  }

  public CustomFramedTransport(TTransport transport) {
    super(transport);
    mTransport = transport;
  }

  public TTransport getUnderlyingTransport() {
    return mTransport;
  }

  public static class Factory extends TTransportFactory {
    private final int mMaxLength;

    public Factory() {
      mMaxLength = TFramedTransport.DEFAULT_MAX_LENGTH;
    }

    public Factory(int maxLength) {
      mMaxLength = maxLength;
    }

    @Override
    public TTransport getTransport(TTransport base) {
      return new CustomFramedTransport(base, mMaxLength);
    }
  }
}
