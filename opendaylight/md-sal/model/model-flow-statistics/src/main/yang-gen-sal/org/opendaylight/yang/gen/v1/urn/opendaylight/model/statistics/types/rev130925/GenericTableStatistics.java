package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Generic grouping holding generic statistics related to switch table
**/
public interface GenericTableStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:statistics:types","2013-09-25","generic-table-statistics")
    ;

    /**
    **/
    Counter32 getActiveFlows();
    
    /**
    **/
    Counter64 getPacketsLookedUp();
    
    /**
    **/
    Counter64 getPacketsMatched();

}

