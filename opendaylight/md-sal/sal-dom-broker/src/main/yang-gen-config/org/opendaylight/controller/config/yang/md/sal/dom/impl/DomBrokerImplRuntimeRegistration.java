package org.opendaylight.controller.config.yang.md.sal.dom.impl;
public class DomBrokerImplRuntimeRegistration implements java.io.Closeable {
    private final java.util.Map<java.lang.String,java.util.concurrent.atomic.AtomicInteger> unkeyedMap = new java.util.HashMap<java.lang.String,java.util.concurrent.atomic.AtomicInteger>();

    private final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration;

    @Override
    public void close() {
        registration.close();
    }

    public  DomBrokerImplRuntimeRegistration(final org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration) {
        this.registration=registration;

    }

}
