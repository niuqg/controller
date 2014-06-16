/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker.impl;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.opendaylight.controller.md.sal.common.impl.routing.AbstractDataReadRouter;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier.NodeIdentifierWithPredicates;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier.PathArgument;
import org.opendaylight.yangtools.yang.data.api.Node;
import org.opendaylight.yangtools.yang.data.api.SimpleNode;
import org.opendaylight.yangtools.yang.data.impl.CompositeNodeTOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class DataReaderRouter extends AbstractDataReadRouter<InstanceIdentifier,CompositeNode> {
  private final static Logger LOG = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = LoggerFactory.getLogger(DataReaderRouter.class);
      return _logger;
    }
  }.apply();
  
  private final static URI NETCONF_NAMESPACE = new Function0<URI>() {
    public URI apply() {
      URI _create = URI.create("urn:ietf:params:xml:ns:netconf:base:1.0");
      return _create;
    }
  }.apply();
  
  private final static QName NETCONF_DATA = new Function0<QName>() {
    public QName apply() {
      QName _qName = new QName(DataReaderRouter.NETCONF_NAMESPACE, "data");
      return _qName;
    }
  }.apply();
  
  protected CompositeNode merge(final InstanceIdentifier path, final Iterable<CompositeNode> data) {
    List<PathArgument> _path = path.getPath();
    final PathArgument pathArgument = IterableExtensions.<PathArgument>last(_path);
    boolean empty = true;
    QName _nodeType = null;
    if (pathArgument!=null) {
      _nodeType=pathArgument.getNodeType();
    }
    QName name = _nodeType;
    ArrayList<Node<? extends Object>> _arrayList = new ArrayList<Node<?>>();
    final ArrayList<Node<? extends Object>> nodes = _arrayList;
    HashMap<QName,SimpleNode<? extends Object>> _hashMap = new HashMap<QName, SimpleNode<?>>();
    final HashMap<QName,SimpleNode<? extends Object>> keyNodes = _hashMap;
    for (final CompositeNode dataBit : data) {
      try {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(pathArgument, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _notEquals_1 = (!Objects.equal(dataBit, null));
          _and = (_notEquals && _notEquals_1);
        }
        if (_and) {
          empty = false;
          final Map<QName,SimpleNode<? extends Object>> keyNodesLocal = this.getKeyNodes(pathArgument, dataBit);
          Set<Entry<QName,SimpleNode<? extends Object>>> _entrySet = keyNodesLocal.entrySet();
          Collection<? extends Node<? extends Object>> _childrenWithout = this.childrenWithout(dataBit, _entrySet);
          nodes.addAll(_childrenWithout);
        } else {
          boolean _notEquals_2 = (!Objects.equal(dataBit, null));
          if (_notEquals_2) {
            empty = false;
            List<Node<? extends Object>> _children = dataBit.getChildren();
            nodes.addAll(_children);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof IllegalStateException) {
          final IllegalStateException e = (IllegalStateException)_t;
          DataReaderRouter.LOG.error("BUG: Readed data for path {} was invalid", path, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    if (empty) {
      return null;
    }
    boolean _equals = Objects.equal(pathArgument, null);
    if (_equals) {
      CompositeNodeTOImpl _compositeNodeTOImpl = new CompositeNodeTOImpl(DataReaderRouter.NETCONF_DATA, null, nodes);
      return _compositeNodeTOImpl;
    }
    ArrayList<Node<? extends Object>> _arrayList_1 = new ArrayList<Node<?>>();
    final ArrayList<Node<? extends Object>> finalNodes = _arrayList_1;
    Collection<SimpleNode<? extends Object>> _values = keyNodes.values();
    finalNodes.addAll(_values);
    finalNodes.addAll(nodes);
    CompositeNodeTOImpl _compositeNodeTOImpl_1 = new CompositeNodeTOImpl(name, null, finalNodes);
    return _compositeNodeTOImpl_1;
  }
  
  protected Map<QName,SimpleNode<? extends Object>> _getKeyNodes(final PathArgument argument, final CompositeNode node) {
    return Collections.<QName, SimpleNode<? extends Object>>emptyMap();
  }
  
  protected Map<QName,SimpleNode<? extends Object>> _getKeyNodes(final NodeIdentifierWithPredicates argument, final CompositeNode node) {
    HashMap<QName,SimpleNode<? extends Object>> _hashMap = new HashMap<QName, SimpleNode<?>>();
    final HashMap<QName,SimpleNode<? extends Object>> ret = _hashMap;
    Map<QName,Object> _keyValues = argument.getKeyValues();
    Set<Entry<QName,Object>> _entrySet = _keyValues.entrySet();
    for (final Entry<QName,Object> keyValue : _entrySet) {
      {
        QName _key = keyValue.getKey();
        final List<SimpleNode<? extends Object>> simpleNode = node.getSimpleNodesByName(_key);
        boolean _and = false;
        boolean _tripleNotEquals = (simpleNode != null);
        if (!_tripleNotEquals) {
          _and = false;
        } else {
          boolean _isEmpty = simpleNode.isEmpty();
          boolean _not = (!_isEmpty);
          _and = (_tripleNotEquals && _not);
        }
        if (_and) {
          int _size = simpleNode.size();
          boolean _lessEqualsThan = (_size <= 1);
          QName _key_1 = keyValue.getKey();
          Preconditions.checkState(_lessEqualsThan, "Only one simple node for key $s is allowed in node $s", _key_1, node);
          SimpleNode<? extends Object> _get = simpleNode.get(0);
          Object _value = _get.getValue();
          Object _value_1 = keyValue.getValue();
          boolean _equals = Objects.equal(_value, _value_1);
          Preconditions.checkState(_equals, "Key node must equal to instance identifier value in node $s", node);
          QName _key_2 = keyValue.getKey();
          SimpleNode<? extends Object> _get_1 = simpleNode.get(0);
          ret.put(_key_2, _get_1);
        }
        QName _key_3 = keyValue.getKey();
        final List<CompositeNode> compositeNode = node.getCompositesByName(_key_3);
        boolean _or = false;
        boolean _tripleEquals = (compositeNode == null);
        if (_tripleEquals) {
          _or = true;
        } else {
          boolean _isEmpty_1 = compositeNode.isEmpty();
          _or = (_tripleEquals || _isEmpty_1);
        }
        Preconditions.checkState(_or, "Key node must be Simple Node, not composite node.");
      }
    }
    return ret;
  }
  
  public Collection<? extends Node<? extends Object>> childrenWithout(final CompositeNode node, final Set<Entry<QName,SimpleNode<? extends Object>>> entries) {
    boolean _isEmpty = entries.isEmpty();
    if (_isEmpty) {
      return node.getChildren();
    }
    ArrayList<Node<? extends Object>> _arrayList = new ArrayList<Node<?>>();
    final ArrayList<Node<? extends Object>> filteredNodes = _arrayList;
    List<Node<? extends Object>> _children = node.getChildren();
    for (final Node<? extends Object> scannedNode : _children) {
      QName _nodeType = scannedNode.getNodeType();
      boolean _contains = entries.contains(_nodeType);
      boolean _not = (!_contains);
      if (_not) {
        filteredNodes.add(scannedNode);
      }
    }
    return filteredNodes;
  }
  
  public Map<QName,SimpleNode<? extends Object>> getKeyNodes(final PathArgument argument, final CompositeNode node) {
    if (argument instanceof NodeIdentifierWithPredicates) {
      return _getKeyNodes((NodeIdentifierWithPredicates)argument, node);
    } else if (argument != null) {
      return _getKeyNodes(argument, node);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(argument, node).toString());
    }
  }
}
