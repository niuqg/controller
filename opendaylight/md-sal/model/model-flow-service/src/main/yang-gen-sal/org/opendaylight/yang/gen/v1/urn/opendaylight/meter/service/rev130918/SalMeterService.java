package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.AddMeterOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.AddMeterInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.RemoveMeterInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.UpdateMeterInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface SalMeterService
    extends
    RpcService
{




    Future<RpcResult<AddMeterOutput>> addMeter(AddMeterInput input);
    
    Future<RpcResult<RemoveMeterOutput>> removeMeter(RemoveMeterInput input);
    
    Future<RpcResult<UpdateMeterOutput>> updateMeter(UpdateMeterInput input);

}

