package org.opendaylight.controller.config.yang.config.kitchen_service.impl;
public class KitchenServiceRuntimeRegistrator implements java.io.Closeable {
    private final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator;

    public  KitchenServiceRuntimeRegistrator(final org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeBeanRegistrator) {
        this.rootRuntimeBeanRegistrator=rootRuntimeBeanRegistrator;

    }

    public org.opendaylight.controller.config.yang.config.kitchen_service.impl.KitchenServiceRuntimeRegistration register(org.opendaylight.controller.config.yang.config.kitchen_service.impl.KitchenServiceRuntimeMXBean rb) {
        org.opendaylight.controller.config.api.runtime.HierarchicalRuntimeBeanRegistration registration = this.rootRuntimeBeanRegistrator.registerRoot(rb);
        return new org.opendaylight.controller.config.yang.config.kitchen_service.impl.KitchenServiceRuntimeRegistration(registration);

    }

    @Override
    public void close() {
        rootRuntimeBeanRegistrator.close();
    }

}
