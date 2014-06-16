package org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModFlags;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Instructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes;
import org.opendaylight.yangtools.yang.common.QName;


public interface Flow
    extends
    DataObject,
    GenericFlowAttributes
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:flow:types","2013-10-26","flow")
    ;

    /**
    **/
    Boolean isBarrier();
    
    /**
    **/
    Long getBufferId();
    
    /**
    **/
    String getContainerName();
    
    /**
    **/
    FlowCookie getCookieMask();
    
    /**
    **/
    FlowModFlags getFlags();
    
    /**
    **/
    String getFlowName();
    
    /**
    **/
    Boolean isInstallHw();
    
    Instructions getInstructions();
    
    Match getMatch();
    
    /**
    **/
    Long getOutGroup();
    
    /**
    **/
    BigInteger getOutPort();
    
    /**
    **/
    Boolean isStrict();

}

