/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import com.google.common.base.Objects;
import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import java.util.Collection;
import java.util.concurrent.Future;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.sal.core.api.Broker.ConsumerSession;
import org.opendaylight.controller.sal.core.api.BrokerService;
import org.opendaylight.controller.sal.core.api.Consumer;
import org.opendaylight.controller.sal.dom.broker.BrokerImpl;
import org.opendaylight.controller.sal.dom.broker.osgi.AbstractBrokerServiceProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.ProxyFactory;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

@SuppressWarnings("all")
public class ConsumerContextImpl implements ConsumerSession {
  private final Consumer _consumer;
  
  public Consumer getConsumer() {
    return this._consumer;
  }
  
  private BrokerImpl _broker;
  
  public BrokerImpl getBroker() {
    return this._broker;
  }
  
  public void setBroker(final BrokerImpl broker) {
    this._broker = broker;
  }
  
  private final ClassToInstanceMap<BrokerService> instantiatedServices = new Function0<ClassToInstanceMap<BrokerService>>() {
    public ClassToInstanceMap<BrokerService> apply() {
      MutableClassToInstanceMap<BrokerService> _create = MutableClassToInstanceMap.<BrokerService>create();
      return _create;
    }
  }.apply();
  
  private boolean closed = false;
  
  private BundleContext context;
  
  public ConsumerContextImpl(final Consumer consumer, final BundleContext ctx) {
    this._consumer = consumer;
    this.context = ctx;
  }
  
  public Future<RpcResult<CompositeNode>> rpc(final QName rpc, final CompositeNode input) {
    BrokerImpl _broker = this.getBroker();
    return _broker.invokeRpcAsync(rpc, input);
  }
  
  public <T extends BrokerService> T getService(final Class<T> service) {
    final T localProxy = this.instantiatedServices.<T>getInstance(service);
    boolean _notEquals = (!Objects.equal(localProxy, null));
    if (_notEquals) {
      return localProxy;
    }
    final ServiceReference<T> serviceRef = this.context.<T>getServiceReference(service);
    boolean _equals = Objects.equal(serviceRef, null);
    if (_equals) {
      return null;
    }
    final T serviceImpl = this.context.<T>getService(serviceRef);
    final T ret = ProxyFactory.<T>createProxy(serviceRef, serviceImpl);
    boolean _notEquals_1 = (!Objects.equal(ret, null));
    if (_notEquals_1) {
      this.instantiatedServices.<T>putInstance(service, ret);
    }
    return ret;
  }
  
  public void close() {
    try {
      final Collection<BrokerService> toStop = this.instantiatedServices.values();
      this.closed = true;
      for (final BrokerService brokerService : toStop) {
        if ((brokerService instanceof AbstractBrokerServiceProxy<?>)) {
          ((AutoCloseable) brokerService).close();
        }
      }
      BrokerImpl _broker = this.getBroker();
      _broker.consumerSessionClosed(this);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean isClosed() {
    return this.closed;
  }
}
