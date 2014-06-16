package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeConnector
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:inventory","2013-08-19","node-connector")
    ;

    /**
    **/
    NodeConnectorId getId();

}

