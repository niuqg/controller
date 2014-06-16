/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.topology;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;
import org.opendaylight.controller.md.compatibility.topology.TopologyMapping;
import org.opendaylight.controller.sal.binding.api.data.RuntimeDataProvider;
import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.DestinationBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.SourceBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.LinkBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.LinkKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPoint;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPointBuilder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPointKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;

@SuppressWarnings("all")
public class TopologyReader implements RuntimeDataProvider {
  private ISwitchManager _switchManager;
  
  public ISwitchManager getSwitchManager() {
    return this._switchManager;
  }
  
  public void setSwitchManager(final ISwitchManager switchManager) {
    this._switchManager = switchManager;
  }
  
  private ITopologyManager _topologyManager;
  
  public ITopologyManager getTopologyManager() {
    return this._topologyManager;
  }
  
  public void setTopologyManager(final ITopologyManager topologyManager) {
    this._topologyManager = topologyManager;
  }
  
  private final TopologyKey _topologyKey;
  
  public TopologyKey getTopologyKey() {
    return this._topologyKey;
  }
  
  private final InstanceIdentifier<Topology> _topologyPath;
  
  public InstanceIdentifier<Topology> getTopologyPath() {
    return this._topologyPath;
  }
  
  @Extension
  private final TopologyMapping _mapping;
  
  public TopologyMapping getMapping() {
    return this._mapping;
  }
  
  public TopologyReader() {
    TopologyId _topologyId = new TopologyId("compatibility:ad-sal");
    TopologyKey _topologyKey = new TopologyKey(_topologyId);
    this._topologyKey = _topologyKey;
    InstanceIdentifierBuilder<NetworkTopology> _builder = InstanceIdentifier.<NetworkTopology>builder(NetworkTopology.class);
    TopologyKey _topologyKey_1 = this.getTopologyKey();
    InstanceIdentifierBuilder<Topology> _child = _builder.<Topology, TopologyKey>child(Topology.class, _topologyKey_1);
    InstanceIdentifier<Topology> _instance = _child.toInstance();
    this._topologyPath = _instance;
    TopologyKey _topologyKey_2 = this.getTopologyKey();
    InstanceIdentifier<Topology> _topologyPath = this.getTopologyPath();
    TopologyMapping _topologyMapping = new TopologyMapping(_topologyKey_2, _topologyPath);
    this._mapping = _topologyMapping;
  }
  
  public DataObject readConfigurationData(final InstanceIdentifier<? extends DataObject> path) {
    return null;
  }
  
  public DataObject readOperationalData(final InstanceIdentifier<? extends DataObject> path) {
    final Class<? extends DataObject> type = path.getTargetType();
    DataObject data = null;
    InstanceIdentifier<Topology> _topologyPath = this.getTopologyPath();
    boolean _contains = _topologyPath.contains(path);
    boolean _equals = (false == _contains);
    if (_equals) {
      return null;
    }
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type,Topology.class)) {
        _matched=true;
        DataObject _readTopology = this.readTopology(((InstanceIdentifier<Topology>) path));
        data = _readTopology;
      }
    }
    if (!_matched) {
      if (Objects.equal(type,Node.class)) {
        _matched=true;
        DataObject _readNode = this.readNode(((InstanceIdentifier<Node>) path));
        data = _readNode;
      }
    }
    if (!_matched) {
      if (Objects.equal(type,TerminationPoint.class)) {
        _matched=true;
        DataObject _readTerminationPoint = this.readTerminationPoint(((InstanceIdentifier<TerminationPoint>) path));
        data = _readTerminationPoint;
      }
    }
    if (!_matched) {
      if (Objects.equal(type,Link.class)) {
        _matched=true;
        DataObject _readLink = this.readLink(((InstanceIdentifier<Link>) path));
        data = _readLink;
      }
    }
    return data;
  }
  
  public DataObject readLink(final InstanceIdentifier<Link> identifier) {
    final Edge edge = this._mapping.toAdTopologyEdge(identifier);
    ITopologyManager _topologyManager = this.getTopologyManager();
    Map<Edge,Set<Property>> _edges = null;
    if (_topologyManager!=null) {
      _edges=_topologyManager.getEdges();
    }
    Set<Property> _get = null;
    if (_edges!=null) {
      _get=_edges.get(edge);
    }
    final Set<Property> properties = _get;
    return this.constructLink(edge);
  }
  
  public DataObject readTerminationPoint(final InstanceIdentifier<TerminationPoint> identifier) {
    final NodeConnector nodeConnector = this._mapping.toAdTopologyNodeConnector(identifier);
    return this.constructTerminationPoint(nodeConnector);
  }
  
  public DataObject readNode(final InstanceIdentifier<Node> identifier) {
    final org.opendaylight.controller.sal.core.Node node = this._mapping.toAdTopologyNode(identifier);
    return this.constructNode(node);
  }
  
  public DataObject readTopology(final InstanceIdentifier<Topology> identifier) {
    ISwitchManager _switchManager = this.getSwitchManager();
    final Set<org.opendaylight.controller.sal.core.Node> nodes = _switchManager.getNodes();
    ITopologyManager _topologyManager = this.getTopologyManager();
    final Map<Edge,Set<Property>> edges = _topologyManager.getEdges();
    int _size = nodes.size();
    ArrayList<Node> _arrayList = new ArrayList<Node>(_size);
    final ArrayList<Node> nodeList = _arrayList;
    for (final org.opendaylight.controller.sal.core.Node node : nodes) {
      Node _constructNode = this.constructNode(node);
      nodeList.add(_constructNode);
    }
    int _size_1 = edges.size();
    ArrayList<Link> _arrayList_1 = new ArrayList<Link>(_size_1);
    final ArrayList<Link> linkList = _arrayList_1;
    Set<Edge> _keySet = edges.keySet();
    for (final Edge edge : _keySet) {
      Link _constructLink = this.constructLink(edge);
      linkList.add(_constructLink);
    }
    TopologyBuilder _topologyBuilder = new TopologyBuilder();
    final TopologyBuilder it = _topologyBuilder;
    TopologyKey _topologyKey = this.getTopologyKey();
    it.setKey(_topologyKey);
    it.setNode(nodeList);
    it.setLink(linkList);
    return it.build();
  }
  
  public Link constructLink(final Edge edge) {
    final NodeConnector sourceNc = edge.getTailNodeConnector();
    final NodeConnector destNc = edge.getHeadNodeConnector();
    LinkBuilder _linkBuilder = new LinkBuilder();
    final LinkBuilder it = _linkBuilder;
    LinkKey _topologyLinkKey = this._mapping.toTopologyLinkKey(edge);
    it.setKey(_topologyLinkKey);
    SourceBuilder _sourceBuilder = new SourceBuilder();
    org.opendaylight.controller.sal.core.Node _node = sourceNc.getNode();
    NodeKey _topologyNodeKey = this._mapping.toTopologyNodeKey(_node);
    NodeId _nodeId = _topologyNodeKey.getNodeId();
    SourceBuilder _setSourceNode = _sourceBuilder.setSourceNode(_nodeId);
    TerminationPointKey _topologyTerminationPointKey = this._mapping.toTopologyTerminationPointKey(sourceNc);
    TpId _tpId = _topologyTerminationPointKey.getTpId();
    SourceBuilder _setSourceTp = _setSourceNode.setSourceTp(_tpId);
    Source _build = _setSourceTp.build();
    it.setSource(_build);
    DestinationBuilder _destinationBuilder = new DestinationBuilder();
    org.opendaylight.controller.sal.core.Node _node_1 = destNc.getNode();
    NodeKey _topologyNodeKey_1 = this._mapping.toTopologyNodeKey(_node_1);
    NodeId _nodeId_1 = _topologyNodeKey_1.getNodeId();
    DestinationBuilder _setDestNode = _destinationBuilder.setDestNode(_nodeId_1);
    TerminationPointKey _topologyTerminationPointKey_1 = this._mapping.toTopologyTerminationPointKey(destNc);
    TpId _tpId_1 = _topologyTerminationPointKey_1.getTpId();
    DestinationBuilder _setDestTp = _setDestNode.setDestTp(_tpId_1);
    Destination _build_1 = _setDestTp.build();
    it.setDestination(_build_1);
    return it.build();
  }
  
  public Node constructNode(final org.opendaylight.controller.sal.core.Node node) {
    ISwitchManager _switchManager = this.getSwitchManager();
    final Set<NodeConnector> connectors = _switchManager.getNodeConnectors(node);
    int _size = connectors.size();
    ArrayList<TerminationPoint> _arrayList = new ArrayList<TerminationPoint>(_size);
    final ArrayList<TerminationPoint> tpList = _arrayList;
    for (final NodeConnector connector : connectors) {
      TerminationPoint _constructTerminationPoint = this.constructTerminationPoint(connector);
      tpList.add(_constructTerminationPoint);
    }
    NodeBuilder _nodeBuilder = new NodeBuilder();
    final NodeBuilder it = _nodeBuilder;
    NodeKey _topologyNodeKey = this._mapping.toTopologyNodeKey(node);
    it.setKey(_topologyNodeKey);
    it.setTerminationPoint(tpList);
    return it.build();
  }
  
  public TerminationPoint constructTerminationPoint(final NodeConnector connector) {
    TerminationPointBuilder _terminationPointBuilder = new TerminationPointBuilder();
    final TerminationPointBuilder it = _terminationPointBuilder;
    TerminationPointKey _topologyTerminationPointKey = this._mapping.toTopologyTerminationPointKey(connector);
    it.setKey(_topologyTerminationPointKey);
    return it.build();
  }
}
