package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.queue.Properties;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface Queue
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","queue")
    ;

    Properties getProperties();
    
    /**
      id for the specific queue
    **/
    Long getQueueId();

}

