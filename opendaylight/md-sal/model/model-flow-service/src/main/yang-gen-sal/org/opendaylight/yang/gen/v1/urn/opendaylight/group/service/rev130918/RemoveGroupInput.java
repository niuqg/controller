package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.NodeGroup;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface RemoveGroupInput
    extends
    NodeGroup,
    TransactionMetadata,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.RemoveGroupInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:service","2013-09-18","input")
    ;

    /**
    **/
    GroupRef getGroupRef();

}

