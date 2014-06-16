/*
* Generated file
*
* Generated from: yang module name: opendaylight-sal-binding-broker-impl yang module local name: binding-data-broker
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Mon Jun 16 12:25:01 CST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.md.sal.binding.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2013-10-28", name = "opendaylight-sal-binding-broker-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:md:sal:binding:impl")

public abstract class AbstractDataBrokerImplModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.md.sal.binding.impl.DataBrokerImplModuleMXBean,org.opendaylight.controller.config.yang.md.sal.binding.DataBrokerServiceServiceInterface,org.opendaylight.controller.config.yang.md.sal.binding.DataProviderServiceServiceInterface,org.opendaylight.controller.config.api.RuntimeBeanRegistratorAwareModule {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.md.sal.binding.impl.AbstractDataBrokerImplModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute domBrokerJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("DomBroker");
    private javax.management.ObjectName domBroker; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute mappingServiceJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("MappingService");
    private javax.management.ObjectName mappingService; // mandatory

    //attributes end

    private final AbstractDataBrokerImplModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    private final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractDataBrokerImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        ;this.oldModule=null;
    }

    public AbstractDataBrokerImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractDataBrokerImplModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    private org.opendaylight.controller.config.yang.md.sal.binding.impl.DataBrokerImplRuntimeRegistrator rootRuntimeBeanRegistratorWrapper;

    public org.opendaylight.controller.config.yang.md.sal.binding.impl.DataBrokerImplRuntimeRegistrator getRootRuntimeBeanRegistratorWrapper(){
        return rootRuntimeBeanRegistratorWrapper;
    }

    @Override
    public void setRuntimeBeanRegistrator(org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeRegistrator){
        this.rootRuntimeBeanRegistratorWrapper = new org.opendaylight.controller.config.yang.md.sal.binding.impl.DataBrokerImplRuntimeRegistrator(rootRuntimeRegistrator);
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.dom.BrokerServiceInterface.class, domBroker, domBrokerJmxAttribute);dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.impl.BindingIndependentMappingServiceServiceInterface.class, mappingService, mappingServiceJmxAttribute);
        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.sal.core.api.Broker domBrokerDependency;
    protected final org.opendaylight.controller.sal.core.api.Broker getDomBrokerDependency(){
        return domBrokerDependency;
    }private org.opendaylight.yangtools.yang.data.impl.codec.BindingIndependentMappingService mappingServiceDependency;
    protected final org.opendaylight.yangtools.yang.data.impl.codec.BindingIndependentMappingService getMappingServiceDependency(){
        return mappingServiceDependency;
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            domBrokerDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.core.api.Broker.class, domBroker, domBrokerJmxAttribute);mappingServiceDependency = dependencyResolver.resolveInstance(org.opendaylight.yangtools.yang.data.impl.codec.BindingIndependentMappingService.class, mappingService, mappingServiceJmxAttribute);if(oldInstance!=null && canReuseInstance(oldModule)) {
                instance = reuseInstance(oldInstance);
            } else {
                if(oldInstance!=null) {
                    try {
                        oldInstance.close();
                    } catch(Exception e) {
                        logger.error("An error occurred while closing old instance " + oldInstance, e);
                    }
                }
                instance = createInstance();
                if (instance == null) {
                    throw new IllegalStateException("Error in createInstance - null is not allowed as return value");
                }
            }
        }
        return instance;
    }
    public abstract java.lang.AutoCloseable createInstance();

    public boolean canReuseInstance(AbstractDataBrokerImplModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractDataBrokerImplModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (domBrokerDependency != other.domBrokerDependency) { // reference to dependency must be same
            return false;
        }
        if (mappingServiceDependency != other.mappingServiceDependency) { // reference to dependency must be same
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractDataBrokerImplModule that = (AbstractDataBrokerImplModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getDomBroker() {
        return domBroker;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.dom.BrokerServiceInterface.class)
    public void setDomBroker(javax.management.ObjectName domBroker) {
        this.domBroker = domBroker;
    }

    @Override
    public javax.management.ObjectName getMappingService() {
        return mappingService;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.impl.BindingIndependentMappingServiceServiceInterface.class)
    public void setMappingService(javax.management.ObjectName mappingService) {
        this.mappingService = mappingService;
    }

}
