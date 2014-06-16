package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.MeterBandHeaders;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class OriginalMeterBuilder {

    private Boolean _barrier;
    private String _containerName;
    private MeterFlags _flags;
    private MeterBandHeaders _meterBandHeaders;
    private MeterId _meterId;
    private String _meterName;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>> augmentation = new HashMap<>();

    public OriginalMeterBuilder() {
    } 
    
    public OriginalMeterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter arg) {
        this._barrier = arg.isBarrier();
        this._containerName = arg.getContainerName();
        this._flags = arg.getFlags();
        this._meterBandHeaders = arg.getMeterBandHeaders();
        this._meterId = arg.getMeterId();
        this._meterName = arg.getMeterName();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter) {
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).isBarrier();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getContainerName();
            this._flags = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getFlags();
            this._meterBandHeaders = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterBandHeaders();
            this._meterId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterId();
            this._meterName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter)arg).getMeterName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.Meter] \n" +
              "but was: " + arg
            );
        }
    }

    public Boolean isBarrier() {
        return _barrier;
    }
    
    public String getContainerName() {
        return _containerName;
    }
    
    public MeterFlags getFlags() {
        return _flags;
    }
    
    public MeterBandHeaders getMeterBandHeaders() {
        return _meterBandHeaders;
    }
    
    public MeterId getMeterId() {
        return _meterId;
    }
    
    public String getMeterName() {
        return _meterName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OriginalMeterBuilder setBarrier(Boolean value) {
    
        this._barrier = value;
        return this;
    }
    
    public OriginalMeterBuilder setContainerName(String value) {
    
        this._containerName = value;
        return this;
    }
    
    public OriginalMeterBuilder setFlags(MeterFlags value) {
    
        this._flags = value;
        return this;
    }
    
    public OriginalMeterBuilder setMeterBandHeaders(MeterBandHeaders value) {
    
        this._meterBandHeaders = value;
        return this;
    }
    
    public OriginalMeterBuilder setMeterId(MeterId value) {
    
        this._meterId = value;
        return this;
    }
    
    public OriginalMeterBuilder setMeterName(String value) {
    
        this._meterName = value;
        return this;
    }
    
    public OriginalMeterBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public OriginalMeter build() {
        return new OriginalMeterImpl(this);
    }

    private static final class OriginalMeterImpl implements OriginalMeter {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter.class;
        }

        private final Boolean _barrier;
        private final String _containerName;
        private final MeterFlags _flags;
        private final MeterBandHeaders _meterBandHeaders;
        private final MeterId _meterId;
        private final String _meterName;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>> augmentation;

        private OriginalMeterImpl(OriginalMeterBuilder builder) {
            this._barrier = builder.isBarrier();
            this._containerName = builder.getContainerName();
            this._flags = builder.getFlags();
            this._meterBandHeaders = builder.getMeterBandHeaders();
            this._meterId = builder.getMeterId();
            this._meterName = builder.getMeterName();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Boolean isBarrier() {
            return _barrier;
        }
        
        @Override
        public String getContainerName() {
            return _containerName;
        }
        
        @Override
        public MeterFlags getFlags() {
            return _flags;
        }
        
        @Override
        public MeterBandHeaders getMeterBandHeaders() {
            return _meterBandHeaders;
        }
        
        @Override
        public MeterId getMeterId() {
            return _meterId;
        }
        
        @Override
        public String getMeterName() {
            return _meterName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.service.rev130918.meter.update.OriginalMeter>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_barrier == null) ? 0 : _barrier.hashCode());
            result = prime * result + ((_containerName == null) ? 0 : _containerName.hashCode());
            result = prime * result + ((_flags == null) ? 0 : _flags.hashCode());
            result = prime * result + ((_meterBandHeaders == null) ? 0 : _meterBandHeaders.hashCode());
            result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
            result = prime * result + ((_meterName == null) ? 0 : _meterName.hashCode());
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
            OriginalMeterImpl other = (OriginalMeterImpl) obj;
            if (_barrier == null) {
                if (other._barrier != null) {
                    return false;
                }
            } else if(!_barrier.equals(other._barrier)) {
                return false;
            }
            if (_containerName == null) {
                if (other._containerName != null) {
                    return false;
                }
            } else if(!_containerName.equals(other._containerName)) {
                return false;
            }
            if (_flags == null) {
                if (other._flags != null) {
                    return false;
                }
            } else if(!_flags.equals(other._flags)) {
                return false;
            }
            if (_meterBandHeaders == null) {
                if (other._meterBandHeaders != null) {
                    return false;
                }
            } else if(!_meterBandHeaders.equals(other._meterBandHeaders)) {
                return false;
            }
            if (_meterId == null) {
                if (other._meterId != null) {
                    return false;
                }
            } else if(!_meterId.equals(other._meterId)) {
                return false;
            }
            if (_meterName == null) {
                if (other._meterName != null) {
                    return false;
                }
            } else if(!_meterName.equals(other._meterName)) {
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
            StringBuilder builder = new StringBuilder("OriginalMeter [");
            boolean first = true;
        
            if (_barrier != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_barrier=");
                builder.append(_barrier);
             }
            if (_containerName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_containerName=");
                builder.append(_containerName);
             }
            if (_flags != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flags=");
                builder.append(_flags);
             }
            if (_meterBandHeaders != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandHeaders=");
                builder.append(_meterBandHeaders);
             }
            if (_meterId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterId=");
                builder.append(_meterId);
             }
            if (_meterName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterName=");
                builder.append(_meterName);
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
