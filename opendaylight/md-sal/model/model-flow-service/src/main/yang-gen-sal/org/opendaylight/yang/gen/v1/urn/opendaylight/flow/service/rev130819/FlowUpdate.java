package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.flow.update.OriginalFlow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.flow.update.UpdatedFlow;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface FlowUpdate
    extends
    DataObject,
    NodeContextRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:service","2013-08-19","flow-update")
    ;

    OriginalFlow getOriginalFlow();
    
    UpdatedFlow getUpdatedFlow();

}

