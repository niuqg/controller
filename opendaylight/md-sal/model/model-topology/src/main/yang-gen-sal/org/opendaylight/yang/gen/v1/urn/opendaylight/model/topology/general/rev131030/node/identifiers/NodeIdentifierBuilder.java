package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class NodeIdentifierBuilder {

    private Uri _identifier;
    private Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> _type;
    private NodeIdentifierKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>> augmentation = new HashMap<>();

    public NodeIdentifierBuilder() {
    } 


    public Uri getIdentifier() {
        return _identifier;
    }
    
    public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> getType() {
        return _type;
    }
    
    public NodeIdentifierKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodeIdentifierBuilder setIdentifier(Uri value) {
    
        this._identifier = value;
        return this;
    }
    
    public NodeIdentifierBuilder setType(Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> value) {
    
        this._type = value;
        return this;
    }
    
    public NodeIdentifierBuilder setKey(NodeIdentifierKey value) {
    
        this._key = value;
        return this;
    }
    
    public NodeIdentifierBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NodeIdentifier build() {
        return new NodeIdentifierImpl(this);
    }

    private static final class NodeIdentifierImpl implements NodeIdentifier {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier.class;
        }

        private final Uri _identifier;
        private final Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> _type;
        private final NodeIdentifierKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>> augmentation;

        private NodeIdentifierImpl(NodeIdentifierBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new NodeIdentifierKey(
                    builder.getIdentifier(), 
                    builder.getType()
                );
                this._identifier = builder.getIdentifier();
                this._type = builder.getType();
            } else {
                this._key = builder.getKey();
                this._identifier = _key.getIdentifier();
                this._type = _key.getType();
            }
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Uri getIdentifier() {
            return _identifier;
        }
        
        @Override
        public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> getType() {
            return _type;
        }
        
        @Override
        public NodeIdentifierKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_identifier == null) ? 0 : _identifier.hashCode());
            result = prime * result + ((_type == null) ? 0 : _type.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            NodeIdentifierImpl other = (NodeIdentifierImpl) obj;
            if (_identifier == null) {
                if (other._identifier != null) {
                    return false;
                }
            } else if(!_identifier.equals(other._identifier)) {
                return false;
            }
            if (_type == null) {
                if (other._type != null) {
                    return false;
                }
            } else if(!_type.equals(other._type)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
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
            StringBuilder builder = new StringBuilder("NodeIdentifier [");
            boolean first = true;
        
            if (_identifier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_identifier=");
                builder.append(_identifier);
             }
            if (_type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_type=");
                builder.append(_type);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
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
