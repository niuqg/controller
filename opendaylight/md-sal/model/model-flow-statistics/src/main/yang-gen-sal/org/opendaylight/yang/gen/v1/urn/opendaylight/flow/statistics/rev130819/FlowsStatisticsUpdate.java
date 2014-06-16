package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowAndStatisticsMapList;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


/**
  List of flow and statistics map
**/
public interface FlowsStatisticsUpdate
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.FlowsStatisticsUpdate>,
    Node,
    TransactionAware,
    FlowAndStatisticsMapList,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:statistics","2013-08-19","flows-statistics-update")
    ;

    /**
    **/
    Boolean isMoreReplies();

}

