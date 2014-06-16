package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import java.math.BigInteger;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class MetadataBuilder {

    private BigInteger _metadata;
    private BigInteger _metadataMask;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>> augmentation = new HashMap<>();

    public MetadataBuilder() {
    } 
    
    public MetadataBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.OfMetadata arg) {
        this._metadata = arg.getMetadata();
        this._metadataMask = arg.getMetadataMask();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.OfMetadata</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.OfMetadata) {
            this._metadata = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.OfMetadata)arg).getMetadata();
            this._metadataMask = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.OfMetadata)arg).getMetadataMask();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.OfMetadata] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getMetadata() {
        return _metadata;
    }
    
    public BigInteger getMetadataMask() {
        return _metadataMask;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MetadataBuilder setMetadata(BigInteger value) {
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
    
        this._metadata = value;
        return this;
    }
    
    public MetadataBuilder setMetadataMask(BigInteger value) {
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
    
        this._metadataMask = value;
        return this;
    }
    
    public MetadataBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Metadata build() {
        return new MetadataImpl(this);
    }

    private static final class MetadataImpl implements Metadata {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata.class;
        }

        private final BigInteger _metadata;
        private final BigInteger _metadataMask;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>> augmentation;

        private MetadataImpl(MetadataBuilder builder) {
            this._metadata = builder.getMetadata();
            this._metadataMask = builder.getMetadataMask();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public BigInteger getMetadata() {
            return _metadata;
        }
        
        @Override
        public BigInteger getMetadataMask() {
            return _metadataMask;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_metadata == null) ? 0 : _metadata.hashCode());
            result = prime * result + ((_metadataMask == null) ? 0 : _metadataMask.hashCode());
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
            MetadataImpl other = (MetadataImpl) obj;
            if (_metadata == null) {
                if (other._metadata != null) {
                    return false;
                }
            } else if(!_metadata.equals(other._metadata)) {
                return false;
            }
            if (_metadataMask == null) {
                if (other._metadataMask != null) {
                    return false;
                }
            } else if(!_metadataMask.equals(other._metadataMask)) {
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
            StringBuilder builder = new StringBuilder("Metadata [");
            boolean first = true;
        
            if (_metadata != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadata=");
                builder.append(_metadata);
             }
            if (_metadataMask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadataMask=");
                builder.append(_metadataMask);
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
