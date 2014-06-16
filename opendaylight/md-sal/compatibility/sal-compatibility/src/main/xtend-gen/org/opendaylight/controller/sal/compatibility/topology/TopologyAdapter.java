/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.compatibility.topology;

import java.util.List;
import org.opendaylight.controller.md.sal.binding.util.TypeSafeDataReader;
import org.opendaylight.controller.sal.binding.api.data.DataProviderService;
import org.opendaylight.controller.sal.compatibility.topology.TopologyMapping;
import org.opendaylight.controller.sal.topology.IPluginInTopologyService;
import org.opendaylight.controller.sal.topology.IPluginOutTopologyService;
import org.opendaylight.controller.sal.topology.TopoEdgeUpdate;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;

@SuppressWarnings("all")
public class TopologyAdapter implements IPluginInTopologyService {
  private DataProviderService _dataService;
  
  public DataProviderService getDataService() {
    return this._dataService;
  }
  
  public void setDataService(final DataProviderService dataService) {
    this._dataService = dataService;
  }
  
  private IPluginOutTopologyService _topologyPublisher;
  
  public IPluginOutTopologyService getTopologyPublisher() {
    return this._topologyPublisher;
  }
  
  public void setTopologyPublisher(final IPluginOutTopologyService topologyPublisher) {
    this._topologyPublisher = topologyPublisher;
  }
  
  public void sollicitRefresh() {
    InstanceIdentifierBuilder<NetworkTopology> _builder = InstanceIdentifier.<NetworkTopology>builder(NetworkTopology.class);
    TopologyId _topologyId = new TopologyId("flow:1");
    TopologyKey _topologyKey = new TopologyKey(_topologyId);
    InstanceIdentifierBuilder<Topology> _child = _builder.<Topology, TopologyKey>child(Topology.class, _topologyKey);
    final InstanceIdentifier<Topology> path = _child.toInstance();
    DataProviderService _dataService = this.getDataService();
    final TypeSafeDataReader reader = TypeSafeDataReader.forReader(_dataService);
    final Topology topology = reader.<Topology>readOperationalData(path);
    IPluginOutTopologyService _topologyPublisher = this.getTopologyPublisher();
    List<TopoEdgeUpdate> _aDEdgeUpdates = TopologyMapping.toADEdgeUpdates(topology, reader);
    _topologyPublisher.edgeUpdate(_aDEdgeUpdates);
  }
}
