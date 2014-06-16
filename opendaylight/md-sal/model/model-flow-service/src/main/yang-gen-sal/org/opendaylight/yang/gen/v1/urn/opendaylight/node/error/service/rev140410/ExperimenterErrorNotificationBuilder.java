package org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.ObjectReference;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class ExperimenterErrorNotificationBuilder {

    private Integer _code;
    private String _data;
    private ErrorType _type;
    private ObjectReference _objectReference;
    private TransactionId _transactionId;
    private NodeRef _node;
    private Uri _transactionUri;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>> augmentation = new HashMap<>();

    public ExperimenterErrorNotificationBuilder() {
    } 
    
    public ExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage arg) {
        this._code = arg.getCode();
        this._data = arg.getData();
        this._type = arg.getType();
    }
    
    public ExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorReference arg) {
        this._objectReference = arg.getObjectReference();
    }
    
    public ExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public ExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.BaseNodeErrorNotification arg) {
        this._node = arg.getNode();
    }
    
    public ExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorReference</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.BaseNodeErrorNotification</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorReference) {
            this._objectReference = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorReference)arg).getObjectReference();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.BaseNodeErrorNotification) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.BaseNodeErrorNotification)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage) {
            this._code = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage)arg).getCode();
            this._data = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage)arg).getData();
            this._type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage)arg).getType();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata) {
            this._transactionUri = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata)arg).getTransactionUri();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorReference, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.BaseNodeErrorNotification, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public Integer getCode() {
        return _code;
    }
    
    public String getData() {
        return _data;
    }
    
    public ErrorType getType() {
        return _type;
    }
    
    public ObjectReference getObjectReference() {
        return _objectReference;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ExperimenterErrorNotificationBuilder setCode(Integer value) {
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
    
        this._code = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder setData(String value) {
    
        this._data = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder setType(ErrorType value) {
    
        this._type = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder setObjectReference(ObjectReference value) {
    
        this._objectReference = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public ExperimenterErrorNotificationBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ExperimenterErrorNotification build() {
        return new ExperimenterErrorNotificationImpl(this);
    }

    private static final class ExperimenterErrorNotificationImpl implements ExperimenterErrorNotification {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification.class;
        }

        private final Integer _code;
        private final String _data;
        private final ErrorType _type;
        private final ObjectReference _objectReference;
        private final TransactionId _transactionId;
        private final NodeRef _node;
        private final Uri _transactionUri;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>> augmentation;

        private ExperimenterErrorNotificationImpl(ExperimenterErrorNotificationBuilder builder) {
            this._code = builder.getCode();
            this._data = builder.getData();
            this._type = builder.getType();
            this._objectReference = builder.getObjectReference();
            this._transactionId = builder.getTransactionId();
            this._node = builder.getNode();
            this._transactionUri = builder.getTransactionUri();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Integer getCode() {
            return _code;
        }
        
        @Override
        public String getData() {
            return _data;
        }
        
        @Override
        public ErrorType getType() {
            return _type;
        }
        
        @Override
        public ObjectReference getObjectReference() {
            return _objectReference;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public Uri getTransactionUri() {
            return _transactionUri;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.ExperimenterErrorNotification>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_code == null) ? 0 : _code.hashCode());
            result = prime * result + ((_data == null) ? 0 : _data.hashCode());
            result = prime * result + ((_type == null) ? 0 : _type.hashCode());
            result = prime * result + ((_objectReference == null) ? 0 : _objectReference.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_transactionUri == null) ? 0 : _transactionUri.hashCode());
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
            ExperimenterErrorNotificationImpl other = (ExperimenterErrorNotificationImpl) obj;
            if (_code == null) {
                if (other._code != null) {
                    return false;
                }
            } else if(!_code.equals(other._code)) {
                return false;
            }
            if (_data == null) {
                if (other._data != null) {
                    return false;
                }
            } else if(!_data.equals(other._data)) {
                return false;
            }
            if (_type == null) {
                if (other._type != null) {
                    return false;
                }
            } else if(!_type.equals(other._type)) {
                return false;
            }
            if (_objectReference == null) {
                if (other._objectReference != null) {
                    return false;
                }
            } else if(!_objectReference.equals(other._objectReference)) {
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
            if (_transactionUri == null) {
                if (other._transactionUri != null) {
                    return false;
                }
            } else if(!_transactionUri.equals(other._transactionUri)) {
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
            StringBuilder builder = new StringBuilder("ExperimenterErrorNotification [");
            boolean first = true;
        
            if (_code != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_code=");
                builder.append(_code);
             }
            if (_data != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_data=");
                builder.append(_data);
             }
            if (_type != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_type=");
                builder.append(_type);
             }
            if (_objectReference != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_objectReference=");
                builder.append(_objectReference);
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
            if (_transactionUri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionUri=");
                builder.append(_transactionUri);
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
