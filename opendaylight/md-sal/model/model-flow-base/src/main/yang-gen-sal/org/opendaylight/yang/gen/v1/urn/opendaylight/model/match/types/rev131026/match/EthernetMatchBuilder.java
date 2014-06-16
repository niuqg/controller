package org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetDestination;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetSource;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.ethernet.match.fields.EthernetType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class EthernetMatchBuilder {

    private EthernetDestination _ethernetDestination;
    private EthernetSource _ethernetSource;
    private EthernetType _ethernetType;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>> augmentation = new HashMap<>();

    public EthernetMatchBuilder() {
    } 
    
    public EthernetMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields arg) {
        this._ethernetDestination = arg.getEthernetDestination();
        this._ethernetSource = arg.getEthernetSource();
        this._ethernetType = arg.getEthernetType();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields) {
            this._ethernetDestination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields)arg).getEthernetDestination();
            this._ethernetSource = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields)arg).getEthernetSource();
            this._ethernetType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields)arg).getEthernetType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.EthernetMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public EthernetDestination getEthernetDestination() {
        return _ethernetDestination;
    }
    
    public EthernetSource getEthernetSource() {
        return _ethernetSource;
    }
    
    public EthernetType getEthernetType() {
        return _ethernetType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public EthernetMatchBuilder setEthernetDestination(EthernetDestination value) {
    
        this._ethernetDestination = value;
        return this;
    }
    
    public EthernetMatchBuilder setEthernetSource(EthernetSource value) {
    
        this._ethernetSource = value;
        return this;
    }
    
    public EthernetMatchBuilder setEthernetType(EthernetType value) {
    
        this._ethernetType = value;
        return this;
    }
    
    public EthernetMatchBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public EthernetMatch build() {
        return new EthernetMatchImpl(this);
    }

    private static final class EthernetMatchImpl implements EthernetMatch {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch.class;
        }

        private final EthernetDestination _ethernetDestination;
        private final EthernetSource _ethernetSource;
        private final EthernetType _ethernetType;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>> augmentation;

        private EthernetMatchImpl(EthernetMatchBuilder builder) {
            this._ethernetDestination = builder.getEthernetDestination();
            this._ethernetSource = builder.getEthernetSource();
            this._ethernetType = builder.getEthernetType();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public EthernetDestination getEthernetDestination() {
            return _ethernetDestination;
        }
        
        @Override
        public EthernetSource getEthernetSource() {
            return _ethernetSource;
        }
        
        @Override
        public EthernetType getEthernetType() {
            return _ethernetType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.model.match.types.rev131026.match.EthernetMatch>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_ethernetDestination == null) ? 0 : _ethernetDestination.hashCode());
            result = prime * result + ((_ethernetSource == null) ? 0 : _ethernetSource.hashCode());
            result = prime * result + ((_ethernetType == null) ? 0 : _ethernetType.hashCode());
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
            EthernetMatchImpl other = (EthernetMatchImpl) obj;
            if (_ethernetDestination == null) {
                if (other._ethernetDestination != null) {
                    return false;
                }
            } else if(!_ethernetDestination.equals(other._ethernetDestination)) {
                return false;
            }
            if (_ethernetSource == null) {
                if (other._ethernetSource != null) {
                    return false;
                }
            } else if(!_ethernetSource.equals(other._ethernetSource)) {
                return false;
            }
            if (_ethernetType == null) {
                if (other._ethernetType != null) {
                    return false;
                }
            } else if(!_ethernetType.equals(other._ethernetType)) {
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
            StringBuilder builder = new StringBuilder("EthernetMatch [");
            boolean first = true;
        
            if (_ethernetDestination != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetDestination=");
                builder.append(_ethernetDestination);
             }
            if (_ethernetSource != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ethernetSource=");
                builder.append(_ethernetSource);
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
