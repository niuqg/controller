/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.sal.core.api.data.DataProviderService;
import org.opendaylight.controller.sal.core.api.mount.MountProvisionInstance;
import org.opendaylight.controller.sal.core.api.mount.MountProvisionService;
import org.opendaylight.controller.sal.core.api.mount.MountProvisionService.MountProvisionListener;
import org.opendaylight.controller.sal.dom.broker.MountPointImpl;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.concepts.util.ListenerRegistry;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;

@SuppressWarnings("all")
public class MountPointManagerImpl implements MountProvisionService {
  private DataProviderService _dataBroker;
  
  public DataProviderService getDataBroker() {
    return this._dataBroker;
  }
  
  public void setDataBroker(final DataProviderService dataBroker) {
    this._dataBroker = dataBroker;
  }
  
  private final ListenerRegistry<MountProvisionListener> listeners = new Function0<ListenerRegistry<MountProvisionListener>>() {
    public ListenerRegistry<MountProvisionListener> apply() {
      ListenerRegistry<MountProvisionListener> _create = ListenerRegistry.<MountProvisionListener>create();
      return _create;
    }
  }.apply();
  
  private ConcurrentMap<InstanceIdentifier,MountPointImpl> mounts = new Function0<ConcurrentMap<InstanceIdentifier,MountPointImpl>>() {
    public ConcurrentMap<InstanceIdentifier,MountPointImpl> apply() {
      ConcurrentHashMap<InstanceIdentifier,MountPointImpl> _concurrentHashMap = new ConcurrentHashMap<InstanceIdentifier, MountPointImpl>();
      return _concurrentHashMap;
    }
  }.apply();
  
  public MountProvisionInstance createMountPoint(final InstanceIdentifier path) {
    boolean _containsKey = this.mounts.containsKey(path);
    boolean _not = (!_containsKey);
    Preconditions.checkState(_not, "Mount already created");
    MountPointImpl _mountPointImpl = new MountPointImpl(path);
    final MountPointImpl mount = _mountPointImpl;
    this.registerMountPoint(mount);
    this.mounts.put(path, mount);
    this.notifyMountCreated(path);
    return mount;
  }
  
  public void notifyMountCreated(final InstanceIdentifier identifier) {
    for (final ListenerRegistration<MountProvisionListener> listener : this.listeners) {
      MountProvisionListener _instance = listener.getInstance();
      _instance.onMountPointCreated(identifier);
    }
  }
  
  public Object registerMountPoint(final MountPointImpl impl) {
    return null;
  }
  
  public ListenerRegistration<MountProvisionListener> registerProvisionListener(final MountProvisionListener listener) {
    ListenerRegistration<MountProvisionListener> _register = this.listeners.register(listener);
    return _register;
  }
  
  public MountProvisionInstance createOrGetMountPoint(final InstanceIdentifier path) {
    final MountPointImpl mount = this.mounts.get(path);
    boolean _tripleEquals = (mount == null);
    if (_tripleEquals) {
      return this.createMountPoint(path);
    }
    return mount;
  }
  
  public MountProvisionInstance getMountPoint(final InstanceIdentifier path) {
    MountPointImpl _get = this.mounts.get(path);
    return _get;
  }
}
