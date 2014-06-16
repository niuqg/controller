package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDescStatsUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupStatisticsUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightGroupStatisticsListener
    extends
    NotificationListener
{




    void onGroupDescStatsUpdated(GroupDescStatsUpdated notification);
    
    void onGroupFeaturesUpdated(GroupFeaturesUpdated notification);
    
    void onGroupStatisticsUpdated(GroupStatisticsUpdated notification);

}

