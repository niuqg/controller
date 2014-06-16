package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class KitchenServiceImplBuilder {


    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>> augmentation = new HashMap<>();

    public KitchenServiceImplBuilder() {
    } 
    


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public KitchenServiceImplBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public KitchenServiceImpl build() {
        return new KitchenServiceImplImpl(this);
    }

    private static final class KitchenServiceImplImpl implements KitchenServiceImpl {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl.class;
        }


        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>> augmentation;

        private KitchenServiceImplImpl(KitchenServiceImplBuilder builder) {
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.modules.module.state.KitchenServiceImpl>> E getAugmentation(Class<E> augmentationType) {
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
            KitchenServiceImplImpl other = (KitchenServiceImplImpl) obj;
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
            StringBuilder builder = new StringBuilder("KitchenServiceImpl [");
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
