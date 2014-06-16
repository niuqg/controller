package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.Address;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class SetNextHopActionBuilder {

    private Address _address;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>> augmentation = new HashMap<>();

    public SetNextHopActionBuilder() {
    } 
    
    public SetNextHopActionBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address arg) {
        this._address = arg.getAddress();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address) {
            this._address = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address)arg).getAddress();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Address] \n" +
              "but was: " + arg
            );
        }
    }

    public Address getAddress() {
        return _address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SetNextHopActionBuilder setAddress(Address value) {
    
        this._address = value;
        return this;
    }
    
    public SetNextHopActionBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SetNextHopAction build() {
        return new SetNextHopActionImpl(this);
    }

    private static final class SetNextHopActionImpl implements SetNextHopAction {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction.class;
        }

        private final Address _address;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>> augmentation;

        private SetNextHopActionImpl(SetNextHopActionBuilder builder) {
            this._address = builder.getAddress();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Address getAddress() {
            return _address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.next.hop.action._case.SetNextHopAction>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_address == null) ? 0 : _address.hashCode());
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
            SetNextHopActionImpl other = (SetNextHopActionImpl) obj;
            if (_address == null) {
                if (other._address != null) {
                    return false;
                }
            } else if(!_address.equals(other._address)) {
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
            StringBuilder builder = new StringBuilder("SetNextHopAction [");
            boolean first = true;
        
            if (_address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_address=");
                builder.append(_address);
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
