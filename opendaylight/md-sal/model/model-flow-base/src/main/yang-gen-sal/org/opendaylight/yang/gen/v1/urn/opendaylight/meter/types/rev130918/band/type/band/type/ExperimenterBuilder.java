package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class ExperimenterBuilder {

    private Long _experimenter;
    private Long _experimenterBurstSize;
    private Long _experimenterRate;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> augmentation = new HashMap<>();

    public ExperimenterBuilder() {
    } 
    


    public Long getExperimenter() {
        return _experimenter;
    }
    
    public Long getExperimenterBurstSize() {
        return _experimenterBurstSize;
    }
    
    public Long getExperimenterRate() {
        return _experimenterRate;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ExperimenterBuilder setExperimenter(Long value) {
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
    
        this._experimenter = value;
        return this;
    }
    
    public ExperimenterBuilder setExperimenterBurstSize(Long value) {
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
    
        this._experimenterBurstSize = value;
        return this;
    }
    
    public ExperimenterBuilder setExperimenterRate(Long value) {
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
    
        this._experimenterRate = value;
        return this;
    }
    
    public ExperimenterBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Experimenter build() {
        return new ExperimenterImpl(this);
    }

    private static final class ExperimenterImpl implements Experimenter {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter.class;
        }

        private final Long _experimenter;
        private final Long _experimenterBurstSize;
        private final Long _experimenterRate;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> augmentation;

        private ExperimenterImpl(ExperimenterBuilder builder) {
            this._experimenter = builder.getExperimenter();
            this._experimenterBurstSize = builder.getExperimenterBurstSize();
            this._experimenterRate = builder.getExperimenterRate();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getExperimenter() {
            return _experimenter;
        }
        
        @Override
        public Long getExperimenterBurstSize() {
            return _experimenterBurstSize;
        }
        
        @Override
        public Long getExperimenterRate() {
            return _experimenterRate;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.Experimenter>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_experimenter == null) ? 0 : _experimenter.hashCode());
            result = prime * result + ((_experimenterBurstSize == null) ? 0 : _experimenterBurstSize.hashCode());
            result = prime * result + ((_experimenterRate == null) ? 0 : _experimenterRate.hashCode());
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
            ExperimenterImpl other = (ExperimenterImpl) obj;
            if (_experimenter == null) {
                if (other._experimenter != null) {
                    return false;
                }
            } else if(!_experimenter.equals(other._experimenter)) {
                return false;
            }
            if (_experimenterBurstSize == null) {
                if (other._experimenterBurstSize != null) {
                    return false;
                }
            } else if(!_experimenterBurstSize.equals(other._experimenterBurstSize)) {
                return false;
            }
            if (_experimenterRate == null) {
                if (other._experimenterRate != null) {
                    return false;
                }
            } else if(!_experimenterRate.equals(other._experimenterRate)) {
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
            StringBuilder builder = new StringBuilder("Experimenter [");
            boolean first = true;
        
            if (_experimenter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenter=");
                builder.append(_experimenter);
             }
            if (_experimenterBurstSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenterBurstSize=");
                builder.append(_experimenterBurstSize);
             }
            if (_experimenterRate != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenterRate=");
                builder.append(_experimenterRate);
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
