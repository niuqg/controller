package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.ConnectionCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.packet.received.Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;
import java.util.Arrays;



public class PacketReceivedBuilder {

    private ConnectionCookie _connectionCookie;
    private FlowCookie _flowCookie;
    private Match _match;
    private Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> _packetInReason;
    private TableId _tableId;
    private NodeConnectorRef _ingress;
    private byte[] _payload;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>> augmentation = new HashMap<>();

    public PacketReceivedBuilder() {
    } 
    
    public PacketReceivedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket arg) {
        this._ingress = arg.getIngress();
        this._payload = arg.getPayload();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket) {
            this._ingress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket)arg).getIngress();
            this._payload = ((org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket)arg).getPayload();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket] \n" +
              "but was: " + arg
            );
        }
    }

    public ConnectionCookie getConnectionCookie() {
        return _connectionCookie;
    }
    
    public FlowCookie getFlowCookie() {
        return _flowCookie;
    }
    
    public Match getMatch() {
        return _match;
    }
    
    public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> getPacketInReason() {
        return _packetInReason;
    }
    
    public TableId getTableId() {
        return _tableId;
    }
    
    public NodeConnectorRef getIngress() {
        return _ingress;
    }
    
    public byte[] getPayload() {
        return _payload;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PacketReceivedBuilder setConnectionCookie(ConnectionCookie value) {
    
        this._connectionCookie = value;
        return this;
    }
    
    public PacketReceivedBuilder setFlowCookie(FlowCookie value) {
    
        this._flowCookie = value;
        return this;
    }
    
    public PacketReceivedBuilder setMatch(Match value) {
    
        this._match = value;
        return this;
    }
    
    public PacketReceivedBuilder setPacketInReason(Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> value) {
    
        this._packetInReason = value;
        return this;
    }
    
    public PacketReceivedBuilder setTableId(TableId value) {
    
        this._tableId = value;
        return this;
    }
    
    public PacketReceivedBuilder setIngress(NodeConnectorRef value) {
    
        this._ingress = value;
        return this;
    }
    
    public PacketReceivedBuilder setPayload(byte[] value) {
    
        this._payload = value;
        return this;
    }
    
    public PacketReceivedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PacketReceived build() {
        return new PacketReceivedImpl(this);
    }

    private static final class PacketReceivedImpl implements PacketReceived {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived.class;
        }

        private final ConnectionCookie _connectionCookie;
        private final FlowCookie _flowCookie;
        private final Match _match;
        private final Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> _packetInReason;
        private final TableId _tableId;
        private final NodeConnectorRef _ingress;
        private final byte[] _payload;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>> augmentation;

        private PacketReceivedImpl(PacketReceivedBuilder builder) {
            this._connectionCookie = builder.getConnectionCookie();
            this._flowCookie = builder.getFlowCookie();
            this._match = builder.getMatch();
            this._packetInReason = builder.getPacketInReason();
            this._tableId = builder.getTableId();
            this._ingress = builder.getIngress();
            this._payload = builder.getPayload();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public ConnectionCookie getConnectionCookie() {
            return _connectionCookie;
        }
        
        @Override
        public FlowCookie getFlowCookie() {
            return _flowCookie;
        }
        
        @Override
        public Match getMatch() {
            return _match;
        }
        
        @Override
        public Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> getPacketInReason() {
            return _packetInReason;
        }
        
        @Override
        public TableId getTableId() {
            return _tableId;
        }
        
        @Override
        public NodeConnectorRef getIngress() {
            return _ingress;
        }
        
        @Override
        public byte[] getPayload() {
            return _payload;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_connectionCookie == null) ? 0 : _connectionCookie.hashCode());
            result = prime * result + ((_flowCookie == null) ? 0 : _flowCookie.hashCode());
            result = prime * result + ((_match == null) ? 0 : _match.hashCode());
            result = prime * result + ((_packetInReason == null) ? 0 : _packetInReason.hashCode());
            result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
            result = prime * result + ((_ingress == null) ? 0 : _ingress.hashCode());
            result = prime * result + ((_payload == null) ? 0 : Arrays.hashCode(_payload));
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
            PacketReceivedImpl other = (PacketReceivedImpl) obj;
            if (_connectionCookie == null) {
                if (other._connectionCookie != null) {
                    return false;
                }
            } else if(!_connectionCookie.equals(other._connectionCookie)) {
                return false;
            }
            if (_flowCookie == null) {
                if (other._flowCookie != null) {
                    return false;
                }
            } else if(!_flowCookie.equals(other._flowCookie)) {
                return false;
            }
            if (_match == null) {
                if (other._match != null) {
                    return false;
                }
            } else if(!_match.equals(other._match)) {
                return false;
            }
            if (_packetInReason == null) {
                if (other._packetInReason != null) {
                    return false;
                }
            } else if(!_packetInReason.equals(other._packetInReason)) {
                return false;
            }
            if (_tableId == null) {
                if (other._tableId != null) {
                    return false;
                }
            } else if(!_tableId.equals(other._tableId)) {
                return false;
            }
            if (_ingress == null) {
                if (other._ingress != null) {
                    return false;
                }
            } else if(!_ingress.equals(other._ingress)) {
                return false;
            }
            if (_payload == null) {
                if (other._payload != null) {
                    return false;
                }
            } else if(!Arrays.equals(_payload, other._payload)) {
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
            StringBuilder builder = new StringBuilder("PacketReceived [");
            boolean first = true;
        
            if (_connectionCookie != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connectionCookie=");
                builder.append(_connectionCookie);
             }
            if (_flowCookie != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCookie=");
                builder.append(_flowCookie);
             }
            if (_match != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_match=");
                builder.append(_match);
             }
            if (_packetInReason != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetInReason=");
                builder.append(_packetInReason);
             }
            if (_tableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableId=");
                builder.append(_tableId);
             }
            if (_ingress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ingress=");
                builder.append(_ingress);
             }
            if (_payload != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_payload=");
                builder.append(Arrays.toString(_payload));
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
