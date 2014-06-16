/*
 * Copyright IBM Corporation, 2013.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package edu.ustc.qos.statusmanager;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.opendaylight.controller.md.sal.binding.util.TypeSafeDataReader;
import org.opendaylight.controller.sal.binding.api.NotificationProviderService;
import org.opendaylight.controller.sal.binding.api.RpcConsumerRegistry;
import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.controller.sal.binding.api.data.DataChangeListener;
import org.opendaylight.controller.sal.binding.api.data.DataProviderService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.Meter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatisticsData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterStatisticsInputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.NodeMeterStatistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.OpendaylightMeterStatisticsService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.reply.MeterStats;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.opendaylight.yangtools.concepts.Registration;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.NotificationListener;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/**
 * Following are main responsibilities of the class: 1) Invoke statistics
 * request thread to send periodic statistics request to all the flow capable
 * switch connected to the controller. It sends statistics request for
 * Group,Meter,Table,Flow,Queue,Aggregate stats.
 * 
 * 2) Invoke statistics ager thread, to clean up all the stale statistics data
 * from operational data store.
 * 
 * @author avishnoi@in.ibm.com
 * 
 */
public class StatusProvider implements AutoCloseable {
    private static final Logger spLogger = LoggerFactory
            .getLogger(StatusProvider.class);

    private final DataProviderService dps;
    private NodeKey targetNodeKey;
    private InstanceIdentifier<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node> targetNodeIdentifier;
    private OpendaylightMeterStatisticsService meterStatsService;
    private NodeRef targetNodeRef;
    public DataBrokerService dataService;
    RpcResult<GetAllMeterStatisticsOutput> meterFuture;

    public StatusProvider(final DataProviderService dataService) {
        this.dps = Preconditions.checkNotNull(dataService);
    }

    private Registration<NotificationListener> listenerRegistration;

    private ListenerRegistration<DataChangeListener> flowCapableTrackerRegistration;

    public void start(final NotificationProviderService nps,
            final RpcConsumerRegistry rpcRegistry) {
        System.out.println("I am test*****************************");
        meterStatsService = rpcRegistry
                .getRpcService(OpendaylightMeterStatisticsService.class);
        List<Node> list = this.readAllMDNodes().getNode();
        if (list == null)
            System.out
                    .println("11111111111111111111----List<Node> is null------1111111111111111111111");

        for (Node node : list) {
            final FlowCapableNode dsFlowCapableNode = node
                    .<FlowCapableNode> getAugmentation(FlowCapableNode.class);
            boolean notEquals = (!Objects.equal(dsFlowCapableNode, null));
            if(dsFlowCapableNode!=null){
                if(dsFlowCapableNode.getMeter()!=null){
                    System.out.println("*******"+node.getId().getValue()+"*****.getMeter()**************");
                    System.out.println(dsFlowCapableNode.getMeter());
                    System.out.println("*************************************");
                }
                if(dsFlowCapableNode.getTable()!=null)
                    for(Table t:dsFlowCapableNode.getTable()){
                        System.out.println("******"+node.getId().getValue()+"*****.getTable()***************");
                        System.out.println(dsFlowCapableNode.getTable());
                        System.out.println("*************************************");
                    }
            }
            if (notEquals){
                System.out.println(dsFlowCapableNode.getDescription() + dsFlowCapableNode.getMeter());
                for(Meter m: dsFlowCapableNode.getMeter()){
                    NodeMeterStatistics tableStats = m.<NodeMeterStatistics>getAugmentation(NodeMeterStatistics.class);
                    System.out.println(tableStats);
                }
            }
        }
        final InstanceIdentifier<FlowCapableNode> fcnId = InstanceIdentifier
                .builder(Nodes.class).child(Node.class)
                .augmentation(FlowCapableNode.class).build();
        spLogger.debug("Registering FlowCapable tracker to {}", fcnId);

        spLogger.info("Status Provider started.");
    }

    public void setDataService(final DataBrokerService dataService) {
        this.dataService = dataService;
    }

    public DataBrokerService getDataService() {
        return this.dataService;
    }

    private Nodes readAllMDNodes() {
        InstanceIdentifierBuilder<Nodes> builder = InstanceIdentifier
                .<Nodes> builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = builder.toInstance();
        DataBrokerService data = this.getDataService();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(data);
        return reader.<Nodes> readOperationalData(nodesRef);
    }
    private NodeMeterStatistics readMeterStats(){
        return null;
    }
    @Override
    public void close() {
        try {
            if (this.listenerRegistration != null) {
                this.listenerRegistration.close();
                this.listenerRegistration = null;
            }
            if (this.flowCapableTrackerRegistration != null) {
                this.flowCapableTrackerRegistration.close();
                this.flowCapableTrackerRegistration = null;
            }
        } catch (Exception e) {
            spLogger.warn("Failed to stop Statistics Provider completely", e);
        } finally {
            spLogger.info("Statistics Provider stopped.");
        }
    }

}
