package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.toaster.provider.impl.rev140131.ClearToastsMadeInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface ToasterProviderImplService
    extends
    RpcService
{




    /**
      JMX call to clear the toasts-made counter.
    **/
    Future<RpcResult<java.lang.Void>> clearToastsMade(ClearToastsMadeInput input);

}

