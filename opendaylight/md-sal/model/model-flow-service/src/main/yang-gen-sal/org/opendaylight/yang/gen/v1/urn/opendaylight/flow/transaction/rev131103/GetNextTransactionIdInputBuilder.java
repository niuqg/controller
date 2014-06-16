package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class GetNextTransactionIdInputBuilder {

    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>> augmentation = new HashMap<>();

    public GetNextTransactionIdInputBuilder() {
    } 


    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GetNextTransactionIdInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public GetNextTransactionIdInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GetNextTransactionIdInput build() {
        return new GetNextTransactionIdInputImpl(this);
    }

    private static final class GetNextTransactionIdInputImpl implements GetNextTransactionIdInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput.class;
        }

        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>> augmentation;

        private GetNextTransactionIdInputImpl(GetNextTransactionIdInputBuilder builder) {
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
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
            GetNextTransactionIdInputImpl other = (GetNextTransactionIdInputImpl) obj;
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
            StringBuilder builder = new StringBuilder("GetNextTransactionIdInput [");
            boolean first = true;
        
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
