package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.errors.rev131116.ErrorType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface ExperimenterErrorMessage
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:errors","2013-11-16","experimenter-error-message")
    ;

    /**
    **/
    String getData();
    
    /**
    **/
    Integer getExpType();
    
    /**
    **/
    Long getExperimenterId();
    
    /**
    **/
    ErrorType getType();

}

