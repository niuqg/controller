package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


public interface TransactionAware
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:transaction","2013-11-03","transaction-aware")
    ;

    /**
    **/
    TransactionId getTransactionId();

}

