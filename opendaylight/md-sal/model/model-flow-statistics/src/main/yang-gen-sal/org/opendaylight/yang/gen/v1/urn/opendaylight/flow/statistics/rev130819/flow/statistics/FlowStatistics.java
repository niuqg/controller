package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.statistics;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowStatistics
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.flow.statistics.FlowStatistics>,
    GenericStatistics,
    Flow
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:statistics","2013-08-19","flow-statistics")
    ;


}

