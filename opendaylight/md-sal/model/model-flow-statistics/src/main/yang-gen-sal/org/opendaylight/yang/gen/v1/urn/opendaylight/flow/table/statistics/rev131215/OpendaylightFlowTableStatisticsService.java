package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.GetFlowTablesStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.GetFlowTablesStatisticsInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface OpendaylightFlowTableStatisticsService
    extends
    RpcService
{




    /**
      Fetch statistics of all the flow tables present on the tarnet node
    **/
    Future<RpcResult<GetFlowTablesStatisticsOutput>> getFlowTablesStatistics(GetFlowTablesStatisticsInput input);

}

