package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
  List of map - node connectors and their statistics
**/
public interface NodeConnectorStatisticsAndPortNumberMap
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:statistics","2013-12-14","node-connector-statistics-and-port-number-map")
    ;

    List<org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.node.connector.statistics.and.port.number.map.NodeConnectorStatisticsAndPortNumberMap> getNodeConnectorStatisticsAndPortNumberMap();

}

