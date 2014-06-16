package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.EtherType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class SetDlTypeActionBuilder {

    private EtherType _dlType;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>> augmentation = new HashMap<>();

    public SetDlTypeActionBuilder() {
    } 


    public EtherType getDlType() {
        return _dlType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SetDlTypeActionBuilder setDlType(EtherType value) {
    
        this._dlType = value;
        return this;
    }
    
    public SetDlTypeActionBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SetDlTypeAction build() {
        return new SetDlTypeActionImpl(this);
    }

    private static final class SetDlTypeActionImpl implements SetDlTypeAction {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction.class;
        }

        private final EtherType _dlType;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>> augmentation;

        private SetDlTypeActionImpl(SetDlTypeActionBuilder builder) {
            this._dlType = builder.getDlType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public EtherType getDlType() {
            return _dlType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dlType == null) ? 0 : _dlType.hashCode());
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
            SetDlTypeActionImpl other = (SetDlTypeActionImpl) obj;
            if (_dlType == null) {
                if (other._dlType != null) {
                    return false;
                }
            } else if(!_dlType.equals(other._dlType)) {
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
            StringBuilder builder = new StringBuilder("SetDlTypeAction [");
            boolean first = true;
        
            if (_dlType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dlType=");
                builder.append(_dlType);
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
