package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.UpdatedPort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class UpdatePortInputBuilder {

    private OriginalPort _originalPort;
    private UpdatedPort _updatedPort;
    private NodeRef _node;
    private TransactionId _transactionId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>> augmentation = new HashMap<>();

    public UpdatePortInputBuilder() {
    } 
    
    public UpdatePortInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate arg) {
        this._originalPort = arg.getOriginalPort();
        this._updatedPort = arg.getUpdatedPort();
        this._node = arg.getNode();
    }
    
    public UpdatePortInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }
    
    public UpdatePortInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate) {
            this._originalPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate)arg).getOriginalPort();
            this._updatedPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate)arg).getUpdatedPort();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public OriginalPort getOriginalPort() {
        return _originalPort;
    }
    
    public UpdatedPort getUpdatedPort() {
        return _updatedPort;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public UpdatePortInputBuilder setOriginalPort(OriginalPort value) {
    
        this._originalPort = value;
        return this;
    }
    
    public UpdatePortInputBuilder setUpdatedPort(UpdatedPort value) {
    
        this._updatedPort = value;
        return this;
    }
    
    public UpdatePortInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public UpdatePortInputBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public UpdatePortInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public UpdatePortInput build() {
        return new UpdatePortInputImpl(this);
    }

    private static final class UpdatePortInputImpl implements UpdatePortInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput.class;
        }

        private final OriginalPort _originalPort;
        private final UpdatedPort _updatedPort;
        private final NodeRef _node;
        private final TransactionId _transactionId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>> augmentation;

        private UpdatePortInputImpl(UpdatePortInputBuilder builder) {
            this._originalPort = builder.getOriginalPort();
            this._updatedPort = builder.getUpdatedPort();
            this._node = builder.getNode();
            this._transactionId = builder.getTransactionId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public OriginalPort getOriginalPort() {
            return _originalPort;
        }
        
        @Override
        public UpdatedPort getUpdatedPort() {
            return _updatedPort;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_originalPort == null) ? 0 : _originalPort.hashCode());
            result = prime * result + ((_updatedPort == null) ? 0 : _updatedPort.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
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
            UpdatePortInputImpl other = (UpdatePortInputImpl) obj;
            if (_originalPort == null) {
                if (other._originalPort != null) {
                    return false;
                }
            } else if(!_originalPort.equals(other._originalPort)) {
                return false;
            }
            if (_updatedPort == null) {
                if (other._updatedPort != null) {
                    return false;
                }
            } else if(!_updatedPort.equals(other._updatedPort)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
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
            StringBuilder builder = new StringBuilder("UpdatePortInput [");
            boolean first = true;
        
            if (_originalPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalPort=");
                builder.append(_originalPort);
             }
            if (_updatedPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_updatedPort=");
                builder.append(_updatedPort);
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
            if (_transactionId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionId=");
                builder.append(_transactionId);
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
