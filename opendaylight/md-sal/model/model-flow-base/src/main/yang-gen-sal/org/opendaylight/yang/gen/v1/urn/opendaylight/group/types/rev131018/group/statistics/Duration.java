package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Duration
    extends
    ChildOf<GroupStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:group:types","2013-10-18","duration")
    ;

    /**
    **/
    Counter32 getNanosecond();
    
    /**
    **/
    Counter32 getSecond();

}

