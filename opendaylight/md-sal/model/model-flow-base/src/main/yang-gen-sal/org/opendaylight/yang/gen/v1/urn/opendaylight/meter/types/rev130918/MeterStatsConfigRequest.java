package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.stats.config.request.MeterStats;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterStatsConfigRequest
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-stats-config-request")
    ;

    List<MeterStats> getMeterStats();

}

