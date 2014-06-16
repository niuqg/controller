package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Duration
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:statistics:types","2013-09-25","duration")
    ;

    /**
    **/
    Counter32 getNanosecond();
    
    /**
    **/
    Counter32 getSecond();

}

