package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2AddressKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class L2AddressBuilder {

    private L2AddressKey _key;
    private MacAddress _mac;
    private NodeConnectorRef _nodeConnectorRef;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>> augmentation = new HashMap<>();

    public L2AddressBuilder() {
    } 
    
    public L2AddressBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address arg) {
        this._mac = arg.getMac();
        this._nodeConnectorRef = arg.getNodeConnectorRef();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address) {
            this._mac = ((org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address)arg).getMac();
            this._nodeConnectorRef = ((org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address)arg).getNodeConnectorRef();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.L2Address] \n" +
              "but was: " + arg
            );
        }
    }

    public L2AddressKey getKey() {
        return _key;
    }
    
    public MacAddress getMac() {
        return _mac;
    }
    
    public NodeConnectorRef getNodeConnectorRef() {
        return _nodeConnectorRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public L2AddressBuilder setKey(L2AddressKey value) {
    
        this._key = value;
        return this;
    }
    
    public L2AddressBuilder setMac(MacAddress value) {
    
        this._mac = value;
        return this;
    }
    
    public L2AddressBuilder setNodeConnectorRef(NodeConnectorRef value) {
    
        this._nodeConnectorRef = value;
        return this;
    }
    
    public L2AddressBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public L2Address build() {
        return new L2AddressImpl(this);
    }

    private static final class L2AddressImpl implements L2Address {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address.class;
        }

        private final L2AddressKey _key;
        private final MacAddress _mac;
        private final NodeConnectorRef _nodeConnectorRef;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>> augmentation;

        private L2AddressImpl(L2AddressBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new L2AddressKey(
                    builder.getMac()
                );
                this._mac = builder.getMac();
            } else {
                this._key = builder.getKey();
                this._mac = _key.getMac();
            }
            this._nodeConnectorRef = builder.getNodeConnectorRef();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public L2AddressKey getKey() {
            return _key;
        }
        
        @Override
        public MacAddress getMac() {
            return _mac;
        }
        
        @Override
        public NodeConnectorRef getNodeConnectorRef() {
            return _nodeConnectorRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402.l2.addresses.L2Address>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_mac == null) ? 0 : _mac.hashCode());
            result = prime * result + ((_nodeConnectorRef == null) ? 0 : _nodeConnectorRef.hashCode());
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
            L2AddressImpl other = (L2AddressImpl) obj;
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_mac == null) {
                if (other._mac != null) {
                    return false;
                }
            } else if(!_mac.equals(other._mac)) {
                return false;
            }
            if (_nodeConnectorRef == null) {
                if (other._nodeConnectorRef != null) {
                    return false;
                }
            } else if(!_nodeConnectorRef.equals(other._nodeConnectorRef)) {
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
            StringBuilder builder = new StringBuilder("L2Address [");
            boolean first = true;
        
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_mac != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mac=");
                builder.append(_mac);
             }
            if (_nodeConnectorRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeConnectorRef=");
                builder.append(_nodeConnectorRef);
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
