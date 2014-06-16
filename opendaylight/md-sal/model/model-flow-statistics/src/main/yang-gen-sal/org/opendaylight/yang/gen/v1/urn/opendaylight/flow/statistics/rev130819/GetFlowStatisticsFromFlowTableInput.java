package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface GetFlowStatisticsFromFlowTableInput
    extends
    Flow,
    NodeContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetFlowStatisticsFromFlowTableInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:statistics","2013-08-19","input")
    ;


}

