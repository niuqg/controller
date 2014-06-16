package org.opendaylight.controller.config.yang.md.sal.dom.impl;
public class DomBrokerImplRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  DomBrokerImplRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.controller.config.yang.md.sal.dom.impl.DomBrokerImplRuntimeRegistration register(org.opendaylight.controller.config.yang.md.sal.dom.impl.DomBrokerImplRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.controller.config.yang.md.sal.dom.impl.DomBrokerImplRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}
