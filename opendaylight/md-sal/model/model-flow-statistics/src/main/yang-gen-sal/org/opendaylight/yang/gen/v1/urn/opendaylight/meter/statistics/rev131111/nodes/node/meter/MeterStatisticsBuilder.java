package org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.meter.statistics.MeterBandStats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class MeterStatisticsBuilder {

    private Counter64 _byteInCount;
    private Duration _duration;
    private Counter32 _flowCount;
    private MeterBandStats _meterBandStats;
    private MeterId _meterId;
    private Counter64 _packetInCount;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>> augmentation = new HashMap<>();

    public MeterStatisticsBuilder() {
    } 
    
    public MeterStatisticsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics arg) {
        this._byteInCount = arg.getByteInCount();
        this._duration = arg.getDuration();
        this._flowCount = arg.getFlowCount();
        this._meterBandStats = arg.getMeterBandStats();
        this._meterId = arg.getMeterId();
        this._packetInCount = arg.getPacketInCount();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics) {
            this._byteInCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getByteInCount();
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getDuration();
            this._flowCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getFlowCount();
            this._meterBandStats = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getMeterBandStats();
            this._meterId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getMeterId();
            this._packetInCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics)arg).getPacketInCount();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.meter.types.rev130918.MeterStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public Counter64 getByteInCount() {
        return _byteInCount;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    public Counter32 getFlowCount() {
        return _flowCount;
    }
    
    public MeterBandStats getMeterBandStats() {
        return _meterBandStats;
    }
    
    public MeterId getMeterId() {
        return _meterId;
    }
    
    public Counter64 getPacketInCount() {
        return _packetInCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public MeterStatisticsBuilder setByteInCount(Counter64 value) {
    
        this._byteInCount = value;
        return this;
    }
    
    public MeterStatisticsBuilder setDuration(Duration value) {
    
        this._duration = value;
        return this;
    }
    
    public MeterStatisticsBuilder setFlowCount(Counter32 value) {
    
        this._flowCount = value;
        return this;
    }
    
    public MeterStatisticsBuilder setMeterBandStats(MeterBandStats value) {
    
        this._meterBandStats = value;
        return this;
    }
    
    public MeterStatisticsBuilder setMeterId(MeterId value) {
    
        this._meterId = value;
        return this;
    }
    
    public MeterStatisticsBuilder setPacketInCount(Counter64 value) {
    
        this._packetInCount = value;
        return this;
    }
    
    public MeterStatisticsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public MeterStatistics build() {
        return new MeterStatisticsImpl(this);
    }

    private static final class MeterStatisticsImpl implements MeterStatistics {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics.class;
        }

        private final Counter64 _byteInCount;
        private final Duration _duration;
        private final Counter32 _flowCount;
        private final MeterBandStats _meterBandStats;
        private final MeterId _meterId;
        private final Counter64 _packetInCount;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>> augmentation;

        private MeterStatisticsImpl(MeterStatisticsBuilder builder) {
            this._byteInCount = builder.getByteInCount();
            this._duration = builder.getDuration();
            this._flowCount = builder.getFlowCount();
            this._meterBandStats = builder.getMeterBandStats();
            this._meterId = builder.getMeterId();
            this._packetInCount = builder.getPacketInCount();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Counter64 getByteInCount() {
            return _byteInCount;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @Override
        public Counter32 getFlowCount() {
            return _flowCount;
        }
        
        @Override
        public MeterBandStats getMeterBandStats() {
            return _meterBandStats;
        }
        
        @Override
        public MeterId getMeterId() {
            return _meterId;
        }
        
        @Override
        public Counter64 getPacketInCount() {
            return _packetInCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.meter.statistics.rev131111.nodes.node.meter.MeterStatistics>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_byteInCount == null) ? 0 : _byteInCount.hashCode());
            result = prime * result + ((_duration == null) ? 0 : _duration.hashCode());
            result = prime * result + ((_flowCount == null) ? 0 : _flowCount.hashCode());
            result = prime * result + ((_meterBandStats == null) ? 0 : _meterBandStats.hashCode());
            result = prime * result + ((_meterId == null) ? 0 : _meterId.hashCode());
            result = prime * result + ((_packetInCount == null) ? 0 : _packetInCount.hashCode());
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
            MeterStatisticsImpl other = (MeterStatisticsImpl) obj;
            if (_byteInCount == null) {
                if (other._byteInCount != null) {
                    return false;
                }
            } else if(!_byteInCount.equals(other._byteInCount)) {
                return false;
            }
            if (_duration == null) {
                if (other._duration != null) {
                    return false;
                }
            } else if(!_duration.equals(other._duration)) {
                return false;
            }
            if (_flowCount == null) {
                if (other._flowCount != null) {
                    return false;
                }
            } else if(!_flowCount.equals(other._flowCount)) {
                return false;
            }
            if (_meterBandStats == null) {
                if (other._meterBandStats != null) {
                    return false;
                }
            } else if(!_meterBandStats.equals(other._meterBandStats)) {
                return false;
            }
            if (_meterId == null) {
                if (other._meterId != null) {
                    return false;
                }
            } else if(!_meterId.equals(other._meterId)) {
                return false;
            }
            if (_packetInCount == null) {
                if (other._packetInCount != null) {
                    return false;
                }
            } else if(!_packetInCount.equals(other._packetInCount)) {
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
            StringBuilder builder = new StringBuilder("MeterStatistics [");
            boolean first = true;
        
            if (_byteInCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteInCount=");
                builder.append(_byteInCount);
             }
            if (_duration != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_duration=");
                builder.append(_duration);
             }
            if (_flowCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_flowCount=");
                builder.append(_flowCount);
             }
            if (_meterBandStats != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_meterBandStats=");
                builder.append(_meterBandStats);
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
            if (_packetInCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetInCount=");
                builder.append(_packetInCount);
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
