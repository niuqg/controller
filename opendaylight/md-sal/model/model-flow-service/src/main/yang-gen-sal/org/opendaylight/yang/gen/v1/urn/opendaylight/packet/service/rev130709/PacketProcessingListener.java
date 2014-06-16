package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface PacketProcessingListener
    extends
    NotificationListener
{




    void onPacketReceived(PacketReceived notification);

}

