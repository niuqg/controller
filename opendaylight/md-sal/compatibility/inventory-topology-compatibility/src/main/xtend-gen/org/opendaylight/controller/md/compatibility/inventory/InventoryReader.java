/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.inventory;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Set;
import org.opendaylight.controller.sal.binding.api.data.RuntimeDataProvider;
import org.opendaylight.controller.sal.compatibility.InventoryMapping;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodesBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

@SuppressWarnings("all")
public class InventoryReader implements RuntimeDataProvider {
  private ISwitchManager _switchManager;
  
  public ISwitchManager getSwitchManager() {
    return this._switchManager;
  }
  
  public void setSwitchManager(final ISwitchManager switchManager) {
    this._switchManager = switchManager;
  }
  
  public DataObject readConfigurationData(final InstanceIdentifier<? extends DataObject> path) {
    return null;
  }
  
  public DataObject readOperationalData(final InstanceIdentifier<? extends DataObject> path) {
    final Class<? extends DataObject> type = path.getTargetType();
    DataObject data = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type,Nodes.class)) {
        _matched=true;
        Nodes _readNodes = this.readNodes(((InstanceIdentifier<Nodes>) path));
        data = _readNodes;
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
      if (Objects.equal(type,NodeConnector.class)) {
        _matched=true;
        DataObject _readNodeConnector = this.readNodeConnector(((InstanceIdentifier<NodeConnector>) path));
        data = _readNodeConnector;
      }
    }
    return data;
  }
  
  public DataObject readNodeConnector(final InstanceIdentifier<NodeConnector> identifier) {
    final org.opendaylight.controller.sal.core.NodeConnector nodeConnector = InventoryMapping.toAdNodeConnector(identifier);
    return this.constructNodeConnector(nodeConnector);
  }
  
  public DataObject readNode(final InstanceIdentifier<Node> identifier) {
    final org.opendaylight.controller.sal.core.Node node = InventoryMapping.toAdNode(identifier);
    return this.constructNode(node);
  }
  
  public Node constructNode(final org.opendaylight.controller.sal.core.Node node) {
    ISwitchManager _switchManager = this.getSwitchManager();
    final Set<org.opendaylight.controller.sal.core.NodeConnector> connectors = _switchManager.getNodeConnectors(node);
    int _size = connectors.size();
    ArrayList<NodeConnector> _arrayList = new ArrayList<NodeConnector>(_size);
    final ArrayList<NodeConnector> tpList = _arrayList;
    for (final org.opendaylight.controller.sal.core.NodeConnector connector : connectors) {
      NodeConnector _constructNodeConnector = this.constructNodeConnector(connector);
      tpList.add(_constructNodeConnector);
    }
    NodeBuilder _nodeBuilder = new NodeBuilder();
    final NodeBuilder it = _nodeBuilder;
    NodeKey _nodeKey = InventoryMapping.toNodeKey(node);
    it.setKey(_nodeKey);
    it.setNodeConnector(tpList);
    return it.build();
  }
  
  public NodeConnector constructNodeConnector(final org.opendaylight.controller.sal.core.NodeConnector connector) {
    NodeConnectorBuilder _nodeConnectorBuilder = new NodeConnectorBuilder();
    final NodeConnectorBuilder it = _nodeConnectorBuilder;
    NodeConnectorKey _nodeConnectorKey = InventoryMapping.toNodeConnectorKey(connector);
    it.setKey(_nodeConnectorKey);
    return it.build();
  }
  
  public Nodes readNodes(final InstanceIdentifier<Nodes> identifier) {
    ISwitchManager _switchManager = this.getSwitchManager();
    final Set<org.opendaylight.controller.sal.core.Node> nodes = _switchManager.getNodes();
    int _size = nodes.size();
    ArrayList<Node> _arrayList = new ArrayList<Node>(_size);
    final ArrayList<Node> nodeList = _arrayList;
    for (final org.opendaylight.controller.sal.core.Node node : nodes) {
      Node _constructNode = this.constructNode(node);
      nodeList.add(_constructNode);
    }
    NodesBuilder _nodesBuilder = new NodesBuilder();
    final NodesBuilder it = _nodesBuilder;
    it.setNode(nodeList);
    return it.build();
  }
}
