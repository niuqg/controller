package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class AddGroupOutputBuilder {

    private TransactionId _transactionId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>> augmentation = new HashMap<>();

    public AddGroupOutputBuilder() {
    } 
    
    public AddGroupOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public AddGroupOutputBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public AddGroupOutputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public AddGroupOutput build() {
        return new AddGroupOutputImpl(this);
    }

    private static final class AddGroupOutputImpl implements AddGroupOutput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput.class;
        }

        private final TransactionId _transactionId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>> augmentation;

        private AddGroupOutputImpl(AddGroupOutputBuilder builder) {
            this._transactionId = builder.getTransactionId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
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
            AddGroupOutputImpl other = (AddGroupOutputImpl) obj;
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
            StringBuilder builder = new StringBuilder("AddGroupOutput [");
            boolean first = true;
        
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
