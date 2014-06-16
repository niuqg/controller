package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.FlowKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Flow
    extends
    ChildOf<Table>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.Flow>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow,
    Identifiable<FlowKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","flow")
    ;

    /**
    **/
    FlowId getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    FlowKey getKey();

}

