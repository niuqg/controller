package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.set.field.match.SetFieldMatch;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class WildcardSetfieldBuilder {

    private List<SetFieldMatch> _setFieldMatch;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>> augmentation = new HashMap<>();

    public WildcardSetfieldBuilder() {
    } 
    
    public WildcardSetfieldBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch arg) {
        this._setFieldMatch = arg.getSetFieldMatch();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch) {
            this._setFieldMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch)arg).getSetFieldMatch();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.SetFieldMatch] \n" +
              "but was: " + arg
            );
        }
    }

    public List<SetFieldMatch> getSetFieldMatch() {
        return _setFieldMatch;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public WildcardSetfieldBuilder setSetFieldMatch(List<SetFieldMatch> value) {
    
        this._setFieldMatch = value;
        return this;
    }
    
    public WildcardSetfieldBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public WildcardSetfield build() {
        return new WildcardSetfieldImpl(this);
    }

    private static final class WildcardSetfieldImpl implements WildcardSetfield {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield.class;
        }

        private final List<SetFieldMatch> _setFieldMatch;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>> augmentation;

        private WildcardSetfieldImpl(WildcardSetfieldBuilder builder) {
            this._setFieldMatch = builder.getSetFieldMatch();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<SetFieldMatch> getSetFieldMatch() {
            return _setFieldMatch;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.table.feature.prop.type.wildcards.WildcardSetfield>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_setFieldMatch == null) ? 0 : _setFieldMatch.hashCode());
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
            WildcardSetfieldImpl other = (WildcardSetfieldImpl) obj;
            if (_setFieldMatch == null) {
                if (other._setFieldMatch != null) {
                    return false;
                }
            } else if(!_setFieldMatch.equals(other._setFieldMatch)) {
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
            StringBuilder builder = new StringBuilder("WildcardSetfield [");
            boolean first = true;
        
            if (_setFieldMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_setFieldMatch=");
                builder.append(_setFieldMatch);
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
