package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6FlowLabel;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class Ipv6LabelBuilder {

    private Ipv6FlowLabel _flabelMask;
    private Ipv6FlowLabel _ipv6Flabel;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>> augmentation = new HashMap<>();

    public Ipv6LabelBuilder() {
    } 


    public Ipv6FlowLabel getFlabelMask() {
        return _flabelMask;
    }
    
    public Ipv6FlowLabel getIpv6Flabel() {
        return _ipv6Flabel;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv6LabelBuilder setFlabelMask(Ipv6FlowLabel value) {
    
        this._flabelMask = value;
        return this;
    }
    
    public Ipv6LabelBuilder setIpv6Flabel(Ipv6FlowLabel value) {
    
        this._ipv6Flabel = value;
        return this;
    }
    
    public Ipv6LabelBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv6Label build() {
        return new Ipv6LabelImpl(this);
    }

    private static final class Ipv6LabelImpl implements Ipv6Label {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label.class;
        }

        private final Ipv6FlowLabel _flabelMask;
        private final Ipv6FlowLabel _ipv6Flabel;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>> augmentation;

        private Ipv6LabelImpl(Ipv6LabelBuilder builder) {
            this._flabelMask = builder.getFlabelMask();
            this._ipv6Flabel = builder.getIpv6Flabel();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Ipv6FlowLabel getFlabelMask() {
            return _flabelMask;
        }
        
        @Override
        public Ipv6FlowLabel getIpv6Flabel() {
            return _ipv6Flabel;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flabelMask == null) ? 0 : _flabelMask.hashCode());
            result = prime * result + ((_ipv6Flabel == null) ? 0 : _ipv6Flabel.hashCode());
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
            Ipv6LabelImpl other = (Ipv6LabelImpl) obj;
            if (_flabelMask == null) {
                if (other._flabelMask != null) {
                    return false;
                }
            } else if(!_flabelMask.equals(other._flabelMask)) {
                return false;
            }
            if (_ipv6Flabel == null) {
                if (other._ipv6Flabel != null) {
                    return false;
                }
            } else if(!_ipv6Flabel.equals(other._ipv6Flabel)) {
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
            StringBuilder builder = new StringBuilder("Ipv6Label [");
            boolean first = true;
        
            if (_flabelMask != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flabelMask=");
                builder.append(_flabelMask);
             }
            if (_ipv6Flabel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Flabel=");
                builder.append(_ipv6Flabel);
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
