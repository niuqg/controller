package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.node.connector.statistics.and.port.number.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.node.connector.statistics.and.port.number.map.NodeConnectorStatisticsAndPortNumberMapKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeConnectorStatisticsAndPortNumberMap
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.NodeConnectorStatisticsAndPortNumberMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.node.connector.statistics.and.port.number.map.NodeConnectorStatisticsAndPortNumberMap>,
    NodeConnectorStatistics,
    Identifiable<NodeConnectorStatisticsAndPortNumberMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:statistics","2013-12-14","node-connector-statistics-and-port-number-map")
    ;

    /**
    **/
    NodeConnectorId getNodeConnectorId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    NodeConnectorStatisticsAndPortNumberMapKey getKey();

}

