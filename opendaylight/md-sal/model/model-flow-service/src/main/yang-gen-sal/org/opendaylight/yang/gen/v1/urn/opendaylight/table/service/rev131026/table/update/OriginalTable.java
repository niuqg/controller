package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.types.rev131026.TableFeatures;
import org.opendaylight.yangtools.yang.common.QName;


public interface OriginalTable
    extends
    ChildOf<TableUpdate>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.table.update.OriginalTable>,
    TableFeatures
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:service","2013-10-26","original-table")
    ;


}

