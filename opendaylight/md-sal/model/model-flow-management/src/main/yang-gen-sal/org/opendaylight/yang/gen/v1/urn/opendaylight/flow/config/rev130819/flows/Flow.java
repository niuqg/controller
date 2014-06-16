package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.flows;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.flows.FlowKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.Flows;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.FlowEntry;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Flow
    extends
    ChildOf<Flows>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.config.rev130819.flows.Flow>,
    FlowEntry,
    Identifiable<FlowKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:config","2013-08-19","flow")
    ;

    /**
    **/
    Long getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    FlowKey getKey();

}

