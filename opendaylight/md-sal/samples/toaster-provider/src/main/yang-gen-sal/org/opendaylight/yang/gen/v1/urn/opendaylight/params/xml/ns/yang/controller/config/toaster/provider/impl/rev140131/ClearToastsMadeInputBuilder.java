package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class ClearToastsMadeInputBuilder {

    private InstanceIdentifier<?> _contextInstance;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>> augmentation = new HashMap<>();

    public ClearToastsMadeInputBuilder() {
    } 
    
    public ClearToastsMadeInputBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef arg) {
        this._contextInstance = arg.getContextInstance();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef) {
            this._contextInstance = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef)arg).getContextInstance();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef] \n" +
              "but was: " + arg
            );
        }
    }

    public InstanceIdentifier<?> getContextInstance() {
        return _contextInstance;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ClearToastsMadeInputBuilder setContextInstance(InstanceIdentifier<?> value) {
    
        this._contextInstance = value;
        return this;
    }
    
    public ClearToastsMadeInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ClearToastsMadeInput build() {
        return new ClearToastsMadeInputImpl(this);
    }

    private static final class ClearToastsMadeInputImpl implements ClearToastsMadeInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput.class;
        }

        private final InstanceIdentifier<?> _contextInstance;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>> augmentation;

        private ClearToastsMadeInputImpl(ClearToastsMadeInputBuilder builder) {
            this._contextInstance = builder.getContextInstance();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public InstanceIdentifier<?> getContextInstance() {
            return _contextInstance;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_contextInstance == null) ? 0 : _contextInstance.hashCode());
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
            ClearToastsMadeInputImpl other = (ClearToastsMadeInputImpl) obj;
            if (_contextInstance == null) {
                if (other._contextInstance != null) {
                    return false;
                }
            } else if(!_contextInstance.equals(other._contextInstance)) {
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
            StringBuilder builder = new StringBuilder("ClearToastsMadeInput [");
            boolean first = true;
        
            if (_contextInstance != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_contextInstance=");
                builder.append(_contextInstance);
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
