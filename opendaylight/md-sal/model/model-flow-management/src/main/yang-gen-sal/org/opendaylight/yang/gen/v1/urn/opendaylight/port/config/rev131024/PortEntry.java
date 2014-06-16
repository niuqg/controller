package org.opendaylight.yang.gen.v1.urn.opendaylight.port.config.rev131024;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.PortMod;
import org.opendaylight.yangtools.yang.common.QName;


public interface PortEntry
    extends
    DataObject,
    PortMod
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:config","2013-10-24","port-entry")
    ;

    /**
    **/
    NodeRef getNode();

}

