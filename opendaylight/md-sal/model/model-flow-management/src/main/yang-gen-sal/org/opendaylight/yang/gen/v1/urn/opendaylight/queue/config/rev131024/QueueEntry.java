package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueConfigRequest;
import org.opendaylight.yangtools.yang.common.QName;


public interface QueueEntry
    extends
    DataObject,
    QueueConfigRequest
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:config","2013-10-24","queue-entry")
    ;

    /**
    **/
    NodeConnectorRef getNode();

}

