package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.OriginalPort;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.port.update.UpdatedPort;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface PortUpdate
    extends
    DataObject,
    NodeContextRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:service","2013-11-07","port-update")
    ;

    OriginalPort getOriginalPort();
    
    UpdatedPort getUpdatedPort();

}

