package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.FlowTableAndStatisticsMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface GetFlowTablesStatisticsOutput
    extends
    TransactionAware,
    FlowTableAndStatisticsMap,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.GetFlowTablesStatisticsOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:table:statistics","2013-12-15","output")
    ;


}

