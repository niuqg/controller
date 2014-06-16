package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.actions.ActionType;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowNode;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface SupportedActions
    extends
    ChildOf<FlowNode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedActions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","supported-actions")
    ;

    List<ActionType> getActionType();

}

