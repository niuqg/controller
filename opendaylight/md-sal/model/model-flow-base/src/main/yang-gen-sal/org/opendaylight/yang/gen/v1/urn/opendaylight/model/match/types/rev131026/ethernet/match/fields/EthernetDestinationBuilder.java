package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class EthernetDestinationBuilder {

    private MacAddress _address;
    private MacAddress _mask;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>> augmentation = new HashMap<>();

    public EthernetDestinationBuilder() {
    } 
    
    public EthernetDestinationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter arg) {
        this._address = arg.getAddress();
        this._mask = arg.getMask();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter) {
            this._address = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter)arg).getAddress();
            this._mask = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter)arg).getMask();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.MacAddressFilter] \n" +
              "but was: " + arg
            );
        }
    }

    public MacAddress getAddress() {
        return _address;
    }
    
    public MacAddress getMask() {
        return _mask;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EthernetDestinationBuilder setAddress(MacAddress value) {
    
        this._address = value;
        return this;
    }
    
    public EthernetDestinationBuilder setMask(MacAddress value) {
    
        this._mask = value;
        return this;
    }
    
    public EthernetDestinationBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EthernetDestination build() {
        return new EthernetDestinationImpl(this);
    }

    private static final class EthernetDestinationImpl implements EthernetDestination {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination.class;
        }

        private final MacAddress _address;
        private final MacAddress _mask;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>> augmentation;

        private EthernetDestinationImpl(EthernetDestinationBuilder builder) {
            this._address = builder.getAddress();
            this._mask = builder.getMask();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public MacAddress getAddress() {
            return _address;
        }
        
        @Override
        public MacAddress getMask() {
            return _mask;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_mask == null) ? 0 : _mask.hashCode());
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
            EthernetDestinationImpl other = (EthernetDestinationImpl) obj;
            if (_address == null) {
                if (other._address != null) {
                    return false;
                }
            } else if(!_address.equals(other._address)) {
                return false;
            }
            if (_mask == null) {
                if (other._mask != null) {
                    return false;
                }
            } else if(!_mask.equals(other._mask)) {
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
            StringBuilder builder = new StringBuilder("EthernetDestination [");
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
            if (_mask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mask=");
                builder.append(_mask);
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
