package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortReason;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.FlowCapablePort;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowPortStatus
    extends
    DataObject,
    FlowCapablePort
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","flow-port-status")
    ;

    /**
    **/
    PortReason getReason();

}

