/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.compatibility.switchmanager;

import com.google.common.base.Objects;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.md.compatibility.switchmanager.ConfigurableSwitchManager;
import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.controller.sal.binding.api.data.DataModificationTransaction;
import org.opendaylight.controller.sal.compatibility.NodeMapping;
import org.opendaylight.controller.sal.core.Bandwidth;
import org.opendaylight.controller.sal.core.Description;
import org.opendaylight.controller.sal.core.ForwardingMode;
import org.opendaylight.controller.sal.core.MacAddress;
import org.opendaylight.controller.sal.core.NodeConnector;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.controller.sal.core.Tier;
import org.opendaylight.controller.sal.utils.Status;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.switchmanager.Subnet;
import org.opendaylight.controller.switchmanager.Switch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class CompatibleSwitchManager extends ConfigurableSwitchManager implements ISwitchManager {
  private final static Logger log = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = LoggerFactory.getLogger(CompatibleSwitchManager.class);
      return _logger;
    }
  }.apply();
  
  private DataBrokerService _dataService;
  
  public DataBrokerService getDataService() {
    return this._dataService;
  }
  
  public void setDataService(final DataBrokerService dataService) {
    this._dataService = dataService;
  }
  
  public Status addNodeConnectorProp(final NodeConnector nodeConnector, final Property prop) {
    DataBrokerService _dataService = this.getDataService();
    final DataModificationTransaction it = _dataService.beginTransaction();
    final NodeConnectorRef path = NodeMapping.toNodeConnectorRef(nodeConnector);
    return null;
  }
  
  public Property createProperty(final String propName, final String propValue) {
    try {
      boolean _equalsIgnoreCase = propName.equalsIgnoreCase(Description.propertyName);
      if (_equalsIgnoreCase) {
        Description _description = new Description(propValue);
        return _description;
      } else {
        boolean _equalsIgnoreCase_1 = propName.equalsIgnoreCase(Tier.TierPropName);
        if (_equalsIgnoreCase_1) {
          final int tier = Integer.parseInt(propValue);
          Tier _tier = new Tier(tier);
          return _tier;
        } else {
          boolean _equalsIgnoreCase_2 = propName.equalsIgnoreCase(Bandwidth.BandwidthPropName);
          if (_equalsIgnoreCase_2) {
            final long bw = Long.parseLong(propValue);
            Bandwidth _bandwidth = new Bandwidth(bw);
            return _bandwidth;
          } else {
            boolean _equalsIgnoreCase_3 = propName.equalsIgnoreCase(ForwardingMode.name);
            if (_equalsIgnoreCase_3) {
              final int mode = Integer.parseInt(propValue);
              ForwardingMode _forwardingMode = new ForwardingMode(mode);
              return _forwardingMode;
            } else {
              boolean _equalsIgnoreCase_4 = propName.equalsIgnoreCase(MacAddress.name);
              if (_equalsIgnoreCase_4) {
                MacAddress _macAddress = new MacAddress(propValue);
                return _macAddress;
              } else {
                CompatibleSwitchManager.log.debug("Not able to create {} property", propName);
              }
            }
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        CompatibleSwitchManager.log.debug("createProperty caught exception {}", _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  public boolean doesNodeConnectorExist(final NodeConnector nc) {
    final NodeConnectorRef ref = NodeMapping.toNodeConnectorRef(nc);
    DataBrokerService _dataService = this.getDataService();
    InstanceIdentifier<? extends Object> _value = ref.getValue();
    DataObject _readOperationalData = _dataService.readOperationalData(((InstanceIdentifier<? extends DataObject>) _value));
    return (_readOperationalData != null);
  }
  
  public byte[] getControllerMAC() {
    byte[] macAddress = null;
    try {
      final Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();
      boolean _hasMoreElements = nis.hasMoreElements();
      boolean _while = _hasMoreElements;
      while (_while) {
        {
          final NetworkInterface ni = nis.nextElement();
          try {
            byte[] _hardwareAddress = ni.getHardwareAddress();
            macAddress = _hardwareAddress;
            return macAddress;
          } catch (final Throwable _t) {
            if (_t instanceof SocketException) {
              final SocketException e = (SocketException)_t;
              CompatibleSwitchManager.log.error("Failed to acquire controller MAC: ", e);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        boolean _hasMoreElements_1 = nis.hasMoreElements();
        _while = _hasMoreElements_1;
      }
    } catch (final Throwable _t) {
      if (_t instanceof SocketException) {
        final SocketException e = (SocketException)_t;
        CompatibleSwitchManager.log.error("Failed to acquire controller MAC: ", e);
        return macAddress;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    boolean _equals = Objects.equal(macAddress, null);
    if (_equals) {
      CompatibleSwitchManager.log.warn("Failed to acquire controller MAC: No physical interface found");
    }
    return macAddress;
  }
  
  public Map<String,Property> getControllerProperties() {
    return Collections.<String, Property>emptyMap();
  }
  
  public Property getControllerProperty(final String propertyName) {
    return null;
  }
  
  public List<Switch> getNetworkDevices() {
    InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
    final InstanceIdentifier<Nodes> path = _builder.toInstance();
    DataBrokerService _dataService = this.getDataService();
    DataObject _readOperationalData = _dataService.readOperationalData(path);
    final Nodes data = ((Nodes) _readOperationalData);
    ArrayList<Switch> _arrayList = new ArrayList<Switch>();
    final ArrayList<Switch> ret = _arrayList;
    List<Node> _node = data.getNode();
    for (final Node node : _node) {
      Switch _switch = this.toSwitch(node);
      ret.add(_switch);
    }
    return ret;
  }
  
  public NodeConnector getNodeConnector(final org.opendaylight.controller.sal.core.Node node, final String nodeConnectorName) {
    NodeConnectorId _nodeConnectorId = new NodeConnectorId(nodeConnectorName);
    NodeConnectorKey _nodeConnectorKey = new NodeConnectorKey(_nodeConnectorId);
    final NodeConnectorKey key = _nodeConnectorKey;
    try {
      NodeConnector _nodeConnector = new NodeConnector(NodeMapping.MD_SAL_TYPE, key, node);
      return _nodeConnector;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Property getNodeConnectorProp(final NodeConnector nodeConnector, final String propName) {
    Map<String,Property> _nodeConnectorProps = this.getNodeConnectorProps(nodeConnector);
    Property _get = _nodeConnectorProps.get(propName);
    return _get;
  }
  
  public Map<String,Property> getNodeConnectorProps(final NodeConnector nodeConnector) {
    final NodeConnectorRef ref = NodeMapping.toNodeConnectorRef(nodeConnector);
    InstanceIdentifier<? extends Object> _value = ref.getValue();
    final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector data = this.readNodeConnector(_value);
    return this.toAdProperties(data);
  }
  
  public Set<NodeConnector> getNodeConnectors(final org.opendaylight.controller.sal.core.Node node) {
    try {
      final NodeRef ref = NodeMapping.toNodeRef(node);
      InstanceIdentifier<? extends Object> _value = ref.getValue();
      final Node data = this.readNode(_value);
      HashSet<NodeConnector> _hashSet = new HashSet<NodeConnector>();
      final HashSet<NodeConnector> ret = _hashSet;
      List<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector> _nodeConnector = data.getNodeConnector();
      for (final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector nc : _nodeConnector) {
        {
          NodeConnectorKey _key = nc.getKey();
          NodeConnector _nodeConnector_1 = new NodeConnector(NodeMapping.MD_SAL_TYPE, _key, node);
          final NodeConnector adConnector = _nodeConnector_1;
          ret.add(adConnector);
        }
      }
      return ret;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String getNodeDescription(final org.opendaylight.controller.sal.core.Node node) {
    Map<String,Property> _nodeProps = this.getNodeProps(node);
    Property _get = _nodeProps.get(Description.propertyName);
    String _value = ((Description) _get).getValue();
    return _value;
  }
  
  public byte[] getNodeMAC(final org.opendaylight.controller.sal.core.Node node) {
    Map<String,Property> _nodeProps = this.getNodeProps(node);
    Property _get = _nodeProps.get(MacAddress.name);
    byte[] _macAddress = ((MacAddress) _get).getMacAddress();
    return _macAddress;
  }
  
  public Property getNodeProp(final org.opendaylight.controller.sal.core.Node node, final String propName) {
    Map<String,Property> _nodeProps = this.getNodeProps(node);
    Property _get = _nodeProps.get(propName);
    return _get;
  }
  
  public Map<String,Property> getNodeProps(final org.opendaylight.controller.sal.core.Node node) {
    final NodeRef ref = NodeMapping.toNodeRef(node);
    DataBrokerService _dataService = this.getDataService();
    InstanceIdentifier<? extends Object> _value = ref.getValue();
    DataObject _readOperationalData = _dataService.readOperationalData(((InstanceIdentifier<? extends DataObject>) _value));
    final Node data = ((Node) _readOperationalData);
    return this.toAdProperties(data);
  }
  
  public Set<org.opendaylight.controller.sal.core.Node> getNodes() {
    try {
      InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
      final InstanceIdentifier<Nodes> path = _builder.toInstance();
      DataBrokerService _dataService = this.getDataService();
      DataObject _readOperationalData = _dataService.readOperationalData(path);
      final Nodes data = ((Nodes) _readOperationalData);
      HashSet<org.opendaylight.controller.sal.core.Node> _hashSet = new HashSet<org.opendaylight.controller.sal.core.Node>();
      final HashSet<org.opendaylight.controller.sal.core.Node> ret = _hashSet;
      List<Node> _node = data.getNode();
      for (final Node node : _node) {
        NodeKey _key = node.getKey();
        org.opendaylight.controller.sal.core.Node _node_1 = new org.opendaylight.controller.sal.core.Node(NodeMapping.MD_SAL_TYPE, _key);
        ret.add(_node_1);
      }
      return ret;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Switch toSwitch(final Node node) {
    try {
      NodeKey _key = node.getKey();
      org.opendaylight.controller.sal.core.Node _node = new org.opendaylight.controller.sal.core.Node(NodeMapping.MD_SAL_TYPE, _key);
      final org.opendaylight.controller.sal.core.Node adNode = _node;
      Switch _switch = new Switch(adNode);
      final Switch sw = _switch;
      return sw;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Set<NodeConnector> getPhysicalNodeConnectors(final org.opendaylight.controller.sal.core.Node node) {
    try {
      final NodeRef ref = NodeMapping.toNodeRef(node);
      InstanceIdentifier<? extends Object> _value = ref.getValue();
      final Node data = this.readNode(_value);
      HashSet<NodeConnector> _hashSet = new HashSet<NodeConnector>();
      final HashSet<NodeConnector> ret = _hashSet;
      List<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector> _nodeConnector = data.getNodeConnector();
      for (final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector nc : _nodeConnector) {
        {
          final FlowCapableNodeConnector flowConnector = nc.<FlowCapableNodeConnector>getAugmentation(FlowCapableNodeConnector.class);
          NodeConnectorKey _key = nc.getKey();
          NodeConnector _nodeConnector_1 = new NodeConnector(NodeMapping.MD_SAL_TYPE, _key, node);
          final NodeConnector adConnector = _nodeConnector_1;
          ret.add(adConnector);
        }
      }
      return ret;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Map<String,Property> toAdProperties(final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector connector) {
    return Collections.<String, Property>emptyMap();
  }
  
  public Map<String,Property> toAdProperties(final Node connector) {
    return Collections.<String, Property>emptyMap();
  }
  
  public Node readNode(final InstanceIdentifier<? extends Object> ref) {
    DataBrokerService _dataService = this.getDataService();
    DataObject _readOperationalData = _dataService.readOperationalData(((InstanceIdentifier<? extends DataObject>) ref));
    return ((Node) _readOperationalData);
  }
  
  public org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector readNodeConnector(final InstanceIdentifier<? extends Object> ref) {
    DataBrokerService _dataService = this.getDataService();
    DataObject _readOperationalData = _dataService.readOperationalData(((InstanceIdentifier<? extends DataObject>) ref));
    return ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector) _readOperationalData);
  }
  
  public List<NodeConnector> getSpanPorts(final org.opendaylight.controller.sal.core.Node node) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public Subnet getSubnetByNetworkAddress(final InetAddress networkAddress) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public Set<NodeConnector> getUpNodeConnectors(final org.opendaylight.controller.sal.core.Node node) {
    try {
      final NodeRef ref = NodeMapping.toNodeRef(node);
      InstanceIdentifier<? extends Object> _value = ref.getValue();
      final Node data = this.readNode(_value);
      HashSet<NodeConnector> _hashSet = new HashSet<NodeConnector>();
      final HashSet<NodeConnector> ret = _hashSet;
      List<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector> _nodeConnector = data.getNodeConnector();
      for (final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector nc : _nodeConnector) {
        {
          final FlowCapableNodeConnector flowConn = nc.<FlowCapableNodeConnector>getAugmentation(FlowCapableNodeConnector.class);
          boolean _and = false;
          boolean _and_1 = false;
          boolean _notEquals = (!Objects.equal(flowConn, null));
          if (!_notEquals) {
            _and_1 = false;
          } else {
            State _state = flowConn.getState();
            boolean _notEquals_1 = (!Objects.equal(_state, null));
            _and_1 = (_notEquals && _notEquals_1);
          }
          if (!_and_1) {
            _and = false;
          } else {
            State _state_1 = flowConn.getState();
            Boolean _isLinkDown = _state_1.isLinkDown();
            boolean _not = (!(_isLinkDown).booleanValue());
            _and = (_and_1 && _not);
          }
          if (_and) {
            NodeConnectorKey _key = nc.getKey();
            NodeConnector _nodeConnector_1 = new NodeConnector(NodeMapping.MD_SAL_TYPE, _key, node);
            ret.add(_nodeConnector_1);
          }
        }
      }
      return ret;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Boolean isNodeConnectorEnabled(final NodeConnector nodeConnector) {
    final NodeConnectorRef ref = NodeMapping.toNodeConnectorRef(nodeConnector);
    InstanceIdentifier<? extends Object> _value = ref.getValue();
    final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector data = this.readNodeConnector(_value);
    return Boolean.valueOf(true);
  }
  
  public boolean isSpecial(final NodeConnector p) {
    final NodeConnectorRef ref = NodeMapping.toNodeConnectorRef(p);
    InstanceIdentifier<? extends Object> _value = ref.getValue();
    final org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector data = this.readNodeConnector(_value);
    return true;
  }
  
  public Status removeControllerProperty(final String propertyName) {
    return null;
  }
  
  public Status removeNodeAllProps(final org.opendaylight.controller.sal.core.Node node) {
    return null;
  }
  
  public Status removeNodeConnectorAllProps(final NodeConnector nodeConnector) {
    return null;
  }
  
  public Status removeNodeConnectorProp(final NodeConnector nc, final String propName) {
    return null;
  }
  
  public Status removeNodeProp(final org.opendaylight.controller.sal.core.Node node, final String propName) {
    return null;
  }
  
  public Status removePortsFromSubnet(final String name, final List<String> nodeConnectors) {
    return null;
  }
  
  public Status removeSubnet(final String name) {
    return null;
  }
  
  public Status setControllerProperty(final Property property) {
    return null;
  }
  
  public void setNodeProp(final org.opendaylight.controller.sal.core.Node node, final Property prop) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public Status addPortsToSubnet(final String name, final List<String> nodeConnectors) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public Set<Switch> getConfiguredNotConnectedSwitches() {
    return null;
  }
}
