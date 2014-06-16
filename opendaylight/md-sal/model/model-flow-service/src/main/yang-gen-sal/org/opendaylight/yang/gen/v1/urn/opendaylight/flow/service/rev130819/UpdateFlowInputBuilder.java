package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.flow.update.OriginalFlow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.flow.update.UpdatedFlow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class UpdateFlowInputBuilder {

    private FlowRef _flowRef;
    private Uri _transactionUri;
    private OriginalFlow _originalFlow;
    private UpdatedFlow _updatedFlow;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>> augmentation = new HashMap<>();

    public UpdateFlowInputBuilder() {
    } 
    
    public UpdateFlowInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }
    
    public UpdateFlowInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate arg) {
        this._originalFlow = arg.getOriginalFlow();
        this._updatedFlow = arg.getUpdatedFlow();
        this._node = arg.getNode();
    }
    
    public UpdateFlowInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate) {
            this._originalFlow = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate)arg).getOriginalFlow();
            this._updatedFlow = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate)arg).getUpdatedFlow();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata) {
            this._transactionUri = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata)arg).getTransactionUri();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata] \n" +
              "but was: " + arg
            );
        }
    }

    public FlowRef getFlowRef() {
        return _flowRef;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    public OriginalFlow getOriginalFlow() {
        return _originalFlow;
    }
    
    public UpdatedFlow getUpdatedFlow() {
        return _updatedFlow;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public UpdateFlowInputBuilder setFlowRef(FlowRef value) {
    
        this._flowRef = value;
        return this;
    }
    
    public UpdateFlowInputBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public UpdateFlowInputBuilder setOriginalFlow(OriginalFlow value) {
    
        this._originalFlow = value;
        return this;
    }
    
    public UpdateFlowInputBuilder setUpdatedFlow(UpdatedFlow value) {
    
        this._updatedFlow = value;
        return this;
    }
    
    public UpdateFlowInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public UpdateFlowInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public UpdateFlowInput build() {
        return new UpdateFlowInputImpl(this);
    }

    private static final class UpdateFlowInputImpl implements UpdateFlowInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput.class;
        }

        private final FlowRef _flowRef;
        private final Uri _transactionUri;
        private final OriginalFlow _originalFlow;
        private final UpdatedFlow _updatedFlow;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>> augmentation;

        private UpdateFlowInputImpl(UpdateFlowInputBuilder builder) {
            this._flowRef = builder.getFlowRef();
            this._transactionUri = builder.getTransactionUri();
            this._originalFlow = builder.getOriginalFlow();
            this._updatedFlow = builder.getUpdatedFlow();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public FlowRef getFlowRef() {
            return _flowRef;
        }
        
        @Override
        public Uri getTransactionUri() {
            return _transactionUri;
        }
        
        @Override
        public OriginalFlow getOriginalFlow() {
            return _originalFlow;
        }
        
        @Override
        public UpdatedFlow getUpdatedFlow() {
            return _updatedFlow;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_flowRef == null) ? 0 : _flowRef.hashCode());
            result = prime * result + ((_transactionUri == null) ? 0 : _transactionUri.hashCode());
            result = prime * result + ((_originalFlow == null) ? 0 : _originalFlow.hashCode());
            result = prime * result + ((_updatedFlow == null) ? 0 : _updatedFlow.hashCode());
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
            UpdateFlowInputImpl other = (UpdateFlowInputImpl) obj;
            if (_flowRef == null) {
                if (other._flowRef != null) {
                    return false;
                }
            } else if(!_flowRef.equals(other._flowRef)) {
                return false;
            }
            if (_transactionUri == null) {
                if (other._transactionUri != null) {
                    return false;
                }
            } else if(!_transactionUri.equals(other._transactionUri)) {
                return false;
            }
            if (_originalFlow == null) {
                if (other._originalFlow != null) {
                    return false;
                }
            } else if(!_originalFlow.equals(other._originalFlow)) {
                return false;
            }
            if (_updatedFlow == null) {
                if (other._updatedFlow != null) {
                    return false;
                }
            } else if(!_updatedFlow.equals(other._updatedFlow)) {
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
            StringBuilder builder = new StringBuilder("UpdateFlowInput [");
            boolean first = true;
        
            if (_flowRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowRef=");
                builder.append(_flowRef);
             }
            if (_transactionUri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionUri=");
                builder.append(_transactionUri);
             }
            if (_originalFlow != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalFlow=");
                builder.append(_originalFlow);
             }
            if (_updatedFlow != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_updatedFlow=");
                builder.append(_updatedFlow);
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
