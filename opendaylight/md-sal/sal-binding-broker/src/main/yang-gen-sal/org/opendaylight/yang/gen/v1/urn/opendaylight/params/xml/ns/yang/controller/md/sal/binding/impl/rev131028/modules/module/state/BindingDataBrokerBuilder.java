package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.binding.data.broker.Data;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class BindingDataBrokerBuilder {

    private Data _data;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>> augmentation = new HashMap<>();

    public BindingDataBrokerBuilder() {
    } 
    


    public Data getData() {
        return _data;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BindingDataBrokerBuilder setData(Data value) {
    
        this._data = value;
        return this;
    }
    
    public BindingDataBrokerBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BindingDataBroker build() {
        return new BindingDataBrokerImpl(this);
    }

    private static final class BindingDataBrokerImpl implements BindingDataBroker {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker.class;
        }

        private final Data _data;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>> augmentation;

        private BindingDataBrokerImpl(BindingDataBrokerBuilder builder) {
            this._data = builder.getData();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Data getData() {
            return _data;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.state.BindingDataBroker>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_data == null) ? 0 : _data.hashCode());
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
            BindingDataBrokerImpl other = (BindingDataBrokerImpl) obj;
            if (_data == null) {
                if (other._data != null) {
                    return false;
                }
            } else if(!_data.equals(other._data)) {
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
            StringBuilder builder = new StringBuilder("BindingDataBroker [");
            boolean first = true;
        
            if (_data != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_data=");
                builder.append(_data);
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
