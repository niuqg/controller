/**
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker;

import com.google.common.base.Objects;
import java.util.Hashtable;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.md.sal.dom.api.DOMDataBroker;
import org.opendaylight.controller.md.sal.dom.broker.impl.compat.BackwardsCompatibleDataBroker;
import org.opendaylight.controller.sal.core.api.RpcProvisionRegistry;
import org.opendaylight.controller.sal.core.api.data.DataBrokerService;
import org.opendaylight.controller.sal.core.api.data.DataProviderService;
import org.opendaylight.controller.sal.core.api.data.DataStore;
import org.opendaylight.controller.sal.core.api.model.SchemaService;
import org.opendaylight.controller.sal.core.api.mount.MountProvisionService;
import org.opendaylight.controller.sal.core.api.mount.MountService;
import org.opendaylight.controller.sal.dom.broker.BrokerImpl;
import org.opendaylight.controller.sal.dom.broker.DataBrokerImpl;
import org.opendaylight.controller.sal.dom.broker.MountPointManagerImpl;
import org.opendaylight.controller.sal.dom.broker.impl.SchemaAwareDataStoreAdapter;
import org.opendaylight.controller.sal.dom.broker.impl.SchemaAwareRpcBroker;
import org.opendaylight.controller.sal.dom.broker.impl.SchemaContextProvider;
import org.opendaylight.controller.sal.dom.broker.impl.SchemaContextProviders;
import org.opendaylight.controller.sal.dom.broker.spi.RpcRouter;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier.InstanceIdentifierBuilder;
import org.opendaylight.yangtools.yang.model.api.SchemaServiceListener;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

@SuppressWarnings("all")
public class BrokerConfigActivator implements AutoCloseable {
  private final static InstanceIdentifier ROOT = new Function0<InstanceIdentifier>() {
    public InstanceIdentifier apply() {
      InstanceIdentifierBuilder _builder = InstanceIdentifier.builder();
      InstanceIdentifier _instance = _builder.toInstance();
      return _instance;
    }
  }.apply();
  
  private DataProviderService _dataService;
  
  public DataProviderService getDataService() {
    return this._dataService;
  }
  
  public void setDataService(final DataProviderService dataService) {
    this._dataService = dataService;
  }
  
  private ServiceRegistration<DataBrokerService> dataReg;
  
  private ServiceRegistration<DataProviderService> dataProviderReg;
  
  private ServiceRegistration<MountService> mountReg;
  
  private ServiceRegistration<MountProvisionService> mountProviderReg;
  
  private SchemaService schemaService;
  
  private ServiceRegistration<RpcProvisionRegistry> rpcProvisionRegistryReg;
  
  private MountPointManagerImpl mountService;
  
  private SchemaAwareDataStoreAdapter wrappedStore;
  
  public void start(final BrokerImpl broker, final DataStore store, final DOMDataBroker asyncBroker, final BundleContext context) {
    Hashtable<String,String> _hashtable = new Hashtable<String, String>();
    final Hashtable<String,String> emptyProperties = _hashtable;
    broker.setBundleContext(context);
    final ServiceReference<SchemaService> serviceRef = context.<SchemaService>getServiceReference(SchemaService.class);
    SchemaService _service = context.<SchemaService>getService(serviceRef);
    this.schemaService = _service;
    SchemaContextProvider _fromSchemaService = SchemaContextProviders.fromSchemaService(this.schemaService);
    SchemaAwareRpcBroker _schemaAwareRpcBroker = new SchemaAwareRpcBroker("/", _fromSchemaService);
    broker.setRouter(_schemaAwareRpcBroker);
    boolean _equals = Objects.equal(asyncBroker, null);
    if (_equals) {
      DataBrokerImpl _dataBrokerImpl = new DataBrokerImpl();
      this.setDataService(_dataBrokerImpl);
      DataProviderService _dataService = this.getDataService();
      ServiceRegistration<DataProviderService> _registerService = context.<DataProviderService>registerService(DataProviderService.class, _dataService, emptyProperties);
      this.dataProviderReg = _registerService;
      SchemaAwareDataStoreAdapter _schemaAwareDataStoreAdapter = new SchemaAwareDataStoreAdapter();
      this.wrappedStore = _schemaAwareDataStoreAdapter;
      this.wrappedStore.changeDelegate(store);
      this.wrappedStore.setValidationEnabled(false);
      context.<SchemaServiceListener>registerService(SchemaServiceListener.class, this.wrappedStore, emptyProperties);
      DataProviderService _dataService_1 = this.getDataService();
      _dataService_1.registerConfigurationReader(BrokerConfigActivator.ROOT, this.wrappedStore);
      DataProviderService _dataService_2 = this.getDataService();
      _dataService_2.registerCommitHandler(BrokerConfigActivator.ROOT, this.wrappedStore);
      DataProviderService _dataService_3 = this.getDataService();
      _dataService_3.registerOperationalReader(BrokerConfigActivator.ROOT, this.wrappedStore);
    } else {
      BackwardsCompatibleDataBroker _backwardsCompatibleDataBroker = new BackwardsCompatibleDataBroker(asyncBroker);
      final BackwardsCompatibleDataBroker compatibleDataBroker = _backwardsCompatibleDataBroker;
      context.<SchemaServiceListener>registerService(SchemaServiceListener.class, compatibleDataBroker, emptyProperties);
      this.setDataService(compatibleDataBroker);
    }
    MountPointManagerImpl _mountPointManagerImpl = new MountPointManagerImpl();
    this.mountService = _mountPointManagerImpl;
    DataProviderService _dataService_4 = this.getDataService();
    ServiceRegistration<DataBrokerService> _registerService_1 = context.<DataBrokerService>registerService(DataBrokerService.class, _dataService_4, emptyProperties);
    this.dataReg = _registerService_1;
    ServiceRegistration<MountService> _registerService_2 = context.<MountService>registerService(MountService.class, this.mountService, emptyProperties);
    this.mountReg = _registerService_2;
    ServiceRegistration<MountProvisionService> _registerService_3 = context.<MountProvisionService>registerService(MountProvisionService.class, this.mountService, emptyProperties);
    this.mountProviderReg = _registerService_3;
    RpcRouter _router = broker.getRouter();
    ServiceRegistration<RpcProvisionRegistry> _registerService_4 = context.<RpcProvisionRegistry>registerService(RpcProvisionRegistry.class, _router, emptyProperties);
    this.rpcProvisionRegistryReg = _registerService_4;
  }
  
  public void close() {
    if (this.dataReg!=null) {
      this.dataReg.unregister();
    }
    if (this.dataProviderReg!=null) {
      this.dataProviderReg.unregister();
    }
    if (this.mountReg!=null) {
      this.mountReg.unregister();
    }
    if (this.mountProviderReg!=null) {
      this.mountProviderReg.unregister();
    }
    if (this.rpcProvisionRegistryReg!=null) {
      this.rpcProvisionRegistryReg.unregister();
    }
  }
}
