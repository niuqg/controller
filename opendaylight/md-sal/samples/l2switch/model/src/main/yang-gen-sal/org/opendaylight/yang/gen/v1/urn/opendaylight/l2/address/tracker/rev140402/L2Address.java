package org.opendaylight.yang.gen.v1.urn.opendaylight.l2.address.tracker.rev140402;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface L2Address
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:l2-address-tracker","2014-04-02","l2-address")
    ;

    /**
      the mac address of the host.
    **/
    MacAddress getMac();
    
    /**
    **/
    NodeConnectorRef getNodeConnectorRef();

}

