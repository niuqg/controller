package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.meter.band.header.MeterBandTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeaderKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.BandType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class MeterBandHeaderBuilder {

    private Long _bandBurstSize;
    private BandId _bandId;
    private Long _bandRate;
    private MeterBandTypes _meterBandTypes;
    private MeterBandHeaderKey _key;
    private BandType _bandType;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> augmentation = new HashMap<>();

    public MeterBandHeaderBuilder() {
    } 
    
    public MeterBandHeaderBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType arg) {
        this._bandType = arg.getBandType();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType) {
            this._bandType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType)arg).getBandType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType] \n" +
              "but was: " + arg
            );
        }
    }

    public Long getBandBurstSize() {
        return _bandBurstSize;
    }
    
    public BandId getBandId() {
        return _bandId;
    }
    
    public Long getBandRate() {
        return _bandRate;
    }
    
    public MeterBandTypes getMeterBandTypes() {
        return _meterBandTypes;
    }
    
    public MeterBandHeaderKey getKey() {
        return _key;
    }
    
    public BandType getBandType() {
        return _bandType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterBandHeaderBuilder setBandBurstSize(Long value) {
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
    
        this._bandBurstSize = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setBandId(BandId value) {
    
        this._bandId = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setBandRate(Long value) {
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
    
        this._bandRate = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setMeterBandTypes(MeterBandTypes value) {
    
        this._meterBandTypes = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setKey(MeterBandHeaderKey value) {
    
        this._key = value;
        return this;
    }
    
    public MeterBandHeaderBuilder setBandType(BandType value) {
    
        this._bandType = value;
        return this;
    }
    
    public MeterBandHeaderBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterBandHeader build() {
        return new MeterBandHeaderImpl(this);
    }

    private static final class MeterBandHeaderImpl implements MeterBandHeader {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader.class;
        }

        private final Long _bandBurstSize;
        private final BandId _bandId;
        private final Long _bandRate;
        private final MeterBandTypes _meterBandTypes;
        private final MeterBandHeaderKey _key;
        private final BandType _bandType;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> augmentation;

        private MeterBandHeaderImpl(MeterBandHeaderBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new MeterBandHeaderKey(
                    builder.getBandId()
                );
                this._bandId = builder.getBandId();
            } else {
                this._key = builder.getKey();
                this._bandId = _key.getBandId();
            }
            this._bandBurstSize = builder.getBandBurstSize();
            this._bandRate = builder.getBandRate();
            this._meterBandTypes = builder.getMeterBandTypes();
            this._bandType = builder.getBandType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getBandBurstSize() {
            return _bandBurstSize;
        }
        
        @Override
        public BandId getBandId() {
            return _bandId;
        }
        
        @Override
        public Long getBandRate() {
            return _bandRate;
        }
        
        @Override
        public MeterBandTypes getMeterBandTypes() {
            return _meterBandTypes;
        }
        
        @Override
        public MeterBandHeaderKey getKey() {
            return _key;
        }
        
        @Override
        public BandType getBandType() {
            return _bandType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bandBurstSize == null) ? 0 : _bandBurstSize.hashCode());
            result = prime * result + ((_bandId == null) ? 0 : _bandId.hashCode());
            result = prime * result + ((_bandRate == null) ? 0 : _bandRate.hashCode());
            result = prime * result + ((_meterBandTypes == null) ? 0 : _meterBandTypes.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_bandType == null) ? 0 : _bandType.hashCode());
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
            MeterBandHeaderImpl other = (MeterBandHeaderImpl) obj;
            if (_bandBurstSize == null) {
                if (other._bandBurstSize != null) {
                    return false;
                }
            } else if(!_bandBurstSize.equals(other._bandBurstSize)) {
                return false;
            }
            if (_bandId == null) {
                if (other._bandId != null) {
                    return false;
                }
            } else if(!_bandId.equals(other._bandId)) {
                return false;
            }
            if (_bandRate == null) {
                if (other._bandRate != null) {
                    return false;
                }
            } else if(!_bandRate.equals(other._bandRate)) {
                return false;
            }
            if (_meterBandTypes == null) {
                if (other._meterBandTypes != null) {
                    return false;
                }
            } else if(!_meterBandTypes.equals(other._meterBandTypes)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_bandType == null) {
                if (other._bandType != null) {
                    return false;
                }
            } else if(!_bandType.equals(other._bandType)) {
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
            StringBuilder builder = new StringBuilder("MeterBandHeader [");
            boolean first = true;
        
            if (_bandBurstSize != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandBurstSize=");
                builder.append(_bandBurstSize);
             }
            if (_bandId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandId=");
                builder.append(_bandId);
             }
            if (_bandRate != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandRate=");
                builder.append(_bandRate);
             }
            if (_meterBandTypes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandTypes=");
                builder.append(_meterBandTypes);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_bandType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandType=");
                builder.append(_bandType);
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
