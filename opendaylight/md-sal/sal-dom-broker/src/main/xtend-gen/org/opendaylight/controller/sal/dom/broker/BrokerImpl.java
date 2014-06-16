/**
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import com.google.common.base.Objects;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.md.sal.common.api.routing.RouteChangeListener;
import org.opendaylight.controller.sal.core.api.Broker;
import org.opendaylight.controller.sal.core.api.Broker.ConsumerSession;
import org.opendaylight.controller.sal.core.api.Broker.ProviderSession;
import org.opendaylight.controller.sal.core.api.Broker.RoutedRpcRegistration;
import org.opendaylight.controller.sal.core.api.Broker.RpcRegistration;
import org.opendaylight.controller.sal.core.api.Consumer;
import org.opendaylight.controller.sal.core.api.Provider;
import org.opendaylight.controller.sal.core.api.RoutedRpcDefaultImplementation;
import org.opendaylight.controller.sal.core.api.RpcImplementation;
import org.opendaylight.controller.sal.core.api.RpcProvisionRegistry;
import org.opendaylight.controller.sal.core.api.RpcRegistrationListener;
import org.opendaylight.controller.sal.core.api.RpcRoutingContext;
import org.opendaylight.controller.sal.dom.broker.ConsumerContextImpl;
import org.opendaylight.controller.sal.dom.broker.ProviderContextImpl;
import org.opendaylight.controller.sal.dom.broker.spi.RpcRouter;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class BrokerImpl implements Broker, RpcProvisionRegistry, AutoCloseable {
  private final static Logger log = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = LoggerFactory.getLogger(BrokerImpl.class);
      return _logger;
    }
  }.apply();
  
  private final Set<ConsumerContextImpl> sessions = new Function0<Set<ConsumerContextImpl>>() {
    public Set<ConsumerContextImpl> apply() {
      HashSet<ConsumerContextImpl> _hashSet = new HashSet<ConsumerContextImpl>();
      Set<ConsumerContextImpl> _synchronizedSet = Collections.<ConsumerContextImpl>synchronizedSet(_hashSet);
      return _synchronizedSet;
    }
  }.apply();
  
  private final Set<ProviderContextImpl> providerSessions = new Function0<Set<ProviderContextImpl>>() {
    public Set<ProviderContextImpl> apply() {
      HashSet<ProviderContextImpl> _hashSet = new HashSet<ProviderContextImpl>();
      Set<ProviderContextImpl> _synchronizedSet = Collections.<ProviderContextImpl>synchronizedSet(_hashSet);
      return _synchronizedSet;
    }
  }.apply();
  
  private BundleContext _bundleContext;
  
  public BundleContext getBundleContext() {
    return this._bundleContext;
  }
  
  public void setBundleContext(final BundleContext bundleContext) {
    this._bundleContext = bundleContext;
  }
  
  private AutoCloseable _deactivator;
  
  public AutoCloseable getDeactivator() {
    return this._deactivator;
  }
  
  public void setDeactivator(final AutoCloseable deactivator) {
    this._deactivator = deactivator;
  }
  
  private RpcRouter _router;
  
  public RpcRouter getRouter() {
    return this._router;
  }
  
  public void setRouter(final RpcRouter router) {
    this._router = router;
  }
  
  public ConsumerSession registerConsumer(final Consumer consumer, final BundleContext ctx) {
    this.checkPredicates(consumer);
    String _plus = ("Registering consumer " + consumer);
    BrokerImpl.log.trace(_plus);
    final ConsumerContextImpl session = this.newSessionFor(consumer, ctx);
    consumer.onSessionInitiated(session);
    this.sessions.add(session);
    return session;
  }
  
  public ProviderSession registerProvider(final Provider provider, final BundleContext ctx) {
    this.checkPredicates(provider);
    final ProviderContextImpl session = this.newSessionFor(provider, ctx);
    provider.onSessionInitiated(session);
    this.providerSessions.add(session);
    return session;
  }
  
  protected ListenableFuture<RpcResult<CompositeNode>> invokeRpcAsync(final QName rpc, final CompositeNode input) {
    RpcRouter _router = this.getRouter();
    return _router.invokeRpc(rpc, input);
  }
  
  private void checkPredicates(final Provider prov) {
    boolean _equals = Objects.equal(prov, null);
    if (_equals) {
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException("Provider should not be null.");
      throw _illegalArgumentException;
    }
    for (final ProviderContextImpl session : this.providerSessions) {
      Provider _provider = session.getProvider();
      boolean _equals_1 = prov.equals(_provider);
      if (_equals_1) {
        IllegalStateException _illegalStateException = new IllegalStateException("Provider already registered");
        throw _illegalStateException;
      }
    }
  }
  
  private void checkPredicates(final Consumer cons) {
    boolean _equals = Objects.equal(cons, null);
    if (_equals) {
      IllegalArgumentException _illegalArgumentException = new IllegalArgumentException("Consumer should not be null.");
      throw _illegalArgumentException;
    }
    for (final ConsumerContextImpl session : this.sessions) {
      Consumer _consumer = session.getConsumer();
      boolean _equals_1 = cons.equals(_consumer);
      if (_equals_1) {
        IllegalStateException _illegalStateException = new IllegalStateException("Consumer already registered");
        throw _illegalStateException;
      }
    }
  }
  
  private ConsumerContextImpl newSessionFor(final Consumer provider, final BundleContext ctx) {
    ConsumerContextImpl _consumerContextImpl = new ConsumerContextImpl(provider, ctx);
    final ConsumerContextImpl ret = _consumerContextImpl;
    ret.setBroker(this);
    return ret;
  }
  
  private ProviderContextImpl newSessionFor(final Provider provider, final BundleContext ctx) {
    ProviderContextImpl _providerContextImpl = new ProviderContextImpl(provider, ctx);
    final ProviderContextImpl ret = _providerContextImpl;
    ret.setBroker(this);
    return ret;
  }
  
  protected void consumerSessionClosed(final ConsumerContextImpl consumerContextImpl) {
    this.sessions.remove(consumerContextImpl);
    this.providerSessions.remove(consumerContextImpl);
  }
  
  public void close() throws Exception {
    AutoCloseable _deactivator = this.getDeactivator();
    if (_deactivator!=null) {
      _deactivator.close();
    }
  }
  
  public RpcRegistration addRpcImplementation(final QName rpcType, final RpcImplementation implementation) throws IllegalArgumentException {
    RpcRouter _router = this.getRouter();
    RpcRegistration _addRpcImplementation = _router.addRpcImplementation(rpcType, implementation);
    return _addRpcImplementation;
  }
  
  public RoutedRpcRegistration addRoutedRpcImplementation(final QName rpcType, final RpcImplementation implementation) {
    RpcRouter _router = this.getRouter();
    RoutedRpcRegistration _addRoutedRpcImplementation = _router.addRoutedRpcImplementation(rpcType, implementation);
    return _addRoutedRpcImplementation;
  }
  
  public void setRoutedRpcDefaultDelegate(final RoutedRpcDefaultImplementation defaultImplementation) {
    RpcRouter _router = this.getRouter();
    _router.setRoutedRpcDefaultDelegate(defaultImplementation);
  }
  
  public ListenerRegistration<RpcRegistrationListener> addRpcRegistrationListener(final RpcRegistrationListener listener) {
    RpcRouter _router = this.getRouter();
    return _router.addRpcRegistrationListener(listener);
  }
  
  public <L extends RouteChangeListener<RpcRoutingContext,InstanceIdentifier>> ListenerRegistration<L> registerRouteChangeListener(final L listener) {
    RpcRouter _router = this.getRouter();
    return _router.<L>registerRouteChangeListener(listener);
  }
  
  public Set<QName> getSupportedRpcs() {
    RpcRouter _router = this.getRouter();
    return _router.getSupportedRpcs();
  }
  
  public ListenableFuture<RpcResult<CompositeNode>> invokeRpc(final QName rpc, final CompositeNode input) {
    RpcRouter _router = this.getRouter();
    return _router.invokeRpc(rpc, input);
  }
}
