package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.AddFlowOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.AddFlowInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.RemoveFlowOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.RemoveFlowInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.UpdateFlowInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface SalFlowService
    extends
    RpcService
{




    Future<RpcResult<AddFlowOutput>> addFlow(AddFlowInput input);
    
    Future<RpcResult<RemoveFlowOutput>> removeFlow(RemoveFlowInput input);
    
    Future<RpcResult<UpdateFlowOutput>> updateFlow(UpdateFlowInput input);

}

