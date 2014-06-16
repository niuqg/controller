package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupAdded;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupRemoved;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdated;
import org.opendaylight.yangtools.yang.binding.NotificationListener;


/**
**/
public interface SalGroupListener
    extends
    NotificationListener
{




    void onGroupAdded(GroupAdded notification);
    
    void onGroupRemoved(GroupRemoved notification);
    
    void onGroupUpdated(GroupUpdated notification);

}

