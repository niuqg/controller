package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class TableUpdatedBuilder {

    private List<TableFeatures> _tableFeatures;
    private Boolean _moreReplies;
    private TransactionId _transactionId;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>> augmentation = new HashMap<>();

    public TableUpdatedBuilder() {
    } 
    
    public TableUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures arg) {
        this._tableFeatures = arg.getTableFeatures();
    }
    
    public TableUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware arg) {
        this._moreReplies = arg.isMoreReplies();
        this._transactionId = arg.getTransactionId();
    }
    
    public TableUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public TableUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware) {
            this._moreReplies = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware)arg).isMoreReplies();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures) {
            this._tableFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures)arg).getTableFeatures();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware, org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public List<TableFeatures> getTableFeatures() {
        return _tableFeatures;
    }
    
    public Boolean isMoreReplies() {
        return _moreReplies;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TableUpdatedBuilder setTableFeatures(List<TableFeatures> value) {
    
        this._tableFeatures = value;
        return this;
    }
    
    public TableUpdatedBuilder setMoreReplies(Boolean value) {
    
        this._moreReplies = value;
        return this;
    }
    
    public TableUpdatedBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public TableUpdatedBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public TableUpdatedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TableUpdated build() {
        return new TableUpdatedImpl(this);
    }

    private static final class TableUpdatedImpl implements TableUpdated {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated.class;
        }

        private final List<TableFeatures> _tableFeatures;
        private final Boolean _moreReplies;
        private final TransactionId _transactionId;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>> augmentation;

        private TableUpdatedImpl(TableUpdatedBuilder builder) {
            this._tableFeatures = builder.getTableFeatures();
            this._moreReplies = builder.isMoreReplies();
            this._transactionId = builder.getTransactionId();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<TableFeatures> getTableFeatures() {
            return _tableFeatures;
        }
        
        @Override
        public Boolean isMoreReplies() {
            return _moreReplies;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdated>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_tableFeatures == null) ? 0 : _tableFeatures.hashCode());
            result = prime * result + ((_moreReplies == null) ? 0 : _moreReplies.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
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
            TableUpdatedImpl other = (TableUpdatedImpl) obj;
            if (_tableFeatures == null) {
                if (other._tableFeatures != null) {
                    return false;
                }
            } else if(!_tableFeatures.equals(other._tableFeatures)) {
                return false;
            }
            if (_moreReplies == null) {
                if (other._moreReplies != null) {
                    return false;
                }
            } else if(!_moreReplies.equals(other._moreReplies)) {
                return false;
            }
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
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
            StringBuilder builder = new StringBuilder("TableUpdated [");
            boolean first = true;
        
            if (_tableFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableFeatures=");
                builder.append(_tableFeatures);
             }
            if (_moreReplies != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_moreReplies=");
                builder.append(_moreReplies);
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
