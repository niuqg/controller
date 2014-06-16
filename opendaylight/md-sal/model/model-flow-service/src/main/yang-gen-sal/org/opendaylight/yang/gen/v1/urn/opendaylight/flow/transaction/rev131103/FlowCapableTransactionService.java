package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.FinishTransactionInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.GetNextTransactionIdInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface FlowCapableTransactionService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> finishTransaction(FinishTransactionInput input);
    
    Future<RpcResult<GetNextTransactionIdOutput>> getNextTransactionId(GetNextTransactionIdInput input);

}

