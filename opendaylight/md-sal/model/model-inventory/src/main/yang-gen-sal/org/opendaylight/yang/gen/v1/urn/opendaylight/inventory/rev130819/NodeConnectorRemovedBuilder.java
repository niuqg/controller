package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class NodeConnectorRemovedBuilder {

    private NodeConnectorRef _nodeConnectorRef;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>> augmentation = new HashMap<>();

    public NodeConnectorRemovedBuilder() {
    } 


    public NodeConnectorRef getNodeConnectorRef() {
        return _nodeConnectorRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodeConnectorRemovedBuilder setNodeConnectorRef(NodeConnectorRef value) {
    
        this._nodeConnectorRef = value;
        return this;
    }
    
    public NodeConnectorRemovedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NodeConnectorRemoved build() {
        return new NodeConnectorRemovedImpl(this);
    }

    private static final class NodeConnectorRemovedImpl implements NodeConnectorRemoved {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved.class;
        }

        private final NodeConnectorRef _nodeConnectorRef;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>> augmentation;

        private NodeConnectorRemovedImpl(NodeConnectorRemovedBuilder builder) {
            this._nodeConnectorRef = builder.getNodeConnectorRef();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeConnectorRef getNodeConnectorRef() {
            return _nodeConnectorRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_nodeConnectorRef == null) ? 0 : _nodeConnectorRef.hashCode());
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
            NodeConnectorRemovedImpl other = (NodeConnectorRemovedImpl) obj;
            if (_nodeConnectorRef == null) {
                if (other._nodeConnectorRef != null) {
                    return false;
                }
            } else if(!_nodeConnectorRef.equals(other._nodeConnectorRef)) {
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
            StringBuilder builder = new StringBuilder("NodeConnectorRemoved [");
            boolean first = true;
        
            if (_nodeConnectorRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeConnectorRef=");
                builder.append(_nodeConnectorRef);
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
