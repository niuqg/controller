package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class Ipv4Builder {

    private Ipv4Prefix _ipv4Address;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> augmentation = new HashMap<>();

    public Ipv4Builder() {
    } 
    


    public Ipv4Prefix getIpv4Address() {
        return _ipv4Address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv4Builder setIpv4Address(Ipv4Prefix value) {
    
        this._ipv4Address = value;
        return this;
    }
    
    public Ipv4Builder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv4 build() {
        return new Ipv4Impl(this);
    }

    private static final class Ipv4Impl implements Ipv4 {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4.class;
        }

        private final Ipv4Prefix _ipv4Address;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> augmentation;

        private Ipv4Impl(Ipv4Builder builder) {
            this._ipv4Address = builder.getIpv4Address();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Ipv4Prefix getIpv4Address() {
            return _ipv4Address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv4>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv4Address == null) ? 0 : _ipv4Address.hashCode());
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
            Ipv4Impl other = (Ipv4Impl) obj;
            if (_ipv4Address == null) {
                if (other._ipv4Address != null) {
                    return false;
                }
            } else if(!_ipv4Address.equals(other._ipv4Address)) {
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
            StringBuilder builder = new StringBuilder("Ipv4 [");
            boolean first = true;
        
            if (_ipv4Address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv4Address=");
                builder.append(_ipv4Address);
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
