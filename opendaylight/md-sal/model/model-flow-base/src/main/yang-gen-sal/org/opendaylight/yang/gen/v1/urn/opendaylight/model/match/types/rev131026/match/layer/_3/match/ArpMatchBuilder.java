package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpSourceHardwareAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv4Prefix;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.arp.match.fields.ArpTargetHardwareAddress;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class ArpMatchBuilder {

    private Integer _arpOp;
    private ArpSourceHardwareAddress _arpSourceHardwareAddress;
    private Ipv4Prefix _arpSourceTransportAddress;
    private ArpTargetHardwareAddress _arpTargetHardwareAddress;
    private Ipv4Prefix _arpTargetTransportAddress;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> augmentation = new HashMap<>();

    public ArpMatchBuilder() {
    } 
    
    public ArpMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields arg) {
        this._arpOp = arg.getArpOp();
        this._arpSourceHardwareAddress = arg.getArpSourceHardwareAddress();
        this._arpSourceTransportAddress = arg.getArpSourceTransportAddress();
        this._arpTargetHardwareAddress = arg.getArpTargetHardwareAddress();
        this._arpTargetTransportAddress = arg.getArpTargetTransportAddress();
    }
    

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields) {
            this._arpOp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpOp();
            this._arpSourceHardwareAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpSourceHardwareAddress();
            this._arpSourceTransportAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpSourceTransportAddress();
            this._arpTargetHardwareAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpTargetHardwareAddress();
            this._arpTargetTransportAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields)arg).getArpTargetTransportAddress();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ArpMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Integer getArpOp() {
        return _arpOp;
    }
    
    public ArpSourceHardwareAddress getArpSourceHardwareAddress() {
        return _arpSourceHardwareAddress;
    }
    
    public Ipv4Prefix getArpSourceTransportAddress() {
        return _arpSourceTransportAddress;
    }
    
    public ArpTargetHardwareAddress getArpTargetHardwareAddress() {
        return _arpTargetHardwareAddress;
    }
    
    public Ipv4Prefix getArpTargetTransportAddress() {
        return _arpTargetTransportAddress;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ArpMatchBuilder setArpOp(Integer value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("0"), new Integer("65535")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._arpOp = value;
        return this;
    }
    
    public ArpMatchBuilder setArpSourceHardwareAddress(ArpSourceHardwareAddress value) {
    
        this._arpSourceHardwareAddress = value;
        return this;
    }
    
    public ArpMatchBuilder setArpSourceTransportAddress(Ipv4Prefix value) {
    
        this._arpSourceTransportAddress = value;
        return this;
    }
    
    public ArpMatchBuilder setArpTargetHardwareAddress(ArpTargetHardwareAddress value) {
    
        this._arpTargetHardwareAddress = value;
        return this;
    }
    
    public ArpMatchBuilder setArpTargetTransportAddress(Ipv4Prefix value) {
    
        this._arpTargetTransportAddress = value;
        return this;
    }
    
    public ArpMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ArpMatch build() {
        return new ArpMatchImpl(this);
    }

    private static final class ArpMatchImpl implements ArpMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch.class;
        }

        private final Integer _arpOp;
        private final ArpSourceHardwareAddress _arpSourceHardwareAddress;
        private final Ipv4Prefix _arpSourceTransportAddress;
        private final ArpTargetHardwareAddress _arpTargetHardwareAddress;
        private final Ipv4Prefix _arpTargetTransportAddress;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> augmentation;

        private ArpMatchImpl(ArpMatchBuilder builder) {
            this._arpOp = builder.getArpOp();
            this._arpSourceHardwareAddress = builder.getArpSourceHardwareAddress();
            this._arpSourceTransportAddress = builder.getArpSourceTransportAddress();
            this._arpTargetHardwareAddress = builder.getArpTargetHardwareAddress();
            this._arpTargetTransportAddress = builder.getArpTargetTransportAddress();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Integer getArpOp() {
            return _arpOp;
        }
        
        @Override
        public ArpSourceHardwareAddress getArpSourceHardwareAddress() {
            return _arpSourceHardwareAddress;
        }
        
        @Override
        public Ipv4Prefix getArpSourceTransportAddress() {
            return _arpSourceTransportAddress;
        }
        
        @Override
        public ArpTargetHardwareAddress getArpTargetHardwareAddress() {
            return _arpTargetHardwareAddress;
        }
        
        @Override
        public Ipv4Prefix getArpTargetTransportAddress() {
            return _arpTargetTransportAddress;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.ArpMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_arpOp == null) ? 0 : _arpOp.hashCode());
            result = prime * result + ((_arpSourceHardwareAddress == null) ? 0 : _arpSourceHardwareAddress.hashCode());
            result = prime * result + ((_arpSourceTransportAddress == null) ? 0 : _arpSourceTransportAddress.hashCode());
            result = prime * result + ((_arpTargetHardwareAddress == null) ? 0 : _arpTargetHardwareAddress.hashCode());
            result = prime * result + ((_arpTargetTransportAddress == null) ? 0 : _arpTargetTransportAddress.hashCode());
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
            ArpMatchImpl other = (ArpMatchImpl) obj;
            if (_arpOp == null) {
                if (other._arpOp != null) {
                    return false;
                }
            } else if(!_arpOp.equals(other._arpOp)) {
                return false;
            }
            if (_arpSourceHardwareAddress == null) {
                if (other._arpSourceHardwareAddress != null) {
                    return false;
                }
            } else if(!_arpSourceHardwareAddress.equals(other._arpSourceHardwareAddress)) {
                return false;
            }
            if (_arpSourceTransportAddress == null) {
                if (other._arpSourceTransportAddress != null) {
                    return false;
                }
            } else if(!_arpSourceTransportAddress.equals(other._arpSourceTransportAddress)) {
                return false;
            }
            if (_arpTargetHardwareAddress == null) {
                if (other._arpTargetHardwareAddress != null) {
                    return false;
                }
            } else if(!_arpTargetHardwareAddress.equals(other._arpTargetHardwareAddress)) {
                return false;
            }
            if (_arpTargetTransportAddress == null) {
                if (other._arpTargetTransportAddress != null) {
                    return false;
                }
            } else if(!_arpTargetTransportAddress.equals(other._arpTargetTransportAddress)) {
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
            StringBuilder builder = new StringBuilder("ArpMatch [");
            boolean first = true;
        
            if (_arpOp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpOp=");
                builder.append(_arpOp);
             }
            if (_arpSourceHardwareAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpSourceHardwareAddress=");
                builder.append(_arpSourceHardwareAddress);
             }
            if (_arpSourceTransportAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpSourceTransportAddress=");
                builder.append(_arpSourceTransportAddress);
             }
            if (_arpTargetHardwareAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpTargetHardwareAddress=");
                builder.append(_arpTargetHardwareAddress);
             }
            if (_arpTargetTransportAddress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_arpTargetTransportAddress=");
                builder.append(_arpTargetTransportAddress);
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
