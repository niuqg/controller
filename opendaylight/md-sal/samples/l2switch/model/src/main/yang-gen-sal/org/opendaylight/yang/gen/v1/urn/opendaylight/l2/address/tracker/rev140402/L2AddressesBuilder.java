package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class L2AddressesBuilder {

    private List<L2Address> _l2Address;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>> augmentation = new HashMap<>();

    public L2AddressesBuilder() {
    } 


    public List<L2Address> getL2Address() {
        return _l2Address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public L2AddressesBuilder setL2Address(List<L2Address> value) {
    
        this._l2Address = value;
        return this;
    }
    
    public L2AddressesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public L2Addresses build() {
        return new L2AddressesImpl(this);
    }

    private static final class L2AddressesImpl implements L2Addresses {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses.class;
        }

        private final List<L2Address> _l2Address;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>> augmentation;

        private L2AddressesImpl(L2AddressesBuilder builder) {
            this._l2Address = builder.getL2Address();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<L2Address> getL2Address() {
            return _l2Address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Addresses>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_l2Address == null) ? 0 : _l2Address.hashCode());
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
            L2AddressesImpl other = (L2AddressesImpl) obj;
            if (_l2Address == null) {
                if (other._l2Address != null) {
                    return false;
                }
            } else if(!_l2Address.equals(other._l2Address)) {
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
            StringBuilder builder = new StringBuilder("L2Addresses [");
            boolean first = true;
        
            if (_l2Address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_l2Address=");
                builder.append(_l2Address);
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
