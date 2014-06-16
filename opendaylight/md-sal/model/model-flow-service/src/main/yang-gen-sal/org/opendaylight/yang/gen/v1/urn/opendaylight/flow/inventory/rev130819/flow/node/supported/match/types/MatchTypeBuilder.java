package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchTypeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.SupportType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class MatchTypeBuilder {

    private String _match;
    private MatchTypeKey _key;
    private SupportType _supportState;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>> augmentation = new HashMap<>();

    public MatchTypeBuilder() {
    } 
    
    public MatchTypeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature arg) {
        this._supportState = arg.getSupportState();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature) {
            this._supportState = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature)arg).getSupportState();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature] \n" +
              "but was: " + arg
            );
        }
    }

    public String getMatch() {
        return _match;
    }
    
    public MatchTypeKey getKey() {
        return _key;
    }
    
    public SupportType getSupportState() {
        return _supportState;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MatchTypeBuilder setMatch(String value) {
    
        this._match = value;
        return this;
    }
    
    public MatchTypeBuilder setKey(MatchTypeKey value) {
    
        this._key = value;
        return this;
    }
    
    public MatchTypeBuilder setSupportState(SupportType value) {
    
        this._supportState = value;
        return this;
    }
    
    public MatchTypeBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MatchType build() {
        return new MatchTypeImpl(this);
    }

    private static final class MatchTypeImpl implements MatchType {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType.class;
        }

        private final String _match;
        private final MatchTypeKey _key;
        private final SupportType _supportState;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>> augmentation;

        private MatchTypeImpl(MatchTypeBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new MatchTypeKey(
                    builder.getMatch()
                );
                this._match = builder.getMatch();
            } else {
                this._key = builder.getKey();
                this._match = _key.getMatch();
            }
            this._supportState = builder.getSupportState();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public String getMatch() {
            return _match;
        }
        
        @Override
        public MatchTypeKey getKey() {
            return _key;
        }
        
        @Override
        public SupportType getSupportState() {
            return _supportState;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.match.types.MatchType>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_match == null) ? 0 : _match.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_supportState == null) ? 0 : _supportState.hashCode());
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
            MatchTypeImpl other = (MatchTypeImpl) obj;
            if (_match == null) {
                if (other._match != null) {
                    return false;
                }
            } else if(!_match.equals(other._match)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_supportState == null) {
                if (other._supportState != null) {
                    return false;
                }
            } else if(!_supportState.equals(other._supportState)) {
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
            StringBuilder builder = new StringBuilder("MatchType [");
            boolean first = true;
        
            if (_match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_match=");
                builder.append(_match);
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
            if (_supportState != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_supportState=");
                builder.append(_supportState);
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
