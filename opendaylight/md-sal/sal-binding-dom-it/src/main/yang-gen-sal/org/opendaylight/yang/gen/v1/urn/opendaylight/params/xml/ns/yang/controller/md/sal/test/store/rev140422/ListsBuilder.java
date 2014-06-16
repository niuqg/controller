package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.OrderedContainer;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnkeyedContainer;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.lists.UnorderedContainer;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class ListsBuilder {

    private OrderedContainer _orderedContainer;
    private UnkeyedContainer _unkeyedContainer;
    private UnorderedContainer _unorderedContainer;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> augmentation = new HashMap<>();

    public ListsBuilder() {
    } 


    public OrderedContainer getOrderedContainer() {
        return _orderedContainer;
    }
    
    public UnkeyedContainer getUnkeyedContainer() {
        return _unkeyedContainer;
    }
    
    public UnorderedContainer getUnorderedContainer() {
        return _unorderedContainer;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ListsBuilder setOrderedContainer(OrderedContainer value) {
    
        this._orderedContainer = value;
        return this;
    }
    
    public ListsBuilder setUnkeyedContainer(UnkeyedContainer value) {
    
        this._unkeyedContainer = value;
        return this;
    }
    
    public ListsBuilder setUnorderedContainer(UnorderedContainer value) {
    
        this._unorderedContainer = value;
        return this;
    }
    
    public ListsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Lists build() {
        return new ListsImpl(this);
    }

    private static final class ListsImpl implements Lists {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists.class;
        }

        private final OrderedContainer _orderedContainer;
        private final UnkeyedContainer _unkeyedContainer;
        private final UnorderedContainer _unorderedContainer;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> augmentation;

        private ListsImpl(ListsBuilder builder) {
            this._orderedContainer = builder.getOrderedContainer();
            this._unkeyedContainer = builder.getUnkeyedContainer();
            this._unorderedContainer = builder.getUnorderedContainer();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public OrderedContainer getOrderedContainer() {
            return _orderedContainer;
        }
        
        @Override
        public UnkeyedContainer getUnkeyedContainer() {
            return _unkeyedContainer;
        }
        
        @Override
        public UnorderedContainer getUnorderedContainer() {
            return _unorderedContainer;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.test.store.rev140422.Lists>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_orderedContainer == null) ? 0 : _orderedContainer.hashCode());
            result = prime * result + ((_unkeyedContainer == null) ? 0 : _unkeyedContainer.hashCode());
            result = prime * result + ((_unorderedContainer == null) ? 0 : _unorderedContainer.hashCode());
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
            ListsImpl other = (ListsImpl) obj;
            if (_orderedContainer == null) {
                if (other._orderedContainer != null) {
                    return false;
                }
            } else if(!_orderedContainer.equals(other._orderedContainer)) {
                return false;
            }
            if (_unkeyedContainer == null) {
                if (other._unkeyedContainer != null) {
                    return false;
                }
            } else if(!_unkeyedContainer.equals(other._unkeyedContainer)) {
                return false;
            }
            if (_unorderedContainer == null) {
                if (other._unorderedContainer != null) {
                    return false;
                }
            } else if(!_unorderedContainer.equals(other._unorderedContainer)) {
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
            StringBuilder builder = new StringBuilder("Lists [");
            boolean first = true;
        
            if (_orderedContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_orderedContainer=");
                builder.append(_orderedContainer);
             }
            if (_unkeyedContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_unkeyedContainer=");
                builder.append(_unkeyedContainer);
             }
            if (_unorderedContainer != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_unorderedContainer=");
                builder.append(_unorderedContainer);
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
