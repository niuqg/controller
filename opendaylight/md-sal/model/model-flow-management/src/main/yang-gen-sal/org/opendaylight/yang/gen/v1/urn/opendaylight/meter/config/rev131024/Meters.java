package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.meters.Meter;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.MeterManagementData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Meters
    extends
    ChildOf<MeterManagementData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:config","2013-10-24","meters")
    ;

    List<Meter> getMeter();

}

