package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class FlowRefBuilder {

    private org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef _flowRef;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>> augmentation = new HashMap<>();

    public FlowRefBuilder() {
    } 
    


    public org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef getFlowRef() {
        return _flowRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FlowRefBuilder setFlowRef(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef value) {
    
        this._flowRef = value;
        return this;
    }
    
    public FlowRefBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FlowRef build() {
        return new FlowRefImpl(this);
    }

    private static final class FlowRefImpl implements FlowRef {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef.class;
        }

        private final org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef _flowRef;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>> augmentation;

        private FlowRefImpl(FlowRefBuilder builder) {
            this._flowRef = builder.getFlowRef();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef getFlowRef() {
            return _flowRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowRef == null) ? 0 : _flowRef.hashCode());
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
            FlowRefImpl other = (FlowRefImpl) obj;
            if (_flowRef == null) {
                if (other._flowRef != null) {
                    return false;
                }
            } else if(!_flowRef.equals(other._flowRef)) {
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
            StringBuilder builder = new StringBuilder("FlowRef [");
            boolean first = true;
        
            if (_flowRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowRef=");
                builder.append(_flowRef);
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
