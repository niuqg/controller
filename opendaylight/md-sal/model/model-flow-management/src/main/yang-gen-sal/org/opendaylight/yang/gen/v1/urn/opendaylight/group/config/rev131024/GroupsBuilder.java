package org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups.Group;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class GroupsBuilder {

    private List<Group> _group;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>> augmentation = new HashMap<>();

    public GroupsBuilder() {
    } 


    public List<Group> getGroup() {
        return _group;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupsBuilder setGroup(List<Group> value) {
    
        this._group = value;
        return this;
    }
    
    public GroupsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Groups build() {
        return new GroupsImpl(this);
    }

    private static final class GroupsImpl implements Groups {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups.class;
        }

        private final List<Group> _group;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>> augmentation;

        private GroupsImpl(GroupsBuilder builder) {
            this._group = builder.getGroup();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Group> getGroup() {
            return _group;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.Groups>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_group == null) ? 0 : _group.hashCode());
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
            GroupsImpl other = (GroupsImpl) obj;
            if (_group == null) {
                if (other._group != null) {
                    return false;
                }
            } else if(!_group.equals(other._group)) {
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
            StringBuilder builder = new StringBuilder("Groups [");
            boolean first = true;
        
            if (_group != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_group=");
                builder.append(_group);
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
