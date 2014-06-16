package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class Icmpv6MatchBuilder {

    private Short _icmpv6Code;
    private Short _icmpv6Type;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> augmentation = new HashMap<>();

    public Icmpv6MatchBuilder() {
    } 
    
    public Icmpv6MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields arg) {
        this._icmpv6Code = arg.getIcmpv6Code();
        this._icmpv6Type = arg.getIcmpv6Type();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields) {
            this._icmpv6Code = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields)arg).getIcmpv6Code();
            this._icmpv6Type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields)arg).getIcmpv6Type();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Icmpv6MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Short getIcmpv6Code() {
        return _icmpv6Code;
    }
    
    public Short getIcmpv6Type() {
        return _icmpv6Type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Icmpv6MatchBuilder setIcmpv6Code(Short value) {
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
    
        this._icmpv6Code = value;
        return this;
    }
    
    public Icmpv6MatchBuilder setIcmpv6Type(Short value) {
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
    
        this._icmpv6Type = value;
        return this;
    }
    
    public Icmpv6MatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Icmpv6Match build() {
        return new Icmpv6MatchImpl(this);
    }

    private static final class Icmpv6MatchImpl implements Icmpv6Match {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match.class;
        }

        private final Short _icmpv6Code;
        private final Short _icmpv6Type;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> augmentation;

        private Icmpv6MatchImpl(Icmpv6MatchBuilder builder) {
            this._icmpv6Code = builder.getIcmpv6Code();
            this._icmpv6Type = builder.getIcmpv6Type();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Short getIcmpv6Code() {
            return _icmpv6Code;
        }
        
        @Override
        public Short getIcmpv6Type() {
            return _icmpv6Type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_icmpv6Code == null) ? 0 : _icmpv6Code.hashCode());
            result = prime * result + ((_icmpv6Type == null) ? 0 : _icmpv6Type.hashCode());
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
            Icmpv6MatchImpl other = (Icmpv6MatchImpl) obj;
            if (_icmpv6Code == null) {
                if (other._icmpv6Code != null) {
                    return false;
                }
            } else if(!_icmpv6Code.equals(other._icmpv6Code)) {
                return false;
            }
            if (_icmpv6Type == null) {
                if (other._icmpv6Type != null) {
                    return false;
                }
            } else if(!_icmpv6Type.equals(other._icmpv6Type)) {
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
            StringBuilder builder = new StringBuilder("Icmpv6Match [");
            boolean first = true;
        
            if (_icmpv6Code != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv6Code=");
                builder.append(_icmpv6Code);
             }
            if (_icmpv6Type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv6Type=");
                builder.append(_icmpv6Type);
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
