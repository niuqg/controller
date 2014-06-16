/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker.util;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.opendaylight.controller.sal.dom.broker.util.YangDataUtils;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.Node;
import org.opendaylight.yangtools.yang.data.impl.CompositeNodeTOImpl;
import org.opendaylight.yangtools.yang.model.api.ContainerSchemaNode;
import org.opendaylight.yangtools.yang.model.api.DataNodeContainer;
import org.opendaylight.yangtools.yang.model.api.DataSchemaNode;
import org.opendaylight.yangtools.yang.model.api.LeafListSchemaNode;
import org.opendaylight.yangtools.yang.model.api.LeafSchemaNode;
import org.opendaylight.yangtools.yang.model.api.ListSchemaNode;

@SuppressWarnings("all")
public class YangDataOperations {
  public static CompositeNode merge(final DataSchemaNode schema, final CompositeNode stored, final CompositeNode modified, final boolean config) {
    boolean _tripleEquals = (stored == null);
    if (_tripleEquals) {
      return modified;
    }
    boolean _or = false;
    if ((schema instanceof ListSchemaNode)) {
      _or = true;
    } else {
      _or = ((schema instanceof ListSchemaNode) || (schema instanceof ContainerSchemaNode));
    }
    if (_or) {
      return YangDataOperations.mergeContainer(((DataNodeContainer) schema), stored, modified, config);
    }
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException("Supplied node is not data node container.");
    throw _illegalArgumentException;
  }
  
  private static Iterable<? extends Node<? extends Object>> _mergeMultiple(final LeafSchemaNode node, final List<Node<? extends Object>> original, final List<Node<? extends Object>> modified, final boolean configurational) {
    int _size = original.size();
    boolean _tripleEquals = (_size == 1);
    Preconditions.checkArgument(_tripleEquals);
    int _size_1 = modified.size();
    boolean _tripleEquals_1 = (_size_1 == 1);
    Preconditions.checkArgument(_tripleEquals_1);
    return modified;
  }
  
  private static Iterable<? extends Node<? extends Object>> _mergeMultiple(final LeafListSchemaNode node, final List<Node<? extends Object>> original, final List<Node<? extends Object>> modified, final boolean configurational) {
    return modified;
  }
  
  private static Iterable<? extends Node<? extends Object>> _mergeMultiple(final ContainerSchemaNode node, final List<Node<? extends Object>> original, final List<Node<? extends Object>> modified, final boolean configurational) {
    int _size = original.size();
    boolean _tripleEquals = (_size == 1);
    Preconditions.checkArgument(_tripleEquals);
    int _size_1 = modified.size();
    boolean _tripleEquals_1 = (_size_1 == 1);
    Preconditions.checkArgument(_tripleEquals_1);
    Node<? extends Object> _get = original.get(0);
    Node<? extends Object> _get_1 = modified.get(0);
    CompositeNode _merge = YangDataOperations.merge(node, ((CompositeNode) _get), ((CompositeNode) _get_1), configurational);
    return Collections.<CompositeNode>singletonList(_merge);
  }
  
  private static Iterable<? extends Node<? extends Object>> _mergeMultiple(final ListSchemaNode node, final List<Node<? extends Object>> original, final List<Node<? extends Object>> modified, final boolean configurational) {
    boolean _or = false;
    List<QName> _keyDefinition = node.getKeyDefinition();
    boolean _tripleEquals = (_keyDefinition == null);
    if (_tripleEquals) {
      _or = true;
    } else {
      List<QName> _keyDefinition_1 = node.getKeyDefinition();
      boolean _isEmpty = _keyDefinition_1.isEmpty();
      _or = (_tripleEquals || _isEmpty);
    }
    if (_or) {
      return modified;
    }
    List<QName> _keyDefinition_2 = node.getKeyDefinition();
    final Map<Map<QName,Object>,CompositeNode> originalMap = YangDataUtils.toIndexMap(((List) original), _keyDefinition_2);
    List<QName> _keyDefinition_3 = node.getKeyDefinition();
    final Map<Map<QName,Object>,CompositeNode> modifiedMap = YangDataUtils.toIndexMap(((List) modified), _keyDefinition_3);
    int _size = original.size();
    int _size_1 = modified.size();
    int _plus = (_size + _size_1);
    ArrayList<Node<? extends Object>> _arrayList = new ArrayList<Node<?>>(_plus);
    final List<Node<?>> mergedNodes = _arrayList;
    Set<Entry<Map<QName,Object>,CompositeNode>> _entrySet = modifiedMap.entrySet();
    for (final Entry<Map<QName,Object>,CompositeNode> entry : _entrySet) {
      {
        Map<QName,Object> _key = entry.getKey();
        final CompositeNode originalEntry = originalMap.get(_key);
        boolean _notEquals = (!Objects.equal(originalEntry, null));
        if (_notEquals) {
          Map<QName,Object> _key_1 = entry.getKey();
          originalMap.remove(_key_1);
          CompositeNode _value = entry.getValue();
          CompositeNode _merge = YangDataOperations.merge(node, originalEntry, _value, configurational);
          mergedNodes.add(_merge);
        } else {
          CompositeNode _value_1 = entry.getValue();
          mergedNodes.add(_value_1);
        }
      }
    }
    Collection<CompositeNode> _values = originalMap.values();
    mergedNodes.addAll(_values);
    return mergedNodes;
  }
  
  private static CompositeNode mergeContainer(final DataNodeContainer schema, final CompositeNode stored, final CompositeNode modified, final boolean config) {
    boolean _equals = Objects.equal(stored, null);
    if (_equals) {
      return modified;
    }
    Preconditions.<CompositeNode>checkNotNull(stored);
    Preconditions.<CompositeNode>checkNotNull(modified);
    QName _nodeType = stored.getNodeType();
    QName _nodeType_1 = modified.getNodeType();
    boolean _equals_1 = Objects.equal(_nodeType, _nodeType_1);
    Preconditions.checkArgument(_equals_1);
    List<Node<? extends Object>> _children = stored.getChildren();
    int _size = _children.size();
    List<Node<? extends Object>> _children_1 = modified.getChildren();
    int _size_1 = _children_1.size();
    int _plus = (_size + _size_1);
    ArrayList<Node<? extends Object>> _arrayList = new ArrayList<Node<?>>(_plus);
    final ArrayList<Node<? extends Object>> mergedChildNodes = _arrayList;
    Set<QName> _keySet = stored.keySet();
    HashSet<QName> _hashSet = new HashSet<QName>(_keySet);
    final HashSet<QName> toProcess = _hashSet;
    Set<QName> _keySet_1 = modified.keySet();
    toProcess.addAll(_keySet_1);
    for (final QName qname : toProcess) {
      {
        final DataSchemaNode schemaChild = schema.getDataChildByName(qname);
        final List<Node<? extends Object>> storedChildren = stored.get(qname);
        final List<Node<? extends Object>> modifiedChildren = modified.get(qname);
        boolean _and = false;
        boolean _tripleNotEquals = (modifiedChildren != null);
        if (!_tripleNotEquals) {
          _and = false;
        } else {
          boolean _isEmpty = modifiedChildren.isEmpty();
          boolean _not = (!_isEmpty);
          _and = (_tripleNotEquals && _not);
        }
        if (_and) {
          boolean _or = false;
          boolean _or_1 = false;
          boolean _tripleEquals = (storedChildren == null);
          if (_tripleEquals) {
            _or_1 = true;
          } else {
            boolean _isEmpty_1 = storedChildren.isEmpty();
            _or_1 = (_tripleEquals || _isEmpty_1);
          }
          if (_or_1) {
            _or = true;
          } else {
            boolean _tripleEquals_1 = (schemaChild == null);
            _or = (_or_1 || _tripleEquals_1);
          }
          if (_or) {
            mergedChildNodes.addAll(modifiedChildren);
          } else {
            Iterable<? extends Node<? extends Object>> _mergeMultiple = YangDataOperations.mergeMultiple(schemaChild, storedChildren, modifiedChildren, config);
            Iterables.<Node<? extends Object>>addAll(mergedChildNodes, _mergeMultiple);
          }
        } else {
          boolean _and_1 = false;
          boolean _tripleNotEquals_1 = (storedChildren != null);
          if (!_tripleNotEquals_1) {
            _and_1 = false;
          } else {
            boolean _isEmpty_2 = storedChildren.isEmpty();
            boolean _not_1 = (!_isEmpty_2);
            _and_1 = (_tripleNotEquals_1 && _not_1);
          }
          if (_and_1) {
            mergedChildNodes.addAll(storedChildren);
          }
        }
      }
    }
    QName _nodeType_2 = stored.getNodeType();
    CompositeNodeTOImpl _compositeNodeTOImpl = new CompositeNodeTOImpl(_nodeType_2, null, mergedChildNodes);
    return _compositeNodeTOImpl;
  }
  
  private static Iterable<? extends Node<? extends Object>> mergeMultiple(final DataSchemaNode node, final List<Node<? extends Object>> original, final List<Node<? extends Object>> modified, final boolean configurational) {
    if (node instanceof ContainerSchemaNode) {
      return _mergeMultiple((ContainerSchemaNode)node, original, modified, configurational);
    } else if (node instanceof LeafListSchemaNode) {
      return _mergeMultiple((LeafListSchemaNode)node, original, modified, configurational);
    } else if (node instanceof LeafSchemaNode) {
      return _mergeMultiple((LeafSchemaNode)node, original, modified, configurational);
    } else if (node instanceof ListSchemaNode) {
      return _mergeMultiple((ListSchemaNode)node, original, modified, configurational);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, original, modified, configurational).toString());
    }
  }
}
