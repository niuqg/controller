package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.QueueGetConfigReply;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalQueueListener
    extends
    NotificationListener
{




    void onQueueGetConfigReply(QueueGetConfigReply notification);

}

