package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.PortKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.CommonPort;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Port
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.Port>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.port.mod.port.Port>,
    CommonPort,
    Identifiable<PortKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port")
    ;

    /**
    **/
    Boolean isBarrier();
    
    /**
    **/
    String getContainerName();
    
    /**
      Bitmap of OFPPC-* flags to be changed
    **/
    PortConfig getMask();
    
    /**
    **/
    Long getPortModOrder();
    
    /**
    **/
    String getPortName();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    PortKey getKey();

}

