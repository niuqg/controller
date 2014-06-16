package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.desc.GroupDesc;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class NodeGroupDescStatsBuilder {

    private GroupDesc _groupDesc;


    public NodeGroupDescStatsBuilder() {
    } 
    
    public NodeGroupDescStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDesc arg) {
        this._groupDesc = arg.getGroupDesc();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDesc</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDesc) {
            this._groupDesc = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDesc)arg).getGroupDesc();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupDesc] \n" +
              "but was: " + arg
            );
        }
    }

    public GroupDesc getGroupDesc() {
        return _groupDesc;
    }

    public NodeGroupDescStatsBuilder setGroupDesc(GroupDesc value) {
    
        this._groupDesc = value;
        return this;
    }

    public NodeGroupDescStats build() {
        return new NodeGroupDescStatsImpl(this);
    }

    private static final class NodeGroupDescStatsImpl implements NodeGroupDescStats {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.NodeGroupDescStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.NodeGroupDescStats.class;
        }

        private final GroupDesc _groupDesc;


        private NodeGroupDescStatsImpl(NodeGroupDescStatsBuilder builder) {
            this._groupDesc = builder.getGroupDesc();
        }

        @Override
        public GroupDesc getGroupDesc() {
            return _groupDesc;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_groupDesc == null) ? 0 : _groupDesc.hashCode());
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
            NodeGroupDescStatsImpl other = (NodeGroupDescStatsImpl) obj;
            if (_groupDesc == null) {
                if (other._groupDesc != null) {
                    return false;
                }
            } else if(!_groupDesc.equals(other._groupDesc)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NodeGroupDescStats [");
            boolean first = true;
        
            if (_groupDesc != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupDesc=");
                builder.append(_groupDesc);
             }
            return builder.append(']').toString();
        }
    }

}
