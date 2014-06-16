package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupFeaturesReply;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface GroupFeaturesUpdated
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeaturesUpdated>,
    Node,
    MultipartTransactionAware,
    GroupFeaturesReply,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:statistics","2013-11-11","group-features-updated")
    ;


}

