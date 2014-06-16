package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.groups.Group;


/**
**/
public class GroupKey
 implements Identifier<Group> {
    private static final long serialVersionUID = 1815956182497969182L; 
    final private GroupId _groupId;

    public GroupKey(GroupId _groupId) {
        this._groupId = _groupId;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public GroupKey(GroupKey source) {
        this._groupId = source._groupId;
    }
    

    public GroupId getGroupId() {
        return _groupId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
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
        if (_groupId == null) {
            if (other._groupId != null) {
                return false;
            }
        } else if(!_groupId.equals(other._groupId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("GroupKey [");
        boolean first = true;
    
        if (_groupId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_groupId=");
            builder.append(_groupId);
         }
        return builder.append(']').toString();
    }



}
