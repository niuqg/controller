package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.node.identifiers.NodeIdentifier;
import org.opendaylight.yangtools.yang.binding.DataObject;



public class IdentifiableNodeBuilder {

    private List<NodeIdentifier> _nodeIdentifier;


    public IdentifiableNodeBuilder() {
    } 
    
    public IdentifiableNodeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers arg) {
        this._nodeIdentifier = arg.getNodeIdentifier();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers) {
            this._nodeIdentifier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers)arg).getNodeIdentifier();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.NodeIdentifiers] \n" +
              "but was: " + arg
            );
        }
    }

    public List<NodeIdentifier> getNodeIdentifier() {
        return _nodeIdentifier;
    }

    public IdentifiableNodeBuilder setNodeIdentifier(List<NodeIdentifier> value) {
    
        this._nodeIdentifier = value;
        return this;
    }

    public IdentifiableNode build() {
        return new IdentifiableNodeImpl(this);
    }

    private static final class IdentifiableNodeImpl implements IdentifiableNode {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.general.rev131030.IdentifiableNode.class;
        }

        private final List<NodeIdentifier> _nodeIdentifier;


        private IdentifiableNodeImpl(IdentifiableNodeBuilder builder) {
            this._nodeIdentifier = builder.getNodeIdentifier();
        }

        @Override
        public List<NodeIdentifier> getNodeIdentifier() {
            return _nodeIdentifier;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_nodeIdentifier == null) ? 0 : _nodeIdentifier.hashCode());
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
            IdentifiableNodeImpl other = (IdentifiableNodeImpl) obj;
            if (_nodeIdentifier == null) {
                if (other._nodeIdentifier != null) {
                    return false;
                }
            } else if(!_nodeIdentifier.equals(other._nodeIdentifier)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("IdentifiableNode [");
            boolean first = true;
        
            if (_nodeIdentifier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nodeIdentifier=");
                builder.append(_nodeIdentifier);
             }
            return builder.append(']').toString();
        }
    }

}
