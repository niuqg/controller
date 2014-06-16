package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class NodeGroupStatisticsBuilder {

    private GroupStatistics _groupStatistics;


    public NodeGroupStatisticsBuilder() {
    } 
    
    public NodeGroupStatisticsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupStatistics arg) {
        this._groupStatistics = arg.getGroupStatistics();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupStatistics) {
            this._groupStatistics = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupStatistics)arg).getGroupStatistics();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public GroupStatistics getGroupStatistics() {
        return _groupStatistics;
    }

    public NodeGroupStatisticsBuilder setGroupStatistics(GroupStatistics value) {
    
        this._groupStatistics = value;
        return this;
    }

    public NodeGroupStatistics build() {
        return new NodeGroupStatisticsImpl(this);
    }

    private static final class NodeGroupStatisticsImpl implements NodeGroupStatistics {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.NodeGroupStatistics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.NodeGroupStatistics.class;
        }

        private final GroupStatistics _groupStatistics;


        private NodeGroupStatisticsImpl(NodeGroupStatisticsBuilder builder) {
            this._groupStatistics = builder.getGroupStatistics();
        }

        @Override
        public GroupStatistics getGroupStatistics() {
            return _groupStatistics;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_groupStatistics == null) ? 0 : _groupStatistics.hashCode());
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
            NodeGroupStatisticsImpl other = (NodeGroupStatisticsImpl) obj;
            if (_groupStatistics == null) {
                if (other._groupStatistics != null) {
                    return false;
                }
            } else if(!_groupStatistics.equals(other._groupStatistics)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NodeGroupStatistics [");
            boolean first = true;
        
            if (_groupStatistics != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupStatistics=");
                builder.append(_groupStatistics);
             }
            return builder.append(']').toString();
        }
    }

}
