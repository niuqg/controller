package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class RestockToasterInputBuilder {

    private Long _amountOfBreadToStock;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>> augmentation = new HashMap<>();

    public RestockToasterInputBuilder() {
    } 


    public Long getAmountOfBreadToStock() {
        return _amountOfBreadToStock;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RestockToasterInputBuilder setAmountOfBreadToStock(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._amountOfBreadToStock = value;
        return this;
    }
    
    public RestockToasterInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RestockToasterInput build() {
        return new RestockToasterInputImpl(this);
    }

    private static final class RestockToasterInputImpl implements RestockToasterInput {

        public Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput.class;
        }

        private final Long _amountOfBreadToStock;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>> augmentation;

        private RestockToasterInputImpl(RestockToasterInputBuilder builder) {
            this._amountOfBreadToStock = builder.getAmountOfBreadToStock();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getAmountOfBreadToStock() {
            return _amountOfBreadToStock;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.RestockToasterInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_amountOfBreadToStock == null) ? 0 : _amountOfBreadToStock.hashCode());
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
            RestockToasterInputImpl other = (RestockToasterInputImpl) obj;
            if (_amountOfBreadToStock == null) {
                if (other._amountOfBreadToStock != null) {
                    return false;
                }
            } else if(!_amountOfBreadToStock.equals(other._amountOfBreadToStock)) {
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
            StringBuilder builder = new StringBuilder("RestockToasterInput [");
            boolean first = true;
        
            if (_amountOfBreadToStock != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_amountOfBreadToStock=");
                builder.append(_amountOfBreadToStock);
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
