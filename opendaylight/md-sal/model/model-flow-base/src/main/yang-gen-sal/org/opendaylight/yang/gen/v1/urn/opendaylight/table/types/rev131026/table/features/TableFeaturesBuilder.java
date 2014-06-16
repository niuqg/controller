package org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableConfig;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.table.features.TableProperties;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeaturesKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class TableFeaturesBuilder {

    private TableConfig _config;
    private Long _maxEntries;
    private BigInteger _metadataMatch;
    private BigInteger _metadataWrite;
    private String _name;
    private Short _tableId;
    private TableProperties _tableProperties;
    private TableFeaturesKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> augmentation = new HashMap<>();

    public TableFeaturesBuilder() {
    } 


    public TableConfig getConfig() {
        return _config;
    }
    
    public Long getMaxEntries() {
        return _maxEntries;
    }
    
    public BigInteger getMetadataMatch() {
        return _metadataMatch;
    }
    
    public BigInteger getMetadataWrite() {
        return _metadataWrite;
    }
    
    public String getName() {
        return _name;
    }
    
    public Short getTableId() {
        return _tableId;
    }
    
    public TableProperties getTableProperties() {
        return _tableProperties;
    }
    
    public TableFeaturesKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public TableFeaturesBuilder setConfig(TableConfig value) {
    
        this._config = value;
        return this;
    }
    
    public TableFeaturesBuilder setMaxEntries(Long value) {
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
    
        this._maxEntries = value;
        return this;
    }
    
    public TableFeaturesBuilder setMetadataMatch(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._metadataMatch = value;
        return this;
    }
    
    public TableFeaturesBuilder setMetadataWrite(BigInteger value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<BigInteger>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new BigInteger("0"), new BigInteger("18446744073709551615")));
            for (Range<BigInteger> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._metadataWrite = value;
        return this;
    }
    
    public TableFeaturesBuilder setName(String value) {
    
        this._name = value;
        return this;
    }
    
    public TableFeaturesBuilder setTableId(Short value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Short>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Short("0"), new Short("255")));
            for (Range<Short> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._tableId = value;
        return this;
    }
    
    public TableFeaturesBuilder setTableProperties(TableProperties value) {
    
        this._tableProperties = value;
        return this;
    }
    
    public TableFeaturesBuilder setKey(TableFeaturesKey value) {
    
        this._key = value;
        return this;
    }
    
    public TableFeaturesBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public TableFeatures build() {
        return new TableFeaturesImpl(this);
    }

    private static final class TableFeaturesImpl implements TableFeatures {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures.class;
        }

        private final TableConfig _config;
        private final Long _maxEntries;
        private final BigInteger _metadataMatch;
        private final BigInteger _metadataWrite;
        private final String _name;
        private final Short _tableId;
        private final TableProperties _tableProperties;
        private final TableFeaturesKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> augmentation;

        private TableFeaturesImpl(TableFeaturesBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new TableFeaturesKey(
                    builder.getTableId()
                );
                this._tableId = builder.getTableId();
            } else {
                this._key = builder.getKey();
                this._tableId = _key.getTableId();
            }
            this._config = builder.getConfig();
            this._maxEntries = builder.getMaxEntries();
            this._metadataMatch = builder.getMetadataMatch();
            this._metadataWrite = builder.getMetadataWrite();
            this._name = builder.getName();
            this._tableProperties = builder.getTableProperties();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public TableConfig getConfig() {
            return _config;
        }
        
        @Override
        public Long getMaxEntries() {
            return _maxEntries;
        }
        
        @Override
        public BigInteger getMetadataMatch() {
            return _metadataMatch;
        }
        
        @Override
        public BigInteger getMetadataWrite() {
            return _metadataWrite;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Short getTableId() {
            return _tableId;
        }
        
        @Override
        public TableProperties getTableProperties() {
            return _tableProperties;
        }
        
        @Override
        public TableFeaturesKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.table.features.TableFeatures>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_config == null) ? 0 : _config.hashCode());
            result = prime * result + ((_maxEntries == null) ? 0 : _maxEntries.hashCode());
            result = prime * result + ((_metadataMatch == null) ? 0 : _metadataMatch.hashCode());
            result = prime * result + ((_metadataWrite == null) ? 0 : _metadataWrite.hashCode());
            result = prime * result + ((_name == null) ? 0 : _name.hashCode());
            result = prime * result + ((_tableId == null) ? 0 : _tableId.hashCode());
            result = prime * result + ((_tableProperties == null) ? 0 : _tableProperties.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
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
            TableFeaturesImpl other = (TableFeaturesImpl) obj;
            if (_config == null) {
                if (other._config != null) {
                    return false;
                }
            } else if(!_config.equals(other._config)) {
                return false;
            }
            if (_maxEntries == null) {
                if (other._maxEntries != null) {
                    return false;
                }
            } else if(!_maxEntries.equals(other._maxEntries)) {
                return false;
            }
            if (_metadataMatch == null) {
                if (other._metadataMatch != null) {
                    return false;
                }
            } else if(!_metadataMatch.equals(other._metadataMatch)) {
                return false;
            }
            if (_metadataWrite == null) {
                if (other._metadataWrite != null) {
                    return false;
                }
            } else if(!_metadataWrite.equals(other._metadataWrite)) {
                return false;
            }
            if (_name == null) {
                if (other._name != null) {
                    return false;
                }
            } else if(!_name.equals(other._name)) {
                return false;
            }
            if (_tableId == null) {
                if (other._tableId != null) {
                    return false;
                }
            } else if(!_tableId.equals(other._tableId)) {
                return false;
            }
            if (_tableProperties == null) {
                if (other._tableProperties != null) {
                    return false;
                }
            } else if(!_tableProperties.equals(other._tableProperties)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
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
            StringBuilder builder = new StringBuilder("TableFeatures [");
            boolean first = true;
        
            if (_config != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_config=");
                builder.append(_config);
             }
            if (_maxEntries != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxEntries=");
                builder.append(_maxEntries);
             }
            if (_metadataMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadataMatch=");
                builder.append(_metadataMatch);
             }
            if (_metadataWrite != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_metadataWrite=");
                builder.append(_metadataWrite);
             }
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_tableId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableId=");
                builder.append(_tableId);
             }
            if (_tableProperties != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tableProperties=");
                builder.append(_tableProperties);
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
