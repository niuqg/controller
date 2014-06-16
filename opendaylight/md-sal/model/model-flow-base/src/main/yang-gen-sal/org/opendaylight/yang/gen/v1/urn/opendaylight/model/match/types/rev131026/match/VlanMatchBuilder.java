package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.vlan.match.fields.VlanId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class VlanMatchBuilder {

    private VlanId _vlanId;
    private VlanPcp _vlanPcp;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>> augmentation = new HashMap<>();

    public VlanMatchBuilder() {
    } 
    
    public VlanMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields arg) {
        this._vlanId = arg.getVlanId();
        this._vlanPcp = arg.getVlanPcp();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields) {
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields)arg).getVlanId();
            this._vlanPcp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields)arg).getVlanPcp();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.VlanMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public VlanId getVlanId() {
        return _vlanId;
    }
    
    public VlanPcp getVlanPcp() {
        return _vlanPcp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public VlanMatchBuilder setVlanId(VlanId value) {
    
        this._vlanId = value;
        return this;
    }
    
    public VlanMatchBuilder setVlanPcp(VlanPcp value) {
    
        this._vlanPcp = value;
        return this;
    }
    
    public VlanMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public VlanMatch build() {
        return new VlanMatchImpl(this);
    }

    private static final class VlanMatchImpl implements VlanMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch.class;
        }

        private final VlanId _vlanId;
        private final VlanPcp _vlanPcp;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>> augmentation;

        private VlanMatchImpl(VlanMatchBuilder builder) {
            this._vlanId = builder.getVlanId();
            this._vlanPcp = builder.getVlanPcp();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @Override
        public VlanPcp getVlanPcp() {
            return _vlanPcp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.VlanMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_vlanId == null) ? 0 : _vlanId.hashCode());
            result = prime * result + ((_vlanPcp == null) ? 0 : _vlanPcp.hashCode());
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
            VlanMatchImpl other = (VlanMatchImpl) obj;
            if (_vlanId == null) {
                if (other._vlanId != null) {
                    return false;
                }
            } else if(!_vlanId.equals(other._vlanId)) {
                return false;
            }
            if (_vlanPcp == null) {
                if (other._vlanPcp != null) {
                    return false;
                }
            } else if(!_vlanPcp.equals(other._vlanPcp)) {
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
            StringBuilder builder = new StringBuilder("VlanMatch [");
            boolean first = true;
        
            if (_vlanId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlanId=");
                builder.append(_vlanId);
             }
            if (_vlanPcp != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_vlanPcp=");
                builder.append(_vlanPcp);
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
