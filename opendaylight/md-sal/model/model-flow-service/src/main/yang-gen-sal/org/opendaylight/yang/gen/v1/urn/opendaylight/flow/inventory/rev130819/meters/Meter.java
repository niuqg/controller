package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.MeterKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Meters;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Meter
    extends
    ChildOf<Meters>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.meters.Meter>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter,
    Identifiable<MeterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","meter")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    MeterKey getKey();

}

