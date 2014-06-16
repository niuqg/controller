package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMapKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class FlowTableAndStatisticsMapBuilder {

    private TableId _tableId;
    private FlowTableAndStatisticsMapKey _key;
    private Counter32 _activeFlows;
    private Counter64 _packetsLookedUp;
    private Counter64 _packetsMatched;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>> augmentation = new HashMap<>();

    public FlowTableAndStatisticsMapBuilder() {
    } 
    
    public FlowTableAndStatisticsMapBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics arg) {
        this._activeFlows = arg.getActiveFlows();
        this._packetsLookedUp = arg.getPacketsLookedUp();
        this._packetsMatched = arg.getPacketsMatched();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics) {
            this._activeFlows = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics)arg).getActiveFlows();
            this._packetsLookedUp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics)arg).getPacketsLookedUp();
            this._packetsMatched = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics)arg).getPacketsMatched();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericTableStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public TableId getTableId() {
        return _tableId;
    }
    
    public FlowTableAndStatisticsMapKey getKey() {
        return _key;
    }
    
    public Counter32 getActiveFlows() {
        return _activeFlows;
    }
    
    public Counter64 getPacketsLookedUp() {
        return _packetsLookedUp;
    }
    
    public Counter64 getPacketsMatched() {
        return _packetsMatched;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public FlowTableAndStatisticsMapBuilder setTableId(TableId value) {
    
        this._tableId = value;
        return this;
    }
    
    public FlowTableAndStatisticsMapBuilder setKey(FlowTableAndStatisticsMapKey value) {
    
        this._key = value;
        return this;
    }
    
    public FlowTableAndStatisticsMapBuilder setActiveFlows(Counter32 value) {
    
        this._activeFlows = value;
        return this;
    }
    
    public FlowTableAndStatisticsMapBuilder setPacketsLookedUp(Counter64 value) {
    
        this._packetsLookedUp = value;
        return this;
    }
    
    public FlowTableAndStatisticsMapBuilder setPacketsMatched(Counter64 value) {
    
        this._packetsMatched = value;
        return this;
    }
    
    public FlowTableAndStatisticsMapBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public FlowTableAndStatisticsMap build() {
        return new FlowTableAndStatisticsMapImpl(this);
    }

    private static final class FlowTableAndStatisticsMapImpl implements FlowTableAndStatisticsMap {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap.class;
        }

        private final TableId _tableId;
        private final FlowTableAndStatisticsMapKey _key;
        private final Counter32 _activeFlows;
        private final Counter64 _packetsLookedUp;
        private final Counter64 _packetsMatched;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>> augmentation;

        private FlowTableAndStatisticsMapImpl(FlowTableAndStatisticsMapBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new FlowTableAndStatisticsMapKey(
                    builder.getTableId()
                );
                this._tableId = builder.getTableId();
            } else {
                this._key = builder.getKey();
                this._tableId = _key.getTableId();
            }
            this._activeFlows = builder.getActiveFlows();
            this._packetsLookedUp = builder.getPacketsLookedUp();
            this._packetsMatched = builder.getPacketsMatched();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>>singletonMap(e.getKey(), e.getValue());
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
        public FlowTableAndStatisticsMapKey getKey() {
            return _key;
        }
        
        @Override
        public Counter32 getActiveFlows() {
            return _activeFlows;
        }
        
        @Override
        public Counter64 getPacketsLookedUp() {
            return _packetsLookedUp;
        }
        
        @Override
        public Counter64 getPacketsMatched() {
            return _packetsMatched;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.table.statistics.rev131215.flow.table.and.statistics.map.FlowTableAndStatisticsMap>> E getAugmentation(Class<E> augmentationType) {
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
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_activeFlows == null) ? 0 : _activeFlows.hashCode());
            result = prime * result + ((_packetsLookedUp == null) ? 0 : _packetsLookedUp.hashCode());
            result = prime * result + ((_packetsMatched == null) ? 0 : _packetsMatched.hashCode());
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
            FlowTableAndStatisticsMapImpl other = (FlowTableAndStatisticsMapImpl) obj;
            if (_tableId == null) {
                if (other._tableId != null) {
                    return false;
                }
            } else if(!_tableId.equals(other._tableId)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_activeFlows == null) {
                if (other._activeFlows != null) {
                    return false;
                }
            } else if(!_activeFlows.equals(other._activeFlows)) {
                return false;
            }
            if (_packetsLookedUp == null) {
                if (other._packetsLookedUp != null) {
                    return false;
                }
            } else if(!_packetsLookedUp.equals(other._packetsLookedUp)) {
                return false;
            }
            if (_packetsMatched == null) {
                if (other._packetsMatched != null) {
                    return false;
                }
            } else if(!_packetsMatched.equals(other._packetsMatched)) {
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
            StringBuilder builder = new StringBuilder("FlowTableAndStatisticsMap [");
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
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_activeFlows != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_activeFlows=");
                builder.append(_activeFlows);
             }
            if (_packetsLookedUp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetsLookedUp=");
                builder.append(_packetsLookedUp);
             }
            if (_packetsMatched != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetsMatched=");
                builder.append(_packetsMatched);
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
