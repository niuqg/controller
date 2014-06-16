package org.opendaylight.controller.sample.meterdemo.md;

/**
 * Copyright IBM Corporation, 2013.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.opendaylight.controller.md.sal.binding.util.TypeSafeDataReader;
import org.opendaylight.controller.md.sal.common.api.TransactionStatus;
import org.opendaylight.controller.md.sal.common.api.data.DataModification;
import org.opendaylight.controller.sal.binding.api.NotificationService;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ConsumerContext;
import org.opendaylight.controller.sal.binding.api.data.DataBrokerService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowCapableNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.Meter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.MeterBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.MeterKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.SalGroupListener;
//import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.NodeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterAdded;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.SalMeterListener;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterBandType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DropBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemark;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.band.type.band.type.DscpRemarkBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeadersBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeader;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.MeterBandHeaderBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.meter.band.headers.meter.band.header.MeterBandTypesBuilder;
import org.opendaylight.yangtools.concepts.Registration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier.InstanceIdentifierBuilder;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

public class OpenflowpluginMeterTestCommandConsumer implements CommandProvider, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(OpenflowpluginMeterTestCommandConsumer.class);
    private DataBrokerService dataBrokerService;
    private ConsumerContext pc;
    private final BundleContext ctx;
    private Meter testMeter;
    private Meter testMeter1;
    private Meter testMeter2;
    private Node testNode;
    private final String originalMeterName = "Foo";
    private final String updatedMeterName = "Bar";
    private final MeterEventListener meterEventListener = new MeterEventListener();
    private static NotificationService notificationService;
    private Registration<org.opendaylight.yangtools.yang.binding.NotificationListener> listener1Reg;
    
    public static final String NODE_ID =  "foo:node:1";

    public OpenflowpluginMeterTestCommandConsumer(BundleContext ctx) {
        this.ctx = ctx;
    }

    public void onSessionInitiated(ConsumerContext session) {
        pc = session;
        dataBrokerService = session.getSALService(DataBrokerService.class);
        ctx.registerService(CommandProvider.class.getName(), this, null);
        notificationService = session.getSALService(NotificationService.class);
        // For switch events
 //       listener1Reg = notificationService.registerNotificationListener(meterEventListener);

  //      createTestNode();
        createTestMeter(5, 1200);System.out.println("222");
    }
    
    public void _meternote(CommandInterpreter ci){
        if(listener1Reg==null) System.out.println("listener is null!!!");
        listener1Reg = notificationService.registerNotificationListener(meterEventListener);
    }
    public void close(){
        if(listener1Reg != null){
            try{
                listener1Reg.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
/*    private void createUserNode(String nodeRef) {
        NodeBuilder builder = new NodeBuilder();
        builder.setId(new NodeId(nodeRef));
        builder.setKey(new NodeKey(builder.getId()));
        testNode = builder.build();
    }

    private void createTestNode() {
        NodeBuilder builder = new NodeBuilder();
        builder.setId(new NodeId(NODE_ID));
        builder.setKey(new NodeKey(builder.getId()));
        testNode = builder.build();
    }*/

    private InstanceIdentifier<Node> nodeToInstanceId(Node node) {
        return InstanceIdentifier.builder(Nodes.class).child(Node.class, node.getKey()).toInstance();
    }

    final class MeterEventListener implements SalMeterListener {

        @Override
        public void onMeterAdded(MeterAdded notification) {
            LOG.info("Meter to be added.........................." + notification.toString());
            LOG.info("Meter  Xid........................." + notification.getTransactionId().getValue());
            LOG.info("-----------------------------------------------------------------------------------");
        }

        @Override
        public void onMeterRemoved(MeterRemoved notification) {
            LOG.info("Meter to be removed.........................." + notification.toString());
            LOG.info("Meter  Xid........................." + notification.getTransactionId().getValue());
            LOG.info("-----------------------------------------------------------------------------------");
        }

        @Override
        public void onMeterUpdated(MeterUpdated notification) {
            LOG.info("Meter to be updated.........................." + notification.toString());
            LOG.info("Meter  Xid........................." + notification.getTransactionId().getValue());
            LOG.info("-----------------------------------------------------------------------------------");
        }

    }

    private MeterBuilder createTestMeter(long burst, long rate) {
        // Sample data , committing to DataStore
        System.out.println("Comeing into createTestMeter");
        DataModification<InstanceIdentifier<?>, DataObject> modification = dataBrokerService.beginTransaction();

        long id = 1;
        MeterKey key = new MeterKey(new MeterId(id));
        MeterBuilder meter = new MeterBuilder();
        meter.setContainerName("abcd");
        meter.setKey(key);
        meter.setMeterId(new MeterId(9L));
        meter.setMeterName(originalMeterName);
        meter.setFlags(new MeterFlags(true, false, false, false));
        MeterBandHeadersBuilder bandHeaders = new MeterBandHeadersBuilder();
        List<MeterBandHeader> bandHdr = new ArrayList<MeterBandHeader>();
        MeterBandHeaderBuilder bandHeader = new MeterBandHeaderBuilder();
        bandHeader.setBandRate((long) 234);
        bandHeader.setBandBurstSize((long) 444);
        DropBuilder drop= new DropBuilder();

        drop.setDropBurstSize(burst);
        drop.setDropRate(rate);
        System.out.println("drop测试");
        DscpRemarkBuilder dscpRemark = new DscpRemarkBuilder();
        dscpRemark.setDscpRemarkBurstSize((long) 5);
        dscpRemark.setPercLevel((short) 1);
        dscpRemark.setDscpRemarkRate((long) 1200);

        bandHeader.setBandType(drop.build());
        MeterBandTypesBuilder bandTypes = new MeterBandTypesBuilder();
        MeterBandType bandType = new MeterBandType(true, false, false);
        bandTypes.setFlags(bandType);
        bandHeader.setMeterBandTypes(bandTypes.build());
        bandHeader.setBandId(new BandId(0L));
        bandHdr.add(bandHeader.build());
        bandHeaders.setMeterBandHeader(bandHdr);
        meter.setMeterBandHeaders(bandHeaders.build());

        testMeter = meter.build();
        return meter;
    }

    public void _printMeters(CommandInterpreter ci){
        InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = _builder.toInstance();
        InstanceIdentifier<Meter> path1 = InstanceIdentifier.builder(Nodes.class).child(Node.class, testNode.getKey())
                .augmentation(FlowCapableNode.class).child(Meter.class, new MeterKey(testMeter.getMeterId())).build();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(dataBrokerService);
        Meter meter=reader.<Meter>readOperationalData(path1);
        if(meter != null) System.out.println("##Meter:"+meter.getKey().toString());
        meter=reader.<Meter>readConfigurationData(path1);
        if(meter != null) System.out.println("$$Meter:"+meter.getKey().toString());
    }
    
    public void _removeMeter(CommandInterpreter ci) {
        String nref = ci.nextArgument();
        /*
        if (nref == null) {
            ci.println("test node added");
            createTestNode();
        } else {
            ci.println("User node added" + nref);
            createUserNode(nref);
        }*/
//        MeterBuilder mBuilder = createTestMeter();
        DataModification<InstanceIdentifier<?>, DataObject> modification = dataBrokerService.beginTransaction();
        InstanceIdentifier<Meter> path1 = InstanceIdentifier.builder(Nodes.class).child(Node.class, testNode.getKey())
                .augmentation(FlowCapableNode.class).child(Meter.class, new MeterKey(testMeter.getMeterId())).build();
        modification.removeConfigurationData(path1);
        modification.removeConfigurationData(nodeToInstanceId(testNode));
//        modification.removeOperationalData(path1);
        Future<RpcResult<TransactionStatus>> commitFuture = modification.commit();
        try {
            RpcResult<TransactionStatus> result = commitFuture.get();
            TransactionStatus status = result.getResult();
            ci.println("Status of Meter Data Loaded Transaction: " + status);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void _addMeter(CommandInterpreter ci) {
        String nref = ci.nextArgument();
        long burst=0, rate=0;
        if(nref != null) {
            Long lo=Long.decode(nref.trim());System.out.println(lo.longValue());
            burst=lo.longValue();
            nref=ci.nextArgument();
            if(nref!=null){System.out.println(nref);
                rate=Long.decode(nref).longValue();
            }
        }
/*        if (nref == null) {
            ci.println("test node added");
            createTestNode();
        } else {
            ci.println("User node added" + nref);
            createUserNode(nref);
        }*/
        System.out.println("!!!!!!!!!!!");
        InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = _builder.toInstance();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(dataBrokerService);
        Nodes nodes=reader.<Nodes>readOperationalData(nodesRef);
        List<Node> nodeList=nodes.getNode();
        boolean flag=false;
        for(Node node : nodeList){
            FlowCapableNode fcn = node.<FlowCapableNode>getAugmentation(FlowCapableNode.class);
            boolean notEquals = (!Objects.equal(fcn, null));
            if (notEquals) {
                testNode=node;
                System.out.println("得到一个节点："+node.getId().getValue());
                flag=true;
                break;
            }
        }System.out.println(testNode.getId());
        if(flag==false){
            System.out.println("没有得到可用节点");
            return;
        }System.out.println("@@@@"+testNode.getId());
        createTestMeter(burst, rate);System.out.println("333"+testNode.getId());
        writeMeter(ci, testMeter);System.out.println("444"+testNode.getId());
    }

    public void _printFNodes(CommandInterpreter ci){
        InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = _builder.toInstance();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(dataBrokerService);
        Nodes nodes=reader.<Nodes>readOperationalData(nodesRef);
        List<Node> nodeList=nodes.getNode();
        for(Node node : nodeList){
            FlowCapableNode fcn = node.<FlowCapableNode>getAugmentation(FlowCapableNode.class);
            boolean notEquals = (!Objects.equal(fcn, null));
            if (notEquals) {
                NodeKey key=node.getKey();
                NodeId id=node.getId();
                List<NodeConnector> ports=node.getNodeConnector();
                System.out.println("节点:"+id.getValue()+"\n"+key);
                for(NodeConnector port : ports){
                    System.out.println(port.getId().toString());
                }
            }
        }
    }
    public void _printNodes(CommandInterpreter ci){
        InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = _builder.toInstance();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(dataBrokerService);
        Nodes nodes=reader.<Nodes>readOperationalData(nodesRef);
        List<Node> nodeList=nodes.getNode();
        for(Node node : nodeList){
            FlowCapableNode fcn = node.<FlowCapableNode>getAugmentation(FlowCapableNode.class);
            boolean notEquals = (!Objects.equal(fcn, null));
            if (!notEquals) {
                NodeKey key=node.getKey();
                NodeId id=node.getId();
                List<NodeConnector> ports=node.getNodeConnector();
                System.out.println("节点:"+id.getValue()+"\n"+key);
                for(NodeConnector port : ports){
                    System.out.println(port.getId().toString());
                }
            }
        }
    }
    public void _printCNodes(CommandInterpreter ci){
        InstanceIdentifierBuilder<Nodes> _builder = InstanceIdentifier.<Nodes>builder(Nodes.class);
        final InstanceIdentifier<Nodes> nodesRef = _builder.toInstance();
        final TypeSafeDataReader reader = TypeSafeDataReader.forReader(dataBrokerService);
        Nodes nodes=reader.<Nodes>readConfigurationData(nodesRef);
        List<Node> nodeList=nodes.getNode();
        for(Node node : nodeList){
            FlowCapableNode fcn = node.<FlowCapableNode>getAugmentation(FlowCapableNode.class);
            boolean notEquals = (!Objects.equal(fcn, null));
            if (true) {
                NodeKey key=node.getKey();
                NodeId id=node.getId();
                List<NodeConnector> ports=node.getNodeConnector();
                System.out.println("节点:"+id.getValue()+"\n"+key);
                for(NodeConnector port : ports){
                    System.out.println(port.getId().toString());
                }
            }
        }
    }

    private void writeMeter(CommandInterpreter ci, Meter meter) {
        System.out.println("Comeing into writeMeter");
        DataModification<InstanceIdentifier<?>, DataObject> modification = dataBrokerService.beginTransaction();
        InstanceIdentifier<Meter> path1 = InstanceIdentifier.builder(Nodes.class).child(Node.class, testNode.getKey())
                .augmentation(FlowCapableNode.class).child(Meter.class, new MeterKey(meter.getMeterId())).build();
        DataObject cls = modification.readConfigurationData(path1);
//        if(testNode.getId().getValue()==NODE_ID) modification.putConfigurationData(nodeToInstanceId(testNode), testNode);
        modification.putConfigurationData(path1, meter);
        Future<RpcResult<TransactionStatus>> commitFuture = modification.commit();
        try {
            RpcResult<TransactionStatus> result = commitFuture.get();
            TransactionStatus status = result.getResult();
            ci.println("Status of Meter Data Loaded Transaction: " + status);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Leave from writeMeter");
    }

    public void _modifyMeter(CommandInterpreter ci) {
        String nref = ci.nextArgument();
/*
        if (nref == null) {
            ci.println("test node added");
            createTestNode();
        } else {
            ci.println("User node added" + nref);
            createUserNode(nref);
        }*/
        MeterBuilder meter = createTestMeter(5, 1200);
        meter.setMeterName(updatedMeterName);
        writeMeter(ci, meter.build());
        meter.setMeterName(originalMeterName);
        writeMeter(ci, meter.build());
    }


    @Override
    public String getHelp() {
        StringBuffer help = new StringBuffer();
        help.append("---FRM MD-SAL Group test module---\n");
        help.append("\t addMeter <node id>        - node ref\n");
        help.append("\t modifyMeter <node id>        - node ref\n");
        help.append("\t removeMeter <node id>        - node ref\n");

        return help.toString();
    }

}

