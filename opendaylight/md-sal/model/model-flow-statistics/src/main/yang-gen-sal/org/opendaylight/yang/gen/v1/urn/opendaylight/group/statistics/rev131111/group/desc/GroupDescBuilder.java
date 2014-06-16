package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.Buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupTypes;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GroupDescBuilder {

    private Boolean _barrier;
    private Buckets _buckets;
    private String _containerName;
    private GroupId _groupId;
    private String _groupName;
    private GroupTypes _groupType;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>> augmentation = new HashMap<>();

    public GroupDescBuilder() {
    } 
    
    public GroupDescBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group arg) {
        this._barrier = arg.isBarrier();
        this._buckets = arg.getBuckets();
        this._containerName = arg.getContainerName();
        this._groupId = arg.getGroupId();
        this._groupName = arg.getGroupName();
        this._groupType = arg.getGroupType();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group</li>
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group] \n" +
              "but was: " + arg
            );
        }
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupDescBuilder setBarrier(Boolean value) {
    
        this._barrier = value;
        return this;
    }
    
    public GroupDescBuilder setBuckets(Buckets value) {
    
        this._buckets = value;
        return this;
    }
    
    public GroupDescBuilder setContainerName(String value) {
    
        this._containerName = value;
        return this;
    }
    
    public GroupDescBuilder setGroupId(GroupId value) {
    
        this._groupId = value;
        return this;
    }
    
    public GroupDescBuilder setGroupName(String value) {
    
        this._groupName = value;
        return this;
    }
    
    public GroupDescBuilder setGroupType(GroupTypes value) {
    
        this._groupType = value;
        return this;
    }
    
    public GroupDescBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupDesc build() {
        return new GroupDescImpl(this);
    }

    private static final class GroupDescImpl implements GroupDesc {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc.class;
        }

        private final Boolean _barrier;
        private final Buckets _buckets;
        private final String _containerName;
        private final GroupId _groupId;
        private final String _groupName;
        private final GroupTypes _groupType;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>> augmentation;

        private GroupDescImpl(GroupDescBuilder builder) {
            this._barrier = builder.isBarrier();
            this._buckets = builder.getBuckets();
            this._containerName = builder.getContainerName();
            this._groupId = builder.getGroupId();
            this._groupName = builder.getGroupName();
            this._groupType = builder.getGroupType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
            result = prime * result + ((_buckets == null) ? 0 : _buckets.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
            result = prime * result + ((_groupName == null) ? 0 : _groupName.hashCode());
            result = prime * result + ((_groupType == null) ? 0 : _groupType.hashCode());
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
            GroupDescImpl other = (GroupDescImpl) obj;
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
            StringBuilder builder = new StringBuilder("GroupDesc [");
            boolean first = true;
        
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
