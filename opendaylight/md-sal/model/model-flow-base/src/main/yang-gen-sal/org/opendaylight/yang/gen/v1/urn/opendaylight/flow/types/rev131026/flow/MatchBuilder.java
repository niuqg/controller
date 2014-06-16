package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv4Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Icmpv6Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.IpMatch;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer3Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Layer4Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Metadata;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.ProtocolMatchFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.Tunnel;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class MatchBuilder {

    private EthernetMatch _ethernetMatch;
    private Icmpv4Match _icmpv4Match;
    private Icmpv6Match _icmpv6Match;
    private NodeConnectorId _inPhyPort;
    private NodeConnectorId _inPort;
    private IpMatch _ipMatch;
    private Layer3Match _layer3Match;
    private Layer4Match _layer4Match;
    private Metadata _metadata;
    private ProtocolMatchFields _protocolMatchFields;
    private Tunnel _tunnel;
    private VlanMatch _vlanMatch;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>> augmentation = new HashMap<>();

    public MatchBuilder() {
    } 
    
    public MatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match arg) {
        this._ethernetMatch = arg.getEthernetMatch();
        this._icmpv4Match = arg.getIcmpv4Match();
        this._icmpv6Match = arg.getIcmpv6Match();
        this._inPhyPort = arg.getInPhyPort();
        this._inPort = arg.getInPort();
        this._ipMatch = arg.getIpMatch();
        this._layer3Match = arg.getLayer3Match();
        this._layer4Match = arg.getLayer4Match();
        this._metadata = arg.getMetadata();
        this._protocolMatchFields = arg.getProtocolMatchFields();
        this._tunnel = arg.getTunnel();
        this._vlanMatch = arg.getVlanMatch();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match) {
            this._ethernetMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getEthernetMatch();
            this._icmpv4Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getIcmpv4Match();
            this._icmpv6Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getIcmpv6Match();
            this._inPhyPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getInPhyPort();
            this._inPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getInPort();
            this._ipMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getIpMatch();
            this._layer3Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getLayer3Match();
            this._layer4Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getLayer4Match();
            this._metadata = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getMetadata();
            this._protocolMatchFields = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getProtocolMatchFields();
            this._tunnel = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getTunnel();
            this._vlanMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match)arg).getVlanMatch();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.Match] \n" +
              "but was: " + arg
            );
        }
    }

    public EthernetMatch getEthernetMatch() {
        return _ethernetMatch;
    }
    
    public Icmpv4Match getIcmpv4Match() {
        return _icmpv4Match;
    }
    
    public Icmpv6Match getIcmpv6Match() {
        return _icmpv6Match;
    }
    
    public NodeConnectorId getInPhyPort() {
        return _inPhyPort;
    }
    
    public NodeConnectorId getInPort() {
        return _inPort;
    }
    
    public IpMatch getIpMatch() {
        return _ipMatch;
    }
    
    public Layer3Match getLayer3Match() {
        return _layer3Match;
    }
    
    public Layer4Match getLayer4Match() {
        return _layer4Match;
    }
    
    public Metadata getMetadata() {
        return _metadata;
    }
    
    public ProtocolMatchFields getProtocolMatchFields() {
        return _protocolMatchFields;
    }
    
    public Tunnel getTunnel() {
        return _tunnel;
    }
    
    public VlanMatch getVlanMatch() {
        return _vlanMatch;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MatchBuilder setEthernetMatch(EthernetMatch value) {
    
        this._ethernetMatch = value;
        return this;
    }
    
    public MatchBuilder setIcmpv4Match(Icmpv4Match value) {
    
        this._icmpv4Match = value;
        return this;
    }
    
    public MatchBuilder setIcmpv6Match(Icmpv6Match value) {
    
        this._icmpv6Match = value;
        return this;
    }
    
    public MatchBuilder setInPhyPort(NodeConnectorId value) {
    
        this._inPhyPort = value;
        return this;
    }
    
    public MatchBuilder setInPort(NodeConnectorId value) {
    
        this._inPort = value;
        return this;
    }
    
    public MatchBuilder setIpMatch(IpMatch value) {
    
        this._ipMatch = value;
        return this;
    }
    
    public MatchBuilder setLayer3Match(Layer3Match value) {
    
        this._layer3Match = value;
        return this;
    }
    
    public MatchBuilder setLayer4Match(Layer4Match value) {
    
        this._layer4Match = value;
        return this;
    }
    
    public MatchBuilder setMetadata(Metadata value) {
    
        this._metadata = value;
        return this;
    }
    
    public MatchBuilder setProtocolMatchFields(ProtocolMatchFields value) {
    
        this._protocolMatchFields = value;
        return this;
    }
    
    public MatchBuilder setTunnel(Tunnel value) {
    
        this._tunnel = value;
        return this;
    }
    
    public MatchBuilder setVlanMatch(VlanMatch value) {
    
        this._vlanMatch = value;
        return this;
    }
    
    public MatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Match build() {
        return new MatchImpl(this);
    }

    private static final class MatchImpl implements Match {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match.class;
        }

        private final EthernetMatch _ethernetMatch;
        private final Icmpv4Match _icmpv4Match;
        private final Icmpv6Match _icmpv6Match;
        private final NodeConnectorId _inPhyPort;
        private final NodeConnectorId _inPort;
        private final IpMatch _ipMatch;
        private final Layer3Match _layer3Match;
        private final Layer4Match _layer4Match;
        private final Metadata _metadata;
        private final ProtocolMatchFields _protocolMatchFields;
        private final Tunnel _tunnel;
        private final VlanMatch _vlanMatch;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>> augmentation;

        private MatchImpl(MatchBuilder builder) {
            this._ethernetMatch = builder.getEthernetMatch();
            this._icmpv4Match = builder.getIcmpv4Match();
            this._icmpv6Match = builder.getIcmpv6Match();
            this._inPhyPort = builder.getInPhyPort();
            this._inPort = builder.getInPort();
            this._ipMatch = builder.getIpMatch();
            this._layer3Match = builder.getLayer3Match();
            this._layer4Match = builder.getLayer4Match();
            this._metadata = builder.getMetadata();
            this._protocolMatchFields = builder.getProtocolMatchFields();
            this._tunnel = builder.getTunnel();
            this._vlanMatch = builder.getVlanMatch();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public EthernetMatch getEthernetMatch() {
            return _ethernetMatch;
        }
        
        @Override
        public Icmpv4Match getIcmpv4Match() {
            return _icmpv4Match;
        }
        
        @Override
        public Icmpv6Match getIcmpv6Match() {
            return _icmpv6Match;
        }
        
        @Override
        public NodeConnectorId getInPhyPort() {
            return _inPhyPort;
        }
        
        @Override
        public NodeConnectorId getInPort() {
            return _inPort;
        }
        
        @Override
        public IpMatch getIpMatch() {
            return _ipMatch;
        }
        
        @Override
        public Layer3Match getLayer3Match() {
            return _layer3Match;
        }
        
        @Override
        public Layer4Match getLayer4Match() {
            return _layer4Match;
        }
        
        @Override
        public Metadata getMetadata() {
            return _metadata;
        }
        
        @Override
        public ProtocolMatchFields getProtocolMatchFields() {
            return _protocolMatchFields;
        }
        
        @Override
        public Tunnel getTunnel() {
            return _tunnel;
        }
        
        @Override
        public VlanMatch getVlanMatch() {
            return _vlanMatch;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ethernetMatch == null) ? 0 : _ethernetMatch.hashCode());
            result = prime * result + ((_icmpv4Match == null) ? 0 : _icmpv4Match.hashCode());
            result = prime * result + ((_icmpv6Match == null) ? 0 : _icmpv6Match.hashCode());
            result = prime * result + ((_inPhyPort == null) ? 0 : _inPhyPort.hashCode());
            result = prime * result + ((_inPort == null) ? 0 : _inPort.hashCode());
            result = prime * result + ((_ipMatch == null) ? 0 : _ipMatch.hashCode());
            result = prime * result + ((_layer3Match == null) ? 0 : _layer3Match.hashCode());
            result = prime * result + ((_layer4Match == null) ? 0 : _layer4Match.hashCode());
            result = prime * result + ((_metadata == null) ? 0 : _metadata.hashCode());
            result = prime * result + ((_protocolMatchFields == null) ? 0 : _protocolMatchFields.hashCode());
            result = prime * result + ((_tunnel == null) ? 0 : _tunnel.hashCode());
            result = prime * result + ((_vlanMatch == null) ? 0 : _vlanMatch.hashCode());
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
            MatchImpl other = (MatchImpl) obj;
            if (_ethernetMatch == null) {
                if (other._ethernetMatch != null) {
                    return false;
                }
            } else if(!_ethernetMatch.equals(other._ethernetMatch)) {
                return false;
            }
            if (_icmpv4Match == null) {
                if (other._icmpv4Match != null) {
                    return false;
                }
            } else if(!_icmpv4Match.equals(other._icmpv4Match)) {
                return false;
            }
            if (_icmpv6Match == null) {
                if (other._icmpv6Match != null) {
                    return false;
                }
            } else if(!_icmpv6Match.equals(other._icmpv6Match)) {
                return false;
            }
            if (_inPhyPort == null) {
                if (other._inPhyPort != null) {
                    return false;
                }
            } else if(!_inPhyPort.equals(other._inPhyPort)) {
                return false;
            }
            if (_inPort == null) {
                if (other._inPort != null) {
                    return false;
                }
            } else if(!_inPort.equals(other._inPort)) {
                return false;
            }
            if (_ipMatch == null) {
                if (other._ipMatch != null) {
                    return false;
                }
            } else if(!_ipMatch.equals(other._ipMatch)) {
                return false;
            }
            if (_layer3Match == null) {
                if (other._layer3Match != null) {
                    return false;
                }
            } else if(!_layer3Match.equals(other._layer3Match)) {
                return false;
            }
            if (_layer4Match == null) {
                if (other._layer4Match != null) {
                    return false;
                }
            } else if(!_layer4Match.equals(other._layer4Match)) {
                return false;
            }
            if (_metadata == null) {
                if (other._metadata != null) {
                    return false;
                }
            } else if(!_metadata.equals(other._metadata)) {
                return false;
            }
            if (_protocolMatchFields == null) {
                if (other._protocolMatchFields != null) {
                    return false;
                }
            } else if(!_protocolMatchFields.equals(other._protocolMatchFields)) {
                return false;
            }
            if (_tunnel == null) {
                if (other._tunnel != null) {
                    return false;
                }
            } else if(!_tunnel.equals(other._tunnel)) {
                return false;
            }
            if (_vlanMatch == null) {
                if (other._vlanMatch != null) {
                    return false;
                }
            } else if(!_vlanMatch.equals(other._vlanMatch)) {
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
            StringBuilder builder = new StringBuilder("Match [");
            boolean first = true;
        
            if (_ethernetMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetMatch=");
                builder.append(_ethernetMatch);
             }
            if (_icmpv4Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv4Match=");
                builder.append(_icmpv4Match);
             }
            if (_icmpv6Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_icmpv6Match=");
                builder.append(_icmpv6Match);
             }
            if (_inPhyPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inPhyPort=");
                builder.append(_inPhyPort);
             }
            if (_inPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inPort=");
                builder.append(_inPort);
             }
            if (_ipMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipMatch=");
                builder.append(_ipMatch);
             }
            if (_layer3Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_layer3Match=");
                builder.append(_layer3Match);
             }
            if (_layer4Match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_layer4Match=");
                builder.append(_layer4Match);
             }
            if (_metadata != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadata=");
                builder.append(_metadata);
             }
            if (_protocolMatchFields != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_protocolMatchFields=");
                builder.append(_protocolMatchFields);
             }
            if (_tunnel != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tunnel=");
                builder.append(_tunnel);
             }
            if (_vlanMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlanMatch=");
                builder.append(_vlanMatch);
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
