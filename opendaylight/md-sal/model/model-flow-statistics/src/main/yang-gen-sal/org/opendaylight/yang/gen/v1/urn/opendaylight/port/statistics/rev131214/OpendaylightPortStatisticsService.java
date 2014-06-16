package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetAllNodeConnectorsStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetAllNodeConnectorsStatisticsInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.GetNodeConnectorStatisticsInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface OpendaylightPortStatisticsService
    extends
    RpcService
{




    /**
      Get statistics for all node connectors from the node
    **/
    Future<RpcResult<GetAllNodeConnectorsStatisticsOutput>> getAllNodeConnectorsStatistics(GetAllNodeConnectorsStatisticsInput input);
    
    /**
      Get statistics for given node connector from the node
    **/
    Future<RpcResult<GetNodeConnectorStatisticsOutput>> getNodeConnectorStatistics(GetNodeConnectorStatisticsInput input);

}

