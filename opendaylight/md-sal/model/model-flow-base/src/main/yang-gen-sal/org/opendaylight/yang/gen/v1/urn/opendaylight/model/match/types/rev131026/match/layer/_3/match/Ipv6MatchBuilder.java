package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Prefix;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6ExtHeader;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ipv6.match.fields.Ipv6Label;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Ipv6Address;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class Ipv6MatchBuilder {

    private Ipv6Prefix _ipv6Destination;
    private Ipv6ExtHeader _ipv6ExtHeader;
    private Ipv6Label _ipv6Label;
    private MacAddress _ipv6NdSll;
    private Ipv6Address _ipv6NdTarget;
    private MacAddress _ipv6NdTll;
    private Ipv6Prefix _ipv6Source;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>> augmentation = new HashMap<>();

    public Ipv6MatchBuilder() {
    } 
    
    public Ipv6MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields arg) {
        this._ipv6Destination = arg.getIpv6Destination();
        this._ipv6ExtHeader = arg.getIpv6ExtHeader();
        this._ipv6Label = arg.getIpv6Label();
        this._ipv6NdSll = arg.getIpv6NdSll();
        this._ipv6NdTarget = arg.getIpv6NdTarget();
        this._ipv6NdTll = arg.getIpv6NdTll();
        this._ipv6Source = arg.getIpv6Source();
    }
    

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields) {
            this._ipv6Destination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6Destination();
            this._ipv6ExtHeader = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6ExtHeader();
            this._ipv6Label = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6Label();
            this._ipv6NdSll = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6NdSll();
            this._ipv6NdTarget = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6NdTarget();
            this._ipv6NdTll = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6NdTll();
            this._ipv6Source = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields)arg).getIpv6Source();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Ipv6MatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Ipv6Prefix getIpv6Destination() {
        return _ipv6Destination;
    }
    
    public Ipv6ExtHeader getIpv6ExtHeader() {
        return _ipv6ExtHeader;
    }
    
    public Ipv6Label getIpv6Label() {
        return _ipv6Label;
    }
    
    public MacAddress getIpv6NdSll() {
        return _ipv6NdSll;
    }
    
    public Ipv6Address getIpv6NdTarget() {
        return _ipv6NdTarget;
    }
    
    public MacAddress getIpv6NdTll() {
        return _ipv6NdTll;
    }
    
    public Ipv6Prefix getIpv6Source() {
        return _ipv6Source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public Ipv6MatchBuilder setIpv6Destination(Ipv6Prefix value) {
    
        this._ipv6Destination = value;
        return this;
    }
    
    public Ipv6MatchBuilder setIpv6ExtHeader(Ipv6ExtHeader value) {
    
        this._ipv6ExtHeader = value;
        return this;
    }
    
    public Ipv6MatchBuilder setIpv6Label(Ipv6Label value) {
    
        this._ipv6Label = value;
        return this;
    }
    
    public Ipv6MatchBuilder setIpv6NdSll(MacAddress value) {
    
        this._ipv6NdSll = value;
        return this;
    }
    
    public Ipv6MatchBuilder setIpv6NdTarget(Ipv6Address value) {
    
        this._ipv6NdTarget = value;
        return this;
    }
    
    public Ipv6MatchBuilder setIpv6NdTll(MacAddress value) {
    
        this._ipv6NdTll = value;
        return this;
    }
    
    public Ipv6MatchBuilder setIpv6Source(Ipv6Prefix value) {
    
        this._ipv6Source = value;
        return this;
    }
    
    public Ipv6MatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Ipv6Match build() {
        return new Ipv6MatchImpl(this);
    }

    private static final class Ipv6MatchImpl implements Ipv6Match {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match.class;
        }

        private final Ipv6Prefix _ipv6Destination;
        private final Ipv6ExtHeader _ipv6ExtHeader;
        private final Ipv6Label _ipv6Label;
        private final MacAddress _ipv6NdSll;
        private final Ipv6Address _ipv6NdTarget;
        private final MacAddress _ipv6NdTll;
        private final Ipv6Prefix _ipv6Source;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>> augmentation;

        private Ipv6MatchImpl(Ipv6MatchBuilder builder) {
            this._ipv6Destination = builder.getIpv6Destination();
            this._ipv6ExtHeader = builder.getIpv6ExtHeader();
            this._ipv6Label = builder.getIpv6Label();
            this._ipv6NdSll = builder.getIpv6NdSll();
            this._ipv6NdTarget = builder.getIpv6NdTarget();
            this._ipv6NdTll = builder.getIpv6NdTll();
            this._ipv6Source = builder.getIpv6Source();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Ipv6Prefix getIpv6Destination() {
            return _ipv6Destination;
        }
        
        @Override
        public Ipv6ExtHeader getIpv6ExtHeader() {
            return _ipv6ExtHeader;
        }
        
        @Override
        public Ipv6Label getIpv6Label() {
            return _ipv6Label;
        }
        
        @Override
        public MacAddress getIpv6NdSll() {
            return _ipv6NdSll;
        }
        
        @Override
        public Ipv6Address getIpv6NdTarget() {
            return _ipv6NdTarget;
        }
        
        @Override
        public MacAddress getIpv6NdTll() {
            return _ipv6NdTll;
        }
        
        @Override
        public Ipv6Prefix getIpv6Source() {
            return _ipv6Source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.layer._3.match.Ipv6Match>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ipv6Destination == null) ? 0 : _ipv6Destination.hashCode());
            result = prime * result + ((_ipv6ExtHeader == null) ? 0 : _ipv6ExtHeader.hashCode());
            result = prime * result + ((_ipv6Label == null) ? 0 : _ipv6Label.hashCode());
            result = prime * result + ((_ipv6NdSll == null) ? 0 : _ipv6NdSll.hashCode());
            result = prime * result + ((_ipv6NdTarget == null) ? 0 : _ipv6NdTarget.hashCode());
            result = prime * result + ((_ipv6NdTll == null) ? 0 : _ipv6NdTll.hashCode());
            result = prime * result + ((_ipv6Source == null) ? 0 : _ipv6Source.hashCode());
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
            Ipv6MatchImpl other = (Ipv6MatchImpl) obj;
            if (_ipv6Destination == null) {
                if (other._ipv6Destination != null) {
                    return false;
                }
            } else if(!_ipv6Destination.equals(other._ipv6Destination)) {
                return false;
            }
            if (_ipv6ExtHeader == null) {
                if (other._ipv6ExtHeader != null) {
                    return false;
                }
            } else if(!_ipv6ExtHeader.equals(other._ipv6ExtHeader)) {
                return false;
            }
            if (_ipv6Label == null) {
                if (other._ipv6Label != null) {
                    return false;
                }
            } else if(!_ipv6Label.equals(other._ipv6Label)) {
                return false;
            }
            if (_ipv6NdSll == null) {
                if (other._ipv6NdSll != null) {
                    return false;
                }
            } else if(!_ipv6NdSll.equals(other._ipv6NdSll)) {
                return false;
            }
            if (_ipv6NdTarget == null) {
                if (other._ipv6NdTarget != null) {
                    return false;
                }
            } else if(!_ipv6NdTarget.equals(other._ipv6NdTarget)) {
                return false;
            }
            if (_ipv6NdTll == null) {
                if (other._ipv6NdTll != null) {
                    return false;
                }
            } else if(!_ipv6NdTll.equals(other._ipv6NdTll)) {
                return false;
            }
            if (_ipv6Source == null) {
                if (other._ipv6Source != null) {
                    return false;
                }
            } else if(!_ipv6Source.equals(other._ipv6Source)) {
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
            StringBuilder builder = new StringBuilder("Ipv6Match [");
            boolean first = true;
        
            if (_ipv6Destination != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Destination=");
                builder.append(_ipv6Destination);
             }
            if (_ipv6ExtHeader != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6ExtHeader=");
                builder.append(_ipv6ExtHeader);
             }
            if (_ipv6Label != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Label=");
                builder.append(_ipv6Label);
             }
            if (_ipv6NdSll != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6NdSll=");
                builder.append(_ipv6NdSll);
             }
            if (_ipv6NdTarget != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6NdTarget=");
                builder.append(_ipv6NdTarget);
             }
            if (_ipv6NdTll != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6NdTll=");
                builder.append(_ipv6NdTll);
             }
            if (_ipv6Source != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipv6Source=");
                builder.append(_ipv6Source);
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
