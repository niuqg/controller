package org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.config.rev131024.groups.Group;


/**
**/
public class GroupKey
 implements Identifier<Group> {
    private static final long serialVersionUID = -1288684273162644259L; 
    final private Long _id;
    final private NodeRef _node;

    public GroupKey(Long _id, NodeRef _node) {
        this._id = _id;
        this._node = _node;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public GroupKey(GroupKey source) {
        this._id = source._id;
        this._node = source._node;
    }
    

    public Long getId() {
        return _id;
    }
    
    public NodeRef getNode() {
        return _node;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_id == null) ? 0 : _id.hashCode());
        result = prime * result + ((_node == null) ? 0 : _node.hashCode());
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
        GroupKey other = (GroupKey) obj;
        if (_id == null) {
            if (other._id != null) {
                return false;
            }
        } else if(!_id.equals(other._id)) {
            return false;
        }
        if (_node == null) {
            if (other._node != null) {
                return false;
            }
        } else if(!_node.equals(other._node)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("GroupKey [");
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
        if (_node != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_node=");
            builder.append(_node);
         }
        return builder.append(']').toString();
    }



}
