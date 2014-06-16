package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class MeterStatisticsUpdatedBuilder {

    private NodeId _id;
    private List<NodeConnector> _nodeConnector;
    private Boolean _moreReplies;
    private TransactionId _transactionId;
    private List<MeterStats> _meterStats;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>> augmentation = new HashMap<>();

    public MeterStatisticsUpdatedBuilder() {
    } 
    
    public MeterStatisticsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node arg) {
        this._id = arg.getId();
        this._nodeConnector = arg.getNodeConnector();
    }
    
    public MeterStatisticsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware arg) {
        this._moreReplies = arg.isMoreReplies();
        this._transactionId = arg.getTransactionId();
    }
    
    public MeterStatisticsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public MeterStatisticsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatisticsReply arg) {
        this._meterStats = arg.getMeterStats();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatisticsReply</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node)arg).getId();
            this._nodeConnector = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node)arg).getNodeConnector();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware) {
            this._moreReplies = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware)arg).isMoreReplies();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatisticsReply) {
            this._meterStats = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatisticsReply)arg).getMeterStats();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware, org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatisticsReply, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeId getId() {
        return _id;
    }
    
    public List<NodeConnector> getNodeConnector() {
        return _nodeConnector;
    }
    
    public Boolean isMoreReplies() {
        return _moreReplies;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public List<MeterStats> getMeterStats() {
        return _meterStats;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterStatisticsUpdatedBuilder setId(NodeId value) {
    
        this._id = value;
        return this;
    }
    
    public MeterStatisticsUpdatedBuilder setNodeConnector(List<NodeConnector> value) {
    
        this._nodeConnector = value;
        return this;
    }
    
    public MeterStatisticsUpdatedBuilder setMoreReplies(Boolean value) {
    
        this._moreReplies = value;
        return this;
    }
    
    public MeterStatisticsUpdatedBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public MeterStatisticsUpdatedBuilder setMeterStats(List<MeterStats> value) {
    
        this._meterStats = value;
        return this;
    }
    
    public MeterStatisticsUpdatedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterStatisticsUpdated build() {
        return new MeterStatisticsUpdatedImpl(this);
    }

    private static final class MeterStatisticsUpdatedImpl implements MeterStatisticsUpdated {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated.class;
        }

        private final NodeId _id;
        private final List<NodeConnector> _nodeConnector;
        private final Boolean _moreReplies;
        private final TransactionId _transactionId;
        private final List<MeterStats> _meterStats;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>> augmentation;

        private MeterStatisticsUpdatedImpl(MeterStatisticsUpdatedBuilder builder) {
            this._id = builder.getId();
            this._nodeConnector = builder.getNodeConnector();
            this._moreReplies = builder.isMoreReplies();
            this._transactionId = builder.getTransactionId();
            this._meterStats = builder.getMeterStats();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public NodeId getId() {
            return _id;
        }
        
        @Override
        public List<NodeConnector> getNodeConnector() {
            return _nodeConnector;
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
        public List<MeterStats> getMeterStats() {
            return _meterStats;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_id == null) ? 0 : _id.hashCode());
            result = prime * result + ((_nodeConnector == null) ? 0 : _nodeConnector.hashCode());
            result = prime * result + ((_moreReplies == null) ? 0 : _moreReplies.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
            result = prime * result + ((_meterStats == null) ? 0 : _meterStats.hashCode());
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
            MeterStatisticsUpdatedImpl other = (MeterStatisticsUpdatedImpl) obj;
            if (_id == null) {
                if (other._id != null) {
                    return false;
                }
            } else if(!_id.equals(other._id)) {
                return false;
            }
            if (_nodeConnector == null) {
                if (other._nodeConnector != null) {
                    return false;
                }
            } else if(!_nodeConnector.equals(other._nodeConnector)) {
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
            if (_meterStats == null) {
                if (other._meterStats != null) {
                    return false;
                }
            } else if(!_meterStats.equals(other._meterStats)) {
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
            StringBuilder builder = new StringBuilder("MeterStatisticsUpdated [");
            boolean first = true;
        
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
             }
            if (_nodeConnector != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeConnector=");
                builder.append(_nodeConnector);
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
            if (_meterStats != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterStats=");
                builder.append(_meterStats);
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
