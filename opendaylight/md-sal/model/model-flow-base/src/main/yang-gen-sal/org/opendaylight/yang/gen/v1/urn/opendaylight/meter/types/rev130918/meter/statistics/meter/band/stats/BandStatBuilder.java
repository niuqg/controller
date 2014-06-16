package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.BandId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStatKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.Collections;



public class BandStatBuilder {

    private BandId _bandId;
    private Counter64 _byteBandCount;
    private Counter64 _packetBandCount;
    private BandStatKey _key;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> augmentation = new HashMap<>();

    public BandStatBuilder() {
    } 


    public BandId getBandId() {
        return _bandId;
    }
    
    public Counter64 getByteBandCount() {
        return _byteBandCount;
    }
    
    public Counter64 getPacketBandCount() {
        return _packetBandCount;
    }
    
    public BandStatKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BandStatBuilder setBandId(BandId value) {
    
        this._bandId = value;
        return this;
    }
    
    public BandStatBuilder setByteBandCount(Counter64 value) {
    
        this._byteBandCount = value;
        return this;
    }
    
    public BandStatBuilder setPacketBandCount(Counter64 value) {
    
        this._packetBandCount = value;
        return this;
    }
    
    public BandStatBuilder setKey(BandStatKey value) {
    
        this._key = value;
        return this;
    }
    
    public BandStatBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public BandStat build() {
        return new BandStatImpl(this);
    }

    private static final class BandStatImpl implements BandStat {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat.class;
        }

        private final BandId _bandId;
        private final Counter64 _byteBandCount;
        private final Counter64 _packetBandCount;
        private final BandStatKey _key;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> augmentation;

        private BandStatImpl(BandStatBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new BandStatKey(
                    builder.getBandId()
                );
                this._bandId = builder.getBandId();
            } else {
                this._key = builder.getKey();
                this._bandId = _key.getBandId();
            }
            this._byteBandCount = builder.getByteBandCount();
            this._packetBandCount = builder.getPacketBandCount();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public BandId getBandId() {
            return _bandId;
        }
        
        @Override
        public Counter64 getByteBandCount() {
            return _byteBandCount;
        }
        
        @Override
        public Counter64 getPacketBandCount() {
            return _packetBandCount;
        }
        
        @Override
        public BandStatKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.meter.band.stats.BandStat>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bandId == null) ? 0 : _bandId.hashCode());
            result = prime * result + ((_byteBandCount == null) ? 0 : _byteBandCount.hashCode());
            result = prime * result + ((_packetBandCount == null) ? 0 : _packetBandCount.hashCode());
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
            BandStatImpl other = (BandStatImpl) obj;
            if (_bandId == null) {
                if (other._bandId != null) {
                    return false;
                }
            } else if(!_bandId.equals(other._bandId)) {
                return false;
            }
            if (_byteBandCount == null) {
                if (other._byteBandCount != null) {
                    return false;
                }
            } else if(!_byteBandCount.equals(other._byteBandCount)) {
                return false;
            }
            if (_packetBandCount == null) {
                if (other._packetBandCount != null) {
                    return false;
                }
            } else if(!_packetBandCount.equals(other._packetBandCount)) {
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
            StringBuilder builder = new StringBuilder("BandStat [");
            boolean first = true;
        
            if (_bandId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandId=");
                builder.append(_bandId);
             }
            if (_byteBandCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteBandCount=");
                builder.append(_byteBandCount);
             }
            if (_packetBandCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetBandCount=");
                builder.append(_packetBandCount);
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
