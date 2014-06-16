package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class StateBuilder {

    private Boolean _blocked;
    private Boolean _linkDown;
    private Boolean _live;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> augmentation = new HashMap<>();

    public StateBuilder() {
    } 
    
    public StateBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState arg) {
        this._blocked = arg.isBlocked();
        this._linkDown = arg.isLinkDown();
        this._live = arg.isLive();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState) {
            this._blocked = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState)arg).isBlocked();
            this._linkDown = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState)arg).isLinkDown();
            this._live = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState)arg).isLive();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortState] \n" +
              "but was: " + arg
            );
        }
    }

    public Boolean isBlocked() {
        return _blocked;
    }
    
    public Boolean isLinkDown() {
        return _linkDown;
    }
    
    public Boolean isLive() {
        return _live;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public StateBuilder setBlocked(Boolean value) {
    
        this._blocked = value;
        return this;
    }
    
    public StateBuilder setLinkDown(Boolean value) {
    
        this._linkDown = value;
        return this;
    }
    
    public StateBuilder setLive(Boolean value) {
    
        this._live = value;
        return this;
    }
    
    public StateBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public State build() {
        return new StateImpl(this);
    }

    private static final class StateImpl implements State {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State.class;
        }

        private final Boolean _blocked;
        private final Boolean _linkDown;
        private final Boolean _live;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> augmentation;

        private StateImpl(StateBuilder builder) {
            this._blocked = builder.isBlocked();
            this._linkDown = builder.isLinkDown();
            this._live = builder.isLive();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Boolean isBlocked() {
            return _blocked;
        }
        
        @Override
        public Boolean isLinkDown() {
            return _linkDown;
        }
        
        @Override
        public Boolean isLive() {
            return _live;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_blocked == null) ? 0 : _blocked.hashCode());
            result = prime * result + ((_linkDown == null) ? 0 : _linkDown.hashCode());
            result = prime * result + ((_live == null) ? 0 : _live.hashCode());
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
            StateImpl other = (StateImpl) obj;
            if (_blocked == null) {
                if (other._blocked != null) {
                    return false;
                }
            } else if(!_blocked.equals(other._blocked)) {
                return false;
            }
            if (_linkDown == null) {
                if (other._linkDown != null) {
                    return false;
                }
            } else if(!_linkDown.equals(other._linkDown)) {
                return false;
            }
            if (_live == null) {
                if (other._live != null) {
                    return false;
                }
            } else if(!_live.equals(other._live)) {
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
            StringBuilder builder = new StringBuilder("State [");
            boolean first = true;
        
            if (_blocked != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_blocked=");
                builder.append(_blocked);
             }
            if (_linkDown != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_linkDown=");
                builder.append(_linkDown);
             }
            if (_live != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_live=");
                builder.append(_live);
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
