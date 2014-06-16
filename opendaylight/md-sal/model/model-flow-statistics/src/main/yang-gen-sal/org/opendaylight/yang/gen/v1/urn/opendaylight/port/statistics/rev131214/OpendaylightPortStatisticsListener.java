package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.NodeConnectorStatisticsUpdate;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface OpendaylightPortStatisticsListener
    extends
    NotificationListener
{




    void onNodeConnectorStatisticsUpdate(NodeConnectorStatisticsUpdate notification);

}

