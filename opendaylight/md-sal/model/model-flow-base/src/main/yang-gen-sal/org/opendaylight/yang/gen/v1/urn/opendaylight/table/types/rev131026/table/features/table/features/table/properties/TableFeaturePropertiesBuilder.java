package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeaturePropertiesKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.feature.prop.type.TableFeaturePropType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class TableFeaturePropertiesBuilder {

    private Integer _order;
    private TableFeaturePropertiesKey _key;
    private TableFeaturePropType _tableFeaturePropType;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> augmentation = new HashMap<>();

    public TableFeaturePropertiesBuilder() {
    } 
    
    public TableFeaturePropertiesBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType arg) {
        this._tableFeaturePropType = arg.getTableFeaturePropType();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType) {
            this._tableFeaturePropType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType)arg).getTableFeaturePropType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeaturePropType] \n" +
              "but was: " + arg
            );
        }
    }

    public Integer getOrder() {
        return _order;
    }
    
    public TableFeaturePropertiesKey getKey() {
        return _key;
    }
    
    public TableFeaturePropType getTableFeaturePropType() {
        return _tableFeaturePropType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TableFeaturePropertiesBuilder setOrder(Integer value) {
    
        this._order = value;
        return this;
    }
    
    public TableFeaturePropertiesBuilder setKey(TableFeaturePropertiesKey value) {
    
        this._key = value;
        return this;
    }
    
    public TableFeaturePropertiesBuilder setTableFeaturePropType(TableFeaturePropType value) {
    
        this._tableFeaturePropType = value;
        return this;
    }
    
    public TableFeaturePropertiesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TableFeatureProperties build() {
        return new TableFeaturePropertiesImpl(this);
    }

    private static final class TableFeaturePropertiesImpl implements TableFeatureProperties {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties.class;
        }

        private final Integer _order;
        private final TableFeaturePropertiesKey _key;
        private final TableFeaturePropType _tableFeaturePropType;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> augmentation;

        private TableFeaturePropertiesImpl(TableFeaturePropertiesBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new TableFeaturePropertiesKey(
                    builder.getOrder()
                );
                this._order = builder.getOrder();
            } else {
                this._key = builder.getKey();
                this._order = _key.getOrder();
            }
            this._tableFeaturePropType = builder.getTableFeaturePropType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Integer getOrder() {
            return _order;
        }
        
        @Override
        public TableFeaturePropertiesKey getKey() {
            return _key;
        }
        
        @Override
        public TableFeaturePropType getTableFeaturePropType() {
            return _tableFeaturePropType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.table.properties.TableFeatureProperties>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_order == null) ? 0 : _order.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_tableFeaturePropType == null) ? 0 : _tableFeaturePropType.hashCode());
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
            TableFeaturePropertiesImpl other = (TableFeaturePropertiesImpl) obj;
            if (_order == null) {
                if (other._order != null) {
                    return false;
                }
            } else if(!_order.equals(other._order)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_tableFeaturePropType == null) {
                if (other._tableFeaturePropType != null) {
                    return false;
                }
            } else if(!_tableFeaturePropType.equals(other._tableFeaturePropType)) {
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
            StringBuilder builder = new StringBuilder("TableFeatureProperties [");
            boolean first = true;
        
            if (_order != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_order=");
                builder.append(_order);
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
            if (_tableFeaturePropType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableFeaturePropType=");
                builder.append(_tableFeaturePropType);
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
