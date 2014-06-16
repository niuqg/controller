/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.compatibility.topology;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.sal.binding.api.data.DataChangeListener;
import org.opendaylight.controller.sal.binding.api.data.DataProviderService;
import org.opendaylight.controller.sal.compatibility.topology.TopologyCommitHandler;
import org.opendaylight.controller.sal.topology.IPluginOutTopologyService;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class TopologyProvider implements AutoCloseable {
  private final static Logger LOG = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = LoggerFactory.getLogger(TopologyProvider.class);
      return _logger;
    }
  }.apply();
  
  private TopologyCommitHandler commitHandler;
  
  private IPluginOutTopologyService _topologyPublisher;
  
  public IPluginOutTopologyService getTopologyPublisher() {
    return this._topologyPublisher;
  }
  
  private DataProviderService _dataService;
  
  public DataProviderService getDataService() {
    return this._dataService;
  }
  
  public void setDataService(final DataProviderService dataService) {
    this._dataService = dataService;
  }
  
  private ListenerRegistration<DataChangeListener> listenerRegistration;
  
  public void start() {
  }
  
  public void startAdapter() {
    DataProviderService _dataService = this.getDataService();
    boolean _equals = Objects.equal(_dataService, null);
    if (_equals) {
      TopologyProvider.LOG.error("dataService not set");
      return;
    }
    DataProviderService _dataService_1 = this.getDataService();
    IPluginOutTopologyService _topologyPublisher = this.getTopologyPublisher();
    TopologyCommitHandler _topologyCommitHandler = new TopologyCommitHandler(_dataService_1, _topologyPublisher);
    this.commitHandler = _topologyCommitHandler;
    InstanceIdentifierBuilder<NetworkTopology> _builder = InstanceIdentifier.<NetworkTopology>builder(NetworkTopology.class);
    TopologyId _topologyId = new TopologyId("flow:1");
    TopologyKey _topologyKey = new TopologyKey(_topologyId);
    InstanceIdentifierBuilder<Topology> _child = _builder.<Topology, TopologyKey>child(Topology.class, _topologyKey);
    InstanceIdentifierBuilder<Link> _child_1 = _child.<Link>child(Link.class);
    final InstanceIdentifier<? extends DataObject> path = _child_1.toInstance();
    DataProviderService _dataService_2 = this.getDataService();
    ListenerRegistration<DataChangeListener> _registerDataChangeListener = _dataService_2.registerDataChangeListener(path, this.commitHandler);
    this.listenerRegistration = _registerDataChangeListener;
    TopologyProvider.LOG.info("TopologyProvider started");
  }
  
  public void close() throws Exception {
    this.listenerRegistration.close();
  }
  
  public void setTopologyPublisher(final IPluginOutTopologyService topologyPublisher) {
    this._topologyPublisher = topologyPublisher;
    boolean _notEquals = (!Objects.equal(this.commitHandler, null));
    if (_notEquals) {
      this.commitHandler.setTopologyPublisher(topologyPublisher);
    }
  }
}
