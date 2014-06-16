package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightInventoryListener
    extends
    NotificationListener
{




    void onNodeConnectorRemoved(NodeConnectorRemoved notification);
    
    void onNodeConnectorUpdated(NodeConnectorUpdated notification);
    
    void onNodeRemoved(NodeRemoved notification);
    
    void onNodeUpdated(NodeUpdated notification);

}

