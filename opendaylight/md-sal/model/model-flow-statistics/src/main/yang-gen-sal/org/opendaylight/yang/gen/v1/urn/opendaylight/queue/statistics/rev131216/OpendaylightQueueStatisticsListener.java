package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.QueueStatisticsUpdate;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightQueueStatisticsListener
    extends
    NotificationListener
{




    void onQueueStatisticsUpdate(QueueStatisticsUpdate notification);

}

