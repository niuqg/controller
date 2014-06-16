package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.features.GroupFeatures;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class NodeGroupFeaturesBuilder {

    private GroupFeatures _groupFeatures;


    public NodeGroupFeaturesBuilder() {
    } 
    
    public NodeGroupFeaturesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeatures arg) {
        this._groupFeatures = arg.getGroupFeatures();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeatures</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeatures) {
            this._groupFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeatures)arg).getGroupFeatures();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.GroupFeatures] \n" +
              "but was: " + arg
            );
        }
    }

    public GroupFeatures getGroupFeatures() {
        return _groupFeatures;
    }

    public NodeGroupFeaturesBuilder setGroupFeatures(GroupFeatures value) {
    
        this._groupFeatures = value;
        return this;
    }

    public NodeGroupFeatures build() {
        return new NodeGroupFeaturesImpl(this);
    }

    private static final class NodeGroupFeaturesImpl implements NodeGroupFeatures {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.NodeGroupFeatures> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.NodeGroupFeatures.class;
        }

        private final GroupFeatures _groupFeatures;


        private NodeGroupFeaturesImpl(NodeGroupFeaturesBuilder builder) {
            this._groupFeatures = builder.getGroupFeatures();
        }

        @Override
        public GroupFeatures getGroupFeatures() {
            return _groupFeatures;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_groupFeatures == null) ? 0 : _groupFeatures.hashCode());
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
            NodeGroupFeaturesImpl other = (NodeGroupFeaturesImpl) obj;
            if (_groupFeatures == null) {
                if (other._groupFeatures != null) {
                    return false;
                }
            } else if(!_groupFeatures.equals(other._groupFeatures)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("NodeGroupFeatures [");
            boolean first = true;
        
            if (_groupFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupFeatures=");
                builder.append(_groupFeatures);
             }
            return builder.append(']').toString();
        }
    }

}
