package org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.TableKey;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.Tables;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.TableEntry;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Table
    extends
    ChildOf<Tables>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.config.rev131024.tables.Table>,
    TableEntry,
    Identifiable<TableKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:config","2013-10-24","table")
    ;

    /**
    **/
    Long getId();
    
    /**
      Returns Primary Key of Yang List Type
    **/
    TableKey getKey();

}

