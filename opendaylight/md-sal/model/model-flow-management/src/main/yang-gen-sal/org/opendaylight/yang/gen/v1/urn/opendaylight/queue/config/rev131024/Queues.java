package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.queues.Queue;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.QueueManagementData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Queues
    extends
    ChildOf<QueueManagementData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.queue.config.rev131024.Queues>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:queue:config","2013-10-24","queues")
    ;

    List<Queue> getQueue();

}

