package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.queue.rev130925.QueueId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.port.rev130925.queues.Queue;


/**
**/
public class QueueKey
 implements Identifier<Queue> {
    private static final long serialVersionUID = 2226159933041902424L; 
    final private QueueId _queueId;

    public QueueKey(QueueId _queueId) {
        this._queueId = _queueId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public QueueKey(QueueKey source) {
        this._queueId = source._queueId;
    }
    

    public QueueId getQueueId() {
        return _queueId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        QueueKey other = (QueueKey) obj;
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
        StringBuilder builder = new StringBuilder("QueueKey [");
        boolean first = true;
    
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
