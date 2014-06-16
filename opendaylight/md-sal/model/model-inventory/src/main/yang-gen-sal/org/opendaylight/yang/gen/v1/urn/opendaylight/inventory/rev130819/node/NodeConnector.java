package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnectorKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeConnector
    extends
    ChildOf<Node>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnector,
    Identifiable<NodeConnectorKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-connector")
    ;

    /**
      Returns Primary Key of Yang List Type
    **/
    NodeConnectorKey getKey();

}

