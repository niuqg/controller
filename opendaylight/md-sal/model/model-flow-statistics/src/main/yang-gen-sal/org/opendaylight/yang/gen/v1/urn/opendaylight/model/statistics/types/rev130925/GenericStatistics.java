package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration;
import org.opendaylight.yangtools.yang.common.QName;


public interface GenericStatistics
    extends
    DataObject,
    Duration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:statistics:types","2013-09-25","generic-statistics")
    ;

    /**
    **/
    Counter64 getByteCount();
    
    /**
    **/
    Counter64 getPacketCount();

}

