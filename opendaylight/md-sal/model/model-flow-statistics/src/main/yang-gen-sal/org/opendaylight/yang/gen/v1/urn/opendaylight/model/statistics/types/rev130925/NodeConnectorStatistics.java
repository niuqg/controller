package org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Bytes;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.node.connector.statistics.Packets;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration;
import org.opendaylight.yangtools.yang.common.QName;


public interface NodeConnectorStatistics
    extends
    DataObject,
    Duration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:model:statistics:types","2013-09-25","node-connector-statistics")
    ;

    Bytes getBytes();
    
    /**
    **/
    BigInteger getCollisionCount();
    
    Packets getPackets();
    
    /**
    **/
    BigInteger getReceiveCrcError();
    
    /**
    **/
    BigInteger getReceiveDrops();
    
    /**
    **/
    BigInteger getReceiveErrors();
    
    /**
    **/
    BigInteger getReceiveFrameError();
    
    /**
    **/
    BigInteger getReceiveOverRunError();
    
    /**
    **/
    BigInteger getTransmitDrops();
    
    /**
    **/
    BigInteger getTransmitErrors();

}

