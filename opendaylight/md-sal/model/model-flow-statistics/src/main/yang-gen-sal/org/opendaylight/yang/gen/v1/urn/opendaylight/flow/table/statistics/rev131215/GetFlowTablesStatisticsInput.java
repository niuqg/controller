package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface GetFlowTablesStatisticsInput
    extends
    NodeContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.GetFlowTablesStatisticsInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:table:statistics","2013-12-15","input")
    ;


}

