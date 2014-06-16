package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface QueueIdAndStatisticsMap
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:statistics","2013-12-16","queue-id-and-statistics-map")
    ;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.queue.id.and.statistics.map.QueueIdAndStatisticsMap> getQueueIdAndStatisticsMap();

}

