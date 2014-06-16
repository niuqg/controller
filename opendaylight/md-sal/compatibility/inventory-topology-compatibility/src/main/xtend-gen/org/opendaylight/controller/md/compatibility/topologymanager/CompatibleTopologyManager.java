/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.topologymanager;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;
import org.opendaylight.controller.md.compatibility.topologymanager.AdSalTopologyMapping;
import org.opendaylight.controller.md.compatibility.topologymanager.ConfigurableLinkManager;
import org.opendaylight.controller.md.sal.binding.util.TypeSafeDataReader;
import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.Host;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.controller.sal.core.UpdateType;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPoint;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPointKey;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

@SuppressWarnings("all")
public class CompatibleTopologyManager extends ConfigurableLinkManager implements ITopologyManager {
  private TypeSafeDataReader _dataReader;
  
  public TypeSafeDataReader getDataReader() {
    return this._dataReader;
  }
  
  public void setDataReader(final TypeSafeDataReader dataReader) {
    this._dataReader = dataReader;
  }
  
  @Extension
  private AdSalTopologyMapping _topologyMapping;
  
  public AdSalTopologyMapping getTopologyMapping() {
    return this._topologyMapping;
  }
  
  public void setTopologyMapping(final AdSalTopologyMapping topologyMapping) {
    this._topologyMapping = topologyMapping;
  }
  
  public Map<Edge,Set<Property>> getEdges() {
    TypeSafeDataReader _dataReader = this.getDataReader();
    InstanceIdentifier<Topology> _topologyPath = this._topologyMapping.getTopologyPath();
    final Topology topology = _dataReader.<Topology>readOperationalData(_topologyPath);
    List<Link> _link = topology.getLink();
    return this._topologyMapping.toEdgePropertiesMap(_link);
  }
  
  public Map<Node,Set<Edge>> getNodeEdges() {
    TypeSafeDataReader _dataReader = this.getDataReader();
    InstanceIdentifier<Topology> _topologyPath = this._topologyMapping.getTopologyPath();
    final Topology topology = _dataReader.<Topology>readOperationalData(_topologyPath);
    HashMap<Node,Set<Edge>> _hashMap = new HashMap<Node, Set<Edge>>();
    final HashMap<Node,Set<Edge>> ret = _hashMap;
    List<org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node> _node = topology.getNode();
    for (final org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node node : _node) {
      {
        final Node adNode = this._topologyMapping.toAdNode(node);
        List<Link> _link = topology.getLink();
        FluentIterable<Link> _from = FluentIterable.<Link>from(_link);
        final Predicate<Link> _function = new Predicate<Link>() {
          public boolean apply(final Link it) {
            boolean _or = false;
            Source _source = it.getSource();
            NodeId _sourceNode = _source.getSourceNode();
            NodeId _nodeId = node.getNodeId();
            boolean _equals = Objects.equal(_sourceNode, _nodeId);
            if (_equals) {
              _or = true;
            } else {
              Destination _destination = it.getDestination();
              NodeId _destNode = _destination.getDestNode();
              NodeId _nodeId_1 = node.getNodeId();
              boolean _equals_1 = Objects.equal(_destNode, _nodeId_1);
              _or = (_equals || _equals_1);
            }
            return _or;
          }
        };
        FluentIterable<Link> _filter = _from.filter(_function);
        final Set<Edge> adEdges = this._topologyMapping.toEdges(_filter);
        ret.put(adNode, adEdges);
      }
    }
    return ret;
  }
  
  /**
   * Returns true if point is connected to link
   */
  public boolean isInternal(final TerminationPoint point) {
    TypeSafeDataReader _dataReader = this.getDataReader();
    InstanceIdentifier<Topology> _topologyPath = this._topologyMapping.getTopologyPath();
    final Topology topology = _dataReader.<Topology>readConfigurationData(_topologyPath);
    TerminationPointKey _key = point.getKey();
    final TpId tpId = _key.getTpId();
    List<Link> _link = topology.getLink();
    FluentIterable<Link> _from = FluentIterable.<Link>from(_link);
    final Predicate<Link> _function = new Predicate<Link>() {
      public boolean apply(final Link it) {
        boolean _or = false;
        Source _source = it.getSource();
        TpId _sourceTp = _source.getSourceTp();
        boolean _equals = Objects.equal(_sourceTp, tpId);
        if (_equals) {
          _or = true;
        } else {
          Destination _destination = it.getDestination();
          TpId _destTp = _destination.getDestTp();
          boolean _equals_1 = Objects.equal(_destTp, tpId);
          _or = (_equals || _equals_1);
        }
        return _or;
      }
    };
    return _from.anyMatch(_function);
  }
  
  public Set<NodeConnector> getNodeConnectorWithHost() {
    return null;
  }
  
  public Host getHostAttachedToNodeConnector(final NodeConnector p) {
    final InstanceIdentifier<TerminationPoint> tpPath = this._topologyMapping.toTerminationPoint(p);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public List<Host> getHostsAttachedToNodeConnector(final NodeConnector p) {
    TypeSafeDataReader _dataReader = this.getDataReader();
    InstanceIdentifier<Topology> _topologyPath = this._topologyMapping.getTopologyPath();
    final Topology topology = _dataReader.<Topology>readOperationalData(_topologyPath);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Hosts not mapped yet");
    throw _unsupportedOperationException;
  }
  
  public Map<Node,Set<NodeConnector>> getNodesWithNodeConnectorHost() {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public boolean isInternal(final NodeConnector p) {
    final InstanceIdentifier<TerminationPoint> tpPath = this._topologyMapping.toTerminationPoint(p);
    TypeSafeDataReader _dataReader = this.getDataReader();
    final TerminationPoint connector = _dataReader.<TerminationPoint>readConfigurationData(tpPath);
    return this.isInternal(connector);
  }
  
  public void updateHostLink(final NodeConnector p, final Host h, final UpdateType t, final Set<Property> props) {
  }
  
  public Status saveConfig() {
    return null;
  }
}
