package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowAdded;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeExperimenterErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.SwitchFlowRemoved;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalFlowListener
    extends
    NotificationListener
{




    void onFlowAdded(FlowAdded notification);
    
    void onFlowRemoved(FlowRemoved notification);
    
    void onFlowUpdated(FlowUpdated notification);
    
    void onNodeErrorNotification(NodeErrorNotification notification);
    
    void onNodeExperimenterErrorNotification(NodeExperimenterErrorNotification notification);
    
    void onSwitchFlowRemoved(SwitchFlowRemoved notification);

}

