package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent.Operation;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent.Store;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEventKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class DataChangeEventBuilder {

    private Operation _operation;
    private InstanceIdentifier<?> _path;
    private Store _store;
    private DataChangeEventKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>> augmentation = new HashMap<>();

    public DataChangeEventBuilder() {
    } 


    public Operation getOperation() {
        return _operation;
    }
    
    public InstanceIdentifier<?> getPath() {
        return _path;
    }
    
    public Store getStore() {
        return _store;
    }
    
    public DataChangeEventKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DataChangeEventBuilder setOperation(Operation value) {
    
        this._operation = value;
        return this;
    }
    
    public DataChangeEventBuilder setPath(InstanceIdentifier<?> value) {
    
        this._path = value;
        return this;
    }
    
    public DataChangeEventBuilder setStore(Store value) {
    
        this._store = value;
        return this;
    }
    
    public DataChangeEventBuilder setKey(DataChangeEventKey value) {
    
        this._key = value;
        return this;
    }
    
    public DataChangeEventBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public DataChangeEvent build() {
        return new DataChangeEventImpl(this);
    }

    private static final class DataChangeEventImpl implements DataChangeEvent {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent.class;
        }

        private final Operation _operation;
        private final InstanceIdentifier<?> _path;
        private final Store _store;
        private final DataChangeEventKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>> augmentation;

        private DataChangeEventImpl(DataChangeEventBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new DataChangeEventKey(
                    builder.getPath()
                );
                this._path = builder.getPath();
            } else {
                this._key = builder.getKey();
                this._path = _key.getPath();
            }
            this._operation = builder.getOperation();
            this._store = builder.getStore();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Operation getOperation() {
            return _operation;
        }
        
        @Override
        public InstanceIdentifier<?> getPath() {
            return _path;
        }
        
        @Override
        public Store getStore() {
            return _store;
        }
        
        @Override
        public DataChangeEventKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rev140114.data.changed.notification.DataChangeEvent>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_operation == null) ? 0 : _operation.hashCode());
            result = prime * result + ((_path == null) ? 0 : _path.hashCode());
            result = prime * result + ((_store == null) ? 0 : _store.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            DataChangeEventImpl other = (DataChangeEventImpl) obj;
            if (_operation == null) {
                if (other._operation != null) {
                    return false;
                }
            } else if(!_operation.equals(other._operation)) {
                return false;
            }
            if (_path == null) {
                if (other._path != null) {
                    return false;
                }
            } else if(!_path.equals(other._path)) {
                return false;
            }
            if (_store == null) {
                if (other._store != null) {
                    return false;
                }
            } else if(!_store.equals(other._store)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
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
            StringBuilder builder = new StringBuilder("DataChangeEvent [");
            boolean first = true;
        
            if (_operation != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_operation=");
                builder.append(_operation);
             }
            if (_path != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_path=");
                builder.append(_path);
             }
            if (_store != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_store=");
                builder.append(_store);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
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
