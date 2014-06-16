package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.BossThreadGroup;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.ClientDispatcher;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.DomRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.EventExecutor;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.sal.netconf.connector.WorkerThreadGroup;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class SalNetconfConnectorBuilder {

    private String _address;
    private Integer _betweenAttemptsTimeoutMillis;
    private BossThreadGroup _bossThreadGroup;
    private ClientDispatcher _clientDispatcher;
    private Long _connectionTimeoutMillis;
    private DomRegistry _domRegistry;
    private EventExecutor _eventExecutor;
    private Long _maxConnectionAttempts;
    private String _password;
    private Long _port;
    private Boolean _tcpOnly;
    private String _username;
    private WorkerThreadGroup _workerThreadGroup;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>> augmentation = new HashMap<>();

    public SalNetconfConnectorBuilder() {
    } 
    


    public String getAddress() {
        return _address;
    }
    
    public Integer getBetweenAttemptsTimeoutMillis() {
        return _betweenAttemptsTimeoutMillis;
    }
    
    public BossThreadGroup getBossThreadGroup() {
        return _bossThreadGroup;
    }
    
    public ClientDispatcher getClientDispatcher() {
        return _clientDispatcher;
    }
    
    public Long getConnectionTimeoutMillis() {
        return _connectionTimeoutMillis;
    }
    
    public DomRegistry getDomRegistry() {
        return _domRegistry;
    }
    
    public EventExecutor getEventExecutor() {
        return _eventExecutor;
    }
    
    public Long getMaxConnectionAttempts() {
        return _maxConnectionAttempts;
    }
    
    public String getPassword() {
        return _password;
    }
    
    public Long getPort() {
        return _port;
    }
    
    public Boolean isTcpOnly() {
        return _tcpOnly;
    }
    
    public String getUsername() {
        return _username;
    }
    
    public WorkerThreadGroup getWorkerThreadGroup() {
        return _workerThreadGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SalNetconfConnectorBuilder setAddress(String value) {
    
        this._address = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setBetweenAttemptsTimeoutMillis(Integer value) {
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
    
        this._betweenAttemptsTimeoutMillis = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setBossThreadGroup(BossThreadGroup value) {
    
        this._bossThreadGroup = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setClientDispatcher(ClientDispatcher value) {
    
        this._clientDispatcher = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setConnectionTimeoutMillis(Long value) {
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
    
        this._connectionTimeoutMillis = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setDomRegistry(DomRegistry value) {
    
        this._domRegistry = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setEventExecutor(EventExecutor value) {
    
        this._eventExecutor = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setMaxConnectionAttempts(Long value) {
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
    
        this._maxConnectionAttempts = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setPassword(String value) {
    
        this._password = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setPort(Long value) {
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
    
        this._port = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setTcpOnly(Boolean value) {
    
        this._tcpOnly = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setUsername(String value) {
    
        this._username = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder setWorkerThreadGroup(WorkerThreadGroup value) {
    
        this._workerThreadGroup = value;
        return this;
    }
    
    public SalNetconfConnectorBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SalNetconfConnector build() {
        return new SalNetconfConnectorImpl(this);
    }

    private static final class SalNetconfConnectorImpl implements SalNetconfConnector {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector.class;
        }

        private final String _address;
        private final Integer _betweenAttemptsTimeoutMillis;
        private final BossThreadGroup _bossThreadGroup;
        private final ClientDispatcher _clientDispatcher;
        private final Long _connectionTimeoutMillis;
        private final DomRegistry _domRegistry;
        private final EventExecutor _eventExecutor;
        private final Long _maxConnectionAttempts;
        private final String _password;
        private final Long _port;
        private final Boolean _tcpOnly;
        private final String _username;
        private final WorkerThreadGroup _workerThreadGroup;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>> augmentation;

        private SalNetconfConnectorImpl(SalNetconfConnectorBuilder builder) {
            this._address = builder.getAddress();
            this._betweenAttemptsTimeoutMillis = builder.getBetweenAttemptsTimeoutMillis();
            this._bossThreadGroup = builder.getBossThreadGroup();
            this._clientDispatcher = builder.getClientDispatcher();
            this._connectionTimeoutMillis = builder.getConnectionTimeoutMillis();
            this._domRegistry = builder.getDomRegistry();
            this._eventExecutor = builder.getEventExecutor();
            this._maxConnectionAttempts = builder.getMaxConnectionAttempts();
            this._password = builder.getPassword();
            this._port = builder.getPort();
            this._tcpOnly = builder.isTcpOnly();
            this._username = builder.getUsername();
            this._workerThreadGroup = builder.getWorkerThreadGroup();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public String getAddress() {
            return _address;
        }
        
        @Override
        public Integer getBetweenAttemptsTimeoutMillis() {
            return _betweenAttemptsTimeoutMillis;
        }
        
        @Override
        public BossThreadGroup getBossThreadGroup() {
            return _bossThreadGroup;
        }
        
        @Override
        public ClientDispatcher getClientDispatcher() {
            return _clientDispatcher;
        }
        
        @Override
        public Long getConnectionTimeoutMillis() {
            return _connectionTimeoutMillis;
        }
        
        @Override
        public DomRegistry getDomRegistry() {
            return _domRegistry;
        }
        
        @Override
        public EventExecutor getEventExecutor() {
            return _eventExecutor;
        }
        
        @Override
        public Long getMaxConnectionAttempts() {
            return _maxConnectionAttempts;
        }
        
        @Override
        public String getPassword() {
            return _password;
        }
        
        @Override
        public Long getPort() {
            return _port;
        }
        
        @Override
        public Boolean isTcpOnly() {
            return _tcpOnly;
        }
        
        @Override
        public String getUsername() {
            return _username;
        }
        
        @Override
        public WorkerThreadGroup getWorkerThreadGroup() {
            return _workerThreadGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.connector.netconf.rev131028.modules.module.configuration.SalNetconfConnector>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_address == null) ? 0 : _address.hashCode());
            result = prime * result + ((_betweenAttemptsTimeoutMillis == null) ? 0 : _betweenAttemptsTimeoutMillis.hashCode());
            result = prime * result + ((_bossThreadGroup == null) ? 0 : _bossThreadGroup.hashCode());
            result = prime * result + ((_clientDispatcher == null) ? 0 : _clientDispatcher.hashCode());
            result = prime * result + ((_connectionTimeoutMillis == null) ? 0 : _connectionTimeoutMillis.hashCode());
            result = prime * result + ((_domRegistry == null) ? 0 : _domRegistry.hashCode());
            result = prime * result + ((_eventExecutor == null) ? 0 : _eventExecutor.hashCode());
            result = prime * result + ((_maxConnectionAttempts == null) ? 0 : _maxConnectionAttempts.hashCode());
            result = prime * result + ((_password == null) ? 0 : _password.hashCode());
            result = prime * result + ((_port == null) ? 0 : _port.hashCode());
            result = prime * result + ((_tcpOnly == null) ? 0 : _tcpOnly.hashCode());
            result = prime * result + ((_username == null) ? 0 : _username.hashCode());
            result = prime * result + ((_workerThreadGroup == null) ? 0 : _workerThreadGroup.hashCode());
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
            SalNetconfConnectorImpl other = (SalNetconfConnectorImpl) obj;
            if (_address == null) {
                if (other._address != null) {
                    return false;
                }
            } else if(!_address.equals(other._address)) {
                return false;
            }
            if (_betweenAttemptsTimeoutMillis == null) {
                if (other._betweenAttemptsTimeoutMillis != null) {
                    return false;
                }
            } else if(!_betweenAttemptsTimeoutMillis.equals(other._betweenAttemptsTimeoutMillis)) {
                return false;
            }
            if (_bossThreadGroup == null) {
                if (other._bossThreadGroup != null) {
                    return false;
                }
            } else if(!_bossThreadGroup.equals(other._bossThreadGroup)) {
                return false;
            }
            if (_clientDispatcher == null) {
                if (other._clientDispatcher != null) {
                    return false;
                }
            } else if(!_clientDispatcher.equals(other._clientDispatcher)) {
                return false;
            }
            if (_connectionTimeoutMillis == null) {
                if (other._connectionTimeoutMillis != null) {
                    return false;
                }
            } else if(!_connectionTimeoutMillis.equals(other._connectionTimeoutMillis)) {
                return false;
            }
            if (_domRegistry == null) {
                if (other._domRegistry != null) {
                    return false;
                }
            } else if(!_domRegistry.equals(other._domRegistry)) {
                return false;
            }
            if (_eventExecutor == null) {
                if (other._eventExecutor != null) {
                    return false;
                }
            } else if(!_eventExecutor.equals(other._eventExecutor)) {
                return false;
            }
            if (_maxConnectionAttempts == null) {
                if (other._maxConnectionAttempts != null) {
                    return false;
                }
            } else if(!_maxConnectionAttempts.equals(other._maxConnectionAttempts)) {
                return false;
            }
            if (_password == null) {
                if (other._password != null) {
                    return false;
                }
            } else if(!_password.equals(other._password)) {
                return false;
            }
            if (_port == null) {
                if (other._port != null) {
                    return false;
                }
            } else if(!_port.equals(other._port)) {
                return false;
            }
            if (_tcpOnly == null) {
                if (other._tcpOnly != null) {
                    return false;
                }
            } else if(!_tcpOnly.equals(other._tcpOnly)) {
                return false;
            }
            if (_username == null) {
                if (other._username != null) {
                    return false;
                }
            } else if(!_username.equals(other._username)) {
                return false;
            }
            if (_workerThreadGroup == null) {
                if (other._workerThreadGroup != null) {
                    return false;
                }
            } else if(!_workerThreadGroup.equals(other._workerThreadGroup)) {
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
            StringBuilder builder = new StringBuilder("SalNetconfConnector [");
            boolean first = true;
        
            if (_address != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_address=");
                builder.append(_address);
             }
            if (_betweenAttemptsTimeoutMillis != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_betweenAttemptsTimeoutMillis=");
                builder.append(_betweenAttemptsTimeoutMillis);
             }
            if (_bossThreadGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bossThreadGroup=");
                builder.append(_bossThreadGroup);
             }
            if (_clientDispatcher != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_clientDispatcher=");
                builder.append(_clientDispatcher);
             }
            if (_connectionTimeoutMillis != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connectionTimeoutMillis=");
                builder.append(_connectionTimeoutMillis);
             }
            if (_domRegistry != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domRegistry=");
                builder.append(_domRegistry);
             }
            if (_eventExecutor != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_eventExecutor=");
                builder.append(_eventExecutor);
             }
            if (_maxConnectionAttempts != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxConnectionAttempts=");
                builder.append(_maxConnectionAttempts);
             }
            if (_password != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_password=");
                builder.append(_password);
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
            if (_tcpOnly != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tcpOnly=");
                builder.append(_tcpOnly);
             }
            if (_username != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_username=");
                builder.append(_username);
             }
            if (_workerThreadGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_workerThreadGroup=");
                builder.append(_workerThreadGroup);
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
