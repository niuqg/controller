package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface GetQueueStatisticsFromGivenPortInput
    extends
    NodeContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetQueueStatisticsFromGivenPortInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:statistics","2013-12-16","input")
    ;

    /**
    **/
    NodeConnectorId getNodeConnectorId();
    
    /**
    **/
    QueueId getQueueId();

}

