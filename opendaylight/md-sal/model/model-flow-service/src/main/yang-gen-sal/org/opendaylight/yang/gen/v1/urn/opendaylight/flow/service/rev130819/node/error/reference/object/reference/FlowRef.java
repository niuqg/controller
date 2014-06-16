package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.ObjectReference;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowRef
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.object.reference.FlowRef>,
    ObjectReference
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:service","2013-08-19","flow-ref")
    ;

    /**
    **/
    org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowRef getFlowRef();

}

