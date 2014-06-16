package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeIdentifiers
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:general","2013-10-30","node-identifiers")
    ;

    List<NodeIdentifier> getNodeIdentifier();

}

