package org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures;
import org.opendaylight.yangtools.yang.common.QName;


public interface TableEntry
    extends
    DataObject,
    TableFeatures
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:config","2013-10-24","table-entry")
    ;

    /**
    **/
    NodeRef getNode();

}

