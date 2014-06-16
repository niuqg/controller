package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface SalTableService
    extends
    RpcService
{




    Future<RpcResult<UpdateTableOutput>> updateTable(UpdateTableInput input);

}

