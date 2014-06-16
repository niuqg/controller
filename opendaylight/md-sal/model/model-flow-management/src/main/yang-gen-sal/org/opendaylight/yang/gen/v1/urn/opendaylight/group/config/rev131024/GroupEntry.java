package org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.Group;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupEntry
    extends
    DataObject,
    Group
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:config","2013-10-24","group-entry")
    ;

    /**
    **/
    NodeRef getNode();

}

