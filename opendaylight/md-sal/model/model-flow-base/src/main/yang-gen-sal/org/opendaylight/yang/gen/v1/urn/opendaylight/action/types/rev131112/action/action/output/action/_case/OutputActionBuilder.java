package org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import java.util.List;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;



public class OutputActionBuilder {

    private Integer _maxLength;
    private Uri _outputNodeConnector;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>> augmentation = new HashMap<>();

    public OutputActionBuilder() {
    } 


    public Integer getMaxLength() {
        return _maxLength;
    }
    
    public Uri getOutputNodeConnector() {
        return _outputNodeConnector;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public OutputActionBuilder setMaxLength(Integer value) {
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
    
        this._maxLength = value;
        return this;
    }
    
    public OutputActionBuilder setOutputNodeConnector(Uri value) {
    
        this._outputNodeConnector = value;
        return this;
    }
    
    public OutputActionBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public OutputAction build() {
        return new OutputActionImpl(this);
    }

    private static final class OutputActionImpl implements OutputAction {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction.class;
        }

        private final Integer _maxLength;
        private final Uri _outputNodeConnector;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>> augmentation;

        private OutputActionImpl(OutputActionBuilder builder) {
            this._maxLength = builder.getMaxLength();
            this._outputNodeConnector = builder.getOutputNodeConnector();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Integer getMaxLength() {
            return _maxLength;
        }
        
        @Override
        public Uri getOutputNodeConnector() {
            return _outputNodeConnector;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.output.action._case.OutputAction>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_maxLength == null) ? 0 : _maxLength.hashCode());
            result = prime * result + ((_outputNodeConnector == null) ? 0 : _outputNodeConnector.hashCode());
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
            OutputActionImpl other = (OutputActionImpl) obj;
            if (_maxLength == null) {
                if (other._maxLength != null) {
                    return false;
                }
            } else if(!_maxLength.equals(other._maxLength)) {
                return false;
            }
            if (_outputNodeConnector == null) {
                if (other._outputNodeConnector != null) {
                    return false;
                }
            } else if(!_outputNodeConnector.equals(other._outputNodeConnector)) {
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
            StringBuilder builder = new StringBuilder("OutputAction [");
            boolean first = true;
        
            if (_maxLength != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_maxLength=");
                builder.append(_maxLength);
             }
            if (_outputNodeConnector != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_outputNodeConnector=");
                builder.append(_outputNodeConnector);
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
