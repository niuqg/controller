package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.data.compatible.broker.BindingMappingService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.data.compatible.broker.DomAsyncBroker;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class BindingDataCompatibleBrokerBuilder {

    private BindingMappingService _bindingMappingService;
    private DomAsyncBroker _domAsyncBroker;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>> augmentation = new HashMap<>();

    public BindingDataCompatibleBrokerBuilder() {
    } 
    


    public BindingMappingService getBindingMappingService() {
        return _bindingMappingService;
    }
    
    public DomAsyncBroker getDomAsyncBroker() {
        return _domAsyncBroker;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BindingDataCompatibleBrokerBuilder setBindingMappingService(BindingMappingService value) {
    
        this._bindingMappingService = value;
        return this;
    }
    
    public BindingDataCompatibleBrokerBuilder setDomAsyncBroker(DomAsyncBroker value) {
    
        this._domAsyncBroker = value;
        return this;
    }
    
    public BindingDataCompatibleBrokerBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BindingDataCompatibleBroker build() {
        return new BindingDataCompatibleBrokerImpl(this);
    }

    private static final class BindingDataCompatibleBrokerImpl implements BindingDataCompatibleBroker {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker.class;
        }

        private final BindingMappingService _bindingMappingService;
        private final DomAsyncBroker _domAsyncBroker;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>> augmentation;

        private BindingDataCompatibleBrokerImpl(BindingDataCompatibleBrokerBuilder builder) {
            this._bindingMappingService = builder.getBindingMappingService();
            this._domAsyncBroker = builder.getDomAsyncBroker();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public BindingMappingService getBindingMappingService() {
            return _bindingMappingService;
        }
        
        @Override
        public DomAsyncBroker getDomAsyncBroker() {
            return _domAsyncBroker;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataCompatibleBroker>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bindingMappingService == null) ? 0 : _bindingMappingService.hashCode());
            result = prime * result + ((_domAsyncBroker == null) ? 0 : _domAsyncBroker.hashCode());
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
            BindingDataCompatibleBrokerImpl other = (BindingDataCompatibleBrokerImpl) obj;
            if (_bindingMappingService == null) {
                if (other._bindingMappingService != null) {
                    return false;
                }
            } else if(!_bindingMappingService.equals(other._bindingMappingService)) {
                return false;
            }
            if (_domAsyncBroker == null) {
                if (other._domAsyncBroker != null) {
                    return false;
                }
            } else if(!_domAsyncBroker.equals(other._domAsyncBroker)) {
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
            StringBuilder builder = new StringBuilder("BindingDataCompatibleBroker [");
            boolean first = true;
        
            if (_bindingMappingService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bindingMappingService=");
                builder.append(_bindingMappingService);
             }
            if (_domAsyncBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domAsyncBroker=");
                builder.append(_domAsyncBroker);
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
