package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterBandStats
    extends
    ChildOf<MeterStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStats>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-band-stats")
    ;

    List<BandStat> getBandStat();

}

