package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class Routes {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.String destination;

    private java.lang.String path;

    public Routes () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.String getDestination() {
        return destination;
    }

    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }

    public java.lang.String getPath() {
        return path;
    }

    public void setPath(java.lang.String path) {
        this.path = path;
    }

}
