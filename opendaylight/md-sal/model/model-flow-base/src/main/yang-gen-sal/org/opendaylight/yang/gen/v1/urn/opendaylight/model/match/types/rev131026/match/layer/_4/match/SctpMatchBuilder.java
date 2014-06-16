package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class SctpMatchBuilder {

    private PortNumber _sctpDestinationPort;
    private PortNumber _sctpSourcePort;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> augmentation = new HashMap<>();

    public SctpMatchBuilder() {
    } 
    
    public SctpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields arg) {
        this._sctpDestinationPort = arg.getSctpDestinationPort();
        this._sctpSourcePort = arg.getSctpSourcePort();
    }
    

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields) {
            this._sctpDestinationPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields)arg).getSctpDestinationPort();
            this._sctpSourcePort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields)arg).getSctpSourcePort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.SctpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public PortNumber getSctpDestinationPort() {
        return _sctpDestinationPort;
    }
    
    public PortNumber getSctpSourcePort() {
        return _sctpSourcePort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SctpMatchBuilder setSctpDestinationPort(PortNumber value) {
    
        this._sctpDestinationPort = value;
        return this;
    }
    
    public SctpMatchBuilder setSctpSourcePort(PortNumber value) {
    
        this._sctpSourcePort = value;
        return this;
    }
    
    public SctpMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SctpMatch build() {
        return new SctpMatchImpl(this);
    }

    private static final class SctpMatchImpl implements SctpMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch.class;
        }

        private final PortNumber _sctpDestinationPort;
        private final PortNumber _sctpSourcePort;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> augmentation;

        private SctpMatchImpl(SctpMatchBuilder builder) {
            this._sctpDestinationPort = builder.getSctpDestinationPort();
            this._sctpSourcePort = builder.getSctpSourcePort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public PortNumber getSctpDestinationPort() {
            return _sctpDestinationPort;
        }
        
        @Override
        public PortNumber getSctpSourcePort() {
            return _sctpSourcePort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.SctpMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_sctpDestinationPort == null) ? 0 : _sctpDestinationPort.hashCode());
            result = prime * result + ((_sctpSourcePort == null) ? 0 : _sctpSourcePort.hashCode());
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
            SctpMatchImpl other = (SctpMatchImpl) obj;
            if (_sctpDestinationPort == null) {
                if (other._sctpDestinationPort != null) {
                    return false;
                }
            } else if(!_sctpDestinationPort.equals(other._sctpDestinationPort)) {
                return false;
            }
            if (_sctpSourcePort == null) {
                if (other._sctpSourcePort != null) {
                    return false;
                }
            } else if(!_sctpSourcePort.equals(other._sctpSourcePort)) {
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
            StringBuilder builder = new StringBuilder("SctpMatch [");
            boolean first = true;
        
            if (_sctpDestinationPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sctpDestinationPort=");
                builder.append(_sctpDestinationPort);
             }
            if (_sctpSourcePort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sctpSourcePort=");
                builder.append(_sctpSourcePort);
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
