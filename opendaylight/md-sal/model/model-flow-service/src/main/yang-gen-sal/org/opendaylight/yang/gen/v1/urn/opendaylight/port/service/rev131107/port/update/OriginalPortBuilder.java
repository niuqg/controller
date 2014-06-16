package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class OriginalPortBuilder {

    private Port _port;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>> augmentation = new HashMap<>();

    public OriginalPortBuilder() {
    } 
    
    public OriginalPortBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod arg) {
        this._port = arg.getPort();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod) {
            this._port = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod)arg).getPort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod] \n" +
              "but was: " + arg
            );
        }
    }

    public Port getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OriginalPortBuilder setPort(Port value) {
    
        this._port = value;
        return this;
    }
    
    public OriginalPortBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public OriginalPort build() {
        return new OriginalPortImpl(this);
    }

    private static final class OriginalPortImpl implements OriginalPort {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort.class;
        }

        private final Port _port;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>> augmentation;

        private OriginalPortImpl(OriginalPortBuilder builder) {
            this._port = builder.getPort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Port getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort>> E getAugmentation(Class<E> augmentationType) {
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
            OriginalPortImpl other = (OriginalPortImpl) obj;
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
            StringBuilder builder = new StringBuilder("OriginalPort [");
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
