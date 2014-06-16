package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GroupFeaturesUpdatedBuilder {

    private NodeId _id;
    private List<NodeConnector> _nodeConnector;
    private Boolean _moreReplies;
    private TransactionId _transactionId;
    private List<Long> _actions;
    private List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> _groupCapabilitiesSupported;
    private List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> _groupTypesSupported;
    private List<Long> _maxGroups;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>> augmentation = new HashMap<>();

    public GroupFeaturesUpdatedBuilder() {
    } 
    
    public GroupFeaturesUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node arg) {
        this._id = arg.getId();
        this._nodeConnector = arg.getNodeConnector();
    }
    
    public GroupFeaturesUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware arg) {
        this._moreReplies = arg.isMoreReplies();
        this._transactionId = arg.getTransactionId();
    }
    
    public GroupFeaturesUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    
    public GroupFeaturesUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures arg) {
        this._actions = arg.getActions();
        this._groupCapabilitiesSupported = arg.getGroupCapabilitiesSupported();
        this._groupTypesSupported = arg.getGroupTypesSupported();
        this._maxGroups = arg.getMaxGroups();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures) {
            this._actions = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures)arg).getActions();
            this._groupCapabilitiesSupported = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures)arg).getGroupCapabilitiesSupported();
            this._groupTypesSupported = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures)arg).getGroupTypesSupported();
            this._maxGroups = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures)arg).getMaxGroups();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware, org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeatures, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
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
    
    public List<Long> getActions() {
        return _actions;
    }
    
    public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> getGroupCapabilitiesSupported() {
        return _groupCapabilitiesSupported;
    }
    
    public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> getGroupTypesSupported() {
        return _groupTypesSupported;
    }
    
    public List<Long> getMaxGroups() {
        return _maxGroups;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupFeaturesUpdatedBuilder setId(NodeId value) {
    
        this._id = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setNodeConnector(List<NodeConnector> value) {
    
        this._nodeConnector = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setMoreReplies(Boolean value) {
    
        this._moreReplies = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setActions(List<Long> value) {
    
        this._actions = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setGroupCapabilitiesSupported(List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> value) {
    
        this._groupCapabilitiesSupported = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setGroupTypesSupported(List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> value) {
    
        this._groupTypesSupported = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder setMaxGroups(List<Long> value) {
    
        this._maxGroups = value;
        return this;
    }
    
    public GroupFeaturesUpdatedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupFeaturesUpdated build() {
        return new GroupFeaturesUpdatedImpl(this);
    }

    private static final class GroupFeaturesUpdatedImpl implements GroupFeaturesUpdated {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated.class;
        }

        private final NodeId _id;
        private final List<NodeConnector> _nodeConnector;
        private final Boolean _moreReplies;
        private final TransactionId _transactionId;
        private final List<Long> _actions;
        private final List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> _groupCapabilitiesSupported;
        private final List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> _groupTypesSupported;
        private final List<Long> _maxGroups;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>> augmentation;

        private GroupFeaturesUpdatedImpl(GroupFeaturesUpdatedBuilder builder) {
            this._id = builder.getId();
            this._nodeConnector = builder.getNodeConnector();
            this._moreReplies = builder.isMoreReplies();
            this._transactionId = builder.getTransactionId();
            this._actions = builder.getActions();
            this._groupCapabilitiesSupported = builder.getGroupCapabilitiesSupported();
            this._groupTypesSupported = builder.getGroupTypesSupported();
            this._maxGroups = builder.getMaxGroups();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>>singletonMap(e.getKey(), e.getValue());
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
        public List<Long> getActions() {
            return _actions;
        }
        
        @Override
        public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupCapability>> getGroupCapabilitiesSupported() {
            return _groupCapabilitiesSupported;
        }
        
        @Override
        public List<Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupType>> getGroupTypesSupported() {
            return _groupTypesSupported;
        }
        
        @Override
        public List<Long> getMaxGroups() {
            return _maxGroups;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_actions == null) ? 0 : _actions.hashCode());
            result = prime * result + ((_groupCapabilitiesSupported == null) ? 0 : _groupCapabilitiesSupported.hashCode());
            result = prime * result + ((_groupTypesSupported == null) ? 0 : _groupTypesSupported.hashCode());
            result = prime * result + ((_maxGroups == null) ? 0 : _maxGroups.hashCode());
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
            GroupFeaturesUpdatedImpl other = (GroupFeaturesUpdatedImpl) obj;
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
            if (_actions == null) {
                if (other._actions != null) {
                    return false;
                }
            } else if(!_actions.equals(other._actions)) {
                return false;
            }
            if (_groupCapabilitiesSupported == null) {
                if (other._groupCapabilitiesSupported != null) {
                    return false;
                }
            } else if(!_groupCapabilitiesSupported.equals(other._groupCapabilitiesSupported)) {
                return false;
            }
            if (_groupTypesSupported == null) {
                if (other._groupTypesSupported != null) {
                    return false;
                }
            } else if(!_groupTypesSupported.equals(other._groupTypesSupported)) {
                return false;
            }
            if (_maxGroups == null) {
                if (other._maxGroups != null) {
                    return false;
                }
            } else if(!_maxGroups.equals(other._maxGroups)) {
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
            StringBuilder builder = new StringBuilder("GroupFeaturesUpdated [");
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
            if (_actions != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_actions=");
                builder.append(_actions);
             }
            if (_groupCapabilitiesSupported != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupCapabilitiesSupported=");
                builder.append(_groupCapabilitiesSupported);
             }
            if (_groupTypesSupported != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupTypesSupported=");
                builder.append(_groupTypesSupported);
             }
            if (_maxGroups != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxGroups=");
                builder.append(_maxGroups);
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
