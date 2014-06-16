package org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class TablesBuilder {

    private List<Table> _table;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>> augmentation = new HashMap<>();

    public TablesBuilder() {
    } 


    public List<Table> getTable() {
        return _table;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TablesBuilder setTable(List<Table> value) {
    
        this._table = value;
        return this;
    }
    
    public TablesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Tables build() {
        return new TablesImpl(this);
    }

    private static final class TablesImpl implements Tables {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables.class;
        }

        private final List<Table> _table;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>> augmentation;

        private TablesImpl(TablesBuilder builder) {
            this._table = builder.getTable();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<Table> getTable() {
            return _table;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_table == null) ? 0 : _table.hashCode());
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
            TablesImpl other = (TablesImpl) obj;
            if (_table == null) {
                if (other._table != null) {
                    return false;
                }
            } else if(!_table.equals(other._table)) {
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
            StringBuilder builder = new StringBuilder("Tables [");
            boolean first = true;
        
            if (_table != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_table=");
                builder.append(_table);
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
