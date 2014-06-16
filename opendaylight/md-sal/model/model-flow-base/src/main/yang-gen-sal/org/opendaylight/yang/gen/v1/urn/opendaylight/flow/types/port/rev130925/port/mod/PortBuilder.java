package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod;
import java.util.List;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class PortBuilder {

    private List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> _port;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>> augmentation = new HashMap<>();

    public PortBuilder() {
    } 


    public List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PortBuilder setPort(List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> value) {
    
        this._port = value;
        return this;
    }
    
    public PortBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Port build() {
        return new PortImpl(this);
    }

    private static final class PortImpl implements Port {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port.class;
        }

        private final List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> _port;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>> augmentation;

        private PortImpl(PortBuilder builder) {
            this._port = builder.getPort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
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
            PortImpl other = (PortImpl) obj;
            if (_port == null) {
                if (other._port != null) {
                    return false;
                }
            } else if(!_port.equals(other._port)) {
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
            StringBuilder builder = new StringBuilder("Port [");
            boolean first = true;
        
            if (_port != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_port=");
                builder.append(_port);
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
