package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction;


/**
**/
public class InstructionKey
 implements Identifier<Instruction> {
    private static final long serialVersionUID = 7973219301624051468L; 
    final private Integer _order;

    public InstructionKey(Integer _order) {
        this._order = _order;
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstructionKey(InstructionKey source) {
        this._order = source._order;
    }
    

    public Integer getOrder() {
        return _order;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_order == null) ? 0 : _order.hashCode());
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
        InstructionKey other = (InstructionKey) obj;
        if (_order == null) {
            if (other._order != null) {
                return false;
            }
        } else if(!_order.equals(other._order)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("InstructionKey [");
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
        return builder.append(']').toString();
    }



}
