package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.InstructionKey;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Collections;



public class InstructionBuilder {

    private Integer _order;
    private InstructionKey _key;
    private org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction _instruction;

    private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> augmentation = new HashMap<>();

    public InstructionBuilder() {
    } 
    
    public InstructionBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction arg) {
        this._instruction = arg.getInstruction();
    }

    /**
     Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction) {
            this._instruction = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction)arg).getInstruction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction] \n" +
              "but was: " + arg
            );
        }
    }

    public Integer getOrder() {
        return _order;
    }
    
    public InstructionKey getKey() {
        return _key;
    }
    
    public org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction getInstruction() {
        return _instruction;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> E getAugmentation(Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public InstructionBuilder setOrder(Integer value) {
    
        this._order = value;
        return this;
    }
    
    public InstructionBuilder setKey(InstructionKey value) {
    
        this._key = value;
        return this;
    }
    
    public InstructionBuilder setInstruction(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction value) {
    
        this._instruction = value;
        return this;
    }
    
    public InstructionBuilder addAugmentation(Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public Instruction build() {
        return new InstructionImpl(this);
    }

    private static final class InstructionImpl implements Instruction {

        public Class<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction.class;
        }

        private final Integer _order;
        private final InstructionKey _key;
        private final org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction _instruction;

        private final Map<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> augmentation;

        private InstructionImpl(InstructionBuilder builder) {
            if (builder.getKey() == null) {
                this._key = new InstructionKey(
                    builder.getOrder()
                );
                this._order = builder.getOrder();
            } else {
                this._key = builder.getKey();
                this._order = _key.getOrder();
            }
            this._instruction = builder.getInstruction();
            switch (builder.augmentation.size()) {
             case 0:
                 this.augmentation = Collections.emptyMap();
                 break;
             case 1:
                 final Map.Entry<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> e = builder.augmentation.entrySet().iterator().next();
                 this.augmentation = Collections.<Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>>singletonMap(e.getKey(), e.getValue());
                 break;
             default :
                 this.augmentation = new HashMap<>(builder.augmentation);
             }
        }

        @Override
        public Integer getOrder() {
            return _order;
        }
        
        @Override
        public InstructionKey getKey() {
            return _key;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.Instruction getInstruction() {
            return _instruction;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>> E getAugmentation(Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_order == null) ? 0 : _order.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_instruction == null) ? 0 : _instruction.hashCode());
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
            InstructionImpl other = (InstructionImpl) obj;
            if (_order == null) {
                if (other._order != null) {
                    return false;
                }
            } else if(!_order.equals(other._order)) {
                return false;
            }
            if (_key == null) {
                if (other._key != null) {
                    return false;
                }
            } else if(!_key.equals(other._key)) {
                return false;
            }
            if (_instruction == null) {
                if (other._instruction != null) {
                    return false;
                }
            } else if(!_instruction.equals(other._instruction)) {
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
            StringBuilder builder = new StringBuilder("Instruction [");
            boolean first = true;
        
            if (_order != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_order=");
                builder.append(_order);
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
            if (_instruction != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_instruction=");
                builder.append(_instruction);
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
