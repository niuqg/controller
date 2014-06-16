package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class NodeRemovedBuilder {

    private NodeRef _nodeRef;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>> augmentation = new HashMap<>();

    public NodeRemovedBuilder() {
    } 


    public NodeRef getNodeRef() {
        return _nodeRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodeRemovedBuilder setNodeRef(NodeRef value) {
    
        this._nodeRef = value;
        return this;
    }
    
    public NodeRemovedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NodeRemoved build() {
        return new NodeRemovedImpl(this);
    }

    private static final class NodeRemovedImpl implements NodeRemoved {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved.class;
        }

        private final NodeRef _nodeRef;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>> augmentation;

        private NodeRemovedImpl(NodeRemovedBuilder builder) {
            this._nodeRef = builder.getNodeRef();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeRef getNodeRef() {
            return _nodeRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_nodeRef == null) ? 0 : _nodeRef.hashCode());
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
            NodeRemovedImpl other = (NodeRemovedImpl) obj;
            if (_nodeRef == null) {
                if (other._nodeRef != null) {
                    return false;
                }
            } else if(!_nodeRef.equals(other._nodeRef)) {
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
            StringBuilder builder = new StringBuilder("NodeRemoved [");
            boolean first = true;
        
            if (_nodeRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeRef=");
                builder.append(_nodeRef);
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
