package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.util.List;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class MeterFeaturesBuilder {

    private Short _maxBands;
    private Short _maxColor;
    private Counter32 _maxMeter;
    private List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> _meterBandSupported;
    private List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> _meterCapabilitiesSupported;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>> augmentation = new HashMap<>();

    public MeterFeaturesBuilder() {
    } 
    
    
    public MeterFeaturesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures arg) {
        this._maxBands = arg.getMaxBands();
        this._maxColor = arg.getMaxColor();
        this._maxMeter = arg.getMaxMeter();
        this._meterBandSupported = arg.getMeterBandSupported();
        this._meterCapabilitiesSupported = arg.getMeterCapabilitiesSupported();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures) {
            this._maxBands = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures)arg).getMaxBands();
            this._maxColor = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures)arg).getMaxColor();
            this._maxMeter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures)arg).getMaxMeter();
            this._meterBandSupported = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures)arg).getMeterBandSupported();
            this._meterCapabilitiesSupported = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures)arg).getMeterCapabilitiesSupported();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFeatures] \n" +
              "but was: " + arg
            );
        }
    }

    public Short getMaxBands() {
        return _maxBands;
    }
    
    public Short getMaxColor() {
        return _maxColor;
    }
    
    public Counter32 getMaxMeter() {
        return _maxMeter;
    }
    
    public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> getMeterBandSupported() {
        return _meterBandSupported;
    }
    
    public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> getMeterCapabilitiesSupported() {
        return _meterCapabilitiesSupported;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterFeaturesBuilder setMaxBands(Short value) {
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
    
        this._maxBands = value;
        return this;
    }
    
    public MeterFeaturesBuilder setMaxColor(Short value) {
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
    
        this._maxColor = value;
        return this;
    }
    
    public MeterFeaturesBuilder setMaxMeter(Counter32 value) {
    
        this._maxMeter = value;
        return this;
    }
    
    public MeterFeaturesBuilder setMeterBandSupported(List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> value) {
    
        this._meterBandSupported = value;
        return this;
    }
    
    public MeterFeaturesBuilder setMeterCapabilitiesSupported(List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> value) {
    
        this._meterCapabilitiesSupported = value;
        return this;
    }
    
    public MeterFeaturesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterFeatures build() {
        return new MeterFeaturesImpl(this);
    }

    private static final class MeterFeaturesImpl implements MeterFeatures {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures.class;
        }

        private final Short _maxBands;
        private final Short _maxColor;
        private final Counter32 _maxMeter;
        private final List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> _meterBandSupported;
        private final List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> _meterCapabilitiesSupported;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>> augmentation;

        private MeterFeaturesImpl(MeterFeaturesBuilder builder) {
            this._maxBands = builder.getMaxBands();
            this._maxColor = builder.getMaxColor();
            this._maxMeter = builder.getMaxMeter();
            this._meterBandSupported = builder.getMeterBandSupported();
            this._meterCapabilitiesSupported = builder.getMeterCapabilitiesSupported();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Short getMaxBands() {
            return _maxBands;
        }
        
        @Override
        public Short getMaxColor() {
            return _maxColor;
        }
        
        @Override
        public Counter32 getMaxMeter() {
            return _maxMeter;
        }
        
        @Override
        public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBand>> getMeterBandSupported() {
            return _meterBandSupported;
        }
        
        @Override
        public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterCapability>> getMeterCapabilitiesSupported() {
            return _meterCapabilitiesSupported;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.MeterFeatures>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_maxBands == null) ? 0 : _maxBands.hashCode());
            result = prime * result + ((_maxColor == null) ? 0 : _maxColor.hashCode());
            result = prime * result + ((_maxMeter == null) ? 0 : _maxMeter.hashCode());
            result = prime * result + ((_meterBandSupported == null) ? 0 : _meterBandSupported.hashCode());
            result = prime * result + ((_meterCapabilitiesSupported == null) ? 0 : _meterCapabilitiesSupported.hashCode());
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
            MeterFeaturesImpl other = (MeterFeaturesImpl) obj;
            if (_maxBands == null) {
                if (other._maxBands != null) {
                    return false;
                }
            } else if(!_maxBands.equals(other._maxBands)) {
                return false;
            }
            if (_maxColor == null) {
                if (other._maxColor != null) {
                    return false;
                }
            } else if(!_maxColor.equals(other._maxColor)) {
                return false;
            }
            if (_maxMeter == null) {
                if (other._maxMeter != null) {
                    return false;
                }
            } else if(!_maxMeter.equals(other._maxMeter)) {
                return false;
            }
            if (_meterBandSupported == null) {
                if (other._meterBandSupported != null) {
                    return false;
                }
            } else if(!_meterBandSupported.equals(other._meterBandSupported)) {
                return false;
            }
            if (_meterCapabilitiesSupported == null) {
                if (other._meterCapabilitiesSupported != null) {
                    return false;
                }
            } else if(!_meterCapabilitiesSupported.equals(other._meterCapabilitiesSupported)) {
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
            StringBuilder builder = new StringBuilder("MeterFeatures [");
            boolean first = true;
        
            if (_maxBands != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxBands=");
                builder.append(_maxBands);
             }
            if (_maxColor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxColor=");
                builder.append(_maxColor);
             }
            if (_maxMeter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxMeter=");
                builder.append(_maxMeter);
             }
            if (_meterBandSupported != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandSupported=");
                builder.append(_meterBandSupported);
             }
            if (_meterCapabilitiesSupported != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterCapabilitiesSupported=");
                builder.append(_meterCapabilitiesSupported);
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
