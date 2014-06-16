package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType;


/**
**/
public class InstructionTypeKey
 implements Identifier<InstructionType> {
    private static final long serialVersionUID = -7543820428063976402L; 
    final private String _instruction;

    public InstructionTypeKey(String _instruction) {
        this._instruction = _instruction;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstructionTypeKey(InstructionTypeKey source) {
        this._instruction = source._instruction;
    }
    

    public String getInstruction() {
        return _instruction;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_instruction == null) ? 0 : _instruction.hashCode());
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
        InstructionTypeKey other = (InstructionTypeKey) obj;
        if (_instruction == null) {
            if (other._instruction != null) {
                return false;
            }
        } else if(!_instruction.equals(other._instruction)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("InstructionTypeKey [");
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
        return builder.append(']').toString();
    }



}
