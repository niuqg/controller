package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Dscp;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpVersion;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class IpMatchBuilder {

    private Dscp _ipDscp;
    private Short _ipEcn;
    private IpVersion _ipProto;
    private Short _ipProtocol;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> augmentation = new HashMap<>();

    public IpMatchBuilder() {
    } 
    
    public IpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields arg) {
        this._ipDscp = arg.getIpDscp();
        this._ipEcn = arg.getIpEcn();
        this._ipProto = arg.getIpProto();
        this._ipProtocol = arg.getIpProtocol();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields) {
            this._ipDscp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpDscp();
            this._ipEcn = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpEcn();
            this._ipProto = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpProto();
            this._ipProtocol = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields)arg).getIpProtocol();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.IpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Dscp getIpDscp() {
        return _ipDscp;
    }
    
    public Short getIpEcn() {
        return _ipEcn;
    }
    
    public IpVersion getIpProto() {
        return _ipProto;
    }
    
    public Short getIpProtocol() {
        return _ipProtocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public IpMatchBuilder setIpDscp(Dscp value) {
    
        this._ipDscp = value;
        return this;
    }
    
    public IpMatchBuilder setIpEcn(Short value) {
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
    
        this._ipEcn = value;
        return this;
    }
    
    public IpMatchBuilder setIpProto(IpVersion value) {
    
        this._ipProto = value;
        return this;
    }
    
    public IpMatchBuilder setIpProtocol(Short value) {
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
    
        this._ipProtocol = value;
        return this;
    }
    
    public IpMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public IpMatch build() {
        return new IpMatchImpl(this);
    }

    private static final class IpMatchImpl implements IpMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch.class;
        }

        private final Dscp _ipDscp;
        private final Short _ipEcn;
        private final IpVersion _ipProto;
        private final Short _ipProtocol;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> augmentation;

        private IpMatchImpl(IpMatchBuilder builder) {
            this._ipDscp = builder.getIpDscp();
            this._ipEcn = builder.getIpEcn();
            this._ipProto = builder.getIpProto();
            this._ipProtocol = builder.getIpProtocol();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Dscp getIpDscp() {
            return _ipDscp;
        }
        
        @Override
        public Short getIpEcn() {
            return _ipEcn;
        }
        
        @Override
        public IpVersion getIpProto() {
            return _ipProto;
        }
        
        @Override
        public Short getIpProtocol() {
            return _ipProtocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipDscp == null) ? 0 : _ipDscp.hashCode());
            result = prime * result + ((_ipEcn == null) ? 0 : _ipEcn.hashCode());
            result = prime * result + ((_ipProto == null) ? 0 : _ipProto.hashCode());
            result = prime * result + ((_ipProtocol == null) ? 0 : _ipProtocol.hashCode());
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
            IpMatchImpl other = (IpMatchImpl) obj;
            if (_ipDscp == null) {
                if (other._ipDscp != null) {
                    return false;
                }
            } else if(!_ipDscp.equals(other._ipDscp)) {
                return false;
            }
            if (_ipEcn == null) {
                if (other._ipEcn != null) {
                    return false;
                }
            } else if(!_ipEcn.equals(other._ipEcn)) {
                return false;
            }
            if (_ipProto == null) {
                if (other._ipProto != null) {
                    return false;
                }
            } else if(!_ipProto.equals(other._ipProto)) {
                return false;
            }
            if (_ipProtocol == null) {
                if (other._ipProtocol != null) {
                    return false;
                }
            } else if(!_ipProtocol.equals(other._ipProtocol)) {
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
            StringBuilder builder = new StringBuilder("IpMatch [");
            boolean first = true;
        
            if (_ipDscp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipDscp=");
                builder.append(_ipDscp);
             }
            if (_ipEcn != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipEcn=");
                builder.append(_ipEcn);
             }
            if (_ipProto != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipProto=");
                builder.append(_ipProto);
             }
            if (_ipProtocol != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipProtocol=");
                builder.append(_ipProtocol);
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
