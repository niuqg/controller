package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.RoutingTables;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class RpcRouterBuilder {

    private String _module;
    private RoutingTables _routingTables;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>> augmentation = new HashMap<>();

    public RpcRouterBuilder() {
    } 
    
    public RpcRouterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter arg) {
        this._module = arg.getModule();
        this._routingTables = arg.getRoutingTables();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter) {
            this._module = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter)arg).getModule();
            this._routingTables = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter)arg).getRoutingTables();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRouter] \n" +
              "but was: " + arg
            );
        }
    }

    public String getModule() {
        return _module;
    }
    
    public RoutingTables getRoutingTables() {
        return _routingTables;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RpcRouterBuilder setModule(String value) {
    
        this._module = value;
        return this;
    }
    
    public RpcRouterBuilder setRoutingTables(RoutingTables value) {
    
        this._routingTables = value;
        return this;
    }
    
    public RpcRouterBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RpcRouter build() {
        return new RpcRouterImpl(this);
    }

    private static final class RpcRouterImpl implements RpcRouter {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter.class;
        }

        private final String _module;
        private final RoutingTables _routingTables;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>> augmentation;

        private RpcRouterImpl(RpcRouterBuilder builder) {
            this._module = builder.getModule();
            this._routingTables = builder.getRoutingTables();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public String getModule() {
            return _module;
        }
        
        @Override
        public RoutingTables getRoutingTables() {
            return _routingTables;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.state.RpcRouter>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_module == null) ? 0 : _module.hashCode());
            result = prime * result + ((_routingTables == null) ? 0 : _routingTables.hashCode());
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
            RpcRouterImpl other = (RpcRouterImpl) obj;
            if (_module == null) {
                if (other._module != null) {
                    return false;
                }
            } else if(!_module.equals(other._module)) {
                return false;
            }
            if (_routingTables == null) {
                if (other._routingTables != null) {
                    return false;
                }
            } else if(!_routingTables.equals(other._routingTables)) {
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
            StringBuilder builder = new StringBuilder("RpcRouter [");
            boolean first = true;
        
            if (_module != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_module=");
                builder.append(_module);
             }
            if (_routingTables != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_routingTables=");
                builder.append(_routingTables);
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
