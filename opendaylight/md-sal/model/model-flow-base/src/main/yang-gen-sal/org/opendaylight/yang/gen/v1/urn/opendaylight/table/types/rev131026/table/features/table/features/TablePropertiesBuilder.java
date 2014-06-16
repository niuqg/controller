package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class TablePropertiesBuilder {

    private List<TableFeatureProperties> _tableFeatureProperties;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>> augmentation = new HashMap<>();

    public TablePropertiesBuilder() {
    } 


    public List<TableFeatureProperties> getTableFeatureProperties() {
        return _tableFeatureProperties;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TablePropertiesBuilder setTableFeatureProperties(List<TableFeatureProperties> value) {
    
        this._tableFeatureProperties = value;
        return this;
    }
    
    public TablePropertiesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TableProperties build() {
        return new TablePropertiesImpl(this);
    }

    private static final class TablePropertiesImpl implements TableProperties {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties.class;
        }

        private final List<TableFeatureProperties> _tableFeatureProperties;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>> augmentation;

        private TablePropertiesImpl(TablePropertiesBuilder builder) {
            this._tableFeatureProperties = builder.getTableFeatureProperties();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public List<TableFeatureProperties> getTableFeatureProperties() {
            return _tableFeatureProperties;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_tableFeatureProperties == null) ? 0 : _tableFeatureProperties.hashCode());
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
            TablePropertiesImpl other = (TablePropertiesImpl) obj;
            if (_tableFeatureProperties == null) {
                if (other._tableFeatureProperties != null) {
                    return false;
                }
            } else if(!_tableFeatureProperties.equals(other._tableFeatureProperties)) {
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
            StringBuilder builder = new StringBuilder("TableProperties [");
            boolean first = true;
        
            if (_tableFeatureProperties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableFeatureProperties=");
                builder.append(_tableFeatureProperties);
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
