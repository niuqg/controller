package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.NodeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class NodeBuilder {

    private NodeKey _key;
    private NodeId _id;
    private List<NodeConnector> _nodeConnector;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>> augmentation = new HashMap<>();

    public NodeBuilder() {
    } 
    
    public NodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node arg) {
        this._id = arg.getId();
        this._nodeConnector = arg.getNodeConnector();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node)arg).getId();
            this._nodeConnector = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node)arg).getNodeConnector();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeKey getKey() {
        return _key;
    }
    
    public NodeId getId() {
        return _id;
    }
    
    public List<NodeConnector> getNodeConnector() {
        return _nodeConnector;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodeBuilder setKey(NodeKey value) {
    
        this._key = value;
        return this;
    }
    
    public NodeBuilder setId(NodeId value) {
    
        this._id = value;
        return this;
    }
    
    public NodeBuilder setNodeConnector(List<NodeConnector> value) {
    
        this._nodeConnector = value;
        return this;
    }
    
    public NodeBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Node build() {
        return new NodeImpl(this);
    }

    private static final class NodeImpl implements Node {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node.class;
        }

        private final NodeKey _key;
        private final NodeId _id;
        private final List<NodeConnector> _nodeConnector;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>> augmentation;

        private NodeImpl(NodeBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new NodeKey(
                    builder.getId()
                );
                this._id = builder.getId();
            } else {
                this._key = builder.getKey();
                this._id = _key.getId();
            }
            this._nodeConnector = builder.getNodeConnector();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeKey getKey() {
            return _key;
        }
        
        @Override
        public NodeId getId() {
            return _id;
        }
        
        @Override
        public List<NodeConnector> getNodeConnector() {
            return _nodeConnector;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_id == null) ? 0 : _id.hashCode());
            result = prime * result + ((_nodeConnector == null) ? 0 : _nodeConnector.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            NodeImpl other = (NodeImpl) obj;
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_id == null) {
                if (other._id != null) {
                    return false;
                }
            } else if(!_id.equals(other._id)) {
                return false;
            }
            if (_nodeConnector == null) {
                if (other._nodeConnector != null) {
                    return false;
                }
            } else if(!_nodeConnector.equals(other._nodeConnector)) {
                return false;
            }
            if (augmentation == null) {
                if (other.augmentation != null) {
                    return false;
                }
            } else if(!augmentation.equals(other.augmentation)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("Node [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
             }
            if (_nodeConnector != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeConnector=");
                builder.append(_nodeConnector);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
