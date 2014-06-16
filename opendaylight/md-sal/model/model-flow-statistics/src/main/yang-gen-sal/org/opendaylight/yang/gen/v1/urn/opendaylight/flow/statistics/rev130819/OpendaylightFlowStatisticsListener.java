package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatisticsUpdate;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowsStatisticsUpdate;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightFlowStatisticsListener
    extends
    NotificationListener
{




    /**
      Aggregate flow statistics for a table, sent by switch
    **/
    void onAggregateFlowStatisticsUpdate(AggregateFlowStatisticsUpdate notification);
    
    /**
      Flows statistics sent by switch
    **/
    void onFlowsStatisticsUpdate(FlowsStatisticsUpdate notification);

}

