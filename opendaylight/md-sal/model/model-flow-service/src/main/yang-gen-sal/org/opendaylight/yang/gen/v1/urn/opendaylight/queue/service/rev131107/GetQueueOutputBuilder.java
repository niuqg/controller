package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class GetQueueOutputBuilder {

    private Long _port;
    private QueueId _queueId;
    private Integer _property;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>> augmentation = new HashMap<>();

    public GetQueueOutputBuilder() {
    } 
    
    public GetQueueOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket arg) {
        this._port = arg.getPort();
        this._queueId = arg.getQueueId();
        this._property = arg.getProperty();
    }
    
    public GetQueueOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue arg) {
        this._property = arg.getProperty();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket) {
            this._port = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket)arg).getPort();
            this._queueId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket)arg).getQueueId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue) {
            this._property = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue)arg).getProperty();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue] \n" +
              "but was: " + arg
            );
        }
    }

    public Long getPort() {
        return _port;
    }
    
    public QueueId getQueueId() {
        return _queueId;
    }
    
    public Integer getProperty() {
        return _property;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GetQueueOutputBuilder setPort(Long value) {
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
    
        this._port = value;
        return this;
    }
    
    public GetQueueOutputBuilder setQueueId(QueueId value) {
    
        this._queueId = value;
        return this;
    }
    
    public GetQueueOutputBuilder setProperty(Integer value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("0"), new Integer("65535")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._property = value;
        return this;
    }
    
    public GetQueueOutputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GetQueueOutput build() {
        return new GetQueueOutputImpl(this);
    }

    private static final class GetQueueOutputImpl implements GetQueueOutput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput.class;
        }

        private final Long _port;
        private final QueueId _queueId;
        private final Integer _property;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>> augmentation;

        private GetQueueOutputImpl(GetQueueOutputBuilder builder) {
            this._port = builder.getPort();
            this._queueId = builder.getQueueId();
            this._property = builder.getProperty();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getPort() {
            return _port;
        }
        
        @Override
        public QueueId getQueueId() {
            return _queueId;
        }
        
        @Override
        public Integer getProperty() {
            return _property;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
            result = prime * result + ((_queueId == null) ? 0 : _queueId.hashCode());
            result = prime * result + ((_property == null) ? 0 : _property.hashCode());
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
            GetQueueOutputImpl other = (GetQueueOutputImpl) obj;
            if (_port == null) {
                if (other._port != null) {
                    return false;
                }
            } else if(!_port.equals(other._port)) {
                return false;
            }
            if (_queueId == null) {
                if (other._queueId != null) {
                    return false;
                }
            } else if(!_queueId.equals(other._queueId)) {
                return false;
            }
            if (_property == null) {
                if (other._property != null) {
                    return false;
                }
            } else if(!_property.equals(other._property)) {
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
            StringBuilder builder = new StringBuilder("GetQueueOutput [");
            boolean first = true;
        
            if (_port != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_port=");
                builder.append(_port);
             }
            if (_queueId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_queueId=");
                builder.append(_queueId);
             }
            if (_property != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_property=");
                builder.append(_property);
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
