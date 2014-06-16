package org.opendaylight.controller.config.yang.md.sal.dom.impl;
public class Transactions {
    private org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;

    private java.lang.Long successful;

    private java.lang.Long created;

    private java.lang.Long failed;

    private java.lang.Long submitted;

    public Transactions () {
        super();
    }

    public void injectDependencyResolver(org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.dependencyResolver = dependencyResolver;
    }

    public java.lang.Long getSuccessful() {
        return successful;
    }

    public void setSuccessful(java.lang.Long successful) {
        this.successful = successful;
    }

    public java.lang.Long getCreated() {
        return created;
    }

    public void setCreated(java.lang.Long created) {
        this.created = created;
    }

    public java.lang.Long getFailed() {
        return failed;
    }

    public void setFailed(java.lang.Long failed) {
        this.failed = failed;
    }

    public java.lang.Long getSubmitted() {
        return submitted;
    }

    public void setSubmitted(java.lang.Long submitted) {
        this.submitted = submitted;
    }

}
