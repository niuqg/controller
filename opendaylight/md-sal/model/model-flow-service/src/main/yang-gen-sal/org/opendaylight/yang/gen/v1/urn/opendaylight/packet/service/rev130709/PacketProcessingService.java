package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.TransmitPacketInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface PacketProcessingService
    extends
    RpcService
{




    Future<RpcResult<java.lang.Void>> transmitPacket(TransmitPacketInput input);

}

