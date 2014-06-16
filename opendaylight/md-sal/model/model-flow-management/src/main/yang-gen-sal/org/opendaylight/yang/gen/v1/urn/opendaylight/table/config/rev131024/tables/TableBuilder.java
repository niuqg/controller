package org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.TableKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class TableBuilder {

    private Long _id;
    private TableKey _key;
    private NodeRef _node;
    private List<TableFeatures> _tableFeatures;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>> augmentation = new HashMap<>();

    public TableBuilder() {
    } 
    
    public TableBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableEntry arg) {
        this._node = arg.getNode();
        this._tableFeatures = arg.getTableFeatures();
    }
    
    public TableBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures arg) {
        this._tableFeatures = arg.getTableFeatures();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableEntry</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableEntry) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableEntry)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures) {
            this._tableFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures)arg).getTableFeatures();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableEntry, org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures] \n" +
              "but was: " + arg
            );
        }
    }

    public Long getId() {
        return _id;
    }
    
    public TableKey getKey() {
        return _key;
    }
    
    public NodeRef getNode() {
        return _node;
    }
    
    public List<TableFeatures> getTableFeatures() {
        return _tableFeatures;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TableBuilder setId(Long value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Long>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Long("0"), new Long("4294967295")));
            for (Range<Long> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._id = value;
        return this;
    }
    
    public TableBuilder setKey(TableKey value) {
    
        this._key = value;
        return this;
    }
    
    public TableBuilder setNode(NodeRef value) {
    
        this._node = value;
        return this;
    }
    
    public TableBuilder setTableFeatures(List<TableFeatures> value) {
    
        this._tableFeatures = value;
        return this;
    }
    
    public TableBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Table build() {
        return new TableImpl(this);
    }

    private static final class TableImpl implements Table {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table.class;
        }

        private final Long _id;
        private final TableKey _key;
        private final NodeRef _node;
        private final List<TableFeatures> _tableFeatures;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>> augmentation;

        private TableImpl(TableBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new TableKey(
                    builder.getId(), 
                    builder.getNode()
                );
                this._id = builder.getId();
                this._node = builder.getNode();
            } else {
                this._key = builder.getKey();
                this._id = _key.getId();
                this._node = _key.getNode();
            }
            this._tableFeatures = builder.getTableFeatures();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Long getId() {
            return _id;
        }
        
        @Override
        public TableKey getKey() {
            return _key;
        }
        
        @Override
        public NodeRef getNode() {
            return _node;
        }
        
        @Override
        public List<TableFeatures> getTableFeatures() {
            return _tableFeatures;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_id == null) ? 0 : _id.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_node == null) ? 0 : _node.hashCode());
            result = prime * result + ((_tableFeatures == null) ? 0 : _tableFeatures.hashCode());
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
            TableImpl other = (TableImpl) obj;
            if (_id == null) {
                if (other._id != null) {
                    return false;
                }
            } else if(!_id.equals(other._id)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_node == null) {
                if (other._node != null) {
                    return false;
                }
            } else if(!_node.equals(other._node)) {
                return false;
            }
            if (_tableFeatures == null) {
                if (other._tableFeatures != null) {
                    return false;
                }
            } else if(!_tableFeatures.equals(other._tableFeatures)) {
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
            StringBuilder builder = new StringBuilder("Table [");
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
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
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
            if (_tableFeatures != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableFeatures=");
                builder.append(_tableFeatures);
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
