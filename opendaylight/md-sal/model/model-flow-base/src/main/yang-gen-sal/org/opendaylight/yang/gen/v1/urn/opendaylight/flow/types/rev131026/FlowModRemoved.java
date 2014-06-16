package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import java.math.BigInteger;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.mod.removed.Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.RemovedReasonFlags;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes;
import org.opendaylight.yangtools.yang.common.QName;


public interface FlowModRemoved
    extends
    DataObject,
    GenericFlowAttributes
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","flow-mod-removed")
    ;

    /**
    **/
    BigInteger getByteCount();
    
    /**
    **/
    Long getDurationNsec();
    
    /**
    **/
    Long getDurationSec();
    
    Match getMatch();
    
    /**
    **/
    BigInteger getPacketCount();
    
    /**
    **/
    RemovedReasonFlags getRemovedReason();

}

