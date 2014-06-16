package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class NodeConnectorBuilder {

    private NodeConnectorKey _key;
    private NodeConnectorId _id;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>> augmentation = new HashMap<>();

    public NodeConnectorBuilder() {
    } 
    
    public NodeConnectorBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector arg) {
        this._id = arg.getId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector)arg).getId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeConnectorKey getKey() {
        return _key;
    }
    
    public NodeConnectorId getId() {
        return _id;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodeConnectorBuilder setKey(NodeConnectorKey value) {
    
        this._key = value;
        return this;
    }
    
    public NodeConnectorBuilder setId(NodeConnectorId value) {
    
        this._id = value;
        return this;
    }
    
    public NodeConnectorBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NodeConnector build() {
        return new NodeConnectorImpl(this);
    }

    private static final class NodeConnectorImpl implements NodeConnector {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector.class;
        }

        private final NodeConnectorKey _key;
        private final NodeConnectorId _id;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>> augmentation;

        private NodeConnectorImpl(NodeConnectorBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new NodeConnectorKey(
                    builder.getId()
                );
                this._id = builder.getId();
            } else {
                this._key = builder.getKey();
                this._id = _key.getId();
            }
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeConnectorKey getKey() {
            return _key;
        }
        
        @Override
        public NodeConnectorId getId() {
            return _id;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>> E getAugmentation(Class<E> augmentationType) {
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
            NodeConnectorImpl other = (NodeConnectorImpl) obj;
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
            StringBuilder builder = new StringBuilder("NodeConnector [");
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
