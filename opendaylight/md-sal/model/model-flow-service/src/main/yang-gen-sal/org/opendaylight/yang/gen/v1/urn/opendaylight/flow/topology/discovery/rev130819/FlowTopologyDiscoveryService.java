package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.topology.discovery.rev130819;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface FlowTopologyDiscoveryService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> solicitRefresh();

}

