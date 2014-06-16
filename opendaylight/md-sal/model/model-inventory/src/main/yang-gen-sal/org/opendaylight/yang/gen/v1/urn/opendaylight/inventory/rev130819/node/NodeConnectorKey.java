package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.node.NodeConnector;


/**
**/
public class NodeConnectorKey
 implements Identifier<NodeConnector> {
    private static final long serialVersionUID = 8325236211082757890L; 
    final private NodeConnectorId _id;

    public NodeConnectorKey(NodeConnectorId _id) {
        this._id = _id;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeConnectorKey(NodeConnectorKey source) {
        this._id = source._id;
    }
    

    public NodeConnectorId getId() {
        return _id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_id == null) ? 0 : _id.hashCode());
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
        NodeConnectorKey other = (NodeConnectorKey) obj;
        if (_id == null) {
            if (other._id != null) {
                return false;
            }
        } else if(!_id.equals(other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("NodeConnectorKey [");
        boolean first = true;
    
        if (_id != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_id=");
            builder.append(_id);
         }
        return builder.append(']').toString();
    }



}
