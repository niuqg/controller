package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifierKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeIdentifier
    extends
    ChildOf<NodeIdentifiers>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier>,
    Identifiable<NodeIdentifierKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:topology:general","2013-10-30","node-identifier")
    ;

    /**
    **/
    Uri getIdentifier();
    
    /**
    **/
    Class<? extends org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeType> getType();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    NodeIdentifierKey getKey();

}

