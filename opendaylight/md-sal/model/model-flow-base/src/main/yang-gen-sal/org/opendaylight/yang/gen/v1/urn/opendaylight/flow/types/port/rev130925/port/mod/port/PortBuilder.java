package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class PortBuilder {

    private Boolean _barrier;
    private String _containerName;
    private PortConfig _mask;
    private Long _portModOrder;
    private String _portName;
    private PortKey _key;
    private PortFeatures _advertisedFeatures;
    private PortConfig _configuration;
    private MacAddress _hardwareAddress;
    private Long _portNumber;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> augmentation = new HashMap<>();

    public PortBuilder() {
    } 
    
    public PortBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort arg) {
        this._advertisedFeatures = arg.getAdvertisedFeatures();
        this._configuration = arg.getConfiguration();
        this._hardwareAddress = arg.getHardwareAddress();
        this._portNumber = arg.getPortNumber();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort) {
            this._advertisedFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getAdvertisedFeatures();
            this._configuration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getConfiguration();
            this._hardwareAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getHardwareAddress();
            this._portNumber = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort)arg).getPortNumber();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort] \n" +
              "but was: " + arg
            );
        }
    }

    public Boolean isBarrier() {
        return _barrier;
    }
    
    public String getContainerName() {
        return _containerName;
    }
    
    public PortConfig getMask() {
        return _mask;
    }
    
    public Long getPortModOrder() {
        return _portModOrder;
    }
    
    public String getPortName() {
        return _portName;
    }
    
    public PortKey getKey() {
        return _key;
    }
    
    public PortFeatures getAdvertisedFeatures() {
        return _advertisedFeatures;
    }
    
    public PortConfig getConfiguration() {
        return _configuration;
    }
    
    public MacAddress getHardwareAddress() {
        return _hardwareAddress;
    }
    
    public Long getPortNumber() {
        return _portNumber;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PortBuilder setBarrier(Boolean value) {
    
        this._barrier = value;
        return this;
    }
    
    public PortBuilder setContainerName(String value) {
    
        this._containerName = value;
        return this;
    }
    
    public PortBuilder setMask(PortConfig value) {
    
        this._mask = value;
        return this;
    }
    
    public PortBuilder setPortModOrder(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._portModOrder = value;
        return this;
    }
    
    public PortBuilder setPortName(String value) {
    
        this._portName = value;
        return this;
    }
    
    public PortBuilder setKey(PortKey value) {
    
        this._key = value;
        return this;
    }
    
    public PortBuilder setAdvertisedFeatures(PortFeatures value) {
    
        this._advertisedFeatures = value;
        return this;
    }
    
    public PortBuilder setConfiguration(PortConfig value) {
    
        this._configuration = value;
        return this;
    }
    
    public PortBuilder setHardwareAddress(MacAddress value) {
    
        this._hardwareAddress = value;
        return this;
    }
    
    public PortBuilder setPortNumber(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._portNumber = value;
        return this;
    }
    
    public PortBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Port build() {
        return new PortImpl(this);
    }

    private static final class PortImpl implements Port {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port.class;
        }

        private final Boolean _barrier;
        private final String _containerName;
        private final PortConfig _mask;
        private final Long _portModOrder;
        private final String _portName;
        private final PortKey _key;
        private final PortFeatures _advertisedFeatures;
        private final PortConfig _configuration;
        private final MacAddress _hardwareAddress;
        private final Long _portNumber;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> augmentation;

        private PortImpl(PortBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new PortKey(
                    builder.getPortModOrder()
                );
                this._portModOrder = builder.getPortModOrder();
            } else {
                this._key = builder.getKey();
                this._portModOrder = _key.getPortModOrder();
            }
            this._barrier = builder.isBarrier();
            this._containerName = builder.getContainerName();
            this._mask = builder.getMask();
            this._portName = builder.getPortName();
            this._advertisedFeatures = builder.getAdvertisedFeatures();
            this._configuration = builder.getConfiguration();
            this._hardwareAddress = builder.getHardwareAddress();
            this._portNumber = builder.getPortNumber();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Boolean isBarrier() {
            return _barrier;
        }
        
        @Override
        public String getContainerName() {
            return _containerName;
        }
        
        @Override
        public PortConfig getMask() {
            return _mask;
        }
        
        @Override
        public Long getPortModOrder() {
            return _portModOrder;
        }
        
        @Override
        public String getPortName() {
            return _portName;
        }
        
        @Override
        public PortKey getKey() {
            return _key;
        }
        
        @Override
        public PortFeatures getAdvertisedFeatures() {
            return _advertisedFeatures;
        }
        
        @Override
        public PortConfig getConfiguration() {
            return _configuration;
        }
        
        @Override
        public MacAddress getHardwareAddress() {
            return _hardwareAddress;
        }
        
        @Override
        public Long getPortNumber() {
            return _portNumber;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_mask == null) ? 0 : _mask.hashCode());
            result = prime * result + ((_portModOrder == null) ? 0 : _portModOrder.hashCode());
            result = prime * result + ((_portName == null) ? 0 : _portName.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_advertisedFeatures == null) ? 0 : _advertisedFeatures.hashCode());
            result = prime * result + ((_configuration == null) ? 0 : _configuration.hashCode());
            result = prime * result + ((_hardwareAddress == null) ? 0 : _hardwareAddress.hashCode());
            result = prime * result + ((_portNumber == null) ? 0 : _portNumber.hashCode());
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
            PortImpl other = (PortImpl) obj;
            if (_barrier == null) {
                if (other._barrier != null) {
                    return false;
                }
            } else if(!_barrier.equals(other._barrier)) {
                return false;
            }
            if (_containerName == null) {
                if (other._containerName != null) {
                    return false;
                }
            } else if(!_containerName.equals(other._containerName)) {
                return false;
            }
            if (_mask == null) {
                if (other._mask != null) {
                    return false;
                }
            } else if(!_mask.equals(other._mask)) {
                return false;
            }
            if (_portModOrder == null) {
                if (other._portModOrder != null) {
                    return false;
                }
            } else if(!_portModOrder.equals(other._portModOrder)) {
                return false;
            }
            if (_portName == null) {
                if (other._portName != null) {
                    return false;
                }
            } else if(!_portName.equals(other._portName)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_advertisedFeatures == null) {
                if (other._advertisedFeatures != null) {
                    return false;
                }
            } else if(!_advertisedFeatures.equals(other._advertisedFeatures)) {
                return false;
            }
            if (_configuration == null) {
                if (other._configuration != null) {
                    return false;
                }
            } else if(!_configuration.equals(other._configuration)) {
                return false;
            }
            if (_hardwareAddress == null) {
                if (other._hardwareAddress != null) {
                    return false;
                }
            } else if(!_hardwareAddress.equals(other._hardwareAddress)) {
                return false;
            }
            if (_portNumber == null) {
                if (other._portNumber != null) {
                    return false;
                }
            } else if(!_portNumber.equals(other._portNumber)) {
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
            StringBuilder builder = new StringBuilder("Port [");
            boolean first = true;
        
            if (_barrier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_barrier=");
                builder.append(_barrier);
             }
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
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
            if (_portModOrder != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_portModOrder=");
                builder.append(_portModOrder);
             }
            if (_portName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_portName=");
                builder.append(_portName);
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
            if (_advertisedFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_advertisedFeatures=");
                builder.append(_advertisedFeatures);
             }
            if (_configuration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_configuration=");
                builder.append(_configuration);
             }
            if (_hardwareAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hardwareAddress=");
                builder.append(_hardwareAddress);
             }
            if (_portNumber != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_portNumber=");
                builder.append(_portNumber);
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
