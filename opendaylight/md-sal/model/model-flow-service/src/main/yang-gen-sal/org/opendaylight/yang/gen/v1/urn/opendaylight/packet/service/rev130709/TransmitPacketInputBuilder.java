package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.ConnectionCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;



public class TransmitPacketInputBuilder {

    private Long _bufferId;
    private ConnectionCookie _connectionCookie;
    private NodeConnectorRef _egress;
    private List<Action> _action;
    private NodeConnectorRef _ingress;
    private byte[] _payload;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>> augmentation = new HashMap<>();

    public TransmitPacketInputBuilder() {
    } 
    
    public TransmitPacketInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList arg) {
        this._action = arg.getAction();
    }
    
    public TransmitPacketInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket arg) {
        this._ingress = arg.getIngress();
        this._payload = arg.getPayload();
    }
    
    public TransmitPacketInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList) {
            this._action = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList)arg).getAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList] \n" +
              "but was: " + arg
            );
        }
    }

    public Long getBufferId() {
        return _bufferId;
    }
    
    public ConnectionCookie getConnectionCookie() {
        return _connectionCookie;
    }
    
    public NodeConnectorRef getEgress() {
        return _egress;
    }
    
    public List<Action> getAction() {
        return _action;
    }
    
    public NodeConnectorRef getIngress() {
        return _ingress;
    }
    
    public byte[] getPayload() {
        return _payload;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TransmitPacketInputBuilder setBufferId(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._bufferId = value;
        return this;
    }
    
    public TransmitPacketInputBuilder setConnectionCookie(ConnectionCookie value) {
    
        this._connectionCookie = value;
        return this;
    }
    
    public TransmitPacketInputBuilder setEgress(NodeConnectorRef value) {
    
        this._egress = value;
        return this;
    }
    
    public TransmitPacketInputBuilder setAction(List<Action> value) {
    
        this._action = value;
        return this;
    }
    
    public TransmitPacketInputBuilder setIngress(NodeConnectorRef value) {
    
        this._ingress = value;
        return this;
    }
    
    public TransmitPacketInputBuilder setPayload(byte[] value) {
    
        this._payload = value;
        return this;
    }
    
    public TransmitPacketInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public TransmitPacketInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TransmitPacketInput build() {
        return new TransmitPacketInputImpl(this);
    }

    private static final class TransmitPacketInputImpl implements TransmitPacketInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput.class;
        }

        private final Long _bufferId;
        private final ConnectionCookie _connectionCookie;
        private final NodeConnectorRef _egress;
        private final List<Action> _action;
        private final NodeConnectorRef _ingress;
        private final byte[] _payload;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>> augmentation;

        private TransmitPacketInputImpl(TransmitPacketInputBuilder builder) {
            this._bufferId = builder.getBufferId();
            this._connectionCookie = builder.getConnectionCookie();
            this._egress = builder.getEgress();
            this._action = builder.getAction();
            this._ingress = builder.getIngress();
            this._payload = builder.getPayload();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getBufferId() {
            return _bufferId;
        }
        
        @Override
        public ConnectionCookie getConnectionCookie() {
            return _connectionCookie;
        }
        
        @Override
        public NodeConnectorRef getEgress() {
            return _egress;
        }
        
        @Override
        public List<Action> getAction() {
            return _action;
        }
        
        @Override
        public NodeConnectorRef getIngress() {
            return _ingress;
        }
        
        @Override
        public byte[] getPayload() {
            return _payload;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bufferId == null) ? 0 : _bufferId.hashCode());
            result = prime * result + ((_connectionCookie == null) ? 0 : _connectionCookie.hashCode());
            result = prime * result + ((_egress == null) ? 0 : _egress.hashCode());
            result = prime * result + ((_action == null) ? 0 : _action.hashCode());
            result = prime * result + ((_ingress == null) ? 0 : _ingress.hashCode());
            result = prime * result + ((_payload == null) ? 0 : Arrays.hashCode(_payload));
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
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
            TransmitPacketInputImpl other = (TransmitPacketInputImpl) obj;
            if (_bufferId == null) {
                if (other._bufferId != null) {
                    return false;
                }
            } else if(!_bufferId.equals(other._bufferId)) {
                return false;
            }
            if (_connectionCookie == null) {
                if (other._connectionCookie != null) {
                    return false;
                }
            } else if(!_connectionCookie.equals(other._connectionCookie)) {
                return false;
            }
            if (_egress == null) {
                if (other._egress != null) {
                    return false;
                }
            } else if(!_egress.equals(other._egress)) {
                return false;
            }
            if (_action == null) {
                if (other._action != null) {
                    return false;
                }
            } else if(!_action.equals(other._action)) {
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
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
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
            StringBuilder builder = new StringBuilder("TransmitPacketInput [");
            boolean first = true;
        
            if (_bufferId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bufferId=");
                builder.append(_bufferId);
             }
            if (_connectionCookie != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connectionCookie=");
                builder.append(_connectionCookie);
             }
            if (_egress != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_egress=");
                builder.append(_egress);
             }
            if (_action != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_action=");
                builder.append(_action);
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
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
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
