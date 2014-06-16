package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.CommonQueue;
import org.opendaylight.yangtools.yang.common.QName;


public interface QueuePropMaxRate
    extends
    DataObject,
    CommonQueue
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types:queue","2013-09-25","queue-prop-max-rate")
    ;

    /**
      OFPQT_MAX, len: 16
    **/
    Integer getRate();

}

