package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class DscpRemarkBuilder {

    private Long _dscpRemarkBurstSize;
    private Long _dscpRemarkRate;
    private Short _percLevel;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> augmentation = new HashMap<>();

    public DscpRemarkBuilder() {
    } 
    


    public Long getDscpRemarkBurstSize() {
        return _dscpRemarkBurstSize;
    }
    
    public Long getDscpRemarkRate() {
        return _dscpRemarkRate;
    }
    
    public Short getPercLevel() {
        return _percLevel;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DscpRemarkBuilder setDscpRemarkBurstSize(Long value) {
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
    
        this._dscpRemarkBurstSize = value;
        return this;
    }
    
    public DscpRemarkBuilder setDscpRemarkRate(Long value) {
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
    
        this._dscpRemarkRate = value;
        return this;
    }
    
    public DscpRemarkBuilder setPercLevel(Short value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Short>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Short("0"), new Short("255")));
            for (Range<Short> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._percLevel = value;
        return this;
    }
    
    public DscpRemarkBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DscpRemark build() {
        return new DscpRemarkImpl(this);
    }

    private static final class DscpRemarkImpl implements DscpRemark {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark.class;
        }

        private final Long _dscpRemarkBurstSize;
        private final Long _dscpRemarkRate;
        private final Short _percLevel;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> augmentation;

        private DscpRemarkImpl(DscpRemarkBuilder builder) {
            this._dscpRemarkBurstSize = builder.getDscpRemarkBurstSize();
            this._dscpRemarkRate = builder.getDscpRemarkRate();
            this._percLevel = builder.getPercLevel();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getDscpRemarkBurstSize() {
            return _dscpRemarkBurstSize;
        }
        
        @Override
        public Long getDscpRemarkRate() {
            return _dscpRemarkRate;
        }
        
        @Override
        public Short getPercLevel() {
            return _percLevel;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dscpRemarkBurstSize == null) ? 0 : _dscpRemarkBurstSize.hashCode());
            result = prime * result + ((_dscpRemarkRate == null) ? 0 : _dscpRemarkRate.hashCode());
            result = prime * result + ((_percLevel == null) ? 0 : _percLevel.hashCode());
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
            DscpRemarkImpl other = (DscpRemarkImpl) obj;
            if (_dscpRemarkBurstSize == null) {
                if (other._dscpRemarkBurstSize != null) {
                    return false;
                }
            } else if(!_dscpRemarkBurstSize.equals(other._dscpRemarkBurstSize)) {
                return false;
            }
            if (_dscpRemarkRate == null) {
                if (other._dscpRemarkRate != null) {
                    return false;
                }
            } else if(!_dscpRemarkRate.equals(other._dscpRemarkRate)) {
                return false;
            }
            if (_percLevel == null) {
                if (other._percLevel != null) {
                    return false;
                }
            } else if(!_percLevel.equals(other._percLevel)) {
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
            StringBuilder builder = new StringBuilder("DscpRemark [");
            boolean first = true;
        
            if (_dscpRemarkBurstSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dscpRemarkBurstSize=");
                builder.append(_dscpRemarkBurstSize);
             }
            if (_dscpRemarkRate != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dscpRemarkRate=");
                builder.append(_dscpRemarkRate);
             }
            if (_percLevel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_percLevel=");
                builder.append(_percLevel);
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
