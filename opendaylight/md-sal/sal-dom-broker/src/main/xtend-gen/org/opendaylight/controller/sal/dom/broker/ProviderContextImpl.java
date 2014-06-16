/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.sal.core.api.Broker.ProviderSession;
import org.opendaylight.controller.sal.core.api.Broker.RoutedRpcRegistration;
import org.opendaylight.controller.sal.core.api.Broker.RpcRegistration;
import org.opendaylight.controller.sal.core.api.Provider;
import org.opendaylight.controller.sal.core.api.RpcImplementation;
import org.opendaylight.controller.sal.core.api.RpcRegistrationListener;
import org.opendaylight.controller.sal.dom.broker.BrokerImpl;
import org.opendaylight.controller.sal.dom.broker.ConsumerContextImpl;
import org.opendaylight.controller.sal.dom.broker.RpcRegistrationWrapper;
import org.opendaylight.controller.sal.dom.broker.spi.RpcRouter;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.concepts.Registration;
import org.opendaylight.yangtools.yang.common.QName;
import org.osgi.framework.BundleContext;

@SuppressWarnings("all")
public class ProviderContextImpl extends ConsumerContextImpl implements ProviderSession {
  private final Provider _provider;
  
  public Provider getProvider() {
    return this._provider;
  }
  
  private final Set<Registration<? extends Object>> registrations = new Function0<Set<Registration<? extends Object>>>() {
    public Set<Registration<? extends Object>> apply() {
      HashSet<Registration<? extends Object>> _hashSet = new HashSet<Registration<?>>();
      return _hashSet;
    }
  }.apply();
  
  public ProviderContextImpl(final Provider provider, final BundleContext ctx) {
    super(null, ctx);
    this._provider = provider;
  }
  
  public RpcRegistration addRpcImplementation(final QName rpcType, final RpcImplementation implementation) throws IllegalArgumentException {
    BrokerImpl _broker = this.getBroker();
    RpcRouter _router = _broker.getRouter();
    final RpcRegistration origReg = _router.addRpcImplementation(rpcType, implementation);
    RpcRegistrationWrapper _rpcRegistrationWrapper = new RpcRegistrationWrapper(origReg);
    final RpcRegistrationWrapper newReg = _rpcRegistrationWrapper;
    this.registrations.add(newReg);
    return newReg;
  }
  
  protected boolean removeRpcImplementation(final RpcRegistrationWrapper implToRemove) throws IllegalArgumentException {
    boolean _remove = this.registrations.remove(implToRemove);
    return _remove;
  }
  
  public void close() {
    try {
      for (final Registration<? extends Object> reg : this.registrations) {
        reg.close();
      }
      super.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public RoutedRpcRegistration addMountedRpcImplementation(final QName rpcType, final RpcImplementation implementation) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public RoutedRpcRegistration addRoutedRpcImplementation(final QName rpcType, final RpcImplementation implementation) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public Set<QName> getSupportedRpcs() {
    BrokerImpl _broker = this.getBroker();
    RpcRouter _router = _broker.getRouter();
    Set _supportedRpcs = _router.getSupportedRpcs();
    return _supportedRpcs;
  }
  
  public ListenerRegistration<RpcRegistrationListener> addRpcRegistrationListener(final RpcRegistrationListener listener) {
    BrokerImpl _broker = this.getBroker();
    RpcRouter _router = _broker.getRouter();
    ListenerRegistration<RpcRegistrationListener> _addRpcRegistrationListener = _router.addRpcRegistrationListener(listener);
    return _addRpcRegistrationListener;
  }
}
