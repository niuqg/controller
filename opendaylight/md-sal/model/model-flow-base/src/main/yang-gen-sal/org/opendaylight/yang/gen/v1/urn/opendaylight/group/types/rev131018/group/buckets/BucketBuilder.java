package org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.BucketId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.BucketKey;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.Action;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class BucketBuilder {

    private BucketId _bucketId;
    private Long _watchGroup;
    private Long _watchPort;
    private Integer _weight;
    private BucketKey _key;
    private List<Action> _action;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> augmentation = new HashMap<>();

    public BucketBuilder() {
    } 
    
    public BucketBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList arg) {
        this._action = arg.getAction();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList) {
            this._action = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList)arg).getAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.ActionList] \n" +
              "but was: " + arg
            );
        }
    }

    public BucketId getBucketId() {
        return _bucketId;
    }
    
    public Long getWatchGroup() {
        return _watchGroup;
    }
    
    public Long getWatchPort() {
        return _watchPort;
    }
    
    public Integer getWeight() {
        return _weight;
    }
    
    public BucketKey getKey() {
        return _key;
    }
    
    public List<Action> getAction() {
        return _action;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public BucketBuilder setBucketId(BucketId value) {
    
        this._bucketId = value;
        return this;
    }
    
    public BucketBuilder setWatchGroup(Long value) {
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
    
        this._watchGroup = value;
        return this;
    }
    
    public BucketBuilder setWatchPort(Long value) {
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
    
        this._watchPort = value;
        return this;
    }
    
    public BucketBuilder setWeight(Integer value) {
        if (value != null) {
            boolean isValidRange = false;
            List<Range<Integer>> rangeConstraints = new ArrayList<>(); 
            rangeConstraints.add(Range.closed(new Integer("0"), new Integer("65535")));
            for (Range<Integer> r : rangeConstraints) {
                if (r.contains(value)) {
                isValidRange = true;
                }
            }
            if (!isValidRange) {
                throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, rangeConstraints));
            }
        }
    
        this._weight = value;
        return this;
    }
    
    public BucketBuilder setKey(BucketKey value) {
    
        this._key = value;
        return this;
    }
    
    public BucketBuilder setAction(List<Action> value) {
    
        this._action = value;
        return this;
    }
    
    public BucketBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Bucket build() {
        return new BucketImpl(this);
    }

    private static final class BucketImpl implements Bucket {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket.class;
        }

        private final BucketId _bucketId;
        private final Long _watchGroup;
        private final Long _watchPort;
        private final Integer _weight;
        private final BucketKey _key;
        private final List<Action> _action;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> augmentation;

        private BucketImpl(BucketBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new BucketKey(
                    builder.getBucketId()
                );
                this._bucketId = builder.getBucketId();
            } else {
                this._key = builder.getKey();
                this._bucketId = _key.getBucketId();
            }
            this._watchGroup = builder.getWatchGroup();
            this._watchPort = builder.getWatchPort();
            this._weight = builder.getWeight();
            this._action = builder.getAction();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public BucketId getBucketId() {
            return _bucketId;
        }
        
        @Override
        public Long getWatchGroup() {
            return _watchGroup;
        }
        
        @Override
        public Long getWatchPort() {
            return _watchPort;
        }
        
        @Override
        public Integer getWeight() {
            return _weight;
        }
        
        @Override
        public BucketKey getKey() {
            return _key;
        }
        
        @Override
        public List<Action> getAction() {
            return _action;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.group.types.rev131018.group.buckets.Bucket>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_bucketId == null) ? 0 : _bucketId.hashCode());
            result = prime * result + ((_watchGroup == null) ? 0 : _watchGroup.hashCode());
            result = prime * result + ((_watchPort == null) ? 0 : _watchPort.hashCode());
            result = prime * result + ((_weight == null) ? 0 : _weight.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_action == null) ? 0 : _action.hashCode());
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
            BucketImpl other = (BucketImpl) obj;
            if (_bucketId == null) {
                if (other._bucketId != null) {
                    return false;
                }
            } else if(!_bucketId.equals(other._bucketId)) {
                return false;
            }
            if (_watchGroup == null) {
                if (other._watchGroup != null) {
                    return false;
                }
            } else if(!_watchGroup.equals(other._watchGroup)) {
                return false;
            }
            if (_watchPort == null) {
                if (other._watchPort != null) {
                    return false;
                }
            } else if(!_watchPort.equals(other._watchPort)) {
                return false;
            }
            if (_weight == null) {
                if (other._weight != null) {
                    return false;
                }
            } else if(!_weight.equals(other._weight)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_action == null) {
                if (other._action != null) {
                    return false;
                }
            } else if(!_action.equals(other._action)) {
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
            StringBuilder builder = new StringBuilder("Bucket [");
            boolean first = true;
        
            if (_bucketId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bucketId=");
                builder.append(_bucketId);
             }
            if (_watchGroup != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_watchGroup=");
                builder.append(_watchGroup);
             }
            if (_watchPort != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_watchPort=");
                builder.append(_watchPort);
             }
            if (_weight != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_weight=");
                builder.append(_weight);
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
            if (_action != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_action=");
                builder.append(_action);
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
