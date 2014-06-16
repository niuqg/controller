package org.opendaylight.controller.config.yang.config.toaster_provider.impl;
public class ToasterProviderRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  ToasterProviderRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.controller.config.yang.config.toaster_provider.impl.ToasterProviderRuntimeRegistration register(org.opendaylight.controller.config.yang.config.toaster_provider.impl.ToasterProviderRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.controller.config.yang.config.toaster_provider.impl.ToasterProviderRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}
