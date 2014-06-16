package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.node.error.reference.ObjectReference;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeErrorReference
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:service","2013-08-19","node-error-reference")
    ;

    ObjectReference getObjectReference();

}

