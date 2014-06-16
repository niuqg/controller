package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableStatisticsUpdate;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightFlowTableStatisticsListener
    extends
    NotificationListener
{




    /**
      Receive flow table statistics update
    **/
    void onFlowTableStatisticsUpdate(FlowTableStatisticsUpdate notification);

}

