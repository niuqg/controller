/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker.osgi;

import java.util.Arrays;
import org.opendaylight.controller.md.sal.dom.api.DOMDataBroker;
import org.opendaylight.controller.sal.core.api.BrokerService;
import org.opendaylight.controller.sal.core.api.RpcProvisionRegistry;
import org.opendaylight.controller.sal.core.api.data.DataBrokerService;
import org.opendaylight.controller.sal.core.api.data.DataProviderService;
import org.opendaylight.controller.sal.core.api.model.SchemaService;
import org.opendaylight.controller.sal.core.api.mount.MountProvisionService;
import org.opendaylight.controller.sal.core.api.notify.NotificationPublishService;
import org.opendaylight.controller.sal.core.api.notify.NotificationService;
import org.opendaylight.controller.sal.dom.broker.osgi.DOMDataBrokerProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.DataBrokerServiceProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.DataProviderServiceProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.MountProviderServiceProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.NotificationPublishServiceProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.NotificationServiceProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.RpcProvisionRegistryProxy;
import org.opendaylight.controller.sal.dom.broker.osgi.SchemaServiceProxy;
import org.osgi.framework.ServiceReference;

@SuppressWarnings("all")
public class ProxyFactory {
  public static <T extends BrokerService> T createProxy(final ServiceReference<T> serviceRef, final T service) {
    Object _createProxyImpl = ProxyFactory.createProxyImpl(serviceRef, service);
    return ((T) _createProxyImpl);
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final DataBrokerService service) {
    DataBrokerServiceProxy _dataBrokerServiceProxy = new DataBrokerServiceProxy(((ServiceReference<DataBrokerService>) ref), service);
    return _dataBrokerServiceProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final DataProviderService service) {
    DataProviderServiceProxy _dataProviderServiceProxy = new DataProviderServiceProxy(((ServiceReference<DataProviderService>) ref), service);
    return _dataProviderServiceProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final NotificationPublishService service) {
    NotificationPublishServiceProxy _notificationPublishServiceProxy = new NotificationPublishServiceProxy(((ServiceReference<NotificationPublishService>) ref), service);
    return _notificationPublishServiceProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final NotificationService service) {
    NotificationServiceProxy _notificationServiceProxy = new NotificationServiceProxy(((ServiceReference<NotificationService>) ref), service);
    return _notificationServiceProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final MountProvisionService service) {
    MountProviderServiceProxy _mountProviderServiceProxy = new MountProviderServiceProxy(((ServiceReference<MountProvisionService>) ref), service);
    return _mountProviderServiceProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final SchemaService service) {
    SchemaServiceProxy _schemaServiceProxy = new SchemaServiceProxy(((ServiceReference<SchemaService>) ref), service);
    return _schemaServiceProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> ref, final RpcProvisionRegistry service) {
    RpcProvisionRegistryProxy _rpcProvisionRegistryProxy = new RpcProvisionRegistryProxy(((ServiceReference<RpcProvisionRegistry>) ref), service);
    return _rpcProvisionRegistryProxy;
  }
  
  private static DOMDataBrokerProxy _createProxyImpl(final ServiceReference<? extends Object> ref, final DOMDataBroker service) {
    DOMDataBrokerProxy _dOMDataBrokerProxy = new DOMDataBrokerProxy(((ServiceReference<DOMDataBroker>) ref), service);
    return _dOMDataBrokerProxy;
  }
  
  private static Object _createProxyImpl(final ServiceReference<? extends Object> reference, final BrokerService service) {
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException("Not supported class");
    throw _illegalArgumentException;
  }
  
  private static Object createProxyImpl(final ServiceReference<? extends Object> ref, final BrokerService service) {
    if (service instanceof DOMDataBroker) {
      return _createProxyImpl(ref, (DOMDataBroker)service);
    } else if (service instanceof RpcProvisionRegistry) {
      return _createProxyImpl(ref, (RpcProvisionRegistry)service);
    } else if (service instanceof DataProviderService) {
      return _createProxyImpl(ref, (DataProviderService)service);
    } else if (service instanceof MountProvisionService) {
      return _createProxyImpl(ref, (MountProvisionService)service);
    } else if (service instanceof NotificationPublishService) {
      return _createProxyImpl(ref, (NotificationPublishService)service);
    } else if (service instanceof DataBrokerService) {
      return _createProxyImpl(ref, (DataBrokerService)service);
    } else if (service instanceof SchemaService) {
      return _createProxyImpl(ref, (SchemaService)service);
    } else if (service instanceof NotificationService) {
      return _createProxyImpl(ref, (NotificationService)service);
    } else if (service != null) {
      return _createProxyImpl(ref, service);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref, service).toString());
    }
  }
}
