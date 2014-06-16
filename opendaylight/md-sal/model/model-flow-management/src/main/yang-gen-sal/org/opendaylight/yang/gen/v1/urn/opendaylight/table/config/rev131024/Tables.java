package org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableManagementData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Tables
    extends
    ChildOf<TableManagementData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:config","2013-10-24","tables")
    ;

    List<Table> getTable();

}

