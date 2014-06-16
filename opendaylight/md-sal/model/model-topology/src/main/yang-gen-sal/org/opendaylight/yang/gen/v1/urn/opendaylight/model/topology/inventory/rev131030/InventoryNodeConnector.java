package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPoint;


/**
**/
public interface InventoryNodeConnector
    extends
    DataObject,
    Augmentation<TerminationPoint>
{




    /**
    **/
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorContext.class
    )
    NodeConnectorRef getInventoryNodeConnectorRef();

}

