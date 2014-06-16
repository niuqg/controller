package org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.TableUpdate;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface UpdateTableInput
    extends
    TableUpdate,
    TransactionAware,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.table.service.rev131026.UpdateTableInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:table:service","2013-10-26","input")
    ;


}

