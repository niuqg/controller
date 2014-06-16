package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.QueueKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueEntry;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Queue
    extends
    ChildOf<Queues>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue>,
    QueueEntry,
    Identifiable<QueueKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:config","2013-10-24","queue")
    ;

    /**
    **/
    Long getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    QueueKey getKey();

}

