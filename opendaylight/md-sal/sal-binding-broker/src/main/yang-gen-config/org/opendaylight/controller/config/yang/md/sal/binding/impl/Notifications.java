package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class Notifications {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Long published;

    public Notifications () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Long getPublished() {
        return published;
    }

    public void setPublished(java.lang.Long published) {
        this.published = published;
    }

}
