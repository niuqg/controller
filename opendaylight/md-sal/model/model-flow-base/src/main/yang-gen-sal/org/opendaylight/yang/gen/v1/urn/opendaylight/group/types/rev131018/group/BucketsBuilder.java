package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class BucketsBuilder {

    private List<Bucket> _bucket;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>> augmentation = new HashMap<>();

    public BucketsBuilder() {
    } 


    public List<Bucket> getBucket() {
        return _bucket;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BucketsBuilder setBucket(List<Bucket> value) {
    
        this._bucket = value;
        return this;
    }
    
    public BucketsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Buckets build() {
        return new BucketsImpl(this);
    }

    private static final class BucketsImpl implements Buckets {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets.class;
        }

        private final List<Bucket> _bucket;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>> augmentation;

        private BucketsImpl(BucketsBuilder builder) {
            this._bucket = builder.getBucket();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Bucket> getBucket() {
            return _bucket;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bucket == null) ? 0 : _bucket.hashCode());
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
            BucketsImpl other = (BucketsImpl) obj;
            if (_bucket == null) {
                if (other._bucket != null) {
                    return false;
                }
            } else if(!_bucket.equals(other._bucket)) {
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
            StringBuilder builder = new StringBuilder("Buckets [");
            boolean first = true;
        
            if (_bucket != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bucket=");
                builder.append(_bucket);
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
