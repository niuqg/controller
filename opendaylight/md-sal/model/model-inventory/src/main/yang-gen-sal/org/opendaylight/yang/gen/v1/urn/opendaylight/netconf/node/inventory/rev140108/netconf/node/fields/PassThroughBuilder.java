package org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class PassThroughBuilder {


    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>> augmentation = new HashMap<>();

    public PassThroughBuilder() {
    } 


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public PassThroughBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PassThrough build() {
        return new PassThroughImpl(this);
    }

    private static final class PassThroughImpl implements PassThrough {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough.class;
        }


        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>> augmentation;

        private PassThroughImpl(PassThroughBuilder builder) {
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.netconf.node.inventory.rev140108.netconf.node.fields.PassThrough>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
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
            PassThroughImpl other = (PassThroughImpl) obj;
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
            StringBuilder builder = new StringBuilder("PassThrough [");
            boolean first = true;
        
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
