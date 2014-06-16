package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface PortState
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","port-state")
    ;

    /**
    **/
    Boolean isBlocked();
    
    /**
    **/
    Boolean isLinkDown();
    
    /**
    **/
    Boolean isLive();

}

