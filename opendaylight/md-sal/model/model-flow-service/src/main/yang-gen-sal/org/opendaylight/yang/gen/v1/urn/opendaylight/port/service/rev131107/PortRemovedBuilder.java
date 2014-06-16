package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortReason;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortFeatures;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.flow.capable.port.State;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class PortRemovedBuilder {

    private PortReason _reason;
    private PortFeatures _currentFeature;
    private Long _currentSpeed;
    private Long _maximumSpeed;
    private String _name;
    private PortFeatures _peerFeatures;
    private State _state;
    private PortFeatures _supported;
    private PortFeatures _advertisedFeatures;
    private PortConfig _configuration;
    private MacAddress _hardwareAddress;
    private Long _portNumber;
    private List<Queue> _queue;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>> augmentation = new HashMap<>();

    public PortRemovedBuilder() {
    } 
    
    
    public PortRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowPortStatus arg) {
        this._reason = arg.getReason();
        this._currentFeature = arg.getCurrentFeature();
        this._currentSpeed = arg.getCurrentSpeed();
        this._maximumSpeed = arg.getMaximumSpeed();
        this._name = arg.getName();
        this._peerFeatures = arg.getPeerFeatures();
        this._state = arg.getState();
        this._supported = arg.getSupported();
        this._advertisedFeatures = arg.getAdvertisedFeatures();
        this._configuration = arg.getConfiguration();
        this._hardwareAddress = arg.getHardwareAddress();
        this._portNumber = arg.getPortNumber();
        this._queue = arg.getQueue();
    }
    
    public PortRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort arg) {
        this._currentFeature = arg.getCurrentFeature();
        this._currentSpeed = arg.getCurrentSpeed();
        this._maximumSpeed = arg.getMaximumSpeed();
        this._name = arg.getName();
        this._peerFeatures = arg.getPeerFeatures();
        this._state = arg.getState();
        this._supported = arg.getSupported();
        this._advertisedFeatures = arg.getAdvertisedFeatures();
        this._configuration = arg.getConfiguration();
        this._hardwareAddress = arg.getHardwareAddress();
        this._portNumber = arg.getPortNumber();
        this._queue = arg.getQueue();
    }
    
    public PortRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort arg) {
        this._advertisedFeatures = arg.getAdvertisedFeatures();
        this._configuration = arg.getConfiguration();
        this._hardwareAddress = arg.getHardwareAddress();
        this._portNumber = arg.getPortNumber();
    }
    
    public PortRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues arg) {
        this._queue = arg.getQueue();
    }
    
    public PortRemovedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowPortStatus</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort) {
            this._currentFeature = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getCurrentFeature();
            this._currentSpeed = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getCurrentSpeed();
            this._maximumSpeed = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getMaximumSpeed();
            this._name = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getName();
            this._peerFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getPeerFeatures();
            this._state = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getState();
            this._supported = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort)arg).getSupported();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowPortStatus) {
            this._reason = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowPortStatus)arg).getReason();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues) {
            this._queue = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues)arg).getQueue();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowPortStatus, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues] \n" +
              "but was: " + arg
            );
        }
    }

    public PortReason getReason() {
        return _reason;
    }
    
    public PortFeatures getCurrentFeature() {
        return _currentFeature;
    }
    
    public Long getCurrentSpeed() {
        return _currentSpeed;
    }
    
    public Long getMaximumSpeed() {
        return _maximumSpeed;
    }
    
    public String getName() {
        return _name;
    }
    
    public PortFeatures getPeerFeatures() {
        return _peerFeatures;
    }
    
    public State getState() {
        return _state;
    }
    
    public PortFeatures getSupported() {
        return _supported;
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
    
    public List<Queue> getQueue() {
        return _queue;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PortRemovedBuilder setReason(PortReason value) {
    
        this._reason = value;
        return this;
    }
    
    public PortRemovedBuilder setCurrentFeature(PortFeatures value) {
    
        this._currentFeature = value;
        return this;
    }
    
    public PortRemovedBuilder setCurrentSpeed(Long value) {
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
    
        this._currentSpeed = value;
        return this;
    }
    
    public PortRemovedBuilder setMaximumSpeed(Long value) {
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
    
        this._maximumSpeed = value;
        return this;
    }
    
    public PortRemovedBuilder setName(String value) {
    
        this._name = value;
        return this;
    }
    
    public PortRemovedBuilder setPeerFeatures(PortFeatures value) {
    
        this._peerFeatures = value;
        return this;
    }
    
    public PortRemovedBuilder setState(State value) {
    
        this._state = value;
        return this;
    }
    
    public PortRemovedBuilder setSupported(PortFeatures value) {
    
        this._supported = value;
        return this;
    }
    
    public PortRemovedBuilder setAdvertisedFeatures(PortFeatures value) {
    
        this._advertisedFeatures = value;
        return this;
    }
    
    public PortRemovedBuilder setConfiguration(PortConfig value) {
    
        this._configuration = value;
        return this;
    }
    
    public PortRemovedBuilder setHardwareAddress(MacAddress value) {
    
        this._hardwareAddress = value;
        return this;
    }
    
    public PortRemovedBuilder setPortNumber(Long value) {
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
    
    public PortRemovedBuilder setQueue(List<Queue> value) {
    
        this._queue = value;
        return this;
    }
    
    public PortRemovedBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public PortRemovedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PortRemoved build() {
        return new PortRemovedImpl(this);
    }

    private static final class PortRemovedImpl implements PortRemoved {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved.class;
        }

        private final PortReason _reason;
        private final PortFeatures _currentFeature;
        private final Long _currentSpeed;
        private final Long _maximumSpeed;
        private final String _name;
        private final PortFeatures _peerFeatures;
        private final State _state;
        private final PortFeatures _supported;
        private final PortFeatures _advertisedFeatures;
        private final PortConfig _configuration;
        private final MacAddress _hardwareAddress;
        private final Long _portNumber;
        private final List<Queue> _queue;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>> augmentation;

        private PortRemovedImpl(PortRemovedBuilder builder) {
            this._reason = builder.getReason();
            this._currentFeature = builder.getCurrentFeature();
            this._currentSpeed = builder.getCurrentSpeed();
            this._maximumSpeed = builder.getMaximumSpeed();
            this._name = builder.getName();
            this._peerFeatures = builder.getPeerFeatures();
            this._state = builder.getState();
            this._supported = builder.getSupported();
            this._advertisedFeatures = builder.getAdvertisedFeatures();
            this._configuration = builder.getConfiguration();
            this._hardwareAddress = builder.getHardwareAddress();
            this._portNumber = builder.getPortNumber();
            this._queue = builder.getQueue();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public PortReason getReason() {
            return _reason;
        }
        
        @Override
        public PortFeatures getCurrentFeature() {
            return _currentFeature;
        }
        
        @Override
        public Long getCurrentSpeed() {
            return _currentSpeed;
        }
        
        @Override
        public Long getMaximumSpeed() {
            return _maximumSpeed;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public PortFeatures getPeerFeatures() {
            return _peerFeatures;
        }
        
        @Override
        public State getState() {
            return _state;
        }
        
        @Override
        public PortFeatures getSupported() {
            return _supported;
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
        
        @Override
        public List<Queue> getQueue() {
            return _queue;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_reason == null) ? 0 : _reason.hashCode());
            result = prime * result + ((_currentFeature == null) ? 0 : _currentFeature.hashCode());
            result = prime * result + ((_currentSpeed == null) ? 0 : _currentSpeed.hashCode());
            result = prime * result + ((_maximumSpeed == null) ? 0 : _maximumSpeed.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_peerFeatures == null) ? 0 : _peerFeatures.hashCode());
            result = prime * result + ((_state == null) ? 0 : _state.hashCode());
            result = prime * result + ((_supported == null) ? 0 : _supported.hashCode());
            result = prime * result + ((_advertisedFeatures == null) ? 0 : _advertisedFeatures.hashCode());
            result = prime * result + ((_configuration == null) ? 0 : _configuration.hashCode());
            result = prime * result + ((_hardwareAddress == null) ? 0 : _hardwareAddress.hashCode());
            result = prime * result + ((_portNumber == null) ? 0 : _portNumber.hashCode());
            result = prime * result + ((_queue == null) ? 0 : _queue.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
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
            PortRemovedImpl other = (PortRemovedImpl) obj;
            if (_reason == null) {
                if (other._reason != null) {
                    return false;
                }
            } else if(!_reason.equals(other._reason)) {
                return false;
            }
            if (_currentFeature == null) {
                if (other._currentFeature != null) {
                    return false;
                }
            } else if(!_currentFeature.equals(other._currentFeature)) {
                return false;
            }
            if (_currentSpeed == null) {
                if (other._currentSpeed != null) {
                    return false;
                }
            } else if(!_currentSpeed.equals(other._currentSpeed)) {
                return false;
            }
            if (_maximumSpeed == null) {
                if (other._maximumSpeed != null) {
                    return false;
                }
            } else if(!_maximumSpeed.equals(other._maximumSpeed)) {
                return false;
            }
            if (_name == null) {
                if (other._name != null) {
                    return false;
                }
            } else if(!_name.equals(other._name)) {
                return false;
            }
            if (_peerFeatures == null) {
                if (other._peerFeatures != null) {
                    return false;
                }
            } else if(!_peerFeatures.equals(other._peerFeatures)) {
                return false;
            }
            if (_state == null) {
                if (other._state != null) {
                    return false;
                }
            } else if(!_state.equals(other._state)) {
                return false;
            }
            if (_supported == null) {
                if (other._supported != null) {
                    return false;
                }
            } else if(!_supported.equals(other._supported)) {
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
            if (_queue == null) {
                if (other._queue != null) {
                    return false;
                }
            } else if(!_queue.equals(other._queue)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
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
            StringBuilder builder = new StringBuilder("PortRemoved [");
            boolean first = true;
        
            if (_reason != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_reason=");
                builder.append(_reason);
             }
            if (_currentFeature != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_currentFeature=");
                builder.append(_currentFeature);
             }
            if (_currentSpeed != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_currentSpeed=");
                builder.append(_currentSpeed);
             }
            if (_maximumSpeed != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maximumSpeed=");
                builder.append(_maximumSpeed);
             }
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_peerFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_peerFeatures=");
                builder.append(_peerFeatures);
             }
            if (_state != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_state=");
                builder.append(_state);
             }
            if (_supported != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_supported=");
                builder.append(_supported);
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
            if (_queue != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_queue=");
                builder.append(_queue);
             }
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
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
