package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.UpdatedTable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class UpdateTableInputBuilder {

    private OriginalTable _originalTable;
    private UpdatedTable _updatedTable;
    private NodeRef _node;
    private TransactionId _transactionId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>> augmentation = new HashMap<>();

    public UpdateTableInputBuilder() {
    } 
    
    public UpdateTableInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate arg) {
        this._originalTable = arg.getOriginalTable();
        this._updatedTable = arg.getUpdatedTable();
        this._node = arg.getNode();
    }
    
    public UpdateTableInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }
    
    public UpdateTableInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate) {
            this._originalTable = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate)arg).getOriginalTable();
            this._updatedTable = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate)arg).getUpdatedTable();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public OriginalTable getOriginalTable() {
        return _originalTable;
    }
    
    public UpdatedTable getUpdatedTable() {
        return _updatedTable;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public UpdateTableInputBuilder setOriginalTable(OriginalTable value) {
    
        this._originalTable = value;
        return this;
    }
    
    public UpdateTableInputBuilder setUpdatedTable(UpdatedTable value) {
    
        this._updatedTable = value;
        return this;
    }
    
    public UpdateTableInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public UpdateTableInputBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public UpdateTableInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public UpdateTableInput build() {
        return new UpdateTableInputImpl(this);
    }

    private static final class UpdateTableInputImpl implements UpdateTableInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput.class;
        }

        private final OriginalTable _originalTable;
        private final UpdatedTable _updatedTable;
        private final NodeRef _node;
        private final TransactionId _transactionId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>> augmentation;

        private UpdateTableInputImpl(UpdateTableInputBuilder builder) {
            this._originalTable = builder.getOriginalTable();
            this._updatedTable = builder.getUpdatedTable();
            this._node = builder.getNode();
            this._transactionId = builder.getTransactionId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public OriginalTable getOriginalTable() {
            return _originalTable;
        }
        
        @Override
        public UpdatedTable getUpdatedTable() {
            return _updatedTable;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_originalTable == null) ? 0 : _originalTable.hashCode());
            result = prime * result + ((_updatedTable == null) ? 0 : _updatedTable.hashCode());
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
            UpdateTableInputImpl other = (UpdateTableInputImpl) obj;
            if (_originalTable == null) {
                if (other._originalTable != null) {
                    return false;
                }
            } else if(!_originalTable.equals(other._originalTable)) {
                return false;
            }
            if (_updatedTable == null) {
                if (other._updatedTable != null) {
                    return false;
                }
            } else if(!_updatedTable.equals(other._updatedTable)) {
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
            StringBuilder builder = new StringBuilder("UpdateTableInput [");
            boolean first = true;
        
            if (_originalTable != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalTable=");
                builder.append(_originalTable);
             }
            if (_updatedTable != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_updatedTable=");
                builder.append(_updatedTable);
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
