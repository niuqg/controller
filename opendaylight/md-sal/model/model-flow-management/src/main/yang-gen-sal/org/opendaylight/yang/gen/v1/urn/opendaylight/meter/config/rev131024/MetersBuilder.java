package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.meters.Meter;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class MetersBuilder {

    private List<Meter> _meter;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>> augmentation = new HashMap<>();

    public MetersBuilder() {
    } 


    public List<Meter> getMeter() {
        return _meter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MetersBuilder setMeter(List<Meter> value) {
    
        this._meter = value;
        return this;
    }
    
    public MetersBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Meters build() {
        return new MetersImpl(this);
    }

    private static final class MetersImpl implements Meters {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters.class;
        }

        private final List<Meter> _meter;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>> augmentation;

        private MetersImpl(MetersBuilder builder) {
            this._meter = builder.getMeter();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Meter> getMeter() {
            return _meter;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meter == null) ? 0 : _meter.hashCode());
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
            MetersImpl other = (MetersImpl) obj;
            if (_meter == null) {
                if (other._meter != null) {
                    return false;
                }
            } else if(!_meter.equals(other._meter)) {
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
            StringBuilder builder = new StringBuilder("Meters [");
            boolean first = true;
        
            if (_meter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meter=");
                builder.append(_meter);
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
