package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class RoutingTable {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.String routingContext;

    private java.util.List<org.opendaylight.controller.config.yang.md.sal.binding.impl.Routes> routes;

    public RoutingTable () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.String getRoutingContext() {
        return routingContext;
    }

    public void setRoutingContext(java.lang.String routingContext) {
        this.routingContext = routingContext;
    }

    public java.util.List<org.opendaylight.controller.config.yang.md.sal.binding.impl.Routes> getRoutes() {
        return routes;
    }

    public void setRoutes(java.util.List<org.opendaylight.controller.config.yang.md.sal.binding.impl.Routes> routes) {
        this.routes = routes;
    }

}
