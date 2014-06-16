package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.NodeConnectorStatistics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.common.QName;


public interface Packets
    extends
    ChildOf<NodeConnectorStatistics>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Packets>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:statistics:types","2013-09-25","packets")
    ;

    /**
    **/
    BigInteger getReceived();
    
    /**
    **/
    BigInteger getTransmitted();

}

