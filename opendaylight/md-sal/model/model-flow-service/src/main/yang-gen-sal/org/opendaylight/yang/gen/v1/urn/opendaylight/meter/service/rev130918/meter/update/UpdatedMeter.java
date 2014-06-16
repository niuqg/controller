package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.MeterUpdate;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter;
import org.opendaylight.yangtools.yang.common.QName;


public interface UpdatedMeter
    extends
    ChildOf<MeterUpdate>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.UpdatedMeter>,
    Meter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:service","2013-09-18","updated-meter")
    ;


}

