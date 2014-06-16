package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowEntry
    extends
    DataObject,
    Flow
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:config","2013-08-19","flow-entry")
    ;

    /**
    **/
    NodeRef getNode();

}

