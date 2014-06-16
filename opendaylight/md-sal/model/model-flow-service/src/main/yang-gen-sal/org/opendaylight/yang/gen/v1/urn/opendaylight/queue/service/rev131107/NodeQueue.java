package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface NodeQueue
    extends
    DataObject,
    QueuePacket,
    NodeContextRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:service","2013-11-07","node-queue")
    ;


}

