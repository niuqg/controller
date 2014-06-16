package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics;
import java.math.BigInteger;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class BytesBuilder {

    private BigInteger _received;
    private BigInteger _transmitted;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>> augmentation = new HashMap<>();

    public BytesBuilder() {
    } 


    public BigInteger getReceived() {
        return _received;
    }
    
    public BigInteger getTransmitted() {
        return _transmitted;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BytesBuilder setReceived(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._received = value;
        return this;
    }
    
    public BytesBuilder setTransmitted(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._transmitted = value;
        return this;
    }
    
    public BytesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Bytes build() {
        return new BytesImpl(this);
    }

    private static final class BytesImpl implements Bytes {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes.class;
        }

        private final BigInteger _received;
        private final BigInteger _transmitted;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>> augmentation;

        private BytesImpl(BytesBuilder builder) {
            this._received = builder.getReceived();
            this._transmitted = builder.getTransmitted();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public BigInteger getReceived() {
            return _received;
        }
        
        @Override
        public BigInteger getTransmitted() {
            return _transmitted;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_received == null) ? 0 : _received.hashCode());
            result = prime * result + ((_transmitted == null) ? 0 : _transmitted.hashCode());
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
            BytesImpl other = (BytesImpl) obj;
            if (_received == null) {
                if (other._received != null) {
                    return false;
                }
            } else if(!_received.equals(other._received)) {
                return false;
            }
            if (_transmitted == null) {
                if (other._transmitted != null) {
                    return false;
                }
            } else if(!_transmitted.equals(other._transmitted)) {
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
            StringBuilder builder = new StringBuilder("Bytes [");
            boolean first = true;
        
            if (_received != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_received=");
                builder.append(_received);
             }
            if (_transmitted != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transmitted=");
                builder.append(_transmitted);
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
