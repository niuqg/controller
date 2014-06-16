package org.opendaylight.controller.config.yang.md.sal.dom.impl;
public class SchemaServiceImplSingletonRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  SchemaServiceImplSingletonRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.controller.config.yang.md.sal.dom.impl.SchemaServiceImplSingletonRuntimeRegistration register(org.opendaylight.controller.config.yang.md.sal.dom.impl.SchemaServiceImplSingletonRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.controller.config.yang.md.sal.dom.impl.SchemaServiceImplSingletonRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}
