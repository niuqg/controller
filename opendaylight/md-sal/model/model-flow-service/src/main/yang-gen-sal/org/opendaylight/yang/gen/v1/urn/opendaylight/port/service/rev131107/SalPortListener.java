package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalPortListener
    extends
    NotificationListener
{




    void onPortRemoved(PortRemoved notification);
    
    void onPortUpdated(PortUpdated notification);

}

