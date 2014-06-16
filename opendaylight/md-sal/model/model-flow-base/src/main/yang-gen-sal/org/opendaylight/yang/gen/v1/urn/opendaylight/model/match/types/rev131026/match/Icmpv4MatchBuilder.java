package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class Icmpv4MatchBuilder {

    private Short _icmpv4Code;
    private Short _icmpv4Type;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> augmentation = new HashMap<>();

    public Icmpv4MatchBuilder() {
    } 
    
    public Icmpv4MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields arg) {
        this._icmpv4Code = arg.getIcmpv4Code();
        this._icmpv4Type = arg.getIcmpv4Type();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields) {
            this._icmpv4Code = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields)arg).getIcmpv4Code();
            this._icmpv4Type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields)arg).getIcmpv4Type();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv4MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Short getIcmpv4Code() {
        return _icmpv4Code;
    }
    
    public Short getIcmpv4Type() {
        return _icmpv4Type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Icmpv4MatchBuilder setIcmpv4Code(Short value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Short>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Short("0"), new Short("255")));
            for (Range<Short> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._icmpv4Code = value;
        return this;
    }
    
    public Icmpv4MatchBuilder setIcmpv4Type(Short value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Short>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Short("0"), new Short("255")));
            for (Range<Short> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._icmpv4Type = value;
        return this;
    }
    
    public Icmpv4MatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Icmpv4Match build() {
        return new Icmpv4MatchImpl(this);
    }

    private static final class Icmpv4MatchImpl implements Icmpv4Match {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match.class;
        }

        private final Short _icmpv4Code;
        private final Short _icmpv4Type;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> augmentation;

        private Icmpv4MatchImpl(Icmpv4MatchBuilder builder) {
            this._icmpv4Code = builder.getIcmpv4Code();
            this._icmpv4Type = builder.getIcmpv4Type();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Short getIcmpv4Code() {
            return _icmpv4Code;
        }
        
        @Override
        public Short getIcmpv4Type() {
            return _icmpv4Type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_icmpv4Code == null) ? 0 : _icmpv4Code.hashCode());
            result = prime * result + ((_icmpv4Type == null) ? 0 : _icmpv4Type.hashCode());
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
            Icmpv4MatchImpl other = (Icmpv4MatchImpl) obj;
            if (_icmpv4Code == null) {
                if (other._icmpv4Code != null) {
                    return false;
                }
            } else if(!_icmpv4Code.equals(other._icmpv4Code)) {
                return false;
            }
            if (_icmpv4Type == null) {
                if (other._icmpv4Type != null) {
                    return false;
                }
            } else if(!_icmpv4Type.equals(other._icmpv4Type)) {
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
            StringBuilder builder = new StringBuilder("Icmpv4Match [");
            boolean first = true;
        
            if (_icmpv4Code != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv4Code=");
                builder.append(_icmpv4Code);
             }
            if (_icmpv4Type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv4Type=");
                builder.append(_icmpv4Type);
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
