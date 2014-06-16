package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.QueueKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.Queues;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueuePacket;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Queue
    extends
    ChildOf<Queues>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue>,
    QueuePacket,
    Identifiable<QueueKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:port","2013-09-25","queue")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    QueueKey getKey();

}

