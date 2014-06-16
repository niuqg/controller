package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class NodesBuilder {

    private List<Node> _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> augmentation = new HashMap<>();

    public NodesBuilder() {
    } 


    public List<Node> getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodesBuilder setNode(List<Node> value) {
    
        this._node = value;
        return this;
    }
    
    public NodesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Nodes build() {
        return new NodesImpl(this);
    }

    private static final class NodesImpl implements Nodes {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes.class;
        }

        private final List<Node> _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> augmentation;

        private NodesImpl(NodesBuilder builder) {
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>> E getAugmentation(Class<E> augmentationType) {
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
            NodesImpl other = (NodesImpl) obj;
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
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
            StringBuilder builder = new StringBuilder("Nodes [");
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
