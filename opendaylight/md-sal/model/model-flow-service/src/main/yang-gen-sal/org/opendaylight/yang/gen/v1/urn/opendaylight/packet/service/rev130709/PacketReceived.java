package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.ConnectionCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.packet.received.Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.RawPacket;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface PacketReceived
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived>,
    RawPacket,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:service","2013-07-09","packet-received")
    ;

    /**
    **/
    ConnectionCookie getConnectionCookie();
    
    /**
    **/
    FlowCookie getFlowCookie();
    
    Match getMatch();
    
    /**
    **/
    Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketInReason> getPacketInReason();
    
    /**
    **/
    TableId getTableId();

}

