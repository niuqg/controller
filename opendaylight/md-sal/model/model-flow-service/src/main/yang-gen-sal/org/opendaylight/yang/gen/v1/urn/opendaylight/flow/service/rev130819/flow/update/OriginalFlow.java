package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.flow.update;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.FlowUpdate;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow;
import org.opendaylight.yangtools.yang.common.QName;


public interface OriginalFlow
    extends
    ChildOf<FlowUpdate>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.service.rev130819.flow.update.OriginalFlow>,
    Flow
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:service","2013-08-19","original-flow")
    ;


}

