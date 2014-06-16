package org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Buckets;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter64;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.statistics.Duration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev100924.Counter32;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class GroupStatisticsBuilder {

    private Buckets _buckets;
    private Counter64 _byteCount;
    private Duration _duration;
    private GroupId _groupId;
    private Counter64 _packetCount;
    private Counter32 _refCount;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>> augmentation = new HashMap<>();

    public GroupStatisticsBuilder() {
    } 
    
    public GroupStatisticsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics arg) {
        this._buckets = arg.getBuckets();
        this._byteCount = arg.getByteCount();
        this._duration = arg.getDuration();
        this._groupId = arg.getGroupId();
        this._packetCount = arg.getPacketCount();
        this._refCount = arg.getRefCount();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics) {
            this._buckets = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getBuckets();
            this._byteCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getByteCount();
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getDuration();
            this._groupId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getGroupId();
            this._packetCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getPacketCount();
            this._refCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics)arg).getRefCount();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.GroupStatistics] \n" +
              "but was: " + arg
            );
        }
    }

    public Buckets getBuckets() {
        return _buckets;
    }
    
    public Counter64 getByteCount() {
        return _byteCount;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    public GroupId getGroupId() {
        return _groupId;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    public Counter32 getRefCount() {
        return _refCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public GroupStatisticsBuilder setBuckets(Buckets value) {
    
        this._buckets = value;
        return this;
    }
    
    public GroupStatisticsBuilder setByteCount(Counter64 value) {
    
        this._byteCount = value;
        return this;
    }
    
    public GroupStatisticsBuilder setDuration(Duration value) {
    
        this._duration = value;
        return this;
    }
    
    public GroupStatisticsBuilder setGroupId(GroupId value) {
    
        this._groupId = value;
        return this;
    }
    
    public GroupStatisticsBuilder setPacketCount(Counter64 value) {
    
        this._packetCount = value;
        return this;
    }
    
    public GroupStatisticsBuilder setRefCount(Counter32 value) {
    
        this._refCount = value;
        return this;
    }
    
    public GroupStatisticsBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public GroupStatistics build() {
        return new GroupStatisticsImpl(this);
    }

    private static final class GroupStatisticsImpl implements GroupStatistics {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics.class;
        }

        private final Buckets _buckets;
        private final Counter64 _byteCount;
        private final Duration _duration;
        private final GroupId _groupId;
        private final Counter64 _packetCount;
        private final Counter32 _refCount;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>> augmentation;

        private GroupStatisticsImpl(GroupStatisticsBuilder builder) {
            this._buckets = builder.getBuckets();
            this._byteCount = builder.getByteCount();
            this._duration = builder.getDuration();
            this._groupId = builder.getGroupId();
            this._packetCount = builder.getPacketCount();
            this._refCount = builder.getRefCount();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Buckets getBuckets() {
            return _buckets;
        }
        
        @Override
        public Counter64 getByteCount() {
            return _byteCount;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @Override
        public GroupId getGroupId() {
            return _groupId;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @Override
        public Counter32 getRefCount() {
            return _refCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.statistics.rev131111.group.statistics.GroupStatistics>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_buckets == null) ? 0 : _buckets.hashCode());
            result = prime * result + ((_byteCount == null) ? 0 : _byteCount.hashCode());
            result = prime * result + ((_duration == null) ? 0 : _duration.hashCode());
            result = prime * result + ((_groupId == null) ? 0 : _groupId.hashCode());
            result = prime * result + ((_packetCount == null) ? 0 : _packetCount.hashCode());
            result = prime * result + ((_refCount == null) ? 0 : _refCount.hashCode());
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
            GroupStatisticsImpl other = (GroupStatisticsImpl) obj;
            if (_buckets == null) {
                if (other._buckets != null) {
                    return false;
                }
            } else if(!_buckets.equals(other._buckets)) {
                return false;
            }
            if (_byteCount == null) {
                if (other._byteCount != null) {
                    return false;
                }
            } else if(!_byteCount.equals(other._byteCount)) {
                return false;
            }
            if (_duration == null) {
                if (other._duration != null) {
                    return false;
                }
            } else if(!_duration.equals(other._duration)) {
                return false;
            }
            if (_groupId == null) {
                if (other._groupId != null) {
                    return false;
                }
            } else if(!_groupId.equals(other._groupId)) {
                return false;
            }
            if (_packetCount == null) {
                if (other._packetCount != null) {
                    return false;
                }
            } else if(!_packetCount.equals(other._packetCount)) {
                return false;
            }
            if (_refCount == null) {
                if (other._refCount != null) {
                    return false;
                }
            } else if(!_refCount.equals(other._refCount)) {
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
            StringBuilder builder = new StringBuilder("GroupStatistics [");
            boolean first = true;
        
            if (_buckets != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_buckets=");
                builder.append(_buckets);
             }
            if (_byteCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_byteCount=");
                builder.append(_byteCount);
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
            if (_groupId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_groupId=");
                builder.append(_groupId);
             }
            if (_packetCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetCount=");
                builder.append(_packetCount);
             }
            if (_refCount != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_refCount=");
                builder.append(_refCount);
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