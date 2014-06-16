package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.ToasterStatus;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class ToasterBuilder {

    private Long _darknessFactor;
    private DisplayString _toasterManufacturer;
    private DisplayString _toasterModelNumber;
    private ToasterStatus _toasterStatus;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentation = new HashMap<>();

    public ToasterBuilder() {
    } 


    public Long getDarknessFactor() {
        return _darknessFactor;
    }
    
    public DisplayString getToasterManufacturer() {
        return _toasterManufacturer;
    }
    
    public DisplayString getToasterModelNumber() {
        return _toasterModelNumber;
    }
    
    public ToasterStatus getToasterStatus() {
        return _toasterStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ToasterBuilder setDarknessFactor(Long value) {
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
    
        this._darknessFactor = value;
        return this;
    }
    
    public ToasterBuilder setToasterManufacturer(DisplayString value) {
        if (value != null) {
            boolean isValidLength = false;
            List<Range<Integer>> lengthConstraints = new ArrayList<>(); 
            lengthConstraints.add(Range.closed(0, 255));
            for (Range<Integer> r : lengthConstraints) {
                if (r.contains(value.getValue().length())) {
                isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: {}, expected: {}.", value, lengthConstraints));
            }
        }
    
        this._toasterManufacturer = value;
        return this;
    }
    
    public ToasterBuilder setToasterModelNumber(DisplayString value) {
        if (value != null) {
            boolean isValidLength = false;
            List<Range<Integer>> lengthConstraints = new ArrayList<>(); 
            lengthConstraints.add(Range.closed(0, 255));
            for (Range<Integer> r : lengthConstraints) {
                if (r.contains(value.getValue().length())) {
                isValidLength = true;
                }
            }
            if (!isValidLength) {
                throw new IllegalArgumentException(String.format("Invalid length: {}, expected: {}.", value, lengthConstraints));
            }
        }
    
        this._toasterModelNumber = value;
        return this;
    }
    
    public ToasterBuilder setToasterStatus(ToasterStatus value) {
    
        this._toasterStatus = value;
        return this;
    }
    
    public ToasterBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Toaster build() {
        return new ToasterImpl(this);
    }

    private static final class ToasterImpl implements Toaster {

        public Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.class;
        }

        private final Long _darknessFactor;
        private final DisplayString _toasterManufacturer;
        private final DisplayString _toasterModelNumber;
        private final ToasterStatus _toasterStatus;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> augmentation;

        private ToasterImpl(ToasterBuilder builder) {
            this._darknessFactor = builder.getDarknessFactor();
            this._toasterManufacturer = builder.getToasterManufacturer();
            this._toasterModelNumber = builder.getToasterModelNumber();
            this._toasterStatus = builder.getToasterStatus();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getDarknessFactor() {
            return _darknessFactor;
        }
        
        @Override
        public DisplayString getToasterManufacturer() {
            return _toasterManufacturer;
        }
        
        @Override
        public DisplayString getToasterModelNumber() {
            return _toasterModelNumber;
        }
        
        @Override
        public ToasterStatus getToasterStatus() {
            return _toasterStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_darknessFactor == null) ? 0 : _darknessFactor.hashCode());
            result = prime * result + ((_toasterManufacturer == null) ? 0 : _toasterManufacturer.hashCode());
            result = prime * result + ((_toasterModelNumber == null) ? 0 : _toasterModelNumber.hashCode());
            result = prime * result + ((_toasterStatus == null) ? 0 : _toasterStatus.hashCode());
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
            ToasterImpl other = (ToasterImpl) obj;
            if (_darknessFactor == null) {
                if (other._darknessFactor != null) {
                    return false;
                }
            } else if(!_darknessFactor.equals(other._darknessFactor)) {
                return false;
            }
            if (_toasterManufacturer == null) {
                if (other._toasterManufacturer != null) {
                    return false;
                }
            } else if(!_toasterManufacturer.equals(other._toasterManufacturer)) {
                return false;
            }
            if (_toasterModelNumber == null) {
                if (other._toasterModelNumber != null) {
                    return false;
                }
            } else if(!_toasterModelNumber.equals(other._toasterModelNumber)) {
                return false;
            }
            if (_toasterStatus == null) {
                if (other._toasterStatus != null) {
                    return false;
                }
            } else if(!_toasterStatus.equals(other._toasterStatus)) {
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
            StringBuilder builder = new StringBuilder("Toaster [");
            boolean first = true;
        
            if (_darknessFactor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_darknessFactor=");
                builder.append(_darknessFactor);
             }
            if (_toasterManufacturer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterManufacturer=");
                builder.append(_toasterManufacturer);
             }
            if (_toasterModelNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterModelNumber=");
                builder.append(_toasterModelNumber);
             }
            if (_toasterStatus != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_toasterStatus=");
                builder.append(_toasterStatus);
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
