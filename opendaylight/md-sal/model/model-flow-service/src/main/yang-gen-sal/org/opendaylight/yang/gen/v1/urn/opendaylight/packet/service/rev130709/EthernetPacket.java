package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface EthernetPacket
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:packet:service","2013-07-09","ethernet-packet")
    ;

    /**
    **/
    MacAddress getDestination();
    
    /**
    **/
    MacAddress getSource();

}

