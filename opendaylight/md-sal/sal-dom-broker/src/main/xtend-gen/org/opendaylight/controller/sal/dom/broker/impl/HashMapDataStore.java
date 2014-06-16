/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.md.sal.common.api.data.DataCommitHandler.DataCommitTransaction;
import org.opendaylight.controller.md.sal.common.api.data.DataModification;
import org.opendaylight.controller.sal.common.util.Rpcs;
import org.opendaylight.controller.sal.core.api.data.DataStore;
import org.opendaylight.controller.sal.dom.broker.impl.HashMapDataStoreTransaction;
import org.opendaylight.yangtools.yang.common.RpcError;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public final class HashMapDataStore implements DataStore, AutoCloseable {
  private final Logger LOG = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = LoggerFactory.getLogger(HashMapDataStore.class);
      return _logger;
    }
  }.apply();
  
  private final Map<InstanceIdentifier,CompositeNode> configuration = new Function0<Map<InstanceIdentifier,CompositeNode>>() {
    public Map<InstanceIdentifier,CompositeNode> apply() {
      ConcurrentHashMap<InstanceIdentifier,CompositeNode> _concurrentHashMap = new ConcurrentHashMap<InstanceIdentifier, CompositeNode>();
      return _concurrentHashMap;
    }
  }.apply();
  
  private final Map<InstanceIdentifier,CompositeNode> operational = new Function0<Map<InstanceIdentifier,CompositeNode>>() {
    public Map<InstanceIdentifier,CompositeNode> apply() {
      ConcurrentHashMap<InstanceIdentifier,CompositeNode> _concurrentHashMap = new ConcurrentHashMap<InstanceIdentifier, CompositeNode>();
      return _concurrentHashMap;
    }
  }.apply();
  
  public boolean containsConfigurationPath(final InstanceIdentifier path) {
    return this.configuration.containsKey(path);
  }
  
  public boolean containsOperationalPath(final InstanceIdentifier path) {
    return this.operational.containsKey(path);
  }
  
  public Iterable<InstanceIdentifier> getStoredConfigurationPaths() {
    Set<InstanceIdentifier> _keySet = this.configuration.keySet();
    return _keySet;
  }
  
  public Iterable<InstanceIdentifier> getStoredOperationalPaths() {
    Set<InstanceIdentifier> _keySet = this.operational.keySet();
    return _keySet;
  }
  
  public CompositeNode readConfigurationData(final InstanceIdentifier path) {
    CompositeNode _xblockexpression = null;
    {
      this.LOG.trace("Reading configuration path {}", path);
      CompositeNode _get = this.configuration.get(path);
      _xblockexpression = (_get);
    }
    return _xblockexpression;
  }
  
  public CompositeNode readOperationalData(final InstanceIdentifier path) {
    CompositeNode _xblockexpression = null;
    {
      this.LOG.trace("Reading operational path {}", path);
      CompositeNode _get = this.operational.get(path);
      _xblockexpression = (_get);
    }
    return _xblockexpression;
  }
  
  public DataCommitTransaction<InstanceIdentifier,CompositeNode> requestCommit(final DataModification<InstanceIdentifier,CompositeNode> modification) {
    HashMapDataStoreTransaction _hashMapDataStoreTransaction = new HashMapDataStoreTransaction(modification, this);
    return _hashMapDataStoreTransaction;
  }
  
  public RpcResult<Void> rollback(final HashMapDataStoreTransaction transaction) {
    Set<RpcError> _emptySet = Collections.<RpcError>emptySet();
    return Rpcs.<Void>getRpcResult(true, null, _emptySet);
  }
  
  public RpcResult<Void> finish(final HashMapDataStoreTransaction transaction) {
    final DataModification<InstanceIdentifier,CompositeNode> modification = transaction.getModification();
    Set<InstanceIdentifier> _removedConfigurationData = modification.getRemovedConfigurationData();
    for (final InstanceIdentifier removal : _removedConfigurationData) {
      {
        this.LOG.trace("Removing configuration path {}", removal);
        this.remove(this.configuration, removal);
      }
    }
    Set<InstanceIdentifier> _removedOperationalData = modification.getRemovedOperationalData();
    for (final InstanceIdentifier removal_1 : _removedOperationalData) {
      {
        this.LOG.trace("Removing operational path {}", removal_1);
        this.remove(this.operational, removal_1);
      }
    }
    boolean _isTraceEnabled = this.LOG.isTraceEnabled();
    if (_isTraceEnabled) {
      Map<InstanceIdentifier,CompositeNode> _updatedConfigurationData = modification.getUpdatedConfigurationData();
      Set<InstanceIdentifier> _keySet = _updatedConfigurationData.keySet();
      for (final InstanceIdentifier a : _keySet) {
        this.LOG.trace("Adding configuration path {}", a);
      }
      Map<InstanceIdentifier,CompositeNode> _updatedOperationalData = modification.getUpdatedOperationalData();
      Set<InstanceIdentifier> _keySet_1 = _updatedOperationalData.keySet();
      for (final InstanceIdentifier a_1 : _keySet_1) {
        this.LOG.trace("Adding operational path {}", a_1);
      }
    }
    Map<InstanceIdentifier,CompositeNode> _updatedConfigurationData_1 = modification.getUpdatedConfigurationData();
    this.configuration.putAll(_updatedConfigurationData_1);
    Map<InstanceIdentifier,CompositeNode> _updatedOperationalData_1 = modification.getUpdatedOperationalData();
    this.operational.putAll(_updatedOperationalData_1);
    Set<RpcError> _emptySet = Collections.<RpcError>emptySet();
    return Rpcs.<Void>getRpcResult(true, null, _emptySet);
  }
  
  public void remove(final Map<InstanceIdentifier,CompositeNode> map, final InstanceIdentifier identifier) {
    HashSet<InstanceIdentifier> _hashSet = new HashSet<InstanceIdentifier>();
    final HashSet<InstanceIdentifier> affected = _hashSet;
    Set<InstanceIdentifier> _keySet = map.keySet();
    for (final InstanceIdentifier path : _keySet) {
      boolean _contains = identifier.contains(path);
      if (_contains) {
        affected.add(path);
      }
    }
    for (final InstanceIdentifier pathToRemove : affected) {
      {
        this.LOG.trace("Removed path {}", pathToRemove);
        map.remove(pathToRemove);
      }
    }
  }
  
  public void close() {
  }
}
