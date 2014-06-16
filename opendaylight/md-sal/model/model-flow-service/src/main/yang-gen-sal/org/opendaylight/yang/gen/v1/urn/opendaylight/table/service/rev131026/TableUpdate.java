package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.UpdatedTable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContextRef;
import org.opendaylight.yangtools.yang.common.QName;


/**
  Helper grouping which contains a reference to node context.
**/
public interface TableUpdate
    extends
    DataObject,
    NodeContextRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:service","2013-10-26","table-update")
    ;

    OriginalTable getOriginalTable();
    
    UpdatedTable getUpdatedTable();

}

