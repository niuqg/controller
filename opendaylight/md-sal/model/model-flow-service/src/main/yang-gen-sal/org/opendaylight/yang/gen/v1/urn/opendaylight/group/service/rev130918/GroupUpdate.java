package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.group.update.OriginalGroup;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.group.update.UpdatedGroup;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface GroupUpdate
    extends
    DataObject,
    NodeContextRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:service","2013-09-18","group-update")
    ;

    OriginalGroup getOriginalGroup();
    
    UpdatedGroup getUpdatedGroup();

}

