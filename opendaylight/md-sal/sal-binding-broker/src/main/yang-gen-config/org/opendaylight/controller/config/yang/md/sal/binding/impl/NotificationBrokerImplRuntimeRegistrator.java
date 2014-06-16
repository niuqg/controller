package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class NotificationBrokerImplRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  NotificationBrokerImplRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.controller.config.yang.md.sal.binding.impl.NotificationBrokerImplRuntimeRegistration register(org.opendaylight.controller.config.yang.md.sal.binding.impl.NotificationBrokerImplRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.controller.config.yang.md.sal.binding.impl.NotificationBrokerImplRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}
