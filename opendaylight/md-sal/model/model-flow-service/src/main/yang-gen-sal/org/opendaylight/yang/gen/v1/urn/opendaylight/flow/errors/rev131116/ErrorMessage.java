package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface ErrorMessage
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:errors","2013-11-16","error-message")
    ;

    /**
    **/
    Integer getCode();
    
    /**
    **/
    String getData();
    
    /**
    **/
    ErrorType getType();

}

