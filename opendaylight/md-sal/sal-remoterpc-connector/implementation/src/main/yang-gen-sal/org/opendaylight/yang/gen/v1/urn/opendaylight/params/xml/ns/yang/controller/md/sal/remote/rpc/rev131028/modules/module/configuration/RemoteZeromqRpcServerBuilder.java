package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.remote.zeromq.rpc.server.DomBroker;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class RemoteZeromqRpcServerBuilder {

    private DomBroker _domBroker;
    private Integer _port;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>> augmentation = new HashMap<>();

    public RemoteZeromqRpcServerBuilder() {
    } 
    


    public DomBroker getDomBroker() {
        return _domBroker;
    }
    
    public Integer getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RemoteZeromqRpcServerBuilder setDomBroker(DomBroker value) {
    
        this._domBroker = value;
        return this;
    }
    
    public RemoteZeromqRpcServerBuilder setPort(Integer value) {
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
    
        this._port = value;
        return this;
    }
    
    public RemoteZeromqRpcServerBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RemoteZeromqRpcServer build() {
        return new RemoteZeromqRpcServerImpl(this);
    }

    private static final class RemoteZeromqRpcServerImpl implements RemoteZeromqRpcServer {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer.class;
        }

        private final DomBroker _domBroker;
        private final Integer _port;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>> augmentation;

        private RemoteZeromqRpcServerImpl(RemoteZeromqRpcServerBuilder builder) {
            this._domBroker = builder.getDomBroker();
            this._port = builder.getPort();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public DomBroker getDomBroker() {
            return _domBroker;
        }
        
        @Override
        public Integer getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.remote.rpc.rev131028.modules.module.configuration.RemoteZeromqRpcServer>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_domBroker == null) ? 0 : _domBroker.hashCode());
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
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
            RemoteZeromqRpcServerImpl other = (RemoteZeromqRpcServerImpl) obj;
            if (_domBroker == null) {
                if (other._domBroker != null) {
                    return false;
                }
            } else if(!_domBroker.equals(other._domBroker)) {
                return false;
            }
            if (_port == null) {
                if (other._port != null) {
                    return false;
                }
            } else if(!_port.equals(other._port)) {
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
            StringBuilder builder = new StringBuilder("RemoteZeromqRpcServer [");
            boolean first = true;
        
            if (_domBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domBroker=");
                builder.append(_domBroker);
             }
            if (_port != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_port=");
                builder.append(_port);
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
