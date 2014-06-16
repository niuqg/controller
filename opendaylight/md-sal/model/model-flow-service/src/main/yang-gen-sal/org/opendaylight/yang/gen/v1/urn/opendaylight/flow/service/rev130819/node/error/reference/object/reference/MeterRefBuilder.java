package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class MeterRefBuilder {

    private org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef _meterRef;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>> augmentation = new HashMap<>();

    public MeterRefBuilder() {
    } 
    


    public org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef getMeterRef() {
        return _meterRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterRefBuilder setMeterRef(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef value) {
    
        this._meterRef = value;
        return this;
    }
    
    public MeterRefBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterRef build() {
        return new MeterRefImpl(this);
    }

    private static final class MeterRefImpl implements MeterRef {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef.class;
        }

        private final org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef _meterRef;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>> augmentation;

        private MeterRefImpl(MeterRefBuilder builder) {
            this._meterRef = builder.getMeterRef();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef getMeterRef() {
            return _meterRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.MeterRef>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_meterRef == null) ? 0 : _meterRef.hashCode());
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
            MeterRefImpl other = (MeterRefImpl) obj;
            if (_meterRef == null) {
                if (other._meterRef != null) {
                    return false;
                }
            } else if(!_meterRef.equals(other._meterRef)) {
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
            StringBuilder builder = new StringBuilder("MeterRef [");
            boolean first = true;
        
            if (_meterRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterRef=");
                builder.append(_meterRef);
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
