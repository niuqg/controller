package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowStatistics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Duration
    extends
    ChildOf<FlowStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.statistics.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","duration")
    ;

    /**
    **/
    Counter64 getNanosecond();
    
    /**
    **/
    Counter64 getSecond();

}

