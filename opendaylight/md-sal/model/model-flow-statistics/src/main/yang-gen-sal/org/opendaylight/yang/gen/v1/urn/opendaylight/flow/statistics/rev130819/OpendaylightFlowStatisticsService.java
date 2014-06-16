package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForAllFlowsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForAllFlowsInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAggregateFlowStatisticsFromFlowTableForGivenMatchInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowsStatisticsFromAllFlowTablesInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetFlowStatisticsFromFlowTableOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetFlowStatisticsFromFlowTableInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface OpendaylightFlowStatisticsService
    extends
    RpcService
{




    /**
      Fetch aggregate statistics for all the flows present in the specific flow table of the switch
    **/
    Future<RpcResult<GetAggregateFlowStatisticsFromFlowTableForAllFlowsOutput>> getAggregateFlowStatisticsFromFlowTableForAllFlows(GetAggregateFlowStatisticsFromFlowTableForAllFlowsInput input);
    
    /**
      Fetch aggregate statistics for all the flow matches to the given match from the given table of the switch
    **/
    Future<RpcResult<GetAggregateFlowStatisticsFromFlowTableForGivenMatchOutput>> getAggregateFlowStatisticsFromFlowTableForGivenMatch(GetAggregateFlowStatisticsFromFlowTableForGivenMatchInput input);
    
    /**
      Fetch statistics of all the flow present in the specific flow table of the switch
    **/
    Future<RpcResult<GetAllFlowStatisticsFromFlowTableOutput>> getAllFlowStatisticsFromFlowTable(GetAllFlowStatisticsFromFlowTableInput input);
    
    /**
      Fetch statistics of all the flow present in all the flow tables of the switch
    **/
    Future<RpcResult<GetAllFlowsStatisticsFromAllFlowTablesOutput>> getAllFlowsStatisticsFromAllFlowTables(GetAllFlowsStatisticsFromAllFlowTablesInput input);
    
    /**
      Fetch statistics of the specific flow present in the specific flow table of the switch
    **/
    Future<RpcResult<GetFlowStatisticsFromFlowTableOutput>> getFlowStatisticsFromFlowTable(GetFlowStatisticsFromFlowTableInput input);

}

