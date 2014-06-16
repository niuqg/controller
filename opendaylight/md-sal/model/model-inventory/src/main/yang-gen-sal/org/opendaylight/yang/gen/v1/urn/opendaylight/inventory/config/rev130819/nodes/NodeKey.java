package org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.config.rev130819.nodes.Node;


/**
**/
public class NodeKey
 implements Identifier<Node> {
    private static final long serialVersionUID = 7805731164917659700L; 
    final private NodeId _id;

    public NodeKey(NodeId _id) {
        this._id = _id;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeKey(NodeKey source) {
        this._id = source._id;
    }
    

    public NodeId getId() {
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
        NodeKey other = (NodeKey) obj;
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
        StringBuilder builder = new StringBuilder("NodeKey [");
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
