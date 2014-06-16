package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetAllGroupStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetAllGroupStatisticsInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupDescriptionOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupDescriptionInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupFeaturesOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupFeaturesInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GetGroupStatisticsInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface OpendaylightGroupStatisticsService
    extends
    RpcService
{




    Future<RpcResult<GetAllGroupStatisticsOutput>> getAllGroupStatistics(GetAllGroupStatisticsInput input);
    
    Future<RpcResult<GetGroupDescriptionOutput>> getGroupDescription(GetGroupDescriptionInput input);
    
    Future<RpcResult<GetGroupFeaturesOutput>> getGroupFeatures(GetGroupFeaturesInput input);
    
    Future<RpcResult<GetGroupStatisticsOutput>> getGroupStatistics(GetGroupStatisticsInput input);

}

