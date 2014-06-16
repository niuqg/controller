package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.inmemory.data.broker.SchemaService;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class DomInmemoryDataBrokerBuilder {

    private SchemaService _schemaService;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> augmentation = new HashMap<>();

    public DomInmemoryDataBrokerBuilder() {
    } 
    


    public SchemaService getSchemaService() {
        return _schemaService;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DomInmemoryDataBrokerBuilder setSchemaService(SchemaService value) {
    
        this._schemaService = value;
        return this;
    }
    
    public DomInmemoryDataBrokerBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DomInmemoryDataBroker build() {
        return new DomInmemoryDataBrokerImpl(this);
    }

    private static final class DomInmemoryDataBrokerImpl implements DomInmemoryDataBroker {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker.class;
        }

        private final SchemaService _schemaService;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> augmentation;

        private DomInmemoryDataBrokerImpl(DomInmemoryDataBrokerBuilder builder) {
            this._schemaService = builder.getSchemaService();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public SchemaService getSchemaService() {
            return _schemaService;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomInmemoryDataBroker>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_schemaService == null) ? 0 : _schemaService.hashCode());
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
            DomInmemoryDataBrokerImpl other = (DomInmemoryDataBrokerImpl) obj;
            if (_schemaService == null) {
                if (other._schemaService != null) {
                    return false;
                }
            } else if(!_schemaService.equals(other._schemaService)) {
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
            StringBuilder builder = new StringBuilder("DomInmemoryDataBroker [");
            boolean first = true;
        
            if (_schemaService != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_schemaService=");
                builder.append(_schemaService);
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
