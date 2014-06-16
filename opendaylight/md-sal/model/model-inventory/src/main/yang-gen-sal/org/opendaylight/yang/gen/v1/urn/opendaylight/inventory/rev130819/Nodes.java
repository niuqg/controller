package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.nodes.Node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.OpendaylightInventoryData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Nodes
    extends
    ChildOf<OpendaylightInventoryData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Nodes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","nodes")
    ;

    List<Node> getNode();

}

