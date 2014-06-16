package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStatsKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class GroupStatsBuilder {

    private GroupId _groupId;
    private GroupStatsKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>> augmentation = new HashMap<>();

    public GroupStatsBuilder() {
    } 


    public GroupId getGroupId() {
        return _groupId;
    }
    
    public GroupStatsKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupStatsBuilder setGroupId(GroupId value) {
    
        this._groupId = value;
        return this;
    }
    
    public GroupStatsBuilder setKey(GroupStatsKey value) {
    
        this._key = value;
        return this;
    }
    
    public GroupStatsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupStats build() {
        return new GroupStatsImpl(this);
    }

    private static final class GroupStatsImpl implements GroupStats {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats.class;
        }

        private final GroupId _groupId;
        private final GroupStatsKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>> augmentation;

        private GroupStatsImpl(GroupStatsBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new GroupStatsKey(
                    builder.getGroupId()
                );
                this._groupId = builder.getGroupId();
            } else {
                this._key = builder.getKey();
                this._groupId = _key.getGroupId();
            }
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public GroupId getGroupId() {
            return _groupId;
        }
        
        @Override
        public GroupStatsKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.request.GroupStats>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            GroupStatsImpl other = (GroupStatsImpl) obj;
            if (_groupId == null) {
                if (other._groupId != null) {
                    return false;
                }
            } else if(!_groupId.equals(other._groupId)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
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
            StringBuilder builder = new StringBuilder("GroupStats [");
            boolean first = true;
        
            if (_groupId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupId=");
                builder.append(_groupId);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
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
