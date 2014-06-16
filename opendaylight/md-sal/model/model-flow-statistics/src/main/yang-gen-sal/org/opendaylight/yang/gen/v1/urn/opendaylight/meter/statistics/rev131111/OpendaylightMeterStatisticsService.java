package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterConfigStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterConfigStatisticsInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetAllMeterStatisticsInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetMeterFeaturesOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetMeterFeaturesInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetMeterStatisticsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.GetMeterStatisticsInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface OpendaylightMeterStatisticsService
    extends
    RpcService
{




    Future<RpcResult<GetAllMeterConfigStatisticsOutput>> getAllMeterConfigStatistics(GetAllMeterConfigStatisticsInput input);
    
    Future<RpcResult<GetAllMeterStatisticsOutput>> getAllMeterStatistics(GetAllMeterStatisticsInput input);
    
    Future<RpcResult<GetMeterFeaturesOutput>> getMeterFeatures(GetMeterFeaturesInput input);
    
    Future<RpcResult<GetMeterStatisticsOutput>> getMeterStatistics(GetMeterStatisticsInput input);

}

