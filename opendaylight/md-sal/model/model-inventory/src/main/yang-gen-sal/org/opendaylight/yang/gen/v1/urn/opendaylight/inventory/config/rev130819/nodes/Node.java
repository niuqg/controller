package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.NodeKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.Nodes;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Node
    extends
    ChildOf<Nodes>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node,
    Identifiable<NodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory:config","2013-08-19","node")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    NodeKey getKey();

}

