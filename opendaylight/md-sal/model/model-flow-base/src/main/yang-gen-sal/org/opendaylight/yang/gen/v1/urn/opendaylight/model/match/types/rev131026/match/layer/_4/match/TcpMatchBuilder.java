package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class TcpMatchBuilder {

    private PortNumber _tcpDestinationPort;
    private PortNumber _tcpSourcePort;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>> augmentation = new HashMap<>();

    public TcpMatchBuilder() {
    } 
    
    public TcpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields arg) {
        this._tcpDestinationPort = arg.getTcpDestinationPort();
        this._tcpSourcePort = arg.getTcpSourcePort();
    }
    

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields) {
            this._tcpDestinationPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields)arg).getTcpDestinationPort();
            this._tcpSourcePort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields)arg).getTcpSourcePort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.TcpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public PortNumber getTcpDestinationPort() {
        return _tcpDestinationPort;
    }
    
    public PortNumber getTcpSourcePort() {
        return _tcpSourcePort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TcpMatchBuilder setTcpDestinationPort(PortNumber value) {
    
        this._tcpDestinationPort = value;
        return this;
    }
    
    public TcpMatchBuilder setTcpSourcePort(PortNumber value) {
    
        this._tcpSourcePort = value;
        return this;
    }
    
    public TcpMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TcpMatch build() {
        return new TcpMatchImpl(this);
    }

    private static final class TcpMatchImpl implements TcpMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch.class;
        }

        private final PortNumber _tcpDestinationPort;
        private final PortNumber _tcpSourcePort;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>> augmentation;

        private TcpMatchImpl(TcpMatchBuilder builder) {
            this._tcpDestinationPort = builder.getTcpDestinationPort();
            this._tcpSourcePort = builder.getTcpSourcePort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public PortNumber getTcpDestinationPort() {
            return _tcpDestinationPort;
        }
        
        @Override
        public PortNumber getTcpSourcePort() {
            return _tcpSourcePort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.TcpMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_tcpDestinationPort == null) ? 0 : _tcpDestinationPort.hashCode());
            result = prime * result + ((_tcpSourcePort == null) ? 0 : _tcpSourcePort.hashCode());
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
            TcpMatchImpl other = (TcpMatchImpl) obj;
            if (_tcpDestinationPort == null) {
                if (other._tcpDestinationPort != null) {
                    return false;
                }
            } else if(!_tcpDestinationPort.equals(other._tcpDestinationPort)) {
                return false;
            }
            if (_tcpSourcePort == null) {
                if (other._tcpSourcePort != null) {
                    return false;
                }
            } else if(!_tcpSourcePort.equals(other._tcpSourcePort)) {
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
            StringBuilder builder = new StringBuilder("TcpMatch [");
            boolean first = true;
        
            if (_tcpDestinationPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tcpDestinationPort=");
                builder.append(_tcpDestinationPort);
             }
            if (_tcpSourcePort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tcpSourcePort=");
                builder.append(_tcpSourcePort);
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
