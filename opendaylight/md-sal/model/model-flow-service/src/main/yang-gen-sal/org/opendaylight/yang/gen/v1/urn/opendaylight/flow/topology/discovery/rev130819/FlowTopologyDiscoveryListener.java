package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkDiscovered;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkOverutilized;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819.LinkUtilizationNormal;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface FlowTopologyDiscoveryListener
    extends
    NotificationListener
{




    void onLinkDiscovered(LinkDiscovered notification);
    
    void onLinkOverutilized(LinkOverutilized notification);
    
    void onLinkRemoved(LinkRemoved notification);
    
    void onLinkUtilizationNormal(LinkUtilizationNormal notification);

}

