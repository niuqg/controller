package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.dl.type.action._case.SetDlTypeAction;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class SetDlTypeActionCaseBuilder {

    private SetDlTypeAction _setDlTypeAction;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>> augmentation = new HashMap<>();

    public SetDlTypeActionCaseBuilder() {
    } 
    


    public SetDlTypeAction getSetDlTypeAction() {
        return _setDlTypeAction;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SetDlTypeActionCaseBuilder setSetDlTypeAction(SetDlTypeAction value) {
    
        this._setDlTypeAction = value;
        return this;
    }
    
    public SetDlTypeActionCaseBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SetDlTypeActionCase build() {
        return new SetDlTypeActionCaseImpl(this);
    }

    private static final class SetDlTypeActionCaseImpl implements SetDlTypeActionCase {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase.class;
        }

        private final SetDlTypeAction _setDlTypeAction;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>> augmentation;

        private SetDlTypeActionCaseImpl(SetDlTypeActionCaseBuilder builder) {
            this._setDlTypeAction = builder.getSetDlTypeAction();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public SetDlTypeAction getSetDlTypeAction() {
            return _setDlTypeAction;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetDlTypeActionCase>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_setDlTypeAction == null) ? 0 : _setDlTypeAction.hashCode());
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
            SetDlTypeActionCaseImpl other = (SetDlTypeActionCaseImpl) obj;
            if (_setDlTypeAction == null) {
                if (other._setDlTypeAction != null) {
                    return false;
                }
            } else if(!_setDlTypeAction.equals(other._setDlTypeAction)) {
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
            StringBuilder builder = new StringBuilder("SetDlTypeActionCase [");
            boolean first = true;
        
            if (_setDlTypeAction != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_setDlTypeAction=");
                builder.append(_setDlTypeAction);
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
