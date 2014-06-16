package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStatsKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatsConfigRequest;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterStats
    extends
    ChildOf<MeterStatsConfigRequest>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats>,
    Identifiable<MeterStatsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-stats")
    ;

    /**
    **/
    MeterId getMeterId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    MeterStatsKey getKey();

}

