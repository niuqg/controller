package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.desc.stats.reply.GroupDescStats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GroupDescStatsUpdatedBuilder {

    private NodeId _id;
    private List<NodeConnector> _nodeConnector;
    private List<GroupDescStats> _groupDescStats;
    private Boolean _moreReplies;
    private TransactionId _transactionId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>> augmentation = new HashMap<>();

    public GroupDescStatsUpdatedBuilder() {
    } 
    
    public GroupDescStatsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node arg) {
        this._id = arg.getId();
        this._nodeConnector = arg.getNodeConnector();
    }
    
    public GroupDescStatsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupDescStatsReply arg) {
        this._groupDescStats = arg.getGroupDescStats();
    }
    
    public GroupDescStatsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware arg) {
        this._moreReplies = arg.isMoreReplies();
        this._transactionId = arg.getTransactionId();
    }
    
    public GroupDescStatsUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupDescStatsReply</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupDescStatsReply) {
            this._groupDescStats = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupDescStatsReply)arg).getGroupDescStats();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node)arg).getId();
            this._nodeConnector = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node)arg).getNodeConnector();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware) {
            this._moreReplies = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware)arg).isMoreReplies();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupDescStatsReply, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
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
    
    public List<GroupDescStats> getGroupDescStats() {
        return _groupDescStats;
    }
    
    public Boolean isMoreReplies() {
        return _moreReplies;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupDescStatsUpdatedBuilder setId(NodeId value) {
    
        this._id = value;
        return this;
    }
    
    public GroupDescStatsUpdatedBuilder setNodeConnector(List<NodeConnector> value) {
    
        this._nodeConnector = value;
        return this;
    }
    
    public GroupDescStatsUpdatedBuilder setGroupDescStats(List<GroupDescStats> value) {
    
        this._groupDescStats = value;
        return this;
    }
    
    public GroupDescStatsUpdatedBuilder setMoreReplies(Boolean value) {
    
        this._moreReplies = value;
        return this;
    }
    
    public GroupDescStatsUpdatedBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public GroupDescStatsUpdatedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupDescStatsUpdated build() {
        return new GroupDescStatsUpdatedImpl(this);
    }

    private static final class GroupDescStatsUpdatedImpl implements GroupDescStatsUpdated {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated.class;
        }

        private final NodeId _id;
        private final List<NodeConnector> _nodeConnector;
        private final List<GroupDescStats> _groupDescStats;
        private final Boolean _moreReplies;
        private final TransactionId _transactionId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>> augmentation;

        private GroupDescStatsUpdatedImpl(GroupDescStatsUpdatedBuilder builder) {
            this._id = builder.getId();
            this._nodeConnector = builder.getNodeConnector();
            this._groupDescStats = builder.getGroupDescStats();
            this._moreReplies = builder.isMoreReplies();
            this._transactionId = builder.getTransactionId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>>singletonMap(e.getKey(), e.getValue());
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
        public List<GroupDescStats> getGroupDescStats() {
            return _groupDescStats;
        }
        
        @Override
        public Boolean isMoreReplies() {
            return _moreReplies;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_groupDescStats == null) ? 0 : _groupDescStats.hashCode());
            result = prime * result + ((_moreReplies == null) ? 0 : _moreReplies.hashCode());
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
            GroupDescStatsUpdatedImpl other = (GroupDescStatsUpdatedImpl) obj;
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
            if (_groupDescStats == null) {
                if (other._groupDescStats != null) {
                    return false;
                }
            } else if(!_groupDescStats.equals(other._groupDescStats)) {
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
            StringBuilder builder = new StringBuilder("GroupDescStatsUpdated [");
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
            if (_groupDescStats != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupDescStats=");
                builder.append(_groupDescStats);
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
