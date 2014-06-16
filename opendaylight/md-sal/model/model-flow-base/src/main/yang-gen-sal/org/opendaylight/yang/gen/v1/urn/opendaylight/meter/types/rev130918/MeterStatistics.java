package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface MeterStatistics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","meter-statistics")
    ;

    /**
    **/
    Counter64 getByteInCount();
    
    Duration getDuration();
    
    /**
    **/
    Counter32 getFlowCount();
    
    MeterBandStats getMeterBandStats();
    
    /**
    **/
    MeterId getMeterId();
    
    /**
    **/
    Counter64 getPacketInCount();

}

