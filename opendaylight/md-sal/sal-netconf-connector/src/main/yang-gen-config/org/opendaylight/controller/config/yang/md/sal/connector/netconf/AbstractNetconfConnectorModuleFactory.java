/*
* Generated file
*
* Generated from: yang module name: odl-sal-netconf-connector-cfg yang module local name: sal-netconf-connector
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Mon Jun 16 12:25:13 CST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.md.sal.connector.netconf;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-10-28", name = "odl-sal-netconf-connector-cfg", namespace = "urn:opendaylight:params:xml:ns:yang:controller:md:sal:connector:netconf")

public abstract class AbstractNetconfConnectorModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "sal-netconf-connector";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs2 = new java.util.HashSet<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>>();
        serviceIfcs = java.util.Collections.unmodifiableSet(serviceIfcs2);
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule oldModule = null;
        try {
            oldModule = (org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(old);
        }
        org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);
        module.setPort(oldModule.getPort());
        module.setWorkerThreadGroup(oldModule.getWorkerThreadGroup());
        module.setConnectionTimeoutMillis(oldModule.getConnectionTimeoutMillis());
        module.setBetweenAttemptsTimeoutMillis(oldModule.getBetweenAttemptsTimeoutMillis());
        module.setBossThreadGroup(oldModule.getBossThreadGroup());
        module.setPassword(oldModule.getPassword());
        module.setDomRegistry(oldModule.getDomRegistry());
        module.setClientDispatcher(oldModule.getClientDispatcher());
        module.setUsername(oldModule.getUsername());
        module.setAddress(oldModule.getAddress());
        module.setTcpOnly(oldModule.getTcpOnly());
        module.setMaxConnectionAttempts(oldModule.getMaxConnectionAttempts());
        module.setEventExecutor(oldModule.getEventExecutor());

        return module;
    }

    public org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<org.opendaylight.controller.config.yang.md.sal.connector.netconf.NetconfConnectorModule>();
    }

}
