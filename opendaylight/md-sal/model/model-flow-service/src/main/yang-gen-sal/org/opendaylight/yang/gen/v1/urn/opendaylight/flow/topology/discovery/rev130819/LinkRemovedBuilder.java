package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class LinkRemovedBuilder {

    private NodeConnectorRef _destination;
    private NodeConnectorRef _source;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>> augmentation = new HashMap<>();

    public LinkRemovedBuilder() {
    } 
    
    public LinkRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.Link arg) {
        this._destination = arg.getDestination();
        this._source = arg.getSource();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.Link</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.Link) {
            this._destination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.Link)arg).getDestination();
            this._source = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.Link)arg).getSource();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.Link] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeConnectorRef getDestination() {
        return _destination;
    }
    
    public NodeConnectorRef getSource() {
        return _source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public LinkRemovedBuilder setDestination(NodeConnectorRef value) {
    
        this._destination = value;
        return this;
    }
    
    public LinkRemovedBuilder setSource(NodeConnectorRef value) {
    
        this._source = value;
        return this;
    }
    
    public LinkRemovedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public LinkRemoved build() {
        return new LinkRemovedImpl(this);
    }

    private static final class LinkRemovedImpl implements LinkRemoved {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved.class;
        }

        private final NodeConnectorRef _destination;
        private final NodeConnectorRef _source;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>> augmentation;

        private LinkRemovedImpl(LinkRemovedBuilder builder) {
            this._destination = builder.getDestination();
            this._source = builder.getSource();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeConnectorRef getDestination() {
            return _destination;
        }
        
        @Override
        public NodeConnectorRef getSource() {
            return _source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_destination == null) ? 0 : _destination.hashCode());
            result = prime * result + ((_source == null) ? 0 : _source.hashCode());
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
            LinkRemovedImpl other = (LinkRemovedImpl) obj;
            if (_destination == null) {
                if (other._destination != null) {
                    return false;
                }
            } else if(!_destination.equals(other._destination)) {
                return false;
            }
            if (_source == null) {
                if (other._source != null) {
                    return false;
                }
            } else if(!_source.equals(other._source)) {
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
            StringBuilder builder = new StringBuilder("LinkRemoved [");
            boolean first = true;
        
            if (_destination != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_destination=");
                builder.append(_destination);
             }
            if (_source != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_source=");
                builder.append(_source);
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
