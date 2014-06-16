package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeUpdated
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeUpdated>,
    Node,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-updated")
    ;

    /**
    **/
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContext.class
    )
    NodeRef getNodeRef();

}

