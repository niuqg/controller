package org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107;
import org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.PortUpdate;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionAware;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface UpdatePortInput
    extends
    PortUpdate,
    TransactionAware,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.port.service.rev131107.UpdatePortInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:port:service","2013-11-07","input")
    ;


}

