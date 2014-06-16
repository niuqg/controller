package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.meters;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.meters.MeterKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.Meters;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.MeterEntry;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Meter
    extends
    ChildOf<Meters>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.config.rev131024.meters.Meter>,
    MeterEntry,
    Identifiable<MeterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:config","2013-10-24","meter")
    ;

    /**
    **/
    Long getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    MeterKey getKey();

}

