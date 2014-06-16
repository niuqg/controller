package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatchKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class SetFieldMatchBuilder {

    private Boolean _hasMask;
    private Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> _matchType;
    private SetFieldMatchKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>> augmentation = new HashMap<>();

    public SetFieldMatchBuilder() {
    } 


    public Boolean isHasMask() {
        return _hasMask;
    }
    
    public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> getMatchType() {
        return _matchType;
    }
    
    public SetFieldMatchKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SetFieldMatchBuilder setHasMask(Boolean value) {
    
        this._hasMask = value;
        return this;
    }
    
    public SetFieldMatchBuilder setMatchType(Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> value) {
    
        this._matchType = value;
        return this;
    }
    
    public SetFieldMatchBuilder setKey(SetFieldMatchKey value) {
    
        this._key = value;
        return this;
    }
    
    public SetFieldMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SetFieldMatch build() {
        return new SetFieldMatchImpl(this);
    }

    private static final class SetFieldMatchImpl implements SetFieldMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch.class;
        }

        private final Boolean _hasMask;
        private final Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> _matchType;
        private final SetFieldMatchKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>> augmentation;

        private SetFieldMatchImpl(SetFieldMatchBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new SetFieldMatchKey(
                    builder.getMatchType()
                );
                this._matchType = builder.getMatchType();
            } else {
                this._key = builder.getKey();
                this._matchType = _key.getMatchType();
            }
            this._hasMask = builder.isHasMask();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Boolean isHasMask() {
            return _hasMask;
        }
        
        @Override
        public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.MatchField> getMatchType() {
            return _matchType;
        }
        
        @Override
        public SetFieldMatchKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_hasMask == null) ? 0 : _hasMask.hashCode());
            result = prime * result + ((_matchType == null) ? 0 : _matchType.hashCode());
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
            SetFieldMatchImpl other = (SetFieldMatchImpl) obj;
            if (_hasMask == null) {
                if (other._hasMask != null) {
                    return false;
                }
            } else if(!_hasMask.equals(other._hasMask)) {
                return false;
            }
            if (_matchType == null) {
                if (other._matchType != null) {
                    return false;
                }
            } else if(!_matchType.equals(other._matchType)) {
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
            StringBuilder builder = new StringBuilder("SetFieldMatch [");
            boolean first = true;
        
            if (_hasMask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_hasMask=");
                builder.append(_hasMask);
             }
            if (_matchType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_matchType=");
                builder.append(_matchType);
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
