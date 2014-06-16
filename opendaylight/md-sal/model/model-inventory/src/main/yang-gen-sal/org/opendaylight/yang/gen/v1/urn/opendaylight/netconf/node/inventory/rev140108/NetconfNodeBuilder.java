package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class NetconfNodeBuilder {

    private Boolean _connected;
    private List<String> _currentCapability;
    private List<String> _initialCapability;
    private PassThrough _passThrough;


    public NetconfNodeBuilder() {
    } 
    
    public NetconfNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields arg) {
        this._connected = arg.isConnected();
        this._currentCapability = arg.getCurrentCapability();
        this._initialCapability = arg.getInitialCapability();
        this._passThrough = arg.getPassThrough();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields) {
            this._connected = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).isConnected();
            this._currentCapability = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).getCurrentCapability();
            this._initialCapability = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).getInitialCapability();
            this._passThrough = ((org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields)arg).getPassThrough();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNodeFields] \n" +
              "but was: " + arg
            );
        }
    }

    public Boolean isConnected() {
        return _connected;
    }
    
    public List<String> getCurrentCapability() {
        return _currentCapability;
    }
    
    public List<String> getInitialCapability() {
        return _initialCapability;
    }
    
    public PassThrough getPassThrough() {
        return _passThrough;
    }

    public NetconfNodeBuilder setConnected(Boolean value) {
    
        this._connected = value;
        return this;
    }
    
    public NetconfNodeBuilder setCurrentCapability(List<String> value) {
    
        this._currentCapability = value;
        return this;
    }
    
    public NetconfNodeBuilder setInitialCapability(List<String> value) {
    
        this._initialCapability = value;
        return this;
    }
    
    public NetconfNodeBuilder setPassThrough(PassThrough value) {
    
        this._passThrough = value;
        return this;
    }

    public NetconfNode build() {
        return new NetconfNodeImpl(this);
    }

    private static final class NetconfNodeImpl implements NetconfNode {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.NetconfNode.class;
        }

        private final Boolean _connected;
        private final List<String> _currentCapability;
        private final List<String> _initialCapability;
        private final PassThrough _passThrough;


        private NetconfNodeImpl(NetconfNodeBuilder builder) {
            this._connected = builder.isConnected();
            this._currentCapability = builder.getCurrentCapability();
            this._initialCapability = builder.getInitialCapability();
            this._passThrough = builder.getPassThrough();
        }

        @Override
        public Boolean isConnected() {
            return _connected;
        }
        
        @Override
        public List<String> getCurrentCapability() {
            return _currentCapability;
        }
        
        @Override
        public List<String> getInitialCapability() {
            return _initialCapability;
        }
        
        @Override
        public PassThrough getPassThrough() {
            return _passThrough;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_connected == null) ? 0 : _connected.hashCode());
            result = prime * result + ((_currentCapability == null) ? 0 : _currentCapability.hashCode());
            result = prime * result + ((_initialCapability == null) ? 0 : _initialCapability.hashCode());
            result = prime * result + ((_passThrough == null) ? 0 : _passThrough.hashCode());
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
            NetconfNodeImpl other = (NetconfNodeImpl) obj;
            if (_connected == null) {
                if (other._connected != null) {
                    return false;
                }
            } else if(!_connected.equals(other._connected)) {
                return false;
            }
            if (_currentCapability == null) {
                if (other._currentCapability != null) {
                    return false;
                }
            } else if(!_currentCapability.equals(other._currentCapability)) {
                return false;
            }
            if (_initialCapability == null) {
                if (other._initialCapability != null) {
                    return false;
                }
            } else if(!_initialCapability.equals(other._initialCapability)) {
                return false;
            }
            if (_passThrough == null) {
                if (other._passThrough != null) {
                    return false;
                }
            } else if(!_passThrough.equals(other._passThrough)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NetconfNode [");
            boolean first = true;
        
            if (_connected != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connected=");
                builder.append(_connected);
             }
            if (_currentCapability != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_currentCapability=");
                builder.append(_currentCapability);
             }
            if (_initialCapability != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_initialCapability=");
                builder.append(_initialCapability);
             }
            if (_passThrough != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_passThrough=");
                builder.append(_passThrough);
             }
            return builder.append(']').toString();
        }
    }

}
