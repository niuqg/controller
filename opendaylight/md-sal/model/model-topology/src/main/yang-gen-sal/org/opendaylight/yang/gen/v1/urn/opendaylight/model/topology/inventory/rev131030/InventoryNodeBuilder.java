package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;



public class InventoryNodeBuilder {

    private NodeRef _inventoryNodeRef;


    public InventoryNodeBuilder() {
    } 


    public NodeRef getInventoryNodeRef() {
        return _inventoryNodeRef;
    }

    public InventoryNodeBuilder setInventoryNodeRef(NodeRef value) {
    
        this._inventoryNodeRef = value;
        return this;
    }

    public InventoryNode build() {
        return new InventoryNodeImpl(this);
    }

    private static final class InventoryNodeImpl implements InventoryNode {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNode.class;
        }

        private final NodeRef _inventoryNodeRef;


        private InventoryNodeImpl(InventoryNodeBuilder builder) {
            this._inventoryNodeRef = builder.getInventoryNodeRef();
        }

        @Override
        public NodeRef getInventoryNodeRef() {
            return _inventoryNodeRef;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_inventoryNodeRef == null) ? 0 : _inventoryNodeRef.hashCode());
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
            InventoryNodeImpl other = (InventoryNodeImpl) obj;
            if (_inventoryNodeRef == null) {
                if (other._inventoryNodeRef != null) {
                    return false;
                }
            } else if(!_inventoryNodeRef.equals(other._inventoryNodeRef)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("InventoryNode [");
            boolean first = true;
        
            if (_inventoryNodeRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inventoryNodeRef=");
                builder.append(_inventoryNodeRef);
             }
            return builder.append(']').toString();
        }
    }

}
