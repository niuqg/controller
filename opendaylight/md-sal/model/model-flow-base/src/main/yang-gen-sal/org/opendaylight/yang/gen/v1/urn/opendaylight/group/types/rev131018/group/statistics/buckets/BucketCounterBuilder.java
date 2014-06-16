package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounterKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class BucketCounterBuilder {

    private BucketId _bucketId;
    private Counter64 _byteCount;
    private Counter64 _packetCount;
    private BucketCounterKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> augmentation = new HashMap<>();

    public BucketCounterBuilder() {
    } 


    public BucketId getBucketId() {
        return _bucketId;
    }
    
    public Counter64 getByteCount() {
        return _byteCount;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    public BucketCounterKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BucketCounterBuilder setBucketId(BucketId value) {
    
        this._bucketId = value;
        return this;
    }
    
    public BucketCounterBuilder setByteCount(Counter64 value) {
    
        this._byteCount = value;
        return this;
    }
    
    public BucketCounterBuilder setPacketCount(Counter64 value) {
    
        this._packetCount = value;
        return this;
    }
    
    public BucketCounterBuilder setKey(BucketCounterKey value) {
    
        this._key = value;
        return this;
    }
    
    public BucketCounterBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BucketCounter build() {
        return new BucketCounterImpl(this);
    }

    private static final class BucketCounterImpl implements BucketCounter {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter.class;
        }

        private final BucketId _bucketId;
        private final Counter64 _byteCount;
        private final Counter64 _packetCount;
        private final BucketCounterKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> augmentation;

        private BucketCounterImpl(BucketCounterBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new BucketCounterKey(
                    builder.getBucketId()
                );
                this._bucketId = builder.getBucketId();
            } else {
                this._key = builder.getKey();
                this._bucketId = _key.getBucketId();
            }
            this._byteCount = builder.getByteCount();
            this._packetCount = builder.getPacketCount();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public BucketId getBucketId() {
            return _bucketId;
        }
        
        @Override
        public Counter64 getByteCount() {
            return _byteCount;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @Override
        public BucketCounterKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.buckets.BucketCounter>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bucketId == null) ? 0 : _bucketId.hashCode());
            result = prime * result + ((_byteCount == null) ? 0 : _byteCount.hashCode());
            result = prime * result + ((_packetCount == null) ? 0 : _packetCount.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            BucketCounterImpl other = (BucketCounterImpl) obj;
            if (_bucketId == null) {
                if (other._bucketId != null) {
                    return false;
                }
            } else if(!_bucketId.equals(other._bucketId)) {
                return false;
            }
            if (_byteCount == null) {
                if (other._byteCount != null) {
                    return false;
                }
            } else if(!_byteCount.equals(other._byteCount)) {
                return false;
            }
            if (_packetCount == null) {
                if (other._packetCount != null) {
                    return false;
                }
            } else if(!_packetCount.equals(other._packetCount)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
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
            StringBuilder builder = new StringBuilder("BucketCounter [");
            boolean first = true;
        
            if (_bucketId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bucketId=");
                builder.append(_bucketId);
             }
            if (_byteCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteCount=");
                builder.append(_byteCount);
             }
            if (_packetCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetCount=");
                builder.append(_packetCount);
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
