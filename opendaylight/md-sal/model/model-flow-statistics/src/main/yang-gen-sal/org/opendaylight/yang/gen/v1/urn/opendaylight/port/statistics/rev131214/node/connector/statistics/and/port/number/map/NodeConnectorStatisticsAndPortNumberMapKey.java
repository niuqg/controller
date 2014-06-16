package org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.node.connector.statistics.and.port.number.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.statistics.rev131214.node.connector.statistics.and.port.number.map.NodeConnectorStatisticsAndPortNumberMap;


/**
**/
public class NodeConnectorStatisticsAndPortNumberMapKey
 implements Identifier<NodeConnectorStatisticsAndPortNumberMap> {
    private static final long serialVersionUID = 8538224566350483859L; 
    final private NodeConnectorId _nodeConnectorId;

    public NodeConnectorStatisticsAndPortNumberMapKey(NodeConnectorId _nodeConnectorId) {
        this._nodeConnectorId = _nodeConnectorId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeConnectorStatisticsAndPortNumberMapKey(NodeConnectorStatisticsAndPortNumberMapKey source) {
        this._nodeConnectorId = source._nodeConnectorId;
    }
    

    public NodeConnectorId getNodeConnectorId() {
        return _nodeConnectorId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_nodeConnectorId == null) ? 0 : _nodeConnectorId.hashCode());
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        NodeConnectorStatisticsAndPortNumberMapKey other = (NodeConnectorStatisticsAndPortNumberMapKey) obj;
        if (_nodeConnectorId == null) {
            if (other._nodeConnectorId != null) {
                return false;
            }
        } else if(!_nodeConnectorId.equals(other._nodeConnectorId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("NodeConnectorStatisticsAndPortNumberMapKey [");
        boolean first = true;
    
        if (_nodeConnectorId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nodeConnectorId=");
            builder.append(_nodeConnectorId);
         }
        return builder.append(']').toString();
    }



}
