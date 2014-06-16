package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.group.update.OriginalGroup;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.group.update.UpdatedGroup;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class UpdateGroupInputBuilder {

    private GroupRef _groupRef;
    private Uri _transactionUri;
    private OriginalGroup _originalGroup;
    private UpdatedGroup _updatedGroup;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>> augmentation = new HashMap<>();

    public UpdateGroupInputBuilder() {
    } 
    
    public UpdateGroupInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata arg) {
        this._transactionUri = arg.getTransactionUri();
    }
    
    public UpdateGroupInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate arg) {
        this._originalGroup = arg.getOriginalGroup();
        this._updatedGroup = arg.getUpdatedGroup();
        this._node = arg.getNode();
    }
    
    public UpdateGroupInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate) {
            this._originalGroup = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate)arg).getOriginalGroup();
            this._updatedGroup = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate)arg).getUpdatedGroup();
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate, org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata] \n" +
              "but was: " + arg
            );
        }
    }

    public GroupRef getGroupRef() {
        return _groupRef;
    }
    
    public Uri getTransactionUri() {
        return _transactionUri;
    }
    
    public OriginalGroup getOriginalGroup() {
        return _originalGroup;
    }
    
    public UpdatedGroup getUpdatedGroup() {
        return _updatedGroup;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public UpdateGroupInputBuilder setGroupRef(GroupRef value) {
    
        this._groupRef = value;
        return this;
    }
    
    public UpdateGroupInputBuilder setTransactionUri(Uri value) {
    
        this._transactionUri = value;
        return this;
    }
    
    public UpdateGroupInputBuilder setOriginalGroup(OriginalGroup value) {
    
        this._originalGroup = value;
        return this;
    }
    
    public UpdateGroupInputBuilder setUpdatedGroup(UpdatedGroup value) {
    
        this._updatedGroup = value;
        return this;
    }
    
    public UpdateGroupInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public UpdateGroupInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public UpdateGroupInput build() {
        return new UpdateGroupInputImpl(this);
    }

    private static final class UpdateGroupInputImpl implements UpdateGroupInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput.class;
        }

        private final GroupRef _groupRef;
        private final Uri _transactionUri;
        private final OriginalGroup _originalGroup;
        private final UpdatedGroup _updatedGroup;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>> augmentation;

        private UpdateGroupInputImpl(UpdateGroupInputBuilder builder) {
            this._groupRef = builder.getGroupRef();
            this._transactionUri = builder.getTransactionUri();
            this._originalGroup = builder.getOriginalGroup();
            this._updatedGroup = builder.getUpdatedGroup();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>>singletonMap(e.getKey(), e.getValue());
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
        public Uri getTransactionUri() {
            return _transactionUri;
        }
        
        @Override
        public OriginalGroup getOriginalGroup() {
            return _originalGroup;
        }
        
        @Override
        public UpdatedGroup getUpdatedGroup() {
            return _updatedGroup;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_transactionUri == null) ? 0 : _transactionUri.hashCode());
            result = prime * result + ((_originalGroup == null) ? 0 : _originalGroup.hashCode());
            result = prime * result + ((_updatedGroup == null) ? 0 : _updatedGroup.hashCode());
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
            UpdateGroupInputImpl other = (UpdateGroupInputImpl) obj;
            if (_groupRef == null) {
                if (other._groupRef != null) {
                    return false;
                }
            } else if(!_groupRef.equals(other._groupRef)) {
                return false;
            }
            if (_transactionUri == null) {
                if (other._transactionUri != null) {
                    return false;
                }
            } else if(!_transactionUri.equals(other._transactionUri)) {
                return false;
            }
            if (_originalGroup == null) {
                if (other._originalGroup != null) {
                    return false;
                }
            } else if(!_originalGroup.equals(other._originalGroup)) {
                return false;
            }
            if (_updatedGroup == null) {
                if (other._updatedGroup != null) {
                    return false;
                }
            } else if(!_updatedGroup.equals(other._updatedGroup)) {
                return false;
            }
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
            StringBuilder builder = new StringBuilder("UpdateGroupInput [");
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
            if (_transactionUri != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_transactionUri=");
                builder.append(_transactionUri);
             }
            if (_originalGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_originalGroup=");
                builder.append(_originalGroup);
             }
            if (_updatedGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_updatedGroup=");
                builder.append(_updatedGroup);
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
