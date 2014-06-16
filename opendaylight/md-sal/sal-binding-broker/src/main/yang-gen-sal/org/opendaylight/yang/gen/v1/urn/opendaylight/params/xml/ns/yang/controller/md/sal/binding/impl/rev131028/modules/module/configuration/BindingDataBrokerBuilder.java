package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.data.broker.DomBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.binding.data.broker.MappingService;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class BindingDataBrokerBuilder {

    private DomBroker _domBroker;
    private MappingService _mappingService;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>> augmentation = new HashMap<>();

    public BindingDataBrokerBuilder() {
    } 
    


    public DomBroker getDomBroker() {
        return _domBroker;
    }
    
    public MappingService getMappingService() {
        return _mappingService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BindingDataBrokerBuilder setDomBroker(DomBroker value) {
    
        this._domBroker = value;
        return this;
    }
    
    public BindingDataBrokerBuilder setMappingService(MappingService value) {
    
        this._mappingService = value;
        return this;
    }
    
    public BindingDataBrokerBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BindingDataBroker build() {
        return new BindingDataBrokerImpl(this);
    }

    private static final class BindingDataBrokerImpl implements BindingDataBroker {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker.class;
        }

        private final DomBroker _domBroker;
        private final MappingService _mappingService;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>> augmentation;

        private BindingDataBrokerImpl(BindingDataBrokerBuilder builder) {
            this._domBroker = builder.getDomBroker();
            this._mappingService = builder.getMappingService();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public DomBroker getDomBroker() {
            return _domBroker;
        }
        
        @Override
        public MappingService getMappingService() {
            return _mappingService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.binding.impl.rev131028.modules.module.configuration.BindingDataBroker>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_domBroker == null) ? 0 : _domBroker.hashCode());
            result = prime * result + ((_mappingService == null) ? 0 : _mappingService.hashCode());
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
            if (_domBroker == null) {
                if (other._domBroker != null) {
                    return false;
                }
            } else if(!_domBroker.equals(other._domBroker)) {
                return false;
            }
            if (_mappingService == null) {
                if (other._mappingService != null) {
                    return false;
                }
            } else if(!_mappingService.equals(other._mappingService)) {
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
        
            if (_domBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domBroker=");
                builder.append(_domBroker);
             }
            if (_mappingService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mappingService=");
                builder.append(_mappingService);
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
