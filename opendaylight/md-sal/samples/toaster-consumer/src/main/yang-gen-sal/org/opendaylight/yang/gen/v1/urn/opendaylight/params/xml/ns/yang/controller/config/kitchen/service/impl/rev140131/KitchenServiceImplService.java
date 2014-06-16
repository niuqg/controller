package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.kitchen.service.impl.rev140131.MakeScrambledWithWheatInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface KitchenServiceImplService
    extends
    RpcService
{




    /**
      Shortcut JMX call to make breakfast with scrambled eggs and wheat toast for testing.
    **/
    Future<RpcResult<MakeScrambledWithWheatOutput>> makeScrambledWithWheat(MakeScrambledWithWheatInput input);

}

