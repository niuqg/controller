package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.view.rev131030.aggregate.node.OriginalNode;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface AggregateNode
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:view","2013-10-30","aggregate-node")
    ;

    List<OriginalNode> getOriginalNode();

}

