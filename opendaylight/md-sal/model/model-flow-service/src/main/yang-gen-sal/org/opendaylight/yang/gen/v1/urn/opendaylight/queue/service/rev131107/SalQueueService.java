package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.service.rev131107.GetQueueOutput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface SalQueueService
    extends
    RpcService
{




    Future<RpcResult<GetQueueOutput>> getQueue();

}

