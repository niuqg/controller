package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class OriginalNodeBuilder {

    private NodeId _node;
    private TopologyId _topology;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>> augmentation = new HashMap<>();

    public OriginalNodeBuilder() {
    } 


    public NodeId getNode() {
        return _node;
    }
    
    public TopologyId getTopology() {
        return _topology;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OriginalNodeBuilder setNode(NodeId value) {
    
        this._node = value;
        return this;
    }
    
    public OriginalNodeBuilder setTopology(TopologyId value) {
    
        this._topology = value;
        return this;
    }
    
    public OriginalNodeBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public OriginalNode build() {
        return new OriginalNodeImpl(this);
    }

    private static final class OriginalNodeImpl implements OriginalNode {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode.class;
        }

        private final NodeId _node;
        private final TopologyId _topology;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>> augmentation;

        private OriginalNodeImpl(OriginalNodeBuilder builder) {
            this._node = builder.getNode();
            this._topology = builder.getTopology();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public TopologyId getTopology() {
            return _topology;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_topology == null) ? 0 : _topology.hashCode());
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
            OriginalNodeImpl other = (OriginalNodeImpl) obj;
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_topology == null) {
                if (other._topology != null) {
                    return false;
                }
            } else if(!_topology.equals(other._topology)) {
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
            StringBuilder builder = new StringBuilder("OriginalNode [");
            boolean first = true;
        
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
             }
            if (_topology != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_topology=");
                builder.append(_topology);
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
