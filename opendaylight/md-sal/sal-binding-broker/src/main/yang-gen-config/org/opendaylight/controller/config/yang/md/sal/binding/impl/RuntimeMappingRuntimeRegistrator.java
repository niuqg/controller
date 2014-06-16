package org.opendaylight.controller.config.yang.md.sal.binding.impl;
public class RuntimeMappingRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  RuntimeMappingRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.controller.config.yang.md.sal.binding.impl.RuntimeMappingRuntimeRegistration register(org.opendaylight.controller.config.yang.md.sal.binding.impl.RuntimeMappingRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.controller.config.yang.md.sal.binding.impl.RuntimeMappingRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}
