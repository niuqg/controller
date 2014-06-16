package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class GroupRefBuilder {

    private org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef _groupRef;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>> augmentation = new HashMap<>();

    public GroupRefBuilder() {
    } 
    


    public org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef getGroupRef() {
        return _groupRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupRefBuilder setGroupRef(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef value) {
    
        this._groupRef = value;
        return this;
    }
    
    public GroupRefBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupRef build() {
        return new GroupRefImpl(this);
    }

    private static final class GroupRefImpl implements GroupRef {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef.class;
        }

        private final org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef _groupRef;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>> augmentation;

        private GroupRefImpl(GroupRefBuilder builder) {
            this._groupRef = builder.getGroupRef();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef getGroupRef() {
            return _groupRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.GroupRef>> E getAugmentation(Class<E> augmentationType) {
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
            GroupRefImpl other = (GroupRefImpl) obj;
            if (_groupRef == null) {
                if (other._groupRef != null) {
                    return false;
                }
            } else if(!_groupRef.equals(other._groupRef)) {
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
            StringBuilder builder = new StringBuilder("GroupRef [");
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
