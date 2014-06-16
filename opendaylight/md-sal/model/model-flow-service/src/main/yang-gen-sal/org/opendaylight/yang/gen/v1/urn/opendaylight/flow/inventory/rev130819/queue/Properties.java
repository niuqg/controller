package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.queue;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Queue;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Properties
    extends
    ChildOf<Queue>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.queue.Properties>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","properties")
    ;

    /**
    **/
    Long getMaximumRate();
    
    /**
    **/
    Long getMinimumRate();

}

