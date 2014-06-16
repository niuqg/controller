package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.QueueIdAndStatisticsMap;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface QueueStatisticsUpdate
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.QueueStatisticsUpdate>,
    Node,
    MultipartTransactionAware,
    QueueIdAndStatisticsMap,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:statistics","2013-12-16","queue-statistics-update")
    ;


}

