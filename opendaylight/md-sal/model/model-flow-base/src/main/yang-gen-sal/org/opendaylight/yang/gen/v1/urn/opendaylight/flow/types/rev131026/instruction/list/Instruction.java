package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.InstructionKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.InstructionList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Instruction
    extends
    ChildOf<InstructionList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.instruction.list.Instruction>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Instruction,
    Identifiable<InstructionKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","instruction")
    ;

    /**
    **/
    Integer getOrder();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    InstructionKey getKey();

}

