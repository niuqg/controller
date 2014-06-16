package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.QueueKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class QueueBuilder {

    private Long _id;
    private QueueKey _key;
    private NodeConnectorRef _node;
    private Long _port;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>> augmentation = new HashMap<>();

    public QueueBuilder() {
    } 
    
    public QueueBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueEntry arg) {
        this._node = arg.getNode();
        this._port = arg.getPort();
    }
    
    public QueueBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueConfigRequest arg) {
        this._port = arg.getPort();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueConfigRequest</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueConfigRequest) {
            this._port = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueConfigRequest)arg).getPort();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueEntry) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueEntry)arg).getNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueConfigRequest, org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public Long getId() {
        return _id;
    }
    
    public QueueKey getKey() {
        return _key;
    }
    
    public NodeConnectorRef getNode() {
        return _node;
    }
    
    public Long getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public QueueBuilder setId(Long value) {
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
    
        this._id = value;
        return this;
    }
    
    public QueueBuilder setKey(QueueKey value) {
    
        this._key = value;
        return this;
    }
    
    public QueueBuilder setNode(NodeConnectorRef value) {
    
        this._node = value;
        return this;
    }
    
    public QueueBuilder setPort(Long value) {
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
    
    public QueueBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Queue build() {
        return new QueueImpl(this);
    }

    private static final class QueueImpl implements Queue {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue.class;
        }

        private final Long _id;
        private final QueueKey _key;
        private final NodeConnectorRef _node;
        private final Long _port;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>> augmentation;

        private QueueImpl(QueueBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new QueueKey(
                    builder.getId(), 
                    builder.getNode()
                );
                this._id = builder.getId();
                this._node = builder.getNode();
            } else {
                this._key = builder.getKey();
                this._id = _key.getId();
                this._node = _key.getNode();
            }
            this._port = builder.getPort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getId() {
            return _id;
        }
        
        @Override
        public QueueKey getKey() {
            return _key;
        }
        
        @Override
        public NodeConnectorRef getNode() {
            return _node;
        }
        
        @Override
        public Long getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_id == null) ? 0 : _id.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
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
            QueueImpl other = (QueueImpl) obj;
            if (_id == null) {
                if (other._id != null) {
                    return false;
                }
            } else if(!_id.equals(other._id)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_port == null) {
                if (other._port != null) {
                    return false;
                }
            } else if(!_port.equals(other._port)) {
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
            StringBuilder builder = new StringBuilder("Queue [");
            boolean first = true;
        
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
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
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
             }
            if (_port != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_port=");
                builder.append(_port);
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
