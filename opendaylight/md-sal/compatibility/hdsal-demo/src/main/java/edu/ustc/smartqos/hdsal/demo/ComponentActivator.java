
/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package edu.ustc.smartqos.hdsal.demo;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.apache.felix.dm.Component;
import org.apache.felix.dm.ServiceDependency;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.opendaylight.controller.clustering.services.IClusterGlobalServices;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.core.ComponentActivatorAbstractBase;
import org.opendaylight.controller.sal.core.Node.NodeIDType;
import org.opendaylight.controller.sal.core.NodeConnector.NodeConnectorIDType;
import org.opendaylight.controller.sal.discovery.IDiscoveryService;
import org.opendaylight.controller.sal.flowprogrammer.IPluginInFlowProgrammerService;
import org.opendaylight.controller.sal.flowprogrammer.IPluginOutFlowProgrammerService;
import org.opendaylight.controller.sal.inventory.IPluginInInventoryService;
import org.opendaylight.controller.sal.inventory.IPluginOutInventoryService;
import org.opendaylight.controller.sal.packet.IPluginInDataPacketService;
import org.opendaylight.controller.sal.packet.IPluginOutDataPacketService;
import org.opendaylight.controller.sal.reader.IPluginInReadService;
import org.opendaylight.controller.sal.reader.IPluginOutReadService;
import org.opendaylight.controller.sal.topology.IPluginInTopologyService;
import org.opendaylight.controller.sal.topology.IPluginOutTopologyService;
import org.opendaylight.controller.sal.utils.GlobalConstants;
import org.opendaylight.controller.sal.utils.INodeConnectorFactory;
import org.opendaylight.controller.sal.utils.INodeFactory;
import org.opendaylight.controller.statisticsmanager.IStatisticsManager;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//niu
@SuppressWarnings("all")
public class ComponentActivator extends ComponentActivatorAbstractBase {
    protected static final Logger logger = LoggerFactory
            .getLogger(ComponentActivator.class);

    private BundleContext context;
    
    private DemoManager _demo=new Function0<DemoManager>() {
        public DemoManager apply() {
            DemoManager _demoManager = new DemoManager();
            return _demoManager;
          }
        }.apply();

    public DemoManager getDemoManager(){
        return this._demo;
    }
    
    public void setDemoManager(final DemoManager demoManager){
        this._demo=demoManager;
    }
    
    public void start(final BundleContext context) {
        super.start(context);
        this.context = context;
    }

    public ProviderContext setBroker(final BindingAwareBroker broker) {
        HdsalDemoProvider _HdsalDemoProvider = new HdsalDemoProvider(this);
        ProviderContext _registerProvider = broker.registerProvider(_HdsalDemoProvider, this.context);
        return _registerProvider;
    }

    public Object[] getGlobalImplementations() {
        Object[] res = { ComponentActivator.class };
        res=((Object[])Conversions.unwrapArray(Arrays.<Object>asList(this), Object.class));
        return res;
    }

    public Object[] getImplementations() {
        Object[] res = { DemoManager.class };
        res=((Object[])Conversions.unwrapArray(Arrays.<Object>asList(_demo), Object.class));
        return res;
    }

    public void configureInstance(Component c, Object imp, String containerName) {
        if(imp instanceof DemoManager){ //imp.equals(DemoManager.class)
            c.add(createServiceDependency()
                    .setService(ISwitchManager.class)
                    .setCallbacks("setSwitchManager", "unsetSwitchManager")
                    .setRequired(true));
            c.add(createContainerServiceDependency(containerName).setService(IStatisticsManager.class)
                    .setCallbacks("setStatisticsManagerService", "unsetStatisticsManagerService").setRequired(true));
            c.add(createContainerServiceDependency(containerName).setService(ITopologyManager.class)
                    .setCallbacks("setTopologyManagerService", "unsetTopologyManagerService").setRequired(true));
        }
    }

    public void configureGlobalInstance(Component c, Object imp) {
        if (imp instanceof ComponentActivator) {
            c.add(createServiceDependency()
                .setService(BindingAwareBroker.class)
                .setCallbacks("setBroker", "unsetBroker")
                .setRequired(true));
        }
    }
}
