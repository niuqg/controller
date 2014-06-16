package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class UdpMatchBuilder {

    private PortNumber _udpDestinationPort;
    private PortNumber _udpSourcePort;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>> augmentation = new HashMap<>();

    public UdpMatchBuilder() {
    } 
    
    public UdpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.UdpMatchFields arg) {
        this._udpDestinationPort = arg.getUdpDestinationPort();
        this._udpSourcePort = arg.getUdpSourcePort();
    }
    

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.UdpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.UdpMatchFields) {
            this._udpDestinationPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.UdpMatchFields)arg).getUdpDestinationPort();
            this._udpSourcePort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.UdpMatchFields)arg).getUdpSourcePort();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.UdpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public PortNumber getUdpDestinationPort() {
        return _udpDestinationPort;
    }
    
    public PortNumber getUdpSourcePort() {
        return _udpSourcePort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public UdpMatchBuilder setUdpDestinationPort(PortNumber value) {
    
        this._udpDestinationPort = value;
        return this;
    }
    
    public UdpMatchBuilder setUdpSourcePort(PortNumber value) {
    
        this._udpSourcePort = value;
        return this;
    }
    
    public UdpMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public UdpMatch build() {
        return new UdpMatchImpl(this);
    }

    private static final class UdpMatchImpl implements UdpMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch.class;
        }

        private final PortNumber _udpDestinationPort;
        private final PortNumber _udpSourcePort;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>> augmentation;

        private UdpMatchImpl(UdpMatchBuilder builder) {
            this._udpDestinationPort = builder.getUdpDestinationPort();
            this._udpSourcePort = builder.getUdpSourcePort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public PortNumber getUdpDestinationPort() {
            return _udpDestinationPort;
        }
        
        @Override
        public PortNumber getUdpSourcePort() {
            return _udpSourcePort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._4.match.UdpMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_udpDestinationPort == null) ? 0 : _udpDestinationPort.hashCode());
            result = prime * result + ((_udpSourcePort == null) ? 0 : _udpSourcePort.hashCode());
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
            UdpMatchImpl other = (UdpMatchImpl) obj;
            if (_udpDestinationPort == null) {
                if (other._udpDestinationPort != null) {
                    return false;
                }
            } else if(!_udpDestinationPort.equals(other._udpDestinationPort)) {
                return false;
            }
            if (_udpSourcePort == null) {
                if (other._udpSourcePort != null) {
                    return false;
                }
            } else if(!_udpSourcePort.equals(other._udpSourcePort)) {
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
            StringBuilder builder = new StringBuilder("UdpMatch [");
            boolean first = true;
        
            if (_udpDestinationPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_udpDestinationPort=");
                builder.append(_udpDestinationPort);
             }
            if (_udpSourcePort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_udpSourcePort=");
                builder.append(_udpSourcePort);
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
