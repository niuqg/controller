package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.AggregateFlowStatistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


public interface AggregateFlowStatisticsUpdate
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.AggregateFlowStatisticsUpdate>,
    Node,
    AggregateFlowStatistics,
    MultipartTransactionAware,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:statistics","2013-08-19","aggregate-flow-statistics-update")
    ;


}

