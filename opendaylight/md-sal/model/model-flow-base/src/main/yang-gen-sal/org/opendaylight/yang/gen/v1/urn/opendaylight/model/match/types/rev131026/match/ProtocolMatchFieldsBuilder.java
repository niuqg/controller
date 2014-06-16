package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.protocol.match.fields.Pbb;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class ProtocolMatchFieldsBuilder {

    private Short _mplsBos;
    private Long _mplsLabel;
    private Short _mplsTc;
    private Pbb _pbb;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> augmentation = new HashMap<>();

    public ProtocolMatchFieldsBuilder() {
    } 
    
    public ProtocolMatchFieldsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields arg) {
        this._mplsBos = arg.getMplsBos();
        this._mplsLabel = arg.getMplsLabel();
        this._mplsTc = arg.getMplsTc();
        this._pbb = arg.getPbb();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields) {
            this._mplsBos = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getMplsBos();
            this._mplsLabel = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getMplsLabel();
            this._mplsTc = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getMplsTc();
            this._pbb = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields)arg).getPbb();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ProtocolMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Short getMplsBos() {
        return _mplsBos;
    }
    
    public Long getMplsLabel() {
        return _mplsLabel;
    }
    
    public Short getMplsTc() {
        return _mplsTc;
    }
    
    public Pbb getPbb() {
        return _pbb;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ProtocolMatchFieldsBuilder setMplsBos(Short value) {
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
    
        this._mplsBos = value;
        return this;
    }
    
    public ProtocolMatchFieldsBuilder setMplsLabel(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._mplsLabel = value;
        return this;
    }
    
    public ProtocolMatchFieldsBuilder setMplsTc(Short value) {
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
    
        this._mplsTc = value;
        return this;
    }
    
    public ProtocolMatchFieldsBuilder setPbb(Pbb value) {
    
        this._pbb = value;
        return this;
    }
    
    public ProtocolMatchFieldsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ProtocolMatchFields build() {
        return new ProtocolMatchFieldsImpl(this);
    }

    private static final class ProtocolMatchFieldsImpl implements ProtocolMatchFields {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields.class;
        }

        private final Short _mplsBos;
        private final Long _mplsLabel;
        private final Short _mplsTc;
        private final Pbb _pbb;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> augmentation;

        private ProtocolMatchFieldsImpl(ProtocolMatchFieldsBuilder builder) {
            this._mplsBos = builder.getMplsBos();
            this._mplsLabel = builder.getMplsLabel();
            this._mplsTc = builder.getMplsTc();
            this._pbb = builder.getPbb();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Short getMplsBos() {
            return _mplsBos;
        }
        
        @Override
        public Long getMplsLabel() {
            return _mplsLabel;
        }
        
        @Override
        public Short getMplsTc() {
            return _mplsTc;
        }
        
        @Override
        public Pbb getPbb() {
            return _pbb;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_mplsBos == null) ? 0 : _mplsBos.hashCode());
            result = prime * result + ((_mplsLabel == null) ? 0 : _mplsLabel.hashCode());
            result = prime * result + ((_mplsTc == null) ? 0 : _mplsTc.hashCode());
            result = prime * result + ((_pbb == null) ? 0 : _pbb.hashCode());
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
            ProtocolMatchFieldsImpl other = (ProtocolMatchFieldsImpl) obj;
            if (_mplsBos == null) {
                if (other._mplsBos != null) {
                    return false;
                }
            } else if(!_mplsBos.equals(other._mplsBos)) {
                return false;
            }
            if (_mplsLabel == null) {
                if (other._mplsLabel != null) {
                    return false;
                }
            } else if(!_mplsLabel.equals(other._mplsLabel)) {
                return false;
            }
            if (_mplsTc == null) {
                if (other._mplsTc != null) {
                    return false;
                }
            } else if(!_mplsTc.equals(other._mplsTc)) {
                return false;
            }
            if (_pbb == null) {
                if (other._pbb != null) {
                    return false;
                }
            } else if(!_pbb.equals(other._pbb)) {
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
            StringBuilder builder = new StringBuilder("ProtocolMatchFields [");
            boolean first = true;
        
            if (_mplsBos != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mplsBos=");
                builder.append(_mplsBos);
             }
            if (_mplsLabel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mplsLabel=");
                builder.append(_mplsLabel);
             }
            if (_mplsTc != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_mplsTc=");
                builder.append(_mplsTc);
             }
            if (_pbb != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_pbb=");
                builder.append(_pbb);
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
