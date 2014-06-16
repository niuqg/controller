package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface InstructionList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","instruction-list")
    ;

    List<Instruction> getInstruction();

}

