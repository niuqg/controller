package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.Node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.MultipartTransactionAware;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.NodeConnectorStatisticsAndPortNumberMap;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;


/**
  List of map - node connectors and their statistics
**/
public interface NodeConnectorStatisticsUpdate
    extends
    ChildOf<DataObject>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.NodeConnectorStatisticsUpdate>,
    Node,
    MultipartTransactionAware,
    NodeConnectorStatisticsAndPortNumberMap,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:statistics","2013-12-14","node-connector-statistics-update")
    ;


}

