package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class MakeToastInputBuilder {

    private Long _toasterDoneness;
    private Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> _toasterToastType;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> augmentation = new HashMap<>();

    public MakeToastInputBuilder() {
    } 


    public Long getToasterDoneness() {
        return _toasterDoneness;
    }
    
    public Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> getToasterToastType() {
        return _toasterToastType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MakeToastInputBuilder setToasterDoneness(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("1"), new Long("10")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._toasterDoneness = value;
        return this;
    }
    
    public MakeToastInputBuilder setToasterToastType(Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> value) {
    
        this._toasterToastType = value;
        return this;
    }
    
    public MakeToastInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MakeToastInput build() {
        return new MakeToastInputImpl(this);
    }

    private static final class MakeToastInputImpl implements MakeToastInput {

        public Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput.class;
        }

        private final Long _toasterDoneness;
        private final Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> _toasterToastType;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> augmentation;

        private MakeToastInputImpl(MakeToastInputBuilder builder) {
            this._toasterDoneness = builder.getToasterDoneness();
            this._toasterToastType = builder.getToasterToastType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getToasterDoneness() {
            return _toasterDoneness;
        }
        
        @Override
        public Class<? extends org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToastType> getToasterToastType() {
            return _toasterToastType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_toasterDoneness == null) ? 0 : _toasterDoneness.hashCode());
            result = prime * result + ((_toasterToastType == null) ? 0 : _toasterToastType.hashCode());
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
            MakeToastInputImpl other = (MakeToastInputImpl) obj;
            if (_toasterDoneness == null) {
                if (other._toasterDoneness != null) {
                    return false;
                }
            } else if(!_toasterDoneness.equals(other._toasterDoneness)) {
                return false;
            }
            if (_toasterToastType == null) {
                if (other._toasterToastType != null) {
                    return false;
                }
            } else if(!_toasterToastType.equals(other._toasterToastType)) {
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
            StringBuilder builder = new StringBuilder("MakeToastInput [");
            boolean first = true;
        
            if (_toasterDoneness != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterDoneness=");
                builder.append(_toasterDoneness);
             }
            if (_toasterToastType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterToastType=");
                builder.append(_toasterToastType);
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
