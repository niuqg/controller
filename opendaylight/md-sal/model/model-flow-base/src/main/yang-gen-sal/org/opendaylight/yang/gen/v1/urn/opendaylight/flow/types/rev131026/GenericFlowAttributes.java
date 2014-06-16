package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface GenericFlowAttributes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","generic_flow_attributes")
    ;

    /**
    **/
    FlowCookie getCookie();
    
    /**
    **/
    Integer getHardTimeout();
    
    /**
    **/
    Integer getIdleTimeout();
    
    /**
    **/
    Integer getPriority();
    
    /**
    **/
    Short getTableId();

}

