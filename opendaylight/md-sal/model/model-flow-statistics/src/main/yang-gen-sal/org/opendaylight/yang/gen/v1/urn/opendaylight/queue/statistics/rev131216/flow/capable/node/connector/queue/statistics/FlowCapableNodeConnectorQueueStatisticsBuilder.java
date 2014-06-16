package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class FlowCapableNodeConnectorQueueStatisticsBuilder {

    private Counter64 _transmissionErrors;
    private Counter64 _transmittedBytes;
    private Counter64 _transmittedPackets;
    private Duration _duration;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>> augmentation = new HashMap<>();

    public FlowCapableNodeConnectorQueueStatisticsBuilder() {
    } 
    
    public FlowCapableNodeConnectorQueueStatisticsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics arg) {
        this._transmissionErrors = arg.getTransmissionErrors();
        this._transmittedBytes = arg.getTransmittedBytes();
        this._transmittedPackets = arg.getTransmittedPackets();
        this._duration = arg.getDuration();
    }
    
    public FlowCapableNodeConnectorQueueStatisticsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration arg) {
        this._duration = arg.getDuration();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics) {
            this._transmissionErrors = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics)arg).getTransmissionErrors();
            this._transmittedBytes = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics)arg).getTransmittedBytes();
            this._transmittedPackets = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics)arg).getTransmittedPackets();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration) {
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration)arg).getDuration();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics, org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration] \n" +
              "but was: " + arg
            );
        }
    }

    public Counter64 getTransmissionErrors() {
        return _transmissionErrors;
    }
    
    public Counter64 getTransmittedBytes() {
        return _transmittedBytes;
    }
    
    public Counter64 getTransmittedPackets() {
        return _transmittedPackets;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FlowCapableNodeConnectorQueueStatisticsBuilder setTransmissionErrors(Counter64 value) {
    
        this._transmissionErrors = value;
        return this;
    }
    
    public FlowCapableNodeConnectorQueueStatisticsBuilder setTransmittedBytes(Counter64 value) {
    
        this._transmittedBytes = value;
        return this;
    }
    
    public FlowCapableNodeConnectorQueueStatisticsBuilder setTransmittedPackets(Counter64 value) {
    
        this._transmittedPackets = value;
        return this;
    }
    
    public FlowCapableNodeConnectorQueueStatisticsBuilder setDuration(Duration value) {
    
        this._duration = value;
        return this;
    }
    
    public FlowCapableNodeConnectorQueueStatisticsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FlowCapableNodeConnectorQueueStatistics build() {
        return new FlowCapableNodeConnectorQueueStatisticsImpl(this);
    }

    private static final class FlowCapableNodeConnectorQueueStatisticsImpl implements FlowCapableNodeConnectorQueueStatistics {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics.class;
        }

        private final Counter64 _transmissionErrors;
        private final Counter64 _transmittedBytes;
        private final Counter64 _transmittedPackets;
        private final Duration _duration;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>> augmentation;

        private FlowCapableNodeConnectorQueueStatisticsImpl(FlowCapableNodeConnectorQueueStatisticsBuilder builder) {
            this._transmissionErrors = builder.getTransmissionErrors();
            this._transmittedBytes = builder.getTransmittedBytes();
            this._transmittedPackets = builder.getTransmittedPackets();
            this._duration = builder.getDuration();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Counter64 getTransmissionErrors() {
            return _transmissionErrors;
        }
        
        @Override
        public Counter64 getTransmittedBytes() {
            return _transmittedBytes;
        }
        
        @Override
        public Counter64 getTransmittedPackets() {
            return _transmittedPackets;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.flow.capable.node.connector.queue.statistics.FlowCapableNodeConnectorQueueStatistics>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_transmissionErrors == null) ? 0 : _transmissionErrors.hashCode());
            result = prime * result + ((_transmittedBytes == null) ? 0 : _transmittedBytes.hashCode());
            result = prime * result + ((_transmittedPackets == null) ? 0 : _transmittedPackets.hashCode());
            result = prime * result + ((_duration == null) ? 0 : _duration.hashCode());
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
            FlowCapableNodeConnectorQueueStatisticsImpl other = (FlowCapableNodeConnectorQueueStatisticsImpl) obj;
            if (_transmissionErrors == null) {
                if (other._transmissionErrors != null) {
                    return false;
                }
            } else if(!_transmissionErrors.equals(other._transmissionErrors)) {
                return false;
            }
            if (_transmittedBytes == null) {
                if (other._transmittedBytes != null) {
                    return false;
                }
            } else if(!_transmittedBytes.equals(other._transmittedBytes)) {
                return false;
            }
            if (_transmittedPackets == null) {
                if (other._transmittedPackets != null) {
                    return false;
                }
            } else if(!_transmittedPackets.equals(other._transmittedPackets)) {
                return false;
            }
            if (_duration == null) {
                if (other._duration != null) {
                    return false;
                }
            } else if(!_duration.equals(other._duration)) {
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
            StringBuilder builder = new StringBuilder("FlowCapableNodeConnectorQueueStatistics [");
            boolean first = true;
        
            if (_transmissionErrors != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transmissionErrors=");
                builder.append(_transmissionErrors);
             }
            if (_transmittedBytes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transmittedBytes=");
                builder.append(_transmittedBytes);
             }
            if (_transmittedPackets != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transmittedPackets=");
                builder.append(_transmittedPackets);
             }
            if (_duration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_duration=");
                builder.append(_duration);
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
