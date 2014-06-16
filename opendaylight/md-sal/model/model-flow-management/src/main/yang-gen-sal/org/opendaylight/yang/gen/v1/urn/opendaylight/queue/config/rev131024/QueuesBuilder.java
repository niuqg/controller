package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class QueuesBuilder {

    private List<Queue> _queue;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>> augmentation = new HashMap<>();

    public QueuesBuilder() {
    } 


    public List<Queue> getQueue() {
        return _queue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public QueuesBuilder setQueue(List<Queue> value) {
    
        this._queue = value;
        return this;
    }
    
    public QueuesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Queues build() {
        return new QueuesImpl(this);
    }

    private static final class QueuesImpl implements Queues {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues.class;
        }

        private final List<Queue> _queue;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>> augmentation;

        private QueuesImpl(QueuesBuilder builder) {
            this._queue = builder.getQueue();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Queue> getQueue() {
            return _queue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_queue == null) ? 0 : _queue.hashCode());
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
            QueuesImpl other = (QueuesImpl) obj;
            if (_queue == null) {
                if (other._queue != null) {
                    return false;
                }
            } else if(!_queue.equals(other._queue)) {
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
            StringBuilder builder = new StringBuilder("Queues [");
            boolean first = true;
        
            if (_queue != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_queue=");
                builder.append(_queue);
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
