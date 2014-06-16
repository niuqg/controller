/**
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package edu.ustc.smartqos.hdsal.demo;

import java.util.Collection;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ConsumerContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider.ProviderFunctionality;
import org.opendaylight.controller.sal.binding.api.NotificationService;
import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.controller.sal.binding.api.data.DataProviderService;
/*import org.opendaylight.controller.sal.compatibility.ComponentActivator;
import org.opendaylight.controller.sal.compatibility.DataPacketAdapter;
import org.opendaylight.controller.sal.compatibility.FlowProgrammerAdapter;
import org.opendaylight.controller.sal.compatibility.InventoryAndReadAdapter;
import org.opendaylight.controller.sal.compatibility.adsal.DataPacketServiceAdapter;
import org.opendaylight.controller.sal.compatibility.topology.TopologyAdapter;
import org.opendaylight.controller.sal.compatibility.topology.TopologyProvider;
*/
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SalFlowService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.OpendaylightFlowStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.OpendaylightFlowTableStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.FlowTopologyDiscoveryService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketProcessingService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.OpendaylightPortStatisticsService;
import org.opendaylight.yangtools.yang.binding.RpcService;

@SuppressWarnings("all")
class HdsalDemoProvider implements BindingAwareProvider {
  private final ComponentActivator activator;
  MeterStatus mStatus;
  public HdsalDemoProvider(final ComponentActivator cmpAct) {
    this.activator = cmpAct;
  }

  public Collection<? extends ProviderFunctionality> getFunctionality() {
    return null;
  }

  public Collection<? extends RpcService> getImplementations() {
    return null;
  }

  public void onSessionInitialized(final ConsumerContext session) {
  }

  public void onSessionInitiated(final ProviderContext session) {
      System.out.println("Coming into onSessionInitiated!!!");
    final ComponentActivator it = this.activator;
    final NotificationService subscribe = session.<NotificationService>getSALService(NotificationService.class);
    DataBrokerService dataService = session.getSALService(DataBrokerService.class);
    if(dataService!=null){
    	System.out.println("dataServie is  not  null++++++++");
    	mStatus=new MeterStatus(dataService);
    	mStatus.getMeterStas();
    }else{
    	System.out.println("dataserver is null-----------");
    }

  }
}
