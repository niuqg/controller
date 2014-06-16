package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface SalPortService
    extends
    RpcService
{




    Future<RpcResult<UpdatePortOutput>> updatePort(UpdatePortInput input);

}

