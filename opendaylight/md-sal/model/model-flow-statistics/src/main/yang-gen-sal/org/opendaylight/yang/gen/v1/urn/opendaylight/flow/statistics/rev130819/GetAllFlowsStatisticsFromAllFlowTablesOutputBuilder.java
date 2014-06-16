package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.and.statistics.map.list.FlowAndStatisticsMapList;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder {

    private TransactionId _transactionId;
    private List<FlowAndStatisticsMapList> _flowAndStatisticsMapList;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>> augmentation = new HashMap<>();

    public GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder() {
    } 
    
    public GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowAndStatisticsMapList arg) {
        this._flowAndStatisticsMapList = arg.getFlowAndStatisticsMapList();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowAndStatisticsMapList</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowAndStatisticsMapList) {
            this._flowAndStatisticsMapList = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowAndStatisticsMapList)arg).getFlowAndStatisticsMapList();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowAndStatisticsMapList, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public List<FlowAndStatisticsMapList> getFlowAndStatisticsMapList() {
        return _flowAndStatisticsMapList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder setFlowAndStatisticsMapList(List<FlowAndStatisticsMapList> value) {
    
        this._flowAndStatisticsMapList = value;
        return this;
    }
    
    public GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GetAllFlowsStatisticsFromAllFlowTablesOutput build() {
        return new GetAllFlowsStatisticsFromAllFlowTablesOutputImpl(this);
    }

    private static final class GetAllFlowsStatisticsFromAllFlowTablesOutputImpl implements GetAllFlowsStatisticsFromAllFlowTablesOutput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput.class;
        }

        private final TransactionId _transactionId;
        private final List<FlowAndStatisticsMapList> _flowAndStatisticsMapList;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>> augmentation;

        private GetAllFlowsStatisticsFromAllFlowTablesOutputImpl(GetAllFlowsStatisticsFromAllFlowTablesOutputBuilder builder) {
            this._transactionId = builder.getTransactionId();
            this._flowAndStatisticsMapList = builder.getFlowAndStatisticsMapList();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>>singletonMap(e.getKey(), e.getValue());
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
        public List<FlowAndStatisticsMapList> getFlowAndStatisticsMapList() {
            return _flowAndStatisticsMapList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_flowAndStatisticsMapList == null) ? 0 : _flowAndStatisticsMapList.hashCode());
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
            GetAllFlowsStatisticsFromAllFlowTablesOutputImpl other = (GetAllFlowsStatisticsFromAllFlowTablesOutputImpl) obj;
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
                return false;
            }
            if (_flowAndStatisticsMapList == null) {
                if (other._flowAndStatisticsMapList != null) {
                    return false;
                }
            } else if(!_flowAndStatisticsMapList.equals(other._flowAndStatisticsMapList)) {
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
            StringBuilder builder = new StringBuilder("GetAllFlowsStatisticsFromAllFlowTablesOutput [");
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
            if (_flowAndStatisticsMapList != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowAndStatisticsMapList=");
                builder.append(_flowAndStatisticsMapList);
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
