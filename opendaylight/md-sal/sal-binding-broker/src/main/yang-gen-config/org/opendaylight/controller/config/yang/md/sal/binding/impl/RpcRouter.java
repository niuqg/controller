package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class RpcRouter {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private org.opendaylight.controller.config.yang.md.sal.binding.impl.RoutingTables routingTables;

    private java.lang.String module;

    public RpcRouter () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public org.opendaylight.controller.config.yang.md.sal.binding.impl.RoutingTables getRoutingTables() {
        return routingTables;
    }

    public void setRoutingTables(org.opendaylight.controller.config.yang.md.sal.binding.impl.RoutingTables routingTables) {
        this.routingTables = routingTables;
    }

    public java.lang.String getModule() {
        return module;
    }

    public void setModule(java.lang.String module) {
        this.module = module;
    }

}
