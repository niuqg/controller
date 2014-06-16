package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.ConnectionCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface TransmitPacketInput
    extends
    ActionList,
    RawPacket,
    NodeContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:service","2013-07-09","input")
    ;

    /**
    **/
    Long getBufferId();
    
    /**
    **/
    ConnectionCookie getConnectionCookie();
    
    /**
    **/
    NodeConnectorRef getEgress();

}

