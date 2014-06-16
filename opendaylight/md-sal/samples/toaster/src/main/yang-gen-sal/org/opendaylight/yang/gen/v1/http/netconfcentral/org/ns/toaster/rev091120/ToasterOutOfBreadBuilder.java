package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class ToasterOutOfBreadBuilder {


    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>> augmentation = new HashMap<>();

    public ToasterOutOfBreadBuilder() {
    } 


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public ToasterOutOfBreadBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public ToasterOutOfBread build() {
        return new ToasterOutOfBreadImpl(this);
    }

    private static final class ToasterOutOfBreadImpl implements ToasterOutOfBread {

        public Class<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread.class;
        }


        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>> augmentation;

        private ToasterOutOfBreadImpl(ToasterOutOfBreadBuilder builder) {
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>>, Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBread>> E getAugmentation(Class<E> augmentationType) {
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
            ToasterOutOfBreadImpl other = (ToasterOutOfBreadImpl) obj;
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
            StringBuilder builder = new StringBuilder("ToasterOutOfBread [");
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
