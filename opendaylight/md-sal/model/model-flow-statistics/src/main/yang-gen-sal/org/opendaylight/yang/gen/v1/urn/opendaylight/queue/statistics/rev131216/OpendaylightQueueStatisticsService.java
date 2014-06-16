package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetAllQueuesStatisticsFromAllPortsOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetAllQueuesStatisticsFromAllPortsInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetAllQueuesStatisticsFromGivenPortOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetAllQueuesStatisticsFromGivenPortInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetQueueStatisticsFromGivenPortOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.GetQueueStatisticsFromGivenPortInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface OpendaylightQueueStatisticsService
    extends
    RpcService
{




    /**
      Get statistics for all the queues attached to all the ports from the node
    **/
    Future<RpcResult<GetAllQueuesStatisticsFromAllPortsOutput>> getAllQueuesStatisticsFromAllPorts(GetAllQueuesStatisticsFromAllPortsInput input);
    
    /**
      Get statistics for all queues for given port of the node
    **/
    Future<RpcResult<GetAllQueuesStatisticsFromGivenPortOutput>> getAllQueuesStatisticsFromGivenPort(GetAllQueuesStatisticsFromGivenPortInput input);
    
    /**
      Get statistics for given queues from given port of the node
    **/
    Future<RpcResult<GetQueueStatisticsFromGivenPortOutput>> getQueueStatisticsFromGivenPort(GetQueueStatisticsFromGivenPortInput input);

}

