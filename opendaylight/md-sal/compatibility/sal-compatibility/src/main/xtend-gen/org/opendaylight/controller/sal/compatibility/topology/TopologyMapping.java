/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.compatibility.topology;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.md.sal.binding.util.TypeSafeDataReader;
import org.opendaylight.controller.sal.compatibility.NodeMapping;
import org.opendaylight.controller.sal.core.ConstructionException;
import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.Node;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.controller.sal.core.UpdateType;
import org.opendaylight.controller.sal.topology.TopoEdgeUpdate;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class TopologyMapping {
  private final static Logger LOG = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = LoggerFactory.getLogger(TopologyMapping.class);
      return _logger;
    }
  }.apply();
  
  private TopologyMapping() {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Utility class. Instantiation is not allowed.");
    throw _unsupportedOperationException;
  }
  
  public static List<TopoEdgeUpdate> toADEdgeUpdates(final Topology topology, final TypeSafeDataReader reader) {
    CopyOnWriteArrayList<TopoEdgeUpdate> _copyOnWriteArrayList = new CopyOnWriteArrayList<TopoEdgeUpdate>();
    final List<TopoEdgeUpdate> result = _copyOnWriteArrayList;
    List<Link> _link = topology.getLink();
    FluentIterable<Link> _from = FluentIterable.<Link>from(_link);
    final Function<Link,TopoEdgeUpdate> _function = new Function<Link,TopoEdgeUpdate>() {
      public TopoEdgeUpdate apply(final Link it) {
        Edge _adEdge = TopologyMapping.toAdEdge(it, topology);
        TopoEdgeUpdate _topoEdgeUpdate = TopologyMapping.toTopoEdgeUpdate(_adEdge, reader);
        return _topoEdgeUpdate;
      }
    };
    FluentIterable<TopoEdgeUpdate> _transform = _from.<TopoEdgeUpdate>transform(_function);
    return _transform.<List<TopoEdgeUpdate>>copyInto(result);
  }
  
  public static Edge toAdEdge(final Link link, final Topology topology) {
    try {
      Source _source = link.getSource();
      TpId _sourceTp = _source.getSourceTp();
      Source _source_1 = link.getSource();
      NodeId _sourceNode = _source_1.getSourceNode();
      final NodeConnector adSrc = TopologyMapping.toADNodeConnector(_sourceTp, _sourceNode);
      Destination _destination = link.getDestination();
      TpId _destTp = _destination.getDestTp();
      Destination _destination_1 = link.getDestination();
      NodeId _destNode = _destination_1.getDestNode();
      final NodeConnector adDst = TopologyMapping.toADNodeConnector(_destTp, _destNode);
      try {
        Edge _edge = new Edge(adSrc, adDst);
        return _edge;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    } catch (Throwable _e_1) {
      throw Exceptions.sneakyThrow(_e_1);
    }
  }
  
  public static TopoEdgeUpdate toTopoEdgeUpdate(final Edge e, final TypeSafeDataReader reader) {
    return TopologyMapping.toTopoEdgeUpdate(e, UpdateType.ADDED, reader);
  }
  
  public static TopoEdgeUpdate toTopoEdgeUpdate(final Edge e, final UpdateType type, final TypeSafeDataReader reader) {
    HashSet<Property> _adEdgeProperties = TopologyMapping.toAdEdgeProperties(e, reader);
    TopoEdgeUpdate _topoEdgeUpdate = new TopoEdgeUpdate(e, _adEdgeProperties, type);
    return _topoEdgeUpdate;
  }
  
  public static HashSet<Property> toAdEdgeProperties(final Edge e, final TypeSafeDataReader reader) {
    NodeConnector _tailNodeConnector = e.getTailNodeConnector();
    final NodeConnectorRef ncref = NodeMapping.toNodeConnectorRef(_tailNodeConnector);
    boolean _equals = Objects.equal(ncref, null);
    if (_equals) {
      TopologyMapping.LOG.debug("Edge {} ncref {}", e, ncref);
      return null;
    }
    InstanceIdentifier<? extends Object> _value = ncref.getValue();
    final InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector> ncInstanceId = ((InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>) _value);
    boolean _equals_1 = Objects.equal(ncInstanceId, null);
    if (_equals_1) {
      TopologyMapping.LOG.debug("Edge {} ncref {}", e, ncref);
      return null;
    }
    final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector nc = reader.<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>readOperationalData(ncInstanceId);
    boolean _equals_2 = Objects.equal(nc, null);
    if (_equals_2) {
      return null;
    }
    return NodeMapping.toADNodeConnectorProperties(nc);
  }
  
  public static String toADNodeId(final NodeId nodeId) {
    Preconditions.<NodeId>checkNotNull(nodeId);
    return nodeId.getValue();
  }
  
  public static NodeConnector toADNodeConnector(final TpId source, final NodeId nodeId) throws ConstructionException {
    Preconditions.<TpId>checkNotNull(source);
    String _aDNodeConnectorId = TopologyMapping.toADNodeConnectorId(source);
    Node _aDNode = TopologyMapping.toADNode(nodeId);
    NodeConnector _nodeConnector = new NodeConnector(NodeMapping.MD_SAL_TYPE, _aDNodeConnectorId, _aDNode);
    return _nodeConnector;
  }
  
  public static String toADNodeConnectorId(final TpId nodeConnectorId) {
    return nodeConnectorId.getValue();
  }
  
  public static Node toADNode(final NodeId nodeId) {
    Preconditions.<NodeId>checkNotNull(nodeId);
    try {
      String _aDNodeId = TopologyMapping.toADNodeId(nodeId);
      Node _node = new Node(NodeMapping.MD_SAL_TYPE, _aDNodeId);
      return _node;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
