package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.queue.id.and.statistics.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.queue.id.and.statistics.map.QueueIdAndStatisticsMapKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericQueueStatistics;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface QueueIdAndStatisticsMap
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.QueueIdAndStatisticsMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.queue.id.and.statistics.map.QueueIdAndStatisticsMap>,
    GenericQueueStatistics,
    Identifiable<QueueIdAndStatisticsMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:statistics","2013-12-16","queue-id-and-statistics-map")
    ;

    /**
    **/
    NodeConnectorId getNodeConnectorId();
    
    /**
    **/
    QueueId getQueueId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    QueueIdAndStatisticsMapKey getKey();

}

