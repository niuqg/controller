package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowTableStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","flow-table-statistics")
    ;

    /**
    **/
    Counter64 getActive();
    
    /**
    **/
    Counter64 getLookup();
    
    /**
    **/
    Counter64 getMatched();

}

