package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeRef;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.TransactionId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface FinishTransactionInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.transaction.rev131103.FinishTransactionInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:transaction","2013-11-03","input")
    ;

    /**
    **/
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeContext.class
    )
    NodeRef getNode();
    
    /**
    **/
    TransactionId getTransactionId();

}

