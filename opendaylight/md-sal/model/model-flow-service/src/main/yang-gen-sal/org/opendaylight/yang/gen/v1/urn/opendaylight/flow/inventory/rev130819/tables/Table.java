package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.table.Flow;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.TableKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.Tables;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Table
    extends
    ChildOf<Tables>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.tables.Table>,
    TableFeatures,
    Identifiable<TableKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:inventory","2013-08-19","table")
    ;

    List<Flow> getFlow();
    
    /**
    **/
    Short getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    TableKey getKey();

}

