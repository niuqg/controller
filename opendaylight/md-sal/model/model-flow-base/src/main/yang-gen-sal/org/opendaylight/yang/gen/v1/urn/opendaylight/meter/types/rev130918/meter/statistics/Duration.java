package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Duration
    extends
    ChildOf<MeterStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:meter:types","2013-09-18","duration")
    ;

    /**
    **/
    Counter32 getNanosecond();
    
    /**
    **/
    Counter32 getSecond();

}

