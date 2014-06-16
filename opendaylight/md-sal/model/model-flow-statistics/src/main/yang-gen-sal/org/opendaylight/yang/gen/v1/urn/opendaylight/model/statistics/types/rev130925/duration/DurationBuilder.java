package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class DurationBuilder {

    private Counter32 _nanosecond;
    private Counter32 _second;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>> augmentation = new HashMap<>();

    public DurationBuilder() {
    } 


    public Counter32 getNanosecond() {
        return _nanosecond;
    }
    
    public Counter32 getSecond() {
        return _second;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DurationBuilder setNanosecond(Counter32 value) {
    
        this._nanosecond = value;
        return this;
    }
    
    public DurationBuilder setSecond(Counter32 value) {
    
        this._second = value;
        return this;
    }
    
    public DurationBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Duration build() {
        return new DurationImpl(this);
    }

    private static final class DurationImpl implements Duration {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration.class;
        }

        private final Counter32 _nanosecond;
        private final Counter32 _second;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>> augmentation;

        private DurationImpl(DurationBuilder builder) {
            this._nanosecond = builder.getNanosecond();
            this._second = builder.getSecond();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Counter32 getNanosecond() {
            return _nanosecond;
        }
        
        @Override
        public Counter32 getSecond() {
            return _second;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_nanosecond == null) ? 0 : _nanosecond.hashCode());
            result = prime * result + ((_second == null) ? 0 : _second.hashCode());
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
            DurationImpl other = (DurationImpl) obj;
            if (_nanosecond == null) {
                if (other._nanosecond != null) {
                    return false;
                }
            } else if(!_nanosecond.equals(other._nanosecond)) {
                return false;
            }
            if (_second == null) {
                if (other._second != null) {
                    return false;
                }
            } else if(!_second.equals(other._second)) {
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
            StringBuilder builder = new StringBuilder("Duration [");
            boolean first = true;
        
            if (_nanosecond != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nanosecond=");
                builder.append(_nanosecond);
             }
            if (_second != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_second=");
                builder.append(_second);
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
