package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class RoutingTables {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.util.List<org.opendaylight.controller.config.yang.md.sal.binding.impl.RoutingTable> routingTable;

    public RoutingTables () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.util.List<org.opendaylight.controller.config.yang.md.sal.binding.impl.RoutingTable> getRoutingTable() {
        return routingTable;
    }

    public void setRoutingTable(java.util.List<org.opendaylight.controller.config.yang.md.sal.binding.impl.RoutingTable> routingTable) {
        this.routingTable = routingTable;
    }

}
