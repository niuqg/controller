package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.AggregateNode;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface OriginalNode
    extends
    ChildOf<AggregateNode>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:view","2013-10-30","original-node")
    ;

    /**
    **/
    NodeId getNode();
    
    /**
    **/
    TopologyId getTopology();

}

