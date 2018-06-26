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

package alluxio.master.file.meta;

/**
 * This class represents an indexable extended by 1 entry.
 */
public class IndexableExtended<T> implements Indexable<T> {
  private final Indexable<T> mBase;
  private final T mNext;

  public IndexableExtended(Indexable<T> base, T next) {
    mBase = base;
    mNext = next;
  }

  @Override
  public T get(int index) {
    if (index < mBase.size()) {
      return mBase.get(index);
    } else if (index == mBase.size()) {
      return mNext;
    }
    throw new IllegalArgumentException("Indexable index out of bounds: " + index);
  }

  @Override
  public int size() {
    return mBase.size() + 1;
  }
}
