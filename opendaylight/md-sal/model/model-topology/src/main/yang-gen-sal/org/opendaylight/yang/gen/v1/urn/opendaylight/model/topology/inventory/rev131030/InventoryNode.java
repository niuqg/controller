package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;


/**
**/
public interface InventoryNode
    extends
    DataObject,
    Augmentation<Node>
{




    /**
    **/
    NodeRef getInventoryNodeRef();

}

