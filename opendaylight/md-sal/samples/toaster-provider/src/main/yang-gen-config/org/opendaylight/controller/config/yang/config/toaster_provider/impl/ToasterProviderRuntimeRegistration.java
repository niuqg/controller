package org.opendaylight.controller.config.yang.config.toaster_provider.impl;
public class ToasterProviderRuntimeRegistration implements java.io.Closeable {
    private final java.util.Map<java.lang.String,java.util.concurrent.atomic.AtomicInteger> unkeyedMap = new java.util.HashMap<java.lang.String,java.util.concurrent.atomic.AtomicInteger>();

    private final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration;

    @Override
    public void close() {
        registration.close();
    }

    public  ToasterProviderRuntimeRegistration(final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration) {
        this.registration=registration;

    }

}
