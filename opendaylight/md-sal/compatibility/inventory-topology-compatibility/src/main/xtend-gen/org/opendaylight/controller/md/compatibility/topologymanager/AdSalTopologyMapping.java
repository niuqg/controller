/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.topologymanager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.opendaylight.controller.sal.compatibility.NodeMapping;
import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPoint;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPointKey;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;

@SuppressWarnings("all")
public class AdSalTopologyMapping {
  private final TopologyKey topologyMapping;
  
  private final InstanceIdentifier<Topology> _topologyPath;
  
  public InstanceIdentifier<Topology> getTopologyPath() {
    return this._topologyPath;
  }
  
  public AdSalTopologyMapping(final TopologyKey topology) {
    this.topologyMapping = topology;
    InstanceIdentifierBuilder<NetworkTopology> _builder = InstanceIdentifier.<NetworkTopology>builder(NetworkTopology.class);
    InstanceIdentifierBuilder<Topology> _child = _builder.<Topology, TopologyKey>child(Topology.class, topology);
    InstanceIdentifier<Topology> _instance = _child.toInstance();
    this._topologyPath = _instance;
  }
  
  public InstanceIdentifier<TerminationPoint> toTerminationPoint(final NodeConnector connector) {
    InstanceIdentifier<Topology> _topologyPath = this.getTopologyPath();
    InstanceIdentifierBuilder<Topology> _builder = InstanceIdentifier.<Topology>builder(_topologyPath);
    InstanceIdentifierBuilder<Node> _child = _builder.<Node>child(Node.class);
    TerminationPointKey _terminationPointKey = this.toTerminationPointKey(connector);
    InstanceIdentifierBuilder<TerminationPoint> _child_1 = _child.<TerminationPoint, TerminationPointKey>child(TerminationPoint.class, _terminationPointKey);
    InstanceIdentifier<TerminationPoint> _instance = _child_1.toInstance();
    return _instance;
  }
  
  public Map<Edge,Set<Property>> toEdgePropertiesMap(final Iterable<Link> links) {
    HashMap<Edge,Set<Property>> _hashMap = new HashMap<Edge, Set<Property>>();
    final HashMap<Edge,Set<Property>> ret = _hashMap;
    for (final Link link : links) {
      Edge _edge = this.toEdge(link);
      Set<Property> _properties = this.toProperties(link);
      ret.put(_edge, _properties);
    }
    return ret;
  }
  
  public Set<Edge> toEdges(final Iterable<Link> links) {
    HashSet<Edge> _hashSet = new HashSet<Edge>();
    final HashSet<Edge> ret = _hashSet;
    for (final Link link : links) {
      Edge _edge = this.toEdge(link);
      ret.add(_edge);
    }
    return ret;
  }
  
  public Edge toEdge(final Link link) {
    Source _source = link.getSource();
    final NodeConnector tail = this.toNodeConnector(_source);
    Destination _destination = link.getDestination();
    final NodeConnector head = this.toNodeConnector(_destination);
    try {
      Edge _edge = new Edge(tail, head);
      return _edge;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public org.opendaylight.controller.sal.core.Node toAdNode(final Node node) {
    NodeId _nodeId = node.getNodeId();
    return this.toAdNode(_nodeId);
  }
  
  public org.opendaylight.controller.sal.core.Node toAdNode(final NodeId node) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId _nodeId = new org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId(node);
    NodeKey _nodeKey = new NodeKey(_nodeId);
    final NodeKey key = _nodeKey;
    try {
      org.opendaylight.controller.sal.core.Node _node = new org.opendaylight.controller.sal.core.Node(NodeMapping.MD_SAL_TYPE, key);
      return _node;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public NodeConnector toNodeConnector(final Source ref) {
    NodeId _sourceNode = ref.getSourceNode();
    final org.opendaylight.controller.sal.core.Node adNode = this.toAdNode(_sourceNode);
    TpId _sourceTp = ref.getSourceTp();
    NodeConnectorId _nodeConnectorId = new NodeConnectorId(_sourceTp);
    NodeConnectorKey _nodeConnectorKey = new NodeConnectorKey(_nodeConnectorId);
    final NodeConnectorKey key = _nodeConnectorKey;
    try {
      NodeConnector _nodeConnector = new NodeConnector(NodeMapping.MD_SAL_TYPE, key, adNode);
      return _nodeConnector;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public NodeConnector toNodeConnector(final Destination ref) {
    NodeId _destNode = ref.getDestNode();
    final org.opendaylight.controller.sal.core.Node adNode = this.toAdNode(_destNode);
    TpId _destTp = ref.getDestTp();
    NodeConnectorId _nodeConnectorId = new NodeConnectorId(_destTp);
    NodeConnectorKey _nodeConnectorKey = new NodeConnectorKey(_nodeConnectorId);
    final NodeConnectorKey key = _nodeConnectorKey;
    try {
      NodeConnector _nodeConnector = new NodeConnector(NodeMapping.MD_SAL_TYPE, key, adNode);
      return _nodeConnector;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public TerminationPointKey toTerminationPointKey(final NodeConnector connector) {
    return null;
  }
  
  public Set<Property> toProperties(final Link link) {
    return null;
  }
}
