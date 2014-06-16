package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class Ipv6Builder {

    private Ipv6Prefix _ipv6Address;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> augmentation = new HashMap<>();

    public Ipv6Builder() {
    } 
    


    public Ipv6Prefix getIpv6Address() {
        return _ipv6Address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv6Builder setIpv6Address(Ipv6Prefix value) {
    
        this._ipv6Address = value;
        return this;
    }
    
    public Ipv6Builder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv6 build() {
        return new Ipv6Impl(this);
    }

    private static final class Ipv6Impl implements Ipv6 {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6.class;
        }

        private final Ipv6Prefix _ipv6Address;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> augmentation;

        private Ipv6Impl(Ipv6Builder builder) {
            this._ipv6Address = builder.getIpv6Address();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Ipv6Prefix getIpv6Address() {
            return _ipv6Address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.address.Ipv6>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv6Address == null) ? 0 : _ipv6Address.hashCode());
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
            Ipv6Impl other = (Ipv6Impl) obj;
            if (_ipv6Address == null) {
                if (other._ipv6Address != null) {
                    return false;
                }
            } else if(!_ipv6Address.equals(other._ipv6Address)) {
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
            StringBuilder builder = new StringBuilder("Ipv6 [");
            boolean first = true;
        
            if (_ipv6Address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Address=");
                builder.append(_ipv6Address);
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
