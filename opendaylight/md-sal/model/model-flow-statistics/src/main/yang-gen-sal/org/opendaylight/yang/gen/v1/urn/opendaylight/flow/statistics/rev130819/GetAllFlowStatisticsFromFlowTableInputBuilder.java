package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GetAllFlowStatisticsFromFlowTableInputBuilder {

    private TableId _tableId;
    private NodeRef _node;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>> augmentation = new HashMap<>();

    public GetAllFlowStatisticsFromFlowTableInputBuilder() {
    } 
    
    public GetAllFlowStatisticsFromFlowTableInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef arg) {
        this._node = arg.getNode();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef)arg).getNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef] \n" +
              "but was: " + arg
            );
        }
    }

    public TableId getTableId() {
        return _tableId;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GetAllFlowStatisticsFromFlowTableInputBuilder setTableId(TableId value) {
    
        this._tableId = value;
        return this;
    }
    
    public GetAllFlowStatisticsFromFlowTableInputBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public GetAllFlowStatisticsFromFlowTableInputBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GetAllFlowStatisticsFromFlowTableInput build() {
        return new GetAllFlowStatisticsFromFlowTableInputImpl(this);
    }

    private static final class GetAllFlowStatisticsFromFlowTableInputImpl implements GetAllFlowStatisticsFromFlowTableInput {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput.class;
        }

        private final TableId _tableId;
        private final NodeRef _node;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>> augmentation;

        private GetAllFlowStatisticsFromFlowTableInputImpl(GetAllFlowStatisticsFromFlowTableInputBuilder builder) {
            this._tableId = builder.getTableId();
            this._node = builder.getNode();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public TableId getTableId() {
            return _tableId;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.statistics.rev130819.GetAllFlowStatisticsFromFlowTableInput>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
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
            GetAllFlowStatisticsFromFlowTableInputImpl other = (GetAllFlowStatisticsFromFlowTableInputImpl) obj;
            if (_tableId == null) {
                if (other._tableId != null) {
                    return false;
                }
            } else if(!_tableId.equals(other._tableId)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (augmentation == null) {
                if (other.augmentation != null) {
                    return false;
                }
            } else if(!augmentation.equals(other.augmentation)) {
                return false;
            }
            return true;
        }
        
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("GetAllFlowStatisticsFromFlowTableInput [");
            boolean first = true;
        
            if (_tableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableId=");
                builder.append(_tableId);
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
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
