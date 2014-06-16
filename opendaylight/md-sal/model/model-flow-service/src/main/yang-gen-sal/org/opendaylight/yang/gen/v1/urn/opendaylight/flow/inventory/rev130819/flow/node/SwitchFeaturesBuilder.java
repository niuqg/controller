package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node;
import java.util.List;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class SwitchFeaturesBuilder {

    private List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FeatureCapability>> _capabilities;
    private Long _maxBuffers;
    private Short _maxTables;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>> augmentation = new HashMap<>();

    public SwitchFeaturesBuilder() {
    } 


    public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FeatureCapability>> getCapabilities() {
        return _capabilities;
    }
    
    public Long getMaxBuffers() {
        return _maxBuffers;
    }
    
    public Short getMaxTables() {
        return _maxTables;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SwitchFeaturesBuilder setCapabilities(List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FeatureCapability>> value) {
    
        this._capabilities = value;
        return this;
    }
    
    public SwitchFeaturesBuilder setMaxBuffers(Long value) {
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
    
        this._maxBuffers = value;
        return this;
    }
    
    public SwitchFeaturesBuilder setMaxTables(Short value) {
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
    
        this._maxTables = value;
        return this;
    }
    
    public SwitchFeaturesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SwitchFeatures build() {
        return new SwitchFeaturesImpl(this);
    }

    private static final class SwitchFeaturesImpl implements SwitchFeatures {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures.class;
        }

        private final List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FeatureCapability>> _capabilities;
        private final Long _maxBuffers;
        private final Short _maxTables;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>> augmentation;

        private SwitchFeaturesImpl(SwitchFeaturesBuilder builder) {
            this._capabilities = builder.getCapabilities();
            this._maxBuffers = builder.getMaxBuffers();
            this._maxTables = builder.getMaxTables();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FeatureCapability>> getCapabilities() {
            return _capabilities;
        }
        
        @Override
        public Long getMaxBuffers() {
            return _maxBuffers;
        }
        
        @Override
        public Short getMaxTables() {
            return _maxTables;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SwitchFeatures>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_capabilities == null) ? 0 : _capabilities.hashCode());
            result = prime * result + ((_maxBuffers == null) ? 0 : _maxBuffers.hashCode());
            result = prime * result + ((_maxTables == null) ? 0 : _maxTables.hashCode());
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
            SwitchFeaturesImpl other = (SwitchFeaturesImpl) obj;
            if (_capabilities == null) {
                if (other._capabilities != null) {
                    return false;
                }
            } else if(!_capabilities.equals(other._capabilities)) {
                return false;
            }
            if (_maxBuffers == null) {
                if (other._maxBuffers != null) {
                    return false;
                }
            } else if(!_maxBuffers.equals(other._maxBuffers)) {
                return false;
            }
            if (_maxTables == null) {
                if (other._maxTables != null) {
                    return false;
                }
            } else if(!_maxTables.equals(other._maxTables)) {
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
            StringBuilder builder = new StringBuilder("SwitchFeatures [");
            boolean first = true;
        
            if (_capabilities != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_capabilities=");
                builder.append(_capabilities);
             }
            if (_maxBuffers != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxBuffers=");
                builder.append(_maxBuffers);
             }
            if (_maxTables != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxTables=");
                builder.append(_maxTables);
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
