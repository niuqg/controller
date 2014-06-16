package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class OriginalTableBuilder {

    private List<TableFeatures> _tableFeatures;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>> augmentation = new HashMap<>();

    public OriginalTableBuilder() {
    } 
    
    public OriginalTableBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures arg) {
        this._tableFeatures = arg.getTableFeatures();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures) {
            this._tableFeatures = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures)arg).getTableFeatures();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures] \n" +
              "but was: " + arg
            );
        }
    }

    public List<TableFeatures> getTableFeatures() {
        return _tableFeatures;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OriginalTableBuilder setTableFeatures(List<TableFeatures> value) {
    
        this._tableFeatures = value;
        return this;
    }
    
    public OriginalTableBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public OriginalTable build() {
        return new OriginalTableImpl(this);
    }

    private static final class OriginalTableImpl implements OriginalTable {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable.class;
        }

        private final List<TableFeatures> _tableFeatures;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>> augmentation;

        private OriginalTableImpl(OriginalTableBuilder builder) {
            this._tableFeatures = builder.getTableFeatures();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<TableFeatures> getTableFeatures() {
            return _tableFeatures;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
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
            OriginalTableImpl other = (OriginalTableImpl) obj;
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
            StringBuilder builder = new StringBuilder("OriginalTable [");
            boolean first = true;
        
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
