package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterConfigStatsUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterFeaturesUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.MeterStatisticsUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightMeterStatisticsListener
    extends
    NotificationListener
{




    void onMeterConfigStatsUpdated(MeterConfigStatsUpdated notification);
    
    void onMeterFeaturesUpdated(MeterFeaturesUpdated notification);
    
    void onMeterStatisticsUpdated(MeterStatisticsUpdated notification);

}

