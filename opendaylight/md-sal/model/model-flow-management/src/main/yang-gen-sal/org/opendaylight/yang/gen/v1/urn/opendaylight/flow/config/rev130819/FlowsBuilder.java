package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.flows.Flow;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class FlowsBuilder {

    private List<Flow> _flow;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>> augmentation = new HashMap<>();

    public FlowsBuilder() {
    } 


    public List<Flow> getFlow() {
        return _flow;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FlowsBuilder setFlow(List<Flow> value) {
    
        this._flow = value;
        return this;
    }
    
    public FlowsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Flows build() {
        return new FlowsImpl(this);
    }

    private static final class FlowsImpl implements Flows {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows.class;
        }

        private final List<Flow> _flow;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>> augmentation;

        private FlowsImpl(FlowsBuilder builder) {
            this._flow = builder.getFlow();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Flow> getFlow() {
            return _flow;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flow == null) ? 0 : _flow.hashCode());
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
            FlowsImpl other = (FlowsImpl) obj;
            if (_flow == null) {
                if (other._flow != null) {
                    return false;
                }
            } else if(!_flow.equals(other._flow)) {
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
            StringBuilder builder = new StringBuilder("Flows [");
            boolean first = true;
        
            if (_flow != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flow=");
                builder.append(_flow);
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
