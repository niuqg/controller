/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker.impl;

import org.opendaylight.controller.md.sal.common.api.data.DataCommitHandler.DataCommitTransaction;
import org.opendaylight.controller.md.sal.common.api.data.DataModification;
import org.opendaylight.controller.sal.dom.broker.impl.HashMapDataStore;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;

@SuppressWarnings("all")
public class HashMapDataStoreTransaction implements DataCommitTransaction<InstanceIdentifier,CompositeNode> {
  private final DataModification<InstanceIdentifier,CompositeNode> _modification;
  
  private final HashMapDataStore _datastore;
  
  public HashMapDataStore getDatastore() {
    return this._datastore;
  }
  
  public HashMapDataStoreTransaction(final DataModification<InstanceIdentifier,CompositeNode> modify, final HashMapDataStore store) {
    this._modification = modify;
    this._datastore = store;
  }
  
  public RpcResult<Void> finish() throws IllegalStateException {
    HashMapDataStore _datastore = this.getDatastore();
    RpcResult<Void> _finish = _datastore.finish(this);
    return _finish;
  }
  
  public DataModification<InstanceIdentifier,CompositeNode> getModification() {
    return this._modification;
  }
  
  public RpcResult<Void> rollback() throws IllegalStateException {
    HashMapDataStore _datastore = this.getDatastore();
    RpcResult<Void> _rollback = _datastore.rollback(this);
    return _rollback;
  }
}
