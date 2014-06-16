package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class Ipv4MatchBuilder {

    private Ipv4Prefix _ipv4Destination;
    private Ipv4Prefix _ipv4Source;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>> augmentation = new HashMap<>();

    public Ipv4MatchBuilder() {
    } 
    
    public Ipv4MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv4MatchFields arg) {
        this._ipv4Destination = arg.getIpv4Destination();
        this._ipv4Source = arg.getIpv4Source();
    }
    

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv4MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv4MatchFields) {
            this._ipv4Destination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv4MatchFields)arg).getIpv4Destination();
            this._ipv4Source = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv4MatchFields)arg).getIpv4Source();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv4MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Ipv4Prefix getIpv4Destination() {
        return _ipv4Destination;
    }
    
    public Ipv4Prefix getIpv4Source() {
        return _ipv4Source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv4MatchBuilder setIpv4Destination(Ipv4Prefix value) {
    
        this._ipv4Destination = value;
        return this;
    }
    
    public Ipv4MatchBuilder setIpv4Source(Ipv4Prefix value) {
    
        this._ipv4Source = value;
        return this;
    }
    
    public Ipv4MatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv4Match build() {
        return new Ipv4MatchImpl(this);
    }

    private static final class Ipv4MatchImpl implements Ipv4Match {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match.class;
        }

        private final Ipv4Prefix _ipv4Destination;
        private final Ipv4Prefix _ipv4Source;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>> augmentation;

        private Ipv4MatchImpl(Ipv4MatchBuilder builder) {
            this._ipv4Destination = builder.getIpv4Destination();
            this._ipv4Source = builder.getIpv4Source();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Ipv4Prefix getIpv4Destination() {
            return _ipv4Destination;
        }
        
        @Override
        public Ipv4Prefix getIpv4Source() {
            return _ipv4Source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv4Match>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv4Destination == null) ? 0 : _ipv4Destination.hashCode());
            result = prime * result + ((_ipv4Source == null) ? 0 : _ipv4Source.hashCode());
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
            Ipv4MatchImpl other = (Ipv4MatchImpl) obj;
            if (_ipv4Destination == null) {
                if (other._ipv4Destination != null) {
                    return false;
                }
            } else if(!_ipv4Destination.equals(other._ipv4Destination)) {
                return false;
            }
            if (_ipv4Source == null) {
                if (other._ipv4Source != null) {
                    return false;
                }
            } else if(!_ipv4Source.equals(other._ipv4Source)) {
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
            StringBuilder builder = new StringBuilder("Ipv4Match [");
            boolean first = true;
        
            if (_ipv4Destination != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv4Destination=");
                builder.append(_ipv4Destination);
             }
            if (_ipv4Source != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv4Source=");
                builder.append(_ipv4Source);
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
