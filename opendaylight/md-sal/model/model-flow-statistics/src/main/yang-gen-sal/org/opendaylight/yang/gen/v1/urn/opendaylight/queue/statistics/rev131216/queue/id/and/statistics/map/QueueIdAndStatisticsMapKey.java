package org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.queue.id.and.statistics.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.queue.statistics.rev131216.queue.id.and.statistics.map.QueueIdAndStatisticsMap;


/**
**/
public class QueueIdAndStatisticsMapKey
 implements Identifier<QueueIdAndStatisticsMap> {
    private static final long serialVersionUID = -2732617231203858971L; 
    final private NodeConnectorId _nodeConnectorId;
    final private QueueId _queueId;

    public QueueIdAndStatisticsMapKey(NodeConnectorId _nodeConnectorId, QueueId _queueId) {
        this._nodeConnectorId = _nodeConnectorId;
        this._queueId = _queueId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public QueueIdAndStatisticsMapKey(QueueIdAndStatisticsMapKey source) {
        this._nodeConnectorId = source._nodeConnectorId;
        this._queueId = source._queueId;
    }
    

    public NodeConnectorId getNodeConnectorId() {
        return _nodeConnectorId;
    }
    
    public QueueId getQueueId() {
        return _queueId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_nodeConnectorId == null) ? 0 : _nodeConnectorId.hashCode());
        result = prime * result + ((_queueId == null) ? 0 : _queueId.hashCode());
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
        QueueIdAndStatisticsMapKey other = (QueueIdAndStatisticsMapKey) obj;
        if (_nodeConnectorId == null) {
            if (other._nodeConnectorId != null) {
                return false;
            }
        } else if(!_nodeConnectorId.equals(other._nodeConnectorId)) {
            return false;
        }
        if (_queueId == null) {
            if (other._queueId != null) {
                return false;
            }
        } else if(!_queueId.equals(other._queueId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("QueueIdAndStatisticsMapKey [");
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
        if (_queueId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_queueId=");
            builder.append(_queueId);
         }
        return builder.append(']').toString();
    }



}
