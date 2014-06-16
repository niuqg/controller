package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.broker.impl.AsyncDataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.dom.broker.impl.DataStore;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class DomBrokerImplBuilder {

    private AsyncDataBroker _asyncDataBroker;
    private DataStore _dataStore;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> augmentation = new HashMap<>();

    public DomBrokerImplBuilder() {
    } 
    


    public AsyncDataBroker getAsyncDataBroker() {
        return _asyncDataBroker;
    }
    
    public DataStore getDataStore() {
        return _dataStore;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DomBrokerImplBuilder setAsyncDataBroker(AsyncDataBroker value) {
    
        this._asyncDataBroker = value;
        return this;
    }
    
    public DomBrokerImplBuilder setDataStore(DataStore value) {
    
        this._dataStore = value;
        return this;
    }
    
    public DomBrokerImplBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DomBrokerImpl build() {
        return new DomBrokerImplImpl(this);
    }

    private static final class DomBrokerImplImpl implements DomBrokerImpl {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl.class;
        }

        private final AsyncDataBroker _asyncDataBroker;
        private final DataStore _dataStore;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> augmentation;

        private DomBrokerImplImpl(DomBrokerImplBuilder builder) {
            this._asyncDataBroker = builder.getAsyncDataBroker();
            this._dataStore = builder.getDataStore();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public AsyncDataBroker getAsyncDataBroker() {
            return _asyncDataBroker;
        }
        
        @Override
        public DataStore getDataStore() {
            return _dataStore;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.dom.impl.rev131028.modules.module.configuration.DomBrokerImpl>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_asyncDataBroker == null) ? 0 : _asyncDataBroker.hashCode());
            result = prime * result + ((_dataStore == null) ? 0 : _dataStore.hashCode());
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
            DomBrokerImplImpl other = (DomBrokerImplImpl) obj;
            if (_asyncDataBroker == null) {
                if (other._asyncDataBroker != null) {
                    return false;
                }
            } else if(!_asyncDataBroker.equals(other._asyncDataBroker)) {
                return false;
            }
            if (_dataStore == null) {
                if (other._dataStore != null) {
                    return false;
                }
            } else if(!_dataStore.equals(other._dataStore)) {
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
            StringBuilder builder = new StringBuilder("DomBrokerImpl [");
            boolean first = true;
        
            if (_asyncDataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_asyncDataBroker=");
                builder.append(_asyncDataBroker);
             }
            if (_dataStore != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataStore=");
                builder.append(_dataStore);
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
