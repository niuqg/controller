package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterRef;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.NodeMeter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterAdded
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterAdded>,
    NodeMeter,
    TransactionAware,
    TransactionMetadata,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:service","2013-09-18","meter-added")
    ;

    /**
    **/
    MeterRef getMeterRef();

}

