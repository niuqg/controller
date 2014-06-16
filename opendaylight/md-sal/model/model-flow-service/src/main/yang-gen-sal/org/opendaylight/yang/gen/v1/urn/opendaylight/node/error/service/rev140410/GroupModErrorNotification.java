package org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorMessage;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.NodeErrorReference;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.BaseNodeErrorNotification;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionMetadata;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupModErrorNotification
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.node.error.service.rev140410.GroupModErrorNotification>,
    ErrorMessage,
    NodeErrorReference,
    TransactionAware,
    BaseNodeErrorNotification,
    TransactionMetadata,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:node:error:service","2014-04-10","group-mod-error-notification")
    ;


}

