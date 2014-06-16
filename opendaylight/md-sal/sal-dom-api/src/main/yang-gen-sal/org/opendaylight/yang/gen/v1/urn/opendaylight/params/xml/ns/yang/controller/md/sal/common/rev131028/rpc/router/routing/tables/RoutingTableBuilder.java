package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.routing.table.Routes;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class RoutingTableBuilder {

    private List<Routes> _routes;
    private String _routingContext;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>> augmentation = new HashMap<>();

    public RoutingTableBuilder() {
    } 
    
    public RoutingTableBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRoutingTable arg) {
        this._routes = arg.getRoutes();
        this._routingContext = arg.getRoutingContext();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRoutingTable</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRoutingTable) {
            this._routes = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRoutingTable)arg).getRoutes();
            this._routingContext = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRoutingTable)arg).getRoutingContext();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.RpcRoutingTable] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Routes> getRoutes() {
        return _routes;
    }
    
    public String getRoutingContext() {
        return _routingContext;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public RoutingTableBuilder setRoutes(List<Routes> value) {
    
        this._routes = value;
        return this;
    }
    
    public RoutingTableBuilder setRoutingContext(String value) {
    
        this._routingContext = value;
        return this;
    }
    
    public RoutingTableBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public RoutingTable build() {
        return new RoutingTableImpl(this);
    }

    private static final class RoutingTableImpl implements RoutingTable {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable.class;
        }

        private final List<Routes> _routes;
        private final String _routingContext;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>> augmentation;

        private RoutingTableImpl(RoutingTableBuilder builder) {
            this._routes = builder.getRoutes();
            this._routingContext = builder.getRoutingContext();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Routes> getRoutes() {
            return _routes;
        }
        
        @Override
        public String getRoutingContext() {
            return _routingContext;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.rpc.router.routing.tables.RoutingTable>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_routes == null) ? 0 : _routes.hashCode());
            result = prime * result + ((_routingContext == null) ? 0 : _routingContext.hashCode());
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
            RoutingTableImpl other = (RoutingTableImpl) obj;
            if (_routes == null) {
                if (other._routes != null) {
                    return false;
                }
            } else if(!_routes.equals(other._routes)) {
                return false;
            }
            if (_routingContext == null) {
                if (other._routingContext != null) {
                    return false;
                }
            } else if(!_routingContext.equals(other._routingContext)) {
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
            StringBuilder builder = new StringBuilder("RoutingTable [");
            boolean first = true;
        
            if (_routes != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_routes=");
                builder.append(_routes);
             }
            if (_routingContext != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_routingContext=");
                builder.append(_routingContext);
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
