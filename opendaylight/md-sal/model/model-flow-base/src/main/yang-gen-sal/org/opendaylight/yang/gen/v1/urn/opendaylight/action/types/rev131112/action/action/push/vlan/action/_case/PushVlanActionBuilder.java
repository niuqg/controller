package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.VlanCfi;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class PushVlanActionBuilder {

    private VlanCfi _cfi;
    private Integer _ethernetType;
    private Integer _pcp;
    private Integer _tag;
    private VlanId _vlanId;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> augmentation = new HashMap<>();

    public PushVlanActionBuilder() {
    } 


    public VlanCfi getCfi() {
        return _cfi;
    }
    
    public Integer getEthernetType() {
        return _ethernetType;
    }
    
    public Integer getPcp() {
        return _pcp;
    }
    
    public Integer getTag() {
        return _tag;
    }
    
    public VlanId getVlanId() {
        return _vlanId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PushVlanActionBuilder setCfi(VlanCfi value) {
    
        this._cfi = value;
        return this;
    }
    
    public PushVlanActionBuilder setEthernetType(Integer value) {
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
    
        this._ethernetType = value;
        return this;
    }
    
    public PushVlanActionBuilder setPcp(Integer value) {
    
        this._pcp = value;
        return this;
    }
    
    public PushVlanActionBuilder setTag(Integer value) {
    
        this._tag = value;
        return this;
    }
    
    public PushVlanActionBuilder setVlanId(VlanId value) {
    
        this._vlanId = value;
        return this;
    }
    
    public PushVlanActionBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PushVlanAction build() {
        return new PushVlanActionImpl(this);
    }

    private static final class PushVlanActionImpl implements PushVlanAction {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction.class;
        }

        private final VlanCfi _cfi;
        private final Integer _ethernetType;
        private final Integer _pcp;
        private final Integer _tag;
        private final VlanId _vlanId;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> augmentation;

        private PushVlanActionImpl(PushVlanActionBuilder builder) {
            this._cfi = builder.getCfi();
            this._ethernetType = builder.getEthernetType();
            this._pcp = builder.getPcp();
            this._tag = builder.getTag();
            this._vlanId = builder.getVlanId();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public VlanCfi getCfi() {
            return _cfi;
        }
        
        @Override
        public Integer getEthernetType() {
            return _ethernetType;
        }
        
        @Override
        public Integer getPcp() {
            return _pcp;
        }
        
        @Override
        public Integer getTag() {
            return _tag;
        }
        
        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.push.vlan.action._case.PushVlanAction>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_cfi == null) ? 0 : _cfi.hashCode());
            result = prime * result + ((_ethernetType == null) ? 0 : _ethernetType.hashCode());
            result = prime * result + ((_pcp == null) ? 0 : _pcp.hashCode());
            result = prime * result + ((_tag == null) ? 0 : _tag.hashCode());
            result = prime * result + ((_vlanId == null) ? 0 : _vlanId.hashCode());
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
            PushVlanActionImpl other = (PushVlanActionImpl) obj;
            if (_cfi == null) {
                if (other._cfi != null) {
                    return false;
                }
            } else if(!_cfi.equals(other._cfi)) {
                return false;
            }
            if (_ethernetType == null) {
                if (other._ethernetType != null) {
                    return false;
                }
            } else if(!_ethernetType.equals(other._ethernetType)) {
                return false;
            }
            if (_pcp == null) {
                if (other._pcp != null) {
                    return false;
                }
            } else if(!_pcp.equals(other._pcp)) {
                return false;
            }
            if (_tag == null) {
                if (other._tag != null) {
                    return false;
                }
            } else if(!_tag.equals(other._tag)) {
                return false;
            }
            if (_vlanId == null) {
                if (other._vlanId != null) {
                    return false;
                }
            } else if(!_vlanId.equals(other._vlanId)) {
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
            StringBuilder builder = new StringBuilder("PushVlanAction [");
            boolean first = true;
        
            if (_cfi != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_cfi=");
                builder.append(_cfi);
             }
            if (_ethernetType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetType=");
                builder.append(_ethernetType);
             }
            if (_pcp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_pcp=");
                builder.append(_pcp);
             }
            if (_tag != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tag=");
                builder.append(_tag);
             }
            if (_vlanId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlanId=");
                builder.append(_vlanId);
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
