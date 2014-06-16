package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class ActionBuilder {

    private Integer _order;
    private ActionKey _key;
    private org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action _action;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>> augmentation = new HashMap<>();

    public ActionBuilder() {
    } 
    
    public ActionBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action arg) {
        this._action = arg.getAction();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action) {
            this._action = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action)arg).getAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Action] \n" +
              "but was: " + arg
            );
        }
    }

    public Integer getOrder() {
        return _order;
    }
    
    public ActionKey getKey() {
        return _key;
    }
    
    public org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action getAction() {
        return _action;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ActionBuilder setOrder(Integer value) {
    
        this._order = value;
        return this;
    }
    
    public ActionBuilder setKey(ActionKey value) {
    
        this._key = value;
        return this;
    }
    
    public ActionBuilder setAction(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action value) {
    
        this._action = value;
        return this;
    }
    
    public ActionBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Action build() {
        return new ActionImpl(this);
    }

    private static final class ActionImpl implements Action {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action.class;
        }

        private final Integer _order;
        private final ActionKey _key;
        private final org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action _action;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>> augmentation;

        private ActionImpl(ActionBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new ActionKey(
                    builder.getOrder()
                );
                this._order = builder.getOrder();
            } else {
                this._key = builder.getKey();
                this._order = _key.getOrder();
            }
            this._action = builder.getAction();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Integer getOrder() {
            return _order;
        }
        
        @Override
        public ActionKey getKey() {
            return _key;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action getAction() {
            return _action;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_order == null) ? 0 : _order.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_action == null) ? 0 : _action.hashCode());
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
            ActionImpl other = (ActionImpl) obj;
            if (_order == null) {
                if (other._order != null) {
                    return false;
                }
            } else if(!_order.equals(other._order)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_action == null) {
                if (other._action != null) {
                    return false;
                }
            } else if(!_action.equals(other._action)) {
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
            StringBuilder builder = new StringBuilder("Action [");
            boolean first = true;
        
            if (_order != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_order=");
                builder.append(_order);
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
            if (_action != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_action=");
                builder.append(_action);
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
