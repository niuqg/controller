package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.DataState;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Transactions
    extends
    ChildOf<DataState>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.md.sal.common.rev131028.data.state.Transactions>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:md:sal:common","2013-10-28","transactions")
    ;

    /**
    **/
    Long getCreated();
    
    /**
    **/
    Long getFailed();
    
    /**
    **/
    Long getSubmitted();
    
    /**
    **/
    Long getSuccessful();

}

