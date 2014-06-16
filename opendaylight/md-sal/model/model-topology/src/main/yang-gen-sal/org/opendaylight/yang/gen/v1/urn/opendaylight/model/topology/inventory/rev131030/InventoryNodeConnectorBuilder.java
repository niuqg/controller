package org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;



public class InventoryNodeConnectorBuilder {

    private NodeConnectorRef _inventoryNodeConnectorRef;


    public InventoryNodeConnectorBuilder() {
    } 


    public NodeConnectorRef getInventoryNodeConnectorRef() {
        return _inventoryNodeConnectorRef;
    }

    public InventoryNodeConnectorBuilder setInventoryNodeConnectorRef(NodeConnectorRef value) {
    
        this._inventoryNodeConnectorRef = value;
        return this;
    }

    public InventoryNodeConnector build() {
        return new InventoryNodeConnectorImpl(this);
    }

    private static final class InventoryNodeConnectorImpl implements InventoryNodeConnector {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.topology.inventory.rev131030.InventoryNodeConnector.class;
        }

        private final NodeConnectorRef _inventoryNodeConnectorRef;


        private InventoryNodeConnectorImpl(InventoryNodeConnectorBuilder builder) {
            this._inventoryNodeConnectorRef = builder.getInventoryNodeConnectorRef();
        }

        @Override
        public NodeConnectorRef getInventoryNodeConnectorRef() {
            return _inventoryNodeConnectorRef;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_inventoryNodeConnectorRef == null) ? 0 : _inventoryNodeConnectorRef.hashCode());
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
            InventoryNodeConnectorImpl other = (InventoryNodeConnectorImpl) obj;
            if (_inventoryNodeConnectorRef == null) {
                if (other._inventoryNodeConnectorRef != null) {
                    return false;
                }
            } else if(!_inventoryNodeConnectorRef.equals(other._inventoryNodeConnectorRef)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("InventoryNodeConnector [");
            boolean first = true;
        
            if (_inventoryNodeConnectorRef != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_inventoryNodeConnectorRef=");
                builder.append(_inventoryNodeConnectorRef);
             }
            return builder.append(']').toString();
        }
    }

}
