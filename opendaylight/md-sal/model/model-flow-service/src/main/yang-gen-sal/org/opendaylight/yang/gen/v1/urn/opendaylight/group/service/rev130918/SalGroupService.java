package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.AddGroupInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.RemoveGroupOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.RemoveGroupInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput;
import org.opendaylight.yangtools.yang.binding.RpcService;


/**
**/
public interface SalGroupService
    extends
    RpcService
{




    Future<RpcResult<AddGroupOutput>> addGroup(AddGroupInput input);
    
    Future<RpcResult<RemoveGroupOutput>> removeGroup(RemoveGroupInput input);
    
    Future<RpcResult<UpdateGroupOutput>> updateGroup(UpdateGroupInput input);

}

