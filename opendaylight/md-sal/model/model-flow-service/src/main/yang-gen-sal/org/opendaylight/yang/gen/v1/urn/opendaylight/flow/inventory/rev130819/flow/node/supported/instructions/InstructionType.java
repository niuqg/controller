package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionTypeKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.SupportedInstructions;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Feature;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface InstructionType
    extends
    ChildOf<SupportedInstructions>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.flow.node.supported.instructions.InstructionType>,
    Feature,
    Identifiable<InstructionTypeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","instruction-type")
    ;

    /**
    **/
    String getInstruction();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    InstructionTypeKey getKey();

}

