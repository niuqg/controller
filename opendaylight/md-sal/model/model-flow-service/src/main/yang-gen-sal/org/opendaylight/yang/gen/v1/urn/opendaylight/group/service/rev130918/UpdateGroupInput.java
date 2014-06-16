package org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupRef;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.GroupUpdate;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface UpdateGroupInput
    extends
    TransactionMetadata,
    GroupUpdate,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.service.rev130918.UpdateGroupInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:service","2013-09-18","input")
    ;

    /**
    **/
    GroupRef getGroupRef();

}

