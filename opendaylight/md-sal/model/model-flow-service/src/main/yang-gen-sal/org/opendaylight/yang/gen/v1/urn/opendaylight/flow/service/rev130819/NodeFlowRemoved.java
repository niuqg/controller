package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowTableRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModRemoved;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeFlowRemoved
    extends
    DataObject,
    FlowModRemoved
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:service","2013-08-19","node-flow-removed")
    ;

    /**
    **/
    FlowTableRef getFlowTable();
    
    /**
    **/
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContext.class
    )
    NodeRef getNode();

}

