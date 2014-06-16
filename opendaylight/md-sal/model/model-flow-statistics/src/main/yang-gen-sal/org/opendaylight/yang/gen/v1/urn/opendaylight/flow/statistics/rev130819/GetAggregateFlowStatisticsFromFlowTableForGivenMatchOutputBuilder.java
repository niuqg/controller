package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder {

    private TransactionId _transactionId;
    private Counter64 _byteCount;
    private Counter32 _flowCount;
    private Counter64 _packetCount;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> augmentation = new HashMap<>();

    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder() {
    } 
    
    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics arg) {
        this._byteCount = arg.getByteCount();
        this._flowCount = arg.getFlowCount();
        this._packetCount = arg.getPacketCount();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics) {
            this._byteCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics)arg).getByteCount();
            this._flowCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics)arg).getFlowCount();
            this._packetCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics)arg).getPacketCount();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public Counter64 getByteCount() {
        return _byteCount;
    }
    
    public Counter32 getFlowCount() {
        return _flowCount;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder setByteCount(Counter64 value) {
    
        this._byteCount = value;
        return this;
    }
    
    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder setFlowCount(Counter32 value) {
    
        this._flowCount = value;
        return this;
    }
    
    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder setPacketCount(Counter64 value) {
    
        this._packetCount = value;
        return this;
    }
    
    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput build() {
        return new GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputImpl(this);
    }

    private static final class GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputImpl implements GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput.class;
        }

        private final TransactionId _transactionId;
        private final Counter64 _byteCount;
        private final Counter32 _flowCount;
        private final Counter64 _packetCount;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> augmentation;

        private GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputImpl(GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputBuilder builder) {
            this._transactionId = builder.getTransactionId();
            this._byteCount = builder.getByteCount();
            this._flowCount = builder.getFlowCount();
            this._packetCount = builder.getPacketCount();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>>singletonMap(e.getKey(), e.getValue());
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
        public Counter64 getByteCount() {
            return _byteCount;
        }
        
        @Override
        public Counter32 getFlowCount() {
            return _flowCount;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_byteCount == null) ? 0 : _byteCount.hashCode());
            result = prime * result + ((_flowCount == null) ? 0 : _flowCount.hashCode());
            result = prime * result + ((_packetCount == null) ? 0 : _packetCount.hashCode());
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
            GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputImpl other = (GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutputImpl) obj;
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
                return false;
            }
            if (_byteCount == null) {
                if (other._byteCount != null) {
                    return false;
                }
            } else if(!_byteCount.equals(other._byteCount)) {
                return false;
            }
            if (_flowCount == null) {
                if (other._flowCount != null) {
                    return false;
                }
            } else if(!_flowCount.equals(other._flowCount)) {
                return false;
            }
            if (_packetCount == null) {
                if (other._packetCount != null) {
                    return false;
                }
            } else if(!_packetCount.equals(other._packetCount)) {
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
            StringBuilder builder = new StringBuilder("GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput [");
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
            if (_byteCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteCount=");
                builder.append(_byteCount);
             }
            if (_flowCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCount=");
                builder.append(_flowCount);
             }
            if (_packetCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetCount=");
                builder.append(_packetCount);
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
