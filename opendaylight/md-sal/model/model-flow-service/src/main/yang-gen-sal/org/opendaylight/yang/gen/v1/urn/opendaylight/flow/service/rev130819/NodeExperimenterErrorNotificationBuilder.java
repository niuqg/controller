package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class NodeExperimenterErrorNotificationBuilder {

    private TransactionId _transactionId;
    private String _data;
    private Integer _expType;
    private Long _experimenterId;
    private ErrorType _type;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>> augmentation = new HashMap<>();

    public NodeExperimenterErrorNotificationBuilder() {
    } 
    
    public NodeExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public NodeExperimenterErrorNotificationBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage arg) {
        this._data = arg.getData();
        this._expType = arg.getExpType();
        this._experimenterId = arg.getExperimenterId();
        this._type = arg.getType();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage) {
            this._data = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage)arg).getData();
            this._expType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage)arg).getExpType();
            this._experimenterId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage)arg).getExperimenterId();
            this._type = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage)arg).getType();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ExperimenterErrorMessage, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public String getData() {
        return _data;
    }
    
    public Integer getExpType() {
        return _expType;
    }
    
    public Long getExperimenterId() {
        return _experimenterId;
    }
    
    public ErrorType getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public NodeExperimenterErrorNotificationBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public NodeExperimenterErrorNotificationBuilder setData(String value) {
    
        this._data = value;
        return this;
    }
    
    public NodeExperimenterErrorNotificationBuilder setExpType(Integer value) {
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
    
        this._expType = value;
        return this;
    }
    
    public NodeExperimenterErrorNotificationBuilder setExperimenterId(Long value) {
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
    
        this._experimenterId = value;
        return this;
    }
    
    public NodeExperimenterErrorNotificationBuilder setType(ErrorType value) {
    
        this._type = value;
        return this;
    }
    
    public NodeExperimenterErrorNotificationBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public NodeExperimenterErrorNotification build() {
        return new NodeExperimenterErrorNotificationImpl(this);
    }

    private static final class NodeExperimenterErrorNotificationImpl implements NodeExperimenterErrorNotification {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification.class;
        }

        private final TransactionId _transactionId;
        private final String _data;
        private final Integer _expType;
        private final Long _experimenterId;
        private final ErrorType _type;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>> augmentation;

        private NodeExperimenterErrorNotificationImpl(NodeExperimenterErrorNotificationBuilder builder) {
            this._transactionId = builder.getTransactionId();
            this._data = builder.getData();
            this._expType = builder.getExpType();
            this._experimenterId = builder.getExperimenterId();
            this._type = builder.getType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @Override
        public String getData() {
            return _data;
        }
        
        @Override
        public Integer getExpType() {
            return _expType;
        }
        
        @Override
        public Long getExperimenterId() {
            return _experimenterId;
        }
        
        @Override
        public ErrorType getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_data == null) ? 0 : _data.hashCode());
            result = prime * result + ((_expType == null) ? 0 : _expType.hashCode());
            result = prime * result + ((_experimenterId == null) ? 0 : _experimenterId.hashCode());
            result = prime * result + ((_type == null) ? 0 : _type.hashCode());
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
            NodeExperimenterErrorNotificationImpl other = (NodeExperimenterErrorNotificationImpl) obj;
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
                return false;
            }
            if (_data == null) {
                if (other._data != null) {
                    return false;
                }
            } else if(!_data.equals(other._data)) {
                return false;
            }
            if (_expType == null) {
                if (other._expType != null) {
                    return false;
                }
            } else if(!_expType.equals(other._expType)) {
                return false;
            }
            if (_experimenterId == null) {
                if (other._experimenterId != null) {
                    return false;
                }
            } else if(!_experimenterId.equals(other._experimenterId)) {
                return false;
            }
            if (_type == null) {
                if (other._type != null) {
                    return false;
                }
            } else if(!_type.equals(other._type)) {
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
            StringBuilder builder = new StringBuilder("NodeExperimenterErrorNotification [");
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
            if (_data != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_data=");
                builder.append(_data);
             }
            if (_expType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_expType=");
                builder.append(_expType);
             }
            if (_experimenterId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_experimenterId=");
                builder.append(_experimenterId);
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
