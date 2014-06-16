package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupTypes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GroupUpdatedBuilder {

    private GroupRef _groupRef;
    private Boolean _barrier;
    private Buckets _buckets;
    private String _containerName;
    private GroupId _groupId;
    private String _groupName;
    private GroupTypes _groupType;
    private NodeRef _node;
    private TransactionId _transactionId;
    private Uri _transactionUri;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>> augmentation = new HashMap<>();

    public GroupUpdatedBuilder() {
    } 
    
    
    public GroupUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group arg) {
        this._barrier = arg.isBarrier();
        this._buckets = arg.getBuckets();
        this._containerName = arg.getContainerName();
        this._groupId = arg.getGroupId();
        this._groupName = arg.getGroupName();
        this._groupType = arg.getGroupType();
    }
    
    public GroupUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }
    
    public GroupUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware arg) {
        this._transactionId = arg.getTransactionId();
    }
    
    public GroupUpdatedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group) {
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).isBarrier();
            this._buckets = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getBuckets();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getContainerName();
            this._groupId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getGroupId();
            this._groupName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getGroupName();
            this._groupType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group)arg).getGroupType();
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware) {
            this._transactionId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware)arg).getTransactionId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware] \n" +
              "but was: " + arg
            );
        }
    }

    public GroupRef getGroupRef() {
        return _groupRef;
    }
    
    public Boolean isBarrier() {
        return _barrier;
    }
    
    public Buckets getBuckets() {
        return _buckets;
    }
    
    public String getContainerName() {
        return _containerName;
    }
    
    public GroupId getGroupId() {
        return _groupId;
    }
    
    public String getGroupName() {
        return _groupName;
    }
    
    public GroupTypes getGroupType() {
        return _groupType;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public TransactionId getTransactionId() {
        return _transactionId;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupUpdatedBuilder setGroupRef(GroupRef value) {
    
        this._groupRef = value;
        return this;
    }
    
    public GroupUpdatedBuilder setBarrier(Boolean value) {
    
        this._barrier = value;
        return this;
    }
    
    public GroupUpdatedBuilder setBuckets(Buckets value) {
    
        this._buckets = value;
        return this;
    }
    
    public GroupUpdatedBuilder setContainerName(String value) {
    
        this._containerName = value;
        return this;
    }
    
    public GroupUpdatedBuilder setGroupId(GroupId value) {
    
        this._groupId = value;
        return this;
    }
    
    public GroupUpdatedBuilder setGroupName(String value) {
    
        this._groupName = value;
        return this;
    }
    
    public GroupUpdatedBuilder setGroupType(GroupTypes value) {
    
        this._groupType = value;
        return this;
    }
    
    public GroupUpdatedBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public GroupUpdatedBuilder setTransactionId(TransactionId value) {
    
        this._transactionId = value;
        return this;
    }
    
    public GroupUpdatedBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public GroupUpdatedBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupUpdated build() {
        return new GroupUpdatedImpl(this);
    }

    private static final class GroupUpdatedImpl implements GroupUpdated {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated.class;
        }

        private final GroupRef _groupRef;
        private final Boolean _barrier;
        private final Buckets _buckets;
        private final String _containerName;
        private final GroupId _groupId;
        private final String _groupName;
        private final GroupTypes _groupType;
        private final NodeRef _node;
        private final TransactionId _transactionId;
        private final Uri _transactionUri;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>> augmentation;

        private GroupUpdatedImpl(GroupUpdatedBuilder builder) {
            this._groupRef = builder.getGroupRef();
            this._barrier = builder.isBarrier();
            this._buckets = builder.getBuckets();
            this._containerName = builder.getContainerName();
            this._groupId = builder.getGroupId();
            this._groupName = builder.getGroupName();
            this._groupType = builder.getGroupType();
            this._node = builder.getNode();
            this._transactionId = builder.getTransactionId();
            this._transactionUri = builder.getTransactionUri();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public GroupRef getGroupRef() {
            return _groupRef;
        }
        
        @Override
        public Boolean isBarrier() {
            return _barrier;
        }
        
        @Override
        public Buckets getBuckets() {
            return _buckets;
        }
        
        @Override
        public String getContainerName() {
            return _containerName;
        }
        
        @Override
        public GroupId getGroupId() {
            return _groupId;
        }
        
        @Override
        public String getGroupName() {
            return _groupName;
        }
        
        @Override
        public GroupTypes getGroupType() {
            return _groupType;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public TransactionId getTransactionId() {
            return _transactionId;
        }
        
        @Override
        public Uri getTransactionUri() {
            return _transactionUri;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_groupRef == null) ? 0 : _groupRef.hashCode());
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
            result = prime * result + ((_buckets == null) ? 0 : _buckets.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
            result = prime * result + ((_groupName == null) ? 0 : _groupName.hashCode());
            result = prime * result + ((_groupType == null) ? 0 : _groupType.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_transactionId == null) ? 0 : _transactionId.hashCode());
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
            GroupUpdatedImpl other = (GroupUpdatedImpl) obj;
            if (_groupRef == null) {
                if (other._groupRef != null) {
                    return false;
                }
            } else if(!_groupRef.equals(other._groupRef)) {
                return false;
            }
            if (_barrier == null) {
                if (other._barrier != null) {
                    return false;
                }
            } else if(!_barrier.equals(other._barrier)) {
                return false;
            }
            if (_buckets == null) {
                if (other._buckets != null) {
                    return false;
                }
            } else if(!_buckets.equals(other._buckets)) {
                return false;
            }
            if (_containerName == null) {
                if (other._containerName != null) {
                    return false;
                }
            } else if(!_containerName.equals(other._containerName)) {
                return false;
            }
            if (_groupId == null) {
                if (other._groupId != null) {
                    return false;
                }
            } else if(!_groupId.equals(other._groupId)) {
                return false;
            }
            if (_groupName == null) {
                if (other._groupName != null) {
                    return false;
                }
            } else if(!_groupName.equals(other._groupName)) {
                return false;
            }
            if (_groupType == null) {
                if (other._groupType != null) {
                    return false;
                }
            } else if(!_groupType.equals(other._groupType)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_transactionId == null) {
                if (other._transactionId != null) {
                    return false;
                }
            } else if(!_transactionId.equals(other._transactionId)) {
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
            StringBuilder builder = new StringBuilder("GroupUpdated [");
            boolean first = true;
        
            if (_groupRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupRef=");
                builder.append(_groupRef);
             }
            if (_barrier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_barrier=");
                builder.append(_barrier);
             }
            if (_buckets != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_buckets=");
                builder.append(_buckets);
             }
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
             }
            if (_groupId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupId=");
                builder.append(_groupId);
             }
            if (_groupName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupName=");
                builder.append(_groupName);
             }
            if (_groupType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupType=");
                builder.append(_groupType);
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
            if (_transactionId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionId=");
                builder.append(_transactionId);
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
