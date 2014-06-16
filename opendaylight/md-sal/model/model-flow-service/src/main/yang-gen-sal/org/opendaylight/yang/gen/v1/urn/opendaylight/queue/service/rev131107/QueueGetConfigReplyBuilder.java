package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class QueueGetConfigReplyBuilder {

    private Long _port;
    private QueueId _queueId;
    private Integer _property;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>> augmentation = new HashMap<>();

    public QueueGetConfigReplyBuilder() {
    } 
    
    
    public QueueGetConfigReplyBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket arg) {
        this._port = arg.getPort();
        this._queueId = arg.getQueueId();
        this._property = arg.getProperty();
    }
    
    public QueueGetConfigReplyBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue arg) {
        this._property = arg.getProperty();
    }
    
    public QueueGetConfigReplyBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef] \n" +
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
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public QueueGetConfigReplyBuilder setPort(Long value) {
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
    
    public QueueGetConfigReplyBuilder setQueueId(QueueId value) {
    
        this._queueId = value;
        return this;
    }
    
    public QueueGetConfigReplyBuilder setProperty(Integer value) {
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
    
    public QueueGetConfigReplyBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public QueueGetConfigReplyBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public QueueGetConfigReply build() {
        return new QueueGetConfigReplyImpl(this);
    }

    private static final class QueueGetConfigReplyImpl implements QueueGetConfigReply {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply.class;
        }

        private final Long _port;
        private final QueueId _queueId;
        private final Integer _property;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>> augmentation;

        private QueueGetConfigReplyImpl(QueueGetConfigReplyBuilder builder) {
            this._port = builder.getPort();
            this._queueId = builder.getQueueId();
            this._property = builder.getProperty();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>>singletonMap(e.getKey(), e.getValue());
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
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply>> E getAugmentation(Class<E> augmentationType) {
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
            QueueGetConfigReplyImpl other = (QueueGetConfigReplyImpl) obj;
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
            StringBuilder builder = new StringBuilder("QueueGetConfigReply [");
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
