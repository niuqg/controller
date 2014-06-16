/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.topology;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.opendaylight.controller.sal.compatibility.InventoryMapping;
import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.TopologyKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.LinkKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeKey;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPoint;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPointKey;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.IdentifiableItem;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.PathArgument;

@SuppressWarnings("all")
public class TopologyMapping {
  public TopologyMapping(final TopologyKey path, final InstanceIdentifier<Topology> key) {
  }
  
  public Edge toAdTopologyEdge(final InstanceIdentifier<Link> identifier) {
    List<PathArgument> _path = identifier.getPath();
    PathArgument _last = IterableExtensions.<PathArgument>last(_path);
    final LinkKey linkKey = ((IdentifiableItem<Link,LinkKey>) _last).getKey();
    LinkId _linkId = linkKey.getLinkId();
    String _value = _linkId.getValue();
    final String[] components = _value.split("::::");
    String _get = components[0];
    final NodeConnector tail = InventoryMapping.nodeConnectorFromId(_get);
    String _get_1 = components[1];
    final NodeConnector head = InventoryMapping.nodeConnectorFromId(_get_1);
    try {
      Edge _edge = new Edge(tail, head);
      return _edge;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public NodeConnector toAdTopologyNodeConnector(final InstanceIdentifier<TerminationPoint> identifier) {
    List<PathArgument> _path = identifier.getPath();
    PathArgument _last = IterableExtensions.<PathArgument>last(_path);
    final TerminationPointKey tpKey = ((IdentifiableItem<TerminationPoint,TerminationPointKey>) _last).getKey();
    TpId _tpId = tpKey.getTpId();
    String _value = _tpId.getValue();
    return InventoryMapping.nodeConnectorFromId(_value);
  }
  
  public Node toAdTopologyNode(final InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node> identifier) {
    List<PathArgument> _path = identifier.getPath();
    PathArgument _last = IterableExtensions.<PathArgument>last(_path);
    final NodeKey tpKey = ((IdentifiableItem<org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node,NodeKey>) _last).getKey();
    NodeId _nodeId = tpKey.getNodeId();
    String _value = _nodeId.getValue();
    return InventoryMapping.nodeFromNodeId(_value);
  }
  
  public NodeKey toTopologyNodeKey(final Node node) {
    String _nodeId = InventoryMapping.toNodeId(node);
    NodeId _nodeId_1 = new NodeId(_nodeId);
    final NodeId nodeId = _nodeId_1;
    NodeKey _nodeKey = new NodeKey(nodeId);
    return _nodeKey;
  }
  
  public TerminationPointKey toTopologyTerminationPointKey(final NodeConnector nc) {
    final Node node = nc.getNode();
    String _nodeConnectorId = InventoryMapping.toNodeConnectorId(nc);
    TpId _tpId = new TpId(_nodeConnectorId);
    final TpId nodeId = _tpId;
    TerminationPointKey _terminationPointKey = new TerminationPointKey(nodeId);
    return _terminationPointKey;
  }
  
  public LinkKey toTopologyLinkKey(final Edge edge) {
    NodeConnector _tailNodeConnector = edge.getTailNodeConnector();
    final TerminationPointKey sourceTp = this.toTopologyTerminationPointKey(_tailNodeConnector);
    NodeConnector _headNodeConnector = edge.getHeadNodeConnector();
    final TerminationPointKey destTp = this.toTopologyTerminationPointKey(_headNodeConnector);
    StringConcatenation _builder = new StringConcatenation();
    TpId _tpId = sourceTp.getTpId();
    _builder.append(_tpId, "");
    _builder.append("::::");
    TpId _tpId_1 = destTp.getTpId();
    _builder.append(_tpId_1, "");
    LinkId _linkId = new LinkId(_builder.toString());
    final LinkId linkId = _linkId;
    LinkKey _linkKey = new LinkKey(linkId);
    return _linkKey;
  }
}
