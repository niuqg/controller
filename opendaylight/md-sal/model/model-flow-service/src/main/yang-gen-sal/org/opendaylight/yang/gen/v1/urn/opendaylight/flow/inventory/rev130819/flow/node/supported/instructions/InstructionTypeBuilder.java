package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionTypeKey;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.SupportType;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class InstructionTypeBuilder {

    private String _instruction;
    private InstructionTypeKey _key;
    private SupportType _supportState;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>> augmentation = new HashMap<>();

    public InstructionTypeBuilder() {
    } 
    
    public InstructionTypeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature arg) {
        this._supportState = arg.getSupportState();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature) {
            this._supportState = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature)arg).getSupportState();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature] \n" +
              "but was: " + arg
            );
        }
    }

    public String getInstruction() {
        return _instruction;
    }
    
    public InstructionTypeKey getKey() {
        return _key;
    }
    
    public SupportType getSupportState() {
        return _supportState;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InstructionTypeBuilder setInstruction(String value) {
    
        this._instruction = value;
        return this;
    }
    
    public InstructionTypeBuilder setKey(InstructionTypeKey value) {
    
        this._key = value;
        return this;
    }
    
    public InstructionTypeBuilder setSupportState(SupportType value) {
    
        this._supportState = value;
        return this;
    }
    
    public InstructionTypeBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public InstructionType build() {
        return new InstructionTypeImpl(this);
    }

    private static final class InstructionTypeImpl implements InstructionType {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType.class;
        }

        private final String _instruction;
        private final InstructionTypeKey _key;
        private final SupportType _supportState;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>> augmentation;

        private InstructionTypeImpl(InstructionTypeBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new InstructionTypeKey(
                    builder.getInstruction()
                );
                this._instruction = builder.getInstruction();
            } else {
                this._key = builder.getKey();
                this._instruction = _key.getInstruction();
            }
            this._supportState = builder.getSupportState();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public String getInstruction() {
            return _instruction;
        }
        
        @Override
        public InstructionTypeKey getKey() {
            return _key;
        }
        
        @Override
        public SupportType getSupportState() {
            return _supportState;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_instruction == null) ? 0 : _instruction.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_supportState == null) ? 0 : _supportState.hashCode());
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
            InstructionTypeImpl other = (InstructionTypeImpl) obj;
            if (_instruction == null) {
                if (other._instruction != null) {
                    return false;
                }
            } else if(!_instruction.equals(other._instruction)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_supportState == null) {
                if (other._supportState != null) {
                    return false;
                }
            } else if(!_supportState.equals(other._supportState)) {
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
            StringBuilder builder = new StringBuilder("InstructionType [");
            boolean first = true;
        
            if (_instruction != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_instruction=");
                builder.append(_instruction);
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
            if (_supportState != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_supportState=");
                builder.append(_supportState);
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
